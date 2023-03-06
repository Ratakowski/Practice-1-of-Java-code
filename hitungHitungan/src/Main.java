//jika kodingan disini terlihat sama arti nya kebetulan saja kalau sama.
//terinspirasi dari beberapa kodingan orang

//Satya AryaGuna
//123210140

import java.util.Scanner; 
//command menyimpan data

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        //command pengingputan untuk mengingput
        boolean ulangi = true; 
        //pengulangan
        // nama scanner "input"

        //pembuka fungsi looping
        while (ulangi) { //menu
            System.out.println("==========\nMenu Utama\n==========");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");

            System.out.print("Pilih : ");
            int pilihan = input.nextInt();
            //input pilihan berdasarkan nomor

            //double karena agar bisa mengingput angka dibalik koma
            switch (pilihan) {
                case 1: 
                //hitungbalok
                    System.out.print("Input Panjang : ");
                    double panjang = input.nextDouble();
                    System.out.print("Input Lebar : ");
                    double lebar = input.nextDouble();
                    System.out.print("Input Tinggi : ");
                    double tinggiBalok = input.nextDouble();

                    //diambli fungsi kasarnya void dari persegipanjang.java dan menghitungbidang.java
                    PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
                    System.out.println("Luas Persegi Panjang = " + persegiPanjang.hitungLuas());
                    System.out.println("Keliling Persegi Panjang = " + persegiPanjang.hitungKeliling());

                    //manggil fungsi di balok.java
                    Balok balok = new Balok(panjang, lebar, tinggiBalok);
                    System.out.println("Volume Balok = " + balok.hitungVolume());
                    System.out.println("Luas Permukaan Balok = " + balok.hitungLuasPermukaan());

                    break;
                case 2: 
                //hitungtabung2
                    System.out.print("Input Jari Jari : ");
                    double jariJari = input.nextDouble();
                    System.out.print("Input Tinggi : ");
                    double tinggiTabung = input.nextDouble();

                    //diambil fungsi menghitungruang.java dan balok.java
                    Lingkaran lingkaran = new Lingkaran(jariJari);
                    System.out.println("Luas Lingkaran = " + lingkaran.hitungLuas());
                    System.out.println("Keliling Lingkaran = " + lingkaran.hitungKeliling());

                    Tabung tabung = new Tabung(jariJari, tinggiTabung);// manggil fungsi dari tabung.java
                    System.out.println("Volume Tabung = " + tabung.hitungVolume());
                    System.out.println("Luas Permukaan Tabung = " + tabung.hitungLuasPermukaan());

                    //fungsi pengulangan
                    break;
                case 0:
                    ulangi = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
                //fungsi pengulangan
                //penutupannya
            if (ulangi) {
                System.out.print("Ulangi? (Ya: 1 || Tidak: 0) ");
                int ulang = input.nextInt();
                ulangi = ulang == 1;
                input.close(); 
                //dipakai jika menggunakan scanner agar 
                //tidak leak walaupun bisa tidak dipakai 
                 //di vsc disuruh aja sebenernya... ga pake tetep jalan
            }
        }
    }
}
