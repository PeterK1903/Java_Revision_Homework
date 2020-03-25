public class DualFighter extends Soldier implements IWalk, IRide, IShoot, IFight, ISlice {

    public DualFighter(String name, String weapon, String rank) {
        super(name, weapon, rank);
    }

    public String canRide(String horse) {
        return "I can ride " + horse + " into Battle!";
    }

    public String canWalk() {
        return "Walking into Battle!";
    }

    public String canShoot() {
        return "I can shoot my " + this.weapon;
    }

    public String canFight() {
        return "He's only 5 foot 2, lets help him out eh?";
    }

    public String canSlice() {
        return "I can slice with my " + this.weapon;
    }
}
