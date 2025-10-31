import java.util.Scanner;

public class KafeSenja14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahCabang, jumlahPelanggan, totalPelanggan = 0, totalItem = 0;

        System.out.print("Jumlah cabang kafe: ");
        jumlahCabang = sc.nextInt();

        System.out.println("\n=== Input Penjualan Per Cabang ===");

        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("\n--- Cabang " + i + " ---");
            System.out.print("Jumlah pelanggan: ");
            jumlahPelanggan = sc.nextInt();

            int totalItemPerCabang = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int item = sc.nextInt();
                totalItemPerCabang += item;
            }

            System.out.println("Cabang " + i + ":");
            System.out.println("- Pelanggan: " + jumlahPelanggan + " orang");
            System.out.println("- Item terjual: " + totalItemPerCabang);

            totalPelanggan += jumlahPelanggan;
            totalItem += totalItemPerCabang;
        }

        System.out.println("\nTotal seluruh Cabang:");
        System.out.println("Pelanggan: " + totalPelanggan + " orang");
        System.out.println("Item terjual: " + totalItem + " item");

    }
}
