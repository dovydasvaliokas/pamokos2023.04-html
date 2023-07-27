package utility;

import entity.Filmas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FilmasFailaiUtility {
    public static ArrayList<Filmas> nuskaitytiFilmusIsFailo(String failoPavadinimas) {
        File failas = new File(failoPavadinimas);
        ArrayList<Filmas> filmai = new ArrayList<>();
        try {
            Scanner skait = new Scanner(failas);
            skait.nextLine();       // pirmą eilutę praleidžiu, nes ji yra antraštinė
            while (skait.hasNextLine()) {
                String eilute = skait.nextLine();
                String[] suskaldytaEilute = eilute.split(",");
                Filmas filmas = new Filmas();
                filmas.setPavadinimas(suskaldytaEilute[0]);
                filmas.setZanras(suskaldytaEilute[1]);
                filmas.setStudija(suskaldytaEilute[2]);
                filmas.setZiurovuIvertinimas(Integer.parseInt(suskaldytaEilute[3]));
                filmas.setPelningumas(Double.parseDouble(suskaldytaEilute[4]));
                filmas.setEkspertuIvertinimas(Integer.parseInt(suskaldytaEilute[5]));
                filmas.setPajamos(Double.parseDouble(suskaldytaEilute[6]));
                filmas.setIsleidimoMetai(Integer.parseInt(suskaldytaEilute[7]));
                filmai.add(filmas);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return filmai;
    }

    public static Filmas nuskaitytiFilmaIsKonsoles() {
        Scanner skait = new Scanner(System.in);
        Filmas filmas = new Filmas();
        System.out.println("Įveskite filmo pavadinimą: ");
        filmas.setPavadinimas(skait.nextLine());
        System.out.println("Įveskite žanrą: ");
        filmas.setZanras(skait.nextLine());
        System.out.println("Įveskite studiją:");
        filmas.setStudija(skait.nextLine());
        System.out.println("Įveskite žiūrovų įvertinimą %");
        filmas.setZiurovuIvertinimas(skait.nextInt());
        System.out.println("Įveskite pelningumą:");
        filmas.setPelningumas(skait.nextDouble());
        System.out.println("Įveskite ekspertų įvertinimą:");
        filmas.setEkspertuIvertinimas(skait.nextInt());
        System.out.println("Įveskite pajamas:");
        filmas.setPajamos(skait.nextDouble());
        System.out.println("Įveskite metus");
        filmas.setIsleidimoMetai(skait.nextInt());
        return filmas;
    }

    public static void issaugotiFilmaFaile(Filmas filmas, String failoPavadinimas) {
        File failas = new File(failoPavadinimas);
        try {
            FileWriter fw = new FileWriter(failas, true);
            fw.append("\n");
            fw.append(filmas.toCsv());
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
