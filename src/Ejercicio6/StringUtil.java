package Ejercicio6;


/**
 * ● public static int indexOfN(String s,char c,int n); Retorna la posición de la n-ésima
 * ocurrencia del carácter c dentro de s, o -1 si s no contiene a c. Por ejemplo, si s =
 * “John|Paul|George|Ringo”, c = ‘|’ y n=2, la función debe retornar la posicióon de la
 * segunda ocurrencia del carácter ‘|’ (pipe) dentro de la cadena s. Que, en este caso, es:
 *
 */

public class StringUtil {

    public static void main(String[] args) {
        int i = indexOfN("John|Paul|George|Ringo", '|', 2);
        System.out.println(i);
    }

    /**
     *  Idem LPAD, pero agregando caracteres a la derecha
     * @param s cadena
     * @param c char a agregar
     * @param n largo a completar
     * @return
     */
    public static String rpad (String s, char c, int n){

        while(s.length() < n){
            String ch = ""+c;
            s.concat(ch);
        }

        return s;
    }

    /**
     * Retorna una cadena idéntica a s pero sin espacios a la izquierda.
     * @param s cadena
     * @return cadena sin espacios a la izquierda
     */
    public static String ltrim(String s){
        while(s.indexOf(" ") == 0){
            s = s.substring(1);
        }
        return s;
    }

    /**
     * idem ltrim, pero sin espacios a la derecha.
     *
     * @param s cadena
     * @return cadena sin espacios a la derecha
     */
    public static String rtrim(String s){
        while(s.lastIndexOf(" ") == (s.length() - 1) ){
            s = s.substring(0, s.lastIndexOf(" ") - 1);
        }
        return s;
    }

    /**
     * Idem lpad, pero sin espacios a derecha ni izquierda.
     * @param s
     * @return s sin espacios a derecha ni izquierda
     */
    public static String trim(String s){
        s = ltrim(s);
        s = rtrim(s);

        return s;

    }

    /**
     * Retorna la posición de la n-ésima ocurrencia del carácter c dentro de s, o -1 si s no contiene a c.
     * Por ejemplo, si s = “John|Paul|George|Ringo”, c = ‘|’ y n=2, la función debe retornar la posicióon de la
     * segunda ocurrencia del carácter ‘|’ (pipe) dentro de la cadena s. Que, en este caso, es: 9.
     * @param s
     * @param c
     * @param n
     * @return
     */
    public static int indexOfN(String s, char c, int n){

        //String[] chars = s.split("");
        char[] chars = s.toCharArray();
        boolean eureka = false;
        int i = 0;
        int count = 0;
        while(!eureka && i < s.length()){
            if (chars[i] == c) {
                count++;
            }
            if(count == n){
                eureka = true;

            } else {
                i++;
            }

        }

        if(eureka)
            return i;

        return -1;
    }
}
