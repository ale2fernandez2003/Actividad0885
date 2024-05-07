
/**
 * Write a description of class Actividad0885 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Actividad0885
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Actividad0885
     */
    public Actividad0885()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String darleVueltaAPalabraAlternativamente (String nombre, int num)
    {
        if (nombre == null) {
            return null;
        }
        
        if (nombre.isEmpty()) {
            return "";
        }
        
        String resultado = "";
        boolean invertido = true;
        for (int i = 0; i < num; i++) {
            if (invertido) {
                for (int j = nombre.length() - 1; j >= 0; j--) {
                    resultado += nombre.charAt(j);
                }
                invertido = false;
            } else {
                resultado += nombre;
                invertido = true;
            }
        }
        
        return resultado;
    }
}
