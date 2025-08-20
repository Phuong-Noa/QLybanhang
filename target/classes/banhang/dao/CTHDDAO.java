/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package banhang.dao;

import banhang.entity.CTHD;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface CTHDDAO extends CrudDAO<CTHD, Integer>{
    List<CTHD> findBySOHD(int sohd);    // tìm chi tiết theo số hóa đơn
    List<CTHD> findByMaSP(int masp);    // tìm chi tiết theo mã sản phẩm
}
