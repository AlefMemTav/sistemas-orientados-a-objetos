
package capitulo6.exemplos.exemplo9;

import java.util.Random;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Produtor /*extends Thread*/implements Runnable{
    private Buffer buffer;

    public Produtor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            produzir();
        } catch (InterruptedException e) {
           Logger.getLogger(Produtor.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void produzir() throws InterruptedException{
       while(true){
           Random r = new Random();
           int number = r.nextInt(100);
           System.out.println("Adicionando " + number);
           buffer.adicionar(number);
           try {
               Random t = new Random();
               Thread.sleep(1000*t.nextInt(3));
           } catch (InterruptedException e) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, e);             
           }
       } 
    }  
}
