
package ClaseAbstracta;

public abstract class Figura {

    //este comportamiento será obligatorio en las clases que hereden de figura
    abstract double calcularArea();
    
    void imprimirInformacion(){
        System.out.println("Esta informacion viene desde la clase abstracta");
    }
    
    
}
