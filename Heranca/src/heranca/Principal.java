
package heranca;


public class Principal {

   
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Professor p1 = new Professor();
        
        a1.nome = "Ricardo Menezes ";
        a1.rg = "36.456.789-X";
        a1.cpf = "456.123.789-89";
        a1.registroAluno = 987987987;
        a1.notaVestibular = 7.5f;
        a1.curso = "Bacharelado em Artes Marciais";
        a1.dataMatricula = "02/02/2020";
        
        p1.nome  = "yoda";
        p1.rg = "27.555.555-1";
        p1.matriculaProfessor = 3000468;
        p1.daraAdmissao = "10/10/2019";
        p1.salarioHorista = 70.99;
        
        
        
        
        System.out.println("\t - Dados do Aluno RA n° :"  + a1.registroAluno + " -\n");
        System.out.println(a1.returnDados());
        
       
    }
    
}
