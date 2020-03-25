import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InfantryTest {

    Infantry infantry;

    @Test
    public void getInfantryName(){
        infantry = new Infantry("Peter", "Baker Rifle", "Corporal");
        assertEquals("Peter", infantry.getName());
    }

    @Test
    public void getInfantryWeapon(){
        infantry = new Infantry("Peter", "Baker Rifle", "Corporal");
        assertEquals("Baker Rifle", infantry.getWeapon());
    }

    @Test
    public void getInfantryRank(){
        infantry = new Infantry("Peter", "Baker Rifle", "Corporal");
        assertEquals("Corporal", infantry.getRank());
    }

    @Test
    public void infantryCanWalk(){
        infantry = new Infantry("Peter", "Baker Rifle", "Corporal");
        assertEquals("Walking into Battle!", infantry.canWalk());
    }

    @Test
    public void infantryCanShoot(){
        infantry = new Infantry("Peter", "Baker Rifle", "Corporal");
        assertEquals("I can shoot my Baker Rifle", infantry.canShoot());
    }


}
