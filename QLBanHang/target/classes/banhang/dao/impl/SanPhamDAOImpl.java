/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banhang.dao.impl;

import banhang.dao.SanPhamDAO;
import banhang.entity.SanPham;
import banhang.util.XJdbc;
import banhang.util.XQuery;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class SanPhamDAOImpl implements SanPhamDAO{
    
    private final String createSql = "INSERT INTO SANPHAM(MASP, TENSP, DVT, NUOCSX, GIA , MALOAI) VALUES(?, ?, ?, ?, ?, ?)";
    private final String updateSql = "UPDATE SANPHAM SET TENSP=?, DVT=?, NUOCSX=?, GIA=?, MALOAI=? WHERE MASP=?";
    private final String deleteByIdSql = "DELETE FROM SANPHAM WHERE MASP=?";
    private final String findAllSql = "SELECT * FROM SANPHAM";
    private final String findByIdSql = "SELECT * FROM SANPHAM WHERE MASP=?";
    private final String findByMaLoaiSql = "SELECT * FROM SANPHAM WHERE MALOAI=?";
    private final String findByNameSql = "SELECT * FROM SANPHAM WHERE MASP LIKE ? OR TENSP LIKE ?";
    
    @Override
    public SanPham create(SanPham entity) {
        Object[] values = {
            entity.getMasp(),
            entity.getTensp(),
            entity.getDvt(),
            entity.getNuocsx(),
            entity.getGia(),
            entity.getMaloai()

        };
        XJdbc.executeUpdate(createSql, values);
        return entity;
    }

    @Override
    public void update(SanPham entity) {
        Object[] values = {
            entity.getTensp(),
            entity.getDvt(),
            entity.getNuocsx(),
            entity.getGia(),
            entity.getMaloai(),
            entity.getMasp()
        };
        XJdbc.executeUpdate(updateSql, values);
    }

    @Override
    public void deleteById(String id) {
        XJdbc.executeUpdate(deleteByIdSql, id);
    }

    @Override
    public List<SanPham> findAll() {
        return XQuery.getBeanList(SanPham.class, findAllSql);
    }

    @Override
    public SanPham findById(String id) {
        return XQuery.getSingleBean(SanPham.class, findByIdSql, id);
    }

    @Override
    public List<SanPham> findByMaLoai(String maloai) {
        return XQuery.getBeanList(SanPham.class, findByMaLoaiSql, maloai);
    }

    @Override
    public List<SanPham> findByName(String keyword) {
        return XQuery.getBeanList(SanPham.class, findByNameSql, "%" + keyword + "%", "%" + keyword + "%");
    }
}
