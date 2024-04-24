package org.proyecto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static org.proyecto.userinterface.PaginaDashnoard.*;


public class IrReunion implements Task {
    public static IrReunion IraReunion (){

        return Tasks.instrumented(IrReunion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SECCION_REUNION),
                Click.on(OPCION_REUNIONES)

        );

    }
}
