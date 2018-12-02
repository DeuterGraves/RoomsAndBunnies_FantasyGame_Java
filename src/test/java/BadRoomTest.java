import RoomsAndBunnies.Enums.ClubType;
import RoomsAndBunnies.Enums.EnemyWeaponType;
import RoomsAndBunnies.Player.Barbarian;
import RoomsAndBunnies.Player.Enemy;
import RoomsAndBunnies.Rooms.BadRoom;
import RoomsAndBunnies.Weapons.Club;
import RoomsAndBunnies.Weapons.EnemyWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BadRoomTest {

    BadRoom badRoom;
    Barbarian barbarian;
    Club club;
    Enemy enemy;
    EnemyWeapon enemyWeapon;

    @Before
    public void before(){
        club = new Club(150, ClubType.AKLYS);
        enemyWeapon = new EnemyWeapon(1000, EnemyWeaponType.GUILLOTINE);
        barbarian = new Barbarian("Conan", 0, club);
        enemy = new Enemy("Steve", "Orc", 50, enemyWeapon);
        badRoom = new BadRoom("Dungeon", enemy);
    }

    @Test
    public void hasName(){
        assertEquals("Dungeon", badRoom.getName());
    }

    @Test
    public void roomHasEnemy(){
        assertEquals(enemy, badRoom.getEnemy());
    }

    @Test
    public void roomHasNoPlayer(){
        assertEquals(null, badRoom.getPlayer());
    }

    @Test
    public void canAddPlayer(){
        badRoom.setPlayer(barbarian);
        assertEquals(barbarian, badRoom.getPlayer());
    }

}
