/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banhang.dao;

import banhang.entity.EmailSender;

/**
 *
 * @author phương
 */
public interface EmailSenderDAO extends CrudDAO<EmailSender, Object> {

    boolean existsByEmail(String email);

    void updatePassword(String email, String newPassword);
}
