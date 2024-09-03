package CadenaInicioFin;


public class CadenaInicioFin {
    public static void main(String[] args)
    {
        String[] cadenas = {"empezo", "empezando", "termino", "terminando"};
 
        // prueba el método startsWith
        for (String cadena : cadenas)
        {
            if (cadena.startsWith("em"))
                System.out.printf("\"%s\" empieza con \"em\"%n", cadena);
         }
        
        System.out.println();

        // prueba el método startsWith empezando desde la posición 2 de la cadena
        for (String cadena : cadenas)
        {
            if (cadena.startsWith("pez", 2))
                System.out.printf("\"%s\" empieza con \"pez\" en la posicion 2%n", cadena);
        }

        System.out.println();
        
        // prueba el método endsWith
        for (String cadena : cadenas)
        {
            if (cadena.endsWith("do"))
                System.out.printf("\"%s\" termina con \"do\"%n", cadena);
        }
}
}
