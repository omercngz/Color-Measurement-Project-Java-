
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ömer CENGİZ
 */
public class resimGöster extends javax.swing.JFrame {

    /**
     * Creates new form resimGöster
     */
    public resimGöster() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblDeger = new javax.swing.JLabel();
        btnSonucGoster = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lblLStandart = new javax.swing.JLabel();
        lblaStandart = new javax.swing.JLabel();
        lblbStandart = new javax.swing.JLabel();
        lblXStandart = new javax.swing.JLabel();
        lblYStandart = new javax.swing.JLabel();
        lblZStandart = new javax.swing.JLabel();
        lblRStandart = new javax.swing.JLabel();
        lblGStandart = new javax.swing.JLabel();
        lblBStandart = new javax.swing.JLabel();
        lblLNumune = new javax.swing.JLabel();
        lblaNumune = new javax.swing.JLabel();
        lblbNumune = new javax.swing.JLabel();
        lblXNumune = new javax.swing.JLabel();
        lblYNumune = new javax.swing.JLabel();
        lblZNumune = new javax.swing.JLabel();
        lblRNumune = new javax.swing.JLabel();
        lblGNumune = new javax.swing.JLabel();
        lblBNumune = new javax.swing.JLabel();
        lblAnaliz = new javax.swing.JLabel();
        btnGeri = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DETAYLI SONUC");
        setBackground(new java.awt.Color(32, 34, 35));

        jLabel1.setText("NUMUNE RESMİN  DEĞERLERİ");

        jLabel2.setText("STANDART RESMİN  DEĞERLERİ");

        jLabel3.setText("CIE L*a*b* RENK UZAYININ DELTA E DEĞERİ");

        btnSonucGoster.setText("SONUC GÖSTER");
        btnSonucGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSonucGosterActionPerformed(evt);
            }
        });

        jLabel4.setText("CIE LAB RENK UZAYI ");

        jLabel5.setText("L* :");

        jLabel6.setText("a*:");

        jLabel7.setText("b* :");

        jLabel8.setText("XYZ RENK UZAYI");

        jLabel9.setText("X :");

        jLabel10.setText("Y: ");

        jLabel11.setText("Z:");

        jLabel12.setText("RGB RENK UZAYI ");

        jLabel13.setText("R:");

        jLabel14.setText("G:");

        jLabel15.setText("B:");

        jLabel16.setText("RGB RENK UZAYI ");

        jLabel17.setText("R:");

        jLabel18.setText("G:");

        jLabel19.setText("CIE LAB RENK UZAYI ");

        jLabel20.setText("B:");

        jLabel21.setText("L* :");

        jLabel22.setText("a*:");

        jLabel23.setText("b* :");

        jLabel24.setText("XYZ RENK UZAYI");

        jLabel25.setText("X :");

        jLabel26.setText("Y: ");

        jLabel27.setText("Z:");

        lblLStandart.setText("L* :");

        lblaStandart.setText("a*:");

        lblbStandart.setText("b* :");

        lblXStandart.setText("X :");

        lblYStandart.setText("Y: ");

        lblZStandart.setText("Z:");

        lblRStandart.setText("R:");

        lblGStandart.setText("G:");

        lblBStandart.setText("B:");

        lblLNumune.setText("L* :");

        lblaNumune.setText("a*:");

        lblbNumune.setText("b* :");

        lblXNumune.setText("X :");

        lblYNumune.setText("Y: ");

        lblZNumune.setText("Z:");

        lblRNumune.setText("R:");

        lblGNumune.setText("G:");

        lblBNumune.setText("B:");

        btnGeri.setText("GERİ");
        btnGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(47, 47, 47)
                .addComponent(btnGeri)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
                        .addComponent(jLabel19)
                        .addGap(218, 218, 218))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLNumune)
                                    .addComponent(lblaNumune)
                                    .addComponent(lblbNumune)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblXNumune)
                                    .addComponent(lblYNumune)
                                    .addComponent(lblZNumune)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRNumune)
                                    .addComponent(lblBNumune)
                                    .addComponent(lblGNumune))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel16)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLStandart)
                                    .addComponent(lblaStandart)
                                    .addComponent(lblbStandart)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel27))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblXStandart)
                                    .addComponent(lblYStandart)
                                    .addComponent(lblZStandart)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRStandart)
                                    .addComponent(lblBStandart)
                                    .addComponent(lblGStandart))))
                        .addGap(236, 236, 236))))
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(102, 102, 102)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblAnaliz)
                                .addComponent(lblDeger))))
                    .addComponent(btnSonucGoster, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(btnGeri)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel22))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel23)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLStandart)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblaStandart)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblbStandart))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLNumune)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblaNumune)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblbNumune)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel26))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel27)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblXNumune)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblYNumune)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblZNumune))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblXStandart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblYStandart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblZStandart)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRStandart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblGStandart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBStandart))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRNumune)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblGNumune)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBNumune)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(lblDeger)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAnaliz)
                .addGap(45, 45, 45)
                .addComponent(btnSonucGoster)
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
            float degerE;
            public int [] RGBdizi=new int[6];
        public float [] XYZNumunedizi=new float[3];
        public float [] XYZStandartdizi=new float[3];
        public float [] CIENumunedizi=new float[3];
        public float [] CIEStandartdizi=new float[3];
            public void degerE(float deger){
                degerE=deger;
            }public void degerler(int []diziR,float []diziXYZNumune,float [] diziXYZStandart,float[] diziCIENumune,float[] diziCIEStandart ){
                System.out.println("rgb: degerler :" +diziR[0]);
                RGBdizi=diziR;
                XYZNumunedizi=diziXYZNumune;
                XYZStandartdizi=diziXYZStandart;
                CIENumunedizi=diziCIENumune;
                CIEStandartdizi=diziCIEStandart;
            }
            
    private void btnSonucGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSonucGosterActionPerformed
        // TODO add your handling code here:
       lblDeger.setText(String.valueOf(degerE));
       if(degerE<=1){
           lblAnaliz.setText("Numune Gıda ve Standart Arasindaki Fark İnsan Gözünün Ayırt Edemeyeceği Kadardır.");
           
       }
       else if(degerE>1&&degerE<=2){
           lblAnaliz.setText("Numune Gıda ve Standart Arasindaki Fark Yakından İncelendiğinde Ayırt Edilebilir.");
       }
       else if(degerE>2&&degerE<=20){
           lblAnaliz.setText("Numune Gıda ve Standart Arasindaki Fark Çok Rahat Fark Edilebilir!!!.");
       }
       else if(degerE>20&&degerE<=99){
           lblAnaliz.setText("STANDART GIDA BOZUK !!!!.");
       }
       
       lblLNumune.setText(String.valueOf(CIENumunedizi[0]));
       lblaNumune.setText(String.valueOf(CIENumunedizi[1]));
       lblbNumune.setText(String.valueOf(CIENumunedizi[2]));
       
       lblLStandart.setText(String.valueOf(CIEStandartdizi[0]));
       lblaStandart.setText(String.valueOf(CIEStandartdizi[1]));
       lblbStandart.setText(String.valueOf(CIEStandartdizi[2]));
       
       lblXNumune.setText(String.valueOf(XYZNumunedizi[0]));
       lblYNumune.setText(String.valueOf(XYZNumunedizi[1]));
       lblZNumune.setText(String.valueOf(XYZNumunedizi[2]));
        
       lblXStandart.setText(String.valueOf(XYZStandartdizi[0]));
       lblYStandart.setText(String.valueOf(XYZStandartdizi[1]));
       lblZStandart.setText(String.valueOf(XYZStandartdizi[2]));
       
       lblRNumune.setText(String.valueOf(RGBdizi[0]));
       lblGNumune.setText(String.valueOf(RGBdizi[1]));
       lblBNumune.setText(String.valueOf(RGBdizi[2]));
        
       lblRStandart.setText(String.valueOf(RGBdizi[3]));
       lblGStandart.setText(String.valueOf(RGBdizi[4]));
       lblBStandart.setText(String.valueOf(RGBdizi[5]));
    }//GEN-LAST:event_btnSonucGosterActionPerformed

    private void btnGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriActionPerformed
        // TODO add your handling code here:
        DosyaSecimi dosyaSecimi=new DosyaSecimi();
        dosyaSecimi.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnGeriActionPerformed

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
            java.util.logging.Logger.getLogger(resimGöster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resimGöster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resimGöster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resimGöster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resimGöster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGeri;
    private javax.swing.JButton btnSonucGoster;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAnaliz;
    private javax.swing.JLabel lblBNumune;
    private javax.swing.JLabel lblBStandart;
    private javax.swing.JLabel lblDeger;
    private javax.swing.JLabel lblGNumune;
    private javax.swing.JLabel lblGStandart;
    private javax.swing.JLabel lblLNumune;
    private javax.swing.JLabel lblLStandart;
    private javax.swing.JLabel lblRNumune;
    private javax.swing.JLabel lblRStandart;
    private javax.swing.JLabel lblXNumune;
    private javax.swing.JLabel lblXStandart;
    private javax.swing.JLabel lblYNumune;
    private javax.swing.JLabel lblYStandart;
    private javax.swing.JLabel lblZNumune;
    private javax.swing.JLabel lblZStandart;
    private javax.swing.JLabel lblaNumune;
    private javax.swing.JLabel lblaStandart;
    private javax.swing.JLabel lblbNumune;
    private javax.swing.JLabel lblbStandart;
    // End of variables declaration//GEN-END:variables
}
