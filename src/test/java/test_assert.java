import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_assert {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();    //Chrome浏览器
        driver.get("http://www.baidu.com");
        System.out.println("search before............");
        System.out.println("title of current page  is === "+driver.getTitle());
        System.out.println("url of current page is %s\n"+driver.getCurrentUrl());
        WebElement keywordEt = driver.findElement(By.id("kw"));
        keywordEt.sendKeys("selenium");
        keywordEt.sendKeys(Keys.ENTER);
        sleep();
        System.out.println("search after............");
        System.out.println("title of current page is === "+driver.getTitle());
        //此处返回的url和预期的不一致
        //https://www.baidu.com/s?ie=utf-8&f=8&rsv_bp=0&rsv_idx=1&tn=baidu&wd=selenium&rsv_pq=a4334f9200019131&rsv_t=3586Xs8FF4ZclpoELLlpFAFwm5GLuwSAN%2FoLlSdIzkrbmTe%2BRqa5E%2BoDeN8&rqlang=cn&rsv_enter=1&rsv_sug3=8&rsv_sug2=0&inputT=182&rsv_sug4=182
        System.out.println("url of current page is %s\n"+driver.getCurrentUrl());
        //获取第一条搜索结果的标题
        WebElement result = driver.findElement(By.xpath("//div[@id='content_left']/div/h3/a"));
        System.out.println(result.getText());
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
