public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Metodos metodosOrdenamiento = new Metodos();
        int[] arreglo = {5, 7, 30, 12, 9};
        int[] arregloOrdenado = metodosOrdenamiento.sortByBubble(arreglo);
        System.out.println("  ***** Ascendente *****");
        metodosOrdenamiento.printArreglo(arregloOrdenado);
        System.out.println("  ");
        int[] arregloOrdenadoDesendente = metodosOrdenamiento.sortByBubbleDesendente(arreglo);
        System.out.println("  ***** Descendente *****");
        metodosOrdenamiento.printArreglo(arregloOrdenadoDesendente);
        System.out.println(" ");
        //----------------------------------------------------------
        //ORDENAR LAS PALABRAS ALFABETICAMENTE DE LA CADENA DE TEXTO
        System.out.println("***** Ordenamiento De Palabras *****");
        String cadena = "este es un ejemplo de texto para Ordenar";
        String[] palabras = cadena.split(" ");
        String[] palabrasOrdenadas = metodosOrdenamiento.sortByBubblePalabras(palabras);
        metodosOrdenamiento.printArregloString(palabrasOrdenadas);
    }
}
