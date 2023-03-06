//fungsi override ditaruh disitu karena yang nyambung cuman itu bisa ditaruh di fungsi lain cuman ga jelas aja
//hitungan ini diambil dari internet dan diambil dari beberapa web seperti petanikoding
//double agar bisa menghitung koma
//extends fungsi seperti void untuk di .java lainnya

class PersegiPanjang implements MenghitungBidang {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}