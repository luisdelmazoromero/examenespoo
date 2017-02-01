/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author Alumno
 */
public class FabricaDonas 
{
    private Dona d;
    private void amasar()
    {
        System.out.println("Se amasa la pasta");
    }
    private void combinarIngredientes()
    {
        System.out.println("Se inicia la mezcla de los ingredientes");
    }
    private void hornearEmpacarDona()
    {
        System.out.println("Se hornea y empacan las donas");
    }
    private void empaquetardosDocenas()
    {
        System.out.println("Se empaquetan dos docenas ");
    }
    private void seentregaunadona()
    {
        System.out.println("Se entrega dona");
    }
    public Dona hacerdona(String chocolate, String azucar, String rompope, String fresa, String moka)
    {
        d = new Dona();
        
        d.setChocolate(chocolate);
        d.setAzucar(moka);
        d.setRompope(rompope);
        d.setFresa(fresa);
        d.setMoka(moka);
        
        amasar();
        combinarIngredientes();
        hornearEmpacarDona();
        empaquetardosDocenas();
        seentregaunadona();
        seentregaunadona();
        
        return d;
        
    }
    public static void main(String[] args) 
    {
        FabricaDonas f = new FabricaDonas();
        f.hacerdona("chocolate", "azucar", "rompope", "fresa", "moka")
        
    }
      
    
}
