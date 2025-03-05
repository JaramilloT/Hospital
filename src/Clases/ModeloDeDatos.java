package Clases;
import Clases.Paciente;
import Clases.Persona;
import Clases.CitaMedica;
import Empleado.EmpleadoEventual;
import Empleado.EmpleadoPlanilla;
import Empleado.Medico;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ModeloDeDatos extends Persona {
        HashMap<String, Paciente> pacientesMap;
        HashMap<String, EmpleadoPlanilla> empleadosPlantillaMap;
        HashMap<String, EmpleadoEventual> empleadosEventualMap;
        HashMap<String, Medico> medicosMap;
        ArrayList <CitaMedica> citasList;

        public ModeloDeDatos(){
            pacientesMap= new HashMap<String, Paciente>();
            empleadosPlantillaMap = new HashMap<String, EmpleadoPlanilla>();
            medicosMap= new HashMap<String, Medico>();
            empleadosEventualMap = new HashMap<String, EmpleadoEventual>();
            citasList = new ArrayList<CitaMedica>();
        }

        public void registrarPersona(Paciente miPaciente){
            pacientesMap.put(miPaciente.getDNI(),miPaciente);
            System.out.println("Se ha registrado el paciente "+miPaciente.getNombre()+" Satisfactoriamente");
        }
        public void registrarPersona(EmpleadoPlanilla miEmpleadoPlantilla){
            empleadosPlantillaMap.put(miEmpleadoPlantilla.getDNI(),miEmpleadoPlantilla);
            System.out.println("Se ha registrado el empleado por plantilla "+miEmpleadoPlantilla.getNombre()+" Satisfactoriamente");
        }
        public void registrarPersona(EmpleadoEventual miEmpleadoEventual){
            empleadosEventualMap.put(miEmpleadoEventual.getDNI(),miEmpleadoEventual);
            System.out.println("Se ha registrado el empleado eventual "+miEmpleadoEventual.getNombre()+" Satisfactoriamente");
        }
        public void registrarPersona(Medico miMedico){
            medicosMap.put(miMedico.getDNI(),miMedico);
            System.out.println("Se ha registrado el medico "+miMedico.getNombre()+" Satisfactoriamente");
        }

        public void imprimirPacientes (){
            String msj = "Pacientes registrados";
            Iterator <String> iterator = pacientesMap.keySet().iterator();

            while (iterator.hasNext()){
                String clave = iterator.next();
                pacientesMap.get(clave).imprimirDatosPersonas(msj);
            }
        }


        public void imprimirEmpleadosEventuales(){
            String msj= "Empleados eventuales registrados";
            for(String clave : empleadosEventualMap.keySet()){
                empleadosEventualMap.get(clave).imprimirDatosPersonas(msj);
            }
        }

        public void imprimirEmpleadosPorPlanilla (){
            String msj = "Empleados por planilla registrados";

            for (EmpleadoPlanilla empleadoPlanilla : empleadosPlantillaMap.values()){
                empleadoPlanilla.imprimirDatosPersonas(msj);
            }
        }

        public void imprimirMedico(){
            String msj = "Medicos Registrados";
            for (Map.Entry<String, Medico> elemento : medicosMap.entrySet()){
                //System.out.println("key = "+ elemento.getKey() + ", Valuer = " + elemento .getValue());
                //medicosMap.get(elemento.getKey ()).imprimerDatosPersona(msj)
                elemento.getValue().imprimirDatosPersonas(msj);
            }
        }

        public Paciente consultarPacientePorDocumento(String documentoPaciente){
            Paciente miPaciente = null;

            if (pacientesMap.containsKey(documentoPaciente)){
                miPaciente= pacientesMap.get(documentoPaciente);
            }

            return miPaciente;
        }

    public Medico consultarMedicoPorNombre(String nombreMedico){
            for(Medico medico : medicosMap.values()){
                if (medico.getNombre().equalsIgnoreCase(nombreMedico)){
                    return medico;//al retornar termina el ciclo
                }
            }
        return null;
    }

    public void registraCitaMedica(CitaMedica miCita){
            citasList.add(miCita);
            System.out.println("Se ha registrado la cita exitosamente \n ");
            System.out.println(miCita.informacionCitaMedica());
    }

    public void imprimirCitasMedicasProgramadas(){
            String msj = "Citas medicas programadas";

            CitaMedica miCita = null;

            System.out.println(msj + "\n");

            if (citasList.size()>0){
                for (int i = 0; i < citasList.size(); i++){
                    miCita = citasList.get(i);
                    System.out.println(miCita.informacionCitaMedica());
                }
            }else {
                System.out.println("No exiten citas programadas");
            }
    }



}

