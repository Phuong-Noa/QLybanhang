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

    private final String createSql = "INSERT INTO Users(Username, Password, Enabled, Fullname, Manager, MANV) VALUES(?, ?, ?, ?, ?, ?)";
    private final String updateSql = "UPDATE Users SET Password=?, Enabled=?, Fullname=?, Manager=?, MANV=? WHERE Username=?";
    private final String deleteByIdSql = "DELETE FROM Users WHERE Username=?";

    private final String findAllSql = "SELECT * FROM Users";
    private final String findByIdSql = "SELECT * FROM Users WHERE Username=?";
    private final String findByNameSql = "SELECT * FROM Users WHERE Fullname LIKE ? OR MANV LIKE ? OR Username LIKE ?";
    
    @Override
    public TaiKhoan create(TaiKhoan entity) {
        Object[] values = {
            entity.getUsername(),
            entity.getPassword(),
            entity.isEnabled(),
            entity.getFullname(),
            entity.isManager(),
            entity.getManv()
                
        };
        XJdbc.executeUpdate(createSql, values);
        return entity;
    }

    @Override
    public void update(TaiKhoan entity) {
        Object[] values = {
            entity.getPassword(),
            entity.isEnabled(),
            entity.getFullname(),
            entity.isManager(),
            entity.getManv(),
            entity.getUsername()
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
    
}
