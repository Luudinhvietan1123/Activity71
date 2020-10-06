package Services;

import Entity.NhaCungCap;

import java.sql.*;
import java.util.ArrayList;

public class ChucNang2 {

    //Liệt kê thông tin của các nhà cung cấp ĐÃ TỪNG đăng ký cung cấp những dòng xe
    //thuộc hãng xe “Toyota” với mức phí có đơn giá là 15.000 VNĐ/km hoặc những dòng xe
    //thuộc hãng xe “KIA” với mức phí có đơn giá là 20.000 VNĐ/km

    public static ArrayList<NhaCungCap> list2 = new ArrayList<>();

    public static ArrayList setList2(){
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
            String sql = "SELECT * FROM thue_xe_cms.nhacungcap\n" +
                    "where thue_xe_cms.nhacungcap.MaNhaCC IN (SELECT thue_xe_cms.dangkycungcap.MaNhaCC\n" +
                    "FROM thue_xe_cms.dangkycungcap\n" +
                    "LEFT JOIN thue_xe_cms.dongxe\n" +
                    "ON thue_xe_cms.dangkycungcap.DongXe = thue_xe_cms.dongxe.DongXe\n" +
                    "LEFT JOIN thue_xe_cms.mucphi\n" +
                    "ON thue_xe_cms.dangkycungcap.MaMP = thue_xe_cms.mucphi.MaMP\n" +
                    "WHERE (thue_xe_cms.mucphi.DonGia = 15000 AND thue_xe_cms.dongxe.HangXe = \"Toyota\") OR (thue_xe_cms.mucphi.DonGia = 10000 AND thue_xe_cms.dongxe.HangXe = \"KIA\"))";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                NhaCungCap thisSupplier = new NhaCungCap(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5)
                );
                list2.add(thisSupplier);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return list2;
    }
}
