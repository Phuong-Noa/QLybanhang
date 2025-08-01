/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import banhang.dao.CrudDAO;
import banhang.entity.EmailSender;

/**
 *
 * @author phương
 */
public interface EmailsenderDAO extends CrudDAO<EmailSender, String> {

    boolean existsByEmail(String email);

    void updatePassword(String email, String newPassword);
}
