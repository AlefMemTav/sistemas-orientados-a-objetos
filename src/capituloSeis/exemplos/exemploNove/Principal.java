
package capituloSeis.exemplos.exemploNove;

public class Principal {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Produtor p = new Produtor(buffer);
        Consumidor c = new Consumidor(buffer);
//        p.start();
//        c.start();
        Thread t1 = new Thread(p);
        t1.start();
        Thread t2 = new Thread(c);
        t2.start();
    }
}
