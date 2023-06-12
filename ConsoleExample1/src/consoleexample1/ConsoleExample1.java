/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consoleexample1;
import java.io.Console;

/**
 *
 * @author pc
 */
public class ConsoleExample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Console e = System.console();
        System.out.println("Enter your name: ");
        String n = e.readLine();
        System.out.println("Welcome " + n);
    }
 
    
}
