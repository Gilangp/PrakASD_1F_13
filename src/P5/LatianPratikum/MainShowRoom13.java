package P5.LatianPratikum;

public class MainShowRoom13 {
    public static void main(String[] args) {
        ShowRoom13[] mobil = {
            new ShowRoom13("BMW", "M2 Coupe", 2016, 6816, 728),
            new ShowRoom13("Ford", "Fiesta ST", 2014, 3921, 575),
            new ShowRoom13("Nissan", "370Z", 2009, 4360, 657),
            new ShowRoom13("Subaru", "BRZ", 2014, 4058, 609),
            new ShowRoom13("Subaru", "Impreza WRX STI", 2013, 6255, 703),
            new ShowRoom13("Toyota", "AE86 Trueno", 1986, 3700, 553),
            new ShowRoom13("Toyota", "86/GT86", 2014, 4180, 609),
            new ShowRoom13("Volkswagen", "Golf GTI", 2014, 4180, 631)
        };

        int accTertinggi = ShowRoom13.topAccTertinggi(mobil, 0, mobil.length - 1);
        System.out.println("Top accelaration tertinggi : ");
        System.out.println("Accelaration : " + mobil[accTertinggi].topAcc);
        System.out.println("Merk         : " + mobil[accTertinggi].merk);
        System.out.println("Tipe         : " + mobil[accTertinggi].tipe);
        System.out.println("Tahun        : " + mobil[accTertinggi].tahun);
        System.out.println("");

        int accTerendah = ShowRoom13.topAccTerendah(mobil, 0, mobil.length - 1);
        System.out.println("Top accelaration terendah : ");
        System.out.println("Accelaration : " + mobil[accTerendah].topAcc);
        System.out.println("Merk         : " + mobil[accTerendah].merk);
        System.out.println("Tipe         : " + mobil[accTerendah].tipe);
        System.out.println("Tahun        : " + mobil[accTerendah].tahun);
        System.out.println("");

        System.out.println("Rata - rata Top Power Mobli : " + ShowRoom13.rataRataTopPower(mobil));
    }
}
