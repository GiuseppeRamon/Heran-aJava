package classes;

public class Veículo {
        private String marca;
        private String nome;
        private double valor;
        private double consumo;
        private boolean ligado;
        
        public void ligar () {
            this.ligado = true;
        }
        
        public void desligar() {
            this.ligado = false;
        }

}