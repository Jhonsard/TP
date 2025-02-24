package eduquer;
import java.util.Scanner;

public class Ecole extends Institution {
    
    private String type;
    private int NombreClasse;
    private String nomPromoteur;

    public Ecole(){

    }

    public String geTtype(){
        return type;
    }

    public int getNombreClasse(){
        return NombreClasse;
    }

    public String getnomPromoteur(){
        return nomPromoteur;
    }

    public void seTtype(String type){
        this.type = type;
    }
    public void setNombreClasse(int nombre){
        this.NombreClasse = nombre;
    }

    public void setnomPromoteur(String nom){
        this.nomPromoteur = nom;
    }

    public void InstDecri(){
        setNombreClasse(26);
        seTtype("Secondaire");
        setnomPromoteur("MPAKULA OMBE MANZAMBI");

        System.out.println();
        System.out.println
        (
        getnomInstitution()+" a une ecole "+geTtype()+
        " Elle a "+ getNombreClasse()+
        " Classes \net Elle est sous la direction du promoteur "+ getnomPromoteur()
        );
        System.out.println();
    }

    public void LastsPromot(String nomPromoteur1, String nomPromoteur2, String nomPromoteur3){
        System.out.println();
        System.out.println
        (
            nomPromoteur1 +", "+ nomPromoteur2 +" et "+nomPromoteur3+
            " \nsont les trois promoteurs qui ont precedé "+ getnomPromoteur());
    }

    Scanner sc = new Scanner(System.in);

    public String newEcole(){
        String NomUn;
        System.out.println("nom de l'Ecole de l'institution "+ getnomInstitution());
        return NomUn = sc.nextLine();
    }

    public String newPromot(){
        String NomPromo;
        System.out.println("et le nom de son Promoteur");
        return NomPromo  = sc.nextLine();
    }

}
