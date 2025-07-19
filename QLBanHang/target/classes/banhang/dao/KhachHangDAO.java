/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package banhang.dao;

import banhang.entity.KhachHang;
import java.util.List;
/**
 *
 * @author ADMIN
 */
public interface KhachHangDAO extends CrudDAO<KhachHang, Integer>{
    List<KhachHang> findByName(String keyword);
}
