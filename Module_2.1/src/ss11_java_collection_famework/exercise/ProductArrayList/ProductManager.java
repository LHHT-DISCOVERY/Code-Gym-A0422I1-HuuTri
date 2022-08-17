package ss11_java_collection_famework.exercise.ProductArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductManager {
    ArrayList<Product> listProduct;

    public ProductManager() {
        this.listProduct = new ArrayList<>();
    }

    public ProductManager(ArrayList<Product> listProduct) {
        this.listProduct = listProduct;
    }

    public void addProduct(Product product) {
        listProduct.add(product);
    }

    public boolean remove(Product product) {
        return this.listProduct.remove(product);
    }

    public void search(int id) {
        boolean isFlag = false;
        for (Product product : listProduct
        ) {
            if (product.getIdProduct() == id) {
                System.out.println(product);
                isFlag = true;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy");
        }
    }

    public boolean checkNameProduct(String nameProduct) {
        for (Product product : listProduct
        ) {
            if (product.getNameProduct().toLowerCase().equals(nameProduct.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public void editProduct(String nameProduct, String newNameProduct) {
        boolean isFlag = false;
        for (Product product : listProduct
        ) {
            if (product.getNameProduct().toLowerCase().equals(nameProduct.toLowerCase())) {
                product.setNameProduct(newNameProduct);
                isFlag = true;
            }
        }
        if (!isFlag) {
            System.out.println("Ko có sản phẩm này");
        }
    }

    public void sortPrice() {
        Collections.sort(this.listProduct, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPriceProduct() > o2.getPriceProduct()) {
                    return -1;

                } else if (o1.getPriceProduct() < o2.getPriceProduct()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        show();
    }

    public void show() {
        for (Product product : listProduct
        ) {
            System.out.println(product);
        }
    }
}
