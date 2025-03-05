package Empleado;

import Clases.Persona;

import javax.swing.*;

public class Empleado extends Persona {
    private String codigoEmpleado;
    private int numeroHorasExtras;
    private String fechaDeIngreso;
    private String area;
    private String cargo;

    @Override
    public void registrarDatos(){
        super.registrarDatos();
        codigoEmpleado=JOptionPane.showInputDialog("Ingrese el codigo del empleado");
        numeroHorasExtras=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de horas extras"));
        fechaDeIngreso=JOptionPane.showInputDialog("Ingresa la fecha de ingreso (dd/mm/aaaa)");
        area=JOptionPane.showInputDialog("Ingresa el area");
        cargo=JOptionPane.showInputDialog("Ingresa el cargo");
    }

    public void imprimirDatosPersona(String datos){
            super.imprimirDatosPersonas(datos);

            datos = "codigo del empleado" +codigoEmpleado;
            datos += "Numero de horas extra "+numeroHorasExtras;
            datos += "Fecha de ingreso "+ fechaDeIngreso;
            datos += "Area: "+ area;
            datos += "Cargo: "+ cargo;

            System.out.println(datos);
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public int getNumeroHorasExtras() {
        return numeroHorasExtras;
    }

    public void setNumeroHorasExtras(int numeroHorasExtras) {
        this.numeroHorasExtras = numeroHorasExtras;
    }

    public String getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(String fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
