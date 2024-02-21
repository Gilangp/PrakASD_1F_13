package P1;

public class fungsi13 {
    private static int[][] stokBunga = {
            {1, 10, 5, 15, 7},
            {2, 6, 11, 9, 12},
            {3, 2, 10, 10, 5},
            {4, 5, 7, 12, 9}
    };

    private static int[] hargaBunga = {75000, 50000, 60000, 10000};

    // menampilkan pendapatan 
    public static void displayPendapatan() {
        System.out.println("Pendapatan Royal Garden");
        for (int i = 0; i < stokBunga.length; i++) {
            int pendapatanCabang = 0;
            for (int j = 1; j < stokBunga[i].length; j++) {
                pendapatanCabang += stokBunga[i][j] * hargaBunga[j - 1];
            }
            System.out.println("Pendapatan Cabang " + stokBunga[i][0] + ": " + pendapatanCabang);
        }
    }

    // mengatahui stok
    public static void displayStockBungaCabang4() {
        System.out.println("Stock Bunga pada Cabang 4:");
        for (int j = 1; j < stokBunga[3].length; j++) {
            System.out.println("Jumlah " + getNamaBunga(j) + ": " + stokBunga[3][j]);
        }
    }

    // nama bunga berdasarkan indeks
    private static String getNamaBunga(int index) {
        switch (index) {
            case 1:
                return "Aglonema";
            case 2:
                return "Keladi";
            case 3:
                return "Alocasia";
            case 4:
                return "Mawar";
            default:
                return "";
        }
    }

    // pengurangan stok bunga 
    public static void penguranganStockBunga() {
        int cabangIndex = 3; // Cabang RoyalGarden 4
        int[] pengurangan = {-1, -2, 0, -5}; // Pengurangan stok untuk setiap jenis bunga

        for (int i = 1; i < stokBunga[cabangIndex].length; i++) {
            stokBunga[cabangIndex][i] += pengurangan[i - 1];
        }

        System.out.println("Stock Bunga setelah pengurangan:");
        for (int j = 1; j < stokBunga[cabangIndex].length; j++) {
            System.out.println("Jumlah " + getNamaBunga(j) + ": " + stokBunga[cabangIndex][j]);
        }
    }

    public static void main(String[] args) {
        displayPendapatan();

        displayStockBungaCabang4();

        penguranganStockBunga();
    }
}
