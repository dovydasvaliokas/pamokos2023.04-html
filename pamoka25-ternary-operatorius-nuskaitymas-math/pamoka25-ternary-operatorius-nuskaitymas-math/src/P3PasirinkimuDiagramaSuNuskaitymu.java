import java.util.Scanner;

public class P3PasirinkimuDiagramaSuNuskaitymu {
    public static void main(String[] args) {
        Scanner skait = new Scanner(System.in);
        boolean arNoriteRupintisGyvunu;
        boolean arGalitPamirstiGyvuna;
        boolean arKeliomSavaitemArbaDaugiau;
        boolean arGyvunasGrazinaMeile;
        boolean arNoritDresiruoti;
        boolean arNoritKadKazkaDarytuPet;
        boolean arTuritDideliLauka;
        boolean arGalvojaKadSeimininkas;
        System.out.println("Į klausimus atsakykite \"true\", jeigu taip, arba \"false\", jeigu ne");
        System.out.println("Ar norite mylėti ir rūpintis augintiniu?");
        arNoriteRupintisGyvunu = skait.nextBoolean();
        System.out.println("Ar galite pamiršti gyvūną?");
        arGalitPamirstiGyvuna = skait.nextBoolean();
        System.out.println("Ar galite pamiršti jį keliom savaitėm?");
        arKeliomSavaitemArbaDaugiau = skait.nextBoolean();
        System.out.println("Ar reikia gyvūno, kuris gali grąžinti meilę?");
        arGyvunasGrazinaMeile = skait.nextBoolean();
        System.out.println("Ar norite žiūrėti kaip jūsų augintinis kažką daro");
        arNoritKadKazkaDarytuPet = skait.nextBoolean();
        System.out.println("Ar norite dresiruoti?");
        arNoritDresiruoti = skait.nextBoolean();
        System.out.println("Ar turite didelį lauką arba zoologijos sodą?");
        arTuritDideliLauka = skait.nextBoolean();
        System.out.println("Kaip norite, kad jūsų augintinis galvotų apie jus? Kaip šeimininką?");
        arGalvojaKadSeimininkas = skait.nextBoolean();

        String gyvunas = kurisGyvunasGeriausiaJums(arNoriteRupintisGyvunu, arGalitPamirstiGyvuna, arKeliomSavaitemArbaDaugiau,
                arGyvunasGrazinaMeile, arNoritDresiruoti, arNoritKadKazkaDarytuPet, arTuritDideliLauka, arGalvojaKadSeimininkas);
        System.out.println("gyvunas = " + gyvunas);


    }

    public static String kurisGyvunasGeriausiaJums(boolean arNoriteRupintisGyvunu, boolean arGalitPamirstiGyvuna,
                                                   boolean arKeliomSavaitemArbaDaugiau, boolean arGyvunasGrazinaMeile,
                                                   boolean arNoritDresiruoti, boolean arNoritKadKazkaDarytuPet,
                                                   boolean arTuritDideliLauka, boolean arGalvojaKadSeimininkas) {
        if (arNoriteRupintisGyvunu) {
            if (arGalitPamirstiGyvuna) {
                if (arKeliomSavaitemArbaDaugiau) {
                    return "rock";
                }
                else {
                    return "fish";
                }
            }
            else {
                if (arGyvunasGrazinaMeile) {
                    if (arNoritDresiruoti) {
                        if (arGalvojaKadSeimininkas) {
                            return "dog";
                        }
                        else {
                            return "cat";
                        }
                    }
                    else {
                        if (arTuritDideliLauka) {
                            return "giraffe";
                        }
                        else {
                            return "cat";
                        }
                    }
                }
                else {
                    if (arNoritKadKazkaDarytuPet) {
                        return "fish";
                    }
                    else {
                        return "rock";
                    }
                }
            }
        }
        else {
            return "rock";
        }
    }
}
