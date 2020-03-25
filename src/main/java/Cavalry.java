public class Cavalry extends Soldier implements IRide, ISlice, IFight {

    private String horse;

    public Cavalry(String name, String weapon, String rank) {
        super(name, weapon, rank);
        this.horse = horse;
    }

    public String getHorse() {
        return horse;
    }

    public String canRide(String horse) {
        return "I can ride " + horse + " into Battle!";
    }


    public String canSlice() {
        return "I can slice with my " + this.weapon;
    }

    public String canFight() {
        return "He's only 5 foot 2, lets help him out eh?";
    }
}
