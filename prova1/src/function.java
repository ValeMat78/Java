import javax.swing.*;

public class function {
    float num;
    float den;

    //costruttore
    public function(){
        //prendo il numeratore
        getNum();

        //prendoo il denominatore
        getDen();
    }

    //funzione che ritorna il risultato della frazione
    public float frazione(){
        float f=this.num/this.den;
        return f;
    }

    //metodi get per il numeratore e il denominatore
    public void getDen(){
        do{
            try {
                this.den = Float.parseFloat(JOptionPane.showInputDialog("inserire il denominatore"));
            }catch(NumberFormatException e){den=0;}
        }while(den<=0);
    }
    public void getNum(){
        do{
            try {
                num = Float.parseFloat(JOptionPane.showInputDialog("inserire il numeratore"));
            }catch(NumberFormatException e){num=0;}
        }while(num<=0);
    }
}
