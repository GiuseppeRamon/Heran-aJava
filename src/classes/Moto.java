package classes;

public class Moto extends Veículo{

    private boolean exigeCapacete;
     private String maneabilidade;
     private boolean travada;
    
     public void travar () {
         this.travada = true;
         System.out.println(travada);
     }
    
     public void destravar () {
         this.travada = false;
     }

}