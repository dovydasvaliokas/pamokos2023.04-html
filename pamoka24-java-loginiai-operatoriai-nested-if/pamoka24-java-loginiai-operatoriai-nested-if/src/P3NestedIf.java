public class P3NestedIf {
    public static void main(String[] args) {
        System.out.println("arIntervale(5, 0, 100) = " + arIntervale(5, 0, 100));
        System.out.println("arIntervale(4, 20, 30) = " + arIntervale(4, 20, 30));
        isvestiZvaigzdutes();

        System.out.println("arHighRisk(true, false, 100) = " + arHighRisk(true, false, 100));
        System.out.println("arHighRisk(false, true, 100) = " + arHighRisk(false, true, 100));
        System.out.println("arHighRisk(false, false, 60) = " + arHighRisk(false, false, 60));
        System.out.println("arHighRisk(false, false, 100) = " + arHighRisk(false, false, 100));
        isvestiZvaigzdutes();

        System.out.println("arHighRiskSuLoginiais(true, false, 100) = " + arHighRiskSuLoginiais(true, false, 100));
        System.out.println("arHighRiskSuLoginiais(false, true, 100) = " + arHighRiskSuLoginiais(false, true, 100));
        System.out.println("arHighRiskSuLoginiais(false, false, 60) = " + arHighRiskSuLoginiais(false, false, 60));
        System.out.println("arHighRiskSuLoginiais(false, false, 100) = " + arHighRiskSuLoginiais(false, false, 100));

    }

    public static void isvestiZvaigzdutes() {
        System.out.println("***************");
    }
    public static boolean arIntervale(int skaicius, int intervaloPradzia, int intervaloPabaiga) {
        if (skaicius > intervaloPradzia) {
            if (skaicius < intervaloPabaiga) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }


    public static boolean arHighRisk(boolean historyOfVomitting, boolean pleuralEffusion, double SBP) {
        if (historyOfVomitting) {
            return true;
        }
        else {
            if (pleuralEffusion) {
                return true;
            }
            else {
                if (SBP < 90) {
                    return true;
                }
                else {
                    return false;
                }
            }
        }
    }

    public static boolean arHighRiskSuLoginiais(boolean historyOfVomitting, boolean pleuralEffusion, double SBP) {
        return historyOfVomitting || pleuralEffusion || SBP < 90;
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
