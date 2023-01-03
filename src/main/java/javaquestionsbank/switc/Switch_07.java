package javaquestionsbank.switc;

import java.util.Scanner;

public class Switch_07 {

 /*
 Bir Enum oluşturun ve içine CHROME, SAFARI, IE, FIREFOX, YANDEX gibi tarayıcı adlarını
koyunuz. Switch ifadesini kullanın ve CHROME için 'CHROME kullanıyorum', SAFARI için
'SAFARI kullanıyorum', 'IE için IE kullanıyorum', 'FIREFOX için FIREFOX kullanıyorum' ve
YANDEX için 'YANDEX kullanıyorum', CHROME, SAFARI, IE, FIREFOX, YANDEX'ten farklı
tarayıcılar için 'Geçersiz tarayıcı' yazınız.
Not: Geliştirici konsolunda enum oluşturmalısınız
  */

      public   enum Browsers {CHROME, SAFARI, IE, FIREFOX, YANDEX}
    public static void main(String[] args) {
    String browser = Browsers.CHROME.toString();

        switch (browser){
            case "CHROME":
                System.out.println("CHROME kullanıyorum");
                break;
            case "SAFARI":
                System.out.println("SAFARI kullanıyorum");
                break;
            case "IE":
                System.out.println("IE kullanıyorum");
                break;
            case "FIREFOX":
                System.out.println("FIREFOX kullanıyorum");
                break;
            case "YANDEX":
                System.out.println("YANDEX kullanıyorum");
                break;
            default:
                System.out.println("Geçersiz tarayıcı");

        }

    }
}
