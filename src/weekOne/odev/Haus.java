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



    private Salon salon;
    private Mutfak mutfak;
    private Antre antre;

}

