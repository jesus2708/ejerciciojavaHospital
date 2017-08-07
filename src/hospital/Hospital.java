package hospital;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import metodos.metodosHistorial;
import metodos.metodosMedicos;
import metodos.metodosPacientes;

public class Hospital {

    public static void main(String[] args) {
        int opcion = 0;
        ArrayList<Paciente> paciente = new ArrayList<>();
        ArrayList<Medico> medico = new ArrayList<>();
        ArrayList<HistorialClinico> historial = new ArrayList<>();
        
        do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog("1.-Gestionar Pacientes.\n 2.-Gestionar Medicos\n3.-Gestionar Historial Clinico\n4.-Salir"));
        switch (opcion){
            case 1://pasiente

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
                                
                                 JOptionPane.showMessageDialog(null,metodosPacientes.getInstancia().imprimirListaID(paciente,idBusqueda));
                            }else  {
                                JOptionPane.showMessageDialog(null,"No existe un registro con esta opcion");
                            }
                         
                         
                        }
                        if (opcionBusqueda == 2) {
                            String nombreBusqueda = JOptionPane.showInputDialog("Ingrese el nombre a buscar ");
                            int resultadoBusquedanombre= metodosPacientes.getInstancia().busquedaSecuencialNombre(paciente, nombreBusqueda);
                            if (resultadoBusquedanombre != -1) {
                                
                                JOptionPane.showMessageDialog(null,metodosPacientes.getInstancia().imprimirListaNombre(paciente,nombreBusqueda));
                            }else  {
                                JOptionPane.showMessageDialog(null,"No existe un registro con esta opcion");
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
                                    JOptionPane.showMessageDialog(null,metodosPacientes.getInstancia().imprimirListaID(paciente,idNuevo));
                                }else  {
                                    JOptionPane.showMessageDialog(null,"No existe un registro con esta opcion");
                                }       
                                break;
                            case 2:
                                String idNombre=JOptionPane.showInputDialog("Ingrese el nombre a modificar");
                                int NombreIdNuevo = metodosPacientes.getInstancia().busquedaSecuencialNombreId(paciente, idNombre);
                                if (NombreIdNuevo != -1) {
                                    String idNuevo = JOptionPane.showInputDialog("Ingresa el nuevo nombre");
                                    metodosPacientes.getInstancia().modificarNombre(paciente, NombreIdNuevo, idNuevo);
                                    JOptionPane.showMessageDialog(null,"Se guardaron los cambios");
                                    JOptionPane.showMessageDialog(null,metodosPacientes.getInstancia().imprimirListaNombre(paciente,idNuevo));
                                }else  {
                                    JOptionPane.showMessageDialog(null,"No existe un registro con esta opcion");
                                }
                                break;    
                            
                            
                        }
                        
                        
                        break;
                    case 4://Eliminar
                        JOptionPane.showMessageDialog(null,metodosPacientes.getInstancia().imprimirLista(paciente));
                                int ideliminar=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a eliminar"));
                                int posicionIdeliminar = metodosPacientes.getInstancia().busquedaSecuencialIdentificacion(paciente, ideliminar);
                                if (posicionIdeliminar != -1) {
                                    //String idNuevo = JOptionPane.showInputDialog("Ingresa el nuevo nombre");
                                    metodosPacientes.getInstancia().Eliminar(paciente,posicionIdeliminar);
                                    JOptionPane.showMessageDialog(null,"Se elimino el registro");
                                    JOptionPane.showMessageDialog(null, metodosPacientes.getInstancia().imprimirLista(paciente));
                                }else  {
                                    JOptionPane.showMessageDialog(null,"No existe un registro con esta opcion");
                                }
                        break;
                }
                break;
            case 2://medico
                 int opcionMedico;
                 opcionMedico= Integer.parseInt(JOptionPane.showInputDialog("1.-Registrar Medico\n 2.-Consultar Medico\n3.-Modificar Medico\n4.-Eliminar Medico\n5.-Atras"));
                 switch(opcionMedico){
                    case 1://insertar
                        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del medico"));
                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del medico");
                        String apellidos = JOptionPane.showInputDialog("Ingrese los apellidos del medico");
                        String especialidad = JOptionPane.showInputDialog("Ingrese la especialidad del medico");
                        metodosMedicos.getInstancia().registrarPaciente(medico,new Medico(id,nombre,apellidos,especialidad));
                        JOptionPane.showMessageDialog(null,"Se inserto correctamente");
                        break;
                    case 2://Buscar
                        int opcionBusqueda = Integer.parseInt(JOptionPane.showInputDialog("1.- Busqueda por ID\n 2 Busqueda por Nombre"));
                        if (opcionBusqueda == 1) {
                            int idBusqueda=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a buscar"));
                            int resultadoBusquedaId= metodosMedicos.getInstancia().busquedaSecuencialIdentificacion(medico, idBusqueda);
                            if (resultadoBusquedaId != -1) {
                                
                                JOptionPane.showMessageDialog(null,metodosMedicos.getInstancia().imprimirListaID(medico,idBusqueda));
                            }else  {
                                JOptionPane.showMessageDialog(null,"No existe un registro con esta opcion");
                            }
                         
                         
                        }
                        if (opcionBusqueda == 2) {
                            String nombreBusqueda = JOptionPane.showInputDialog("Ingrese el nombre a buscar ");
                            int resultadoBusquedanombre= metodosMedicos.getInstancia().busquedaSecuencialNombre(medico, nombreBusqueda);
                            if (resultadoBusquedanombre != -1) {
                                
                                JOptionPane.showMessageDialog(null,metodosMedicos.getInstancia().imprimirListaNombre(medico,nombreBusqueda));
                            }else  {
                                JOptionPane.showMessageDialog(null,"No existe un registro con esta opcion");
                            }
                            

                        }
                        break;
                    case 3://modificar
                        int OpcionModificar=Integer.parseInt(JOptionPane.showInputDialog("Elija el dato que desea modificar\n1.-Id\n2.-Nombre\n3.-Eliminar\n4.-Atras"));
                       
                        switch(OpcionModificar){
                            case 1:
                                int idCambiar=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a modificar"));
                                int posicionId = metodosMedicos.getInstancia().busquedaSecuencialIdentificacion(medico, idCambiar);
                                if (posicionId != -1) {
                                    int idNuevo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el nuevo id"));
                                    metodosMedicos.getInstancia().modificar(medico, posicionId, idNuevo);
                                    JOptionPane.showMessageDialog(null,"Se guardaron los cambios");
                                    JOptionPane.showMessageDialog(null,metodosMedicos.getInstancia().imprimirListaID(medico,idNuevo));
                                }else  {
                                    JOptionPane.showMessageDialog(null,"No existe un registro con esta opcion");
                                }
                                break;
                            case 2:
                                String idNombre=JOptionPane.showInputDialog("Ingrese el nombre a modificar");
                                int NombreIdNuevo = metodosMedicos.getInstancia().busquedaSecuencialNombreId(medico, idNombre);
                                if (NombreIdNuevo != -1) {
                                    String idNuevo = JOptionPane.showInputDialog("Ingresa el nuevo nombre");
                                    metodosMedicos.getInstancia().modificarNombre(medico, NombreIdNuevo, idNuevo);
                                    JOptionPane.showMessageDialog(null,"Se guardaron los cambios");
                                    JOptionPane.showMessageDialog(null,metodosMedicos.getInstancia().imprimirListaNombre(medico,idNuevo));
                                }else  {
                                    JOptionPane.showMessageDialog(null,"No existe un registro con esta opcion");
                                }
                                break;    
                        }
                        break;
                    case 4://eliminar
                        JOptionPane.showMessageDialog(null,metodosMedicos.getInstancia().imprimirLista(medico));
                                int ideliminar=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a eliminar"));
                                int posicionIdeliminar = metodosMedicos.getInstancia().busquedaSecuencialIdentificacion(medico, ideliminar);
                                if (posicionIdeliminar != -1) {
                                    //String idNuevo = JOptionPane.showInputDialog("Ingresa el nuevo nombre");
                                    metodosMedicos.getInstancia().Eliminar(medico,posicionIdeliminar);
                                    JOptionPane.showMessageDialog(null,"Se elimino el registro");
                                    JOptionPane.showMessageDialog(null, metodosMedicos.getInstancia().imprimirLista(medico));
                                }else  {
                                    JOptionPane.showMessageDialog(null,"No existe un registro con esta opcion");
                                }
                        break;
                }
                break;
            case 3: //historial
                int opcionHistorial;
                opcionHistorial= Integer.parseInt(JOptionPane.showInputDialog("1.-Registrar Historial\n 2.-Consultar Historial\n3.-Modificar Historial\n4.-Eliminar Historial\n5.-Atras"));
                switch(opcionHistorial){
                    case 1://insertar
                        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del historial"));
                        String fecha = JOptionPane.showInputDialog("Ingrese la fecha");
                        JOptionPane.showMessageDialog(null,metodosPacientes.getInstancia().imprimirLista(paciente));
                        int IdPasiente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id pasiente"));
                        int resultadoBusquedaId= metodosPacientes.getInstancia().busquedaSecuencialIdentificacion(paciente, IdPasiente);
                        JOptionPane.showMessageDialog(null,metodosMedicos.getInstancia().imprimirLista(medico));
                        int IdMedico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del medico"));
                        String observaciones = JOptionPane.showInputDialog("Ingrese las observaciones");
                        int resultadoBusquedaId2= metodosMedicos.getInstancia().busquedaSecuencialIdentificacion(medico, IdPasiente);
                        //System.out.println(resultadoBusquedaId);
                        if (resultadoBusquedaId != -1 && resultadoBusquedaId2 != -1) {
                            JOptionPane.showMessageDialog(null,metodosHistorial.getInstancia().imprimirListaID(historial,resultadoBusquedaId));
                            metodosHistorial.getInstancia().registrarHistorial(historial,new HistorialClinico(codigo,fecha,IdPasiente,IdMedico,observaciones));
                            JOptionPane.showMessageDialog(null,"Se inserto correctamente");
                            JOptionPane.showMessageDialog(null,metodosHistorial.getInstancia().imprimirLista(historial));
                            }else{
                            JOptionPane.showMessageDialog(null,"No existe un registro con esta opcion");
                        }
                        break;
                    case 2://buscar
                        JOptionPane.showMessageDialog(null, "Busqueda por codigo");
                        int idBusqueda=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a buscar"));
                        int resultadoBusquedaHistorial= metodosHistorial.getInstancia().busquedaSecuencialIdentificacion(historial, idBusqueda);
                            if (resultadoBusquedaHistorial != -1) {
                                JOptionPane.showMessageDialog(null,metodosHistorial.getInstancia().imprimirLista(historial));
                            }else  {
                                JOptionPane.showMessageDialog(null,"No existe un registro con esta opcion");
                            }
                         
                         
                        
                        break;
                    case 3://modificar
                        int OpcionModificar=Integer.parseInt(JOptionPane.showInputDialog("Elija el dato que desea modificar\n1.-Codigo\n2.-Fecha\n3.-IdPaciente\n4.-IdMedico\n5.-Atras"));
                       switch(OpcionModificar){
                            case 1://codigo
                                int idCambiar=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a modificar"));
                                int posicionId = metodosHistorial.getInstancia().busquedaSecuencialIdentificacion(historial, idCambiar);
                                if (posicionId != -1) {
                                    int idNuevo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el nuevo id"));
                                    metodosHistorial.getInstancia().modificarCodigo(historial, posicionId, idNuevo);
                                    JOptionPane.showMessageDialog(null,"Se guardaron los cambios");
                                    JOptionPane.showMessageDialog(null,metodosHistorial.getInstancia().imprimirListaID(historial,idNuevo));
                                }else  {
                                    JOptionPane.showMessageDialog(null,"No existe un registro con esta opcion");
                                }
                                break;
                            case 2://fecha
                                String idNombre=JOptionPane.showInputDialog("Ingrese la fecha a modificar");
                                int NombreIdNuevo = metodosHistorial.getInstancia().busquedaSecuencialNombre(historial, idNombre);
                                if (NombreIdNuevo != -1) {
                                    String idNuevo = JOptionPane.showInputDialog("Ingresa la nueva fecha");
                                    metodosHistorial.getInstancia().modificarFecha(historial, NombreIdNuevo, idNuevo);
                                    JOptionPane.showMessageDialog(null,"Se guardaron los cambios");
                                    JOptionPane.showMessageDialog(null,metodosHistorial.getInstancia().imprimirListaFecha(historial,idNuevo));
                                }else  {
                                    JOptionPane.showMessageDialog(null,"No existe un registro con esta opcion");
                                }
                                break;  
                            case 3://idPasiente
                                int idpaciente=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del pasiente"));
                                int posicionIdPaciente = metodosHistorial.getInstancia().busquedaSecuencialIdentificacion(historial, idpaciente);
                                if (posicionIdPaciente != -1) {
                                    int idNuevo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el nuevo id del pasiente"));
                                    metodosHistorial.getInstancia().modificarIdPaciente(historial, posicionIdPaciente, idNuevo);
                                    JOptionPane.showMessageDialog(null,"Se guardaron los cambios");
                                    JOptionPane.showMessageDialog(null,metodosHistorial.getInstancia().imprimirListaID(historial,idNuevo));
                                }else  {
                                    JOptionPane.showMessageDialog(null,"No existe un registro con esta opcion");
                                }
                                break;
                                case 4://IdMedico
                                int idMedico=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del medico a modficar"));
                                int posicionIdMedico = metodosHistorial.getInstancia().busquedaSecuencialIdentificacion(historial, idMedico);
                                if (posicionIdMedico != -1) {
                                    int idNuevo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el nuevo id del medico"));
                                    metodosHistorial.getInstancia().modificarIdMedico(historial, posicionIdMedico, idNuevo);
                                    JOptionPane.showMessageDialog(null,"Se guardaron los cambios");
                                    JOptionPane.showMessageDialog(null,metodosHistorial.getInstancia().imprimirListaID(historial,idNuevo));
                                }else  {
                                    JOptionPane.showMessageDialog(null,"No existe un registro con esta opcion");
                                }
                                break;
                        }
                        break;
                    case 4://eliminar
                        JOptionPane.showMessageDialog(null,metodosHistorial.getInstancia().imprimirLista(historial));
                            int ideliminar=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a eliminar del historial"));
                            int posicionIdeliminar = metodosHistorial.getInstancia().busquedaSecuencialIdentificacion(historial, ideliminar);
                            if (posicionIdeliminar != -1) {
                                metodosHistorial.getInstancia().Eliminar(historial,posicionIdeliminar);
                                JOptionPane.showMessageDialog(null,"Se elimino el registro");
                                JOptionPane.showMessageDialog(null, metodosHistorial.getInstancia().imprimirLista(historial));
                                }else  {
                                    JOptionPane.showMessageDialog(null,"No existe un registro con esta opcion");
                                }
                        break;
                    
                }
                break;
        
        }
        
    }while(opcion != 4);
    
}
}
