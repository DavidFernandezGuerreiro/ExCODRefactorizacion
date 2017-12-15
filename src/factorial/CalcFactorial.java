
package factorial;

/**
 *
 * @author dfernandezguerreiro
 */
public class CalcFactorial {
    int num;
    int factor;
    
    /**
     * Método para calcular el numero factorial.
     * @param numero Mediante el cual vamos a calcular el factorial.
     * @param factorial Es la variable que va tomar el valor del siguiente método.
     */

    public void calcFactorial(int numero, int factorial){
        num=8;
        
        int i;
        if (num == 0) {
            factor=1;
        } else {
            factor=1;
            for (i=num; i >= 1; i--) {
                factor=factor * i;
            }
        }
    }
}
