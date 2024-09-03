public class EsPrimo {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            System.out.printf("El numero %d %s primo%n",i,esPrimo(i) ? "es": "no es");
        }
            }
            
            private static boolean esPrimo(int numero){
                if (numero < 2){
                    return false;
                }

                for (int i = 2; i < numero; i++) {
                    if(numero % i == 0){
                        return  false;
                    }
                }
                return true;
            }
        }


    

