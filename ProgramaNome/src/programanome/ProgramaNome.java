
package programanome;

import java.util.Scanner;

public class ProgramaNome {

    public static void main(String[] args) {
        Nome nome = new Nome();
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o primeiro nome: ");
        nome.primeiroNome = entrada.nextLine();
 
        System.out.println("Digite o segundo nome: ");
        nome.segundoNome = entrada.nextLine();
        
        System.out.println("Digite o ultimo nome: ");
        nome.ultimoNome = entrada.nextLine();
        
        nome.nomeCompleto();
    }
    
}
