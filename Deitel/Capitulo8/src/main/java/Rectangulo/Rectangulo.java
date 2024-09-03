
package Rectangulo;


public class Rectangulo {
    
        
        private double longitud = 1.0;
        private double anchura = 1.0;
        
        //constructor
        public Rectangulo(double longitud, double anchura){
            this.longitud = longitud;
            this.anchura = anchura;
        }
        
        //getters y setters
        public void setLongitud(double longitud){
            if(longitud < 0.0 || longitud > 20.0)
                throw new IllegalArgumentException("Longitud debe estar entre 0 y 20");
            this.longitud = longitud;
        }
        
        public void setAnchura(double anchura){
            if(anchura < 0.0 || anchura > 20.0)
               throw new IllegalArgumentException("Anchura debe estar entre 0 y 20");
            this.anchura = anchura;
        }
        
        public double getLongitud(){
            return longitud;
        }
        
        public double getAnchura(){
            return anchura;
        }
        
        public double calculaPerimetro(double longitud, double anchura){
            double perimetro = 2*longitud + 2*anchura;
            return perimetro;
        }
         public double calculaArea(double longitud, double anchura){
             return longitud*anchura;
         }
}
        
   
