import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LogViewer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a data para ver o log (YYYYMMDD): ");
        String logDate = sc.nextLine();
        String logFilename = "log_" + logDate + ".txt";

        try (BufferedReader logFile = new BufferedReader(new FileReader(logFilename))) {
            String line;
            System.out.println("Erros registrados em " + logDate + ":");
            while ((line = logFile.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo de log: " + e.toString());
        }

        sc.close();
    }
}