//You think you know, but you don't
//Myla Fairchild
//I was wrong

import javax.swing.JOptionPane;

  public class JonSnow
  {
  
    public static void main(String[] args)
    {
    
      int selection;
      boolean isYes;
      selection = JOptionPane.showConfirmDialog(null,
        "Is Jon Snow dead?");
      isYes = (selection == JOptionPane.YES_OPTION);
      JOptionPane.showMessageDialog(null,
        "That answer is " + isYes);
        
      JOptionPane.showConfirmDialog(null,
        "A data input error has occurred. Continue?",
        "Data input error", JOptionPane.YES_NO_OPTION,
        JOptionPane.ERROR_MESSAGE);
     }
  }
