/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrame;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ismail
 */
public class StudentGradeTracker extends javax.swing.JFrame {
     private ArrayList<Student> students;
    /**
     * Creates new form StudentGradeTracker
     */
    public StudentGradeTracker() {
        initComponents();
        students = new ArrayList<>();
    }
    
    // Inner class to represent a Student
    class Student {
        String name;
        int grade;
        
        public Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }
        
        public String toString() {
            return name +": "+ grade;
        }
    }
    // Method to add a student
    public void addStudent() {
        String name = txtname.getText().trim(); // trim remove any leading or trailing whitespace
        String grade = txtgrade.getText().trim();
        
        // Validate input
        if(name.isEmpty() || grade.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter both name and grade.");
            return;  // Exit the method if validation fails
        }
        
        // Try-catch: Catches invalid grade input and shows an error message.
        try{
           int g = Integer.parseInt(grade); 
           
           // Create a new Student object and add it to the ArrayList
           students.add(new Student(name,g));
           
            // Display the student's info in the JTextArea
            txtInformation.append(name +": "+ g +"\n");
            
            JOptionPane.showMessageDialog(this, "Data Added.");
            // Display the student's info in the studentDisplay
            txtname.setText(null);
             txtgrade.setText(null);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number for grade.");
        }
    }
    
        // method to calculate the average, highest, and lowest grades
    public void calculateGrade() {
        if(students.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No students available to calculate.");
            return;
        }
        
        int sum = 0;
        int highGrade = Integer.MIN_VALUE; // Initialize highest to the smallest possible value
        int lowGrade = Integer.MAX_VALUE;  // Initialize lowest to the largest possible value
        
        // Iterate over the ArrayList to calculate
        for(Student student : students) {
            int grade = student.grade; // grade field of the Student object is used to compute
            sum += grade;
            if(grade > highGrade) highGrade = grade;
            if(grade < lowGrade) lowGrade = grade;
        }
        
        int average = sum / students.size();
        
        // display grades analysis in gradeAnalysis
        txtanalysis.setText(""); // Clear previous analysis
        txtanalysis.append("Average: " + average + "\n");
        txtanalysis.append("Highest: " + highGrade + "\n");
        txtanalysis.append("Lowest: " + lowGrade + "\n");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtgrade = new app.bolivia.swing.JCTextField();
        txtname = new app.bolivia.swing.JCTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInformation = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtanalysis = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 54, 460, -1));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/student.png"))); // NOI18N
        jLabel1.setText("Student Grade Tracker");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/analyse-alt.png"))); // NOI18N
        jLabel2.setText("Grade Analysis :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, -1, -1));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/student (1).png"))); // NOI18N
        jLabel3.setText("Student Name :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/mobile.png"))); // NOI18N
        jLabel4.setText("Grade :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/interrogation.png"))); // NOI18N
        jLabel5.setText("Students Information :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, -1, -1));

        txtgrade.setPlaceholder("Enter Grade.....");
        jPanel1.add(txtgrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 380, 50));

        txtname.setPlaceholder("Enter Student name...");
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 380, 50));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CALCULATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 370, 120, 40));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ADD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 220, 100, 40));

        txtInformation.setColumns(20);
        txtInformation.setRows(5);
        jScrollPane1.setViewportView(txtInformation);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 380, 110));

        txtanalysis.setColumns(20);
        txtanalysis.setRows(5);
        jScrollPane2.setViewportView(txtanalysis);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 380, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        addStudent();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        calculateGrade();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentGradeTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentGradeTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentGradeTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentGradeTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentGradeTracker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtInformation;
    private javax.swing.JTextArea txtanalysis;
    private app.bolivia.swing.JCTextField txtgrade;
    private app.bolivia.swing.JCTextField txtname;
    // End of variables declaration//GEN-END:variables
}
