import RoomsAndBunnies.Enums.AxeType;
import RoomsAndBunnies.Enums.ClubType;
import RoomsAndBunnies.Enums.DragonType;
import RoomsAndBunnies.Enums.PotionType;
import RoomsAndBunnies.Player.Merchant;
import RoomsAndBunnies.Weapons.Axe;
import RoomsAndBunnies.Weapons.Club;
import RoomsAndBunnies.Weapons.Dragon;
import RoomsAndBunnies.Weapons.Potion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MerchantTest {

    Merchant merchant;
    Axe axe;
    Club club;
    Dragon dragon;
    Potion potion;

    @Before
    public void before(){
        axe = new Axe(5, AxeType.TOMAHAWK);
        club = new Club(4, ClubType.AKLYS);
        dragon = new Dragon(10, DragonType.PURPLE);
        potion = new Potion(20, PotionType.POTION2);
        merchant = new Merchant("Boris", "Merchant", 400 );
    }

    @Test
    public void canAddWeaponToInventory(){
        merchant.addWeaponToInventory(axe, 5);
        assertEquals(true, merchant.checkInventory(axe));
    }

    @Test
    public void canAddDifferentWeaponsToInventory(){
        merchant.addWeaponToInventory(axe, 5);
        merchant.addWeaponToInventory(dragon, 8);
        merchant.addWeaponToInventory(potion, 11);
        assertEquals(true, merchant.checkInventory(dragon));
        assertEquals(true, merchant.checkInventory(axe));
        assertEquals(false, merchant.checkInventory(club));
    }


}
