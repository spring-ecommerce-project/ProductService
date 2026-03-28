package com.arjunnigam.productservice;

import com.arjunnigam.productservice.controllers.ProductController;
import com.arjunnigam.productservice.exceptions.ProductNotFoundException;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class RandomTests {


    // Test Case - method which gets executed automatically at the time of building or deployment

    @Test
    public void sampleTest() {
        // Arrange
        int a = 10;
        int b = 7;

        // ACT
        int result = a + b;

        // ASSERT
        //assert result == 10;   // For better outcomes we don't use assert

        assertEquals(17, result);

//        assertNotEquals(x,y);
//        assertNull(object);
//        assertNotNull(object);
//        assertThrows(
//                ProductNotFoundException.class,
//                () -> productController.getSingleProduct(-1)
//        );
//
//
//        assertTimeout(
//                Duration.ofMillis(1000),
//                () -> productController.getSingleProduct(10L)
//
//        );

//        assertInstanceOf(
//                Eagle.class,
//                BirdFactory.getBirdForType(BirdType.EAGLE)
//        );
    }
}

/*
 AAA framework

 A : Arrange (input params)
 A : Act (Call the function that we want to test)
 A : Assert (Validate the actual output against teh expected one)
 */
