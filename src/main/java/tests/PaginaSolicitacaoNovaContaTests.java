package tests;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import static org.junit.Assert.*;
import pages.PaginaSolicitacaoNovaContaPage;
import utils.Webdriver;

public class PaginaSolicitacaoNovaContaTests  {

    static Webdriver web = new Webdriver();
    PaginaSolicitacaoNovaContaPage paginaSolicitacaoNovaContaPage = new PaginaSolicitacaoNovaContaPage();
    @E("preencher os campos nome completo \"([^\"]*)\", celular \"([^\"]*)\", email \"([^\"]*)\" e cpf \"([^\"]*)\"")
    public void preencherCampos(String nomeCompleto, String celular, String email, String cpf){
        paginaSolicitacaoNovaContaPage = new PaginaSolicitacaoNovaContaPage();
        paginaSolicitacaoNovaContaPage.preencherFormularioNovaConta(nomeCompleto, celular, email, cpf);
    }

    @Entao("os campos sao validado com sucesso")
    public void validarcampos (){
        paginaSolicitacaoNovaContaPage = new PaginaSolicitacaoNovaContaPage();
        assertEquals(true,paginaSolicitacaoNovaContaPage.validarCampos());


    }
}
