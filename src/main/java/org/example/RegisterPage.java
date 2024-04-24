package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils {
    public void enterRegistrationDetails(){
        //clicking on register button
        clickOnElement(By.className("ico-register"));
        //passing first name
        typeIn(By.id("FirstName"), "abcde");
        //passing last name
        typeIn(By.id("LastName"), "zef");
        // selecting day of DOB
        selectByVisibleText(By.name("DateOfBirthDay"), "29");
        //selecting month of DOB
        selectByVisibleText(By.name("DateOfBirthMonth"), "May");
        //selecting year of DOB
        selectByVisibleText(By.name("DateOfBirthYear"),"1989");
        // passing email address
        typeIn(By.id("Email"),email);
        //passing password and reconfirm password
        typeIn(By.id("Password"), password );
        typeIn(By.id("ConfirmPassword"), "Test123");
    }
}
