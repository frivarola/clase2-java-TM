import Ejercicio3.Libro;

public class Main {

    public static void main(String[] args) {
        Libro l1 = new Libro();
        Libro l2 = new Libro("Harry Potter", "9780545582889", "Rownling, J.K.");

        System.out.println(l1.toString());
        System.out.println(l2.toString());
    }
}
