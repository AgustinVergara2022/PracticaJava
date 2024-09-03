package MetodosDeColecciones;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

// clase para representar un objeto Carta en un mazo de cartas
class Carta
{
    public static enum Cara {As, Dos, Tres, Cuatro, Cinco, Seis,
        Siete, Ocho, Nueve, Diez, Joker, Reina, Rey };
    public static enum Palo {Bastos, Diamantes, Corazones, Espadas};

    private final Cara cara;
    private final Palo palo;

    // constructor
    public Carta(Cara cara, Palo palo)
    {
        this.cara = cara;
        this.palo = palo;
    }

     // devuelve la cara de la carta
    public Cara obtenerCara()
    {
        return cara;
    }
    
    // devuelve el palo de la Carta
    public Palo obtenerPalo()
    {
        return palo;
    }

    // devuelve la representación String de la Carta
    public String toString()
    {
        return String.format("%s of %s", cara, palo);
    }
   } // fin de la clase Carta

public class Shuffle {
    private List<Carta> lista; // declara objeto List que almacenará los objetos Carta
    
    // establece mazo de objetos Carta y baraja
    public Shuffle()
    {
        Carta[] mazo = new Carta[52];
        int cuenta = 0; // número de cartas
        
        // llena el mazo con objetos Carta
        for (Carta.Palo palo: Carta.Palo.values())
        {
            for (Carta.Cara cara: Carta.Cara.values())
            {
                mazo[cuenta] = new Carta(cara, palo);
                ++cuenta;
            }
        }

        lista = Arrays.asList(mazo); // obtiene objeto List
        Collections.shuffle(lista); // baraja el mazo
      } // fin del constructor de MazoDeCartas
    
    // imprime el mazo
    public void imprimirCartas()
    {
        // muestra las 52 cartas en dos columnas
        for (int i = 0; i < lista.size(); i++)
            System.out.printf("%-19s%s", lista.get(i),
                ((i + 1) % 4 == 0) ? "%n" : "");
    }
    
    public static void main(String[] args){
        Shuffle cartas = new Shuffle();
        cartas.imprimirCartas();
    }
}
