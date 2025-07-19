/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package banhang.manager;

import banhang.entity.NhanVien;

/**
 *
 * @author ADMIN
 */
public interface NhanVienController extends CrudController<NhanVien>{
    void search();
    void validateSDT();
}
