package unq_ciu.gatoEncerrado.Excepciones;

@SuppressWarnings("all")
public class YaHayUnaHabitacionInicialEnElLaberinto extends Exception {
  public YaHayUnaHabitacionInicialEnElLaberinto() {
    super("No se puede haber más de una habitacion inicial en el laberitno");
  }
}
