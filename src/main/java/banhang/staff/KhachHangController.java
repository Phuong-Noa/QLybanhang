/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package banhang.staff;

import banhang.entity.KhachHang;
import banhang.manager.CrudController;

/**
 *
 * @author ADMIN
 */
public interface KhachHangController extends CrudController<KhachHang>{
    void search();
    void validateSDT();
    void validateTongTien();
    void validateHoTen();
    void validateNgaySinh();
    void refresh();
    int generateNewMaKH();
}
