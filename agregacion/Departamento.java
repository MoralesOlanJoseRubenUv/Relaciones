package agregacion;

import java.util.List;

public class Departamento {

    private String nombreDepartamento;
    private List<Estudiante> estudiantes;

    public Departamento(String nombreDepartamento, List<Estudiante> estudiantes) {
        this.nombreDepartamento = nombreDepartamento;
        this.estudiantes = estudiantes;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }
}
