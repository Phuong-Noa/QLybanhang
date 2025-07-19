/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banhang.dao.impl;

import banhang.dao.NhanVienDAO;
import banhang.entity.NhanVien;
import banhang.util.XJdbc;
import banhang.util.XQuery;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class NhanVienDAOImpl implements NhanVienDAO{
    
    private final String createSql = "INSERT INTO NHANVIEN(HOTEN, SODT, NGVL) VALUES(?, ?, ?)";
    private final String updateSql = "UPDATE NHANVIEN SET HOTEN=?, SODT=?, NGVL=? WHERE MANV=?";
    private final String deleteByIdSql = "DELETE FROM NHANVIEN WHERE MANV=?";
    private final String findAllSql = "SELECT * FROM NHANVIEN";
    private final String findByIdSql = "SELECT * FROM NHANVIEN WHERE MANV=?";
    private final String findByNameSql = "SELECT * FROM NHANVIEN WHERE HOTEN LIKE ?";
    
    @Override
    public NhanVien create(NhanVien entity) {
        Object[] values = {
            entity.getHoten(),
            entity.getSodt(),
            entity.getNgvl()
                
        };
        XJdbc.executeUpdate(createSql, values);
        return entity;    }

    @Override
    public void update(NhanVien entity) {
        Object[] values = {
            entity.getHoten(),
            entity.getSodt(),
            entity.getNgvl(),
            entity.getManv()
        };
        XJdbc.executeUpdate(updateSql, values);     }

    @Override
    public List<NhanVien> findAll() {
        return XQuery.getBeanList(NhanVien.class, findAllSql);
    }

    @Override
    public List<NhanVien> findByName(String keyword) {
        return XQuery.getBeanList(NhanVien.class, findByNameSql, "%" + keyword + "%");
    }

    @Override
    public void deleteById(Integer id) {
        XJdbc.executeUpdate(deleteByIdSql, id);
    }

    @Override
    public NhanVien findById(Integer id) {
        return XQuery.getSingleBean(NhanVien.class, findByIdSql, id);
    }
}
