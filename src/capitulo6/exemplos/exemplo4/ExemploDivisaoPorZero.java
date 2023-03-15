
package capitulo6.exemplos.exemplo4;

public class ExemploDivisaoPorZero {
    public static void main(String[] args) {
        int x = 3;
        int y = 0;
        
        double result = Double.NaN;
        
        try {
            result = x / y;
        } catch (ArithmeticException e) {
            result = Double.NaN;
        } finally {
            System.out.println("Resultado: " + result);
        }
    }
}
