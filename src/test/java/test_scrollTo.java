import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class test_scrollTo {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();//Chrome浏览器
        driver.manage().window().setSize(new Dimension(700,500));
        driver.get("https://www.baidu.com");

        driver.findElement(By.id("kw")).sendKeys("WebDriver Api");
        driver.findElement(By.id("su")).click();
        sleep();
        ((JavascriptExecutor)driver).executeScript("window.scrollTo(100,450);");
        sleep();
        driver.close();
    }

    public static void sleep(){
        try{
            Thread.sleep(5000);
        }catch(Exception e){
            System.out.printf(e.toString());
        }
    }
}
