package util;

import model.Product;

import javax.persistence.Persistence;

public class ProductDao extends BasicDao<Product> {

    private static ProductDao instance;

    public ProductDao() {
        super(Product.class);
    }

    public static ProductDao getInstance() {
        if (instance == null) {
            instance = new ProductDao();
            instance.setEntityManager(Persistence.createEntityManagerFactory("te").createEntityManager());
        }
        return instance;
    }
}
