package fr.wildcodeschool.thewizardproject.models;

public class Dumbledore implements WizzardInterface {

    private Outfit outfit;

    public Dumbledore(Outfit Oufit) {
        outfit = Oufit;
    }

    @Override
    public String giveAdvice() {
        return "It is our choices, Harry, that show what we truly are, far more than our abilities.";
    }

    @Override
    public String changeDress() {
        return outfit.outfitDress();
    }
}
