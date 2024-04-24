package org.proyecto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDashnoard extends PageObject {
    public static  Target DASHBOARD = Target.the("Titulo").located(By.xpath("//*[@class='content-header']"));
    public static  Target SECCION_ORGANIZACION = Target.the("SECCION_ORGANIZACION").located(By.xpath("//a[@href='#nav_menu1_3_1']"));
    public static  Target OPCION_UNIDAD_NEGOCIOS = Target.the("OPCION_UNIDAD_NEGOCIOS").located(By.xpath("//a[@href='/Organization/BusinessUnit']"));
    public static  Target SECCION_REUNION = Target.the("SECCION_REUNION").located(By.xpath("//a[@href='#nav_menu1_3_2']"));
    public static  Target OPCION_REUNIONES = Target.the("OPCION_REUNIONES").located(By.xpath("//a[@href='/Meeting/Meeting']"));
    public static  Target BOTON_CREAR = Target.the("BOTON_NUEVA_UNIDAD_NEGOCIOS").located(By.xpath("//div[@class='tool-button add-button icon-tool-button']"));
    public static  Target BOTON_GUARDAR = Target.the("BOTON_GUARDAR_UNIDAD_NEGOCIOS").located(By.xpath("//div[@class='tool-button save-and-close-button icon-tool-button']"));
    public static  Target TABLA_DE_DATOS= Target.the("BOTON_GUARDAR_UNIDAD_NEGOCIOS").located(By.xpath("//div[@class='grid-canvas']"));

}
