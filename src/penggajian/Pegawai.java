/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package penggajian;

/**
 *
 * @author asus
 */
public class Pegawai {
    String Nama;
    int No;
    String Jabatan;
    public Pegawai(String Nama, int No){
        this.Nama = Nama;
        this.No = No;
        if(No == 1){
            Jabatan = "Pegawai Biasa";
        }else if (No == 2){
            Jabatan = "Merketing";
        }else{
            Jabatan = "Manager";
        }
    }
    
    public String toString(){
        return Nama + " Status " + Jabatan;
    }
    
    public String getName(){
        return Nama;
    }
    
    public int getNumber(){
        return No;
    }
}
