public class Infantry extends Soldier implements IWalk, IShoot, IFight {


    public Infantry(String name, String weapon, String rank) {
        super(name, weapon, rank);

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

}
