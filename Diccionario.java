public class Diccionario { // Siempre clase publica. Clase principal
    private String[] diccionarioPalabras = {"Paco", "Jaime", "Rafael", "Gilipienso"}; // Esto son variables de instancia de la clase

    public String getPalabraAleatoria() {   // Esto es un método (Acciones que hace la clase)
         return this.diccionarioPalabras[(int) (Math.random() * this.diccionarioPalabras.length)];
        /*  Aqui estamos casteando el Math.random a un entero para que no coja decimales. */

    }
}



/*
    public Diccionario(String[] diccionarioPalabras) { // Esto es un constructor
        this.diccionarioPalabras = diccionarioPalabras;
    }
    */