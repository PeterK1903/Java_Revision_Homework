import java.util.ArrayList;

public abstract class Soldier {

    protected String name;
    protected String weapon;
    protected String rank;
//    protected ArrayList

    public Soldier(String name, String weapon, String rank) {
        this.name = name;
        this.weapon = weapon;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getRank() {
        return rank;
    }
}
