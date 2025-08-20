/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package banhang.manager;

import banhang.entity.SanPham;

/**
 *
 * @author ADMIN
 */
public interface SanPhamController extends CrudController<SanPham>{
    void fillLoaiSanPham();
    void fillSanPhamTheoLoai();
    void search();
    void refresh();
    int generateNewMaSP();
    void validateGia();
}
