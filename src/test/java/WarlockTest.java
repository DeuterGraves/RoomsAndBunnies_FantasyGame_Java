import RoomsAndBunnies.Enums.UndeadType;
import RoomsAndBunnies.Enums.WarSpellType;
import RoomsAndBunnies.Player.Warlock;
import RoomsAndBunnies.Weapons.Undead;
import RoomsAndBunnies.Weapons.WarSpell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    WarSpell warSpell;
    Undead undead;

    @Before
    public void before(){
        undead = new Undead(2, UndeadType.GOUL);
        warSpell = new WarSpell(15, WarSpellType.EVILCURSE);
        warlock = new Warlock("Anadane", 0, undead, warSpell);
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
