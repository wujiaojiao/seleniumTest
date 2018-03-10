import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.annotation.Nullable;
import java.util.concurrent.TimeUnit;

public class test_wait {

    public static void main(String[] args){
        //wait1();
        wait2();
    }
    /*
    * 显式等待
    * */
    public static void wait1(){
        final WebDriver driver = new ChromeDriver();    //Chrome浏览器
        driver.get("http://www.baidu.com");
        WebDriverWait wait = new WebDriverWait(driver,10,1);
        wait.until(new ExpectedCondition<WebElement>() {
            @Nullable
            @Override
            public WebElement apply(@Nullable WebDriver webDriver) {
                return driver.findElement(By.id("kw"));
            }
        }).sendKeys("selenuim");
        driver.findElement(By.id("su")).click();
        driver.quit();
    }

    public static void wait2(){
        WebDriver driver = new ChromeDriver();
        //页面加载超时时间10s
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.get("https://www.baidu.com");
        //元素定位等待时间2s，2s内定位不到则抛出异常
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        driver.findElement(By.id("kw")).sendKeys("selenium");
        //异步脚本的超时时间2s
        driver.manage().timeouts().setScriptTimeout(2,TimeUnit.SECONDS);
        driver.quit();
    }

    public static void sleep(){
        try{
            Thread.sleep(2000);
        }catch(Exception e){
            System.out.printf(e.toString());
        }
    }
}
