import java.util.Scanner;

public class MainPalabraInversa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario.
        PalabraInversa plbr = new PalabraInversa(); // Crear un objeto PalabraInversa.

        // Solicitar al usuario que ingrese una palabra.
        System.out.println("Ingresa una palabra");
        plbr.setPalabra(sc.nextLine()); // Leer la palabra ingresada por el usuario y establecerla en el objeto PalabraInversa.

        plbr.mostrarPalabraInversa(); // Mostrar la palabra invertida.

        System.out.println(plbr); // Imprimir la representación en cadena del objeto PalabraInversa.
    }
}
