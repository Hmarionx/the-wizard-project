package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("gandalf")
public class Gandalf implements WizzardInterface {

    private Outfit outfit;

    @Autowired
    public Gandalf(@Qualifier("outfit") Outfit Oufit) {

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
