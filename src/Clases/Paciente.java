package Clases;
import javax.swing.*;
import java.util.ArrayList;

public class Paciente extends Persona{

    private int numeroHistoriaClinica;
    private String sexo;
    private String grupoSanguineo;
    private ArrayList<String> listaMedicamentosAlergico;


    @Override
    public void registrarDatos() {
        // Llamamos al método registrarDatos de la superclase
        super.registrarDatos();

        // Llenamos los datos específicos del paciente
        listaMedicamentosAlergico = new ArrayList<String>();
        numeroHistoriaClinica = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la historia clinica"));
        sexo = JOptionPane.showInputDialog("Ingrese el sexo");
        grupoSanguineo = JOptionPane.showInputDialog("Ingrese el grupo sanguíneo");

        String pregunta = JOptionPane.showInputDialog("¿Es alérgico a algún medicamento? ingrese sí o no");

        if (pregunta.equalsIgnoreCase("si")) {
            String medicamento = "";
            String continuar = "";

            do {
                medicamento = JOptionPane.showInputDialog("Ingrese el nombre del medicamento al que es alérgico");
                listaMedicamentosAlergico.add(medicamento);

                continuar = JOptionPane.showInputDialog("¿Desea continuar? ingrese sí o no");

            } while (continuar.equalsIgnoreCase("si"));
        }
    }

    @Override
    public void imprimirDatosPersonas(String datos){
        super.imprimirDatosPersonas(datos);

        datos = "nuemro historia clinica: "+numeroHistoriaClinica+ "\n";
        datos += "Sexo: "+sexo+ "\n";
        datos += "Grupo sanguineo: "+grupoSanguineo+ "\n";

        if (listaMedicamentosAlergico.size()>0){
            datos += "Lista de medicamentos a los q eres alergico \n";
            for (int i = 0; i < listaMedicamentosAlergico.size(); i++){
                datos += "\t" +listaMedicamentosAlergico.get(i)+ "\n";
            }
        }else{
            datos+= "El paciente, no es alergico a ningun medicamento";
        }
        System.out.println(datos);
    }


    //Setters and Getters

    public int getNumeroHistoriaClinica() {
        return numeroHistoriaClinica;
    }

    public void setNumeroHistoriaClinica(int numeroHistoriaClinica) {
        this.numeroHistoriaClinica = numeroHistoriaClinica;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public ArrayList<String> getListaMedicamentosAlergico() {
        return listaMedicamentosAlergico;
    }

    public void setListaMedicamentosAlergico(ArrayList<String> listaMedicamentosAlergico) {
        this.listaMedicamentosAlergico = listaMedicamentosAlergico;
    }

}