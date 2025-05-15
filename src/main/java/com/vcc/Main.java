package com.vcc;

import com.vcc.form.workspace.VPGMainForm;
import com.vcc.form.workspace.VPGWorkspaceForm;
import com.vcc.ui.WorkspacePanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.stream.IntStream;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author david
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    final private VPGMainForm mainForm;
    public Main() {
        initComponents();
        
        setTitle("VCC Project Manager");
        mainForm = new VPGMainForm();
        mainForm.doInitialize();
        
        refreshTabs();
    }
    
    private void refreshTabs() {
        // 1. if some forms are hidden, then close form
        // 2. add tab if order missing
        // 3. reorder tabs if not inorder
        for (int i = tpWorkspace.getTabCount() - 1; i >= 0; i++) {
            WorkspacePanel panel = (WorkspacePanel)tpWorkspace.getTabComponentAt(i);
            if (panel.getTabOrder() < 0) {
                panel.close(true);
                tpWorkspace.remove(i);
            }
        }
        
        for (long i = 0; i < mainForm.getWorkspaceFormsCount(); i++) {
            WorkspacePanel panel = new WorkspacePanel(mainForm.getWorkspaceFormsAtIndex(i));
            String title = panel.getWorkspaceName();
            tpWorkspace.addTab(title, panel);
            
            
        // TODO: Add "X" at Tab
//        JPanel tabPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//        JLabel tabLabel = new JLabel(title);
//        JButton closeButton = new JButton("X");
//
//        closeButton.addActionListener(e -> {
//            int index = tpWorkspace.indexOfTab(title);
//            if (index != -1) {
//                tpWorkspace.remove(index);
//            }
//        });
//
//        tabPanel.add(tabLabel);
//        tabPanel.add(closeButton);
//        tpWorkspace.setTabComponentAt(tpWorkspace.indexOfTab(title), tabPanel);

    // rename tab
//    tabLabel.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                if (e.getClickCount() == 2) {
//                    renameTab(tabLabel, title);
//                }
//            }
//        });
            addTabPopupMenu(title);
        }
    }
    
    private void addTabPopupMenu(String title) {
        // Adding right-click popup menu
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem closeTabItem = new JMenuItem("Close Tab");
        closeTabItem.addActionListener(e -> {
            int index = tpWorkspace.indexOfTab(title);
            if (index != -1) {
                tpWorkspace.remove(index);
            }
        });
        popupMenu.add(closeTabItem);

        tpWorkspace.setComponentPopupMenu(popupMenu); // Set popup menu to tab panel
        tpWorkspace.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
    }

//    private void renameTab(JLabel tabLabel, String oldTitle) {
//        JTextField textField = new JTextField(oldTitle);
//        textField.selectAll();
//        textField.addActionListener(e -> {
//            String newTitle = textField.getText();
//            int index = tabbedPane.indexOfTab(oldTitle);
//            if (index != -1) {
//                tabbedPane.setTitleAt(index, newTitle);
//                tabLabel.setText(newTitle);
//                tabbedPane.setTabComponentAt(index, createTabComponent(newTitle)); // Update tab component
//            }
//        });
//
//        // Replace tab label with text field
//        tabLabel.getParent().remove(tabLabel);
//        tabLabel.getParent().add(textField);
//        textField.requestFocusInWindow();
//        textField.addFocusListener(new FocusAdapter() {
//            @Override
//            public void focusLost(FocusEvent e) {
//                String newTitle = textField.getText();
//                int index = tabbedPane.indexOfTab(oldTitle);
//                if (index != -1) {
//                    tabbedPane.setTitleAt(index, newTitle);
//                    tabLabel.setText(newTitle);
//                    tabbedPane.setTabComponentAt(index, createTabComponent(newTitle)); // Update tab component
//                }
//            }
//        });
//        tabLabel.getParent().revalidate();
//        tabLabel.getParent().repaint();
//    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpWorkspace = new javax.swing.JTabbedPane();
        mbMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miAddWorkspace = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");

        miAddWorkspace.setText("Add Workspace");
        miAddWorkspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddWorkspaceActionPerformed(evt);
            }
        });
        jMenu1.add(miAddWorkspace);

        mbMenuBar.add(jMenu1);

        jMenu2.setText("Edit");
        mbMenuBar.add(jMenu2);

        setJMenuBar(mbMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpWorkspace, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpWorkspace, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miAddWorkspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddWorkspaceActionPerformed
        mainForm.addWorkspaceForms();
    }//GEN-LAST:event_miAddWorkspaceActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } 
        catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // Set the property to use the screen menu bar on macOS
        System.setProperty("apple.laf.useScreenMenuBar", "true");
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar mbMenuBar;
    private javax.swing.JMenuItem miAddWorkspace;
    private javax.swing.JTabbedPane tpWorkspace;
    // End of variables declaration//GEN-END:variables
}
