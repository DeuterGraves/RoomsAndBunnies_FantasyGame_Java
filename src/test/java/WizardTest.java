import RoomsAndBunnies.Enums.DragonType;
import RoomsAndBunnies.Enums.WizSpellType;
import RoomsAndBunnies.Player.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    WizSpellType wizSpellType;
    Wizard wizard;
    DragonType dragonType;

    @Before
    public void before(){
        dragonType = DragonType.BLUE;
        wizSpellType = WizSpellType.WIND;
        wizard = new Wizard("Merlin", 0, wizSpellType, dragonType);
    }

    @Test
    public void wizzardHasDragon(){
        assertEquals(dragonType, wizard.getDragonType());
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
