
package SemaforoEnum;

public enum LuzSemaforo {
    ROJO(30),
    VERDE(45),
    AMARILLO(5);

    private int duracion;

    LuzSemaforo(int duracion) {
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public static void main(String[] args) {
        System.out.println("Duración de las luces del semáforo:");
        System.out.println("ROJO: " + LuzSemaforo.ROJO.getDuracion() + " segundos");
        System.out.println("VERDE: " + LuzSemaforo.VERDE.getDuracion() + " segundos");
        System.out.println("AMARILLO: " + LuzSemaforo.AMARILLO.getDuracion() + " segundos");
    }
}