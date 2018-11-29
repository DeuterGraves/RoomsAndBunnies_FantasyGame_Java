import RoomsAndBunnies.Enums.Potion;
import RoomsAndBunnies.Player.Cleric;
import org.junit.Before;

public class ClericTest {

    Cleric cleric;
    Potion potion;


    @Before
    public void before(){
        potion = new Potion.POTION1;
        cleric = new Cleric("bob", "magic", 2000, potion, 0);
    }
}
