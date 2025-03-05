package Empleado;

import javax.swing.*;

public class EmpleadoEventual extends Empleado{
    private double horariosPorHora;
    private String fechaTerminoContrato;

    @Override
    public void registrarDatos(){
        super.registrarDatos();
        horariosPorHora = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario mensual"));
        fechaTerminoContrato = JOptionPane.showInputDialog("Ingrese la fecha del termino del contrato(dd/mm/AAAA)");

    }

    @Override
    public void imprimirDatosPersonas(String datos){
        super.imprimirDatosPersonas(datos);
        datos = "Honorarios por hora" + horariosPorHora + "\n";
        datos += "Fecha termino del contrato "+fechaTerminoContrato +"\n";

        System.out.println(datos);
    }


    //Setters and Getters
    public double getHorariosPorHora() {
        return horariosPorHora;
    }

    public void setHorariosPorHora(double horariosPorHora) {
        this.horariosPorHora = horariosPorHora;
    }

    public String getFechaTerminoContrato() {
        return fechaTerminoContrato;
    }

    public void setFechaTerminoContrato(String fechaTerminoContrato) {
        this.fechaTerminoContrato = fechaTerminoContrato;
    }
}
