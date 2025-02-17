import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        // Criação do Scanner para ler input do usuário
        Scanner terminal = new Scanner(System.in);  

        try {
            // Solicita o primeiro parâmetro
            System.out.println("Digite o primeiro parâmetro:");
            int parametroUm = terminal.nextInt();  

            // Solicita o segundo parâmetro
            System.out.println("Digite o segundo parâmetro:");
            int parametroDois = terminal.nextInt();  

            // Chama o método que contém a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            // Exibe a mensagem de erro caso os parâmetros sejam inválidos
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // Captura qualquer outra exceção inesperada
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            // Garante que o Scanner seja fechado
            terminal.close();  
        }
    }

    // Método de contagem que lança exceção caso a lógica de parâmetros seja inválida
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Valida se o primeiro parâmetro é maior ou igual ao segundo
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        // Loop para imprimir os números de 1 até a diferença entre os dois parâmetros
        for (int i = 1; i <= (parametroDois - parametroUm); i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

// Exceção personalizada para parâmetros inválidos
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
