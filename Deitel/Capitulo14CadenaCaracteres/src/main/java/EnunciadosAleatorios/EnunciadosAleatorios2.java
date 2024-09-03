package EnunciadosAleatorios;
import java.util.Random;

public class EnunciadosAleatorios2 {
    public static void main(String[] args) {
        String[] articulo = {"el", "un", "algún", "ningún"};
        String[] sustantivo = {"joven", "chico", "perro", "gato", "auto"};
        String[] verbo = {"manejo", "salto", "corrió", "caminó", "vino"};
        String[] preposicion = {"a", "desde", "encima de", "debajo de", "sobre"};

        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            String enunciado = generarEnunciado(articulo, sustantivo, verbo, preposicion, random);
            System.out.println(enunciado);
        }
    }

    public static String generarEnunciado(String[] articulo, String[] sustantivo, String[] verbo, String[] preposicion, Random random) {
        StringBuilder enunciado = new StringBuilder();

        enunciado.append(articulo[random.nextInt(articulo.length)]).append(" ");
        enunciado.append(sustantivo[random.nextInt(sustantivo.length)]).append(" ");
        enunciado.append(verbo[random.nextInt(verbo.length)]).append(" ");
        enunciado.append(preposicion[random.nextInt(preposicion.length)]).append(" ");
        enunciado.append(articulo[random.nextInt(articulo.length)]).append(" ");
        enunciado.append(sustantivo[random.nextInt(sustantivo.length)]).append(".");

        // Capitalizar la primera letra del enunciado
        enunciado.setCharAt(0, Character.toUpperCase(enunciado.charAt(0)));

        return enunciado.toString();
    }
}
