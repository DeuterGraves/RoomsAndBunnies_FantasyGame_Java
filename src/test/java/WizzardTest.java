import RoomsAndBunnies.Enums.Dragon;
import RoomsAndBunnies.Enums.WizSpell;
import RoomsAndBunnies.Player.Wizzard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizzardTest {

    WizSpell wizSpell;
    Wizzard wizzard;
    Dragon dragon;

    @Before
    public void before(){
        dragon = Dragon.BLUE;
        wizSpell = WizSpell.WIND;
        wizzard = new Wizzard("Merlin", "Wizzard", 50, 0, wizSpell, dragon);
    }

    @Test
    public void wizzardHasDragon(){
        assertEquals(dragon, wizzard.getDragon());
    }

    @Test
    public void wizzardDragonHealth(){
        assertEquals(100, wizzard.getDragonHealth());
    }

    @Test
    public void wizzardHasSpell(){
        assertEquals(wizSpell, wizzard.getWizSpell());
    }

    @Test
    public void wizzardSpellValue(){
        assertEquals(500, wizzard.getWizSpellValue());
    }
}
