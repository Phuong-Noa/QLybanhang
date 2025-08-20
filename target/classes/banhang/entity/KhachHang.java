/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banhang.entity;

import java.util.Date;
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
public class KhachHang {
    private int makh;
    private String hoten;
    private String dchi;
    private String sodt;
    private Date ngsinh;
    private double tongtien;
}
