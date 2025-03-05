package Empleado;

public class EmpleadoPlanilla extends Empleado{
    private double salarioMensual;
    private double horasExtras;

    public void imprimirDatosPersona(String datos){
        super.imprimirDatosPersona(datos);

        datos = "Salario mensual"+ salarioMensual;
        datos += "Porcentaje de horas extras: "+ horasExtras;

        System.out.println(datos);
    }

    //Setters and getters

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }
}
