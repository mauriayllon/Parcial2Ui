package pomPages.todoLy;

import controls.*;
import org.openqa.selenium.By;

public class ExamenSection {
    public Button settingsButton = new Button(By.xpath("//td//a[contains(.,'Settings')]"));
    public Button fullNameButton = new Button(By.xpath("//input[@id='FullNameInput']"));
    public Button okButton = new Button(By.xpath("//div//button//span[contains(.,'Ok')]"));
    public Button logout = new Button(By.xpath("//td//a[contains(.,'Logout')]"));

    public TextBox fullNameTextBox2  = new TextBox(By.xpath("//td/input[@id='FullNameInput']"));
    public TextBox fullNameTextBox  = new TextBox(By.xpath("//input[@name='ctl00$MainContent$SignupControl1$TextBoxFullName']"));
    public TextBox mailTextBox =  new TextBox(By.xpath("//input[@name='ctl00$MainContent$SignupControl1$TextBoxEmail']"));
    public TextBox pwdTextBox = new TextBox(By.xpath("//input[@name='ctl00$MainContent$SignupControl1$TextBoxPassword']"));
    public CheckBox acceptTerms = new CheckBox(By.xpath("//input[@id='ctl00_MainContent_SignupControl1_CheckBoxTerms']"));
    public Button signUp = new Button(By.xpath("//input[@name='ctl00$MainContent$SignupControl1$ButtonSignup']"));
    public Image signUpVerification = new Image(By.xpath("//img[@src='/Images/logo2.png']"));

    public ExamenSection(){}
}
