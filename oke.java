package ketnoi;
//


import java.sql.Connection;
import java.sql.SQLException;



public class oke {

    public static void main(String[] args) {
        try {
            // tao ket noi den csld tren may ao fedora sever 40
            Connection kncsdl = DBConnection.getInstance().getConnection();
            if (kncsdl != null) {
                System.out.println("Ket noi den csdl thanh cong");
            } else {
                System.out.println("Loi ket noi");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("SQLException: " + e.getMessage());
        }
    }
}