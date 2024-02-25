/* @author Naufal Alamsyah R
 */
    package selisihwaktu;
    import java.util.Scanner;

public class SelisihWaktu {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jam mulai
        System.out.println("Masukkan jam mulai (jam:menit):");
        String jamMulaiStr = scanner.next();
        String[] jamMulaiArr = jamMulaiStr.split(":");
        int jamMulaiJam = Integer.parseInt(jamMulaiArr[0]);
        int jamMulaiMenit = Integer.parseInt(jamMulaiArr[1]);

        // Input jam keluar
        System.out.println("Masukkan jam keluar (jam:menit):");
        String jamKeluarStr = scanner.next();
        String[] jamKeluarArr = jamKeluarStr.split(":");
        int jamKeluarJam = Integer.parseInt(jamKeluarArr[0]);
        int jamKeluarMenit = Integer.parseInt(jamKeluarArr[1]);

        // Menghitung total menit dari jam mulai dan jam keluar
        int totalMenitMulai = jamMulaiJam * 60 + jamMulaiMenit;
        int totalMenitKeluar = jamKeluarJam * 60 + jamKeluarMenit;

        // Jika jam keluar lebih kecil dari jam mulai, maka tambahkan 24 jam
        if (totalMenitKeluar < totalMenitMulai) {
            totalMenitKeluar += 24 * 60;
        }

        // Menghitung selisih waktu dalam menit
        int selisihMenit = totalMenitKeluar - totalMenitMulai;

        // Menghitung jam dan menit dari selisih waktu
        int jamLama = selisihMenit / 60;
        int menitLama = selisihMenit % 60;

        // Menampilkan hasil
        System.out.println("Jam Mulai (jam, menit): " + jamMulaiJam + " : " + jamMulaiMenit);
        System.out.println("Jam Keluar (jam, menit): " + jamKeluarJam + " : " + jamKeluarMenit);
        System.out.println("Lama (menit): " + selisihMenit);
        System.out.println("Lama (jam, menit): " + jamLama + " jam " + menitLama + " menit");

        scanner.close();
    }
}