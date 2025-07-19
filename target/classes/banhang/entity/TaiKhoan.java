/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banhang.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 *
 * @author ADMIN
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TaiKhoan {
    private String username;
    private String password;
    private boolean enabled;
    private String fullname;
    private boolean manager;
    private int manv;
}
