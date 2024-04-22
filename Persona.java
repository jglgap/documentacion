/** 
 * Class that defines the attributes that a person has
 * @author JGLGAP 
*/


public class Persona {

    private String nombre;
    private int edad;
/**
 * Constructor of Persona 
 * Always define the attributes of a person 
 * because there isn't an empty constructor 
 */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
/**
 * this methotd @return the value of the variable nombre
 */
    public String getNombre() {
        return nombre;
    }
/**
 * this methotd stablishes a value for the Nombre 
 * @param is the value that will be set for the nombre
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * this method @return the value of the variable thats set for 
 * the variable edad
 */
    public int getEdad() {
        return edad;
    }
/**
 * this method stablishes a value for edad
 * @param introduced sets the value for the variable edad
 */
    public void setEdad(int edad) {
        this.edad = edad;
    }
/**
 * the method will work as a toString
 * but dont return nothing just print 
 * a phrase follow by the calues of the variables nombre and edad
 */
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
