
package hour13_gui;
import javax.swing.*;
import java.awt.*;

public class Playback extends JFrame
{
    public Playback()
    {
        super("Playback");
        setLookAndFeel();
        setSize(700,160);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Creates text label flush right and a text field after it
        JLabel pageLabel = new JLabel("Webpage address: ", JLabel.RIGHT);
        JTextField pageAddress = new JTextField(20);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        //creates buttons for use
        JButton play = new JButton("Play");
        JButton stop = new JButton("Stop");
        JButton pause = new JButton("Pause");
        //creates check boxes
        JCheckBox frogLegs = new JCheckBox("Frog Legs grande", false);
        JCheckBox fishTacos = new JCheckBox("Fish Tacos", false);
        JCheckBox emuNuggets = new JCheckBox("Emu Nuggets", false);
        JCheckBox jumboSize = new JCheckBox("Jumbo Size", false);
        //creates a group of meals for checkboxes
        ButtonGroup meals = new ButtonGroup();
        //adds foods to the group so that if one box and another box from that group is selected, it unchecks the old box
        meals.add(frogLegs);
        meals.add(fishTacos);
        meals.add(emuNuggets);
        add(jumboSize);
        add(frogLegs);
        add(emuNuggets);
        add(fishTacos);
        
        add(play);
        add(stop);
        add(pause);
        add(pageLabel);
        add(pageAddress);
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
        Playback frame = new Playback();
    }
}
