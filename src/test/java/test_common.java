import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_common {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();    //Chrome浏览器
        driver.get("http://www.baidu.com");
        WebElement keywordEt = driver.findElement(By.id("kw"));
        System.out.println("keywordEt.getSize()==="+keywordEt.getSize());
        WebElement text = driver.findElement(By.id("cp"));
        System.out.println("text==="+text.getText());
        WebElement keywordEtTp = driver.findElement(By.id("kw"));
        System.out.println("type==="+keywordEtTp.getAttribute("type"));
        //System.out.println("Xpath==="+keywordEtTp.getAttribute("Xpath"));
        WebElement keywordEtDp = driver.findElement(By.id("kw"));
        System.out.println("isDisply==="+keywordEtDp.isDisplayed());
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
