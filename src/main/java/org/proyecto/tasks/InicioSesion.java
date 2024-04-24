package org.proyecto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import java.util.Map;
import static org.proyecto.userinterface.PaginaInicioSesion.*;



public class InicioSesion implements Task {



        public static Map<String, String> credencialesdeUsuario;

        public static InicioSesion IniciodeSesion (Map < String, String > credenciales_usuario){
            credencialesdeUsuario = credenciales_usuario;
            return Tasks.instrumented(InicioSesion.class, credenciales_usuario);
        }


    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               Enter.theValue(credencialesdeUsuario.get("usuario")).into(CAMPO_NOMBRE_DE_USUARIO),
               Enter.theValue(credencialesdeUsuario.get("contraseña")).into(CAMPO_CONTRASEÑA_DE_USUARIO),
               Click.on(BOTON_DE_INICIO_DE_SESION).afterWaitingUntilEnabled()
       );

    }
}
