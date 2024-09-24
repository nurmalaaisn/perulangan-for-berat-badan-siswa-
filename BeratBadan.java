import java.util.Scanner;

public class BeratBadan {
    public static void main(String[] args) {

        int jumlahSiswa;
        double beratBadan;
        double totalBerat = 0;
        double rataRataBerat;

        Scanner s = new Scanner(System.in);

        System.out.println("Masukkan jumlah siswa : ");
        jumlahSiswa = s.nextInt();

        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.println("Masukkan berat badan siswa ke-" + i + ": ");
            beratBadan = s.nextDouble();
            totalBerat += beratBadan;
        }
        rataRataBerat = totalBerat / jumlahSiswa;
        System.out.println("Rata-rata berat badan dari " + jumlahSiswa + " siswa adalah = " + rataRataBerat);

        s.close();
    }

}
