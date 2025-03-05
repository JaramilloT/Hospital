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