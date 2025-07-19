/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package banhang.dao;

import banhang.entity.LoaiSanPham;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface LoaiSanPhamDAO extends CrudDAO<LoaiSanPham, String>{
    List<LoaiSanPham> findByName(String keyword);
}
