public class FuncionesYAlcance {
    public static void main(String[] args) {
        saludar();
        System.out.println(suma(1,2));
        procesaCadenas("Hola", "mundo");
    }

    //Funcion sin parametros y sin retorno
    private static void saludar(){
        System.out.println("Hola");
    }

    //Funcion con dos parametros y retorno
    private static int suma(int a, int b){
        return a + b;
    }

    private static int procesaCadenas(String texto1, String texto2){
        int cont = 0;
        for (int i = 1; i < 100; i++) {
            if(i % 3 == 0){
                System.out.print(texto1);

            } else if (i % 5 == 0) {
                System.out.print(texto2);

            } else if (i % 3 == 0 && i % 5 ==0){
                System.out.print(texto1 + texto2);
            } else {
                System.out.println(i + " ");
                cont++;
            }

        }
        return cont;
    }

}
