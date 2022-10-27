package controller;

import model.Product;
import service.IProductService;
import service.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = {"/Product", "/ProductServlet"})
public class ProductServlet extends HttpServlet {
    private IProductService productService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showFormCreateProduct(request, response);
                break;
            case "update":
                showFormUpdateProduct(request, response);
                break;
            case "delete":
                showFormDelete(request, response);
                break;
            case "view":
                showFormView(request, response);
                break;
            case "find":
                break;
            default:
                showListProduct(request, response);
                break;
        }
    }

    private void showFormView(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        int idNext = id + 1;
        Product product = productService.findById(id);
        Product productNext = productService.findById(idNext);
        request.setAttribute("product", product);
        RequestDispatcher dispatcher;
        if (product == null) {
            dispatcher = request.getRequestDispatcher("view/product/Error.jsp");
        } else {
            request.setAttribute("productNext" , productNext);
            dispatcher = request.getRequestDispatcher("view/product/viewProduct.jsp");
        }

        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormDelete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productService.findById(id);
        RequestDispatcher dispatcher;

        if (product == null) {
            dispatcher = request.getRequestDispatcher("view/product/Error.jsp");
        } else {
            request.setAttribute("product", product);
            dispatcher = request.getRequestDispatcher("view/product/deleteProduct.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormUpdateProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productService.findById(id);

        RequestDispatcher dispatcher;
        if (product == null) {
            dispatcher = request.getRequestDispatcher("view/product/Error.jsp");
        } else {
            request.setAttribute("product", product);
            dispatcher = request.getRequestDispatcher("view/product/updateProduct.jsp");
        }

        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormCreateProduct(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("view/product/createNewProduct.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showListProduct(HttpServletRequest request, HttpServletResponse response) {
        List<Product> productList = productService.findAll();
        request.setAttribute("productList", productList);
        try {
            request.getRequestDispatcher("view/product/displayListProduct.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                CreateProduct(request, response);
                break;
            case "update":
                UpdateProduct(request, response);
                break;
            case "delete":
                DeleteProduct(request, response);
                break;
            case "view":
                break;
            case "find":
                findProduct(request, response);
                break;
            default:
                showListProduct(request, response);
                break;
        }
    }

    private void findProduct(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        request.setAttribute("name", name);
        List<Product> products = new ArrayList<>();
        RequestDispatcher dispatcher;

        for (Product product : productService.findAll()
        ) {
            if (product.getName().equals(name)) {
                products.add(product);
            }
        }
        if (products.isEmpty()) {
            String productsNull = "NOT FIND PRODUCT !! Exit =>  <a href=\"/Product\"> Click here </a>";
            request.setAttribute("productsNull", productsNull);
            dispatcher = request.getRequestDispatcher("view/product/displayListProduct.jsp");
        } else {
            request.setAttribute("products", products);
            dispatcher = request.getRequestDispatcher("view/product/searchProduct.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void DeleteProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productService.findById(id);
        RequestDispatcher dispatcher;
        if (product == null) {
            dispatcher = request.getRequestDispatcher("view/product/Error.jsp");
        } else {
            productService.remove(id);
            request.setAttribute("messageDelete", " Delete Successful");
            dispatcher = request.getRequestDispatcher("view/product/deleteProduct.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void UpdateProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String description = request.getParameter("description");
        Product product1 = productService.findById(id);
        RequestDispatcher dispatcher;

        if (product1 == null) {
            dispatcher = request.getRequestDispatcher("view/product/Error.jsp");
        } else {
            product1.setDescription(description);
            product1.setPrice(price);
            product1.setName(name);
            request.setAttribute("product", product1);
            request.setAttribute("messageUpdate", "Update to successful");
            dispatcher = request.getRequestDispatcher("view/product/updateProduct.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void CreateProduct(HttpServletRequest request, HttpServletResponse response) {
        boolean isFlag = true;
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String description = request.getParameter("description");
        RequestDispatcher dispatcher;
        request.setAttribute("name", name);
        request.setAttribute("id", id);
        request.setAttribute("price", price);
        request.setAttribute("description", description);
        List<Product> productCheck = productService.findAll();
        for (Product product : productCheck) {
            if (product.getId() == id) {
                isFlag = false;
                break;
            }
        }
        if (!isFlag) {
            dispatcher = request.getRequestDispatcher("view/product/Error.jsp");
        } else {
            Product product = new Product(id, name, price, description);
            productService.save(product);
            request.setAttribute("message", "Add successful");
            dispatcher = request.getRequestDispatcher("view/product/createNewProduct.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
