package translator;

import java.io.FileReader;
import java.io.*;
import static translator.Translator.textToCheck;

/**
 * Māori to English/English to Maori Translator
 *
 * @author keannamackereth
 */
public class userInput extends javax.swing.JFrame {

    /**
     * Creates new form userInput
     */
    public userInput() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTxtArea = new javax.swing.JTextArea();
        inputTxtFld = new javax.swing.JTextField();
        tranBtn = new javax.swing.JButton();
        tranFileBtn = new javax.swing.JButton();
        mRdBtn = new javax.swing.JRadioButton();
        eRdBtn = new javax.swing.JRadioButton();
        translateFileChooser = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        displayTxtArea.setColumns(20);
        displayTxtArea.setRows(5);
        jScrollPane1.setViewportView(displayTxtArea);

        tranBtn.setText("Translate It ");
        tranBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tranBtnActionPerformed(evt);
            }
        });

        tranFileBtn.setText("Translate File");
        tranFileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tranFileBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(mRdBtn);
        mRdBtn.setSelected(true);
        mRdBtn.setText("Māori to English");
        mRdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRdBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(eRdBtn);
        eRdBtn.setText("English to Māori");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(inputTxtFld))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eRdBtn)
                            .addComponent(mRdBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(translateFileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tranFileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tranBtn)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mRdBtn)
                            .addComponent(tranBtn))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eRdBtn)
                            .addComponent(tranFileBtn)))
                    .addComponent(translateFileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mRdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRdBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mRdBtnActionPerformed

    /**
     * When clicked the button will translate the text that is inputed (either
     * Maori- English or English - Maori)
     *
     * @param evt
     */
    private void tranBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tranBtnActionPerformed
        //saves the untraslated input from the text-field and splits the sentance up at every space so it is easier to find which word needs to translate
        String words[] = inputTxtFld.getText().split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            Translator.textToCheck.add(word);
        }
        //if the Maori radio button is selected the program will run the Maori to English array (translateThisM)
        if (mRdBtn.isSelected() == true) {
            Translator.translateThisM();
            //if the English radio button is selected the program will run the English to Maori array (translateThisE)
        } else {
            Translator.translateThisE();
        }
        //loop through the array list adding words back into a string
        String translatedText = "";
        for (int i = 0; i < Translator.textToCheck.size(); i++) {
            translatedText = translatedText + " " + Translator.textToCheck.get(i);
        }
        //display the translated text in the text area
        displayTxtArea.setText(translatedText);
        /**
         * clear the text area when a new word is typed, so there isn't just a
         * long line of translated words, and so it is easy for the user to know
         * which word they just translated
         */
        Translator.textToCheck.clear();
    }//GEN-LAST:event_tranBtnActionPerformed
    /**
     * When clicked the button will open a file selector which the user will
     * then be able to choose a file that the program can translate
     *
     * @param evt
     */
    private void tranFileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tranFileBtnActionPerformed
        //if the Maori radio button is selected the program will run the Maori to English array (translateThisM)
        if (mRdBtn.isSelected() == true) {
            Translator.translateThisM();
            //if the English radio button is selected the program will run the English to Maori array (translateThisE)
        } else {
            Translator.translateThisE();
        }
        //open the file chooser and save its current return value (open or cancel)
        int returnVal = translateFileChooser.showOpenDialog(userInput.this);
        //was the open button chosen by the user?
        if (returnVal == translateFileChooser.APPROVE_OPTION) {
            //save the selected file an text file
            File file = translateFileChooser.getSelectedFile();
            //Display the translated text in the Text area
            Translator.readAFile(file);
        }
    }//GEN-LAST:event_tranFileBtnActionPerformed

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
            java.util.logging.Logger.getLogger(userInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userInput().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea displayTxtArea;
    private javax.swing.JRadioButton eRdBtn;
    private javax.swing.JTextField inputTxtFld;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton mRdBtn;
    private javax.swing.JButton tranBtn;
    private javax.swing.JButton tranFileBtn;
    private javax.swing.JFileChooser translateFileChooser;
    // End of variables declaration//GEN-END:variables
}
