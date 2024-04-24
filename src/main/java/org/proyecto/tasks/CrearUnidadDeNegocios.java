package org.proyecto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.Map;

import static org.proyecto.userinterface.PaginaDashnoard.*;
import static org.proyecto.userinterface.PaginaUnidadNegocios.*;


public class CrearUnidadDeNegocios implements Task {



        public static Map<String, String> datos_Unidad_Negocios;

        public static CrearUnidadDeNegocios CrearUNegocios (Map < String, String > datosUnidadNegocios){
            datos_Unidad_Negocios = datosUnidadNegocios;
            return Tasks.instrumented(CrearUnidadDeNegocios.class, datosUnidadNegocios);
        }


    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(

               Click.on(BOTON_CREAR),
               Enter.theValue(datos_Unidad_Negocios.get("nombre")).into(CAMPO_NOMBRE_UNIDAD_NEGOCIOS),
               Click.on(MOSTRAR_LISTA_UNIDAD_PADRE),
               Enter.theValue(datos_Unidad_Negocios.get("unidad_padre")).into(CAMPO_UNIDAD_PADRE),
               Hit.the(Keys.ENTER).into(CAMPO_UNIDAD_PADRE),
               Click.on(BOTON_GUARDAR)
       );

    }
}
