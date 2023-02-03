package ejemploarraylistaobjeto;

public class F1 {
    private String escuderia;
    private String modelo;
    private String piloto;
    private String escudero;
    
    public String getEscuderia() {
        return escuderia;
    }
    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    } 
    
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    } 
    
    public String getPiloto() {
        return piloto;
    }
    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }   
    
    public String getEscudero() {
        return escudero;
    }
    public void setEscudero(String escudero) {
        this.escudero = escudero;
    }  
    
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nEscuderia : ");
        sb.append(escuderia);
        sb.append("\nModelo: ");
        sb.append(modelo);
        sb.append("\nPiloto: ");
        sb.append(piloto);
        sb.append("\nEscudero: ");
        sb.append(escudero);    
        return sb.toString();        
        
    }
    
}
