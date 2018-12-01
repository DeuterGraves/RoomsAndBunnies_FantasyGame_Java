import RoomsAndBunnies.Enums.Dragon;
import RoomsAndBunnies.Enums.WizSpell;
import RoomsAndBunnies.Player.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    WizSpell wizSpell;
    Wizard wizard;
    Dragon dragon;

    @Before
    public void before(){
        dragon = Dragon.BLUE;
        wizSpell = WizSpell.WIND;
        wizard = new Wizard("Merlin", 0, wizSpell, dragon);
    }

    @Test
    public void wizzardHasDragon(){
        assertEquals(dragon, wizard.getDragon());
    }

    @Test
    public void wizzardDragonHealth(){
        assertEquals(100, wizard.getDragonHealth());
    }

    @Test
    public void wizzardHasSpell(){
        assertEquals(wizSpell, wizard.getWizSpell());
    }

    @Test
    public void wizzardSpellValue(){
        assertEquals(50, wizard.getWizSpellValue());
    }
}
