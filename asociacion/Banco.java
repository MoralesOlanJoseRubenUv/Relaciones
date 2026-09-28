package asociacion;

import java.util.Set;

public class Banco {

    private String nombreBanco;
    private Set<Empleado> empleados;

    public Banco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setEmpleados(Set<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Set<Empleado> getEmpleados() {
        return empleados;
    }
}
