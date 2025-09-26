package lythuyetcachequantricsdl;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Màn hình Đăng ký / Đăng nhập");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(700, 300);
            frame.setLocationRelativeTo(null);

            frame.setContentPane(new ManHinhDKDN());
            frame.setVisible(true);
        });
    }
}
