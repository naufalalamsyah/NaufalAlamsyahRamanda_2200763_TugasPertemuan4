/* @author Naufal Alamsyah 
 */
package operatoraritmatika;
import java.util.Scanner;

public class OperatorAritmatika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan bilangan pertama: ");
        int bilangan1 = input.nextInt();

        System.out.print("Masukan bilangan kedua: ");
        int bilangan2 = input.nextInt();

        System.out.print("Masukan operator aritmatika (+, -, *, /, %): ");
        char operator = input.next().charAt(0);

        int hasil = 0;
        switch (operator) {
            case '+':
                hasil = bilangan1 + bilangan2;
                System.out.println("Hasil penjumlahan " + bilangan1 + " dan " + bilangan2 + " adalah: " + hasil);
                break;
            case '-':
                hasil = bilangan1 - bilangan2;
                System.out.println("Hasil pengurangan " + bilangan1 + " dan " + bilangan2 + " adalah: " + hasil);
                break;
            case '*':
                hasil = bilangan1 * bilangan2;
                System.out.println("Hasil perkalian " + bilangan1 + " dan " + bilangan2 + " adalah: " + hasil);
                break;
            case '/':
                if (bilangan2 != 0) {
                    hasil = bilangan1 / bilangan2;
                    System.out.println("Hasil pembagian " + bilangan1 + " dan " + bilangan2 + " adalah: " + hasil);
                } else {
                    System.out.println("Error: Pembagian dengan 0 tidak dapat dilakukan");
                }
                break;
            case '%':
                if (bilangan2 != 0) {
                    hasil = bilangan1 % bilangan2;
                    System.out.println("Hasil modulus " + bilangan1 + " dan " + bilangan2 + " adalah: " + hasil);
                } else {
                    System.out.println("Error: Modulus dengan 0 tidak dapat dilakukan");
                }
                break;
            default:
                System.out.println("Operator aritmatika tidak valid!");
        }

        input.close();
    }
}
