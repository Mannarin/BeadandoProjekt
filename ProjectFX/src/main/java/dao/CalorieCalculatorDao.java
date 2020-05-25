package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import lombok.extern.log4j.Log4j2;
import model.Product;



import java.util.List;
import java.util.Optional;


@Log4j2
public class CalorieCalculatorDao extends Product {

    private Product product;
    private EntityManager em;

    public CalorieCalculatorDao(EntityManager em) {
        this.em=em;

    }

    public List<Product> findAll(){
        return em.createQuery("SELECT p FROM Product p ORDER BY p.id",Product.class).getResultList();
    }


    public Optional<Product> findName(String name){
        return Optional.ofNullable(em.find(Product.class,name));
    }

    public static void load() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
        EntityManager em=emf.createEntityManager();

        CalorieCalculatorDao calorieCalculatorDao=new CalorieCalculatorDao(em);

        em.getTransaction().begin();
        calorieCalculatorDao.createDatabase("1","milk",1.0,1.0,1.0,1.0);
        calorieCalculatorDao.createDatabase("2","bread",2.0,2.0,2.0,2.0);
        calorieCalculatorDao.createDatabase("3","cheese",3.0,3.0,3.0,3.0);
        calorieCalculatorDao.createDatabase("4","egg",4.0,4.0,4.0,4.0);
        calorieCalculatorDao.createDatabase("5","chicken",5.0,5.0,5.0,5.0);
        em.getTransaction().commit();

        log.info("Database created.");
        log.info("All products:",calorieCalculatorDao.findAll());
        log.info("The product: {}",calorieCalculatorDao.findName("milk"));
        em.close();
        emf.close();
    }
    public Product createDatabase(String id, String name, double fat,double calorie, double carbohydrate, double protein){
        Product product=new Product(id,name,fat,calorie,carbohydrate,protein);
        em.persist(product);
        load();
        return product;
    }

}
