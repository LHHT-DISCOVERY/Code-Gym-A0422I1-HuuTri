package service;

import model.Product;
import repository.IProductRepository;
import repository.ProductRepository;

import java.sql.SQLException;
import java.util.List;

public class ProductService implements IProductService {
    IProductRepository productRepository = new ProductRepository();

    @Override
    public void insert(Product product) throws SQLException {
        productRepository.insert(product);
    }

    @Override
    public Product select(int idRoom) {
        return productRepository.select(idRoom);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public boolean delete(int idRoom) throws SQLException {
        return productRepository.delete(idRoom);
    }

    @Override
    public boolean update(Product product) throws SQLException {
        return productRepository.update(product);
    }

    @Override
    public List<Product> search(String searchName, String searchNumberPhone, String idPayment_room) {
        return productRepository.search(searchName, searchNumberPhone, idPayment_room);
    }
}
