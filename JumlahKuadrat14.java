import java.util.Scanner;

public class JumlahKuadrat14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        int i, j, hasil;

        for (i = 1; i <= n; i++) {
            hasil = 0;
            System.out.print("n = " + i + " → jumlah kuadrat = ");
            for (j = 1; j <= i; j++) {
                hasil += j * j;
                System.out.print(j * j);
                if (j < i) System.out.print(" + ");
            }
            System.out.println(" = " + hasil);
        }
    }
}
