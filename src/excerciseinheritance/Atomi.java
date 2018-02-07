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
public class Atomi {
    
    protected int protonit;
    protected int elektronit;
    
    
    
    public int getProtonit(){
        return protonit;
    } 
    
    public int getElektronit(){
        return elektronit;
    }
    
    public void setProtonit(int protonit){
        this.protonit = protonit;
    }
    
    public void setElektronit(int elektronit){
        this.elektronit = elektronit;
    }

    public void setAtomConfig(int protonit, int elektronit){
        setProtonit(protonit);
        setElektronit(elektronit);
    }
    
    public void getAtomConfig(){
        System.out.println(protonit + " " + elektronit);
    }
    }
    
        
        
    
    
    
    


