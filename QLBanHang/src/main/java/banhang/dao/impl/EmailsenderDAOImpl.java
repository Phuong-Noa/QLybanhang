/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banhang.dao.impl;

import banhang.dao.EmailSenderDAO;
import banhang.entity.EmailSender;
import banhang.util.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phương
 */
public class EmailsenderDAOImpl implements EmailSenderDAO {

    private final String createSql = "INSERT INTO email_sender (email, password) VALUES (?, ?)";
    private final String updateSql = "UPDATE email_sender SET email = ?, password = ? WHERE id = ?";
    private final String deleteByIdSql = "DELETE FROM email_sender WHERE id = ?";
    private final String findAllSql = "SELECT * FROM email_sender";
    private final String findByIdSql = "SELECT * FROM email_sender WHERE id = ?";
    private final String findByEmailSql = "SELECT * FROM email_sender WHERE email LIKE ?";

    @Override
    public boolean existsByEmail(String email) {
        String sql = "SELECT 1 FROM users WHERE email = ?";
        try (ResultSet rs = XJdbc.executeQuery(sql, email)) {
            return rs.next();
        } catch (Exception e) {
            throw new RuntimeException("Lỗi kiểm tra email", e);
        }
    }

    @Override
    public void updatePassword(String email, String newPassword) {
        String sql = "UPDATE users SET password = ? WHERE email = ?";
        XJdbc.executeUpdate(sql, newPassword, email);
    }

    @Override
    public EmailSender create(EmailSender entity) {
        String sql = "INSERT INTO email_sender(email, subject, content) VALUES (?, ?, ?)";
        XJdbc.executeUpdate(sql, entity.getEmail(), entity.getSubject(), entity.getContent());
        return entity;
    }

    @Override
    public void update(EmailSender entity) {
        // Chưa áp dụng với EmailSender nên để trống
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteById(Object id) {
        String sql = "DELETE FROM email_sender WHERE id = ?";
        XJdbc.executeUpdate(sql, id);
    }

    @Override
    public List<EmailSender> findAll() {
        List<EmailSender> list = new ArrayList<>();
        String sql = "SELECT * FROM email_sender";
        try (ResultSet rs = XJdbc.executeQuery(sql)) {
            while (rs.next()) {
                EmailSender e = new EmailSender();
                e.setId(rs.getInt("id"));
                e.setEmail(rs.getString("email"));
                e.setSubject(rs.getString("subject"));
                e.setContent(rs.getString("content"));
                list.add(e);
            }
        } catch (Exception e) {
            throw new RuntimeException("Lỗi truy vấn email_sender", e);
        }
        return list;
    }

    @Override
    public EmailSender findById(Object id) {
        String sql = "SELECT * FROM email_sender WHERE id = ?";
        try (ResultSet rs = XJdbc.executeQuery(sql, id)) {
            if (rs.next()) {
                EmailSender e = new EmailSender();
                e.setId(rs.getInt("id"));
                e.setEmail(rs.getString("email"));
                e.setSubject(rs.getString("subject"));
                e.setContent(rs.getString("content"));
                return e;
            }
        } catch (Exception e) {
            throw new RuntimeException("Lỗi tìm theo ID", e);
        }
        return null;

    }
}
