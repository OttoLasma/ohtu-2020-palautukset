package ohtu;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Tester {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        final String URL = "http://localhost:4567";
        driver.get(URL);
        Random r = new Random();
        sleep(2);
        
        //WebElement element = driver.findElement(By.linkText("login"));
        //skenaario 2-3 uuden tunnuksen luominen Yks rivi
        WebElement element = driver.findElement(By.linkText("register new user"));
        element.click();

        sleep(2);

        element = driver.findElement(By.name("username"));
        //element.sendKeys("pekka");
        //skenaario 2-3 rivi
        element.sendKeys("arto"+r.nextInt(100000));
        
        element = driver.findElement(By.name("password"));
        //element.sendKeys("akkep");
        //skenaario 1 vaara salasana yks rivi
        // skenaario 2-3 salasana voi olla sama, kuin skenaariossa 1
        element.sendKeys("akkep15");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("akkep15");

        //element = driver.findElement(By.name("login"));
        // skenaario 2-3 
        element = driver.findElement(By.name("signup"));

        sleep(2);
        element.submit();
        sleep(3);
        
        element = driver.findElement(By.linkText("continue to application mainpage"));
        element.click();
        sleep(3);
        element = driver.findElement(By.linkText("logout"));
        element.click();
        sleep(3);
        
        driver.quit();
    }
    
    private static void sleep(int n){
        try{
            Thread.sleep(n*1000);
        } catch(Exception e){}
    }
}
