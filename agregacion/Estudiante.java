package agregacion;

public class Estudiante {

    private String nombreEstudiante;
    private int idEstudiante;

    public Estudiante(String nombreEstudiante, int idEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
        this.idEstudiante = idEstudiante;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }
}
