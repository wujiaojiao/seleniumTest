import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class test_screen_shot {

    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();//Chrome浏览器
        driver.get("https://www.baidu.com");
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        sleep();
        String path = srcFile.getAbsolutePath();
        System.out.println("path======="+path);
        try{
            FileUtils.copyFile(srcFile,new File("D://ScreenShot.png"));
        }catch (Exception e){
            System.out.println(e.toString());
        }

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
