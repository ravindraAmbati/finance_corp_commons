package corp.finance.commons.products.service;

import corp.finance.commons.products.model.Product;

import java.util.List;

public interface ProductManagement {

    List<Product> getAllProducts();

    List<Product> getProducts(List<String> productIds);

    Product getProduct(String productId);
}
