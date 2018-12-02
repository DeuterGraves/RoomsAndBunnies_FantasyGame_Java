import RoomsAndBunnies.Enums.SwordType;
import RoomsAndBunnies.Player.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    SwordType swordType;
    Knight knight;

    @Before
    public void before(){
        swordType = SwordType.KNIGHTLYSWORD;
        knight = new Knight("Sir Lancelot", 0, swordType);
    }

    @Test
    public void knightHasSword(){
        assertEquals(swordType, knight.getSwordType());
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
