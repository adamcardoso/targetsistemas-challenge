package exercicio_01;

public class ex01 {
    public static void main(String[] args) {
        int index = 13, sum = 0, k = 0;

        while (k < index) {
            k += 1;

            sum += k;
        }

        System.out.println("The sum of the numbers: " + sum); // 91
    }
}