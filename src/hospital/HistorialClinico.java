package hospital;
public class HistorialClinico {
    
    private int codigo;
    private String fecha;
    private int idPaciente;
    private int idMedico;
    private String observaciones;

    public HistorialClinico(int codigo, String fecha, int idPaciente, int idMedico, String observaciones) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
        this.observaciones = observaciones;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
//        String cadena = "";
//        cadena = String.format("%s %s", cadena, cadena);
        return "HistorialClinico\n" + "Codigo=" + codigo + "\nFecha=" + fecha + "\nidPaciente=" + idPaciente + "\nidMedico=" + idMedico + "\nObservaciones=" + observaciones ;
    }

    
    
}

