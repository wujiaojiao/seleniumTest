import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class test_locate_elements {

    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();    //Chrome浏览器
        driver.get("http://www.baidu.com");
        WebElement keyEt = driver.findElement(By.id("kw"));
        keyEt.sendKeys("selenuim");
        keyEt.submit();
        sleep();
        List<WebElement> results = driver.findElements(By.xpath("//div/div/h3"));
        for (WebElement element:results) {
            System.out.println(element.getText());
        }

        WebElement element = results.get(results.size()-10);
        System.out.println("倒数第10条Title========"+element.getText());

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
