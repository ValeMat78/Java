import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        //creo l'oggetto function
        function f= new function();

        //stampo il risultato della funzione per la frazione
        JOptionPane.showMessageDialog(null, "il risultato è: "+ f.frazione());
    }
}