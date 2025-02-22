import java.util.Scanner;
 
public class Tabuada {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        // Solicita ao usuário para digitar um número
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();
        // Calcula e imprime a tabuada
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        scanner.close();
    }
}
