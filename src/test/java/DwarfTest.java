import RoomsAndBunnies.Enums.Axe;
import RoomsAndBunnies.Player.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Axe axe;
    Dwarf dwarf;

    @Before
    public void before(){
        axe = Axe.DANEAXE;
        dwarf = new Dwarf("Red", 0, axe);
    }

    @Test
    public void dwarfHasAxe(){
        assertEquals(axe, dwarf.getAxe());
    }

    @Test
    public void dwarfAxeHasValue(){
        assertEquals(400, dwarf.getAxeValue());
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


