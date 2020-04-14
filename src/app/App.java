package app;
import classes.*;

public class App {

    public static void main(String[] args) throws Exception {

        Carro Uno = new Carro ();    
        Carro Camaro = new Carro ();
        Moto Honda = new Moto ();

          Uno.marchaRe();
          Camaro.desligar();
          Honda.travar();

 
        System.out.println("Hello Java");
    }
}