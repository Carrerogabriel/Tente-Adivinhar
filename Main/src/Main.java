import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int numeroAleatorio = random.nextInt(101);
        int tentativas = 5;

        JOptionPane.showMessageDialog(null, "Bem-vindo ao jogo de adivinhação! Você tem 5 tentativas para adivinhar o número de 0 a 100.");

        for (int tentativa = 1; tentativa <= tentativas; tentativa++) {
            String input = JOptionPane.showInputDialog("Tentativa #" + tentativa + ": Digite um número:");
            int numeroDigitado = Integer.parseInt(input);

            if (numeroDigitado == numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "Parabéns! Você acertou o número.");
                break;
            } else if (numeroDigitado < numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "O número gerado é maior.");
            } else {
                JOptionPane.showMessageDialog(null, "O número gerado é menor.");
            }

            if (tentativa == tentativas) {
                JOptionPane.showMessageDialog(null, "Você esgotou suas tentativas. O número correto era " + numeroAleatorio + ".");
            }
        }
    }
}
