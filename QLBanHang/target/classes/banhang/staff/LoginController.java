package banhang.staff;

import banhang.util.XDialog;

public interface LoginController {
    void open();
    void login();
    default void exit(){
        if(XDialog.confirm("Bạn muốn thoát?")){
            System.exit(0);
        }
    }
    void showpassword();
}
