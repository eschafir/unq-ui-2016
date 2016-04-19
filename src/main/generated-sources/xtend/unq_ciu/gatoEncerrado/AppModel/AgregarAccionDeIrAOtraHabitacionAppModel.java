package unq_ciu.gatoEncerrado.AppModel;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.UserException;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.AppModel.AgregarAccionDeAccionAppModel;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Laberinto;
import unq_ciu.gatoEncerrado.acciones.Mover;

@Accessors
@Observable
@SuppressWarnings("all")
public class AgregarAccionDeIrAOtraHabitacionAppModel extends AgregarAccionDeAccionAppModel {
  private Habitacion habitacionSeleccionada;
  
  public AgregarAccionDeIrAOtraHabitacionAppModel(final Laberinto laberinto, final Habitacion habitacion) {
    this.setLaberinto(laberinto);
    this.setHabitacion(habitacion);
  }
  
  @Override
  public Object agregarAccion() {
    boolean _xifexpression = false;
    boolean _equals = Objects.equal(this.habitacionSeleccionada, null);
    if (_equals) {
      throw new UserException("Por favor seleccione una habitación.");
    } else {
      Habitacion _habitacion = this.getHabitacion();
      Mover _mover = new Mover(this.habitacionSeleccionada);
      _xifexpression = _habitacion.agregarAccion(_mover);
    }
    return Boolean.valueOf(_xifexpression);
  }
  
  public List<Habitacion> getHabitacionesDisponibles() {
    final ArrayList<Habitacion> lista = CollectionLiterals.<Habitacion>newArrayList();
    Laberinto _laberinto = this.getLaberinto();
    List<Habitacion> _habitaciones = _laberinto.getHabitaciones();
    for (final Habitacion h : _habitaciones) {
      Habitacion _habitacion = this.getHabitacion();
      boolean _notEquals = (!Objects.equal(h, _habitacion));
      if (_notEquals) {
        lista.add(h);
      }
    }
    return lista;
  }
  
  @Pure
  public Habitacion getHabitacionSeleccionada() {
    return this.habitacionSeleccionada;
  }
  
  public void setHabitacionSeleccionada(final Habitacion habitacionSeleccionada) {
    this.habitacionSeleccionada = habitacionSeleccionada;
  }
}
