import java.util.Arrays;

public class Ahorcado {
    private String[] palabraGuiones;
    private String[] palabraAdivinarArray;
    private int intentos;
    private String palabraAdivinar;
    private Diccionario diccionario = new Diccionario();

    public Ahorcado(int intentos) {
        this.intentos = intentos;
        this.palabraAdivinar = this.diccionario.getPalabraAleatoria();
        this.palabraAdivinarArray = this.palabraAdivinar.split("");
        this.conversionAdivinarGuiones();
    }

    public void conversionAdivinarGuiones() {
        this.palabraGuiones = new String[this.palabraAdivinar.length()];
        for(int i = 0; i < palabraAdivinar.length(); i++) {
            this.palabraGuiones[i] = "_";
            /* Arrays.fill(palabraGuiones, "_"); // Esto sustituye al bucle de arriba
             import java.util.Arrays; */ // <-- Hay que poner arriba esto para que funcione Arrays.fill()
        }
    }

    public int restarIntentos() {
        
        return intentos-= 1;
    }

    public boolean letraAcertada(char letraIntroducida) {
        String letra = Character.toString(letraIntroducida);
        for ( int i = 0; i < this.palabraAdivinar.length(); i++ ) {
            if (Character.toString(this.palabraAdivinar.charAt(i)).equalsIgnoreCase(letra)) {
                return true;
            }
        }
        return false;
    }

    public boolean comprobarVictoria() {
        for (int i = 0; i < this.palabraGuiones.length; i++) {
            if (this.palabraGuiones[i].equalsIgnoreCase("_")) {
                return false;
            }
        }
        return true;
    }

    public void sustituirGuionLetra(char letraIntroducida) {
        String letra = Character.toString(letraIntroducida);
        for (int i = 0; i < this.palabraAdivinar.length(); i++) {
            if( this.palabraAdivinarArray[i].equalsIgnoreCase(letra) ) {
                palabraGuiones[i] = letra;
            }
        }
    }

    public boolean sinIntentos() {
        if( intentos == 0 ) {
            return true;
        }
        return false;
    }

    public void imprimirCosas() {
        for ( int i = 0; i < palabraGuiones.length; i++ ) {
            System.out.print(this.palabraGuiones[i]);
        }
        System.out.println();
    }

    public int contadorVidas(int intentos) {
        System.out.println("Le quedan " + intentos);
        return intentos;
    }
}
