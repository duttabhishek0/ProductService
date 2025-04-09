package com.example.productservice;


import com.example.productservice.controller.ProductController;
import com.example.productservice.model.Product;
import com.example.productservice.service.ProductService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;


@SpringBootTest(classes = ProductserviceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public abstract class ProductServiceBaseClass {

    @Autowired
    ProductController productController;


    @MockitoBean
    ProductService productService;

    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(productController);

        Mockito.when(productService.getProductById(1))
                .thenReturn(
                        Optional.of(new Product(
                                1,
                                "The Great Gatsby",
                                "A classic novel written by F. Scott Fitzgerald.",
                                10.99,
                                true
                        ))
                );
    }
}
