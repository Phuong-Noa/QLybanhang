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
    private String tendangnhap;
    private String matkhau;
    private boolean trangthai;
    private String hoten;
    private boolean chucvu;
    private int manv;
}
