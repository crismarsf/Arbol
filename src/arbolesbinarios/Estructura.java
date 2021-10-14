/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesbinarios;

/**
 *
 * @author crist
 */
public class Estructura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arbol tree = new Arbol();
        
        tree.insert(4, "Naranja");
        tree.insert(8, "Manzana");
        tree.insert(1, "Uva");  
        tree.insert(9, "Sandia");
        tree.insert(7, "Pera");
      
        tree.run(tree.root);//Recorre el arbol - Si quiero un lado uso .left o .right
    }
    
}
