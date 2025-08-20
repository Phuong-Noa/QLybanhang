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
    
    private final String createSql = "INSERT INTO SANPHAM(TENSP, DVT, NUOCSX, GIA , MALOAI) VALUES(?, ?, ?, ?, ?)";
    private final String updateSql = "UPDATE SANPHAM SET TENSP=?, DVT=?, NUOCSX=?, GIA=?, MALOAI=? WHERE MASP=?";
    private final String deleteByIdSql = "DELETE FROM SANPHAM WHERE MASP=?";
    
    private final String findAllSql = 
            "SELECT sp.*, lsp.TENLOAI FROM SANPHAM sp "
            + "JOIN LOAISANPHAM lsp ON sp.MALOAI = lsp.MALOAI";
    
    private final String findByIdSql = 
    "SELECT sp.*, lsp.TENLOAI " +
    "FROM SANPHAM sp " +
    "JOIN LOAISANPHAM lsp ON sp.MALOAI = lsp.MALOAI " +
    "WHERE sp.MASP=?";

    private final String findByMaLoaiSql = "SELECT sp.*, lsp.TENLOAI "
            + "FROM SANPHAM sp JOIN LOAISANPHAM lsp ON sp.MALOAI = lsp.MALOAI WHERE sp.MALOAI=?";

    private final String findByNameSql = 
    "SELECT sp.*, lsp.TENLOAI " +
    "FROM SANPHAM sp " +
    "JOIN LOAISANPHAM lsp ON sp.MALOAI = lsp.MALOAI " +
    "WHERE sp.MASP LIKE ? OR sp.TENSP LIKE ?";
    
    //    private final String findAllSql = "SELECT * FROM SANPHAM";
    //    private final String findByMaLoaiSql = "SELECT * FROM SANPHAM WHERE MALOAI=?";
    //    private final String findByNameSql = "SELECT * FROM SANPHAM WHERE MASP LIKE ? OR TENSP LIKE ?";
    //    private final String findByIdSql = "SELECT * FROM SANPHAM WHERE MASP=?";
    @Override
    public SanPham create(SanPham entity) {
        Object[] values = {
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
    public List<SanPham> findAll() {
        return XQuery.getBeanList(SanPham.class, findAllSql);
    }

    @Override
    public List<SanPham> findByMaLoai(int maloai) {
        return XQuery.getBeanList(SanPham.class, findByMaLoaiSql, maloai);
    }

    @Override
    public List<SanPham> findByName(String keyword) {
        return XQuery.getBeanList(SanPham.class, findByNameSql, "%" + keyword + "%", "%" + keyword + "%");
    }

    @Override
    public void deleteById(Integer id) {
        XJdbc.executeUpdate(deleteByIdSql, id);
    }

    @Override
    public SanPham findById(Integer id) {
        return XQuery.getSingleBean(SanPham.class, findByIdSql, id);
    }
}
