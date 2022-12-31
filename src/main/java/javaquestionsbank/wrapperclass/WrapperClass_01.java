package javaquestionsbank.wrapperclass;

public class WrapperClass_01 {
    public static class WrapperClass_Q01 {
        public static void main(String[] args) {
            /*
            Byte data tipinin minimum değeri ile short data tipinin maksimum değerinin toplamını
            bulmak için bir kod yazınız
            */
    
            byte min = Byte.MIN_VALUE;
            short max = Short.MAX_VALUE;
            System.out.println("min+max = " + (min + max));// concat a DIKKAT!
        }
    }
}
