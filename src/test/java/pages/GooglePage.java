package pages;

import java.io.IOException;

public class GooglePage extends BasePage {

    private String searchButton = "//input[@value='Buscar con Google']";
    private String searchTextField = "//textarea[@id='APjFqb']";//      //textarea[@id='APjFqb']      //input[@title='Buscar']
    private String wikipediaLink = "//h3[contains(text(),'Automatizaci\u00F3n industrial - Wikipedia, la enciclop')]";
    private String logo = "//a[@id='logo']";
    private String anio = "//body[1]/div[2]/div[1]/div[3]/main[1]/div[3]/div[3]/div[1]/p[8]";


    public GooglePage (){
        super(driver);
    }

    public void navigateToGoogle(){
        navigateTo("https://www.google.com.pe/");
    }

    public void clickBottonSearch(){
        clickElement(searchButton);
    }

    public void enterSearchCriteria(String criteria){
        write(searchTextField, criteria);
    }

    public void clickLink(){
        clickElement(wikipediaLink);
    }

    public void screenShots(String Name) throws IOException{
        screenShot(Name);
    }

    public String anioIsThere(){
        return textFromElement(anio);
    }

    public boolean logoStatus(){
        return elementDisplayed(logo);
    }
}
