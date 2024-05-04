public class PalabraInversa {

    
    private String palabra;
    private String palabraInversa;
    
    
    public void mostrarPalabraInversa() {
        palabraInversa = obtenerPalabraInversa(); 
    }
    
    private String obtenerPalabraInversa() {
        StringBuilder sb = new StringBuilder(palabra);
        return sb.reverse().toString(); 
    }

    public String getPalabra() {
        return palabra;
    }
    
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
    
    public String getPalabraInversa() {
        return palabraInversa;
    }
    
    public void setPalabraInversa(String palabraInversa) {
        this.palabraInversa = palabraInversa;
    }
    @Override
    public String toString() {
        return "PalabraInversa [Palabra Original=" + palabra + ", Palabra Inversa=" + palabraInversa + "]";
    }
}