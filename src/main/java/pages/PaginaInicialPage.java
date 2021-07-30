package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Webdriver;

public class PaginaInicialPage extends Webdriver {
    @FindBy(xpath = "//*[contains(@rel, 'abrir-nova-conta_desktop')]")
    private WebElement botaoAbrirConta;

    @FindBy(id = "bt1")
    private WebElement botaoparaVoce;

    public PaginaInicialPage(){
        PageFactory.initElements(web, this);
    }

    public void novaContaParaVoce(){
        botaoAbrirConta.click();
        botaoparaVoce.click();    }

}
