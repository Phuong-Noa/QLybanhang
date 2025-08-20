/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banhang.dao.impl;

import banhang.dao.UserDAO;
import banhang.entity.User;
import banhang.util.XJdbc;
import banhang.util.XQuery;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class UserDAOImpl implements UserDAO{
    
    private final String createSql = "INSERT INTO Users(TENDANGNHAP, MATKHAU, TRANGTHAI, HOTEN, CHUCVU) VALUES(?, ?, ?, ?, ?)";
    private final String updateSql = "UPDATE Users SET MATKHAU=?, TRANGTHAI=?, HOTEN=?, CHUCVU=? WHERE TENDANGNHAP=?";
    private final String deleteByIdSql = "DELETE FROM Users WHERE TENDANGNHAP=?";
    
    private final String findAllSql = "SELECT * FROM Users";
    private final String findByIdSql = "SELECT * FROM Users WHERE TENDANGNHAP=?";

    @Override
    public User create(User entity) {
        Object[] values = {
            entity.getTendangnhap(),
            entity.getMatkhau(),
            entity.isTrangthai(),
            entity.getHoten(),
            entity.isChucvu()
                
        };
        XJdbc.executeUpdate(createSql, values);
        return entity;
    }

    @Override
    public void update(User entity) {
        Object[] values = {
            entity.getMatkhau(),
            entity.isTrangthai(),
            entity.getHoten(),
            entity.isChucvu(),
            entity.getTendangnhap()
        };
        XJdbc.executeUpdate(updateSql, values);    
    }

    @Override
    public void deleteById(String id) {
        XJdbc.executeUpdate(deleteByIdSql, id);    
    }

    @Override
    public List<User> findAll() {
        return XQuery.getBeanList(User.class, findAllSql);
    }

    @Override
    public User findById(String id) {
        return XQuery.getSingleBean(User.class, findByIdSql, id);
    }
    
}
