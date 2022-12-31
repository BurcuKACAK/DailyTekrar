package javaquestionsbank.ifstatements;

import java.util.Scanner;

public class IfStatement_01 {
    public static void main(String[] args) {


    /*
    Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
a) Aralık, Ocak, Şubat için "Kış"
b) Mart, Nisan, Mayıs için "İlkbahar"
c) Haziran, Temmuz, Ağustos için "Yaz"
d) Eylül, Ekim, Kasım için "Sonbahar"
e) Diğerleri için "Geçersiz ay adı"
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Bir Ay Adi Giriniz");
         String ayAdi = input.next();

            if (ayAdi.equalsIgnoreCase("Aralik") ||
                    (ayAdi.equalsIgnoreCase("Ocak")) ||
                    (ayAdi.equalsIgnoreCase("Subat"))) {
                System.out.println("Kis");
        }else if ((ayAdi.equalsIgnoreCase("Mart"))||
                    (ayAdi.equalsIgnoreCase("Nisan"))||
                    (ayAdi.equalsIgnoreCase("Mayis"))){
                System.out.println("Ilkbahar");
            } else if ((ayAdi.equalsIgnoreCase("Haziran")) ||
                    (ayAdi.equalsIgnoreCase("Temmuz")) ||
                    (ayAdi.equalsIgnoreCase("Agustos"))) {
                System.out.println("Yaz");
            }else if ((ayAdi.equalsIgnoreCase("Eylul"))||
                    (ayAdi.equalsIgnoreCase("Ekim"))||
                    (ayAdi.equalsIgnoreCase("Kasim"))){
            }else {
                System.out.println("Lutfen gecerli bir ay adi giriniz");
            }


    }
}
