/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package banhang.dao;

import banhang.entity.NhanVien;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface NhanVienDAO extends CrudDAO<NhanVien, Integer>{
    List<NhanVien> findByName(String keyword);
}
