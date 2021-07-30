package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TirarPrintEvidencia;
import utils.Webdriver;

public class PaginaSolicitacaoNovaContaPage extends Webdriver {
    @FindBy(id = "nome")
    private WebElement campoNomeCompleto;

    @FindBy(id = "telefone")
    private WebElement campoTelefone;

    @FindBy(id = "email")
    private WebElement campoEmail;

    @FindBy(id = "cpf" )
    private WebElement campoCpf;

    @FindBy(id = "emailMsgErrorInvalid")
    private WebElement emalInvalido;

    @FindBy(id = "cpfMsgErrorInvalid")
    private WebElement cpfInvalido;

    public PaginaSolicitacaoNovaContaPage(){
        PageFactory.initElements(web, this);
    }
    public void preecheNomeCompleto (String nomeCompleto){
        campoNomeCompleto.sendKeys(nomeCompleto);
    }
    public void preecherCelular(String celular){
        campoTelefone.sendKeys(celular);
    }
    public void preecherEmail(String email){
        campoEmail.sendKeys(email);
    }

    public void preecherCpf(String cpf){
        campoCpf.sendKeys(cpf);
    }
    public void preencherFormularioNovaConta( String nomeCompleto, String celular, String email, String cpf){
        preecheNomeCompleto(nomeCompleto);
        preecherCelular(celular);
        preecherEmail(email);
        preecherCpf(cpf);
        campoNomeCompleto.click();
    }
    public boolean validarCampos(){
        if (emalInvalido.isDisplayed() || cpfInvalido.isDisplayed() ){
            System.out.println("email ou cpf Invalido");
            String tirarPrint = "src/main/resources/Evidencias/" + TirarPrintEvidencia.dataDoArquivo() + "/" + TirarPrintEvidencia.horaDoArquivo()+ " EmailoOuCpfInvalido.png";
            TirarPrintEvidencia.evidencia(web, tirarPrint);
            return false;

        }

        return true;
    }
}
