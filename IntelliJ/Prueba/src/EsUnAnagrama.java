import java.util.Arrays;
import java.util.Scanner;

public class EsUnAnagrama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la primer palabra: ");
        String p1 = scanner.next();
        System.out.print("Ingrese la segunda palabra: ");
        String p2 = scanner.next();

        System.out.print(isAnagram(p1,p2));
    }

    private static boolean isAnagram(String palabra1, String palabra2){
        if(palabra1.equalsIgnoreCase(palabra2)){
            return false;
        }
        char[] arrayUno = palabra1.toLowerCase().toCharArray();
        char[] arrayDos = palabra2.toLowerCase().toCharArray();

        Arrays.sort(arrayUno);
        Arrays.sort(arrayDos);

        return Arrays.equals(arrayUno,arrayDos);
    }
}
