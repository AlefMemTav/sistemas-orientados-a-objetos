
package capitulo6.exemplos.exemplo9;

import java.util.Random;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Consumidor /*extends Thread*/implements Runnable{
    private Buffer buffer;

    public Consumidor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            consumir();
        } catch (InterruptedException e) {
            Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, e);            
        }
    }
    
    public void consumir() throws InterruptedException{
        while(true){
            int number = buffer.remover();
            System.out.println("Removendo " + number);
            try {
                Random t = new Random();
                Thread.sleep(1000*t.nextInt(3));
            } catch (InterruptedException e) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, e);            
            }
        }
    }   
}
