import RoomsAndBunnies.Enums.Sword;
import RoomsAndBunnies.Player.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Sword sword;
    Knight knight;

    @Before
    public void before(){
        sword = Sword.KNIGHTLYSWORD;
        knight = new Knight("Sir Lancelot", 0, sword);
    }

    @Test
    public void knightHasSword(){
        assertEquals(sword, knight.getSword());
    }

    @Test
    public void knightSwordHasValue(){
        assertEquals(400, knight.getSwordValue());
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
