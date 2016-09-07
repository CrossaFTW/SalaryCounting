/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package penggajian;

import java.sql.Connection;

/**
 *
 * @author asus
 */



public class InsertTable {
private MyDBConnection mdbc;
private java.sql.Statement stmt;

    public InsertTable() throws Exception{
        mdbc = new MyDBConnection();
        mdbc.init();
        Connection conn = mdbc.getMyConnection();
        stmt = conn.createStatement();

    }
}
