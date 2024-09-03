package ejerciciovideojuego;

import java.util.ArrayList;
import java.util.List;
import logica.VideoJuego;

public class EjercicioIntegradorVideojuegos {

    public static void main(String[] args) {
        
        List<VideoJuego> listaVideojuegos = new ArrayList <>();
        
        VideoJuego juego1 = new VideoJuego(123, "Banjo", "Nintendo 64", 4, "Plataforma");
        VideoJuego juego2 = new VideoJuego(100, "Mario Party 3", "Nintendo 64", 4, "Plataforma");
        VideoJuego juego3 = new VideoJuego(101, "Age of Empires II", "PC", 4, "Estrategia");
        VideoJuego juego4 = new VideoJuego(102, "CSGO", "PC", 1, "Shooter");
        VideoJuego juego5 = new VideoJuego(103, "Mario Kart 64", "Nintendo 64", 2, "Plataforma");
        
        listaVideojuegos.add(juego1);
        listaVideojuegos.add(juego2);
        listaVideojuegos.add(juego3);
        listaVideojuegos.add(juego4);
        listaVideojuegos.add(juego5);
        
        for (VideoJuego videojuego : listaVideojuegos) {
            System.out.printf("Titulo: %s%nConsola: %s%nCantidad Jugadores: %s%n-------------------%n",videojuego.getTitulo()
                    ,videojuego.getConsola()
            ,videojuego.getCantJugadores());
        }
        
        juego1.setTitulo("Banjo Kazooie II");
        juego2.setCantJugadores(1);
        
        for (VideoJuego videojuego : listaVideojuegos) {
            if (videojuego.getConsola().equals("Nintendo 64")){
                System.out.println(videojuego.toString());
            }
        }
        
    }
}
