/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banhang.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author phương
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class EmailSender {
    private int id;
    private String email;
    private String password;
    private String subject;
    private String content;
}
