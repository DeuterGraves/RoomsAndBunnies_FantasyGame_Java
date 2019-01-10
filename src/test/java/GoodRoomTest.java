import RoomsAndBunnies.Enums.DragonType;
import RoomsAndBunnies.Enums.SwordType;
import RoomsAndBunnies.Enums.WizSpellType;
import RoomsAndBunnies.Player.Knight;
import RoomsAndBunnies.Player.Wizard;
import RoomsAndBunnies.Rooms.GoodRoom;
import RoomsAndBunnies.Weapons.Dragon;
import RoomsAndBunnies.Weapons.Sword;
import RoomsAndBunnies.Weapons.WizSpell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoodRoomTest {

    GoodRoom goodRoom;
    Knight knight;
    Sword sword;
    Wizard wizard;
    WizSpell wizSpell;
    Dragon dragon;

    @Before
    public void before(){
        sword = new Sword(800, SwordType.KNIGHTLYSWORD);
        knight = new Knight("Sir Lance", 0, sword);
        goodRoom = new GoodRoom("Vault", 500);
        wizSpell = new WizSpell(40, WizSpellType.FREEZE);
        dragon = new Dragon(40, DragonType.GREY);
        wizard = new Wizard("Bob", 200, wizSpell, dragon);
    }
    @Test
    public void roomIsEmpty(){
        assertEquals(null, goodRoom.getPlayers());
    }

    @Test
    public void roomHasPlayer(){
        goodRoom.addPlayer(knight);
        assertEquals(knight, goodRoom.getPlayers());
    }

    @Test
    public void roomHasName(){
        assertEquals("Vault", goodRoom.getName());
    }

    @Test
    public void roomHasTreasure(){
        assertEquals(500, goodRoom.getTreasure());
    }

    @Test
    public void roomCanAddPlayers(){
        goodRoom.addPlayer(knight);
        goodRoom.addPlayer(wizard);
        assertEquals(2, goodRoom.countPlayers());
    }


}
