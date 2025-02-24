package Fichier;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileOutputStream;

public class CreationFichier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Le nom du fichier a ouvrir");
        String fichier = scan.nextLine();

        File editFile = new File(fichier);

        if (editFile.exists()){
            try {
                System.out.println("fichier ouvrert");
                FileOutputStream ecrire = new FileOutputStream("File.txt");

                String txt1 = scan.nextLine();
                String txt2 = scan.nextLine();
                String txt3 = scan.nextLine();
                
                ecrire.write(txt1.getBytes());
                ecrire.write(txt2.getBytes());
                ecrire.write(txt3.getBytes());

                System.out.println(txt1);
                System.out.println(txt2);
                System.out.println(txt3);

                byte[] inByte = new byte[2048];
                int n = 0;

                FileInputStream lecture = new FileInputStream("File.txt");

                while (((n=lecture.read(inByte)) != -1)) {
                    String texte = new String(inByte, 0,n);
                    ecrire.close();
                    lecture.close();
                }
            } catch (Exception e) {
                System.out.println("Exception: "+ e.getMessage());
            }
        } else {
            System.out.println("creer le fichier pour l'ouvrir.");
        }
    }
}
