package weekOne.odev;

public class Aplikasyon {
    public static void main(String[] args) {
        Haus aliEv = new Haus();
        Mutfak aliMutfak = new Mutfak();
        Televizyon mutfakTv = new Televizyon();
        mutfakTv.setName("Toshiba");
        aliMutfak.setTelevizyon(mutfakTv);
        aliEv.setMutfak(aliMutfak);
        System.out.println(aliEv.getMutfak().getTelevizyon().getName());
    }
}
