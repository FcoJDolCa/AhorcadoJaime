public class Menu {
    // Aqui van las variables de instancia de la clase
    private int opciones;

    // Aqui va el constructor
    public Menu() {

    }

    // Aqui van los métodos de la clase
    public int OpcionesMenuPrincipal() {
        switch (opciones) {
            case 1:
        }
        return 6;
    }

    public void Bienvenida() {
        System.out.println("Bienvenido al juego del ahoracado. Pase y diviértase!");
    }

    public void PintarMenu(int opciones) {
        this.opciones = opciones;
        System.out.println("Seleccione opción: ");
        System.out.println("[1] Introduzca nombre de jugador");
        System.out.println("[2] Jugar ahorcado");
        System.out.println("[3] Seleccionar nivel de dificultad");

    }

    public void op1IntroducirNombre() {}

    public void op2SeleccionDificultad() {}

    public void op3VerPuntuaciones() {}

    public void op4Jugar() {}
}
