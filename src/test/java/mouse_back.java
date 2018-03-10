import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class mouse_back {

    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();    //Chrome浏览器
        driver.get("http://www.baidu.com");
        WebElement setting  = driver.findElement(By.linkText("设置"));
        Actions action = new Actions(driver);
        action.clickAndHold(setting).perform();
        sleep();
      /*  action.contextClick(setting);//右击
        action.doubleClick(setting);//双击
        //鼠标拖拽动作， 将source元素拖放到target元素的位置。
        WebElement source = driver.findElement(By.name("element"));
        WebElement target = driver.findElement(By.name("element"));
        action.dragAndDrop(source,target).perform();
        action.release(setting);*/
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
