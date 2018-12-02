import RoomsAndBunnies.Enums.SwordType;
import RoomsAndBunnies.Player.Knight;
import RoomsAndBunnies.Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Sword sword;
    Knight knight;

    @Before
    public void before(){
        sword = new Sword(800, SwordType.KNIGHTLYSWORD);
        knight = new Knight("Sir Lancelot", 0, sword);
    }

    @Test
    public void knightHasSword(){
        assertEquals(sword, knight.getSwordType());
    }

    @Test
    public void knightSwordHasValue(){
        assertEquals(60, knight.getSwordValue());
    }

    @Test
    public void knightHasTreasury(){
        assertEquals(0, knight.getTreasury());
    }

    @Test
    public void knightHasName(){
        assertEquals("Sir Lancelot", knight.getName());
    }
}
