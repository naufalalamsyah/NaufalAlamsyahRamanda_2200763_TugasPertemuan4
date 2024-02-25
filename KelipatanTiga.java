/* @author Naufal Alamsyah R
 */
package kelipatantiga;
import java.util.Scanner;

public class KelipatanTiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan riil: ");
        double bilangan = scanner.nextDouble();

        // Mengambil bagian depan dan belakang koma
        int depanKoma = (int) bilangan;
        double belakangKoma = bilangan - depanKoma;

        // Mengubah belakang koma menjadi integer (2 digit di belakang koma)
        int belakangKomaInt = (int) (belakangKoma * 100);

        // Memeriksa apakah angka di depan dan di belakang koma adalah kelipatan 3
        if (depanKoma % 3 == 0 && belakangKomaInt % 3 == 0) {
            System.out.println("Angka di depan dan di belakang koma adalah kelipatan 3.");
        } else {
            System.out.println("Angka di depan dan di belakang koma BUKAN kelipatan 3.");
        }

        scanner.close();
    }
}
