/*
 * CaptureMainFrame.java
 *
 * Created on 21-oct-2011, 18:54:39
 */
package ubu.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import java.util.ResourceBundle;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import ubu.logic.Mediator;

/**
 *
 * @author Rubén
 */
public class CaptureMainFrame extends javax.swing.JFrame {
    /*Bundle for language localization*/

    private ResourceBundle res;
    private static CaptureTray guiTray;
    private List<Image> iconList = new ArrayList<Image>();
    private Mediator mediator = new Mediator();
    private boolean isRecClicked = false;

    /** Creates new form CaptureMainFrame */
    public CaptureMainFrame() {
        String logoS, logoL;
        logoS = "/res/logo_s.png";
        logoL = "/res/logo_l.png";
        iconList.add(
                new javax.swing.ImageIcon(getClass().getResource(logoS)).getImage());
        iconList.add(
                new javax.swing.ImageIcon(getClass().getResource(logoL)).getImage());
        Locale.setDefault(Locale.CHINESE);
        if (!Locale.getDefault().getLanguage().equals("es")) {
            JComponent.setDefaultLocale(Locale.ENGLISH);
        }
        res = ResourceBundle.getBundle("ubu.view.localization.Bundles",
                Locale.getDefault());
        guiTray = new CaptureTray(this, res, mediator);
        initComponents();
        pack();
        setLocationRelativeTo(null);
        addWindowListener(new java.awt.event.WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent we) {
                guiTray.restoreTray();
                JOptionPane.showMessageDialog(CaptureMainFrame.this, res.getString("minim"),
                        res.getString("warning"), JOptionPane.WARNING_MESSAGE);
                setVisible(false);
            }
        });

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ConfigFileFilter configFileFilter =
        new ConfigFileFilter();
        loadFileChooser = new javax.swing.JFileChooser();
        aboutDialog = new javax.swing.JDialog();
        aboutNameLabel = new javax.swing.JLabel();
        ubuLabel = new javax.swing.JLabel();
        ubuPanel = new javax.swing.JPanel();
        drawLabel = new javax.swing.JLabel();
        groupLabel = new javax.swing.JLabel();
        versionsLabel = new javax.swing.JLabel();
        locationFileChooser = new javax.swing.JFileChooser();
        saveFileChooser = new javax.swing.JFileChooser();
        settingsPanel = new javax.swing.JPanel();
        appLabel = new javax.swing.JLabel();
        appTextField = new javax.swing.JTextField();
        fpsLabel = new javax.swing.JLabel();
        fpsSpinner = new javax.swing.JSpinner();
        locationTextField = new javax.swing.JTextField();
        locationLabel = new javax.swing.JLabel();
        locationButton = new javax.swing.JButton();
        recordPanel = new javax.swing.JPanel();
        recordToggleButton = new javax.swing.JToggleButton();
        activeWindowLabel = new javax.swing.JLabel();
        recSeparator = new javax.swing.JSeparator();
        stopButton = new javax.swing.JButton();
        mainMenuBar = new javax.swing.JMenuBar();
        configMenu = new javax.swing.JMenu();
        loadMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        configSeparator = new javax.swing.JPopupMenu.Separator();
        exitMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        loadFileChooser.setFileFilter(configFileFilter);
        loadFileChooser.setAcceptAllFileFilterUsed(false);

        aboutDialog.setTitle(res.getString("aboutDialog"));
        aboutDialog.setBackground(new java.awt.Color(153, 255, 153));
        aboutDialog.setBounds(new java.awt.Rectangle(10, 10, 299, 176));
        aboutDialog.setResizable(false);

        aboutNameLabel.setFont(new java.awt.Font("Tahoma", 1, 12));
        aboutNameLabel.setForeground(new java.awt.Color(0, 0, 51));
        aboutNameLabel.setText(res.getString("aboutNameLabel"));

        ubuLabel.setFont(new java.awt.Font("Tahoma", 2, 11));
        ubuLabel.setText(res.getString("ubuLabel"));

        String ubuW="/res/ubu.png";
        drawLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(ubuW)));

        javax.swing.GroupLayout ubuPanelLayout = new javax.swing.GroupLayout(ubuPanel);
        ubuPanel.setLayout(ubuPanelLayout);
        ubuPanelLayout.setHorizontalGroup(
            ubuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(drawLabel)
        );
        ubuPanelLayout.setVerticalGroup(
            ubuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(drawLabel)
        );

        groupLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        groupLabel.setForeground(new java.awt.Color(0, 0, 51));
        groupLabel.setText(res.getString("groupLabel"));

        versionsLabel.setText(res.getString("versionsLabel"));

        javax.swing.GroupLayout aboutDialogLayout = new javax.swing.GroupLayout(aboutDialog.getContentPane());
        aboutDialog.getContentPane().setLayout(aboutDialogLayout);
        aboutDialogLayout.setHorizontalGroup(
            aboutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutDialogLayout.createSequentialGroup()
                .addComponent(ubuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(aboutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aboutDialogLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ubuLabel))
                    .addGroup(aboutDialogLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(aboutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aboutNameLabel)
                            .addComponent(groupLabel)
                            .addComponent(versionsLabel))))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        aboutDialogLayout.setVerticalGroup(
            aboutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aboutNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(groupLabel)
                .addGap(28, 28, 28)
                .addComponent(versionsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(ubuLabel)
                .addContainerGap())
            .addComponent(ubuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        locationFileChooser.setAcceptAllFileFilterUsed(false);
        locationFileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationFileChooserActionPerformed(evt);
            }
        });

        saveFileChooser.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle(res.getString("aboutNameLabel"));
        setIconImages(iconList);
        setResizable(false);

        settingsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        appLabel.setFont(new java.awt.Font("Courier New", 1, 11));
        appLabel.setForeground(new java.awt.Color(0, 51, 102));
        appLabel.setText(res.getString("appLabel"));

        appTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        appTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appTextFieldActionPerformed(evt);
            }
        });

        fpsLabel.setFont(new java.awt.Font("Courier New", 1, 11));
        fpsLabel.setForeground(new java.awt.Color(0, 51, 102));
        fpsLabel.setText(res.getString("fpsLabel"));

        fpsSpinner.setModel(new javax.swing.SpinnerNumberModel(5, 1, 10, 1));

        locationTextField.setEditable(false);
        locationTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationTextFieldActionPerformed(evt);
            }
        });

        locationLabel.setFont(new java.awt.Font("Courier New", 1, 11));
        locationLabel.setForeground(new java.awt.Color(0, 51, 102));
        locationLabel.setText(res.getString("locationLabel"));

        locationButton.setText("Dir");
        locationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(appLabel)
                    .addGroup(settingsPanelLayout.createSequentialGroup()
                        .addComponent(fpsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fpsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(locationLabel)
                    .addComponent(appTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addGroup(settingsPanelLayout.createSequentialGroup()
                        .addComponent(locationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(locationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(appLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(appTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fpsLabel)
                    .addComponent(fpsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(locationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locationButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        recordPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), res.getString("recordPanel"), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Courier New", 0, 11), new java.awt.Color(0, 51, 102))); // NOI18N

        String rec="/res/rec.png";
        recordToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource(rec)));
        recordToggleButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                recordToggleButtonItemStateChanged(evt);
            }
        });

        activeWindowLabel.setFont(new java.awt.Font("Courier New", 1, 11));
        activeWindowLabel.setForeground(Color.BLACK);
        activeWindowLabel.setText(res.getString("stoppedStatus"));

        recSeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        String stop="/res/stop.png";
        stopButton.setIcon(new javax.swing.ImageIcon(getClass().getResource(stop)));
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout recordPanelLayout = new javax.swing.GroupLayout(recordPanel);
        recordPanel.setLayout(recordPanelLayout);
        recordPanelLayout.setHorizontalGroup(
            recordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recordPanelLayout.createSequentialGroup()
                .addGroup(recordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(recordPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(recordToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(recSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(recordPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(activeWindowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        recordPanelLayout.setVerticalGroup(
            recordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recordPanelLayout.createSequentialGroup()
                .addGroup(recordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stopButton, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addGroup(recordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(recordToggleButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(recSeparator, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(activeWindowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        configMenu.setForeground(new java.awt.Color(0, 0, 102));
        configMenu.setText(res.getString("configMenu"));

        loadMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        loadMenuItem.setForeground(new java.awt.Color(0, 0, 102));
        loadMenuItem.setIcon(UIManager.getIcon("FileChooser.upFolderIcon"));
        loadMenuItem.setText(res.getString("loadMenuItem"));
        loadMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadMenuItemActionPerformed(evt);
            }
        });
        configMenu.add(loadMenuItem);

        saveMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveMenuItem.setForeground(new java.awt.Color(0, 0, 102));
        saveMenuItem.setIcon(UIManager.getIcon("FileView.floppyDriveIcon"));
        saveMenuItem.setText(res.getString("saveMenuItem"));
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        configMenu.add(saveMenuItem);
        configMenu.add(configSeparator);

        exitMenuItem.setForeground(new java.awt.Color(0, 0, 102));
        exitMenuItem.setText(res.getString("exitMenuItem"));
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        configMenu.add(exitMenuItem);

        mainMenuBar.add(configMenu);

        helpMenu.setForeground(new java.awt.Color(0, 0, 102));
        helpMenu.setText(res.getString("helpMenu"));

        aboutMenuItem.setForeground(new java.awt.Color(0, 0, 102));
        aboutMenuItem.setIcon(UIManager.getIcon("FileChooser.homeFolderIcon"));
        aboutMenuItem.setText(res.getString("aboutMenuItem"));
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        mainMenuBar.add(helpMenu);

        setJMenuBar(mainMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(settingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(recordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(settingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void appTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appTextFieldActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_appTextFieldActionPerformed

private void locationTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationTextFieldActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_locationTextFieldActionPerformed

private void loadMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadMenuItemActionPerformed
    int returnVal = loadFileChooser.showOpenDialog(null);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
        File file = loadFileChooser.getSelectedFile();
        List<String> config;
        try {
            config = mediator.getConfig(file.getCanonicalPath());
            if (config != null) {
                appTextField.setText(config.get(0));
                Integer fpsVal = new Integer(config.get(1));
                //Check if the fps value from the config file is acceptable.
                if (fpsVal.intValue() <= 10 && fpsVal.intValue() >= 1) {
                    fpsSpinner.setValue(fpsVal);
                }
                locationTextField.setText(config.get(2));
            } else {
                JOptionPane.showMessageDialog(this,
                        res.getString("invalidXML"), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            //LOG
            System.out.println("ERROR: " + ex);
        }
    } else {
        //If cancel was pressed, od nothing
    }
}//GEN-LAST:event_loadMenuItemActionPerformed

private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
    int returnVal = loadFileChooser.showSaveDialog(null);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
        File file = loadFileChooser.getSelectedFile();
        try {
            String output = locationTextField.getText();
            String fps = fpsSpinner.getValue().toString();
            String appName = appTextField.getText();
            //If values are correct write into XML, else display dialog.
            if (!(output.isEmpty()) && !(fps.isEmpty()) && !(appName.isEmpty())){
                String fpath = file.getCanonicalPath();
                if(!(fpath.endsWith(".fcml"))){
                    fpath=fpath+".fcml"; //If extension is not chosen, append
                }
                mediator.setConfig(appName,
                        fps, output, fpath);
            } else {
                JOptionPane.showMessageDialog(this,
              res.getString("invalidSave"), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            System.out.println("ERROR: " + file.getAbsolutePath());
        }
    } else {
        //If cancel was pressed, do nothing
    }
}//GEN-LAST:event_saveMenuItemActionPerformed

private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
    System.exit(0);
}//GEN-LAST:event_exitMenuItemActionPerformed

private void locationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationButtonActionPerformed
    int returnVal = locationFileChooser.showSaveDialog(null);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
        File file = locationFileChooser.getSelectedFile();
        try {
            locationTextField.setText(file.getCanonicalPath());

        } catch (Exception ex) {
            System.out.println("ERROR: " + file.getAbsolutePath());
        }
    } else {
        //If cancel was pressed, do nothing
    }
}//GEN-LAST:event_locationButtonActionPerformed

private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
    aboutDialog.setLocationRelativeTo(this);
    aboutDialog.setVisible(true);
}//GEN-LAST:event_aboutMenuItemActionPerformed

//Blocks or allows user input on the program
    private void setUserInput(boolean hasInput) {
        appTextField.setEditable(hasInput);
        fpsSpinner.setEnabled(hasInput);
        locationButton.setEnabled(hasInput);
        configMenu.setEnabled(hasInput);
        helpMenu.setEnabled(hasInput);
        loadMenuItem.setEnabled(hasInput);
        saveMenuItem.setEnabled(hasInput);
        guiTray.getMenuItemExit().setEnabled(hasInput);
    }

private void recordToggleButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_recordToggleButtonItemStateChanged
    if (recordToggleButton.isSelected()) {
        //check framerate,program to record,checkRate,path,format
        if (fpsSpinner.getValue() != null && (!(appTextField.getText().isEmpty()))
                && (!(locationTextField.getText().isEmpty()))) {
            int fpes = getFps();
            int checkrate = 500;
            mediator.start(1000 / fpes, appTextField.getText(),
                    500, locationTextField.getText(), "jpg");
            setUserInput(false);
            activeWindowLabel.setText(res.getString("recordingStatus"));
            activeWindowLabel.setForeground(Color.red);
            isRecClicked = true;
        } else {
            JOptionPane.showMessageDialog(CaptureMainFrame.this, res.getString("notSet"),
                    "Error", JOptionPane.ERROR_MESSAGE);
            recordToggleButton.setSelected(false);
            isRecClicked=false;
            activeWindowLabel.setText(res.getString("stoppedStatus"));
            activeWindowLabel.setForeground(Color.BLACK);
        }
    } else { // PAUSE
        mediator.pause();
        recordToggleButton.setSelected(false);
        isRecClicked=false;
        activeWindowLabel.setText(res.getString("pausedStatus"));
        activeWindowLabel.setForeground(Color.BLUE);
    }
}//GEN-LAST:event_recordToggleButtonItemStateChanged

protected int getFps(){
    return ((Integer) fpsSpinner.getValue()).intValue();
}

protected void pressStop(){
    recordToggleButton.setSelected(false);
    isRecClicked=false;
    mediator.stop(locationTextField.getText(),
            getFps());
    setUserInput(true);
    activeWindowLabel.setText(res.getString("stoppedStatus"));
    activeWindowLabel.setForeground(Color.BLACK);
}
//Programmatically performs a click on the record button
protected void doClickStart(){
    recordToggleButton.doClick();
}

protected void doClickStop(){
    stopButton.doClick();
}
protected boolean isRecClicked(){
    return isRecClicked;
}

private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
        pressStop();
}//GEN-LAST:event_stopButtonActionPerformed

private void locationFileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationFileChooserActionPerformed
}//GEN-LAST:event_locationFileChooserActionPerformed

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
            java.util.logging.Logger.getLogger(CaptureMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CaptureMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CaptureMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CaptureMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new CaptureMainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog aboutDialog;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JLabel aboutNameLabel;
    private javax.swing.JLabel activeWindowLabel;
    private javax.swing.JLabel appLabel;
    private javax.swing.JTextField appTextField;
    private javax.swing.JMenu configMenu;
    private javax.swing.JPopupMenu.Separator configSeparator;
    private javax.swing.JLabel drawLabel;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JLabel fpsLabel;
    private javax.swing.JSpinner fpsSpinner;
    private javax.swing.JLabel groupLabel;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JFileChooser loadFileChooser;
    private javax.swing.JMenuItem loadMenuItem;
    private javax.swing.JButton locationButton;
    private javax.swing.JFileChooser locationFileChooser;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JTextField locationTextField;
    private javax.swing.JMenuBar mainMenuBar;
    private javax.swing.JSeparator recSeparator;
    private javax.swing.JPanel recordPanel;
    private javax.swing.JToggleButton recordToggleButton;
    private javax.swing.JFileChooser saveFileChooser;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JPanel settingsPanel;
    private javax.swing.JButton stopButton;
    private javax.swing.JLabel ubuLabel;
    private javax.swing.JPanel ubuPanel;
    private javax.swing.JLabel versionsLabel;
    // End of variables declaration//GEN-END:variables
}
