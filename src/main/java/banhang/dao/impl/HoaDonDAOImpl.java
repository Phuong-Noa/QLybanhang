/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banhang.dao.impl;

import banhang.dao.HoaDonDAO;
import banhang.entity.HoaDon;
import java.util.Date;
import java.util.List;
import banhang.util.XJdbc;
import banhang.util.XQuery;

/**
 *
 * @author ADMIN
 */
public class HoaDonDAOImpl implements HoaDonDAO{
    
    private final String createSql = "INSERT INTO HOADON (MANV, NGHD) VALUES (?, ?)";
    private final String updateSql = "UPDATE HOADON SET MANV=?, NGHD=? WHERE SOHD=?";
    private final String deleteBySOHDSql = "DELETE FROM HOADON WHERE SOHD=?";
    
    private final String findAllSql = "SELECT * FROM HOADON";
    private final String findBySOHDSql = findAllSql + " WHERE SOHD=?";
    private final String findByMaNVSql = findAllSql + " WHERE MANV=?";
    
    private final String findLastSql = findAllSql + " WHERE SOHD = (SELECT MAX(SOHD) FROM HOADON)";
    private final String findByDateRangeSql = findAllSql + " WHERE NGHD BETWEEN ? AND ?";
    private final String findByNVAndDateRangeSql = findAllSql + " WHERE MANV=? AND NGHD BETWEEN ? AND ?";
    private final String findByDateSql = findAllSql + " WHERE CONVERT(DATE, NGHD) = ?";
    
    
    @Override
    public List<HoaDon> findByMaNV(int manv) {
        return XQuery.getBeanList(HoaDon.class, findByMaNVSql, manv);
    }

    @Override
    public List<HoaDon> findByDateRange(Date from, Date to) {
        return XQuery.getBeanList(HoaDon.class, findByDateRangeSql, from, to);
    }

    @Override
    public List<HoaDon> findByNVAndDateRange(int manv, Date from, Date to) {
        return XQuery.getBeanList(HoaDon.class, findByNVAndDateRangeSql, manv, from, to);
    }

    @Override
    public List<HoaDon> findByDate(Date date) {
        return XQuery.getBeanList(HoaDon.class, findByDateSql, date);
    }

    @Override
    public HoaDon create(HoaDon entity) {
        Object[] values = {
            entity.getManv(),
            entity.getNghd(),
        };
        XJdbc.executeUpdate(createSql, values);
        return XQuery.getSingleBean(HoaDon.class, findLastSql);
    }

    @Override
    public void update(HoaDon entity) {
        Object[] values = {
            entity.getManv(),
            entity.getNghd(),
            entity.getSohd()
        };
        XJdbc.executeUpdate(updateSql, values);
    }

    @Override
    public void deleteById(Integer id) {
        XJdbc.executeUpdate(deleteBySOHDSql, id);
    }

    @Override
    public List<HoaDon> findAll() {
        return XQuery.getBeanList(HoaDon.class, findAllSql);
    }

    @Override
    public HoaDon findById(Integer id) {
        return XQuery.getSingleBean(HoaDon.class, findBySOHDSql, id);
    }
    
}
