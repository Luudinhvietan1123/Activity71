package Services;

import Entity.NhaCungCap;

import java.sql.*;
import java.util.ArrayList;

public class ChucNang6 {

    //Liệt kê MaDKCC, MaNhaCC, TenNhaCC, DiaChi, MaSoThue, TenLoaiDV, DonGia,
    //HangXe, NgayBatDauCC, NgayKetThucCC của tất cả các lần đăng ký cung cấp phương
    //tiện với yêu cầu những nhà cung cấp nào chưa từng thực hiện đăng ký cung cấp phương
    //tiện thì cũng liệt kê thông tin những nhà cung cấp đó ra

    private String MaDKCC, MaNhaCC, TenNhaCC, DiaChi, MaSoThue, TenLoaiDV, DonGia, HangXe, NgayBatDauCC, NgayKetThucCC;

    public ChucNang6(String MaDKCC, String MaNhaCC, String TenNhaCC, String DiaChi, String MaSoThue, String TenLoaiDV, String DonGia, String HangXe, String NgayBatDauCC, String NgayKetThucCC){
        this.MaDKCC = MaDKCC;
        this.MaNhaCC = MaNhaCC;
        this.TenNhaCC = TenNhaCC;
        this.DiaChi = DiaChi;
        this.MaSoThue = MaSoThue;
        this.TenLoaiDV = TenLoaiDV;
        this.DonGia = DonGia;
        this.HangXe = HangXe;
        this.NgayBatDauCC = NgayBatDauCC;
        this.NgayKetThucCC = NgayKetThucCC;
    }

    public static ArrayList<ChucNang6> list6 = new ArrayList<>();

    public static ArrayList setList6(){
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
            String sql = "SELECT thue_xe_cms.dangkycungcap.MaDKCC, thue_xe_cms.dangkycungcap.MaNhaCC, thue_xe_cms.nhacungcap.TenNhaCC, thue_xe_cms.nhacungcap.DiaChi, thue_xe_cms.nhacungcap.MaSoThue, thue_xe_cms.loaidichvu.TenLoaiDV, thue_xe_cms.mucphi.DonGia, thue_xe_cms.dongxe.HangXe, thue_xe_cms.dangkycungcap.NgayBatDauCungCap, thue_xe_cms.dangkycungcap.NgayKetThucCungCap\n" +
                    "FROM thue_xe_cms.dangkycungcap\n" +
                    "LEFT JOIN thue_xe_cms.nhacungcap\n" +
                    "ON thue_xe_cms.dangkycungcap.MaNhaCC = thue_xe_cms.nhacungcap.MaNhaCC\n" +
                    "LEFT JOIN thue_xe_cms.loaidichvu\n" +
                    "ON thue_xe_cms.dangkycungcap.MaLoaiDV = thue_xe_cms.loaidichvu.MaLoaiDV\n" +
                    "LEFT JOIN thue_xe_cms.mucphi\n" +
                    "ON thue_xe_cms.dangkycungcap.MaMP = thue_xe_cms.mucphi.MaMP\n" +
                    "LEFT JOIN thue_xe_cms.dongxe\n" +
                    "ON thue_xe_cms.dangkycungcap.DongXe = thue_xe_cms.dongxe.DongXe";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                ChucNang6 thisSupplier = new ChucNang6(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getString(8),
                        resultSet.getString(9),
                        resultSet.getString(10)
                );
                list6.add(thisSupplier);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return list6;
    }

}
