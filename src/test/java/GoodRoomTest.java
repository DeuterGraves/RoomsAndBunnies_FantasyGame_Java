import RoomsAndBunnies.Enums.Sword;
import RoomsAndBunnies.Player.Knight;
import RoomsAndBunnies.Rooms.GoodRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoodRoomTest {

    GoodRoom goodRoom;
    Knight knight;
    Sword sword;

    @Before
    public void before(){
        sword = Sword.KNIGHTLYSWORD;
        knight = new Knight("Sir Lance", 0, sword);
        goodRoom = new GoodRoom("Vault", 500);
    }
    @Test
    public void roomIsEmpty(){
        assertEquals(null, goodRoom.getPlayer());
    }

    @Test
    public void roomHasPlayer(){
        goodRoom.setPlayer(knight);
        assertEquals(knight, goodRoom.getPlayer());
    }

    @Test
    public void roomHasName(){
        assertEquals("Vault", goodRoom.getName());
    }

    @Test
    public void roomHasTreasure(){
        assertEquals(500, goodRoom.getTreasure());
    }

}
