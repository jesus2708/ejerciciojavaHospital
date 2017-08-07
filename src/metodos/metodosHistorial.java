package metodos;

import hospital.HistorialClinico;
import hospital.Medico;
import java.util.ArrayList;

public class metodosHistorial {
    private static metodosHistorial instancia;
    public static metodosHistorial getInstancia(){
        if (instancia == null) {
            instancia = new metodosHistorial();
        }
        return instancia;
    }
    
    public  void registrarHistorial(ArrayList<HistorialClinico> lista,HistorialClinico medico ){
         lista.add(medico);
         
    }
    
   public  int busquedaSecuencialIdentificacion(ArrayList<HistorialClinico> arreglo, int id){
        
        for (int i = 0; i < arreglo.size(); i++) {
            if (id == arreglo.get(i).getCodigo()) {
                return i;
                
            }
        }
        return -1;
    }
   public int busquedaSecuencialNombre(ArrayList<HistorialClinico> arreglo,String nombre){
        
        for (int i = 0; i < arreglo.size(); i++) {
            if (arreglo.get(i).getFecha().equals(nombre)) {
                return i;
                
            }
        }
        return -1;
    }
   
    public String imprimirListaID(ArrayList<HistorialClinico>lista, int id){
        String result ="";
        for (int i = 0; i < lista.size(); i++) {
             if (lista.get(i).getCodigo() == id) {
                 result += lista.get(i).toString();
            
            }
           
            
        }
        return result;
    }
    
    public String imprimirListaFecha(ArrayList<HistorialClinico>lista, String id){
        String result ="";
        for (int i = 0; i < lista.size(); i++) {
             if (lista.get(i).getFecha() == id) {
                 result += lista.get(i).toString();
            
            }
           
            
        }
        return result;
    }
    
    public void modificarCodigo(ArrayList<HistorialClinico>lista,int id1,int id2){
        lista.get(id1).setCodigo(id2);
        
    }
    public void modificarFecha(ArrayList<HistorialClinico>lista,int id1,String id2){
        lista.get(id1).setFecha(id2);
        
    }
    public void modificarIdPaciente(ArrayList<HistorialClinico>lista,int id1,int id2){
        lista.get(id1).setIdPaciente(id2);
        
    }
    public void modificarIdMedico(ArrayList<HistorialClinico>lista,int id1,int id2){
        lista.get(id1).setIdMedico(id2);
        
    }
    public void modificarObservaciones(ArrayList<HistorialClinico>lista,int id1,String id2){
        lista.get(id1).setObservaciones(id2);
        
    }
    
    public String imprimirLista(ArrayList<HistorialClinico>lista){
        String result ="";
        for (int i = 0; i < lista.size(); i++) {
            result += lista.get(i).toString();
            
            
        }
        return result;
    }
    
    public void Eliminar(ArrayList<HistorialClinico>lista,int id1){
        lista.remove(id1);
        
    }
    
}
