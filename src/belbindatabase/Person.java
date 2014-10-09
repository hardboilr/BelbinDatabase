/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belbindatabase;

/**
 *
 * @author Tobias
 */
public class Person 
{
    String navn;
    int adm, ana, cre, fin;

    public Person(String navn, int adm, int ana, int cre, int fin) 
    {
        this.navn = navn;
        this.adm = adm;
        this.ana = ana;
        this.cre = cre;
        this.fin = fin;
    }

    @Override
    public String toString() 
    {
        return "" + navn + "," + adm + "," + ana + "," + cre + "," + fin;
    }
}
