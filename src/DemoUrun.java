
import java.util.Scanner;
public class DemoUrun {
    private static Urun[] urunListesi;
    private static int girilenUrunSayisi;



    public static void baslikYazdir(){
        System.out.println("*********************************************");
        System.out.println("*** STOK ÜRÜN GİRİŞ VE SORGULAMA PROGRAMI ***");
        System.out.println("*********************************************");
    }
    public static void menuYazdir(){
        System.out.println("MENÜ:");
        System.out.println("(1) Ürün gir");
        System.out.println("(2) Ürün sorgula");
        System.out.println("(3) Ürün listesi sıfırla");
        System.out.println("(4) Programı sonlandır");
    }
    public static void menuUrunSec(){
        System.out.println("\t(1)Cep Telefonu");
        System.out.println("\t(2)Fotoğraf Makinesi");
    }
    public static void urunListesiSifirla(){
        for(int i=0; i<urunListesi.length;i++){
            urunListesi[i]=null;
        }
        girilenUrunSayisi=0;
    }

    public static void main(String[] args) {
        CepTelefonu cepTelefonu=new CepTelefonu();
        FotografMakinesi fotografMakinesi=new FotografMakinesi();
        Scanner input=new Scanner(System.in);
        DemoUrun.baslikYazdir();
        System.out.print("Stoka girilecek ürün sayısı:");
        int urunSayisi=input.nextInt();
        urunListesi=new Urun[urunSayisi];
        girilenUrunSayisi=0;
        while(true){
            DemoUrun.menuYazdir();
            System.out.print("İşlem seçiniz:");
            int islem=input.nextInt();
            System.out.println("--------------");
            if(islem<1 || islem>4){
                System.out.println("İşlem seçimi için 1 ve 4 arasında bir sayı giriniz!");
            }else{
                if(islem==1){
                    if(girilenUrunSayisi<urunListesi.length){
                        System.out.println("\tÜrün giriş");
                        DemoUrun.menuUrunSec();
                        System.out.print("\tÜrün seçiniz:");
                        int urun=input.nextInt();
                        girilenUrunSayisi++;
                        if(urun==1){
                            cepTelefonu.urunGir(cepTelefonu);


                        }else if(urun==2){
                            fotografMakinesi.urunGir(fotografMakinesi);

                        }else{
                            System.out.println("Ürün seçimi için 1 ya da 2 değerini giriniz!");
                            System.out.println("--------------------------------------------");
                        }
                    }else{
                        System.out.println("Maksimum ürün sayısı:"+urunSayisi);
                        System.out.println("Girilen ürün sayısı:"+girilenUrunSayisi);
                        System.out.println("Yeni ürün girilemez!");
                    }


                }else if(islem==2){
                    System.out.println("Ürün sorgulama");
                    while(true){
                        DemoUrun.menuUrunSec();
                        System.out.print("\tÜrün seçiniz:");
                        int secim=input.nextInt();
                        if(secim==1){
                            if(girilenUrunSayisi==0){
                                System.out.println("Ürün listesinde cep telefonu  bulunamadı!");
                                break;
                            }else{
                                cepTelefonu.urunSorgula(cepTelefonu);
                                break;
                            }

                        }else if(secim==2){
                            if(girilenUrunSayisi==0){
                                System.out.println("Ürün listesinde fotoğraf makinesi bulunamadı!");
                                break;
                            }else{
                                fotografMakinesi.urunSorgula(fotografMakinesi);
                                break;
                            }
                        }else{
                            System.out.println("Ürün seçimi için 1 yada 2 sayısını giriniz.");
                            System.out.println("");{

                            }

                        }
                    }

                }else if(islem==3){
                    DemoUrun.urunListesiSifirla();

                    System.out.println("Ürün listesi sıfırlandı");
                }else if(islem==4){
                    break;
                }
            }
        }
        System.out.println("Program sonlandırıldı");
    }
}
