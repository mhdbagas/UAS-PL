/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataparkir;

/**
 *
 * @author MSI MODERN 14
 */
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;
public class UASPL extends javax.swing.JFrame {

    /**
     * Creates new form UASPL
     */
    Queue<Object> antrian = new LinkedList<>();
    int nomor = 0;
    public UASPL() {
        initComponents();
        inisialisasi();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaDaftar = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        textJumlah = new javax.swing.JLabel();
        textTotal = new javax.swing.JLabel();
        textPanggilan = new javax.swing.JLabel();
        btnProses = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtAtas1 = new javax.swing.JLabel();
        txtAtas2 = new javax.swing.JLabel();
        txtAtas3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtAtas4 = new javax.swing.JLabel();
        txtAtas5 = new javax.swing.JLabel();
        txtAtas6 = new javax.swing.JLabel();
        txtAtas7 = new javax.swing.JLabel();
        txtAtas8 = new javax.swing.JLabel();
        btnAmbil = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 255));

        jLabel1.setText("DAFTAR ANTRIAN");

        AreaDaftar.setColumns(20);
        AreaDaftar.setRows(5);
        jScrollPane1.setViewportView(AreaDaftar);

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));

        textJumlah.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        textJumlah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        textTotal.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        textTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        textPanggilan.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        textPanggilan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnProses.setText("Proses Antrian");
        btnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesActionPerformed(evt);
            }
        });

        txtAtas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtAtas2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtAtas3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAtas1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(txtAtas2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAtas3, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAtas1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(txtAtas2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(txtAtas3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        txtAtas4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtAtas5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtAtas6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtAtas7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtAtas8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAtas4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtAtas5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtAtas6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtAtas7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtAtas8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAtas4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtAtas5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtAtas6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAtas7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAtas8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAmbil.setText("Ambil Nomor Antrian");
        btnAmbil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmbilActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Jumlah Antrian");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Total Antrian");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Panggilan Nomor Antrian");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(btnProses, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textPanggilan, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAmbil, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(textTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(textPanggilan, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnProses, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(btnAmbil, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
        // TODO add your handling code here:
        prosesAntrian();
    }//GEN-LAST:event_btnProsesActionPerformed

    private void btnAmbilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmbilActionPerformed
        // TODO add your handling code here:
        tambahAntrian();
    }//GEN-LAST:event_btnAmbilActionPerformed
private void inisialisasi(){
        textJumlah.setText("0");
        textTotal.setText("0");
        textPanggilan.setText("-----");
        
        txtAtas1.setText("Yaskur Bank");
        txtAtas2.setText("Jl.Bupati");
        txtAtas3.setText("Kota Pekanbaru");
        txtAtas4.setText("Senin, 28 juni 2021");
        txtAtas5.setText("Nomor Antrian");
        txtAtas6.setText("--------");
        txtAtas7.setText("Silahkan menunggu");
        txtAtas8.setText("--------");
        
    }
      private void tambahAntrian(){
        nomor++; // tambah nomornya
        String antr = "Antrian "+nomor; // simpan dalam variabel
        antrian.add(antr); // menambah antrian ke list (collection linkedlist)
        String cvt = String.valueOf(antrian.size()); // mengambil panjang list
        textJumlah.setText(cvt); // meng set text komponen agar menampilkan panjang list
        textPanggilan.setText(""+antrian.peek()); // menampilkan data yang paling atas
        textTotal.setText(""+nomor); // tampil nomor ada berapa
        AreaDaftar.append(antr + "\n");
        
        txtAtas4.setText("Senin, 28 juni 2021");
        txtAtas5.setText("Nomor Antrian");
        txtAtas6.setText("  " + nomor);
        txtAtas7.setText("Silahkan menunggu " + cvt + " Antrian Lagi ");
        txtAtas8.setText("Mohon untuk bersabar");
        
    }
    private void prosesAntrian(){
        if(antrian.isEmpty()){ // jika antrian tidak ada
            JOptionPane.showMessageDialog(this, "Ambil Nomor antrian terlebih dahulu !");
        }
        AreaDaftar.setText(""); // mengosongkan textarea list antrian
        antrian.poll(); // mengambil antrian
        antrian.forEach((Object element) -> { 
            AreaDaftar.append("" + element + "\n"); // print semua antrian ke textarea list
        });
        if(antrian.isEmpty()){
            textPanggilan.setText("-----");
        }else{
            textPanggilan.setText(""+antrian.peek());
        }
    }
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
            java.util.logging.Logger.getLogger(UASPL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UASPL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UASPL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UASPL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UASPL().setVisible(true);
            }
        });
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaDaftar;
    private javax.swing.JButton btnAmbil;
    private javax.swing.JButton btnProses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel textJumlah;
    private javax.swing.JLabel textPanggilan;
    private javax.swing.JLabel textTotal;
    private javax.swing.JLabel txtAtas1;
    private javax.swing.JLabel txtAtas2;
    private javax.swing.JLabel txtAtas3;
    private javax.swing.JLabel txtAtas4;
    private javax.swing.JLabel txtAtas5;
    private javax.swing.JLabel txtAtas6;
    private javax.swing.JLabel txtAtas7;
    private javax.swing.JLabel txtAtas8;
    // End of variables declaration//GEN-END:variables
}
