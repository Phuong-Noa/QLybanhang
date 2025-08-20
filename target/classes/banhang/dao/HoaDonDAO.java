/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package banhang.dao;

import banhang.entity.HoaDon;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface HoaDonDAO extends CrudDAO<HoaDon, Integer>{
    /**
     * Truy vấn các hóa đơn theo mã nhân viên
     *
     * @param manv mã nhân viên
     * @return danh sách hóa đơn do nhân viên đó lập
     */
    public List<HoaDon> findByMaNV(int manv);

    /**
     * Truy vấn hóa đơn trong khoảng thời gian từ ngày đến ngày
     *
     * @param from ngày bắt đầu
     * @param to ngày kết thúc
     * @return danh sách hóa đơn
     */
    public List<HoaDon> findByDateRange(Date from, Date to);

    /**
     * Truy vấn hóa đơn theo mã nhân viên và trong khoảng thời gian
     *
     * @param manv mã nhân viên
     * @param from ngày bắt đầu
     * @param to ngày kết thúc
     * @return danh sách hóa đơn
     */
    public List<HoaDon> findByNVAndDateRange(int manv, Date from, Date to);

    /**
     * Truy vấn hóa đơn theo ngày cụ thể
     *
     * @param date ngày cần truy vấn
     * @return danh sách hóa đơn
     */
    public List<HoaDon> findByDate(Date date);
}
