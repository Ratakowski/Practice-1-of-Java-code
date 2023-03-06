//fungsi yang nanti ditaruh di menghitungruang.java
//hitungan ini diambil dari internet dan diambil dari beberapa web seperti petanikoding
//double agar bisa menghitung koma
//extends fungsi seperti void untuk di .java lainnya

class Balok extends PersegiPanjang implements MenghitungRuang {
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    @Override
    public double hitungVolume() {
        return super.hitungLuas() * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 2 * (super.hitungLuas() + (getPanjang() * tinggi) + (getLebar() * tinggi));
    }
}