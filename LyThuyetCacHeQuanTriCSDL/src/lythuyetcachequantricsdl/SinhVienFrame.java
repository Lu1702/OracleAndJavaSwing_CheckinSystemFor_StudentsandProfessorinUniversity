package lythuyetcachequantricsdl;

import javax.swing.*;

public class SinhVienFrame extends JFrame {

    private JButton btnDiemDanh;
    private JButton btnXemLichHoc;

    public SinhVienFrame() {
        initComponents();
        btnDiemDanh.addActionListener(e -> {
            new GiaoDienChinh().setVisible(true);
            this.dispose(); // đóng màn hình Sinh viên
        });

        // Listener cho nút Xem lịch học (tạm để trống)
        btnXemLichHoc.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Chức năng Xem lịch học sẽ được cập nhật sau!");
        });
    }

    private void initComponents() {
        btnDiemDanh = new JButton("Điểm danh");
        btnXemLichHoc = new JButton("Xem lịch học");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Màn hình Sinh viên");

        // Layout đơn giản
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addGroup(layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(btnDiemDanh, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20)
                        .addComponent(btnXemLichHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addGroup(layout.createSequentialGroup()
                    .addGap(40)
                    .addComponent(btnDiemDanh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20)
                    .addComponent(btnXemLichHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40))
        );

        pack();
        setLocationRelativeTo(null); // căn giữa màn hình
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new SinhVienFrame().setVisible(true));
    }
}
