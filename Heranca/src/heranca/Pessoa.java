
package heranca;


public class Pessoa {
    String nome, rg, cpf;
    
    public String returnDados(){
        String dados = "";
        
        dados += "nome: " + nome + "\n";
        dados += "rg: " + rg + "\n";
        dados += "cpf: " + cpf + "\n";
        
        return dados;
        
        
    }

    String retornaDados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
