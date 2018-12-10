package fr.wildcodeschool.thewizardproject.models;

public class Gandalf implements WizzardInterface {

    @Override
    public String giveAdvice() {
        return "It's the deep breath before the plunge.";
    }

    @Override
    public String changeDress() {
        return null;
    }
}
