import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ahorcado arc = new Ahorcado(6);
        Menu menu = new Menu();
        char letraIntroducida;

        menu.PintarMenu(4);

        while ( !arc.sinIntentos() && !arc.comprobarVictoria() ) {
            arc.contadorVidas(6);
            System.out.println("Introduzca letra");
            arc.imprimirCosas();

            letraIntroducida = sc.next().charAt(0);
            if ( arc.letraAcertada(letraIntroducida) ) {
                System.out.println("Correcto. Has acertado la letra");
                arc.sustituirGuionLetra(letraIntroducida);
            }
            else {
                System.out.println("Has fallado! Prueba de nuevo");
                arc.restarIntentos();
            }
            arc.comprobarVictoria();
        }

    }
}

