/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package masjid_bilal;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class admin {
    private String kodeAdmin,username,password,telepon,email,gambar,status;
    
//    Variabel Arraylist
    private ArrayList<String> dataKodeAdmin;
    private ArrayList<String> dataUsername;
    private ArrayList<String> dataPassword;
    private ArrayList<String> dataTelepon;
    private ArrayList<String> dataEmail;
    private ArrayList<String> dataGambar;
    private ArrayList<String> dataStatus;
    
    
    public admin(){
        this.dataKodeAdmin = new ArrayList<>();
        this.dataUsername = new ArrayList<>();
        this.dataPassword = new ArrayList<>();
        this.dataTelepon = new ArrayList<>();
        this.dataEmail = new ArrayList<>();
        this.dataGambar = new ArrayList<>();
        this.dataStatus = new ArrayList<>();
    }
    
    public admin(String kode, String usn, String pass, String telp, String email, String gb, String stat){
        this.kodeAdmin=kode;
        this.username=usn;
        this.password=pass;
        this.telepon=telp;
        this.email=email;
        this.gambar=gb;
        this.status=stat;
        
        this.dataKodeAdmin = new ArrayList<>();
        this.dataUsername = new ArrayList<>();
        this.dataPassword = new ArrayList<>();
        this.dataTelepon = new ArrayList<>();
        this.dataEmail = new ArrayList<>();
        this.dataGambar = new ArrayList<>();
        this.dataStatus = new ArrayList<>();
        
//       this.
        
    }
    
    public void inputDataKodeAdmin(String kode){
        this.dataKodeAdmin.add(kode);
    }
    
    public void inputDataUsername(String isi){
        this.dataUsername.add(isi);
    }
    
    public void inputDataPassword(String isi){
        this.dataPassword.add(isi);
    }
    
    public void inputDataTelepon(String isi){
        this.dataTelepon.add(isi);
    }
    
    public void inputDataEmail(String isi){
        this.dataEmail.add(isi);
    }
    
    public void inputDataGambar(String isi){
        this.dataGambar.add(isi);
    }
    
    public void inputDataStatus(String isi){
        this.dataStatus.add(isi);
    }
    
    public ArrayList<String> listDataKodeAdmin(){
        return this.dataKodeAdmin;
    }
    
    public ArrayList<String> listDataUsername(){
        return this.dataUsername;
    }
    
    public ArrayList<String> listDataPassword(){
        return this.dataPassword;
    }
    
    public ArrayList<String> listDataTelepon(){
        return this.dataTelepon;
    }
    
    public ArrayList<String> listDataEmail(){
        return this.dataEmail;
    }
    
    public ArrayList<String> listDataGambar(){
        return this.dataGambar;
    }
    
    public ArrayList<String> listDataStatus(){
        return this.dataStatus;
    }
    
    public String getKode(){
        return this.kodeAdmin;
    }
    
    public String getUser(){
        return this.username;
    }
    
    public String getPass(){
        return this.password;
    }
    
    public String getNo() {
        return this.telepon;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getGambar(){
        return this.gambar;
    }
    
    public String getStatus(){
        return this.status;
    }
    
    public void setKode(String kode){
        this.kodeAdmin = kode;
    }
    
    public void setUser(String usn) {
        this.username = usn;
    }
    
    public void setPass(String Pass) {
        this.password = Pass;
    }
    
    public void setNo(String nomor){
        this.telepon = nomor;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setGambar(String gambar){
        this.gambar = gambar;
    }
    
    public void setStatus (String status){
        this.status = status;
    }
    
    public void cekData(){
        String pesan = "Kode Admin: "+listDataKodeAdmin()+"\n"+"Username: "+listDataUsername()+"\n"+
                "Password: "+listDataPassword()+"\n"+"Telepon: "+listDataTelepon()+"\n"+"Email: "+listDataEmail()+"\n"+
                "Gambar: "+listDataGambar()+"\n"+"Status: "+listDataStatus()+"\n";
        JOptionPane.showMessageDialog(null, pesan);
    }
    
    public int getIndexArray(String kode){
        int i = this.dataKodeAdmin.indexOf(kode);
        if (i < 0){
            i = -1;
        }
        return i;
    }
    
    public void ubahDataArray(String kode, String usn, String pass, String telp, String email, String gambar, String Status){
        int i = getIndexArray(kode);
        this.dataKodeAdmin.remove(i);
        this.dataUsername.remove(i);
        this.dataPassword.remove(i);
        this.dataTelepon.remove(i);
        this.dataEmail.remove(i);
        this.dataGambar.remove(i);
        this.dataStatus.remove(i);
        
        inputDataKodeAdmin(kode);
        inputDataUsername(usn);
        inputDataPassword(pass);
        inputDataTelepon(telp);
        inputDataEmail(email);
        inputDataGambar(gambar);
        inputDataStatus(Status);
    }
    
    public void hapusDataArray(String kode){
        int i = getIndexArray(kode);
        this.dataKodeAdmin.remove(i);
        this.dataUsername.remove(i);
        this.dataPassword.remove(i);
        this.dataTelepon.remove(i);
        this.dataEmail.remove(i);
        this.dataGambar.remove(i);
        this.dataStatus.remove(i);
    }
    
}
