package com.example.productservice;

import au.com.dius.pact.provider.junit5.HttpTestTarget;
import au.com.dius.pact.provider.junit5.PactVerificationContext;
import au.com.dius.pact.provider.junit5.PactVerificationInvocationContextProvider;
import au.com.dius.pact.provider.junitsupport.Provider;
import au.com.dius.pact.provider.junitsupport.State;
import au.com.dius.pact.provider.junitsupport.StateChangeAction;
import au.com.dius.pact.provider.junitsupport.loader.PactFolder;
import au.com.dius.pact.provider.spring.junit5.MockMvcTestTarget;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.web.servlet.MockMvc;

//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@Provider("ProductProvider")
//@PactFolder("src/test/resources/pacts")
//@AutoConfigureMockMvc(addFilters = false)
@SpringBootTest
class ProductserviceApplicationTests {


    @Test
    void contextLoads() {
    }
//    @Autowired
//    private MockMvc mockMvc;
//
//    @LocalServerPort
//    public int port;
//
//    @State(value = "Products exist", action = StateChangeAction.SETUP)
//    public void productsExist() {
//        // Set up the state where products exist in your system
//        // This might involve setting up test data or mocking certain services
//    }
//
//    @State(value = "Product with ID 1 exists", action = StateChangeAction.SETUP)
//    public void productWithIdExists() {
//        // Set up the state where a specific product with ID 1 exists
//        // This might involve setting up a specific test product
//    }
//
//    @State(value = "Products exist", action = StateChangeAction.TEARDOWN)
//    public void productExistTearDown() {
//        // Clean up any setup done in the 'productsExist' state
//    }
//
//    @State(value = "Product with ID 1 exists", action = StateChangeAction.TEARDOWN)
//    public void productWithIdTearDown() {
//        // Clean up any setup done in the 'productWithIdExists' state
//    }
//
//    @BeforeEach
//    void setUp(PactVerificationContext context) {
//        System.getProperties().setProperty("pact.verifier.publishResults", "true");
//        if (context != null) {
//            context.setTarget(new HttpTestTarget("localhost", port));
//        }
//    }
//
//    @TestTemplate
//    @ExtendWith(PactVerificationInvocationContextProvider.class)
//    void pactVerificationTestTemplate(PactVerificationContext context) {
//        context.verifyInteraction();
//    }
}