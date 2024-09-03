package CalculadoraFactorial;

import java.math.BigInteger;

public class CalculadoraFactorial {
    //metodo factorial recursivo (asume que su parametro es >= 0)
    public static BigInteger factorial (BigInteger numero){
        if (numero.compareTo(BigInteger.ONE)<=0)
            return BigInteger.ONE;
        else
            return numero.multiply(factorial(numero.subtract(BigInteger.ONE)));
    }

    public static void main(String[] args) {
        for (int contador = 0; contador <= 50; contador++) {
            System.out.printf("%d! = %d%n", contador, factorial(BigInteger.valueOf(contador)));
        }
    }
}
