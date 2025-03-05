package Clases;

import Empleado.Medico;

public class CitaMedica {
    private Paciente paciente;
    private Medico medico;
    private String servicio;
    private String fechaColsultar;
    private String horaConsultar;
    private String lugar;

    public CitaMedica(Paciente paciente, Medico medico, String servicio,
                      String fechaColsultar, String horaConsultar, String lugar) {
        this.paciente = paciente;
        this.medico = medico;
        this.servicio = servicio;
        this.fechaColsultar = fechaColsultar;
        this.horaConsultar = horaConsultar;
        this.lugar = lugar;
    }

    public String informacionCitaMedica(){
        String datosCita = "Informacio de la cita medica";
        datosCita += "Paciente: "+ paciente;
        datosCita += "Medico: "+medico;
        datosCita += "Motivo consulta: "+ servicio;
        datosCita += "Fecha consulta: "+ fechaColsultar;
        datosCita += "Lugar conlta:"+ lugar;

        return datosCita;
    }

    //Getters and setters

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getFechaColsultar() {
        return fechaColsultar;
    }

    public void setFechaColsultar(String fechaColsultar) {
        this.fechaColsultar = fechaColsultar;
    }

    public String getHoraConsultar() {
        return horaConsultar;
    }

    public void setHoraConsultar(String horaConsultar) {
        this.horaConsultar = horaConsultar;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
