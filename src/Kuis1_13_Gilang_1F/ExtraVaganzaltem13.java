package Kuis1_13_Gilang_1F;

public class ExtraVaganzaltem13 {
    public String nama, category;
    public int stock, price;

    public ExtraVaganzaltem13(String nama, String kategori, int stok, int harga) {
        this.nama = nama;
        category = kategori;
        stock = stok;
        price = harga;
    }

    void addData(ExtraVaganzaltem13 [] ExtraVaganzaltem) {
    }

    void tampilData() {
        System.out.println("nama : " + nama);
        System.out.println("category : " + category);
        System.out.println("stock : " + stock);
        System.out.println("price : " + price);
    }
}
