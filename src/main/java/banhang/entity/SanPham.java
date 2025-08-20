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
public class SanPham {
    private int masp;
    private String tensp;
    private String dvt;
    private String nuocsx;
    private double gia;
    private int maloai;
    private String tenloai; // THÊM DÒNG NÀY
    @Override
    public String toString() {
        return this.tensp;
    }
}
