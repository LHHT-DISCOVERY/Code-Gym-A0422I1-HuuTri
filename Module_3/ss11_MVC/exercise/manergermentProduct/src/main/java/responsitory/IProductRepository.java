package responsitory;

import model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void update();

    void remove(int id);
}
