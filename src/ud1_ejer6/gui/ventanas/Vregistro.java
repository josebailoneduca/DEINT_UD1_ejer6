/*
LICENCIA JOSE JAVIER BO
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
Lista de paquetes:
 */

package ud1_ejer6.gui.ventanas;

/**
 *
 * @author Jose Javier BO
 */
public class Vregistro extends javax.swing.JFrame {

    /** Creates new form Vregistro */
    public Vregistro() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpTurno = new javax.swing.ButtonGroup();
        panelGeneral = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        panelInterno = new javax.swing.JPanel();
        lbDeporte = new javax.swing.JLabel();
        inputDeporte = new javax.swing.JComboBox<>();
        lbNivel = new javax.swing.JLabel();
        inputNivel = new javax.swing.JSpinner();
        lbTurno = new javax.swing.JLabel();
        inputManana = new javax.swing.JRadioButton();
        inputTarde = new javax.swing.JRadioButton();
        lbRenovacion = new javax.swing.JLabel();
        inputTrimestral = new javax.swing.JCheckBox();
        inputAnual = new javax.swing.JCheckBox();
        separador = new javax.swing.JSeparator();
        panelHijos = new javax.swing.JPanel();
        btnToggleTabla = new javax.swing.JButton();
        btnAddHijo = new javax.swing.JButton();
        scrollTblHijos = new javax.swing.JScrollPane();
        tblHijos = new javax.swing.JTable();
        btnMatricular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("REGISTRO DEPORTIVO");

        panelInterno.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Seleccion deporte", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N
        panelInterno.setPreferredSize(new java.awt.Dimension(419, 128));

        lbDeporte.setText("Deporte");

        inputDeporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tenis", "Padel", "Squash" }));

        lbNivel.setText("Nivel");

        inputNivel.setModel(new javax.swing.SpinnerListModel(new String[] {"Inicial", "Medio", "Avanzado", "Profesional"}));

        lbTurno.setText("Turno");

        btnGrpTurno.add(inputManana);
        inputManana.setText("Mañana");

        btnGrpTurno.add(inputTarde);
        inputTarde.setText("Tarde");

        lbRenovacion.setText("Renovacion");

        inputTrimestral.setText("Trimestral");

        inputAnual.setText("Anual");

        panelHijos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Hijos"));
        panelHijos.setPreferredSize(new java.awt.Dimension(397, 10));

        btnToggleTabla.setLabel("Ver/Ocultar tabla");

        btnAddHijo.setLabel("Añadir HIjo");

        tblHijos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollTblHijos.setViewportView(tblHijos);

        javax.swing.GroupLayout panelHijosLayout = new javax.swing.GroupLayout(panelHijos);
        panelHijos.setLayout(panelHijosLayout);
        panelHijosLayout.setHorizontalGroup(
            panelHijosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHijosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHijosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHijosLayout.createSequentialGroup()
                        .addComponent(btnToggleTabla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddHijo))
                    .addGroup(panelHijosLayout.createSequentialGroup()
                        .addComponent(scrollTblHijos, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelHijosLayout.setVerticalGroup(
            panelHijosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHijosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHijosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnToggleTabla)
                    .addComponent(btnAddHijo))
                .addGap(18, 18, 18)
                .addComponent(scrollTblHijos, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelInternoLayout = new javax.swing.GroupLayout(panelInterno);
        panelInterno.setLayout(panelInternoLayout);
        panelInternoLayout.setHorizontalGroup(
            panelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInternoLayout.createSequentialGroup()
                .addGroup(panelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInternoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(panelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputManana)
                            .addComponent(lbTurno)
                            .addComponent(inputTarde)))
                    .addGroup(panelInternoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lbDeporte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputDeporte, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbNivel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbRenovacion)
                    .addComponent(inputNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputTrimestral)
                    .addComponent(inputAnual))
                .addGap(30, 30, 30))
            .addGroup(panelInternoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelHijos, 401, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(separador))
                .addContainerGap())
        );
        panelInternoLayout.setVerticalGroup(
            panelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInternoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputDeporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDeporte)
                    .addComponent(lbNivel)
                    .addComponent(inputNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTurno)
                    .addComponent(lbRenovacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputManana)
                    .addComponent(inputTrimestral))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputTarde)
                    .addComponent(inputAnual))
                .addGap(18, 18, 18)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelHijos, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnMatricular.setLabel("MATRICULAR");

        javax.swing.GroupLayout panelGeneralLayout = new javax.swing.GroupLayout(panelGeneral);
        panelGeneral.setLayout(panelGeneralLayout);
        panelGeneralLayout.setHorizontalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMatricular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelInterno, javax.swing.GroupLayout.Alignment.LEADING, 421, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelGeneralLayout.setVerticalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelInterno, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMatricular)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddHijo;
    private javax.swing.ButtonGroup btnGrpTurno;
    private javax.swing.JButton btnMatricular;
    private javax.swing.JButton btnToggleTabla;
    private javax.swing.JCheckBox inputAnual;
    private javax.swing.JComboBox<String> inputDeporte;
    private javax.swing.JRadioButton inputManana;
    private javax.swing.JSpinner inputNivel;
    private javax.swing.JRadioButton inputTarde;
    private javax.swing.JCheckBox inputTrimestral;
    private javax.swing.JLabel lbDeporte;
    private javax.swing.JLabel lbNivel;
    private javax.swing.JLabel lbRenovacion;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbTurno;
    private javax.swing.JPanel panelGeneral;
    private javax.swing.JPanel panelHijos;
    private javax.swing.JPanel panelInterno;
    private javax.swing.JScrollPane scrollTblHijos;
    private javax.swing.JSeparator separador;
    private javax.swing.JTable tblHijos;
    // End of variables declaration//GEN-END:variables

}