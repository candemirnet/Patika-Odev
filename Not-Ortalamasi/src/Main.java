import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Değişkenler
        int matematik, kimya, fizik, biyoloji;
        System.out.println("Not Ortalaması Hesaplayan Programa Hoşgeldiniz");

        // Scanner Sınıfı Eklendi
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz :");
        matematik = inp.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya = inp.nextInt();

        System.out.print("Fizik Notunuz :");
        fizik = inp.nextInt();

        System.out.print("Biyoloji Notunuz");
        biyoloji = inp.nextInt();

        int toplam = (matematik+kimya+fizik+biyoloji);
        double sonuc = toplam/4.0;

        System.out.println("Toplam Not Ortalamanız :" + sonuc);

        boolean karsilastirma = sonuc >=60;
        String str = karsilastirma ? "Geçtiniz, Tebrikler" : "Kaldınız :(";
        System.out.println(str);
    }
}