//fungsi override ditaruh disitu karena yang nyambung cuman itu bisa ditaruh di fungsi lain cuman ga jelas aja
//hitungan ini diambil dari internet dan diambil dari beberapa web seperti petanikoding
//double agar bisa menghitung koma
//extends fungsi seperti void untuk di .java lainnya

class Tabung extends Lingkaran implements MenghitungRuang {
    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        super(jariJari);
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
        return 2 * super.hitungLuas() + super.hitungKeliling() * tinggi;
    }
}