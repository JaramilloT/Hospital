import Clases.ModeloDeDatos;
import Clases.Paciente;
import Empleado.Empleado;
import Empleado.EmpleadoEventual;
import javax.swing.*;

public class Procesos {
    ModeloDeDatos miModeloDatos;
    public Procesos(){
        miModeloDatos = new ModeloDeDatos();
        presentarMenuOpciones();
    }
    private void presentarMenuOpciones(){
        String menu="Menu hospital\n";
        menu+="1. Registrar Paciente\n";
        menu+="2. Registrar Empleado\n";
        menu+="3. Registrar cita medica \n";
        menu+="4. Imprimir información\n";
        menu+="5. Salir\n";
        menu+="Ingrese una opción\n";

        int opcion = 0;
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcion){
                case 1: registrarPaciente();
                    break;
                case 2: registrarEmpleado();
                    break;
                case 3: registrarCitaMedica();
                    break;
                case 4: //ImprimirInformacion();
                    break;
                case 5: System.out.println("El sistema ha terminado!");
                    break;
                default:System.out.println("No existe el código, vuelva a verificar");
            }
        }while (opcion != 5);
    }

    private void registrarPaciente(){
        Paciente miPaciente=new Paciente();
        miPaciente.registrarDatos();

        miModeloDatos.registrarPersona(miPaciente);
    }
    private void registrarEmpleado(){
        String menuTipoEmpleado = "Registro de empleado: ";
        menuTipoEmpleado += "1. Empleado eventual\n";
        menuTipoEmpleado += "2. Empleado por planilla\n";
        menuTipoEmpleado += "Seleccione el tipo de empleado a registrar\n";

        int tipoEmpleado=Integer.parseInt(JOptionPane.showInputDialog(menuTipoEmpleado));

            switch (tipoEmpleado){
                case 1: //RegistrarEmpledo Eventual
                    EmpleadoEventual miEmpleadoEventual =new EmpleadoEventual();
                    miEmpleadoEventual.registrarDatos();
                    miEmpleadoEventual.registrarPersona(miEmpleadoEventual);
                    break;
                case 2:
                    String resp = JOptionPane.showInputDialog("ingrese si, si es un medico, de lo contrario es otro tipo de empleado");
                    if(resp.equalsIgnoreCase("si")){
                        //Registrar medico
                        Medico miMedico=new Medico();
                        miMedico.registrarDatos();
                        miModeloDatos.registrarPersona(miMedico);
                    }
                    break;
                case 3: registrarCitaMedica();
                    break;
                case 4: //ImprimirInformacion();
                    break;
                case 5: System.out.println("El sistema ha terminado!");
                    break;
                default:System.out.println("No existe el código, vuelva a verificar");
            }
        }



    private void registrarCitaMedica(){
        String documentoPaciente = JOptionPane.showInputDialog("ingrese el documento del paciete");
        //Paciente pacienteEncontrado = miModeloDatos;
    }
}

