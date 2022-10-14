
package capituloQuatro.exemplos.exemploUm;


public class Robo {
    String modelo;
    String cor;
    String numeroDeSerio;
    int ano;
    boolean ligado;
    float direcao;
    float velocidade;
    float nivelDaBateria;
    
    void ligar(){
        ligado = true;
        velocidade = 0;
    }
    
    void desligar(){
        ligado = false;
        velocidade = 0;
    }
    
    void andar(){
        velocidade = 2;
    }
    
    void parar(){
        velocidade = 0;
    }
    
    void virar(){
        direcao += 1;
        
        if(direcao == 360){
            direcao = 0;
        }
    }
    
    float calcularTempoRestanteDaBateria(){
        return nivelDaBateria/20;
    }
}
