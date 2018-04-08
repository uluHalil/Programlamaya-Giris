import java.util.Scanner;

public class dialog {

    public static Scanner read =new Scanner(System.in);

    public static void main(String[] args) {

            try {
                System.out.println("Matris Giriniz :");
                int deg = read.nextInt();
                for (int i = 0; i < deg; i++) {
                    for (int j = deg-1;j>=0; j--) {
                        System.out.print((i == j) ? "1" : "0");
                    }
                    System.out.println();
                }

            } catch (Exception e) {
                System.out.println("Lütfen Intager Değer Giriniz.");

            }
            }

}
