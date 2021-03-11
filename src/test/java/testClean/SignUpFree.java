package testClean;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import pomPages.todoLy.*;
import singletonSession.Session;

public class SignUpFree extends  TestBaseTodoLy {
    MainPage mainPage= new MainPage();
    ExamenSection examenSection = new ExamenSection();

    @Test
    public void verify_create_project_todoly() throws InterruptedException {
        String fullName="Mauricio Ayllon";
        String mail="mauriExamen7@mauri.com";
        String pwd="123456";
        Session.getSession().getDriver().get("http://todo.ly/");
        mainPage.signUpImage.click();
        examenSection.fullNameTextBox.set(fullName);
        examenSection.mailTextBox.set(mail);
        examenSection.pwdTextBox.set(pwd);
        Thread.sleep(4000);
        examenSection.acceptTerms.click();
        examenSection.signUp.click();
        Thread.sleep(4000);
        Assert.assertEquals("ERROR No se creo la cuenta",true, examenSection.signUpVerification.controlIsDisplayed());
    }
    @After
    public void close(){
        Session.getSession().closeSession();
    }
}