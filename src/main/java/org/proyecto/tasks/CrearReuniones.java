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
import static org.proyecto.userinterface.PaginaReunion.*;
import static org.proyecto.userinterface.PaginaUnidadNegocios.MOSTRAR_LISTA_UNIDAD_PADRE;


public class CrearReuniones implements Task {



        public static Map<String, String> datos_Reuniones;

        public static CrearReuniones CrearunaReunion (Map < String, String > datosReuniones){
            datos_Reuniones = datosReuniones;
            return Tasks.instrumented(CrearReuniones.class, datos_Reuniones);
        }


    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(

               Click.on(BOTON_CREAR),
               Enter.theValue(datos_Reuniones.get("nombre")).into(CAMPO_NOMBRE_REUNON),
               Click.on(TIPO_REUNION),
               Enter.theValue(datos_Reuniones.get("tipo_de_reunion")).into(CAMPO_TIPO_REUNION),
               Hit.the(Keys.ENTER).into(CAMPO_TIPO_REUNION),
               Enter.theValue(datos_Reuniones.get("id_reunion")).into(CAMPO_ID_REUNION),
               Enter.theValue(datos_Reuniones.get("fecha_inicial")).into(CAMPO_FECHA_INICIAL),
               Enter.theValue(datos_Reuniones.get("fecha_final")).into(CAMPO_FECHA_FINAL),
               Click.on(UBICACION),
               Enter.theValue(datos_Reuniones.get("ubicacion")).into(CAMPO_UBICACION),
               Hit.the(Keys.ENTER).into(CAMPO_UBICACION),
               Click.on(UNIDAD),
               Enter.theValue(datos_Reuniones.get("unidad")).into(CAMPO_UNIDAD),
               Hit.the(Keys.ENTER).into(CAMPO_UNIDAD),
               Click.on(ORGANIZADOR),
               Enter.theValue(datos_Reuniones.get("organizador")).into(CAMPO_ORGANIZADOR),
               Hit.the(Keys.ENTER).into(CAMPO_ORGANIZADOR),
               Click.on(REPORTERO),
               Enter.theValue(datos_Reuniones.get("reportero")).into(CAMPO_REPORTERO),
               Hit.the(Keys.ENTER).into(CAMPO_REPORTERO),
               Click.on(LISTA_ASISTENTES),
               Enter.theValue(datos_Reuniones.get("invitado_1")).into(CAMPO_LISTA_ASISTENTES),
               Hit.the(Keys.ENTER).into(CAMPO_LISTA_ASISTENTES),
               Click.on(LISTA_ASISTENTES),
               Enter.theValue(datos_Reuniones.get("invitado_2")).into(CAMPO_LISTA_ASISTENTES),
               Hit.the(Keys.ENTER).into(CAMPO_LISTA_ASISTENTES),
               Click.on(BOTON_GUARDAR)
       );

    }
}
