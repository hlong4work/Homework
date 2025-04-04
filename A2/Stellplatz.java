import java.util.Arrays;


public class Stellplatz implements Comparable<Stellplatz> {
    private String bezeichnung;
    private Double flaeche;

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