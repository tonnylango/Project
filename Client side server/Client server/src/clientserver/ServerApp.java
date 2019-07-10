/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientserver;

import java.awt.Cursor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 *
 * @author DEGUZMAN
 */
public class ServerApp extends javax.swing.JFrame {

    /**
     * Creates new form ServerApp
     */
    public ServerApp() {
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

        controlPanel = new javax.swing.JPanel();
        startButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        viewMenu = new javax.swing.JMenu();
        serverInfoMenuItem = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        connectionsMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        clearLogsMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Server");
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        controlPanel.setBackground(new java.awt.Color(102, 102, 102));

        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        stopButton.setText("Stop");
        stopButton.setEnabled(false);
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        infoArea.setColumns(20);
        infoArea.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        infoArea.setLineWrap(true);
        infoArea.setRows(5);
        infoArea.setToolTipText("information area");
        infoArea.setWrapStyleWord(true);
        infoArea.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        infoArea.setEnabled(false);
        infoArea.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(infoArea);

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addComponent(startButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(stopButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startButton)
                    .addComponent(stopButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(controlPanel, java.awt.BorderLayout.CENTER);

        viewMenu.setText("View");

        serverInfoMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        serverInfoMenuItem.setText("Server info");
        serverInfoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverInfoMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(serverInfoMenuItem);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Logs");
        viewMenu.add(jMenuItem2);

        connectionsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        connectionsMenuItem.setText("Connections");
        connectionsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectionsMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(connectionsMenuItem);
        viewMenu.add(jSeparator1);

        clearLogsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        clearLogsMenuItem.setText("Clear logs");
        clearLogsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearLogsMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(clearLogsMenuItem);

        jMenuBar1.add(viewMenu);

        helpMenu.setText("Help");

        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 366, 270);
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        new Thread(this::startServer).start();
    }//GEN-LAST:event_startButtonActionPerformed

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
        new Thread(this::stopServer).start();
    }//GEN-LAST:event_stopButtonActionPerformed

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowStateChanged

    private void connectionsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectionsMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_connectionsMenuItemActionPerformed

    private void clearLogsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearLogsMenuItemActionPerformed
        SwingUtilities.invokeLater(() -> infoArea.setText(""));
    }//GEN-LAST:event_clearLogsMenuItemActionPerformed

    private void serverInfoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverInfoMenuItemActionPerformed
        JTextArea display = new JTextArea();
        new Thread(() -> readFile("server_info_log.txt", display)).start();
        JOptionPane.showMessageDialog(this, new JScrollPane(display), "Server info", WIDTH);
        JOptionPane pane = new JOptionPane();
        
    }//GEN-LAST:event_serverInfoMenuItemActionPerformed

    private void readFile(String file_name, JTextArea displayArea) {
        try {
            FileInputStream inputStream = new FileInputStream(new File("server_info_log.txt"));
            Scanner scanner = new Scanner(new File("server_info_log.txt"));
            while(scanner.hasNext())
                displayArea.append(scanner.next());
        } catch (FileNotFoundException ex) {
            displayArea.append(ex.getMessage() + "\n");
        }
    }
    
    private void startServer() {
        display("Starting server");
        startButton.setEnabled(false);
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            Server.start();
            display("Server started " + Server.isRunning());
            log(Level.INFO, "Server started " + Server.isRunning());
            stopButton.setEnabled(Server.isRunning());
            startButton.setEnabled(!Server.isRunning());
            if (Server.isRunning()) new Thread(this::notifier).start();
            display("Database connection exist: " + Database.checkConnection());
            log(Level.INFO, "Database connection exist: " + Database.checkConnection());
        } catch (IOException ex) {
            log(Level.SEVERE, ex.getMessage());
            display("Error while starting server " + ex.getMessage());
            ex.printStackTrace();
        }
        setCursor(null);

    }
    
    private void stopServer() {
        display("Stopping server");
        stopButton.setEnabled(false);
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            Server.stop();
            display("Server stopped\nServer running: " + Server.isRunning());
            log(Level.INFO, "Server stopped: " );
            startButton.setEnabled(!Server.isRunning());
            stopButton.setEnabled(Server.isRunning());

            display("Database connected: " + Database.checkConnection());
            log(Level.INFO, "Database connected: " + Database.checkConnection() );
        } catch (IOException ex) {
            log(Level.SEVERE, ex.getMessage());
            display("Error while stopping server " + ex.getMessage());
        }
        setCursor(null);
    }

    /**
     * displays a message on the infoArea at Event dispatch thread
     *
     * @param message the message to be displayed
     */
    private void display(String message) {
        SwingUtilities.invokeLater(() -> infoArea.append(message + " ( " + DateFormat.getDateTimeInstance().format(new Date()) + " )\n"));
    }
    
    /**
     * used to log a message into the logger file
     * 
     * @param level the level of the message
     * @param message the message to be logged
     */
    private void log(Level level, String message){
        //ServerInfoLog.log(Level.INFO, "Server started " + Server.isRunning());
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
            java.util.logging.Logger.getLogger(ServerApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServerApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServerApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServerApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem clearLogsMenuItem;
    private javax.swing.JMenuItem connectionsMenuItem;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JTextArea infoArea;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem serverInfoMenuItem;
    private javax.swing.JButton startButton;
    private javax.swing.JButton stopButton;
    private javax.swing.JMenu viewMenu;
    // End of variables declaration//GEN-END:variables

    public void notifier() {
        while (Server.isRunning()) {
            display("Server running \nDatabase connected " + Database.checkConnection());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
            }
        }
    }

class WindowChecker extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent e) {
        ServerApp.this.stopServer();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        if (!Server.isRunning()) {
            JOptionPane.showMessageDialog(null, "Server could not stop running", "Error", JOptionPane.ERROR);
        }
    }
    }
}