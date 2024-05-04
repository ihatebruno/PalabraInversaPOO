import java.util.Scanner;

public class MainPalabraInversa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalabraInversa plbr = new PalabraInversa();

        System.out.println("Ingresa una palabra");

        plbr.setPalabra(sc.nextLine());

        plbr.mostrarPalabraInversa(); 

        System.out.println(plbr);

    }
}