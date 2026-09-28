package composicion;

public class EjemploComposicion {

    public static void ejecutar() {
        Casa casa = new Casa("Casa de Ensueño");

        casa.agregarHabitacion("Sala");
        casa.agregarHabitacion("Dormitorio");
        casa.agregarHabitacion("Cocina");
        casa.agregarHabitacion("Baño");

        System.out.println(
                "Total de habitaciones: "
                + casa.obtenerTotalHabitaciones()
        );

        System.out.println("Habitaciones:");

        for (Habitacion habitacion : casa.getHabitaciones()) {
            System.out.println("- " + habitacion.getNombreHabitacion());
        }
    }
}
