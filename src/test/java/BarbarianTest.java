import RoomsAndBunnies.Enums.Axe;
import RoomsAndBunnies.Enums.Club;
import RoomsAndBunnies.Player.Barbarian;
import RoomsAndBunnies.Player.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BarbarianTest {

    Club club;
    Barbarian barbarian;
    Dwarf dwarf;
    Axe axe;

    @Before
    public void before(){
        club = Club.NULLANULLA;
        barbarian = new Barbarian("Conan", 0, club);
        axe = Axe.DANEAXE;
        dwarf = new Dwarf("Red", 0, axe);
    }

    @Test
    public void barbarianHasClub(){
        assertEquals(club, barbarian.getClub());
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
