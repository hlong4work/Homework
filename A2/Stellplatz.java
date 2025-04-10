import java.util.Arrays;


public class Stellplatz implements Comparable<Stellplatz>  {
    private String bezeichnung;
    private Double flaeche ;

    public int compareTo(Stellplatz other) {
        if (this.flaeche < flaeche.flaeche ) {
            return plaetze -= 1;
        } else if (this.flaeche > plaetze.flaeche) {
            return plaetze +=1;
        } else {
            return plaetze =0;
        }
    }

    //Getters
    public String getBezeichnung() {
        return bezeichnung;
    }

    public Double getFlaeche() {
        return flaeche;
    }

    //
    public String toString(){
        String out ="";
        return out;
    }


    /* Constructor */
    public Stellplatz(String bezeichnung, double flaeche){
        this.bezeichnung = bezeichnung;
        this.flaeche = flaeche;

    }
}