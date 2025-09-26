package lythuyetcachequantricsdl;

import javax.swing.*;

public class ManHinhDKDN extends javax.swing.JPanel {

    private JTextField txtTaiKhoan;
    private JPasswordField txtMatKhau;
    private JButton btnDangKy;

    public ManHinhDKDN() {
        initComponents();

        // Listener cho nút Sinh viên
        jButton1.addActionListener(e -> {
            new SinhVienFrame().setVisible(true);
            SwingUtilities.getWindowAncestor(this).dispose();
        });

        // Listener cho nút Giảng viên
        jButton2.addActionListener(e -> {
            new GiaoDienChinh().setVisible(true);
            SwingUtilities.getWindowAncestor(this).dispose();
        });

        // Listener cho nút Đăng ký
        btnDangKy.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Chức năng Đăng ký sẽ được phát triển sau!");
        });
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        txtTaiKhoan = new JTextField();
        txtMatKhau = new JPasswordField();
        btnDangKy = new JButton("Đăng ký");

        setMaximumSize(new java.awt.Dimension(609, 350));
        setOpaque(false);

        jButton1.setText("Đăng nhập với tư cách Sinh viên");
        jButton2.setText("Đăng nhập với tư cách Giảng viên");

        jLabel1.setText("Sinh viên");
        jLabel2.setText("Giảng viên");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); 
        jLabel3.setText("Phần mềm quản lý Lớp Học, Sinh viên");

        jLabel4.setText("Tài khoản:");
        jLabel5.setText("Mật khẩu:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton2))
                .addGap(20, 20, 20)
                .addComponent(btnDangKy)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }

    // Variables declaration
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration
}
