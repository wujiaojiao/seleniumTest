import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_search {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();    //Chrome浏览器
        driver.get("http://www.baidu.com");
        WebElement keyword = driver.findElement(By.id("kw"));
        WebElement searchBtn = driver.findElement(By.id("su"));
        keyword.sendKeys("java");
        sleep();
        keyword.clear();
        sleep();
        keyword.sendKeys("selenuim");
        sleep();
        //searchBtn.click();
        keyword.submit();
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
