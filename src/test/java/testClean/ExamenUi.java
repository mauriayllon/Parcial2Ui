package testClean;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import pomPages.todoLy.*;
import singletonSession.Session;

public class ExamenUi {
    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    ExamenSection examenSection = new ExamenSection();
    String user="mauri@mauri.com";
    String pwd="123456";

    @Test
    public void examen() throws InterruptedException {
        String name="Mauricio Full Name Cambio";
        Session.getSession().getDriver().get("http://todo.ly/");
        mainPage.loginImage.click();
        loginModal.loginAction(user,pwd);

        examenSection.settingsButton.click();
        examenSection.fullNameButton.click();
        examenSection.fullNameButton.set(name);

        examenSection.okButton.click();
        Thread.sleep(5000);

        Assert.assertEquals("ERROR El nombre no se actualizo",name, examenSection.fullNameTextBox2.getAttributeValue("value"));
        Thread.sleep(4000);
        examenSection.logout.click();
        Assert.assertEquals("ERROR Nose Hizo el Logout",true,mainPage.loginImage.controlIsDisplayed());
    }

    @After
    public void close(){
       Session.getSession().closeSession();
    }


}