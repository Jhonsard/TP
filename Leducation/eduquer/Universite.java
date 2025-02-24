package eduquer;
import java.util.Scanner;

public class Universite extends Institution {
    private int nombreFacultes;
    private String SystemEnseignement;
    private String nomRect;


    public int getnombreFacultes(){
        return nombreFacultes;
    }

    public String getSystem(){
        return SystemEnseignement;
    }

    public String getnomRect(){
        return nomRect;
    }

    public void setnombreFacultes(int nombre){
        this.nombreFacultes = nombre;
    }

    public void setSysteme(String systeme){
        this.SystemEnseignement = systeme;
    }

    public void setnomRect(String nom){
        this.nomRect = nom;
    }
    
    public Universite(){
        
    }

    public void InstDecri(){
        setnombreFacultes(12);
        setnomRect("MASUMBUKO MUGANZA");
        setSysteme("LMD");
        setnomInstitution("CBCA-ULPGL");
        System.out.println
        (
        getnomInstitution()+ "à une Université du \nfonctionnant dans le system "+getSystem()+
        " Elle a "+ getnombreFacultes()+
        " Facultés \net Elle est sous la direction du recteur "+ getnomRect()
        );
    }

    public void LastsRect(String nomRecteur1, String nomRecteur2){
        System.out.println();
        System.out.println
        (
            nomRecteur1 +" et "+ nomRecteur2 + 
            " \nsont les deux recteurs qui ont precedé "+ getnomRect());
    }

    Scanner sc = new Scanner(System.in);

    public String newUniv(){
        String NomUn;
        System.out.println("nom de l'univ de l'institution "+ getnomInstitution());
        return NomUn = sc.nextLine();
    }

    public String newRect(){
        String NomRec;
        System.out.println("et le nom de son recteur");
        return NomRec  = sc.nextLine();
    }
    
}
