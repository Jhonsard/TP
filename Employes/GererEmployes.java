package Employes;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;


public class GererEmployes {
    public static void main(String[] args) {
        ObjectOutputStream ecrire;
        ObjectInputStream lire;
        

        try {
            ecrire = new ObjectOutputStream(new FileOutputStream(new File("MonFichier.txt")));
            Scanner scan = new Scanner(System.in);

            System.out.println("Entrer le Post-Nom de l'employer ");
            String postNom = scan.nextLine();

            Employes employe = new Employes("MURHULA", postNom, 11120);
            System.out.println("L'Employes "+ employe.getNom() +"-"+employe.getPostNom()
            +" dans les douzes mois de l'année il a participer à combien?");
            int moi = scan.nextInt();

            ecrire.writeObject(employe);

            lire = new ObjectInputStream(new FileInputStream("MonFichier.txt"));

            System.out.println("Employe: "+ employe.getNom());
            System.out.println("==========================================================================");
            ((Employes) lire.readObject()).augSalaire(10, moi);
            System.out.println("==========================================================================");

        } catch (InputMismatchException e){
            System.out.println("InputMismatchException: "+ e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Exception: "+ e.getMessage()+"  "+e.getCause());
            
        }
    }
}
