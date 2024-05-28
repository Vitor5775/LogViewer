import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean inputSuccess = false;

        String nome = null;
        String sobrenome = null;
        int salario = 0;
        String nome2 = null;
        String sobrenome2 = null;
        int salario2 = 0;

        while (!inputSuccess) {
            try {
                System.out.println("Digite o nome do primeiro empregado: ");
                nome = sc.nextLine();
                validateStringInput(nome);
                
                System.out.println("Digite o sobrenome do primeiro empregado: ");
                sobrenome = sc.nextLine();
                validateStringInput(sobrenome);
                
                System.out.println("Digite o salário mensal do primeiro empregado: ");
                salario = Integer.parseInt(sc.nextLine());

                System.out.println("Digite o nome do segundo empregado: ");
                nome2 = sc.nextLine();
                validateStringInput(nome2);
                
                System.out.println("Digite o sobrenome do segundo empregado: ");
                sobrenome2 = sc.nextLine();
                validateStringInput(sobrenome2);
                
                System.out.println("Digite o salário mensal do segundo empregado: ");
                salario2 = Integer.parseInt(sc.nextLine());

                inputSuccess = true;
            } catch (NumberFormatException e) {
                System.out.println("Erro de entrada. Certifique-se de inserir um número válido para o salário.");
                logException(e);
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
                logException(e);
            } catch (Exception e2) {
                System.out.println("Erro de entrada. Tente novamente.");
                logException(e2);
            }
        }

        empregados empregado = new empregados(nome, sobrenome, salario, nome2, sobrenome2, salario2);
        System.out.println("Salário anual do primeiro empregado: " + empregado.salario_anual());
        System.out.println("Salário anual do segundo empregado: " + empregado.salario_anual2());
        System.out.println("Aumento do primeiro empregado: " + empregado.aumento());
        System.out.println("Aumento do segundo empregado: " + empregado.aumento2());

        sc.close();
    }

    private static void validateStringInput(String input) throws InvalidInputException {
        if (!input.matches("[a-zA-Z]+")) {
            throw new InvalidInputException("Erro de entrada. O campo deve conter apenas letras.");
        }
    }

    private static void logException(Exception e) {
        String logFilename = "log_" + LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")) + ".txt";
        try (FileWriter logFile = new FileWriter(logFilename, true)) {
            logFile.write(LocalDate.now() + " - Exception: " + e.toString() + "\n");
        } catch (IOException ioException) {
            System.out.println("Erro ao gravar no arquivo de log: " + ioException.toString());
        }
    }
}

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}