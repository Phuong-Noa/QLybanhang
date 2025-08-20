package banhang.util;

import banhang.entity.User;

public class XAuth {
    public static User user = User.builder()
            .tendangnhap("user1@gmail.com")
            .matkhau("123")
            .trangthai(true)
            .chucvu(true)
            .hoten("Nguyễn Văn Tèo")
            .manv(1) // Gán đúng mã nhân viên tương ứng
            .build();
}