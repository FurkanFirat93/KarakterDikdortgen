import java.util.Scanner;
public class karakterDikdortgen {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dikdörtgenin genişliğini girin: ");
        int genislik = scanner.nextInt();

        System.out.print("Dikdörtgenin yüksekliğini girin: ");
        int yukseklik = scanner.nextInt();

        System.out.print("Dikdörtgeni çizmek için kullanılacak karakteri girin: ");
        char karakter = scanner.next().charAt(0);

        for (int i = 0; i < yukseklik; i++) {
            for (int j = 0; j < genislik; j++) {
                if (i == 0 || i == yukseklik - 1 || j == 0 || j == genislik - 1) {
                    System.out.print(karakter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
