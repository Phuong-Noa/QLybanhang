/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package banhang.manager;

import banhang.entity.TaiKhoan;

/**
 *
 * @author ADMIN
 */
public interface TaiKhoanController extends CrudController<TaiKhoan>{
    void search();
    void validateMANV();
    void validateHoTen();
    void refresh();
    void initTableRenderer();
}
