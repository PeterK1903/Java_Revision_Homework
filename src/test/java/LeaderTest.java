import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;

public class LeaderTest {

    Leader leader;
    Cavalry cavalry;
    Infantry infantry;
    CavalryArmed cavalryArmed;
    DualFighter dualFighter;

    @Before
    public void before() {
        leader = new Leader("Napoleon Bonaparte");
        infantry = new Infantry("Peter", "Baker Rifle", "Corporal");
        dualFighter = new DualFighter("Sally", "Baker Rifle", "Commandant");
        cavalry = new Cavalry("Paul", "Cavalry Sabre", "Officer");
        cavalryArmed = new CavalryArmed("John", "Baker Rifle", "Lieutenant");
    }

    @Test
    public void getName(){
        leader = new Leader("Napoleon Bonaparte");
        assertEquals("Napoleon Bonaparte", leader.getName());
    }

    @Test
    public void armyStartsEmpty(){
        assertEquals(0, leader.armyCount());
    }

    @Test
    public void ArmyCanGrow(){
        leader.recruit(cavalry);
        leader.recruit(dualFighter);
        leader.recruit(infantry);
        leader.recruit(cavalryArmed);
        assertEquals(4, leader.armyCount());
    }

    @Test
    public void SoundRetreat(){
        leader.recruit(cavalry);
        leader.recruit(dualFighter);
        leader.recruit(infantry);
        leader.recruit(cavalryArmed);
        leader.retreat();
        assertEquals(0, leader.armyCount());
    }

    @Test
    public void WeeManGetsPower(){
        leader.recruit(cavalry);
        leader.recruit(dualFighter);
        leader.recruit(infantry);
        leader.recruit(cavalryArmed);
        assertEquals("I am Napoleon Bonaparte and I will rule this world!", leader.weeManLovesPower());
    }

    @Test
    public void WeeManNoPower(){
        leader.recruit(cavalry);
        leader.recruit(dualFighter);
        assertEquals("I'm just wee and hopeless!", leader.weeManLovesPower());
    }

}
