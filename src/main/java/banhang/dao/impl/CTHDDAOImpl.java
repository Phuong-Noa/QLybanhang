package banhang.dao.impl;

import banhang.dao.CTHDDAO;
import banhang.entity.CTHD;
import banhang.util.XJdbc;
import banhang.util.XQuery;
import java.util.List;

public class CTHDDAOImpl implements CTHDDAO {

    private final String createSql = "INSERT INTO CTHD(SOHD, MASP, DONGIA, SOLUONG) VALUES (?, ?, ?, ?)";
    private final String updateSql = "UPDATE CTHD SET SOHD = ?, MASP = ?, DONGIA = ?, SOLUONG = ? WHERE MAHD = ?";
    private final String deleteByIdSql = "DELETE FROM CTHD WHERE MAHD = ?";

    // JOIN với SANPHAM để lấy thêm tên sản phẩm
    private final String findAllSql = """
        SELECT c.MAHD, c.SOHD, c.MASP, c.DONGIA, c.SOLUONG, s.TENSP AS tensp
        FROM CTHD c
        JOIN SANPHAM s ON c.MASP = s.MASP
    """;

    private final String findByIdSql = findAllSql + " WHERE c.MAHD = ?";
    private final String findLastSql = findAllSql + " WHERE c.MAHD = (SELECT MAX(MAHD) FROM CTHD)";
    private final String findByBillIdSql = findAllSql + " WHERE c.SOHD = ?";
    private final String findByProductIdSql = findAllSql + " WHERE c.MASP = ?";

    @Override
    public List<CTHD> findBySOHD(int sohd) {
        return XQuery.getBeanList(CTHD.class, findByBillIdSql, sohd);
    }

    @Override
    public List<CTHD> findByMaSP(int masp) {
        return XQuery.getBeanList(CTHD.class, findByProductIdSql, masp);
    }

    @Override
    public CTHD create(CTHD entity) {
        Object[] values = {
            entity.getSohd(),
            entity.getMasp(),
            entity.getDongia(),
            entity.getSoluong()
        };
        XJdbc.executeUpdate(createSql, values);
        return XQuery.getSingleBean(CTHD.class, findLastSql);
    }

    @Override
    public void update(CTHD entity) {
        Object[] values = {
            entity.getSohd(),
            entity.getMasp(),
            entity.getDongia(),
            entity.getSoluong(),
            entity.getMahd()
        };
        XJdbc.executeUpdate(updateSql, values);
    }

    @Override
    public void deleteById(Integer id) {
        XJdbc.executeUpdate(deleteByIdSql, id);
    }

    @Override
    public List<CTHD> findAll() {
        return XQuery.getBeanList(CTHD.class, findAllSql);
    }

    @Override
    public CTHD findById(Integer id) {
        return XQuery.getSingleBean(CTHD.class, findByIdSql, id);
    }
}

