package pomPages.todoLy;

import controls.Image;
import org.openqa.selenium.By;

public class MainPage {

    public Image loginImage= new Image(By.xpath("//img[@src='/Images/design/pagelogin.png']"));
    public Image signUpImage=new Image(By.xpath("//img[@src='/Images/design/pagesignup.png']"));

    public MainPage(){}
}
