import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class test_select {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();    //Chrome浏览器
        driver.get("http://www.baidu.com");
        driver.findElement(By.linkText("设置")).click();
        driver.findElement(By.linkText("搜索设置")).click();
        sleep();
        WebElement wel = driver.findElement(By.xpath("//select"));
        Select select = new Select(wel);
        select.selectByValue("20");
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
