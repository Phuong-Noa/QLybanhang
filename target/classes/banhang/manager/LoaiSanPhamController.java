/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package banhang.manager;

import banhang.entity.LoaiSanPham;

/**
 *
 * @author ADMIN
 */
public interface LoaiSanPhamController extends CrudController<LoaiSanPham>{
    void search();
    void refresh();
    int generateNewMaLoai();
    void validateTenLoai();
}
