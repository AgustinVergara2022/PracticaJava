public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            boolean divisiblePorTres = i % 3 == 0;
            boolean divisiblePor5 = i % 5 == 0;
            if (divisiblePorTres && divisiblePor5){
                System.out.println("fizzbuzz");
            } else if (divisiblePorTres) {
                System.out.println("fizz");
            } else if (divisiblePor5){
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }

        }
    }
