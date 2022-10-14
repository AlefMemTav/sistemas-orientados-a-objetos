
package capituloQuatro.exemplos.exemploUm;


public class Main {
    public static void main(String[] args) {
        Robo robo1;
        robo1 = new Robo();
        
        Robo robo2 = new Robo();
        
        robo1.ano = 2018;
        robo1.cor = "Branco";
        robo1.modelo = "T100";
        robo1.numeroDeSerio = "XYZ123";
        
        robo2.ano = 2015;
        robo2.cor = "Preto";
        robo2.modelo = "T200";
        robo2.numeroDeSerio = "ABC321";
        
        robo1.ano = 2006;
        robo2.cor =  "Vermelho";
        
        System.out.println("Ano do robo 1 " + robo1.ano);
        System.out.println("Cor do robo 2 " + robo2.cor);
        
        // robo1 = null;
        
        robo1.ligar();
        robo1.andar();
        robo2.virar();
        robo1.parar();
        robo1.desligar();
        
        robo2.ligar();
        robo2.andar();
        robo2.virar();
        robo2.parar();
        robo2.desligar();
        
        robo1.nivelDaBateria = 80;
        
        // float tempoRestante = robo1.calcularTempoRestanteDaBateria();
        
        System.out.println("Tempo estimado " + robo1.calcularTempoRestanteDaBateria());
    }
}
