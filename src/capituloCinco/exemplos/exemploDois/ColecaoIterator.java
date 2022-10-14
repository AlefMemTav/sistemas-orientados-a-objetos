
package capituloCinco.exemplos.exemploDois;

import capituloCinco.exemplos.exemploUm.Professor;
//import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class ColecaoIterator {

    public static void main(String[] args) {

//        List<Professor> listaDeProfessores = new ArrayList();
        List<Professor> listaDeProfessores = new LinkedList();   

        for(int i = 0; i < 10; i++){
            Professor professor =  new Professor();
            
            System.out.println("Digite o nome do professor: ");

            String input = new java.util.Scanner(System.in).next();

            professor.setNome(input);
            listaDeProfessores.add(professor);
        }
        
        Iterator<Professor> iterator = listaDeProfessores.iterator();
        
        while(iterator.hasNext()){
            Professor professor = iterator.next();
            System.out.println("Nome: " + professor.getNome());
        }
    } 
}
