package org.proyecto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static org.proyecto.userinterface.PaginaDashnoard.*;



public class IrUnidadDeNegocios implements Task {

        public static IrUnidadDeNegocios UnidadNegocios (){

            return Tasks.instrumented(IrUnidadDeNegocios.class);
        }


    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               Click.on(SECCION_ORGANIZACION),
               Click.on(OPCION_UNIDAD_NEGOCIOS)

       );

    }
}
