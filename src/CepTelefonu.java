//İSMAİL AYKURT
//220706038
import java.util.Scanner;

public class CepTelefonu extends Urun {
    private  String tur;
    private int ekranYenilemeHizi;
    private int bellekKapasitesi;
    private int kameraCozunurlugu;

    public void setEkranYenilemeHizi(int ekranYenilemeHizi) {
        this.ekranYenilemeHizi = ekranYenilemeHizi;
    }

    public void setBellekKapasitesi(int bellekKapasitesi) {
        this.bellekKapasitesi = bellekKapasitesi;
    }

    public void setKameraCozunurlugu(int kameraCozunurlugu) {
        this.kameraCozunurlugu = kameraCozunurlugu;
    }

    public int getEkranYenilemeHizi() {
        return ekranYenilemeHizi;
    }

    public int getBellekKapasitesi() {
        return bellekKapasitesi;
    }

    public int getKameraCozunurlugu() {
        return kameraCozunurlugu;
    }

    @Override
    public Object urunGir(Object urun) {


        Scanner input=new Scanner(System.in);

        System.out.print("\tMarka giriniz:");
        String marka = input.nextLine();
        setMarka(marka);

        System.out.print("\tEkran yenileme hızı giriniz (Hz):");
        int ekranYenilemeHizi = input.nextInt();
        setEkranYenilemeHizi(ekranYenilemeHizi);

        System.out.print("\tBellek kapasitesi giriniz (GB):");
        int bellekKapasitesi = input.nextInt();
        setBellekKapasitesi(bellekKapasitesi);

        System.out.print("\tKamera çözünürlüğü giriniz (MP):");
        int kameraCozunurlugu = input.nextInt();
        setKameraCozunurlugu(kameraCozunurlugu);

        System.out.print("\tFiyat giriniz (TL):");
        double fiyat = input.nextDouble();
        setFiyat(fiyat);

        System.out.print("\tAdet giriniz:");
        int adet = input.nextInt();
        setAdet(adet);

        return urun;
    }

    @Override
    public void urunSorgula(Object urun) {


        System.out.println("\t---------------------------");
        System.out.println("\tMarka:" + getMarka());
        System.out.println("\tEkran yenileme hızı:" + getEkranYenilemeHizi() + "Hz");
        System.out.println("\tBellek kapasitesi:" +getBellekKapasitesi() + "GB");
        System.out.println("\tKamera çözünürlüğü:" + getKameraCozunurlugu() + "MP");
        System.out.println("\tFiyat: " + getFiyat() +"TL");
        System.out.println("\tAdet:" + getAdet());
        System.out.println("\t---------------------------");

    }
}
