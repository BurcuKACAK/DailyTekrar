package javaquestionsbank.variables;

public class Variables_Q02 {
    public static void main(String[] args) {
        /*
        Herhangi bir 3 öğe için float, long ve integer data tipinde değişkenler oluşturunuz. Bu
        değişkenlerin değerlerinin çarpımını konsolda yazdırınız.
         */
    Float kitap = 8.51f;
    long defter = 5;
    int kalem = 3;
    double toplamFiyat = kitap*defter*kalem;

        System.out.printf("Toplam" + "%.2f",toplamFiyat);
    }
}
