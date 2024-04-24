package org.proyecto.userinterface;

import net.serenitybdd.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://serenity.is/demo/")
public class PaginaInicioSesion extends PageObject {
    public static By CAMPO_NOMBRE_DE_USUARIO = By.id("LoginPanel0_Username");
    public static By CAMPO_CONTRASEÑA_DE_USUARIO = By.id("LoginPanel0_Password");
    public static By BOTON_DE_INICIO_DE_SESION = By.id("LoginPanel0_LoginButton");

}
