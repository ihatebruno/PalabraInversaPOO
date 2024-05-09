public class PalabraInversa {
    private String palabra; // Variable para almacenar la palabra original.
    private String palabraInversa; // Variable para almacenar la palabra invertida.

    // Método para mostrar la palabra inversa.
    public void mostrarPalabraInversa() {
        palabraInversa = obtenerPalabraInversa(); // Obtener la palabra inversa.
    }
    
    // Método privado para obtener la palabra inversa.
    private String obtenerPalabraInversa() {
        StringBuilder sb = new StringBuilder(palabra); // Crear un StringBuilder con la palabra original.
        return sb.reverse().toString(); // Invertir la palabra y convertirla a String.
    }

    // Métodos getter y setter para la palabra original.
    public String getPalabra() {
        return palabra;
    }
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    // Métodos getter y setter para la palabra inversa.
    public String getPalabraInversa() {
        return palabraInversa;
    }
    public void setPalabraInversa(String palabraInversa) {
        this.palabraInversa = palabraInversa;
    }

    // Método toString para representar el objeto PalabraInversa como una cadena de texto.
    @Override
    public String toString() {
        return "PalabraInversa [Palabra Original=" + palabra + ", Palabra Inversa=" + palabraInversa + "]";
    }
}
