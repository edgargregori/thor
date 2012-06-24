/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author HOUSE
 */
public class GeneralCtrl {
    
    
    public static void salvar(Object o)
    {
       persistencia.GeneralDAO.salvar(o);
    }
    
}
