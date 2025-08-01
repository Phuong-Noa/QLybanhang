/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banhang.manager;

import banhang.entity.EmailSender;

/**
 *
 * @author phương
 */
public interface QMatkhauController extends CrudController<EmailSender> {

    void sendEmail();             // Gửi email thực tế

    void searchByEmail();         // Tìm email theo từ khóa

    void validateEmail();
}
