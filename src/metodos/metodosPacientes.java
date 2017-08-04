package metodos;

import hospital.Paciente;
import java.util.ArrayList;
public class metodosPacientes  {
    private static metodosPacientes instancia;
    public static metodosPacientes getInstancia(){
        if (instancia == null) {
            instancia = new metodosPacientes();
        }
        return instancia;
    }
    
    public  void registrarPaciente(ArrayList<Paciente> lista,Paciente paciente ){
         lista.add(paciente);
         
    }
    
   public  int busquedaSecuencialIdentificacion(ArrayList<Paciente> arreglo, int id){
        
        for (int i = 0; i < arreglo.size(); i++) {
            if (id == arreglo.get(i).getId()) {
                return i;
                
            }
        }
        return -1;
    }
    
    public int busquedaSecuencialNombre(ArrayList<Paciente> arreglo,String nombre){
        
        for (int i = 0; i < arreglo.size(); i++) {
            if (arreglo.get(i).getNombre().equals(nombre)) {
                return i;
                
            }
        }
        return -1;
    }
    public  int busquedaSecuencialEdad(ArrayList<Paciente> arreglo, int id){
        
        for (int i = 0; i < arreglo.size(); i++) {
            if (id == arreglo.get(i).getId()) {
                return i;
                
            }
        }
        return -1;
    }
    
    public String imprimirListaID(ArrayList<Paciente>lista, int id){
        String result ="";
        for (int i = 0; i < lista.size(); i++) {
             if (lista.get(i).getId() == id) {
                 result += lista.get(i).toString();
            
            }
           
            
        }
        return result;
    }
    
    public void modificar(ArrayList<Paciente>lista,int id1,int id2){
        lista.get(id1).setId(id2);
        
    }
    
    public int busquedaSecuencialNombreId(ArrayList<Paciente> arreglo,String nombre){
        
        for (int i = 0; i < arreglo.size(); i++) {
            if (arreglo.get(i).getNombre().equals(nombre)) {
                return i;
                
            }
        }
        return -1;
    }
    
    public void modificarNombre(ArrayList<Paciente>lista,int id1,String nombre){
        lista.get(id1).setNombre(nombre);
        
    }
    
    
     public String imprimirListaNombre(ArrayList<Paciente>lista, String nombre){
        String result ="";
        for (int i = 0; i < lista.size(); i++) {
             if (lista.get(i).getNombre().equals(nombre)) {
                 result += lista.get(i).toString();
            
            }
           
            
        }
        return result;
    }
     public String imprimirLista(ArrayList<Paciente>lista){
        String result ="";
        for (int i = 0; i < lista.size(); i++) {
            result += lista.get(i).toString();
            
            
        }
        return result;
    }
    
}

    
   
    
    
    
