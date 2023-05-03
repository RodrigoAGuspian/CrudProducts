/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package co.edu.unicauca.openmarket.domain.service;

import co.edu.unicauca.openmarket.access.Factory;
import co.edu.unicauca.openmarket.access.IProductRepository;
import co.edu.unicauca.openmarket.domain.Product;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RodAlejo
 */
public class ProductServiceTest {
    
    public ProductServiceTest() {
    }

    @Test
    public void testSaveProduct() {
        System.out.println("saveProduct");
        String name = "algo";
        String description = "algo";
        Long categoryId = 1L;
        IProductRepository repository = Factory.getInstance().getRepository("default");
        ProductService productService = new ProductService(repository);
        boolean expResult = true;
        boolean result = productService.saveProduct(name, description, categoryId);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindAllProducts() {
        System.out.println("findAllProducts");
        IProductRepository repository = Factory.getInstance().getRepository("default");
        ProductService productService = new ProductService(repository);
        List<Product> expResult = new ArrayList<>();
        List<Product> result = productService.findAllProducts();
        assertEquals(expResult, result);
    }

    @Test
    public void testFindProductById() {
        System.out.println("findProductById");
        Long id = -1L;
        IProductRepository repository = Factory.getInstance().getRepository("default");
        ProductService productService = new ProductService(repository);
        Product expResult = null;
        Product result = productService.findProductById(id);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindProductByName() {
        System.out.println("findProductByName");
        String name = "algo";
        IProductRepository repository = Factory.getInstance().getRepository("default");
        ProductService productService = new ProductService(repository);
        List<Product> expResult = new ArrayList<>();
        List<Product> result = productService.findProductByName(name);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindProductByCategory() {
        System.out.println("findProductByCategory");
        Long categoryId = 1L;
        IProductRepository repository = Factory.getInstance().getRepository("default");
        ProductService productService = new ProductService(repository);
        List<Product> expResult = new ArrayList<>();
        List<Product> result = productService.findProductByCategory(categoryId);
        assertEquals(expResult, result);
    }

    @Test
    public void testDeleteProduct() {
        System.out.println("deleteProduct");
        Long id = -1L;
        IProductRepository repository = Factory.getInstance().getRepository("default");
        ProductService productService = new ProductService(repository);
        boolean expResult = false;
        boolean result = productService.deleteProduct(id);
        assertEquals(expResult, result);
    }

    @Test
    public void testEditProduct() {
        System.out.println("editProduct");
        Long productId = null;
        Product prod = null;
        IProductRepository repository = Factory.getInstance().getRepository("default");
        ProductService productService = new ProductService(repository);
        boolean expResult = false;
        boolean result = productService.editProduct(productId, prod);
        assertEquals(expResult, result);
    }
    
}
