import javax.swing.*;

/*
Le aggiunte potrebbero essere le seguenti (amanti della matematica non limitatevi a queste)
- Costruttori (con un intero, con due interi, con stringa tipo "1/2")
- Frazione somma(Frazione altra)
- Frazione prodotto(Frazione altra)
- Frazione reciproca()
- void inverti()
- void riduci() //riduzione ai minimi termini
}*/
class Main {
    static Frazione F1;
    static Frazione F2;
    static Frazione FF = new Frazione();
    static float ri;

    //main che suddivide le richieste
    public static void main(String[] args) {
        //mezzo è un'istanza di Frazione
        int s=0;

        do {
            try {
                s = Integer.parseInt(JOptionPane.showInputDialog("che operazione si vuole eseguire? \n 1: somma tra frazioni \n 2: prodottotra frazioni\n 3: frazione reciproca\n 4: frazione inversa\n 5: riduzione ai minimi termini"));
            } catch (NumberFormatException e) {
                s = 6;
            }
        }while(s>5||s<=0);

        switch (s){
            case 1:
                F1=in();
                F2=in();
                ri=FF.somma(F1,F2);
                JOptionPane.showMessageDialog(null, ri);
                break;
            case 2:
                F1=in();
                F2=in();
                ri = FF.prodotto(F1,F2);
                JOptionPane.showMessageDialog(null, ri);
                break;
            case 3:
                F1=in();
                JOptionPane.showMessageDialog(null,F1.reciproca());
                break;
            case 4:
                F1=in();
                JOptionPane.showMessageDialog(null, F1.inversa());
                break;
            case 5:
                F1=in();
                JOptionPane.showMessageDialog(null,F1.riduci());
                break;
        }
    }

    //metodo in che contiene i controlli e le modalità di input con i diversi costruttori
    public static Frazione in(){
        Frazione F=null;
        float n;
        float d;
        int f=0;
        do {
            try {
                f = Integer.parseInt(JOptionPane.showInputDialog("che forma si vuole usare? \n 1: due numeri \n 2: un numero\n 3: sringa"));
            } catch (NumberFormatException e) {f = 4;}
        }while(f>3||f<=0);
        switch (f){
            case 1:
                n = Float.parseFloat(JOptionPane.showInputDialog("inserire il numeratore"));
                d = Float.parseFloat(JOptionPane.showInputDialog("inserire il denominatore"));
                F = new Frazione(n,d);
                break;
            case 2:
                n = Float.parseFloat(JOptionPane.showInputDialog("inserire il denominatore"));
                F = new Frazione(n);
                break;
            case 3:
                String s=JOptionPane.showInputDialog("inserire la frazione nellla forma n/d");
                F = new Frazione(s);
                break;
        }
        return F;
    }
}


