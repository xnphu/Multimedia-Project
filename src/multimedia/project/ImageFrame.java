/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multimedia.project;

/**
 *
 * @author Admin
 */
public class ImageFrame extends javax.swing.JFrame {

    /**
     * Creates new form ImageFrame
     */
    private final String imagePath = "src/multimedia/project/splash.png";

    public ImageFrame() {
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

        originImage = new multimedia.project.OriginImage();
        resultImage = new multimedia.project.ResultImage();
        blurButton = new javax.swing.JButton();
        sharpenButton = new javax.swing.JButton();
        embossButton = new javax.swing.JButton();
        solarizeButton = new javax.swing.JButton();
        diffuseButton = new javax.swing.JButton();
        TitleLabel = new javax.swing.JLabel();
        discardButton = new javax.swing.JButton();
        resultLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout originImageLayout = new javax.swing.GroupLayout(originImage);
        originImage.setLayout(originImageLayout);
        originImageLayout.setHorizontalGroup(
            originImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );
        originImageLayout.setVerticalGroup(
            originImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout resultImageLayout = new javax.swing.GroupLayout(resultImage);
        resultImage.setLayout(resultImageLayout);
        resultImageLayout.setHorizontalGroup(
            resultImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );
        resultImageLayout.setVerticalGroup(
            resultImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        blurButton.setText("Blur");
        blurButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blurButtonActionPerformed(evt);
            }
        });

        sharpenButton.setText("Sharpen");
        sharpenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sharpenButtonActionPerformed(evt);
            }
        });

        embossButton.setText("Emboss");
        embossButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                embossButtonActionPerformed(evt);
            }
        });

        solarizeButton.setText("Solarize");
        solarizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solarizeButtonActionPerformed(evt);
            }
        });

        diffuseButton.setText("Diffuse");
        diffuseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diffuseButtonActionPerformed(evt);
            }
        });

        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Multimedia - Photo Filter");

        discardButton.setText("Discard changes");
        discardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discardButtonActionPerformed(evt);
            }
        });

        resultLabel.setText("Result:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(262, 262, 262))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(blurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(sharpenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(embossButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(solarizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(diffuseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(discardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(originImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultLabel)
                    .addComponent(resultImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sharpenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(embossButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(solarizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diffuseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(discardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(resultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(originImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void blurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blurButtonActionPerformed
        resultImage.blurImage();
    }//GEN-LAST:event_blurButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        originImage.loadImage(imagePath);
        originImage.repaint();
        resultImage.loadImage(imagePath);
        resultImage.repaint();
    }//GEN-LAST:event_formWindowOpened

    private void solarizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solarizeButtonActionPerformed
        resultImage.solarizeImage();

    }//GEN-LAST:event_solarizeButtonActionPerformed

    private void sharpenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sharpenButtonActionPerformed
        resultImage.sharpenImage();
    }//GEN-LAST:event_sharpenButtonActionPerformed

    private void embossButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_embossButtonActionPerformed
        resultImage.embossImage();
    }//GEN-LAST:event_embossButtonActionPerformed

    private void diffuseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diffuseButtonActionPerformed
        resultImage.diffuseImage();
    }//GEN-LAST:event_diffuseButtonActionPerformed

    private void discardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discardButtonActionPerformed
        resultImage.loadImage(imagePath);
        resultImage.repaint();
    }//GEN-LAST:event_discardButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JButton blurButton;
    private javax.swing.JButton diffuseButton;
    private javax.swing.JButton discardButton;
    private javax.swing.JButton embossButton;
    private multimedia.project.OriginImage originImage;
    private multimedia.project.ResultImage resultImage;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JButton sharpenButton;
    private javax.swing.JButton solarizeButton;
    // End of variables declaration//GEN-END:variables
}
