package GeneradorQuintillas;
import java.util.Random;

public class GeneradorQuintillas {
    public static void main(String[] args) {
        String[] lineas1 = {"En un lugar muy lejano", "Bajo el sol veraniego", "Entre risas y alegría", "De noche y de día", "En un rincón del mundo"};
        String[] lineas2 = {"una historia se ha contado", "un amor ha florecido", "una canción ha sonado", "un sueño ha sido tejido", "un secreto ha sido guardado"};
        String[] lineas3 = {"con pasión desmedida", "con esperanza compartida", "con lágrimas escondidas", "con risas compartidas", "con misterio en la mirada"};
        String[] lineas4 = {"se ha escrito una poesía", "se ha pintado una melodía", "se ha vivido una utopía", "se ha soñado en poesía", "se ha sentido la magia"};
        String[] lineas5 = {"con final inesperado", "en un lugar olvidado", "con un giro inesperado", "en un abrazo apretado", "en un sueño desvelado"};

        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int indiceAleatorio = random.nextInt(lineas1.length);

            String linea1 = lineas1[indiceAleatorio];
            String linea2 = lineas2[indiceAleatorio];
            String linea3 = lineas3[indiceAleatorio];
            String linea4 = lineas4[indiceAleatorio];
            String linea5 = lineas5[indiceAleatorio];

            System.out.println(linea1);
            System.out.println(linea2);
            System.out.println(linea3);
            System.out.println(linea4);
            System.out.println(linea5);
            System.out.println();
        }
    }
}