import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_back {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();    //Chrome浏览器
        driver.get("http://www.baidu.com");
        System.out.println("now access s% \n"+driver.getCurrentUrl());
        sleep();
        driver.findElement(By.linkText("新闻")).click();
        System.out.println("now access s% \n"+driver.getCurrentUrl());
        sleep();
        driver.navigate().back();//后退
        System.out.println("back to s% \n"+driver.getCurrentUrl());
        sleep();
        driver.navigate().forward();//前进
        System.out.println("forward to s% \n"+driver.getCurrentUrl());
        sleep();
        driver.navigate().refresh();//刷新
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
