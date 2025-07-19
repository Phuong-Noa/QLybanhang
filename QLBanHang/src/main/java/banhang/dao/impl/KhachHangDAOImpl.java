/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banhang.dao.impl;

import banhang.dao.KhachHangDAO;
import banhang.entity.KhachHang;
import banhang.util.XJdbc;
import banhang.util.XQuery;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class KhachHangDAOImpl implements KhachHangDAO{
    
    private final String createSql = "INSERT INTO KHACHHANG(HOTEN, DCHI, SODT, NGSINH, TONGTIEN) VALUES(?, ?, ?, ?, ?)";
    private final String updateSql = "UPDATE KHACHHANG SET HOTEN=?, DCHI=?, SODT=?, NGSINH=?, TONGTIEN=? WHERE MAKH=?";
    private final String deleteByIdSql = "DELETE FROM KHACHHANG WHERE MAKH=?";
    private final String findAllSql = "SELECT * FROM KHACHHANG";
    private final String findByIdSql = "SELECT * FROM KHACHHANG WHERE MAKH=?";
    private final String findByNameSql = "SELECT * FROM KHACHHANG WHERE HOTEN LIKE ?";

    @Override
    public List<KhachHang> findByName(String keyword) {
        return XQuery.getBeanList(KhachHang.class, findByNameSql, "%" + keyword + "%");
    }

    @Override
    public KhachHang create(KhachHang entity) {
        Object[] values = {
            entity.getHoten(),
            entity.getDchi(),
            entity.getSodt(),
            entity.getNgsinh(),
            entity.getTongtien()

        };
        XJdbc.executeUpdate(createSql, values);
        return entity;
    }

    @Override
    public void update(KhachHang entity) {
        Object[] values = {
            entity.getHoten(),
            entity.getDchi(),
            entity.getSodt(),
            entity.getNgsinh(),
            entity.getTongtien(),
            entity.getMakh()
        };
        XJdbc.executeUpdate(updateSql, values);
    }
    
    @Override
    public List<KhachHang> findAll() {
        return XQuery.getBeanList(KhachHang.class, findAllSql);
    }

    @Override
    public void deleteById(Integer id) {
        XJdbc.executeUpdate(deleteByIdSql, id);
    }

    @Override
    public KhachHang findById(Integer id) {
        return XQuery.getSingleBean(KhachHang.class, findByIdSql, id);
    }
}
