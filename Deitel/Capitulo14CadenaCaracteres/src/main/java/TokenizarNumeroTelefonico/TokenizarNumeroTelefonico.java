package TokenizarNumeroTelefonico;

public class TokenizarNumeroTelefonico {
    public static void main(String[] args) {
        String numeroTelefonico = "(555)555-5555";

        // Eliminar los paréntesis y el guion para obtener solo los dígitos
        String numeroSoloDigitos = numeroTelefonico.replaceAll("[()-]", "");

        // Dividir la cadena en tokens: código de área, primeros tres dígitos, últimos cuatro dígitos
        String codigoArea = numeroSoloDigitos.substring(0, 3);
        String primerosTresDigitos = numeroSoloDigitos.substring(3, 6);
        String ultimosCuatroDigitos = numeroSoloDigitos.substring(6);

        // Imprimir los tokens obtenidos
        System.out.println("Código de área: " + codigoArea);
        System.out.println("Primeros tres dígitos: " + primerosTresDigitos);
        System.out.println("Últimos cuatro dígitos: " + ultimosCuatroDigitos);

        // Concatenar los siete dígitos en una cadena
        String numeroCompleto = codigoArea + primerosTresDigitos + ultimosCuatroDigitos;
        System.out.println("Número telefónico completo: " + numeroCompleto);
    }
}
