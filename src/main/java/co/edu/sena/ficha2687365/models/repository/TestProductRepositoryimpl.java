package co.edu.sena.ficha2687365.models.repository;

import co.edu.sena.ficha2687365.models.beans.Category;
import co.edu.sena.ficha2687365.models.beans.Product;

import java.sql.SQLException;

public class TestProductRepositoryimpl {
    public static void main(String[] args) throws SQLException {
        Repository<Product> repository=new ProductRepositoryImpl();




        System.out.println("----- listAllObj -----");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();


        System.out.println("----- byIdOBJ -----");
        System.out.println(repository.byIdObj(4));
        System.out.println();


        System.out.println("----- deleteOBJ -----");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);


        System.out.println("----- saveOBJ -----");
        Category categoryUpdate = new Category();
        categoryUpdate.setCategory_id(3);
        categoryUpdate.setCategory_name("perfume");
        repository.saveObj(categoryUpdate);
        repository.listAllObj().forEach(System.out::println);
        System.out.println();
    }
}
