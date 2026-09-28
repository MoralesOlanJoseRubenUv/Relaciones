package agregacion;

import java.util.ArrayList;
import java.util.List;

public class EjemploAgregacion {

    public static void ejecutar() {
        Estudiante estudiante1 = new Estudiante("Parul", 1);
        Estudiante estudiante2 = new Estudiante("Sachin", 2);
        Estudiante estudiante3 = new Estudiante("Priya", 3);
        Estudiante estudiante4 = new Estudiante("Rahul", 4);

        List<Estudiante> estudiantesComputacion = new ArrayList<>();
        estudiantesComputacion.add(estudiante1);
        estudiantesComputacion.add(estudiante2);

        List<Estudiante> estudiantesElectronica = new ArrayList<>();
        estudiantesElectronica.add(estudiante3);
        estudiantesElectronica.add(estudiante4);

        Departamento computacion =
                new Departamento("Computación", estudiantesComputacion);

        Departamento electronica =
                new Departamento("Electrónica", estudiantesElectronica);

        List<Departamento> departamentos = new ArrayList<>();
        departamentos.add(computacion);
        departamentos.add(electronica);

        Instituto instituto = new Instituto("BITS", departamentos);

        System.out.println(
                "Total de estudiantes en el instituto: "
                + instituto.obtenerTotalEstudiantes()
        );
    }
}
