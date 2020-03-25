import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CavalryArmedTest {

    CavalryArmed cavalryArmed;

    @Test
    public void getCavalryName(){
        cavalryArmed = new CavalryArmed("Peter", "Cavalry Sabre", "Corporal");
        assertEquals("Peter", cavalryArmed.getName());
    }

    @Test
    public void getCavalryWeapon(){
        cavalryArmed = new CavalryArmed("Peter", "Cavalry Sabre", "Corporal");
        assertEquals("Cavalry Sabre", cavalryArmed.getWeapon());
    }

    @Test
    public void getCavalryRank(){
        cavalryArmed = new CavalryArmed("Peter", "Cavalry Sabre", "Corporal");
        assertEquals("Corporal", cavalryArmed.getRank());
    }

    @Test
    public void cavalryCanRide(){
        cavalryArmed = new CavalryArmed("Peter", "Cavalry Sabre", "Corporal");
        assertEquals("I can ride Henry into Battle!", cavalryArmed.canRide("Henry"));
    }

    @Test
    public void cavalryCanSlice(){
        cavalryArmed = new CavalryArmed("Peter", "Cavalry Sabre", "Corporal");
        assertEquals("I can slice with my Cavalry Sabre", cavalryArmed.canSlice());
    }

    @Test
    public void cavalryArmedCanShoot(){
        cavalryArmed = new CavalryArmed("Peter", "Baker Rifle", "Corporal");
        assertEquals("I can shoot my Baker Rifle", cavalryArmed.canShoot());
    }


}
