package org.proyecto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaReunion extends PageObject {
    public static By CAMPO_NOMBRE_REUNON = By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingName");
    public static By TIPO_REUNION = By.id("select2-chosen-6");

    public static By CAMPO_TIPO_REUNION = By.id("s2id_autogen6_search");
    public static By CAMPO_ID_REUNION = By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber");

    public static By CAMPO_FECHA_INICIAL = By.id("Serenity_Pro_Meeting_MeetingDialog10_StartDate");
    public static By CAMPO_FECHA_FINAL = By.id("Serenity_Pro_Meeting_MeetingDialog10_EndDate");
    public static By UBICACION = By.id("select2-chosen-7");
    public static By CAMPO_UBICACION = By.id("s2id_autogen7_search");
    public static By UNIDAD = By.id("select2-chosen-8");
    public static By CAMPO_UNIDAD = By.id("s2id_autogen8_search");
    public static By ORGANIZADOR = By.id("select2-chosen-9");
    public static By CAMPO_ORGANIZADOR = By.id("s2id_autogen9_search");
    public static By REPORTERO = By.id("select2-chosen-10");
    public static By CAMPO_REPORTERO = By.id("s2id_autogen10_search");
    public static By LISTA_ASISTENTES = By.id("select2-chosen-12");
    public static By CAMPO_LISTA_ASISTENTES = By.id("s2id_autogen12_search");

}
