import RoomsAndBunnies.Enums.Club;
import RoomsAndBunnies.Player.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BarbarianTest {

    Club club;
    Barbarian barbarian;

    @Before
    public void before(){
        club = Club.NULLANULLA;
        barbarian = new Barbarian("Conan", 0, club);
    }

    @Test
    public void barbarianHasClub(){
        assertEquals(club, barbarian.getClub());
    }

    @Test
    public void barbarianClubHasValue(){
        assertEquals(600, barbarian.getClubValue());
    }

    @Test
    public void barbaianraHasTreasury(){
        assertEquals(0, barbarian.getTreasury());
    }

    @Test
    public void barbarianHasName(){
        assertEquals("Conan", barbarian.getName());
    }
}
