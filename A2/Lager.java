import java.util.Arrays;

public class Lager {
    private Stellplatz[] platz;

    public void sotieren(){
        Arrays.sort(platz);
    }
    
    







    public static void main(String[] args){
        Stellplatz A2 = new Stellplatz("A2", 5);
        Stellplatz B1 = new Stellplatz("B1", 25);
        Stellplatz A1 = new Stellplatz("A1", 15);
        Stellplatz B2 = new Stellplatz("B2", 10);

        Stellplatz[] stellplaetze = {A2, B1, A1, B2};
        System.out.println(sortieren(stellplaetze));
    }
    
    
    
    
    
    
    

    







    
    // aufgabe 2.1B
    public String binaerSuchen(double){
        
    }
}