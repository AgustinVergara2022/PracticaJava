package InterfazImpactoEcologico;

import java.util.ArrayList;


public class PruebaInterfaz {
    public static void main (String[] args){
        
        ArrayList<ImpactoEcologico> impactos= new ArrayList<ImpactoEcologico>();
        Edificio edificio = new Edificio(500, 400);
        impactos.add(edificio);
        
        Auto auto = new Auto(1200);
        impactos.add(auto);
        
        Bicicleta bici = new Bicicleta(5.9);
        impactos.add(bici);
        
        mostrar(impactos);
    }
    
    
    public static void mostrar(ArrayList<ImpactoEcologico> impactos){
        
        for (ImpactoEcologico impacto : impactos) {
            System.out.println(impacto.toString());
            System.out.println("Impacto Ecológico: " + impacto.obtenerImpactoEcologico() + " kg CO2e");
            System.out.println();
        }
            
    }
}
