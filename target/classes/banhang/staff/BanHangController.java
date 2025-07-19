/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package banhang.staff;

import banhang.manager.LoaiSanPhamJDialog;
import banhang.manager.NhanVienJDialog;
import banhang.manager.TaiKhoanJDialog;
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
    
    default void showLoginJDialog(JFrame frame) {
        this.showJDialog(new LoginJDialog(frame, true));
    }

    default void showChangePasswordJDialog(JFrame frame) {
        this.showJDialog(new ChangePasswordJDialog(frame, true));
    }
    
    default void showNhanVienJDialog(JFrame frame) {
        this.showJDialog(new NhanVienJDialog(frame, true));
    }
    
    default void showUserJDialog(JFrame frame) {
        this.showJDialog(new TaiKhoanJDialog(frame, true));
    }
    
    default void showLoaiSanPhamJDialog(JFrame frame) {
        this.showJDialog(new LoaiSanPhamJDialog(frame, true));
    }
    
    default void showSanPhamJDialog(JFrame frame) {
        this.showJDialog(new SanPhamJDialog(frame, true));
    }
    
    default void showKhachHangJDialog(JFrame frame) {
        this.showJDialog(new KhachHangJDialog(frame, true));
    }
}
