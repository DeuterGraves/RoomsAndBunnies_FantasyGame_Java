import RoomsAndBunnies.Enums.DragonType;
import RoomsAndBunnies.Enums.WizSpellType;
import RoomsAndBunnies.Player.Wizard;
import RoomsAndBunnies.Weapons.Dragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    WizSpellType wizSpellType;
    Wizard wizard;
    Dragon dragon;

    @Before
    public void before(){
        dragon = new Dragon(1000, DragonType.BLUE);
        wizSpellType = WizSpellType.WIND;
        wizard = new Wizard("Merlin", 0, wizSpellType, dragon);
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
        assertEquals(wizSpellType, wizard.getWizSpellType());
    }

    @Test
    public void wizzardSpellValue(){
        assertEquals(50, wizard.getWizSpellValue());
    }
}
