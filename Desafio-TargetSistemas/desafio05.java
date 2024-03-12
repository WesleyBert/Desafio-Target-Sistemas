import java.util.Scanner;

public class desafio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String inputString = scanner.nextLine();

        char[] charArray = inputString.toCharArray();

        int length = charArray.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[length - i - 1];
            charArray[length - i - 1] = temp;
        }

        String reversedString = new String(charArray);

        System.out.println("String invertida: " + reversedString);
    }
}
