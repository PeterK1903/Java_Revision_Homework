import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CavalryTest {

    Cavalry cavalry;

    @Test
    public void getCavalryName(){
        cavalry = new Cavalry("Peter", "Cavalry Sabre", "Corporal");
        assertEquals("Peter", cavalry.getName());
    }

    @Test
    public void getCavalryWeapon(){
        cavalry = new Cavalry("Peter", "Cavalry Sabre", "Corporal");
        assertEquals("Cavalry Sabre", cavalry.getWeapon());
    }

    @Test
    public void getCavalryRank(){
        cavalry = new Cavalry("Peter", "Cavalry Sabre", "Corporal");
        assertEquals("Corporal", cavalry.getRank());
    }

    @Test
    public void cavalryCanRide(){
        cavalry = new Cavalry("Peter", "Cavalry Sabre", "Corporal");
        assertEquals("I can ride Henry into Battle!", cavalry.canRide("Henry"));
    }

    @Test
    public void cavalryCanSlice(){
        cavalry = new Cavalry("Peter", "Cavalry Sabre", "Corporal");
        assertEquals("I can slice with my Cavalry Sabre", cavalry.canSlice());
    }

}
