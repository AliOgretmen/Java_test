package weekOne.odev;

public class Haus {
    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    public Mutfak getMutfak() {
        return mutfak;
    }

    public void setMutfak(Mutfak mutfak) {
        this.mutfak = mutfak;
    }


    public Antre getAntre() {
        return antre;
    }

    public void setAntre(Antre antre) {
        this.antre = antre;
    }

    public Balkon getBalkon() {
        return balkon;
    }

    public void setBalkon(Balkon balkon) {
        this.balkon = balkon;
    }

    private Salon salon;
    private Mutfak mutfak;
    private Antre antre;
    private Balkon balkon;

}

