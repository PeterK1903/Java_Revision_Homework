import java.util.ArrayList;

public class Leader {

    private String name;
    private ArrayList<IFight> army;

    public Leader(String name) {
        this.army = new ArrayList<IFight>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int armyCount(){
        return this.army.size();
    }

    public void recruit(IFight soldier){
        army.add(soldier);
    }

    public void retreat(){
        army.clear();
    }

    public String weeManLovesPower(){
        if(army.size() >= 4){
            return "I am " + name + " and I will rule this world!";
        }
        return "I'm just wee and hopeless!";
    }

}
