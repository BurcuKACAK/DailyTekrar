package javaquestionsbank.variables;

public class Variables_Q03 {
    public static void main(String[] args) {
/*
    Basit faizi bulmak için bir kod yazınız.
       Not: Basit faiz formülü = anapara * oran * yılDegeri /100
 */
        int anapara= 100000, yilDegeri = 5;
        float oran = 1.5f;

        double basitFaiz = anapara*oran*yilDegeri/100;
        System.out.println("Basit Faiz Degeri = " + basitFaiz+ "TL");


    }}
