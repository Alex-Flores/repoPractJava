package encapsulamiento;

public class Encapsulamiento {
    //psvm - esto es lo mismo que abajo
    public static void main(String[] args) {
        Alumno alu = new Alumno ();
        Alumno alu2 = new Alumno (15,"Suscribete", "Todo Code");
        
        System.out.println("id: " + alu2.getId());
        System.out.println("id: " + alu2.getNombre());
        System.out.println("id: " + alu2.getApellido());
    }
}
