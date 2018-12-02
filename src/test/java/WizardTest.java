import RoomsAndBunnies.Enums.DragonType;
import RoomsAndBunnies.Enums.WizSpellType;
import RoomsAndBunnies.Player.Wizard;
import RoomsAndBunnies.Weapons.Dragon;
import RoomsAndBunnies.Weapons.WizSpell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    WizSpell wizSpell;
    Wizard wizard;
    Dragon dragon;

    @Before
    public void before(){
        dragon = new Dragon(1000, DragonType.BLUE);
        wizSpell = new WizSpell(2000, WizSpellType.WIND);
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
