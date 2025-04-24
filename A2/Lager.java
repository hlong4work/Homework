// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Comparator;
// import java.util.List;


// public class Lager implements Comparable<Stellplatz>   {
//     private String bezeichnung;
//     private int flaeche;
//     private int plaetze;
    
//     /* Constructor */
//     public Lager( String bezeichnung , int flaeche) {
//         this.bezeichnung = bezeichnung;
//         this.flaeche = flaeche;
//     }

//     public void sortieren(){ }


//     Comparator<Stellplatz> comp = new Comparator<Stellplatz>() {
//         public int compare(Stellplatz x, Stellplatz y){
//             if(x.bezeichnung > y.bezeichnung){
//                 return 1;
//             }if(x.bezeichnung == y.bezeichnung){
//                 return 0;
//             }else {
//                 return -1;
//             }
//         }
//     };

    



//     public static void main(String[] args){
//         List<Stellplatz> list = new ArrayList<>();
//         list.add(new Stellplatz("A2", 5));
//         list.add(new Stellplatz("B1", 25));
//         list.add(new Stellplatz("A1", 15));
//         list.add(new Stellplatz("B2", 10));
//     }
// }