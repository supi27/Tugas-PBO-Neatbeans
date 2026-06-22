/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package masjid_bilal;

import java.util.ArrayList;
import ui.frameUtama;

/**
 *
 * @author User
 */
public class Masjid_bilal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        System.out.println("=".repeat(51)+"");
//        System.out.println(" ".repeat(19)+"Tabel Admin");
//        System.out.println("=".repeat(51)+"");
//        //CONSTRUCTOR 1
//        admin uji = new admin();
//        uji.setKode("AD001");
//        uji.setUser("admin1");
//        uji.setPass("admin111");
//        uji.setNo("085566778899");
//        uji.setEmail("admin1@gmail.com");
//        uji.setGambar("");
//        uji.setStatus("Online");
//        System.out.println("MENGGUNAKAN CONSTRUCTOR KOSONG");
//        System.out.println(uji.getKode()+", "+uji.getUser()+", "+uji.getPass()+", "+uji.getNo()+", "+uji.getEmail()+", "+uji.getStatus()+" ");
//        System.out.println();
//        
//        //CONSTRUCTOR 2
//        admin tes = new admin("AD001", "admin1", "pass123", "0812...", "mail@com","", "Online");
//        System.out.println("MENGGUNAKAN CONSTRUCTOR BERPARAMETER");
//        System.out.println("Kode Admin : " + tes.getKode());
//        System.out.println("Username   : " + tes.getUser());
//        System.out.println("Password   : " + tes.getPass());
//        System.out.println("Telepon    : " + tes.getNo());
//        System.out.println("Email      : " + tes.getEmail());
//        System.out.println("Gambar     : " + tes.getGambar());
//        System.out.println("Status     : " + tes.getStatus());
//        System.out.println();
//        
//        //ARRAY STATIC
//        System.out.println("ARRAY STATIC");
//        String daftarAdmin[] = new String[4];
//        daftarAdmin[0] = "Admin Andie";
//        daftarAdmin[1] = "Admin Kevin";
//        daftarAdmin[2] = "Admin Gaby";
//        daftarAdmin[3] = "Admin Tiany";
//        System.out.println(daftarAdmin[3]);
//        System.out.println();
//        
//        //ARRAY DINAMIS
//        System.out.println("ARRAY DINAMIS");
//        ArrayList<String> namaPelanggan = new ArrayList<>();
//        ArrayList<Integer> noPelanggan = new ArrayList<>();
//        namaPelanggan.add("Kevin");
//        namaPelanggan.add("Gabriel");
//        namaPelanggan.add("Vannesa");
//        noPelanggan.add(001);
//        noPelanggan.add(002);
//        noPelanggan.add(003);
//        noPelanggan.add(004);
//        noPelanggan.add(005);
//        noPelanggan.remove(4);
//        System.out.println(namaPelanggan);
//        System.out.println(noPelanggan);
//        System.out.print(namaPelanggan.get(2)+" ");
//        System.out.println(noPelanggan.get(0));
//        System.out.println();
//        
//        //Tabel Keuangan
//        System.out.println("=".repeat(128)+"");
//        System.out.println(" ".repeat(57)+"Tabel Keuangan");
//        System.out.println("=".repeat(128)+"");
//        
//        //Constructor Kosong
//        keuangan cetak = new keuangan();
//        cetak.setKode(001);
//        cetak.setTgl("2026-05-10");
//        cetak.setDesk("Infaq Jum'at");
//        cetak.setPenerima("Bendahara Masjid");
//        cetak.setjml(350000);
//        cetak.setPos("Pemasukkan");
//        cetak.setKet("Infaq Shalat Jumat");
//        System.out.println("MENGGUNAKAN CONSTRUCTOR KOSONG:");
//        System.out.println("("+cetak.getId()+", "+cetak.getTgl()+", "+cetak.getDesk()+
//                ", "+ cetak.getPenerima()+", "+cetak.getJml()+", "+cetak.getPosisi()+
//                ", "+ cetak.getKet()+") ");
//        
//        //CONSTRUCTOR BERPARAMETER
//        keuangan cetak2 = new keuangan(
//                002,
//                "2026-05-09",
//                "Bayar Listrik",
//                "PLN",
//                750000,
//                "Pengeluaran",
//                "Tagihan Listrik Masjid"           
//        );
//        System.out.println("MENGGUNAKAN CONSTRUCTOR BERPARAMETER:");
//        System.out.println("ID         : "+cetak2.getId());
//        System.out.println("Tanggal    : "+cetak2.getTgl());
//        System.out.println("Deskripsi  : "+cetak2.getDesk());
//        System.out.println("Penerima   : "+cetak2.getPenerima());
//        System.out.println("Jumlah     : "+cetak2.getJml());
//        System.out.println("Posisi     : "+cetak2.getPosisi());
//        System.out.println("Keterangan : "+cetak2.getKet());
//        System.out.println();
//        
//        //ARRAY STATIC
//        Integer harga[] = new Integer[4];
//        harga[0] = 100000;
//        harga[1] = 200000;
//        harga[2] = 300000;
//        harga[3] = 400000;
//        System.out.println("MENGGUNAKAN STATIC ARRAY");
//        System.out.println(harga[3]);
//        
//        //ARRAY DINAMIS
//        ArrayList<Integer> id = new ArrayList<>();
//        ArrayList<String> tanggal = new ArrayList<>();
//        System.out.println("MENGGUNAKAN ARRAY DINAMIS");
//        id.add(10);
//        id.add(14);
//        id.add(18);
//        id.add(27);
//        tanggal.add("2026-06-26");
//        tanggal.add("2027-07-07");
//        tanggal.add("2018-08-08");
//        id.remove(0);
//        System.out.println(id);
//        System.out.println(tanggal);
//        System.out.println("ID("+id.get(2)+"), Tanggal("+tanggal.get(1)+")");
//        System.out.println();
//        //Tabel Keuangan
//        System.out.println("+"+"-".repeat(46)+"+");
//        System.out.println("|"+" ".repeat(14)+"RIWAYAT PEMBAYARAN"+" ".repeat(14)+"|");
//        System.out.println("+"+"-".repeat(46)+"+");
//        System.out.println("| ID         : "+cetak2.getId()+" ".repeat(31)+"|");
//        System.out.println("| Tanggal    : "+cetak2.getTgl()+" ".repeat(22)+"|");
//        System.out.println("| Deskripsi  : "+cetak2.getDesk()+" ".repeat(19)+"|");
//        System.out.println("| Penerima   : "+cetak2.getPenerima()+" ".repeat(29)+"|");
//        System.out.println("| Jumlah     : "+cetak2.getJml()+" ".repeat(26)+"|");
//        System.out.println("| Posisi     : "+cetak2.getPosisi()+" ".repeat(21)+"|");
//        System.out.println("| Keterangan : "+cetak2.getKet()+" ".repeat(10)+"|");
//        System.out.println("+"+"-".repeat(46)+"+");
//        System.out.println("| "+" ".repeat(1)+"PT PLN (Persero) Unit Pelaksana Pelayanan"+" ".repeat(3)+"|");
//        System.out.println("| "+" ".repeat(13)+"(UP3) Banjarmasin"+" ".repeat(15)+"|");
//        System.out.println("+"+"-".repeat(46)+"+");

          new frameUtama().setVisible(true);
    }
    
}
