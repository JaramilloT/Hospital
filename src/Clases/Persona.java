package Clases;

import javax.swing.*;

public class Persona {
    private String DNI;
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private String direccion;
    private String ciudadDeProcedencia;

    public Persona(){

    }

    public void imprimirDatosPersonas(String datos){
        datos+="DNI del usuario: "+DNI + "\n";
        datos+="Nombre del usuario: "+nombre + "\n";
        datos+="Apellido del usuario: "+apellido + "\n";
        datos+="Fechas de nacimiento: "+fechaDeNacimiento + "\n";
        datos+="Direccion: "+direccion + "\n";
        datos+="Ciudad de procedencia: "+ciudadDeProcedencia + "\n";

        System.out.println(datos);
    }
    public void registrarDatos(){
        DNI= JOptionPane.showInputDialog("Ingrese el numero del documento");
        nombre= JOptionPane.showInputDialog("Ingrese el nombre");
        apellido= JOptionPane.showInputDialog("Ingrese el Apellido");
        fechaDeNacimiento= JOptionPane.showInputDialog("Ingrese la fecha de nacimiento (dd/mm/aaaa)");
        direccion= JOptionPane.showInputDialog("Ingrese la dirección");
        ciudadDeProcedencia= JOptionPane.showInputDialog("Ingrese la dirección de procedencia");
    }
    public void registrarCitaMedica(CitaMedica miCita){

    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String numeroDNI) {
        this.DNI = numeroDNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaDeNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudadProcedencia() {
        return ciudadDeProcedencia;
    }

    public void setCiudadProcedencia(String ciudadProcedencia) {
        this.ciudadDeProcedencia = ciudadProcedencia;
    }
}
