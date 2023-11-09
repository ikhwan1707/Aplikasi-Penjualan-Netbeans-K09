
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author user
 */
public class formjnsbarang extends javax.swing.JFrame {

    private DefaultTableModel model;

    /**
     * Creates new form
     */
    public formjnsbarang() {
        initComponents();
        loadData();
        kosong();
        setEnablefalse();
    }
    
    private void setEnablefalse(){
        txtkdjenis.setEnabled(false);
        txtjnsbarang.setEnabled(false);
    }
    
    private void setEnabletrue(){
        txtkdjenis.setEnabled(true);
        txtjnsbarang.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtkdjenis = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtjnsbarang = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelbrg = new javax.swing.JTable();
        btnadd = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 153));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Entri Data Jenis Barang");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setText("Kode Jenis");

        txtkdjenis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtkdjenisKeyTyped(evt);
            }
        });

        jLabel3.setText("Jenis Barang");

        tabelbrg.setBackground(new java.awt.Color(204, 255, 204));
        tabelbrg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelbrg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelbrgMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelbrg);

        btnadd.setBackground(new java.awt.Color(153, 255, 153));
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnsave.setBackground(new java.awt.Color(153, 255, 153));
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnupdate.setBackground(new java.awt.Color(153, 255, 153));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setBackground(new java.awt.Color(153, 255, 153));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btncancel.setBackground(new java.awt.Color(153, 255, 153));
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        btnclose.setBackground(new java.awt.Color(153, 255, 153));
        btnclose.setText("Close");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtkdjenis, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                            .addComponent(txtjnsbarang)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnadd)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnsave)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnupdate)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btndelete)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btncancel)
                            .addGap(12, 12, 12)
                            .addComponent(btnclose))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtkdjenis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtjnsbarang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd)
                    .addComponent(btnsave)
                    .addComponent(btnupdate)
                    .addComponent(btndelete)
                    .addComponent(btncancel)
                    .addComponent(btnclose))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        setEnabletrue();
        btnadd.setEnabled(true);
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:                                    
        String kodeJenis = txtkdjenis.getText(); // Ambil kode jenis dari input
        String jenisBarang = txtjnsbarang.getText(); // Ambil jenis barang dari input

        if ("".equals(kodeJenis) || "".equals(jenisBarang)) {
            JOptionPane.showMessageDialog(this,
                    "Harap Lengkapi Data Kode Jenis dan Jenis Barang",
                    "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Connection c = Koneksi.getKoneksi();
                String sql = "INSERT INTO tbljenis (Kode_jenis, Jenis_barang) VALUES (?, ?)";
                PreparedStatement p = c.prepareStatement(sql);

                p.setString(1, kodeJenis);
                p.setString(2, jenisBarang);

                p.executeUpdate();
                p.close();

                JOptionPane.showMessageDialog(null,
                        "Penyimpanan Data Kode Jenis dan Jenis Barang Berhasil");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this,
                        e.getMessage());
            } finally {
                loadData(); // Memuat data kembali ke tabel
                kosong(); // Mengosongkan input setelah penyimpanan
            }
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        int i = tabelbrg.getSelectedRow();

        if (i == -1) {
            //tidak ada baris terseleksi
            JOptionPane.showMessageDialog(this,
                    "Harap Pilih Data Terlebih Dahulu",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        String kode_jenis = txtkdjenis.getText();
        String jenis_barang = txtjnsbarang.getText();

        try {
            Connection c = Koneksi.getKoneksi();

            String sql = "UPDATE tbljenis SET Jenis_barang = ? WHERE Kode_jenis = ?";

            PreparedStatement p = c.prepareStatement(sql);
            p.setString(2, kode_jenis);
            p.setString(1, jenis_barang);

            p.executeUpdate();
            p.close();
                JOptionPane.showMessageDialog(null, "Update Data Berhasil ");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi Error" + e.getMessage());
        } finally {
            loadData();
//            kosong();
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        int i = tabelbrg.getSelectedRow();

        if (i == -1) {
            //tidak ada baris terseleksi
            JOptionPane.showMessageDialog(this,
                    "Harap Pilih Data Terlebih Dahulu",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        String kode_jenis = (String) model.getValueAt(i, 0);

        try {
            Connection c = Koneksi.getKoneksi();

            String sql = "DELETE FROM tbljenis WHERE Kode_jenis = ?";

            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, kode_jenis);
            p.executeUpdate();
            p.close();

            JOptionPane.showMessageDialog(null,
                    "Hapus Data Berhasil");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Terjadi Error");
        } finally {
            loadData();
            kosong();
        }

    }//GEN-LAST:event_btndeleteActionPerformed

    private void tabelbrgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelbrgMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        int baris = tabelbrg.getSelectedRow();

        if (baris == -1) {
            //tak ada baris terseleksi
            return;
        }

        String kode_jenis = tabelbrg.getValueAt(baris, 0).toString();
        txtkdjenis.setText(kode_jenis);
        String jenis_barang = tabelbrg.getValueAt(baris, 1).toString();
        txtjnsbarang.setText(jenis_barang);
    }//GEN-LAST:event_tabelbrgMouseClicked

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btncancelActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btncloseActionPerformed

    private void txtkdjenisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkdjenisKeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if (! ((Character.isDigit(c) ||
                (c == KeyEvent.VK_BACK_SPACE)||
                (c == KeyEvent.VK_DELETE))
            )){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "harap masukan angka!");
            evt.consume();
        }
    }//GEN-LAST:event_txtkdjenisKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formjnsbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formjnsbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formjnsbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formjnsbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formjnsbarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelbrg;
    private javax.swing.JTextField txtjnsbarang;
    private javax.swing.JTextField txtkdjenis;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        // Membuat model
        DefaultTableModel model = new DefaultTableModel();

// Menghapus seluruh data
        model.getDataVector().removeAllElements();

// Memberitahu bahwa data telah kosong
        model.fireTableDataChanged();

// Menetapkan model ke tabel
        tabelbrg.setModel(model);

// Menambahkan kolom-kolom ke model
        model.addColumn("Kode Jenis"); // Tambah kolom Kode Jenis
        model.addColumn("Jenis Barang"); // Tambah kolom Jenis Barang

        try {

            String sql = "SELECT * FROM tbljenis";

            Connection c = Koneksi.getKoneksi();
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(sql);

            while (r.next()) {
                //lakukan penelusuran baris
                model.addRow(new Object[]{
                    r.getString(1),
                    r.getString(2),});
            }
            tabelbrg.setModel(model);
        } catch (SQLException e) {
            System.out.println("Terjadi Error");
        }
    }

    private void kosong() {
        txtkdjenis.setText(null);
        txtjnsbarang.setText(null);
    }
}