package javaquestionsbank.ifstatements;

import java.util.Scanner;

public class IfStatement_02 {
    public static void main(String[] args) {
        /*
        Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
a) Şifre boşluk karakterinden farklı en az 8 karakter içeriyorsa "Geçerli Şifre"
b) Herhangi bir pozisyonda şifrede boşluk karakteri varsa "Şifrede boşluk karakteri kullanmayınız"
c) a ve b koşullarının sağlanmaması durumunda "Geçersiz Şifre"
Not: Çözümdeki koşulların sıralarına dikkat ediniz
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen en az 8 karakterli bir sifre giriniz");
        String sifre = input.next();

        boolean sifreUzunlugu = sifre.replaceAll(" ", "").length()>=8;
        boolean boslukVarmi = sifre.replaceAll("\\S", "").length()>0;

        if (boslukVarmi==true){
            System.out.println("Şifrede boşluk karakteri kullanmayınız!!!");
        }else if (sifreUzunlugu==true){
            System.out.println("Gecerli Sifre");
        }else {
            System.out.println("Gecersiz Sifre");
        }




    }
}
