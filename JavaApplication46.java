/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication46;

/**
 *
 * @author Marco
 */
public class JavaApplication46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account c1=new Account();
        c1.setID(1122);
        c1.setbalance(20000);
        c1.setannualinterestrate(4.5);
        c1.Withdraw(2500);
        c1.deposit(3000);
        c1.printall();
    
    }
    
}
