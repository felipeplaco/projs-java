/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioderepeticao;

/**
 *
 * @author ra2557056
 */
public class Exercicioderepeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*repetição com for */
       for (int i = 0; i <= 10; i++)
           System.out.println("\n i =" +i);
       
       /* repetição com do while */
       int i = 0;
       do
       {
           System.out.println("\n i ="+ i);
           i++;
       }while (i <= 10);
       
       /*Repetição com while*/
       i = 0;
       while (i <= 10)
       {
           System.out.println("\n i="+i);
           i++;
       }
    }
    
}
