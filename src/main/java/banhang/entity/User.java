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
 * @author ADMIN
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class User {
    private String tendangnhap;
    private String matkhau;
    private boolean trangthai;
    private String hoten;
    private int manv; // 🔥 THÊM dòng này
    @Builder.Default
    private boolean chucvu = true;
}
