#autor:Hector Dickens
  #language: es

  @HistoriaDeUsuario
  Característica: Serenity
    Yo como usuario quiero accedera la pag.

  Antecedentes:

  Dado que el usuario acceda a la pagina Serenity.is
  Y utilice el rol admin para iniciar sesion
        |usuario|contraseña|
        |admin  |serenity  |

  @CasoUnidadNegocio
    Escenario: Crear una nueva Unidad de Negocio
    Cuando el usuario ingrese a la seccion de Unidades de Negocio
      Y seleccione New Business Unit, complete los campos requeridos y haga click en el boton guardar
        |nombre|unidad_padre  |
        |Test RT6|Administration|
      Entonces el sistema creara una nueva Unidad de Negocio

  @CasoReunion
    Escenario: Crear una nueva Reunion
      Cuando el usuario ingrese a la seccion de Reuniones
      Y llene todos los campos necesarios para crear una nueva reunión y haga click en el boton guardar
        |nombre      |tipo_de_reunion|id_reunion|fecha_inicial    |fecha_final      |ubicacion|unidad  |organizador     |reportero  |invitado_1  |invitado_2    |
        |Reto Técnico 6|Customer       |RT01      |04/15/2024 08:00 |04/15/2024 10:00 |SD-01    |Test RT6|Richard Williams|Olivia Reed|Alexis Lopez|Isabella Lewis|
    Entonces el sistema creara una nueva reunion
