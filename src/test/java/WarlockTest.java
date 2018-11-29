import RoomsAndBunnies.Enums.Undead;
import RoomsAndBunnies.Enums.WarSpell;
import RoomsAndBunnies.Player.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    WarSpell warSpell;
    Undead undead;

    @Before
    public void before(){
        undead = Undead.GOUL;
        warSpell = WarSpell.EVILCURSE;
        warlock = new Warlock("Anadane", 0,undead, warSpell);
    }

    @Test
    public void hasUndead(){
        assertEquals(undead, warlock.getUndead());
    }

    @Test
    public void hasWarSpell(){
        assertEquals(warSpell, warlock.getWarSpell());
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
