package logica;

public class Herencia {
    
    public static void main(String[] args) {
        /*
        Ejemplos de herencia
        Empleado emple = new Empleado();
        emple.getNum_legajo();
        emple.getNombre();
        
        Consultor consul = new Consultor();
        consul.getNombre();
        
        
        Ejemplo mal de vectores
        String vector[] = new String[3];
        vector[0] = 1;
        */
        
        //EJEMPLOS DE POLIMORFISMO
        //permite que en un vector de la clase padre pueda guardar distintos tipos que pertenescan a la clase hija
        Persona vector[] = new Persona [5];
        vector [0] = new Persona (); // Clase Padre
        vector [1] = new Empleado (); // Clase Hija
        vector [2] = new Consultor (); // Clase Hija
        vector [3] = new Jefe (); // Clase Hija
        //error: vector [4] = "Hola";
        
        Persona perso = new Persona ();
        Consultor consul = new Consultor ();
        perso = consul;
        //error: consul = perso;
    }
 
}
