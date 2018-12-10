package fr.wildcodeschool.thewizardproject.models;

public class Gandalf implements WizzardInterface {

    private Outfit outfit;

    public Gandalf(Outfit Oufit) {
        outfit = Oufit;
    }

    @Override
    public String giveAdvice() {
        return "It's the deep breath before the plunge.";
    }

    @Override

    public String changeDress() {
        return outfit.outfitDress();
    }
}
