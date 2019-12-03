package app.View;
import javax.swing.*;
public class StudentPanelsView {

    public StudentPanelsView(){setupUI();}

    public void setupUI(){ StudentPanelsForm=new StudentPanelsForm(); }

    public JPanel getStudentPanelsFormRootPanel(){ return StudentPanelsForm.Root; }

    public JLabel getTitleLabel(){ return StudentPanelsForm.titleLabel;}

    public JButton getReserveButton(){ return StudentPanelsForm.reserveButton; }

    private static StudentPanelsForm StudentPanelsForm;

}
