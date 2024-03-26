package P5.LatianPratikum;

public class ShowRoom13 {
    String merk, tipe;
    int tahun, topAcc, topPower;

    ShowRoom13 (String merk, String tipe, int tahun, int top_acceleration, int top_power) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        topAcc = top_acceleration;
        topPower = top_power;
    }

    static int topAccTertinggi (ShowRoom13[] mobil, int l, int r) {
        if (l == r) {
            return l;
        } else {
            int mid = (l + r) / 2;
            int lMax = topAccTertinggi(mobil, l, mid);
            int rMax = topAccTertinggi(mobil, mid + 1, r);
            if (mobil[lMax].topAcc > mobil[rMax].topAcc) {
                return lMax;
            } else {
                return rMax;
            }
        }
    }

    static int topAccTerendah (ShowRoom13[] mobil, int l, int r) {
        if (l == r) {
            return l;
        } else {
            int mid = (l + r) / 2;
            int lMin = topAccTerendah(mobil, l, mid);
            int rMin = topAccTerendah(mobil, mid + 1, r);
            if (mobil[lMin].topAcc < mobil[rMin].topAcc) {
                return lMin;
            } else {
                return rMin;
            }
        }
    }

    static double rataRataTopPower (ShowRoom13[] mobil) {
        double totalPower = 0;
        int jmlMobil = mobil.length;
        for (int i = 0; i < jmlMobil; i++) {
            totalPower += mobil[i].topPower;
        }
        return totalPower / jmlMobil;
    }
}
