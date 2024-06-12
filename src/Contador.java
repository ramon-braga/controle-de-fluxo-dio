import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scanner.nextInt();
		
		try {
			validarParametros(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
		}

        scanner.close();
    }

    static void validarParametros(int num1, int num2) throws ParametrosInvalidosException {
        if (num2 <= num1) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        } else {
            int contagem = num2 - num1;
            System.out.println("Iniciando contágem:");
            contar(contagem);
        }

	}

    static void contar(int intervalo) {
            for (int i = 1; i <= intervalo; i++) {
                System.out.println(i);
            }
    }
}
