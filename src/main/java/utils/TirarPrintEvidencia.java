package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class TirarPrintEvidencia extends  Webdriver{

    public static String dataDoArquivo() {
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        return new SimpleDateFormat("dd.MM.yyyy").format(ts);
    }

    public static String horaDoArquivo() {
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        return new SimpleDateFormat("hh-mm.ss").format(ts);
    }

    public static void evidencia(WebDriver web, String arquivo) {
        File tirarPrit = ((TakesScreenshot) web).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(tirarPrit, new File(arquivo));
        } catch (Exception error) {
            System.out.println("Não foi possível copiar e salvar o arquivo na pasta: " + error.getMessage());
        }
    }
}