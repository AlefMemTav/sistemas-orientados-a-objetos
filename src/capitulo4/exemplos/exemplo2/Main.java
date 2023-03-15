
package capitulo4.exemplos.exemplo2;

public class Main {
    public static void main(String[] args) {
        Engenheiro e1 = new Engenheiro();
        
//        e1.nome = "Jose";
//        e1.salarioBruto = 10000;
        e1.setNome("Jose");
        e1.setSalarioBruto(10000);
        System.out.println("Salario liquido " + e1.calcularSalarioLiquido(0.8f, 100f));
        
        Medico m1 = new Medico();
        
//        m1.nome = "Vinicius";
//        m1.salarioBruto = 8000;
        m1.setNome("Vinicius");
        m1.setSalarioBruto(8000);
        System.out.println("Salario liquido " + m1.calcularSalarioLiquido(0.7f, 150f));
    
        Professor p1 = new Professor();
        
//        p1.nome = "Pablo";
//        p1.salarioBruto = 50;
//        p1.horasTrabalhadas = 160;
        
        p1.setNome("Pablo");
        p1.setSalarioBruto(50);
        p1.setHorasTrabalhadas(160);
        System.out.println("Salario liquido " + p1.calcularSalarioLiquido(0.6f, 500f));
        
        System.out.println("Salario liquido " + p1.calcularSalarioLiquido(0.6f));
        
        System.out.println("Salario bruto " + p1.getSalarioBruto());
    
        Professor p2 = new Professor(55);
        p2.setNome("Rodrigo");
        p2.setHorasTrabalhadas(160);
        
        Engenheiro e2 = new Engenheiro();
        
//        System.out.println("Piso salarial " + e2.PISO_SALARIAL);
        System.out.println("Piso salarial " + Engenheiro.PISO_SALARIAL);
        
        System.out.println("Piso salarial corrigido " + Engenheiro.calcularPisoSalarialCorrigido(1.3f));
    
    }
}
