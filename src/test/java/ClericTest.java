import RoomsAndBunnies.Enums.PotionType;
import RoomsAndBunnies.Player.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    PotionType potionType;


    @Before
    public void before(){
        potionType = PotionType.POTION1;
        cleric = new Cleric("bob", "magic", 2000, potionType, 0);
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
        assertEquals(potionType, cleric.getPotionType());
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
