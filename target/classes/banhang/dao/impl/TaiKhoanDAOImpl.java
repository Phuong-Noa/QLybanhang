/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banhang.dao.impl;

import banhang.dao.TaiKhoanDAO;
import banhang.entity.TaiKhoan;
import banhang.util.XJdbc;
import banhang.util.XQuery;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class TaiKhoanDAOImpl implements TaiKhoanDAO{

    private final String createSql = "INSERT INTO Users(TENDANGNHAP, MATKHAU, TRANGTHAI, HOTEN, CHUCVU, MANV) VALUES(?, ?, ?, ?, ?, ?)";
    private final String updateSql = "UPDATE Users SET MATKHAU=?, TRANGTHAI=?, HOTEN=?, CHUCVU=?, MANV=? WHERE TENDANGNHAP=?";
    private final String deleteByIdSql = "DELETE FROM Users WHERE TENDANGNHAP=?";

    private final String findAllSql = "SELECT * FROM Users";
    private final String findByMaNVSql = "SELECT * FROM USERS WHERE MANV=?";
    private final String findByIdSql = "SELECT * FROM Users WHERE TENDANGNHAP=?";
    private final String findByNameSql = "SELECT * FROM Users WHERE HOTEN LIKE ? OR MANV LIKE ? OR TENDANGNHAP LIKE ?";
    
    @Override
    public TaiKhoan create(TaiKhoan entity) {
        Object[] values = {
            entity.getTendangnhap(),
            entity.getMatkhau(),
            entity.isTrangthai(),
            entity.getHoten(),
            entity.isChucvu(),
            entity.getManv()
                
        };
        XJdbc.executeUpdate(createSql, values);
        return entity;
    }

    @Override
    public void update(TaiKhoan entity) {
        Object[] values = {
            entity.getMatkhau(),
            entity.isTrangthai(),
            entity.getHoten(),
            entity.isChucvu(),
            entity.getManv(),
            entity.getTendangnhap()
        };
        XJdbc.executeUpdate(updateSql, values); 
    }

    @Override
    public void deleteById(String id) {
        XJdbc.executeUpdate(deleteByIdSql, id);
    }

    @Override
    public List<TaiKhoan> findAll() {
        return XQuery.getBeanList(TaiKhoan.class, findAllSql);
    }

    @Override
    public TaiKhoan findById(String id) {
        return XQuery.getSingleBean(TaiKhoan.class, findByIdSql, id);
    }

    @Override
    public List<TaiKhoan> findByName(String keyword) {
        String like = "%" + keyword + "%";
        return XQuery.getBeanList(TaiKhoan.class, findByNameSql, like, like, like);
    }

    @Override
    public TaiKhoan findByMaNV(int manv) {
        return XQuery.getSingleBean(TaiKhoan.class, findByMaNVSql, manv);
    }

}
