/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package penggajian;

import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        String GajiPokoks = JOptionPane.showInputDialog("Masukkan Gaji Pokok");
        String Proyeks = JOptionPane.showInputDialog("Masukkan Biaya Proyek");
        int GajiPokok = Integer.parseInt(GajiPokoks);
        int Proyek = Integer.parseInt(Proyeks);
        
        Penggajian Ali = new Penggajian("Ali", 1, GajiPokok, Proyek);
        Penggajian Andi = new Penggajian("Andi", 1, GajiPokok, Proyek);
        Penggajian Rizky = new Penggajian("Rizky", 1, GajiPokok, Proyek);
        Penggajian Baihaki = new Penggajian ("Baihaki", 2, GajiPokok, Proyek);
        Penggajian Rio = new Penggajian ("Rio", 3, GajiPokok, Proyek);
        System.out.println("Pegawai "+Ali.toString());
        System.out.println("Gaji "+Ali.getName()+" Sebesar "+Ali.getGaji());
        System.out.println("___________________________________");
        System.out.println("Pegawai "+Andi.toString());
        System.out.println("Gaji "+Andi.getName()+" Sebesar "+Andi.getGaji());
        System.out.println("___________________________________");
        System.out.println("Pegawai "+Rizky.toString());
        System.out.println("Gaji "+Rizky.getName()+" Sebesar "+Rizky.getGaji());
        System.out.println("___________________________________");
        System.out.println("Pegawai "+Baihaki.toString());
        System.out.println("Gaji "+Baihaki.getName()+" Sebesar "+Baihaki.getGaji());
        System.out.println("___________________________________");
        System.out.println("Pegawai "+Rio.toString());
        System.out.println("Gaji "+Rio.getName()+" Sebesar "+Rio.getGaji());
    }
}
