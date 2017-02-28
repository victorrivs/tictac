/*
 * Main game loop
 * @author Victor Riveros
 */
package riverostictac;
import javax.swing.JFrame;

public class TicTac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new TicTacGUI();
        frame.setTitle ("GUI.Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
