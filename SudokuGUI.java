import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class SudokuGUI extends javax.swing.JFrame {

    /**
     * Creates new form SudokuGUI
     * @param titulo
     */
    private final javax.swing.JTextField[] arr;
    public SudokuGUI(String titulo) {
        super(titulo);
        initComponents();
        
        this.arr = new javax.swing.JTextField[]{
            jTextField1, jTextField2, jTextField3, jTextField4, jTextField5,
            jTextField6, jTextField7, jTextField8, jTextField9, jTextField10,
            jTextField11, jTextField12, jTextField13, jTextField14, jTextField15,
            jTextField16, jTextField17, jTextField18, jTextField19, jTextField20,
            jTextField21, jTextField22, jTextField23, jTextField24, jTextField25,
            jTextField26, jTextField27, jTextField28, jTextField29, jTextField30,
            jTextField31, jTextField32, jTextField33, jTextField34, jTextField35,
            jTextField36, jTextField37, jTextField38, jTextField39, jTextField40,
            jTextField41, jTextField42, jTextField43, jTextField44, jTextField45,
            jTextField46, jTextField47, jTextField48, jTextField49, jTextField50,
            jTextField51, jTextField52, jTextField53, jTextField54, jTextField55,
            jTextField56, jTextField57, jTextField58, jTextField59, jTextField60,
            jTextField61, jTextField62, jTextField63, jTextField64, jTextField65,
            jTextField66, jTextField67, jTextField68, jTextField69, jTextField70,
            jTextField71, jTextField72, jTextField73, jTextField74, jTextField75,
            jTextField76, jTextField77, jTextField78, jTextField79, jTextField80,
            jTextField81
        };
        
        for(int i=0;i<81;i++)
            arr[i].setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        ResolverBtn = new javax.swing.JButton();
        LimpiarBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jPanel25 = new javax.swing.JPanel();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jPanel26 = new javax.swing.JPanel();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jTextField52 = new javax.swing.JTextField();
        jTextField53 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jPanel27 = new javax.swing.JPanel();
        jTextField55 = new javax.swing.JTextField();
        jTextField56 = new javax.swing.JTextField();
        jTextField57 = new javax.swing.JTextField();
        jTextField64 = new javax.swing.JTextField();
        jTextField65 = new javax.swing.JTextField();
        jTextField66 = new javax.swing.JTextField();
        jTextField73 = new javax.swing.JTextField();
        jTextField74 = new javax.swing.JTextField();
        jTextField75 = new javax.swing.JTextField();
        jPanel28 = new javax.swing.JPanel();
        jTextField58 = new javax.swing.JTextField();
        jTextField59 = new javax.swing.JTextField();
        jTextField60 = new javax.swing.JTextField();
        jTextField67 = new javax.swing.JTextField();
        jTextField68 = new javax.swing.JTextField();
        jTextField69 = new javax.swing.JTextField();
        jTextField76 = new javax.swing.JTextField();
        jTextField77 = new javax.swing.JTextField();
        jTextField78 = new javax.swing.JTextField();
        jPanel29 = new javax.swing.JPanel();
        jTextField61 = new javax.swing.JTextField();
        jTextField62 = new javax.swing.JTextField();
        jTextField63 = new javax.swing.JTextField();
        jTextField70 = new javax.swing.JTextField();
        jTextField71 = new javax.swing.JTextField();
        jTextField72 = new javax.swing.JTextField();
        jTextField79 = new javax.swing.JTextField();
        jTextField80 = new javax.swing.JTextField();
        jTextField81 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ResolverBtn.setText("Resolver");
        ResolverBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ResolverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResolverBtnActionPerformed(evt);
            }
        });

        LimpiarBtn.setText("Limpiar");
        LimpiarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ResolverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LimpiarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LimpiarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(ResolverBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new java.awt.GridLayout(3, 3));

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel16.setLayout(new java.awt.GridLayout(3, 3));

        jTextField1.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1.setName(""); // NOI18N
        jPanel16.add(jTextField1);

        jTextField2.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel16.add(jTextField2);

        jTextField3.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel16.add(jTextField3);

        jTextField10.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel16.add(jTextField10);

        jTextField11.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel16.add(jTextField11);

        jTextField12.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel16.add(jTextField12);

        jTextField19.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField19.setName("20"); // NOI18N
        jPanel16.add(jTextField19);
        jTextField19.getAccessibleContext().setAccessibleName("");

        jTextField20.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel16.add(jTextField20);

        jTextField21.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel16.add(jTextField21);

        jPanel1.add(jPanel16);

        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel18.setLayout(new java.awt.GridLayout(3, 3));

        jTextField4.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel18.add(jTextField4);

        jTextField5.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel18.add(jTextField5);

        jTextField6.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel18.add(jTextField6);

        jTextField13.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel18.add(jTextField13);

        jTextField14.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel18.add(jTextField14);

        jTextField15.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel18.add(jTextField15);

        jTextField22.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel18.add(jTextField22);

        jTextField23.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel18.add(jTextField23);

        jTextField24.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel18.add(jTextField24);

        jPanel1.add(jPanel18);

        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.setLayout(new java.awt.GridLayout(3, 3));

        jTextField7.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel19.add(jTextField7);

        jTextField8.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel19.add(jTextField8);

        jTextField9.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel19.add(jTextField9);

        jTextField16.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel19.add(jTextField16);

        jTextField17.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel19.add(jTextField17);

        jTextField18.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel19.add(jTextField18);

        jTextField25.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel19.add(jTextField25);

        jTextField26.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel19.add(jTextField26);

        jTextField27.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel19.add(jTextField27);

        jPanel1.add(jPanel19);

        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel20.setLayout(new java.awt.GridLayout(3, 3));

        jTextField28.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel20.add(jTextField28);

        jTextField29.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel20.add(jTextField29);

        jTextField30.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel20.add(jTextField30);

        jTextField37.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel20.add(jTextField37);

        jTextField38.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel20.add(jTextField38);

        jTextField39.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel20.add(jTextField39);

        jTextField46.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField46.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel20.add(jTextField46);

        jTextField47.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField47.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel20.add(jTextField47);

        jTextField48.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField48.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel20.add(jTextField48);

        jPanel1.add(jPanel20);

        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel25.setLayout(new java.awt.GridLayout(3, 3));

        jTextField31.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel25.add(jTextField31);

        jTextField32.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel25.add(jTextField32);

        jTextField33.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel25.add(jTextField33);

        jTextField40.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel25.add(jTextField40);

        jTextField41.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel25.add(jTextField41);

        jTextField42.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel25.add(jTextField42);

        jTextField49.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField49.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel25.add(jTextField49);

        jTextField50.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel25.add(jTextField50);

        jTextField51.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField51.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel25.add(jTextField51);

        jPanel1.add(jPanel25);

        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel26.setLayout(new java.awt.GridLayout(3, 3));

        jTextField34.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel26.add(jTextField34);

        jTextField35.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel26.add(jTextField35);

        jTextField36.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel26.add(jTextField36);

        jTextField43.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel26.add(jTextField43);

        jTextField44.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel26.add(jTextField44);

        jTextField45.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel26.add(jTextField45);

        jTextField52.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField52.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel26.add(jTextField52);

        jTextField53.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField53.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel26.add(jTextField53);

        jTextField54.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField54.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel26.add(jTextField54);

        jPanel1.add(jPanel26);

        jPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel27.setLayout(new java.awt.GridLayout(3, 3));

        jTextField55.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField55.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel27.add(jTextField55);

        jTextField56.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField56.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel27.add(jTextField56);

        jTextField57.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField57.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel27.add(jTextField57);

        jTextField64.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField64.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel27.add(jTextField64);

        jTextField65.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField65.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel27.add(jTextField65);

        jTextField66.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField66.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel27.add(jTextField66);

        jTextField73.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField73.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel27.add(jTextField73);

        jTextField74.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField74.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel27.add(jTextField74);

        jTextField75.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField75.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel27.add(jTextField75);

        jPanel1.add(jPanel27);

        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel28.setLayout(new java.awt.GridLayout(3, 3));

        jTextField58.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField58.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel28.add(jTextField58);

        jTextField59.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField59.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel28.add(jTextField59);

        jTextField60.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField60.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel28.add(jTextField60);

        jTextField67.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField67.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel28.add(jTextField67);

        jTextField68.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField68.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel28.add(jTextField68);

        jTextField69.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField69.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel28.add(jTextField69);

        jTextField76.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField76.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel28.add(jTextField76);

        jTextField77.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField77.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel28.add(jTextField77);

        jTextField78.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField78.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel28.add(jTextField78);

        jPanel1.add(jPanel28);

        jPanel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel29.setLayout(new java.awt.GridLayout(3, 3));

        jTextField61.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField61.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel29.add(jTextField61);

        jTextField62.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField62.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel29.add(jTextField62);

        jTextField63.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField63.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel29.add(jTextField63);

        jTextField70.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField70.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel29.add(jTextField70);

        jTextField71.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField71.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel29.add(jTextField71);

        jTextField72.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField72.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel29.add(jTextField72);

        jTextField79.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField79.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel29.add(jTextField79);

        jTextField80.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField80.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel29.add(jTextField80);

        jTextField81.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jTextField81.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel29.add(jTextField81);

        jPanel1.add(jPanel29);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LimpiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarBtnActionPerformed
        for(int i = 0; i < 81; i++){ 
            arr[i].setText("");
            arr[i].setBackground(Color.WHITE);
        }
        System.out.println("Sudoku borrado");
    }//GEN-LAST:event_LimpiarBtnActionPerformed

    private void ResolverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResolverBtnActionPerformed
        try {
            for(int i = 0; i < 81; i++)
                arr[i].setBackground(Color.WHITE);
            
            int[][] mat = new int[9][9];
            int indice=0;
            for(int r = 0; r < 9; r++) {
               for(int c = 0; c < 9; c++) {
                    String n=arr[indice].getText();
                    if(!n.isEmpty() && (n.length() > 1 || n.charAt(0) <= '0' || n.charAt(0) > '9')){
                        arr[indice].setBackground(Color.RED);
                        throw new SudokuErrorException(r,c);
                    }else{
                        if(n.isEmpty())
                            n="0";
                        mat[r][c]=Integer.parseInt(n);
                    }
                    indice++;
                }
            }
            
            mat=Sudoku.resolverSudoku(mat);
            indice=0;
            for(int r = 0; r < 9; r++) {
                for(int c = 0; c < 9; c++) {
                    arr[indice].setText(""+mat[r][c]);
                    indice++;
                }
            }
            
            JOptionPane.showMessageDialog(null,"Sudoku completado con éxito", "Completo", JOptionPane.INFORMATION_MESSAGE);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_ResolverBtnActionPerformed

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
            java.util.logging.Logger.getLogger(SudokuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SudokuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SudokuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SudokuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SudokuGUI("Sudoku").setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LimpiarBtn;
    private javax.swing.JButton ResolverBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField63;
    private javax.swing.JTextField jTextField64;
    private javax.swing.JTextField jTextField65;
    private javax.swing.JTextField jTextField66;
    private javax.swing.JTextField jTextField67;
    private javax.swing.JTextField jTextField68;
    private javax.swing.JTextField jTextField69;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField70;
    private javax.swing.JTextField jTextField71;
    private javax.swing.JTextField jTextField72;
    private javax.swing.JTextField jTextField73;
    private javax.swing.JTextField jTextField74;
    private javax.swing.JTextField jTextField75;
    private javax.swing.JTextField jTextField76;
    private javax.swing.JTextField jTextField77;
    private javax.swing.JTextField jTextField78;
    private javax.swing.JTextField jTextField79;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField80;
    private javax.swing.JTextField jTextField81;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}