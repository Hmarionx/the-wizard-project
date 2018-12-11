package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("dumbledore")
public class Dumbledore implements WizzardInterface {

    private Outfit outfit;

    @Autowired
    public Dumbledore(@Qualifier("outfit") Outfit Oufit) {

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
