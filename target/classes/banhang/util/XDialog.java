package banhang.util;

import javax.swing.JOptionPane;
import java.awt.Component;

public class XDialog {
    public static void alert(String message){
        XDialog.alert(message, "Thông báo");
    }
    public static void alert(String message, String title){
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static boolean confirm(String message){
        return XDialog.confirm(message, "Xác nhận");
    }
    public static boolean confirm(String message, String title){
        // Tạo nút không gạch chân
        Object[] options = {"Có", "Không"};
        
        // Hiển thị JOptionPane tùy chỉnh
        int result = JOptionPane.showOptionDialog(
                null,
                message,
                title,
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );
        return (result == JOptionPane.YES_OPTION);
    }

    public static String prompt(String message) {
        return XDialog.prompt(message, "Nhập vào");
    }

    public static String prompt(String message, String title) {
        return JOptionPane.showInputDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }
}
