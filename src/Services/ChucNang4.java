package Services;

import Entity.NhaCungCap;

import java.sql.*;
import java.util.ArrayList;

public class ChucNang4 {
    // Đếm số lần đăng ký cung cấp phương tiện tương ứng cho từng nhà cung cấp với
    //yêu cầu chỉ đếm cho những nhà cung cấp thực hiện đăng ký cung cấp có ngày bắt đầu
    //cung cấp là “20/11/2015”

    private String MaNhaCC;
    private int SoLanDKCC;

    public ChucNang4(String MaNhaCC, int SoLanDKCC){
        this.MaNhaCC = MaNhaCC;
        this.SoLanDKCC = SoLanDKCC;
    }

    public static ArrayList<ChucNang4> list4 = new ArrayList<>();

    public static ArrayList setList4(){
        try{
            Class.forName("com.mysql,cj,jdbc,Driver");
        }catch(ClassNotFoundException e){}
        Connection connection = null;
        try{
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/thue_xe_cms?characterEncoding=utf8", "root", "123123");
        }catch(SQLException e){}
        try{
            Statement statement = connection.createStatement();
            String sql = "SELECT DISTINCT thue_xe_cms.dangkycungcap.MaNhaCC, COUNT(thue_xe_cms.dangkycungcap.MaNhaCC) AS SoLanDK\n" +
                    "FROM thue_xe_cms.dangkycungcap\n" +
                    "WHERE thue_xe_cms.dangkycungcap.NgayBatDauCungCap = \"2015-11-20 00:00:00\"\n" +
                    "GROUP BY thue_xe_cms.dangkycungcap.MaNhaCC";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                ChucNang4 thisSupplier = new ChucNang4(
                        resultSet.getString(1),
                        resultSet.getInt(2)
                );
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return list4;
    }

}
