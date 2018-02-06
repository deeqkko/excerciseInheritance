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
public class Viesti {
    private String sisältö;

    public String getSisältö() {
        return sisältö;
    }

    public void setSisältö(String sisältö) {
        this.sisältö = sisältö;
    } 
    
    public void lähetä(){
        System.out.println(getSisältö());
    }
}
