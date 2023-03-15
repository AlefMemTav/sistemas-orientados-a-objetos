
package capitulo6.exemplos.exemplo1;

public class ExemploWrapper {
    public static void main(String[] args) {
//        Integer x = new Integer("1");
        Float y = 4f;
//        Double a = new Double("10.7");
//        Boolean op = new Boolean("true");
        String txt= "Marina";
        
        if(!y.isNaN()){
            System.out.println(y);
        }
        
        System.out.println(txt.charAt(2));
        System.out.println(txt.indexOf("n"));
    }
}
