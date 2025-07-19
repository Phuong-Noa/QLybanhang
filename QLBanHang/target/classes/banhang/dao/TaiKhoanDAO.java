/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package banhang.dao;

import banhang.entity.TaiKhoan;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface TaiKhoanDAO extends CrudDAO<TaiKhoan, String>{
    List<TaiKhoan> findByName(String keyword);
}
