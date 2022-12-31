package javaquestionsbank.stringmanipulations;

public class StringManipulations_05 {
    public static void main(String[] args) {
        /*
        Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
        karakteri yazdırınız.
            Örnek:'Ali Can' için n yazdırmalısınız.
            ‘Miami’ için i yazdırmalısınız
         */
    String a = "Ali Can     ";
    int a1 = a.trim().length()-1;
    String a2 = a.substring(a1 , a1+1);
    System.out.println(a2);



    String d = "Nana";
    int d1= d.trim().length()-1;
    String d2 = d.substring(d1 , d1+1);
        System.out.println(d2);




    String b = "Miami";
    int b1 = b.trim().length()-1;
    String b2 = b.substring(b1 , b1+1);
        System.out.println(b2);




        String c = "Betul";
        int c1 = c.trim().length()-1;
        String c2 = c.substring(c1,c1+1);
        System.out.println(c2);

    }
}
