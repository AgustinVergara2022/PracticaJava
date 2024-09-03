public class SucesionDeFibonacci {
    /*Fn = Fn-1 + Fn-2*/
    public static void main(String[] args) {
        long[] fibonacci = new long[50];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        for (int i = 0; i < fibonacci.length; i++)
            System.out.println(fibonacci[i]);

    }
}
