import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DualFighterTest {

    DualFighter dualFighter;

    @Test
    public void getDualFighterName(){
        dualFighter = new DualFighter("Peter", "Baker Rifle", "Corporal");
        assertEquals("Peter", dualFighter.getName());
    }

    @Test
    public void getDualFighterWeapon(){
        dualFighter = new DualFighter("Peter", "Baker Rifle", "Corporal");
        assertEquals("Baker Rifle", dualFighter.getWeapon());
    }

    @Test
    public void getDualFighterRank(){
        dualFighter = new DualFighter("Peter", "Baker Rifle", "Corporal");
        assertEquals("Corporal", dualFighter.getRank());
    }

    @Test
    public void dualFighterCanWalk(){
        dualFighter = new DualFighter("Peter", "Baker Rifle", "Corporal");
        assertEquals("Walking into Battle!", dualFighter.canWalk());
    }

    @Test
    public void dualFighterCanRide(){
        dualFighter = new DualFighter("Peter", "Baker Rifle", "Corporal");
        assertEquals("I can ride Percy into Battle!", dualFighter.canRide("Percy"));
    }

    @Test
    public void dualFighterCanShoot(){
        dualFighter = new DualFighter("Peter", "Baker Rifle", "Corporal");
        assertEquals("I can shoot my Baker Rifle", dualFighter.canShoot());
    }

    @Test
    public void dualFighterCanSlice(){
        dualFighter = new DualFighter("Peter", "Cavalry Sabre", "Corporal");
        assertEquals("I can slice with my Cavalry Sabre", dualFighter.canSlice());
    }

}
