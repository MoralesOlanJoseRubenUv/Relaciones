package asociacion;

import java.util.HashSet;
import java.util.Set;

public class EjemploAsociacion {

    public static void ejecutar() {
        Empleado empleado1 = new Empleado("Ridhi");
        Empleado empleado2 = new Empleado("Vijay");

        Set<Empleado> empleados = new HashSet<>();
        empleados.add(empleado1);
        empleados.add(empleado2);

        Banco banco = new Banco("ICICI");
        banco.setEmpleados(empleados);

        for (Empleado empleado : banco.getEmpleados()) {
            System.out.println(
                empleado.getNombreEmpleado()
                + " pertenece al banco "
                + banco.getNombreBanco()
            );
        }
    }
}
