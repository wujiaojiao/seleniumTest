import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class test_upfile {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();    //Chrome浏览器
        File file  = new File("./HTMLFile/upfile.html");
        String filePath = file.getAbsolutePath();
        driver.get(filePath);
        sleep();
        driver.findElement(By.name("file")).sendKeys("D:\\upLoad_file.txt");
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
