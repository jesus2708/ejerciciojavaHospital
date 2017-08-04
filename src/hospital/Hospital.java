package hospital;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import metodos.metodosPacientes;

public class Hospital {

    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;
        ArrayList<Paciente> paciente = new ArrayList<>();
        ArrayList<Medico> medico = new ArrayList<>();
        ArrayList<HistorialClinico> historial = new ArrayList<>();
        
        do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog("1.-Gestionar Pacientes.\n 2.-Gestionar Medicos\n3.-Gestionar Historial Clinico\n4.-Salir"));
        switch (opcion){
            case 1:

               int opcionPaciente= Integer.parseInt(JOptionPane.showInputDialog("1.-Registrar Paciente\n 2.-Consultar Paciente\n3.-Modificar Paciente\n4.-Eliminar Paciente\n5.-Atras"));
                switch(opcionPaciente){
                    case 1://Registrar
                        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del paciente"));
                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del Paciente");
                        String apellidos = JOptionPane.showInputDialog("Ingrese los apellidos del paciente");
                        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del paciente"));
                        String genero = JOptionPane.showInputDialog("Ingrese el genero del usuario");
                        metodosPacientes.getInstancia().registrarPaciente(paciente,new Paciente(id,nombre,apellidos,edad,genero));
                        JOptionPane.showMessageDialog(null,"Se inserto correctamente");
                        break;
                    case 2://Buscar
                        int opcionBusqueda = Integer.parseInt(JOptionPane.showInputDialog("1.- Busqueda por ID\n 2 Busqueda por Nombre"));
                        if (opcionBusqueda == 1) {
                         int idBusqueda=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a buscar"));
                           int resultadoBusquedaId= metodosPacientes.getInstancia().busquedaSecuencialIdentificacion(paciente, idBusqueda);
                            if (resultadoBusquedaId != -1) {
                                
                                 JOptionPane.showInputDialog(null,metodosPacientes.getInstancia().imprimirListaID(paciente,idBusqueda));
                            }else  {
                                JOptionPane.showMessageDialog(null,"No existe un registro con este numero de identificacion");
                            }
                         
                         
                        }
                        if (opcionBusqueda == 2) {
                            String nombreBusqueda = JOptionPane.showInputDialog("Ingrese el nombre a buscar ");
                            int resultadoBusquedanombre= metodosPacientes.getInstancia().busquedaSecuencialNombre(paciente, nombreBusqueda);
                            if (resultadoBusquedanombre != -1) {
                                
                                 JOptionPane.showMessageDialog(null,metodosPacientes.getInstancia().imprimirListaNombre(paciente,nombreBusqueda));
                            }else  {
                                JOptionPane.showMessageDialog(null,"No existe un registro con este nombre");
                            }
                            

                        }
                        break;
                    case 3://Modificar
                        JOptionPane.showMessageDialog(null,metodosPacientes.getInstancia().imprimirLista(paciente));
                        int OpcionModificar=Integer.parseInt(JOptionPane.showInputDialog("Elija el dato que desea modificar\n1.-Id\n2.-Nombre\n3.-Eliminar\n4.-Atras"));
                       
                        switch(OpcionModificar){
                            case 1:
                                int idCambiar=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a modificar"));
                                int posicionId = metodosPacientes.getInstancia().busquedaSecuencialIdentificacion(paciente, idCambiar);
                                if (posicionId != -1) {
                                    int idNuevo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el nuevo id"));
                                    metodosPacientes.getInstancia().modificar(paciente, posicionId, idNuevo);
                                   JOptionPane.showMessageDialog(null,"Se guardaron los cambios");
                                   JOptionPane.showInputDialog(null,metodosPacientes.getInstancia().imprimirListaID(paciente,idNuevo));
                                }else  {
                                    JOptionPane.showMessageDialog(null,"No existe un registro coneste numero de identificacion");
                                }
                                break;
                            case 2:
                                String idNombre=JOptionPane.showInputDialog("Ingrese el nombre a modificar");
                                int NombreIdNuevo = metodosPacientes.getInstancia().busquedaSecuencialNombreId(paciente, idNombre);
                                if (NombreIdNuevo != -1) {
                                    String idNuevo = JOptionPane.showInputDialog("Ingresa el nuevo nombre");
                                    metodosPacientes.getInstancia().modificarNombre(paciente, NombreIdNuevo, idNuevo);
                                   JOptionPane.showMessageDialog(null,"Se guardaron los cambios");
                                   JOptionPane.showInputDialog(null,metodosPacientes.getInstancia().imprimirListaNombre(paciente,idNuevo));
                                }else  {
                                    JOptionPane.showMessageDialog(null,"No existe un registro coneste numero de identificacion");
                                }
                                break;    
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                        }
                        
                        
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                }
                break;
            case 2:
                 int opcionMedico;
                 opcionMedico= Integer.parseInt(JOptionPane.showInputDialog("1.-Registrar Medico\n 2.-Consultar Medico\n3.-Modificar Medico\n4.-Eliminar Medico\n5.-Atras"));
                 switch(opcionMedico){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                }
                break;
            case 3: 
                int opcionHistorial;
                opcionHistorial= Integer.parseInt(JOptionPane.showInputDialog("1.-Registrar Historial\n 2.-Consultar Historial\n3.-Modificar Historial\n4.-Eliminar Historial\n5.-Atras"));
                switch(opcionHistorial){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                }
                break;
        
        }
        
    }while(opcion != 4);
    
}
}
