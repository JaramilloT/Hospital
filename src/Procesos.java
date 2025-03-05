import Clases.ModeloDeDatos;
import Clases.Paciente;
import Clases.CitaMedica;
import Empleado.EmpleadoEventual;
import Empleado.EmpleadoPlanilla;
import Empleado.Medico;
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
                case 4: imprimirInformacion();
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
                    miModeloDatos.registrarPersona(miEmpleadoEventual);
                    break;
                case 2:
                    String resp = JOptionPane.showInputDialog("ingrese si, si es un medico, de lo contrario es otro tipo de empleado");
                    if(resp.equalsIgnoreCase("si")){
                        //Registrar medico
                        Medico miMedico=new Medico();
                        miMedico.registrarDatos();
                        miModeloDatos.registrarPersona(miMedico);
                    }else{
                        //Registrar empleado planilla
                        EmpleadoPlanilla miEmpleadoPlanilla = new EmpleadoPlanilla();
                        miEmpleadoPlanilla.registrarDatos();
                        miModeloDatos.registrarPersona(miEmpleadoPlanilla);
                    }
                    break;
                default:System.out.println("No existe el código, vuelva a verificar");
                    break;
            }
        }

    private void imprimirInformacion() {
        String menuImprimir = "MENU IMPRESIONES\n";
        menuImprimir += "1. Listar Pacientes\n";
        menuImprimir += "2. Listar Empleados Eventuales\n";
        menuImprimir += "3. Listar Empleados Por Planilla\n";
        menuImprimir += "4. Listar Medicos\n";
        menuImprimir += "5. Lustar Citas Programadas\n";
        menuImprimir += "Ingrese una opción\n";

        System.out.println("**********************************************************");

        int opcion = Integer.parseInt(JOptionPane.showInputDialog(menuImprimir));

        switch (opcion) {
            case 1:
                miModeloDatos.imprimirPacientes();
                break;
            case 2:
                miModeloDatos.imprimirEmpleadosEventuales();
                break;
            case 3:
                miModeloDatos.imprimirEmpleadosPorPlanilla();
                break;
            case 4:
                miModeloDatos.imprimirMedico();
                break;
            case 5:
                miModeloDatos.imprimirCitasMedicasProgramadas();
                break;
            default:
                System.out.println("No existe esa opción");
                break;
        }
    }

    private void registrarCitaMedica(){
        String documentoPaciente = JOptionPane.showInputDialog("ingrese el documento del paciete");

        Paciente pacienteEncontrado = miModeloDatos.consultarPacientePorDocumento(documentoPaciente);

        if (pacienteEncontrado!=null){
            String nombreMedico = JOptionPane.showInputDialog("Ingrese el nombre del Medico");
            Medico medicoEncontrado = miModeloDatos.consultarMedicoPorNombre(nombreMedico);

            if (medicoEncontrado!= null){
                String servicio = JOptionPane.showInputDialog("Ingrese el servicio o motivo de la consulta");
                String fechaConsulta =JOptionPane.showInputDialog("Ingrese la fecha de la consulta: ");
                String horaConsulta= JOptionPane.showInputDialog("Ingrese la hora de la consulta:");

                String  lugar= "La cita sera en el consultorio "+ medicoEncontrado.getNumeroDelConsultoria();
                CitaMedica miCita = new CitaMedica(pacienteEncontrado, medicoEncontrado, servicio, fechaConsulta, horaConsulta, lugar);
                miModeloDatos.registrarCitaMedica(miCita);
            }else {
                System.out.println("El medico no se encuentra registrado en el sistema");
            }

        }else {
            System.out.println("El paciente no es encuentra en el sistema");
        }
    }
}

