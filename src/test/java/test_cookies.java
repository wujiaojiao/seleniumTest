import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.Set;

public class test_cookies {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();    //Chrome浏览器
        driver.get("https://www.baidu.com");
        Cookie c1 = new Cookie("name","key-wjjaa");
        Cookie c2 = new Cookie("value","value-wjjbb");
        driver.manage().addCookie(c1);
        driver.manage().addCookie(c2);

        Set<Cookie> coo = driver.manage().getCookies();
        System.out.println(coo);

       // driver.manage().deleteAllCookies();
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
