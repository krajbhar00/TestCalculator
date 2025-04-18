package com.calculator.tests.Pages;

import com.calculator.tests.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {
    @FindBy(xpath = "//input[@value='0']")
    private WebElement inputValue0;

    @FindBy(xpath = "//input[@value='1']")
    private WebElement inputValue1;

    @FindBy(xpath = "//input[@value='2']")
    private WebElement inputValue2;

    @FindBy(xpath = "//input[@value='3']")
    private WebElement inputValue3;

    @FindBy(xpath = "//input[@value='4']")
    private WebElement inputValue4;

    @FindBy(xpath = "//input[@value='5']")
    private WebElement inputValue5;

    @FindBy(xpath = "//input[@value='6']")
    private WebElement inputValue6;

    @FindBy(xpath = "//input[@value='7']")
    private WebElement inputValue7;

    @FindBy(xpath = "//input[@value='8']")
    private WebElement inputValue8;

    @FindBy(xpath = "//input[@value='9']")
    private WebElement inputValue9;

    @FindBy(xpath = "//input[@value='.']")
    private WebElement inputValueDecimal;

    @FindBy(xpath = "//input[@value='=']")
    private WebElement inputValueCheckEqual;

    @FindBy(xpath = "//input[@id='subtract']")
    private WebElement inputValueSubtract;

    @FindBy(xpath = "//input[@id='add']")
    private WebElement inputValueAdd;

    @FindBy(xpath = "//input[@value='C']")
    private WebElement inputValueClearAll;

    @FindBy(xpath = "//input[@id='divide']")
    private WebElement inputValueDivide;

    @FindBy(xpath = "//input[@id='multiply']")
    private WebElement inputValueMultiply;

    @FindBy(xpath = "//div[@id='display']/div")
    private WebElement displayResult;

    public CalculatorPage(){
        PageFactory.initElements(DriverManager.getInstance().getDriver(), this);
    }

    public void performClearAllOperation(){
        if(!displayResult.getText().equals("0")){
            inputValueClearAll.click();
        }
    }
    public void enterInput(String input){
        switch (input) {
            case "0": inputValue0.click(); break;
            case "1": inputValue1.click(); break;
            case "2": inputValue2.click(); break;
            case "3": inputValue3.click(); break;
            case "4": inputValue4.click(); break;
            case "5": inputValue5.click(); break;
            case "6": inputValue6.click(); break;
            case "7": inputValue7.click(); break;
            case "8": inputValue8.click(); break;
            case "9": inputValue9.click(); break;
            case ".": inputValueDecimal.click(); break;
            case "+": inputValueAdd.click(); break;
            case "-": inputValueSubtract.click(); break;
            case "*": inputValueMultiply.click(); break;
            case "/": inputValueDivide.click(); break;
            case "=": inputValueCheckEqual.click(); break;
        }
    }

    public String getResult(){
        return displayResult.getText();
    }

}
