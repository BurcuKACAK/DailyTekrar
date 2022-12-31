package javaquestionsbank.Ternary;

public class Ternary_01 {
    public static void main(String[] args) {
        /*
        Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
        Parola boşluk karakterinden farklı olarak en az 8 karakter içeriyorsa, "Geçerli Parola",
        Parola boşluk karakterinden farklı olarak 8 karakterden daha az ise, "Geçersiz Parola"
         */
   String parola = "abc45678";

   String gecerliMi = parola.replaceAll("\\s","").length() >=8 ? "Gecerli Parola" : "Gecersiz Parola";

        System.out.println(gecerliMi);




    }
}
