package logica;


public class VideoJuego {
    
    private int codigo;
    private String titulo;
    private String consola;
    private int cantJugadores;
    private String categoria;

    public VideoJuego() {
    }

    public VideoJuego(int codigo, String titulo, String consola, int cantJugadores, String categoria) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.consola = consola;
        this.cantJugadores = cantJugadores;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getConsola() {
        return consola;
    }

    public int getCantJugadores() {
        return cantJugadores;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public void setCantJugadores(int cantJugadores) {
        this.cantJugadores = cantJugadores;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "VideoJuego{" + "codigo=" + codigo + ", titulo=" + titulo + ", consola=" + consola + ", cantJugadores=" + cantJugadores + ", categoria=" + categoria + '}';
    }
    
    
    
    
}
