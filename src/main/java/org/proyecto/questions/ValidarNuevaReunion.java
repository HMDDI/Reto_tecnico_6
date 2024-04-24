package org.proyecto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.proyecto.userinterface.PaginaDashnoard;


public class ValidarNuevaReunion implements Question<String> {

    public static ValidarNuevaReunion reunion() {

        return new ValidarNuevaReunion();
    }
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(PaginaDashnoard.TABLA_DE_DATOS).answeredBy(actor).toString();
    }
}
