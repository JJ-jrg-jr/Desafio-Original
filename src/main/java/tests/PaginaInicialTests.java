package tests;

import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import pages.PaginaInicialPage;
import utils.Webdriver;

public class PaginaInicialTests {
    static Webdriver web = new Webdriver();
    PaginaInicialPage paginaInicialPage = new PaginaInicialPage();
    @Dado("que tenha acessado o site do original")
    public void abrirSiteOriginal(){
        web.abrirSiteOriginal();
    }

    @Quando("clico abrir conta na secao para voce")
    public void abrirContaParaVoce(){
        paginaInicialPage = new PaginaInicialPage();
        paginaInicialPage.novaContaParaVoce();
    }
    @After()
    public void  fecharChrome(){
        web.fecharChrome();
    }
}
