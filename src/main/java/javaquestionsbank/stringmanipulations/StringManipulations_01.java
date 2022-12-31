package javaquestionsbank.stringmanipulations;

public class StringManipulations_01 {
    public static void main(String[] args) {
         /*
        Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
        ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
        yazdırınız.
                Örnek: mIAMI - Miami
                miami - Miami
                MIAMI - Miami
                mIaMi - Miami vb
         */
                String city= "IsTANBUl";
                String city2 = city.toLowerCase();
                city2=city2.substring(0,1).toUpperCase()+city2.substring(1);
                System.out.println("City = " + city2);


    }
}
