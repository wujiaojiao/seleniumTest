import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class test_window {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();    //Chrome浏览器
        driver.get("http://www.baidu.com");
        String curWin = driver.getWindowHandle();
        driver.findElement(By.linkText("登录")).click();
        sleep();
        driver.findElement(By.linkText("立即注册")).click();
        Set<String> wins = driver.getWindowHandles();
        for (String win:wins) {
         if(!curWin.equals(win)){
             driver.switchTo().window(win);
             System.out.println("now register window");
             sleep();
             WebElement name = driver.findElement(By.name("userName"));
             name.clear();
             name.sendKeys("userName");
             WebElement pwd = driver.findElement(By.name("phone"));
             pwd.clear();
             pwd.sendKeys("15910618467");
             sleep();
         }
        }
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
