package lythuyetcachequantricsdl;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class GiaoDienChinh extends javax.swing.JFrame {

    public GiaoDienChinh() {
        initComponents();

        // Listener cho nút Đăng Xuất
        jButton1.addActionListener(e -> {
            JFrame frame = new JFrame("Màn hình Đăng nhập");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(700, 300);
            frame.setLocationRelativeTo(null);
            frame.setContentPane(new ManHinhDKDN());
            frame.setVisible(true);

            // Đóng cửa sổ hiện tại
            this.dispose();
        });
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        label1 = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setText("Danh sách Sinh viên điểm danh");

        jButton1.setText("Đăng Xuất");

        // Bảng mặc định 4 cột
        jTable1.setModel(new DefaultTableModel(
            new Object [][] {
                {1, "SV001", "Nguyễn Văn A", "Có mặt"},
                {2, "SV002", "Trần Thị B", "Vắng"},
                {3, "SV003", "Lê Văn C", "Có mặt"},
                {4, "SV004", "Phạm Thị D", "Có phép"}
            },
            new String [] {"Số Thứ Tự", "Mã SV", "Tên SV", "Trạng Thái"}
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Điểm danh");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new GiaoDienChinh().setVisible(true));
    }

    // Variables declaration
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    // End of variables declaration
}
