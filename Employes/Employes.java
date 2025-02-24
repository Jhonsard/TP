package Employes;
import java.io.Serializable;

public class Employes implements Serializable{
    private String nom;
    private String postNom;
    private double salaire;

    public Employes(String nom, String postNom, double salaire){
        this.nom = nom;
        this.postNom = postNom;
        this.salaire = salaire;
    }

    public String getNom(){
        return nom;
    }

    public String getPostNom(){
        return postNom;
    }

    public double getSalaire(){
        return salaire;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public void setPostNom(String postNom){
        this.postNom = postNom;
    }

    public void setSalaire(double salaire){
        this.salaire = salaire;
    }

    public void augSalaire(double pourcentage, int moisarr){

        if (moisarr == 12){
            double salot = (salaire* pourcentage)/100;
            System.out.println("Travailleur modele et regulier");
            this.salaire = salot + salaire;
            System.out.println("comme c'est un travailleur regulier; l'augmentation du salaire à l'employé "
            + this.nom +"-"+ this.postNom + " est de " + pourcentage +
            "pourcent. \nce qui fait qu'il a actuelment "+ salaire+" dollards par mois");

        } else if(moisarr >= 9 && moisarr < 12){
            System.out.println("Travailleur moins modele et peut regulier");
            double salot = (salaire* pourcentage)/100;
            this.salaire = (salot + salaire)- 1.2;
            System.out.println("comme c'est un travailleur peut regulier; l'augmentation du salaire à l'employé "
            + this.nom +"-"+ this.postNom + " est de " + pourcentage +
            "pourcent. \nce qui fait qu'il a actuelment "+ salaire+
            " dollards par mois car 1.2 dollard lui a etait retrancher par moi pour qu'il se corrige ");

        } else if (moisarr >= 5 && moisarr < 9) {
            System.out.println("Travailleur moins modele et  irregularité moin frequente");
            double salot = (salaire* pourcentage)/100;
            this.salaire = (salot + salaire)- 3.2;
            System.out.println("comme c'est un travailleur regularité moins frequente; l'augmentation du salaire à l'employé "
            + this.nom +"-"+ this.postNom + " est de " + pourcentage +
            "pourcent. \nce qui fait qu'il a actuelment :"+ salaire+
            " dollards par mois car 3.2 dolard lui a etait retrancher par moi pour qu'il se corrige");
        } else {
            System.out.println("Travailleur pas modele et  tres irregulier");
            System.out.println("comme c'est un travailleur pas regulier; l'augmentation du salaire à l'employé "
            + this.nom +"-"+ this.postNom + " est de zero pourcent. \nce qui fait qu'il a actuelment :"+ salaire+" dollards par mois car 1.2 dolard lui a etait retrancher");
        }

    }
}
