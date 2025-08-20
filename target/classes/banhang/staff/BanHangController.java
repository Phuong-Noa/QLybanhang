/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package banhang.staff;

import banhang.manager.LoaiSanPhamJFrame;
import banhang.manager.NhanVienJFrame;
import banhang.manager.SanPhamJFrameManager;
import banhang.manager.TaiKhoanJFrame;
import banhang.util.XDialog;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author ADMIN
 */
public interface BanHangController {
        /**
     * Hiển thị cửa sổ đăng nhập
     * Hiển thị thông tin user đăng nhập
     * Disable/Enable các thành phần tùy thuộc vào vai trò đăng nhập
     */
    void init();
    
    default void exit(){
        if(XDialog.confirm("Bạn muốn kết thúc?")){
            System.exit(0);
        }
    }
    default void showJDialog(JDialog dialog) {
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }
    
    default void showJFrame(JFrame frame) {
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    default void showLoginJFrame(JFrame frame) {
        LoginJFrame login = new LoginJFrame(); // <-- không truyền (frame, true)
        login.setLocationRelativeTo(frame);
        login.setVisible(true);
    }

    default void showChangePasswordJFrame(JFrame frame) {
        ChangePasswordJFrame changepassword = new ChangePasswordJFrame(); // <-- không truyền (frame, true)
        changepassword.setLocationRelativeTo(frame);
        changepassword.setVisible(true);
    }

    default void showNhanVienJFrame(JFrame frame) {
        NhanVienJFrame nhanvien = new NhanVienJFrame(); // <-- không truyền (frame, true)
        nhanvien.setLocationRelativeTo(frame);
        nhanvien.setVisible(true);
    }

    default void showUserJFrame(JFrame frame) {
        TaiKhoanJFrame taikhoan = new TaiKhoanJFrame(); // <-- không truyền (frame, true)
        taikhoan.setLocationRelativeTo(frame);
        taikhoan.setVisible(true);
    }
    
    default void showLoaiSanPhamJFrame(JFrame frame) {
        LoaiSanPhamJFrame loaisanpham = new LoaiSanPhamJFrame(); // <-- không truyền (frame, true)
        loaisanpham.setLocationRelativeTo(frame);
        loaisanpham.setVisible(true);
    }

    default void showSanPhamJFrame1(JFrame frame) {
        SanPhamJFrame1 sanpham1 = new SanPhamJFrame1(); // <-- không truyền (frame, true)
        sanpham1.setLocationRelativeTo(frame);
        sanpham1.setVisible(true);
    }
    
    default void showSanPhamJFrameManager(JFrame frame) {
        SanPhamJFrameManager sanphammanager = new SanPhamJFrameManager(); // <-- không truyền (frame, true)
        sanphammanager.setLocationRelativeTo(frame);
        sanphammanager.setVisible(true);
    }
    
    default void showKhachHangJFrame(JFrame frame) {
        KhachHangJFrame khachhang = new KhachHangJFrame(); // <-- không truyền (frame, true)
        khachhang.setLocationRelativeTo(frame);
        khachhang.setVisible(true);
    }
    
    default void showSalesJFrame(JFrame frame) {
        SalesJFrame sales = new SalesJFrame(); // <-- không truyền (frame, true)
        sales.setLocationRelativeTo(frame);
        sales.setVisible(true);
    }
    
    default void showHoaDonJFrame(JFrame frame) {
        HoaDonJFrame hoadon = new HoaDonJFrame(); // <-- không truyền (frame, true)
        hoadon.setLocationRelativeTo(frame);
        hoadon.setVisible(true);
    }
}
