package GUI;

import Algorithms.*;
import java.awt.Color;
import javax.swing.JOptionPane;
import org.jfree.chart.ui.UIUtils;

public class GUI extends javax.swing.JFrame {
    public GUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        QueueTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        RB3 = new javax.swing.JRadioButton();
        RB2 = new javax.swing.JRadioButton();
        RB1 = new javax.swing.JRadioButton();
        RB4 = new javax.swing.JRadioButton();
        RB5 = new javax.swing.JRadioButton();
        RB6 = new javax.swing.JRadioButton();
        InitialHeaderTF = new javax.swing.JTextField();
        PreviousHeaderTF = new javax.swing.JTextField();
        TrailTrackTF = new javax.swing.JTextField();
        IHeaderL = new javax.swing.JLabel();
        PHeaderL = new javax.swing.JLabel();
        TrackL = new javax.swing.JLabel();
        RunB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        InfoTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Disk Scheduling Simulator");
        setBackground(new java.awt.Color(33, 33, 33));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.red);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Product Sans", 0, 34)); // NOI18N
        jLabel1.setText("Disk Queue");

        QueueTF.setFont(new java.awt.Font("Product Sans", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Product Sans", 0, 34)); // NOI18N
        jLabel2.setText("Scheduling Algorithm");

        buttonGroup1.add(RB3);
        RB3.setFont(new java.awt.Font("Product Sans", 0, 14)); // NOI18N
        RB3.setText("Elevator(SCAN)");
        RB3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB3MouseClicked(evt);
            }
        });

        buttonGroup1.add(RB2);
        RB2.setFont(new java.awt.Font("Product Sans", 0, 14)); // NOI18N
        RB2.setText("Shortest Seek Time First(SSTF)");
        RB2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB2MouseClicked(evt);
            }
        });

        buttonGroup1.add(RB1);
        RB1.setFont(new java.awt.Font("Product Sans", 0, 14)); // NOI18N
        RB1.setText("First Come-First Serve(FCFS)");
        RB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB1MouseClicked(evt);
            }
        });

        buttonGroup1.add(RB4);
        RB4.setFont(new java.awt.Font("Product Sans", 0, 14)); // NOI18N
        RB4.setText("Circular SCAN(C-SCAN)");
        RB4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB4MouseClicked(evt);
            }
        });

        buttonGroup1.add(RB5);
        RB5.setFont(new java.awt.Font("Product Sans", 0, 14)); // NOI18N
        RB5.setText("LOOK");
        RB5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB5MouseClicked(evt);
            }
        });

        buttonGroup1.add(RB6);
        RB6.setFont(new java.awt.Font("Product Sans", 0, 14)); // NOI18N
        RB6.setText("C-LOOK");
        RB6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB6MouseClicked(evt);
            }
        });

        InitialHeaderTF.setFont(new java.awt.Font("Product Sans", 0, 14)); // NOI18N

        PreviousHeaderTF.setFont(new java.awt.Font("Product Sans", 0, 14)); // NOI18N

        TrailTrackTF.setFont(new java.awt.Font("Product Sans", 0, 14)); // NOI18N

        IHeaderL.setFont(new java.awt.Font("Product Sans", 0, 14)); // NOI18N
        IHeaderL.setText("Initial Header");

        PHeaderL.setFont(new java.awt.Font("Product Sans", 0, 14)); // NOI18N
        PHeaderL.setText("Previous Header");

        TrackL.setFont(new java.awt.Font("Product Sans", 0, 14)); // NOI18N
        TrackL.setText("Trail Track");

        RunB.setFont(new java.awt.Font("Product Sans", 0, 20)); // NOI18N
        RunB.setText("Run Simulation");
        RunB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RunBActionPerformed(evt);
            }
        });

        InfoTA.setBackground(javax.swing.UIManager.getDefaults().getColor("Panel.background"));
        InfoTA.setColumns(20);
        InfoTA.setFont(new java.awt.Font("Product Sans", 0, 14)); // NOI18N
        InfoTA.setLineWrap(true);
        InfoTA.setRows(5);
        InfoTA.setToolTipText("");
        InfoTA.setWrapStyleWord(true);
        InfoTA.setBorder(null);
        InfoTA.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        InfoTA.setEnabled(false);
        InfoTA.setFocusable(false);
        InfoTA.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(InfoTA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(QueueTF, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(IHeaderL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(InitialHeaderTF, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(PHeaderL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PreviousHeaderTF, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(TrackL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TrailTrackTF, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(RunB, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RB1)
                            .addComponent(RB4)
                            .addComponent(RB3)
                            .addComponent(RB2)
                            .addComponent(RB5)
                            .addComponent(RB6))
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QueueTF, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RB1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RB2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RB3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RB4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RB5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RB6))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IHeaderL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InitialHeaderTF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PHeaderL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PreviousHeaderTF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TrackL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TrailTrackTF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(RunB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    void EnableAll(){
        PreviousHeaderTF.setEnabled(true);
        TrailTrackTF.setEnabled(true);
        PHeaderL.setForeground(Color.BLACK);
        TrackL.setForeground(Color.BLACK);
    }
    
    private void RB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB1MouseClicked
        EnableAll();
        PreviousHeaderTF.setEnabled(false);
        TrailTrackTF.setEnabled(false);
        PHeaderL.setForeground(Color.GRAY);
        TrackL.setForeground(Color.GRAY);
        InfoTA.setText("FCFS is the simplest of all the Disk Scheduling Algorithms."
                + " In FCFS, the requests are addressed in the order they arrive in the disk queue.");
    }//GEN-LAST:event_RB1MouseClicked

    private void RB2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB2MouseClicked
        EnableAll();
        PreviousHeaderTF.setEnabled(false);
        TrailTrackTF.setEnabled(false);
        PHeaderL.setForeground(Color.GRAY);
        TrackL.setForeground(Color.GRAY);
        InfoTA.setText("In SSTF (Shortest Seek Time First), requests having shortest"
                + " seek time are executed first. So, the seek time of every request is "
                + "calculated in advance in queue and then they are scheduled according to their "
                + "calculated seek time. As a result, the request near the disk arm will get executed first.");
    }//GEN-LAST:event_RB2MouseClicked

    private void RB3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB3MouseClicked
        EnableAll();
        InfoTA.setText("In SCAN algorithm the disk arm moves into a particular direction and "
                + "services the requests coming in its path and after reaching the end of disk,"
                + " it reverses its direction and again services the request arriving in its path. "
                + "Hence, also known as elevator algorithm. As a result, the requests at the midrange "
                + "are serviced more and those arriving behind the disk arm will have to wait.");
    }//GEN-LAST:event_RB3MouseClicked

    private void RB4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB4MouseClicked
        EnableAll();
        InfoTA.setText("In SCAN algorithm, the disk arm again scans the path that has been scanned, "
                + "after reversing its direction. So, it may be possible that too many requests are "
                + "waiting at the other end or there may be zero or few requests pending at the scanned area.");
    }//GEN-LAST:event_RB4MouseClicked

    private void RB5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB5MouseClicked
        EnableAll();
        TrailTrackTF.setEnabled(false);
        TrackL.setForeground(Color.GRAY);
        InfoTA.setText(" It is similar to the SCAN disk scheduling algorithm except the difference "
                + "that the disk arm in spite of going to the end of the disk goes only to the last "
                + "request to be serviced in front of the head and then reverses its direction from "
                + "there only. Thus it prevents the extra delay which occurred due to unnecessary traversal "
                + "to the end of the disk.");
    }//GEN-LAST:event_RB5MouseClicked

    private void RB6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB6MouseClicked
        EnableAll();
        TrailTrackTF.setEnabled(false);
        TrackL.setForeground(Color.GRAY);
        InfoTA.setText("As LOOK is similar to SCAN algorithm, in similar way, CLOOK is similar"
                + " to CSCAN disk scheduling algorithm. In CLOOK, the disk arm inspite of "
                + "going to the end goes only to the last request to be serviced in front "
                + "of the head and then from there goes to the other end’s last request. "
                + "Thus, it also prevents the extra delay which occurred due to unnecessary "
                + "traversal to the end of the disk.");
    }//GEN-LAST:event_RB6MouseClicked

    private void RunBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RunBActionPerformed
        String[] SQueue = QueueTF.getText().split(",");
        int Queue[] = new int[SQueue.length];
        for(int i = 0;i < SQueue.length;i++){
            Queue[i] = Integer.parseInt(SQueue[i]);
        }
        Object[] Parameters;
        
        if(RB1.isSelected()){
            int IH = Integer.parseInt(InitialHeaderTF.getText());
            FCFS a = new FCFS();
            Parameters = a.FCFS(Queue, IH);
            Graph demo = new Graph("FCFS",Parameters);
            demo.pack();
            UIUtils.centerFrameOnScreen(demo);
            demo.setVisible(true);
        }
        else if(RB2.isSelected()){
            int IH = Integer.parseInt(InitialHeaderTF.getText());
            SSTF a = new SSTF();
            Parameters = a.SSTF(Queue, IH);
            Graph demo = new Graph("SSTF",Parameters);
            demo.pack();
            UIUtils.centerFrameOnScreen(demo);
            demo.setVisible(true);
        }
        else if(RB3.isSelected()){
            int IH = Integer.parseInt(InitialHeaderTF.getText());
            int PH = Integer.parseInt(PreviousHeaderTF.getText());
            int TT = Integer.parseInt(TrailTrackTF.getText());
            SCAN a = new SCAN();
            Parameters = a.SCAN(Queue,IH,PH,TT);
            Graph demo = new Graph("SSTF",Parameters);
            demo.pack();
            UIUtils.centerFrameOnScreen(demo);
            demo.setVisible(true);
        
        }
        else if(RB4.isSelected()){
            int IH = Integer.parseInt(InitialHeaderTF.getText());
            int PH = Integer.parseInt(PreviousHeaderTF.getText());
            int TT = Integer.parseInt(TrailTrackTF.getText());
            CSCAN a = new CSCAN();
            Parameters = a.CSCAN(Queue,IH,PH,TT);
            Graph demo = new Graph("SSTF",Parameters);
            demo.pack();
            UIUtils.centerFrameOnScreen(demo);
            demo.setVisible(true);
        }
        else if(RB5.isSelected()){
            int IH = Integer.parseInt(InitialHeaderTF.getText());
            int PH = Integer.parseInt(PreviousHeaderTF.getText());
            LOOK a = new LOOK();
            Parameters = a.LOOK(Queue,IH,PH);
            Graph demo = new Graph("SSTF",Parameters);
            demo.pack();
            UIUtils.centerFrameOnScreen(demo);
            demo.setVisible(true);
        }
        else if(RB6.isSelected()){
            int IH = Integer.parseInt(InitialHeaderTF.getText());
            int PH = Integer.parseInt(PreviousHeaderTF.getText());
            CLOOK a = new CLOOK();
            Parameters = a.CLOOK(Queue, IH,PH);
            Graph demo = new Graph("FCFS",Parameters);
            demo.pack();
            UIUtils.centerFrameOnScreen(demo);
            demo.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"Please select an algorithm first");
        }
        
    }//GEN-LAST:event_RunBActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IHeaderL;
    private javax.swing.JTextArea InfoTA;
    private javax.swing.JTextField InitialHeaderTF;
    private javax.swing.JLabel PHeaderL;
    private javax.swing.JTextField PreviousHeaderTF;
    private javax.swing.JTextField QueueTF;
    private javax.swing.JRadioButton RB1;
    private javax.swing.JRadioButton RB2;
    private javax.swing.JRadioButton RB3;
    private javax.swing.JRadioButton RB4;
    private javax.swing.JRadioButton RB5;
    private javax.swing.JRadioButton RB6;
    private javax.swing.JButton RunB;
    private javax.swing.JLabel TrackL;
    private javax.swing.JTextField TrailTrackTF;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
