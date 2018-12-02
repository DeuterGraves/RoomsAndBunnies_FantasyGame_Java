import RoomsAndBunnies.Enums.AxeType;
import RoomsAndBunnies.Player.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    AxeType axeType;
    Dwarf dwarf;

    @Before
    public void before(){
        axeType = AxeType.DANEAXE;
        dwarf = new Dwarf("Red", 0, axeType);
    }

    @Test
    public void dwarfHasAxe(){
        assertEquals(axeType, dwarf.getAxeType());
    }

    @Test
    public void dwarfAxeHasValue(){
        assertEquals(70, dwarf.getAxeValue());
    }

    @Test
    public void dwarfHasTreasury(){
        assertEquals(0, dwarf.getTreasury());
    }

    @Test
    public void dwarfHasName(){
        assertEquals("Red", dwarf.getName());
    }

    @Test
    public void dwarfCanAttack(){

    }
}


