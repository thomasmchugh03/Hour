package hour13_gui;

import javax.swing.*;

public class SalutionFrame extends JFrame
{
    public SalutionFrame()
    {
        setTitle("Salutation Mundo");
        setLookAndFeel();
        setSize(350,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    private void setLookAndFeel()
    {
        try
        {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch (Exception exc)
        {
            //ignore error
        }
    }
    
    public static void main(String[] args)
    {
        SalutionFrame frame = new SalutionFrame();
    }
}
