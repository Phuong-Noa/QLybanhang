/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banhang.dao.impl;

import banhang.dao.LoaiSanPhamDAO;
import banhang.entity.LoaiSanPham;
import banhang.util.XJdbc;
import banhang.util.XQuery;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class LoaiSanPhamDAOImpl implements LoaiSanPhamDAO{

    private final String createSql = "INSERT INTO LOAISANPHAM(TENLOAI) VALUES(?)";
    private final String updateSql = "UPDATE LOAISANPHAM SET TENLOAI=? WHERE MALOAI=?";
    private final String deleteByIdSql = "DELETE FROM LOAISANPHAM WHERE MALOAI=?";
    private final String findAllSql = "SELECT * FROM LOAISANPHAM";
    private final String findByIdSql = "SELECT * FROM LOAISANPHAM WHERE MALOAI=?";
    private final String findByNameSql = "SELECT * FROM LoaiSanPham WHERE MaLoai LIKE ? OR TenLoai LIKE ?";
    
    @Override
    public LoaiSanPham create(LoaiSanPham entity) {
        Object[] values = {
            entity.getTenloai()

        };
        XJdbc.executeUpdate(createSql, values);
        return entity;
    }

    @Override
    public void update(LoaiSanPham entity) {
        Object[] values = {
            entity.getTenloai(),
            entity.getMaloai()
        };
        XJdbc.executeUpdate(updateSql, values);
    }

    @Override
    public List<LoaiSanPham> findAll() {
        return XQuery.getBeanList(LoaiSanPham.class, findAllSql);
    }

    @Override
    public List<LoaiSanPham> findByName(String keyword) {
        return XQuery.getBeanList(LoaiSanPham.class, findByNameSql, "%" + keyword + "%", "%" + keyword + "%");
    }

    @Override
    public void deleteById(Integer id) {
        XJdbc.executeUpdate(deleteByIdSql, id);
    }

    @Override
    public LoaiSanPham findById(Integer id) {
        return XQuery.getSingleBean(LoaiSanPham.class, findByIdSql, id);
    }

}
