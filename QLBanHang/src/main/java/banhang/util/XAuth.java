package banhang.util;

import banhang.entity.User;

public class XAuth {
    public static User user = User.builder()
            .username("user1@gmail.com")
            .password("123")
            .enabled(true)
            .manager(true)
            .fullname("Nguyễn Văn Tèo")
            .build();
}