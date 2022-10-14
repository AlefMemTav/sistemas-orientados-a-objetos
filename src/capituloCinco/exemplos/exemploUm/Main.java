
package capituloCinco.exemplos.exemploUm;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Programação com subtipos
//        Engenheiro e1 =  new Engenheiro();
        
//        Professor pr1 = new Professor("111.111.111-11", "José", 100);
//        Professor pr2 = new Professor("222.222.222-22", "Pablo", 90);
        
        Profissional p1 = new Engenheiro();
        Profissional p2 = new Professor("111.111.111-11", "José", 100);
        Profissional p3 = new Professor("222.222.222-22","Pablo", 90);
        Profissional p4 = new Medico();
        
        p1.setCpf("333.333.333-33");
        p1.setNome("Jorge"); 
        p1.setSalarioBruto(8500);
        
//        Engenheiro e1 = (Engenheiro)p1;
//        e1.setCrea("1111");
        ((Engenheiro) p1).setCrea("1111");
        
        p4.setCpf("444.444.444-44");
        p4.setNome("Lucas");
        p4.setSalarioBruto(9500);
        ((Medico) p4).setCrm("4321");

        imprimirDados(p1);
        imprimirDados(p4);
               
        Imovel i1 = new Imovel();
       
        i1.setDescricao("Sede da Empresa");
        
        Date dataInicioDeContrato = new Date(2020, 01, 31);
        i1.setDataInicioDeContrato(dataInicioDeContrato);
        
        i1.setValorDoAluguel(1000.78f);

        imprimirDespesa(i1);
        imprimirDespesa(p3);
        imprimirDespesa(p4);
}
    
//    public static void imprimirDados(Profissional p){
//        System.out.println("CPF: " + p.getCpf());
//        System.out.println("Nome: " + p.getNome());
//
//        if(p instanceof Engenheiro e){
//            System.out.println("Crea: " + e.getCrea());
//        }
//
//        if(p instanceof Medico m){
//            System.out.println("Crm: " + m.getCrm());
//        }
//    }
    
    public static void imprimirDados(Profissional p){
        System.out.println("CPF: " + p.getCpf());
        System.out.println("Nome: " + p.getNome());
        
        System.out.println("Registro profissional " + p.obterRegistroProfissional());
    }
    
    public static void imprimirDespesa(Balancete balancete){
        System.out.println("Despesa " + balancete.declararDespesa());
    }
}
