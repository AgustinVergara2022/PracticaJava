package EnunciadosAleatorios;

import java.util.Random;

public class EnunciadosAleatorios {
    public static void main (String[] args)
    {
        
        String[] articulo = {"el", "un", "algun", "ningun"};
        String[] sustantivo = {"joven", "chico", "perro", "gato", "auto"};
        String[] verbo = {"manejo", "salto", "corrio", "camino", "vino"};
        String[] preposicion = {"a", "desde", "encima de", "debajo de", "sobre"};
        
        Random random = new Random();
        
        for(int i=0;i<20;i++){
        int indiceAleatorio = random.nextInt(articulo.length);
        String articuloSeleccionado = articulo[indiceAleatorio];
        indiceAleatorio = random.nextInt(sustantivo.length);
        String sustantivoSeleccionado = sustantivo[indiceAleatorio];
        indiceAleatorio = random.nextInt(verbo.length);
        String verboSeleccionado = verbo[indiceAleatorio];
        indiceAleatorio = random.nextInt(preposicion.length);
        String preposicionSeleccionado = preposicion[indiceAleatorio];
        indiceAleatorio = random.nextInt(articulo.length);
        String articulo2Seleccionado = articulo[indiceAleatorio];
        indiceAleatorio = random.nextInt(sustantivo.length);
        String sustantivo2Seleccionado = sustantivo[indiceAleatorio];
        
        
        System.out.printf("%s %s %s %s %s %s%n",articuloSeleccionado,sustantivoSeleccionado,verboSeleccionado,preposicionSeleccionado,articulo2Seleccionado,sustantivo2Seleccionado);
        }
        
        
        
    }
}
