import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);

        int kenara, kenarb,kenarc;

        System.out.print("Lütfen A kenarını giriniz :");
        kenara = imp.nextInt();

        System.out.print("Lütfen B kenarını giriniz :");
        kenarb = imp.nextInt();

        System.out.print("Lütfen C kenarını giriniz :");
        kenarc = imp.nextInt();

        double alan,cevre, u = (kenara+kenarb+kenarc)/2;
        cevre =2*u;
        alan = Math.sqrt(u*(u-kenara) * (u-kenarb) * (u-kenarc));

        System.out.println("Üçgenin Çevresi : " + cevre + " Üçgenin Alanı :" + alan);
    }
}