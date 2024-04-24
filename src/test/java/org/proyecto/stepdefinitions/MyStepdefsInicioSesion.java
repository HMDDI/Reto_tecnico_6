package org.proyecto.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import org.proyecto.questions.ValidarNuevaUnidadNegocios;
import org.proyecto.tasks.*;

import java.util.List;
import java.util.Map;


public class MyStepdefsInicioSesion {

    @Before
    public void IniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario acceda a la pagina Serenity.is")
    public void IralaPaginaSerenity() {
        OnStage.theActorCalled("actor").wasAbleTo(IrPaginaSerenity.urlApp());
    }

    @Y("utilice el rol admin para iniciar sesion")
    public void InicioSesion(DataTable credenciales) {

        List<Map<String, String>> rows = credenciales.asMaps(String.class, String.class);
        Map<String, String> credenciales_usuario = rows.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(InicioSesion.IniciodeSesion(credenciales_usuario));
    }

    @Cuando("el usuario ingrese a la seccion de Unidades de Negocio")
    public void SecccionUnidadNegocios() {
        OnStage.theActorInTheSpotlight().attemptsTo(IrUnidadDeNegocios.UnidadNegocios());
    }

    @Y("seleccione New Business Unit, complete los campos requeridos y haga click en el boton guardar")
    public void crearNuevaUnidadNegocios(DataTable datosU) {

        List<Map<String, String>> rows = datosU.asMaps(String.class, String.class);
        Map<String, String> datosUnidadNegocios = rows.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(CrearUnidadDeNegocios.CrearUNegocios(datosUnidadNegocios));
    }

    @Entonces("el sistema creara una nueva Unidad de Negocio")
    public void UnidaddeNegocioCreada() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarNuevaUnidadNegocios.unidad_negocio(), Matchers.containsString("Test RT6")));
    }

    @Cuando("el usuario ingrese a la seccion de Reuniones")
    public void SeccionReunion() {
        OnStage.theActorInTheSpotlight().attemptsTo(IrReunion.IraReunion());
    }

    @Y("llene todos los campos necesarios para crear una nueva reunión y haga click en el boton guardar")
    public void crearNuevaReunion(DataTable datosR) {

        List<Map<String, String>> rows = datosR.asMaps(String.class, String.class);
        Map<String, String> datosReuniones = rows.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(CrearReuniones.CrearunaReunion(datosReuniones));
    }

    @Entonces("el sistema creara una nueva reunion")
    public void ReunionCreada() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarNuevaUnidadNegocios.unidad_negocio(), Matchers.containsString("Reto Técnico 6")));
    }
}
