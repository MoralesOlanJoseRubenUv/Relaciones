package agregacion;

import java.util.List;

public class Instituto {

    private String nombreInstituto;
    private List<Departamento> departamentos;

    public Instituto(String nombreInstituto, List<Departamento> departamentos) {
        this.nombreInstituto = nombreInstituto;
        this.departamentos = departamentos;
    }

    public void agregarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public int obtenerTotalEstudiantes() {
        int totalEstudiantes = 0;

        for (Departamento departamento : departamentos) {
            for (Estudiante estudiante : departamento.getEstudiantes()) {
                totalEstudiantes++;
            }
        }

        return totalEstudiantes;
    }

    public String getNombreInstituto() {
        return nombreInstituto;
    }
}
