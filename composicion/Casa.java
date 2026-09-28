package composicion;

import java.util.ArrayList;
import java.util.List;

public class Casa {

    private String nombreCasa;
    private List<Habitacion> habitaciones;

    public Casa(String nombreCasa) {
        this.nombreCasa = nombreCasa;
        this.habitaciones = new ArrayList<>();
    }

    public void agregarHabitacion(String nombreHabitacion) {
        habitaciones.add(new Habitacion(nombreHabitacion));
    }

    public List<Habitacion> getHabitaciones() {
        return new ArrayList<>(habitaciones);
    }

    public int obtenerTotalHabitaciones() {
        return habitaciones.size();
    }

    public String getNombreCasa() {
        return nombreCasa;
    }
}
