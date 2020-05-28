package analyseurlex;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.CaretEvent;

/**
 *
 * @author tiptop
 */
public class Fenetre extends javax.swing.JFrame {

    int Nbr_Err = 0;
    int Ligne_Err = 0;
    char Err_caract;
    boolean Err;
    File fileSave = new File("c:\\");
    boolean continueSave = false;

    public Fenetre() {
        initComponents();
        initial();

    }
    static String[] code;
    static int i = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuCopier1 = new javax.swing.JMenuItem();
        jMenuCouper1 = new javax.swing.JMenuItem();
        jMenuColler1 = new javax.swing.JMenuItem();
        jMenuSelect1 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuSupprim1 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuInitial1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuNouveau = new javax.swing.JMenuItem();
        jMenuOuvrir = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuEnre = new javax.swing.JMenuItem();
        jMenuEnreSous = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuFermer = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuCopier = new javax.swing.JMenuItem();
        jMenuCouper = new javax.swing.JMenuItem();
        jMenuColler = new javax.swing.JMenuItem();
        jMenuSelect = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuSupprim = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuInitial = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();

        jPopupMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPopupMenu1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPopupMenu1MouseExited(evt);
            }
        });
        jPopupMenu1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                jPopupMenu1PopupMenuCanceled(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jMenuCopier1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuCopier1.setIcon(new javax.swing.ImageIcon("C:\\Users\\tiptop\\Documents\\NetBeansProjects\\AnalyseurLex\\images\\copy.png")); // NOI18N
        jMenuCopier1.setText("Copier");
        jPopupMenu1.add(jMenuCopier1);

        jMenuCouper1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuCouper1.setIcon(new javax.swing.ImageIcon("C:\\Users\\tiptop\\Documents\\NetBeansProjects\\AnalyseurLex\\images\\cut.png")); // NOI18N
        jMenuCouper1.setText("Couper");
        jMenuCouper1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCouper1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuCouper1);

        jMenuColler1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuColler1.setIcon(new javax.swing.ImageIcon("C:\\Users\\tiptop\\Documents\\NetBeansProjects\\AnalyseurLex\\images\\paste.png")); // NOI18N
        jMenuColler1.setText("Coller");
        jMenuColler1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuColler1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuColler1);

        jMenuSelect1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuSelect1.setIcon(new javax.swing.ImageIcon("C:\\Users\\tiptop\\Documents\\NetBeansProjects\\AnalyseurLex\\images\\arrow_next.png")); // NOI18N
        jMenuSelect1.setText("Selectionner tout");
        jMenuSelect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSelect1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuSelect1);
        jPopupMenu1.add(jSeparator6);

        jMenuSupprim1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuSupprim1.setIcon(new javax.swing.ImageIcon("C:\\Users\\tiptop\\Documents\\NetBeansProjects\\AnalyseurLex\\images\\action_delete.png")); // NOI18N
        jMenuSupprim1.setText("Supprimer");
        jMenuSupprim1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSupprim1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuSupprim1);
        jPopupMenu1.add(jSeparator7);

        jMenuInitial1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuInitial1.setIcon(new javax.swing.ImageIcon("C:\\Users\\tiptop\\Documents\\NetBeansProjects\\AnalyseurLex\\images\\effac.png")); // NOI18N
        jMenuInitial1.setText("Initialiser");
        jMenuInitial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInitial1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuInitial1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analyseur Lexical Zinou");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTextArea1.setBackground(new java.awt.Color(237, 235, 235));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(" Champ de saisie  :"));
        jTextArea1.setComponentPopupMenu(jPopupMenu1);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextArea1MouseClicked(evt);
            }
        });
        jTextArea1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                Fenetre.this.caretUpdate(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setBackground(new java.awt.Color(102, 102, 102));
        jTextArea2.setColumns(20);
        jTextArea2.setEditable(false);
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setRows(5);
        jTextArea2.setBorder(javax.swing.BorderFactory.createTitledBorder(" Resultat  :"));
        jScrollPane2.setViewportView(jTextArea2);

        jLabel1.setAutoscrolls(true);
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(" Gestion des erreurs  :"));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Analyseur Lexical");

        jMenu1.setText("Fichier");

        jMenuNouveau.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuNouveau.setIcon(new javax.swing.ImageIcon("C:\\Users\\tiptop\\Documents\\NetBeansProjects\\AnalyseurLex\\images\\newFile.png")); // NOI18N
        jMenuNouveau.setText("Nouveau");
        jMenuNouveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNouveauActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuNouveau);

        jMenuOuvrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuOuvrir.setIcon(new javax.swing.ImageIcon("C:\\Users\\tiptop\\Documents\\NetBeansProjects\\AnalyseurLex\\images\\openFile.png")); // NOI18N
        jMenuOuvrir.setText("Ouvrir");
        jMenuOuvrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuOuvrirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuOuvrir);
        jMenu1.add(jSeparator2);

        jMenuEnre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuEnre.setIcon(new javax.swing.ImageIcon("C:\\Users\\tiptop\\Documents\\NetBeansProjects\\AnalyseurLex\\images\\save.png")); // NOI18N
        jMenuEnre.setText("Enregistrer");
        jMenuEnre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEnreActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuEnre);

        jMenuEnreSous.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuEnreSous.setIcon(new javax.swing.ImageIcon("C:\\Users\\tiptop\\Documents\\NetBeansProjects\\AnalyseurLex\\images\\saveAll.png")); // NOI18N
        jMenuEnreSous.setText("Enregistrer-sous");
        jMenuEnreSous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEnreSousActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuEnreSous);
        jMenu1.add(jSeparator1);

        jMenuFermer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jMenuFermer.setIcon(new javax.swing.ImageIcon("C:\\Users\\tiptop\\Documents\\NetBeansProjects\\AnalyseurLex\\images\\exit.png")); // NOI18N
        jMenuFermer.setText("Fermer");
        jMenuFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFermerActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuFermer);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Editer");

        jMenuCopier.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuCopier.setIcon(new javax.swing.ImageIcon("C:\\Users\\tiptop\\Documents\\NetBeansProjects\\AnalyseurLex\\images\\copy.png")); // NOI18N
        jMenuCopier.setText("Copier");
        jMenu3.add(jMenuCopier);

        jMenuCouper.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuCouper.setIcon(new javax.swing.ImageIcon("C:\\Users\\tiptop\\Documents\\NetBeansProjects\\AnalyseurLex\\images\\cut.png")); // NOI18N
        jMenuCouper.setText("Couper");
        jMenuCouper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCouperActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuCouper);

        jMenuColler.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuColler.setIcon(new javax.swing.ImageIcon("C:\\Users\\tiptop\\Documents\\NetBeansProjects\\AnalyseurLex\\images\\paste.png")); // NOI18N
        jMenuColler.setText("Coller");
        jMenuColler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCollerActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuColler);

        jMenuSelect.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuSelect.setIcon(new javax.swing.ImageIcon("C:\\Users\\tiptop\\Documents\\NetBeansProjects\\AnalyseurLex\\images\\arrow_next.png")); // NOI18N
        jMenuSelect.setText("Selectionner tout");
        jMenuSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSelectActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuSelect);
        jMenu3.add(jSeparator4);

        jMenuSupprim.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuSupprim.setIcon(new javax.swing.ImageIcon("C:\\Users\\tiptop\\Documents\\NetBeansProjects\\AnalyseurLex\\images\\action_delete.png")); // NOI18N
        jMenuSupprim.setText("Supprimer");
        jMenuSupprim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSupprimActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuSupprim);
        jMenu3.add(jSeparator5);

        jMenuInitial.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuInitial.setIcon(new javax.swing.ImageIcon("C:\\Users\\tiptop\\Documents\\NetBeansProjects\\AnalyseurLex\\images\\effac.png")); // NOI18N
        jMenuInitial.setText("Initialiser");
        jMenuInitial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInitialActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuInitial);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Exécuter");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jMenu2.add(jSeparator3);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem5.setIcon(new javax.swing.ImageIcon("C:\\Users\\tiptop\\Documents\\NetBeansProjects\\AnalyseurLex\\images\\cimpiler.png")); // NOI18N
        jMenuItem5.setText("Compiler");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addGap(85, 85, 85))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    final void initial() {
        jTextArea1.setText("");
        jTextArea2.setText("");
        jLabel1.setText("             * Ligne(s) = ..."
                + " 			                           * Token(s) = ..."
                + "     						         * Erreur(s) = ...");



    }
    /*** dimension de la fenetre ***/
    Toolkit kit = Toolkit.getDefaultToolkit();
    Dimension screenSize = kit.getScreenSize();
    int screenHeight = screenSize.height;
    int screenWidth = screenSize.width;

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        BufferedReader reader = new BufferedReader(new StringReader(jTextArea1.getText()));
        jTextArea2.setText("");
        Ligne_Err = 0;
        Nbr_Err = 0;
        String ligne;
        if (jTextArea1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Saisissez votre texte!", "Information", JOptionPane.INFORMATION_MESSAGE);

        } else {

            Lexical lex = new Lexical();
            try {
                while ((ligne = reader.readLine()) != null) {
                    Ligne_Err += 1;
                    if (ligne.length() != 0) {
                        lex.Verifier(ligne);
                    }
                }
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            //retourne le resultat de la compilation

            for (int i = 0; i < lex.Token.size(); i++) {
                jTextArea2.setText(jTextArea2.getText() + "  Le mot ('  " + lex.Token.get(i)
                        + "  ')" + "		 ===>		" + lex.Type.get(i)
                        + "\n_______________________________________________________"
                        + "_______________________________________________________"
                        + "__________\n");
            }
            //retourne la gestion d'erreurs								//
            jLabel1.setText("             * Ligne(s) =" + Ligne_Err
                    + " 			                           * Token(s) = " + lex.Token.size()
                    + "      						         * Erreur(s) = " + lex.Nbr_Err);

            System.out.println("haveErr: " + lex.haveErrors());
            if (lex.haveErrors() == 0) {
                code = lex.getArray();

                //retourne la gestion d'erreurs
                for (int i = 0; i < code.length; i++) {
                    System.out.println(i + " - " + code[i]);
                }
                jLabel1.setText("             * Ligne(s) =" + Ligne_Err
                        + " 			                           * Token(s) = " + lex.Token.size()
                        + "      						         * Erreur(s) = " + lex.Nbr_Err);


                lex.Token.clear();
                lex.Type.clear();
            }
        }

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuInitialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInitialActionPerformed
        initial();

    }//GEN-LAST:event_jMenuInitialActionPerformed

    private void jMenuNouveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNouveauActionPerformed
        Container c = getContentPane();
        int selection = JOptionPane.showConfirmDialog(c, "voulez-vous enregistrer le texte en cours ?", "  Enregistrer ?",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(c, "Impossible!     \nVeuillez selectionné le temps!", "Information", JOptionPane.WARNING_MESSAGE);

        if (selection == JOptionPane.YES_OPTION) {
            /*On donne une condition au d�part, si le fichier n'a jamais �t� sauvegard�,
            un JFileChooser apparait pour demander o� sauvgarder sinon il le sauvegarde
            automatiquement*/

            //On cr��e un nouvel objet JFileChoosr
            JFileChooser saver = new JFileChooser();

            if (continueSave == false) {

                //On change le r�pertoire courant de d�part, on sera dans le dossier fileSave
                saver.setCurrentDirectory(fileSave);
                //On fait appara�tre le JFileChooser � l'�cran
                int returnVal = saver.showSaveDialog(Fenetre.this);

                //Si le fichier choisi peut etre sauv�
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    //Le fichier fileSave devient le fichier s�lectionner
                    fileSave = saver.getSelectedFile();

                    //On essaie
                    try {
                        FileWriter out = new FileWriter(fileSave);

                        //D'�crire le contenu du textArea
                        String contenu = jTextArea1.getText();
                        //A l'aide d'un FileWriter dans le fichier qu'on a choisi
                        out.write(contenu);
                        //On ferme l'objet FileWriter
                        out.close();

                        //On modifie le titre du bloc note en lui donnant le nom du doc
                        setTitle(fileSave.getName() + " - Source Analyseur Lexical");

                        //c.f. text si dessus
                        continueSave = true;
                    } //Si ca ne fonctionne pas
                    catch (Exception ex) {
                        //On cache la fen�tre
                        saver.setVisible(false);
                        continueSave = false;

                    }
                }

            } //Si le fichier � �t� sauvegarder au moins une fois
            else {
                //On essaie
                try {
                    FileWriter out = new FileWriter(fileSave);
                    //D'�crire le contenu du textArea
                    String contenu = jTextArea1.getText();
                    //A l'aide d'un FileWriter dans le fichier qu'on a choisi
                    out.write(contenu);
                    //On ferme l'objet FileWriter
                    out.close();

                    //On modifie le titre du bloc note en lui donnant le nom du doc
                    setTitle(fileSave.getName() + " - Source Analyseur Lexical");
                    continueSave = true;
                } //Si ca ne fonctionne pas
                catch (Exception ex) {
                    //On cache la fen�tre
                    saver.setVisible(false);
                    continueSave = false;
                }

            }
        }

    }//GEN-LAST:event_jMenuNouveauActionPerformed

    private void jMenuOuvrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuOuvrirActionPerformed

        //On cr��e un nouvel objet JFileChooser.
        JFileChooser chooser = new JFileChooser();
        //On change le r�pertoire courant de d�part, on sera dans le dossier fileSave.
        chooser.setCurrentDirectory(fileSave);
        //On fait appara�tre le JFileChooser � l'�cran.
        int returnVal = chooser.showOpenDialog(Fenetre.this);

        //Si le fichier choisi peut s'ouvrir.
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            //On efface le text contenu dans le textArea.
            jTextArea1.setText("");
            //Le fichier fileSave devient le fichier s�lectionner.
            fileSave = chooser.getSelectedFile();
            //c.f sauvegarder.
            continueSave = true;

            //On essaie
            try {
                FileReader in = new FileReader(fileSave);
                //De recopier le fichier dans le textArea
                int c;
                while ((c = in.read()) != -1) {
                    String a = (char) c + "";
                    jTextArea1.append(a);
                }
                //On ferme le FileReader
                in.close();

                //On modifier le titre du Bloc Note avec le titre du fichier
                setTitle(fileSave.getName() + " - Source Analyseur Lexical");
            } //Si ca ne fonctionne pas
            catch (Exception ex) {
                //On ferme la fen�tre
                chooser.setVisible(false);
            }

        }






    }//GEN-LAST:event_jMenuOuvrirActionPerformed

    private void jMenuEnreSousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEnreSousActionPerformed
        JFileChooser saver = new JFileChooser();
        //On change le r�pertoire courant de d�part, on sera dans le dossier fileSave
        saver.setCurrentDirectory(fileSave);
        //On fait appara�tre le JFileChooser � l'�cran
        int returnVal = saver.showSaveDialog(Fenetre.this);

        //Si le fichier choisi peut etre sauv�
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            //Le fichier fileSave devient le fichier s�lectionner
            fileSave = saver.getSelectedFile();

            //On essaie
            try {
                FileWriter out = new FileWriter(fileSave);
                //D'�crire le contenu du textArea
                String contenu = jTextArea1.getText();
                //A l'aide d'un FileWriter dans le fichier qu'on a choisi
                out.write(contenu);
                //On ferme l'objet FileWriter
                out.close();

                //On modifie le titre du bloc note en lui donnant le nom du doc
                setTitle(fileSave.getName() + " - Source Analyseur Lexical");

                //c.f. text sauvegarder sous
                continueSave = true;
            } //Si ca ne fonctionne pas
            catch (Exception ex) {
                //On cache la fen�tre
                saver.setVisible(false);
                continueSave = false;

            }
        }

    }//GEN-LAST:event_jMenuEnreSousActionPerformed

    private void jMenuEnreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEnreActionPerformed
        /*On donne une condition au d�part, si le fichier n'a jamais �t� sauvegard�,
        un JFileChooser apparait pour demander o� sauvgarder sinon il le sauvegarde
        automatiquement*/

        //On cr��e un nouvel objet JFileChooser

        JFileChooser saver = new JFileChooser();


        if (continueSave == false) {

            //On change le r�pertoire courant de d�part, on sera dans le dossier fileSave
            saver.setCurrentDirectory(fileSave);
            //On fait appara�tre le JFileChooser � l'�cran
            int returnVal = saver.showSaveDialog(Fenetre.this);



            //Si le fichier choisi peut etre sauv�
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                //Le fichier fileSave devient le fichier s�lectionner
                fileSave = saver.getSelectedFile();

                //On essaie
                try {
                    FileWriter out = new FileWriter(fileSave);

                    //D'�crire le co ntenu du textArea
                    String contenu = jTextArea1.getText();
                    //A l'aide d'un FileWriter dans le fichier qu'on a choisi
                    out.write(contenu);
                    //On ferme l'objet FileWriter
                    out.close();

                    //On modifie le titre du bloc note en lui donnant le nom du doc
                    setTitle(fileSave.getName() + " - Source Analyseur Lexical");

                    //c.f. text si dessus
                    continueSave = true;
                } //Si ca ne fonctionne pas
                catch (Exception ex) {
                    //On cache la fen�tre
                    saver.setVisible(false);
                    continueSave = false;
                }
            }

        } //Si le fichier � �t� sauvegarder au moins une fois
        else {
            //On essaie
            try {
                FileWriter out = new FileWriter(fileSave);
                //D'�crire le contenu du textArea
                String contenu = jTextArea1.getText();
                //A l'aide d'un FileWriter dans le fichier qu'on a choisi
                out.write(contenu);
                //On ferme l'objet FileWriter
                out.close();

                //On modifie le titre du bloc note en lui donnant le nom du doc
                setTitle(fileSave.getName() + " - Source Analyseur Lexical");
                continueSave = true;
            } //Si ca ne fonctionne pas
            catch (Exception ex) {
                //On cache la fen�tre
                saver.setVisible(false);
                continueSave = false;
            }
        }



    }//GEN-LAST:event_jMenuEnreActionPerformed

    private void jMenuFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFermerActionPerformed
        Container c = getContentPane();
        String t = jTextArea1.getText();
        int selection1 = JOptionPane.showConfirmDialog(c, "Voulez-vous vraiment quitter l'application ?", "  Quitter ?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (t.length() == 0) {
            System.exit(0);
        } else {
            if (selection1 == JOptionPane.YES_OPTION) {
                int selection2 = JOptionPane.showConfirmDialog(c, "Enregistrer avant de quitter ?", "  Enregistrer ?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (selection2 == JOptionPane.YES_OPTION) {

                    /*On donne une condition au d�part, si le fichier n'a jamais �t� sauvegard�,
                    un JFileChooser apparait pour demander o� sauvgarder sinon il le sauvegarde
                    automatiquement*/

                    //On cr��e un nouvel objet JFileChoosr
                    JFileChooser saver = new JFileChooser();

                    if (continueSave == false) {

                        //On change le r�pertoire courant de d�part, on sera dans le dossier fileSave
                        saver.setCurrentDirectory(fileSave);
                        //On fait appara�tre le JFileChooser � l'�cran
                        int returnVal = saver.showSaveDialog(Fenetre.this);

                        //Si le fichier choisi peut etre sauv�
                        if (returnVal == JFileChooser.APPROVE_OPTION) {
                            //Le fichier fileSave devient le fichier s�lectionner
                            fileSave = saver.getSelectedFile();

                            //On essaie
                            try {
                                FileWriter out = new FileWriter(fileSave);

                                //D'�crire le contenu du textArea
                                String contenu = jTextArea1.getText();
                                //A l'aide d'un FileWriter dans le fichier qu'on a choisi
                                out.write(contenu);
                                //On ferme l'objet FileWriter
                                out.close();

                                //On modifie le titre du bloc note en lui donnant le nom du doc
                                setTitle(fileSave.getName() + " - Source Analyseur Lexical");

                                //c.f. text si dessus
                                continueSave = true;
                            } //Si ca ne fonctionne pas
                            catch (Exception ex) {
                                //On cache la fen�tre
                                saver.setVisible(false);
                                continueSave = false;
                            }
                        }

                    } //Si le fichier � �t� sauvegarder au moins une fois
                    else {
                        //On essaie
                        try {
                            FileWriter out = new FileWriter(fileSave);
                            //D'�crire le contenu du textArea
                            String contenu = jTextArea1.getText();
                            //A l'aide d'un FileWriter dans le fichier qu'on a choisi
                            out.write(contenu);
                            //On ferme l'objet FileWriter
                            out.close();

                            //On modifie le titre du bloc note en lui donnant le nom du doc
                            setTitle(fileSave.getName() + " - Source Analyseur Lexical");
                            continueSave = true;
                        } //Si ca ne fonctionne pas
                        catch (Exception ex) {
                            //On cache la fen�tre
                            saver.setVisible(false);
                            continueSave = false;
                        }
                    }

                    System.exit(0);
                } else {
                    System.exit(0);
                }

            }
        }
    }//GEN-LAST:event_jMenuFermerActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Container c = getContentPane();
        String t = jTextArea1.getText();// calculer la taille du JTextArea
        int selection1 = JOptionPane.showConfirmDialog(c, "Voulez-vous vraiment quitter l'application ?", "  Quitter ?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (t.length() == 0) { // si la taille = 0
            System.exit(0);    // quitter l'application sans enregistrer le contenu 
        } else {               // si non enregistrer
            if (selection1 == JOptionPane.YES_OPTION) {
                int selection2 = JOptionPane.showConfirmDialog(null, "Enregistrer avant de quitter ?", "  Enregistrer ?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (selection2 == JOptionPane.YES_OPTION) {

                    /*On donne une condition au depart, si le fichier n'a jamais �t� sauvegard�,
                    un JFileChooser apparait pour demander o� sauvgarder sinon il le sauvegarde
                    automatiquement*/

                    //On cr��e un nouvel objet JFileChoosr
                    JFileChooser saver = new JFileChooser();

                    if (continueSave == false) {

                        //On change le r�pertoire courant de d�part, on sera dans le dossier fileSave
                        saver.setCurrentDirectory(fileSave);
                        //On fait appara�tre le JFileChooser � l'�cran
                        int returnVal = saver.showSaveDialog(Fenetre.this);

                        //Si le fichier choisi peut etre sauv�
                        if (returnVal == JFileChooser.APPROVE_OPTION) {
                            //Le fichier fileSave devient le fichier s�lectionner
                            fileSave = saver.getSelectedFile();

                            //On essaie
                            try {
                                FileWriter out = new FileWriter(fileSave);

                                //D'�crire le contenu du textArea
                                String contenu = jTextArea1.getText();
                                //A l'aide d'un FileWriter dans le fichier qu'on a choisi
                                out.write(contenu);
                                //On ferme l'objet FileWriter
                                out.close();

                                //On modifie le titre du bloc note en lui donnant le nom du doc
                                setTitle(fileSave.getName() + " - Source Analyseur Lexical");

                                //c.f. text si dessus
                                continueSave = true;
                            } //Si ca ne fonctionne pas
                            catch (Exception ex) {
                                //On cache la fen�tre
                                saver.setVisible(false);
                                continueSave = false;
                            }
                        }

                    } //Si le fichier � �t� sauvegarder au moins une fois
                    else {
                        //On essaie
                        try {
                            FileWriter out = new FileWriter(fileSave);
                            //D'�crire le contenu du textArea
                            String contenu = jTextArea1.getText();
                            //A l'aide d'un FileWriter dans le fichier qu'on a choisi
                            out.write(contenu);
                            //On ferme l'objet FileWriter
                            out.close();

                            //On modifie le titre du bloc note en lui donnant le nom du doc
                            setTitle(fileSave.getName() + " - Source Analyseur Lexical");
                            continueSave = true;
                        } //Si ca ne fonctionne pas
                        catch (Exception ex) {
                            //On cache la fen�tre
                            saver.setVisible(false);
                            continueSave = false;
                        }
                    }

                    System.exit(0);
                } else {
                    System.exit(0);
                }
            }

        }
    }//GEN-LAST:event_formWindowClosing

    private void jMenuCouperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCouperActionPerformed
        jTextArea1.cut();
    }//GEN-LAST:event_jMenuCouperActionPerformed

    private void jMenuCollerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCollerActionPerformed
        jTextArea1.paste();
    }//GEN-LAST:event_jMenuCollerActionPerformed

    private void jMenuSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSelectActionPerformed
        jTextArea1.selectAll();
    }//GEN-LAST:event_jMenuSelectActionPerformed

    private void jMenuSupprimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSupprimActionPerformed
        jTextArea1.replaceSelection("");
    }//GEN-LAST:event_jMenuSupprimActionPerformed

    private void jMenuCouper1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCouper1ActionPerformed
        jTextArea1.cut();
    }//GEN-LAST:event_jMenuCouper1ActionPerformed

    private void jMenuColler1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuColler1ActionPerformed
        jTextArea1.paste();
    }//GEN-LAST:event_jMenuColler1ActionPerformed

    private void jMenuSelect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSelect1ActionPerformed
        jTextArea1.selectAll();
    }//GEN-LAST:event_jMenuSelect1ActionPerformed

    private void jMenuSupprim1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSupprim1ActionPerformed
        jTextArea1.replaceSelection("");
    }//GEN-LAST:event_jMenuSupprim1ActionPerformed

    private void jMenuInitial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInitial1ActionPerformed
        initial();
    }//GEN-LAST:event_jMenuInitial1ActionPerformed

    private void caretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_caretUpdate

        if ((jTextArea1.getSelectedText() == null)) {
            jMenuCopier1.setEnabled(false);
            jMenuCopier.setEnabled(false);
            jMenuCouper1.setEnabled(false);
            jMenuCouper.setEnabled(false);
            jMenuSupprim1.setEnabled(false);
            jMenuSupprim.setEnabled(false);
        } else if ((jTextArea1.getSelectedText() != null)) {
            jMenuCopier1.setEnabled(true);
            jMenuCopier.setEnabled(true);
            jMenuCouper1.setEnabled(true);
            jMenuCouper.setEnabled(true);
            jMenuSupprim1.setEnabled(true);
            jMenuSupprim.setEnabled(true);

        }

    }//GEN-LAST:event_caretUpdate

    private void jTextArea1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MouseClicked
        if ((jTextArea1.getSelectedText() == null)) {
            jMenuCopier1.setEnabled(false);
            jMenuCopier.setEnabled(false);
            jMenuCouper1.setEnabled(false);
            jMenuCouper.setEnabled(false);
            jMenuSupprim1.setEnabled(false);
            jMenuSupprim.setEnabled(false);
        } else if ((jTextArea1.getSelectedText() != null)) {
            jMenuCopier1.setEnabled(true);
            jMenuCopier.setEnabled(true);
            jMenuCouper1.setEnabled(true);
            jMenuCouper.setEnabled(true);
            jMenuSupprim1.setEnabled(true);
            jMenuSupprim.setEnabled(true);

        }
    }//GEN-LAST:event_jTextArea1MouseClicked

    private void jPopupMenu1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPopupMenu1MouseEntered
        if ((jTextArea1.getSelectedText() == null)) {
            jMenuCopier1.setEnabled(false);
            jMenuCouper1.setEnabled(false);
            jMenuSupprim1.setEnabled(false);
        } else if ((jTextArea1.getSelectedText() != null)) {
            jMenuCopier1.setEnabled(true);
            jMenuCouper1.setEnabled(true);
            jMenuSupprim1.setEnabled(true);

        }
    }//GEN-LAST:event_jPopupMenu1MouseEntered

    private void jPopupMenu1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPopupMenu1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPopupMenu1MouseExited

    private void jPopupMenu1PopupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jPopupMenu1PopupMenuCanceled
        if ((jTextArea1.getSelectedText() == null)) {
            jMenuCopier1.setEnabled(false);
            jMenuCouper1.setEnabled(false);
            jMenuSupprim1.setEnabled(false);
        } else if ((jTextArea1.getSelectedText() != null)) {
            jMenuCopier1.setEnabled(true);
            jMenuCouper1.setEnabled(true);
            jMenuSupprim1.setEnabled(true);

        }
    }//GEN-LAST:event_jPopupMenu1PopupMenuCanceled

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Fenetre().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuColler;
    private javax.swing.JMenuItem jMenuColler1;
    private javax.swing.JMenuItem jMenuCopier;
    private javax.swing.JMenuItem jMenuCopier1;
    private javax.swing.JMenuItem jMenuCouper;
    private javax.swing.JMenuItem jMenuCouper1;
    private javax.swing.JMenuItem jMenuEnre;
    private javax.swing.JMenuItem jMenuEnreSous;
    private javax.swing.JMenuItem jMenuFermer;
    private javax.swing.JMenuItem jMenuInitial;
    private javax.swing.JMenuItem jMenuInitial1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuNouveau;
    private javax.swing.JMenuItem jMenuOuvrir;
    private javax.swing.JMenuItem jMenuSelect;
    private javax.swing.JMenuItem jMenuSelect1;
    private javax.swing.JMenuItem jMenuSupprim;
    private javax.swing.JMenuItem jMenuSupprim1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    public static javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
