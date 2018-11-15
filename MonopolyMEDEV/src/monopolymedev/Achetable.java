/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopolymedev;

/**
 *
 * @author sarah
 */
public abstract class Achetable extends Case {

    /**
     * @param args the command line arguments
     */
    protected int prix;
    protected Joueur proprietaire;
    protected int loyer;
    
    /**
     * constructeur sans param
     */
    public Achetables(){
        prix=0;
        proprio=null;
    }
    
    public void setPrix(int p){
        prix=p;
    }
    
    public int getPrix(){
        return prix;
    }
    
    public void setLoyer(int l){
        loyer=l;
    }
    
    public int getLoyer(){
        return loyer;
    }
    
    /**
     * Calculer le loyer
     * @return loyer à payer
     */
    public int calculerLoyer(){
        
    }
    
    /**
     * acheter()
     * il peut changer le propriotaire
     */
    public void acheter(Joueur j){
        proprio=new Joueur (j);
    }
    

    
}
