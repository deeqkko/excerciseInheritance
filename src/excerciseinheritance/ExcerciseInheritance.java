/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excerciseinheritance;

/**
 *
 * @author hamkTeam4/deeqkko
 */
public class ExcerciseInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Viesti msg = new Viesti();
        Sähköposti email = new Sähköposti();
        msg.setSisältö("Notta terve");
        msg.lähetä();
        email.setSisältö("to:toni.laitinen@hamk.fi\nfrom:kimmo.koivusalo@student.hamk.fi\nTOPIC: Java janottaa.\nMSG: Nyt maistuisi kyllä pari kylmää olutta.");
        email.lähetä();
    }
    
}
