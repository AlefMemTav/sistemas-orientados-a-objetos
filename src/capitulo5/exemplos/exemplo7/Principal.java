
package capitulo5.exemplos.exemplo7;

public class Principal {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Barco b1 = new Barco();
        
        VeiculoAnfibio v1 = new VeiculoAnfibio(c1, b1);
        v1.ligar();
    }
}
