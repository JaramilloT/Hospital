package Clases;
import Clases.Paciente;
import Clases.Persona;
import Empleado.EmpleadoEventual;
import Empleado.EmpleadoPlanilla;
import Empleado.Medico;

import java.util.HashMap;

 public class ModeloDeDatos extends Persona {
        HashMap<String, Paciente> pacientesMap;
        HashMap<String, EmpleadoPlanilla> empleadosPlantillaMap;
        HashMap<String, EmpleadoEventual> empleadosEventualMap;
        HashMap<String, Medico> medicosMap;

        public ModeloDeDatos(){
            pacientesMap= new HashMap<String, Paciente>();
            empleadosPlantillaMap = new HashMap<String, EmpleadoPlanilla>();
            medicosMap= new HashMap<String, Medico>();
            empleadosEventualMap = new HashMap<String, EmpleadoEventual>();
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


}

