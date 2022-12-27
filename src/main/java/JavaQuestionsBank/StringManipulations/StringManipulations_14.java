package JavaQuestionsBank.StringManipulations;

public class StringManipulations_14 {
    public static void main(String[] args) {
        /*
        Bir String’ in belirli bir tek karaktere sahip olup olmadığını üç farklı şekilde kontrol etmek
        için kod yazınız
         */

        //1.Yol
        String s= "Said";
        boolean varmi = s.contains("a");
        System.out.println(varmi);

        //2. Yol
        boolean varmi2 = s.replaceAll("a" , "").length()>0;
        System.out.println(varmi2);

        //3. Yol
        boolean varmi3 = s.indexOf('a')==1;
        System.out.println(varmi3);


        String str = "Java";
        Boolean sonuc = s.indexOf("v")!=-1;
        System.out.println("karakteri iceriyor mu? " + sonuc);


    }
}
