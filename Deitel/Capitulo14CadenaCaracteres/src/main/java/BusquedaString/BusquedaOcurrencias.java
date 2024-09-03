package BusquedaString;

public class BusquedaOcurrencias {
    
    //Metodo 1
    private void countChar(String text)
    
    {
    int i, length, counter[] = new int[256];

    length = text.length();
    for(i=0;i<length;i++){
        counter[text.charAt(i)]++;
    }
    
    for (i=0; i<256; i++){
        if(counter[i] != 0)
            System.out.println((char)i + ": "+counter[i]);
    }
    
}
    //Metodo 2
    private void contarOcurrenciasLetras(String texto) {
    // Convertir el texto a minúsculas para considerar insensibilidad a mayúsculas/minúsculas
    texto = texto.toLowerCase();

    // Arreglo para almacenar el número de ocurrencias de cada letra del alfabeto
    int[] contadorLetras = new int[26]; // 26 letras en el alfabeto inglés

    // Definir el alfabeto
    String alfabeto = "abcdefghijklmnopqrstuvwxyz";

    // Contar las ocurrencias de cada letra en el texto usando indexOf
    for (int i = 0; i < alfabeto.length(); i++) {
        char letra = alfabeto.charAt(i);
        int index = texto.indexOf(letra);
        while (index != -1) {
            contadorLetras[i]++;
            index = texto.indexOf(letra, index + 1);
        }
    }

    // Imprimir los totales para cada letra en formato tabular
    System.out.println("Letra \t Total");
    for (int i = 0; i < 26; i++) {
        char letra = (char) ('a' + i);
        System.out.println(letra + " \t " + contadorLetras[i]);
    }
}
    
    
    public static void main (String[] args)
    {
         BusquedaOcurrencias app = new BusquedaOcurrencias();
        
         app.contarOcurrenciasLetras("Elefante");
         System.out.println("--------------------------------------------------------------------");
         app.countChar("papaya");
        
    }
}
