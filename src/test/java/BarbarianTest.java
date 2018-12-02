import RoomsAndBunnies.Enums.AxeType;
import RoomsAndBunnies.Enums.ClubType;
import RoomsAndBunnies.Player.Barbarian;
import RoomsAndBunnies.Player.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BarbarianTest {

    ClubType clubType;
    Barbarian barbarian;
    Dwarf dwarf;
    AxeType axeType;

    @Before
    public void before(){
        clubType = ClubType.NULLANULLA;
        barbarian = new Barbarian("Conan", 0, clubType);
        axeType = AxeType.DANEAXE;
        dwarf = new Dwarf("Red", 0, axeType);
    }

    @Test
    public void barbarianHasClub(){
        assertEquals(clubType, barbarian.getClubType());
    }

    @Test
    public void barbarianClubHasValue(){
        assertEquals(90, barbarian.getClubValue());
    }

    @Test
    public void barbaianraHasTreasury(){
        assertEquals(0, barbarian.getTreasury());
    }

    @Test
    public void barbarianHasName(){
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void canAttack(){
//        assertEquals(600, barbarian.attack(dwarf));
        barbarian.attack(dwarf);
        assertEquals(35, dwarf.getHealthPoints());
    }
}
