import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keys_back {

    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();    //Chrome浏览器
        driver.get("http://www.baidu.com");
        WebElement keywordEt  = driver.findElement(By.id("kw"));
        keywordEt.sendKeys("seleniumm");
        sleep();
        keywordEt.sendKeys(Keys.BACK_SPACE);
        sleep();
        keywordEt.sendKeys(Keys.SPACE);
        sleep();
        keywordEt.sendKeys("教程");
        sleep();
        keywordEt.sendKeys(Keys.CONTROL,"a");
        sleep();
        keywordEt.sendKeys(Keys.CONTROL,"x");
        sleep();
        keywordEt.sendKeys(Keys.CONTROL,"v");
        sleep();
        keywordEt.sendKeys(Keys.ENTER);
        sleep();
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
