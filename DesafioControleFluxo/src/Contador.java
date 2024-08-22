import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);

        System.out.println(
                "O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros, a diferença entre esses dois números será o número de repetições (for) que deverá ser feita.");

        try {
            System.out.println("Digite o primeiro número inteiro: ");
            int primeiroParametro = console.nextInt();

            System.out.println("Digite o segundo número inteiro: ");
            int segundoParametro = console.nextInt();

            validarParametros(primeiroParametro, segundoParametro);

            percorrerNumeros(primeiroParametro, segundoParametro);

        } catch (ParametrosInvalidosException e) {
            // Exception lançada customizada
            System.out.println("O segundo parâmetro deve ser maior que o primeiro e os dois devem ser diferentes de zero.");
        } catch (InputMismatchException e) {
            // Exception lançada pelo java
            System.out.println("Digite um número inteiro.");
        } catch (Exception e) {
            // Exception lançada pelo java
            System.out.println("Erro inesperado.");
        }

    }

    private static void validarParametros(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if (primeiroParametro > segundoParametro
                || primeiroParametro == 0
                || segundoParametro == 0) {
            throw new ParametrosInvalidosException();
        }
    }

    private static void percorrerNumeros(int primeiroParametro, int segundoParametro) {

        int numeroRepeticoes = segundoParametro - primeiroParametro;

        for (int i = 1; i < numeroRepeticoes; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
    }
}
