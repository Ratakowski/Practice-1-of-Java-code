//fungsi yang ditaruh nanti di menghitungbidang.java
//hitungan ini diambil dari internet dan diambil dari beberapa web seperti petanikoding
//double agar bisa menghitung koma
//extends fungsi seperti void untuk di .java lainnya

class Lingkaran implements MenghitungBidang {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}