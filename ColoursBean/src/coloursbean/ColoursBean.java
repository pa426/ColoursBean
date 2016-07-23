/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coloursbean;

import java.awt.Color;

/**
 *
 * @author Alexandru
 */
public class ColoursBean extends javax.swing.JPanel {

    private int[] colour = new int[3];
    Color xxx;

    public ColoursBean() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panScroller = new javax.swing.JPanel();
        panRedScroller = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        scrRed = new javax.swing.JScrollBar();
        redLbl = new javax.swing.JLabel();
        panGreenScroller = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        scrGreen = new javax.swing.JScrollBar();
        greenLbl = new javax.swing.JLabel();
        panBlueScroller = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        scrBlue = new javax.swing.JScrollBar();
        blueLbl = new javax.swing.JLabel();
        colLbl = new javax.swing.JLabel();

        panScroller.setPreferredSize(new java.awt.Dimension(200, 100));
        panScroller.setLayout(new java.awt.GridLayout(4, 0));

        panRedScroller.setPreferredSize(new java.awt.Dimension(200, 20));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setText("Red");
        jLabel4.setPreferredSize(new java.awt.Dimension(35, 14));
        panRedScroller.add(jLabel4);

        scrRed.setMaximum(256);
        scrRed.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        scrRed.setVisibleAmount(1);
        scrRed.setPreferredSize(new java.awt.Dimension(150, 16));
        scrRed.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                colorSetting(evt);
            }
        });
        panRedScroller.add(scrRed);

        redLbl.setBackground(new java.awt.Color(255, 0, 0));
        redLbl.setText("           ");
        redLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        redLbl.setOpaque(true);
        panRedScroller.add(redLbl);

        panScroller.add(panRedScroller);

        panGreenScroller.setPreferredSize(new java.awt.Dimension(200, 26));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel5.setText("Green");
        jLabel5.setPreferredSize(new java.awt.Dimension(35, 14));
        panGreenScroller.add(jLabel5);

        scrGreen.setMaximum(256);
        scrGreen.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        scrGreen.setVisibleAmount(1);
        scrGreen.setPreferredSize(new java.awt.Dimension(150, 16));
        scrGreen.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                colorSetting(evt);
            }
        });
        panGreenScroller.add(scrGreen);

        greenLbl.setBackground(new java.awt.Color(0, 255, 0));
        greenLbl.setText("           ");
        greenLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        greenLbl.setOpaque(true);
        panGreenScroller.add(greenLbl);

        panScroller.add(panGreenScroller);

        panBlueScroller.setPreferredSize(new java.awt.Dimension(200, 26));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel6.setText("Blue");
        jLabel6.setPreferredSize(new java.awt.Dimension(35, 14));
        panBlueScroller.add(jLabel6);

        scrBlue.setMaximum(256);
        scrBlue.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        scrBlue.setVisibleAmount(1);
        scrBlue.setPreferredSize(new java.awt.Dimension(150, 16));
        scrBlue.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                colorSetting(evt);
            }
        });
        panBlueScroller.add(scrBlue);

        blueLbl.setBackground(new java.awt.Color(0, 0, 255));
        blueLbl.setText("           ");
        blueLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        blueLbl.setOpaque(true);
        panBlueScroller.add(blueLbl);

        panScroller.add(panBlueScroller);

        colLbl.setBackground(new java.awt.Color(0, 0, 255));
        colLbl.setText("                               Current color");
        colLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        colLbl.setOpaque(true);
        colLbl.setPreferredSize(new java.awt.Dimension(10, 10));
        panScroller.add(colLbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panScroller, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 157, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panScroller, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void colorSetting(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_colorSetting
        colour[0] = getRedSliderValue();
        colour[1] = getGreenSliderValue();
        colour[2] = getBlueSliderValue();

        setRedLabelValue(new Color(colour[0], 0, 0));
        setGreenLabelValue(new Color(0, colour[1], 0));
        setBlueLabelValue(new Color(0, 0, colour[2]));
        setColLabelValue(new Color(colour[0], colour[1], colour[2]));
        
    }//GEN-LAST:event_colorSetting

    public Color getColour() {
        return xxx;
    }
    
    public int getRedSliderValue() {
        return scrRed.getValue();
    }

    public void setRedSliderValue(int x) {
        scrRed.setValue(x);
    }

    public int getGreenSliderValue() {
        return scrGreen.getValue();
    }

    public void setGreenSliderValue(int x) {
        scrGreen.setValue(x);
    }

    public int getBlueSliderValue() {
        return scrBlue.getValue();
    }

    public void setBlueSliderValue(int x) {
        scrBlue.setValue(x);
    }

    public int getRedLabelValue() {
        return scrRed.getValue();
    }

    public void setRedLabelValue(Color x) {
        redLbl.setBackground(x);
    }

    public int getGreenLabelValue() {
        return scrGreen.getValue();
    }

    public void setGreenLabelValue(Color x) {
        greenLbl.setBackground(x);
    }

    public int getBlueLabelValue() {
        return scrBlue.getValue();
    }

    public void setBlueLabelValue(Color x) {
        blueLbl.setBackground(x);
    }
    
    public Color getColLabelValue() {
        return colLbl.getBackground();
    }

    public void setColLabelValue(Color x) {
        colLbl.setBackground(x);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel blueLbl;
    public javax.swing.JLabel colLbl;
    public javax.swing.JLabel greenLbl;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel panBlueScroller;
    public javax.swing.JPanel panGreenScroller;
    private javax.swing.JPanel panRedScroller;
    private javax.swing.JPanel panScroller;
    public javax.swing.JLabel redLbl;
    public javax.swing.JScrollBar scrBlue;
    public javax.swing.JScrollBar scrGreen;
    public javax.swing.JScrollBar scrRed;
    // End of variables declaration//GEN-END:variables
}
