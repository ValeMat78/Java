import java.util.StringTokenizer;

class Frazione {
    // variabili di istanza (attributi)
    private float numeratore;
    private float denominatore;


    //costruttori
    public Frazione(){
        numeratore=0;
        denominatore=0;
    }
    public Frazione(float n,float d){
        numeratore=n;
        denominatore=d;
    }
    public Frazione(float n){
        numeratore=n;
    }
    public Frazione(String f){
        StringTokenizer st = new StringTokenizer(f,"/");
        numeratore=Float.parseFloat(st.nextToken());
        denominatore=Float.parseFloat(st.nextToken());
    }


    // metodi (funzioni)
    public float valore(){
       return numeratore/denominatore;
    }

    //somma
    public float somma(Frazione f,Frazione s){
        float ri=0;
        int mcm = 0;
        float n = (f.getNumeratore()*mcm)+(s.getNumeratore()*mcm);
        float d = mcm;
        ri=n/d;
        return ri;
    }

    //prodotto
    public float prodotto(Frazione f,Frazione s){
        float ri = 0;

        return ri;
    }

    //reciproca
    public float reciproca(){
        float ri = 0;

        return ri;
    }

    //inversa
    public float inversa(){
        float ri = 0;

        return ri;
    }

    //ridotta
    public String riduci() {
        float mcd = massimoComunDivisore(numeratore, denominatore);
        numeratore = numeratore/mcd;
        denominatore = denominatore/mcd;
        return numeratore+"/"+denominatore;
    }


    //MCD
    public float massimoComunDivisore(float a, float b) {
        float n1 = a;
        float n2 = b;
        while (n2 != 0) {
            if (n1 > n2)
                n1 = n1 -n2;
            else
                n2 = n2 -n1;
        }
        return n1;
    }


    //metodi get
    public float getNumeratore(){
        return numeratore;
    }
    public float getDenominatore(){
        return denominatore;
    }





/*
    String tipoDellaFraz() {
        if (numeratore%denominatore==0)
            return "apparente";
        if (numeratore<denominatore)
            return "propria";
        return "impropria";
    }


    @Override
    public String toString(){
        // prima riduco ai minimi termini
        riduci();
        if (denominatore==1)
            return numeratore+"";
        return numeratore+"/"+denominatore;
    }

 */
}