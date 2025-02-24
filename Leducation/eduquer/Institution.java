package eduquer;
import java.util.Scanner;;

public class Institution {
    protected String nomInstitution;
    protected String nomPays;
    protected String Type;
    protected int AnneCreation;

    public Institution(){
        nomInstitution = "ULPGL";
        
    }

    public String getnomInstitution(){
        return nomInstitution;
    }

    public String getnomPays(){
        return nomPays;
    }

    public String getType(){
        return Type;
    }

    public int getAnneCreation(){
        return AnneCreation;
    }

    public void setnomInstitution(String nom){
        this.nomInstitution = nom;
    }

    public void setnomPays(String pays){
        this.nomPays = pays;
    }

    public void setType(String type){
        this.Type = type;
    }

    public void setAnneCreation(int annee){
        this.AnneCreation = annee;
    }

    public int EtablisAge(){
        setAnneCreation(1833);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est l'année en cours?");
        int anIn = sc.nextInt();
    if (anIn<AnneCreation) {
        do {
            System.out.println(
            "veuillez bien verifier que la date de création : " + getAnneCreation()+
            " soit inferieure à celle en cours."
            );
            System.out.println("Quel est l'année en cours?");
            anIn = sc.nextInt();}
        while(anIn<AnneCreation);
        }
        return anIn-AnneCreation;
    }

    public void InstDecri(){
        setnomInstitution("CBCA-ULPGL");
        setAnneCreation(1833);
        setnomPays("RDC/GOMA/Keshero");
        setType("Privé");
        System.out.println("L'institution "+getnomInstitution()+" a été creer en "+ getAnneCreation()+
        ", donc elle a actuelement "+ EtablisAge() +
        " ans.\nElle se retrouve précisement en "+getnomPays()+".\nElle est du type "+getType());
        System.out.println();
    }
}
