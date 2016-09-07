/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package penggajian;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class Penggajian extends Pegawai {
    int Gaji;
    int Proyek;
    public Penggajian(String Nama, int No, int newGaji, int Proyek) throws ClassNotFoundException{
        super(Nama, No);
        try {
            if(No == 1){
                Gaji = newGaji;
            }else if (No == 2){
                Gaji = newGaji+(10*Proyek/100);
            }else{
                Gaji = newGaji+7000000;
            }
            
            
                Class.forName("com.mysql.jdbc.Driver");
                Connection con =DriverManager.getConnection(
                    "jdbc:mysql://localhost/gaji","root", ""
                    );
               String InsertStr = "insert into gaji values ('"+Nama+"','"+No+"','"+Gaji+"')";
               
               PreparedStatement stm = (PreparedStatement)con.prepareStatement(InsertStr);
               stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Penggajian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    int getGaji(){
        return Gaji;
    }
    
}
