
package programanome;

public class Nome {
    String primeiroNome;
    String segundoNome;
    String ultimoNome;
    private String nomeCompleto;
    
    public void nomeCompleto(){
        System.out.println("Nome: " + primeiroNome + " " + segundoNome + " " + ultimoNome);
    }
}
