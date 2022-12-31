package javaquestionsbank.switc;

public class Switch_04 {
    public static void main(String[] args) {

        /*
        Cinsiyet "Erkek" ise "Erkek" yazdırınız.
        Cinsiyet "Kadın" ise "Kız" yazdırınız.
        Cinsiyet "Erkek" ve "Kadın"dan farklıysa "Diğerleri" yazdırınız.
        Not : Bu seçenekler dışındakilerini yoksayınız
         */

   String gender = "Kadin";

   gender.toLowerCase();

   switch (gender){
       case "Erkek":
           System.out.println("Erkek");
           break;
       case "Kadin":
           System.out.println("Kiz");
           break;
       default:
           System.out.println("Digerleri");
   }






    }
}
