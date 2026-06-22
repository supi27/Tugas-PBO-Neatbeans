/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package masjid_bilal;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/*
 *
 * @author User
 */
public class keuangan {
    private String idKeuangan, tanggal, deskripsi, penerima, posisi,keterangan;
    private Integer jumlah;
    
    private ArrayList<String> dataTanggal;
    private ArrayList<String> dataDeskripsi;
    private ArrayList<String> dataPenerima;
    private ArrayList<String> dataPosisi;
    private ArrayList<String> dataKeterangan;
    private ArrayList<String> dataIdKeuangan;
    private ArrayList<Integer> dataJumlah;
    
    public keuangan(){
        this.dataTanggal = new ArrayList<>();
        this.dataDeskripsi = new ArrayList<>();
        this.dataPenerima = new ArrayList<>();
        this.dataPosisi = new ArrayList<>();
        this.dataKeterangan = new ArrayList<>();
        this.dataIdKeuangan = new ArrayList<>();
        this.dataJumlah = new ArrayList<>();
    }
    
    public keuangan(String id, String tgl, String desk, String penerima, Integer jml, String pos, String ket){
        this.idKeuangan = id;
        this.tanggal = tgl;
        this.deskripsi = desk;
        this.penerima = penerima;
        this.jumlah = jml;
        this.posisi = pos;
        this.keterangan = ket;
        
        this.dataTanggal = new ArrayList<>();
        this.dataDeskripsi = new ArrayList<>();
        this.dataPenerima = new ArrayList<>();
        this.dataPosisi = new ArrayList<>();
        this.dataKeterangan = new ArrayList<>();
        this.dataIdKeuangan = new ArrayList<>();
        this.dataJumlah = new ArrayList<>();
    }
    
    public void inputTanggal(String isi){
        this.dataTanggal.add(isi);
    }
    
    public void inputDeskripsi(String isi){
        this.dataDeskripsi.add(isi);
    }
    
    public void inputPenerima(String isi){
        this.dataPenerima.add(isi);
    }
    
    public void inputPosisi(String isi){
        this.dataPosisi.add(isi);
    }
    
    public void inputKeterangan(String isi){
        this.dataKeterangan.add(isi);
    }
    
    public void inputIdKeuangan(String isi){
        this.dataIdKeuangan.add(isi);
    }
    
    public void inputJumlah(Integer isi){
        this.dataJumlah.add(isi);
    }
    
    public ArrayList<String> listDataTanggal(){
        return this.dataTanggal;
    }
    
    public ArrayList<String> listDataDeskripsi(){
        return this.dataDeskripsi;
    }
    
    public ArrayList<String> listDataPenerima(){
        return this.dataPenerima;
    }
    
    public ArrayList<String> listDataPosisi(){
        return this.dataPosisi;
    }
    
    public ArrayList<String> listDataketerangan(){
        return this.dataKeterangan;
    }
    
    public ArrayList<String> listDataIdKeuangan(){
        return this.dataIdKeuangan;
    }
    
    public ArrayList<Integer> listDataJumlah(){
        return this.dataJumlah;
    }
    
    public String getId(){
        return this.idKeuangan;
    }
    
    public String getTgl() {
        return this.tanggal;
    }
    
    public String getDesk() {
        return this.deskripsi;
    }
    
    public String getPenerima() {
        return this.penerima;
    }
    
    public Integer getJml() {
        return this.jumlah;
    }
    
    public String getPosisi() {
        return this.posisi;
    }
    
    public String getKet() {
        return this.keterangan;
    }
    
    public void setKode(String id) {
        this.idKeuangan = id;
    }
    
    public void setTgl (String tgl) {
        this.tanggal = tgl;
    }
    
    public void setDesk(String desk) {
        this.deskripsi = desk;
    }
    
    public void setPenerima(String penerima) {
        this.penerima = penerima;
    }
    
    public void setjml(Integer jml){
        this.jumlah = jml;
    }
    
    public void setPos(String pos){
        this.posisi = pos;
    }
    
    public void setKet(String ket){
        this.keterangan = ket;
    }
    
    public void cekData(){
        String pesan ="ID: "+listDataIdKeuangan()+"\n"+"Usename: "+listDataTanggal()+"\n"+
                "Deskripsi: "+listDataDeskripsi()+"\n"+"Penerima: "+listDataPenerima()+"\n"+
                "IKeterangan: "+listDataketerangan()+"\n"+"Posisi: "+listDataPosisi()+"\n"+
                "Jumlah: "+listDataJumlah()+"\n";
        JOptionPane.showMessageDialog(null, pesan);
   
    }
    
    public int getIndexArray(String id){
        int i = this.dataIdKeuangan.indexOf(id);
        if (i < 0){
            i = -1;
        }
        return i;
    }
    
    public void ubahDataArray(String id, String tgl, String desk, String penerima, String ket, String pos, Integer jml){
        int i = getIndexArray(id);
        this.dataIdKeuangan.remove(i);
        this.dataTanggal.remove(i);
        this.dataDeskripsi.remove(i);
        this.dataPenerima.remove(i);
        this.dataKeterangan.remove(i);
        this.dataPosisi.remove(i);
        this.dataJumlah.remove(i);
        
        inputIdKeuangan(id);
        inputTanggal(tgl);
        inputDeskripsi(desk);
        inputPenerima(penerima);
        inputKeterangan(ket);
        inputPosisi(pos);
        inputJumlah(jml);
    }
    
    public void hapusdataArray(String id){
        int i = getIndexArray(id);
        this.dataIdKeuangan.remove(i);
        this.dataTanggal.remove(i);
        this.dataDeskripsi.remove(i);
        this.dataPenerima.remove(i);
        this.dataKeterangan.remove(i);
        this.dataPosisi.remove(i);
        this.dataJumlah.remove(i);
    }
}
