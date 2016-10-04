/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ibiology;

/**
 *
 * @author x14500057
 */
public class MiniGames extends javax.swing.JFrame {

    /**
     * Creates new form HomePageGUI
     */
    public MiniGames() {
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

        MiniB = new javax.swing.JLabel();
        CloseB = new javax.swing.JLabel();
        MuteB = new javax.swing.JLabel();
        TopBar = new javax.swing.JLabel();
        Crossword = new javax.swing.JLabel();
        Resources = new javax.swing.JLabel();
        CrossWordResourceBtns = new javax.swing.JLabel();
        HomeBtn = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MiniB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MiniB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MiniBMouseClicked(evt);
            }
        });
        getContentPane().add(MiniB, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 22, 20));

        CloseB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CloseB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseBMouseClicked(evt);
            }
        });
        getContentPane().add(CloseB, new org.netbeans.lib.awtextra.AbsoluteConstraints(821, 10, 22, 20));

        MuteB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(MuteB, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 510, 65, 65));

        TopBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TopBarMouseDragged(evt);
            }
        });
        getContentPane().add(TopBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 22));

        Crossword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Crossword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrosswordMouseClicked(evt);
            }
        });
        getContentPane().add(Crossword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 190, 210));

        Resources.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Resources.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResourcesMouseClicked(evt);
            }
        });
        getContentPane().add(Resources, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 190, 210));

        CrossWordResourceBtns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ibiology/graphics/BtnCrossWord.png"))); // NOI18N
        getContentPane().add(CrossWordResourceBtns, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 790, 320));

        HomeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeBtnMouseClicked(evt);
            }
        });
        getContentPane().add(HomeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 70));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ibiology/graphics/OOP_GUI_Template.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        setSize(new java.awt.Dimension(858, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseBMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseBMouseClicked

    private void MiniBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiniBMouseClicked
        this.setState(MiniGames.ICONIFIED);
    }//GEN-LAST:event_MiniBMouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void TopBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TopBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x,y);
    }//GEN-LAST:event_TopBarMouseDragged

    private void CrosswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrosswordMouseClicked
        Crossword GUI = new Crossword ();
        GUI.setVisible(true);
        dispose();
    }//GEN-LAST:event_CrosswordMouseClicked

    private void ResourcesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResourcesMouseClicked
       Resorces GUI = new Resorces();
       GUI.setVisible(true);
       dispose();
    }//GEN-LAST:event_ResourcesMouseClicked

    private void HomeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnMouseClicked
       HomePageGUI GUI = new HomePageGUI();
       GUI.setVisible(true);
       dispose();
    }//GEN-LAST:event_HomeBtnMouseClicked

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
            java.util.logging.Logger.getLogger(MiniGames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiniGames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiniGames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiniGames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel CloseB;
    private javax.swing.JLabel CrossWordResourceBtns;
    private javax.swing.JLabel Crossword;
    private javax.swing.JLabel HomeBtn;
    private javax.swing.JLabel MiniB;
    private javax.swing.JLabel MuteB;
    private javax.swing.JLabel Resources;
    private javax.swing.JLabel TopBar;
    // End of variables declaration//GEN-END:variables
}
