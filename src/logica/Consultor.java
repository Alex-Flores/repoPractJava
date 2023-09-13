package logica;

public class Consultor extends Persona{
    String nombre_consultor;
    int num_consultora;

    public Consultor() {
    }

    public Consultor(String nombre_consultor, int num_consultora) {
        this.nombre_consultor = nombre_consultor;
        this.num_consultora = num_consultora;
    }

    public Consultor(String nombre_consultor, int num_consultora, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.nombre_consultor = nombre_consultor;
        this.num_consultora = num_consultora;
    }

    public String getNombre_consultor() {
        return nombre_consultor;
    }

    public void setNombre_consultor(String nombre_consultor) {
        this.nombre_consultor = nombre_consultor;
    }

    public int getNum_consultora() {
        return num_consultora;
    }

    public void setNum_consultora(int num_consultora) {
        this.num_consultora = num_consultora;
    }
    
    
}
