package javaquestionsbank.ifstatements;

import java.util.Scanner;

public class IfStatement_09 {
    public static void main(String[] args) {
        /*
        Herhangi bir 2 sayıyla toplama, çıkarma, çarpma ve bölme yapan basit bir hesap makinesi
        oluşturmak için kod yazınız.
        a) Kullanıcı 10.2 ve 5 ve + işaretini girdiğinde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
        b) Kullanıcı 10 ve 5 ve - işaretini girdiğinde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
        c) Kullanıcı 10 ve 5.3 ve * işaretini girdiğinde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
        d) Kullanıcı 10 ve -5 ve / işaretini girdiğinde kodunuz konsolda "Sonuç -2.0" yazmalıdır.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Iki Sayi Giriniz");
        double a =input.nextDouble();
        double b =input.nextDouble();
        System.out.println("Lutfen Yapmak Istediginiz Islemi Seciniz\n1-Toplama Yapmak Icin : '+'" +
                "\n2-Cikarma Yapmak Icin : '-'" +
                "\n3-Carpma Yapmak Icin : '*'" +
                "\n4-Bolma Yapmak Icin : '/' giriniz");
        String islem = input.next();

        if (islem.equals("+")){
            System.out.println(a+" + "+b+" = "+(a+b));
        } else if (islem.equals("-")){
            System.out.println(a+" - "+b+" = "+(a-b));
        }else if (islem.equals("*")){
            System.out.println(a+" * "+b+" = "+(a*b));
        }else if (islem.equals("/")){
            System.out.println(a+" / "+b+" = "+(a/b));
        }else {
            System.out.println("Gecersiz Deger!!! Lutfen Gecerli Bir Deger Giriniz");
        }


    }
        }
