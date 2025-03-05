package Empleado;

public class Medico extends EmpleadoPlanilla{
    private String especialidad;
    private int numeroDelConsultoria;

    //Setters and getters

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getNumeroDelConsultoria() {
        return numeroDelConsultoria;
    }

    public void setNumeroDelConsultoria(int numeroDelConsultoria) {
        this.numeroDelConsultoria = numeroDelConsultoria;
    }
}
