package javaquestionsbank.switc;

public class Switch_01 {
    public static void main(String[] args) {
        /*
        Yazdırmak için switch ifadesini kullanınız.
        a) Aralık, Ocak, Şubat için "Kış"
        b) Mart, Nisan, Mayıs için "Bahar"
        c) Haziran, Temmuz, Ağustos için "Yaz"
        d) Eylül, Ekim, Kasım için "Güz"
        e) Diğerleri için "Geçersiz ay adı"
         */

        String ayAdi = "Eylul";
        ayAdi.toLowerCase();

        switch (ayAdi) {
            case "Aralik":
            case "Ocak":
            case "Subat":
                System.out.println("Kis");
                break;
            case "Mart":
            case "Nisan":
            case "Mayis":
                System.out.println("Bahar");
                break;
            case "Haziran":
            case "Temmuz":
            case "Agustos":
                System.out.println("Yaz");
                break;
            case "Eylul":
            case "Ekim":
            case "Kasim":
                System.out.println("Guz");
                break;
                default:
                    System.out.println("Gecersiz Ay Adi");
                break;

        }


    }
}
