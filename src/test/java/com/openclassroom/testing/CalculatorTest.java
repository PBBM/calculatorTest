package com.openclassroom.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void initCalculator(){
        calculator = new Calculator();
    }

    @AfterEach
    public void destroyCalculator(){
        calculator = null;
    }

    @Test
    @DisplayName("Add one number to another and verify result")
    void testAddTwoPositiveNumbers(){

        // Arrange
        int a = 1;
        int b = 2;

        // Act
        int somme = calculator.add(a, b);

        // Assert
        assertEquals(3, somme);
    }

    @Test
    @DisplayName("Multiply one number by another and confirm result")
    void testMultiplyTwoPositiveNumbers(){
        int a = 4;
        int b = 5;

        int multiplyResult = calculator.multiply(a, b);

        assertEquals(20, multiplyResult);
    }
}
