import eduquer.*;

public class Principale {
    public static void main(String[] args) {
        Institution institut = new Institution();
        Universite university = new Universite();
        Ecole ecole = new Ecole();
        institut.InstDecri();
        university.InstDecri();
        university.LastsRect("Mumbere Kasongo","Murhula Matabaro");
        
        ecole.InstDecri();
        ecole.LastsPromot("Anita Masumbuko","JeanPierre Balezi", "ACHUNGE J.P");

        String[][] Tableau1 = new String[3][2];
        String[][] Tableau2 = new String[2][2];

        Tableau1[0][0]=ecole.newEcole();
        Tableau1[0][1]=ecole.newPromot();
        Tableau1[1][0]=ecole.newEcole();
        Tableau1[1][1]=ecole.newPromot();
        Tableau1[2][0]=ecole.newEcole();
        Tableau1[2][1]=ecole.newPromot();
        
        Tableau2[0][0]= university.newUniv();
        Tableau2[0][1]= university.newRect();
        Tableau2[1][0]= university.newUniv();
        Tableau2[1][1]= university.newRect();



        for (int i=0; i<2; i++){
            System.out.println("L'Université numero "+(i+1) +" et son Recteur en bas");
            for (int j=0; j< 2; j++){
                System.out.println(Tableau2[i][j]);
            }
        }

        for (int i=0; i<Tableau1.length; i++){
            System.out.println("L'Ecole numero "+(i+1) +" et son Promoteur en bas");
            for (int j=0; j< 2; j++){
                System.out.println(Tableau1[i][j]);
            }
        }
    }
}