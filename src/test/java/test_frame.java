import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_frame {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();    //Chrome浏览器
        driver.get("http://www.126.com");
        WebElement xf = driver.findElement(By.xpath("//*[@id='loginDiv']/iframe"));
        driver.switchTo().frame(xf);
        WebElement name = driver.findElement(By.name("username"));
        name.clear();
        name.sendKeys("username");
        WebElement pwd = driver.findElement(By.name("password"));
        pwd.clear();
        pwd.sendKeys("password");
        driver.findElement(By.id("doLogin")).clear();
        sleep();
        driver.switchTo().defaultContent();

        driver.close();
    }

    public static void sleep(){
        try{
            Thread.sleep(2000);
        }catch(Exception e){
            System.out.printf(e.toString());
        }
    }
}
