
import RoomsAndBunnies.Enums.PotionType;
import RoomsAndBunnies.Player.Cleric;
import RoomsAndBunnies.Weapons.Potion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Potion potion;


    @Before
    public void before(){
        potion = new Potion(5, PotionType.POTION1);
        cleric = new Cleric("bob", "magic", 2000, potion, 0);
    }

    @Test
    public void clericHasAName(){
        assertEquals("bob", cleric.getName());
    }

    @Test
    public void clericHasAType(){
        assertEquals("magic", cleric.getType());
    }

    @Test
    public void clericHasHealthPoints(){
        assertEquals(2000, cleric.getHealthPoints());
    }

    @Test
    public void clericHasAPotion(){
        assertEquals(potion, cleric.getPotion());
    }

    @Test
    public void clericHasATreasury(){
        assertEquals(0, cleric.getTreasury());
    }

    @Test
    public void potionHasAValue(){
        assertEquals(20, cleric.getPotionValue());
    }
}
