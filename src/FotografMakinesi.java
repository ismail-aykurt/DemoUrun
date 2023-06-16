
import java.util.Scanner;

public class FotografMakinesi extends Urun {
    private int dijitalZoom;
    private int optikZoom;

    public int getDijitalZoom() {
        return dijitalZoom;
    }

    public void setDijitalZoom(int dijitalZoom) {
        this.dijitalZoom = dijitalZoom;
    }

    public int getOptikZoom() {
        return optikZoom;
    }

    public void setOptikZoom(int optikZoom) {
        this.optikZoom = optikZoom;
    }

    @Override
    public Object urunGir(Object urun) {

        Scanner input=new Scanner(System.in);
        System.out.print("\tMarka giriniz:");
        String marka=input.nextLine();
        setMarka(marka);

        System.out.print("\tDijital zoom değeri giriniz:");
        int dijitalZoom=input.nextInt();
        setDijitalZoom(dijitalZoom);

        System.out.print("\tOptik zoom değeri giriniz:");
        int optikZoom=input.nextInt();
        setOptikZoom(optikZoom);

        System.out.print("\tFiyat giriniz (TL):");
        double fiyat=input.nextDouble();
        setFiyat(fiyat);

        System.out.print("\tAdet giriniz:");
        int adet=input.nextInt();
        setAdet(adet);

        return urun;

    }

    @Override
    public void urunSorgula(Object urun) {

        System.out.println("\t---------------------------");
        System.out.println("\tMarka:"+getMarka());
        System.out.println("\tDijital zoom:"+getDijitalZoom()+"X");
        System.out.println("\tOptik zoom:"+getOptikZoom()+"X");
        System.out.println("\tFiyat:"+getFiyat()+"TL");
        System.out.println("\tAdet:"+getAdet());
        System.out.println("\t---------------------------");


    }
}
