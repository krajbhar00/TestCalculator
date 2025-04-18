package com.calculator.tests.Tests;

import com.calculator.tests.BaseTest;
import com.calculator.tests.Pages.CalculatorPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorOperationsTest extends BaseTest {
    private CalculatorPage calculatorPage;

    @BeforeClass
    public void setUp(@Optional("https://nuix.github.io/SDET/senior-sdet/productionCalc/index.html") String url){
        super.setUp(url);
        calculatorPage= new CalculatorPage();
    }

    @Test(description = "Test addition operation")
    public void testAddition() {
        calculatorPage.enterInput("4");
        calculatorPage.enterInput("0");
        calculatorPage.enterInput("+");
        calculatorPage.enterInput("4");
        calculatorPage.enterInput("9");
        calculatorPage.enterInput("=");

        String result = calculatorPage.getResult();
        System.out.print("Result after addition:- "+result+"\n");
        Assert.assertEquals(result, "89", "Addition result is incorrect.");
    }


    @Test(description = "Test subtraction operation")
    public void testSubtraction() {
        calculatorPage.enterInput("4");
        calculatorPage.enterInput("0");
        calculatorPage.enterInput("-");
        calculatorPage.enterInput("3");
        calculatorPage.enterInput("2");
        calculatorPage.enterInput("=");

        String result = calculatorPage.getResult();
        System.out.print("Result after subtraction:- "+result+"\n");
        Assert.assertEquals(result, "8", "Subtraction result is incorrect.");
    }

    @Test(description = "Test multiplication operation")
    public void testMultiplication() {
        calculatorPage.enterInput("4");
        calculatorPage.enterInput("*");
        calculatorPage.enterInput("3");
        calculatorPage.enterInput("=");

        String result = calculatorPage.getResult();
        System.out.print("Result after multiplication:- "+result+"\n");
        Assert.assertEquals(result, "12", "Multiplication result is incorrect.");
    }

    @Test(description = "Test division operation")
    public void testDivision() {
        calculatorPage.enterInput("4");
        calculatorPage.enterInput("0");
        calculatorPage.enterInput("/");
        calculatorPage.enterInput("8");
        calculatorPage.enterInput("=");

        String result = calculatorPage.getResult();
        System.out.print("Result after division:- "+result+"\n");
        Assert.assertEquals(result, "5", "Division result is incorrect.");
    }
}
