package weekOne.odev;

public class Aplikasyon {
    public static void main(String[] args) {
        Haus aliEv = new Haus();
        Mutfak aliMutfak = new Mutfak();
        Antre aliAntre = new Antre();
        Televizyon mutfakTv = new Televizyon();
        Sandalye sandalyeAntre = new Sandalye();
        Balkon aliBalkon = new Balkon();
        Lamba balkonLamba = new Lamba();
        mutfakTv.setName("Toshiba");
        sandalyeAntre.setName("Tabure");
        balkonLamba.setName("Armut");
        aliBalkon.setLamba(balkonLamba);
        aliMutfak.setTelevizyon(mutfakTv);
        aliAntre.setSandalye(sandalyeAntre);
        aliEv.setMutfak(aliMutfak);
        aliEv.setAntre(aliAntre);
        aliEv.setBalkon(aliBalkon);

        System.out.println(aliEv.getMutfak().getTelevizyon().getName() + " "+ aliEv.getAntre().getSandalye().getName() + " "+ aliEv.getBalkon().getLamba().getName());
    }
}
