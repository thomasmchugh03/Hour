
package hour13_gui;
import javax.swing.*;
import java.awt.*;

public class Combo_box extends JFrame
{
    public Combo_box()
    {
        super("Combo Boxes and Text Area");
        setLookAndFeel();
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set text box size
        JTextArea text = new JTextArea(8,40);
        // if line reachers end of text box, go to next line
        text.setLineWrap(true);
        //not specified in book
        text.setWrapStyleWord(true);
        //Scroll component used for text box
        JScrollPane scroll = new JScrollPane(text,
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        //create combo box
        JComboBox professions = new JComboBox();
        
        FlowLayout flo = new FlowLayout();
        professions.addItem("Butcher");
        professions.addItem("Baker");
        professions.addItem("Archer");
        professions.addItem("Paladin");
        setLayout(flo);
        //Makes combo box accept input
        professions.setEditable(true);
        add(professions);
        add(scroll);
        setVisible(true);
    }
    
    private void setLookAndFeel()
    {
        try
        {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch(Exception exc)
        {
                
        }
    }
    
    public static void main(String[] args)
    {
        Combo_box frame = new Combo_box();
    }
}
