/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package banhang.dao;

import java.util.List;
import banhang.entity.SanPham;

/**
 *
 * @author ADMIN
 */
public interface SanPhamDAO extends CrudDAO<SanPham, String>{
    List<SanPham> findByMaLoai(String maloai);
    List<SanPham> findByName(String keyword);
}
