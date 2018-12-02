import RoomsAndBunnies.Enums.UndeadType;
import RoomsAndBunnies.Enums.WarSpellType;
import RoomsAndBunnies.Player.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    WarSpellType warSpellType;
    UndeadType undeadType;

    @Before
    public void before(){
        undeadType = UndeadType.GOUL;
        warSpellType = WarSpellType.EVILCURSE;
        warlock = new Warlock("Anadane", 0, undeadType, warSpellType);
    }

    @Test
    public void hasUndead(){
        assertEquals(undeadType, warlock.getUndeadType());
    }

    @Test
    public void hasWarSpell(){
        assertEquals(warSpellType, warlock.getWarSpellType());
    }

    @Test
    public void hasUndeadUnhealth(){
        assertEquals(-20, warlock.getUndeadValue());
    }

    @Test
    public void hasWarSpellValue(){
        assertEquals(10, warlock.getWarSpellValue());
    }

}
