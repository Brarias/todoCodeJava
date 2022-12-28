
package Logica;


public class POO {

    public static void main(String[] args){
        
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno(5, "Braian", "Arias");
        
        alumno1.setId(10);
        alumno1.setNombre("Jorge");
        alumno1.setApellido("Montoto");
        
        System.out.println("La id del alumno 2 es: " + alumno2.getId());
        System.out.println("El nombre es: " + alumno2.getNombre());
        System.out.println("El apellido es: " +  alumno2.getApellido());
        
        System.out.println("*********************");
        
        System.out.println("La id del alumno 1 es: " + alumno1.getId());
        System.out.println("El nombre es: " + alumno1.getNombre());
        System.out.println("El apellido es: " +  alumno1.getApellido());
        
    }
}
