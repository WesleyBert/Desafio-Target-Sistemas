import java.util.ArrayList;

public class desafio02 {

    public static ArrayList<Integer> calcularSequenciaFibonacci(int limite) {
        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        
        int i = 2;
        while (fibonacci.get(i-1) + fibonacci.get(i-2) <= limite) {
            fibonacci.add(fibonacci.get(i-1) + fibonacci.get(i-2));
            i++;
        }
        
        return fibonacci;
    }

    public static boolean verificaPertence(int numero, ArrayList<Integer> sequencia) {
        return sequencia.contains(numero);
    }

    public static void main(String[] args) {
        int numeroVerificar = 21; // Número a ser verificado
        ArrayList<Integer> sequenciaFibonacci = calcularSequenciaFibonacci(numeroVerificar);

        if (verificaPertence(numeroVerificar, sequenciaFibonacci)) {
            System.out.println("O número " + numeroVerificar + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numeroVerificar + " não pertence à sequência de Fibonacci.");
        }
    }
}
