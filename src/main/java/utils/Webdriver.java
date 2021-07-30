package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Webdriver {
    public static WebDriver web;

    public WebDriver abrirSiteOriginal(){

        System.setProperty("web.chrome.driver", "chromedriver.exe");
        web = new ChromeDriver();
        web.manage().window().maximize();
        web.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


        web.get("https://www.original.com.br");

        return web;
    }

    public void fecharChrome(){
        web.close();
        System.out.println("chrome Fechado");
    }

}
