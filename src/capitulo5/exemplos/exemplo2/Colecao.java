
package capitulo5.exemplos.exemplo2;

import capitulo5.exemplos.exemplo1.Professor;
import java.util.ArrayList;


public class Colecao {
    public static void main(String[] args) {
//        ArrayList listaDeProfessores = new ArrayList();
        ArrayList<Professor> listaDeProfessores = new ArrayList();
        
        for(int i = 0; i < 10; i++){
            Professor p =  new Professor();
            System.out.println("Digite o nome do professor: ");

            String input = new java.util.Scanner(System.in).next();

            p.setNome(input);
            listaDeProfessores.add(p);
        }
        
        for (int i = 0; i < listaDeProfessores.size(); i++) {
//            Object get = listaDeProfessores.get(i);
//            Professor professor = (Professor)listaDeProfessores.get(i);
            Professor professor = listaDeProfessores.get(i);
            System.out.println("Nome: " + professor.getNome());
        }
    }
}
