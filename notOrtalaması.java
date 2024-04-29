import java.util.Scanner;

/*
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan
ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not: Ternary Operator ya da Switch Case kullanarak yapılacak.
 */
public class notOrtalaması {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik notlarınızı girin: ");

        int[] notlar = new int[]{input.nextInt()};

        int toplam = 0;

        for (int index = 0; index < notlar.length; index++){
            toplam += notlar[index];
        }
        int ortalama = toplam / notlar.length;

        String sonuc = (ortalama > 60) ? "Sınıfı geçtiniz" : "Sınıfta kaldınız";  //TERNARY OPERATOR
        System.out.println("Ortalamanız : " + ortalama+ "\nDersten geçme durumunuz: " + sonuc);
    }
}
