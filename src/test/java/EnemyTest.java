
import RoomsAndBunnies.Enums.EnemyWeaponType;
import RoomsAndBunnies.Player.Enemy;
import RoomsAndBunnies.Weapons.EnemyWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    EnemyWeapon enemyWeapon;
    Enemy enemy;


    @Before
    public void before(){
        enemyWeapon = new EnemyWeapon(400, EnemyWeaponType.GUILLOTINE);
        enemy = new Enemy("Harold", "Orc", 20, enemyWeapon);
    }

    @Test
    public void enemyHasAName(){
        assertEquals("Harold", enemy.getName());
    }

    @Test
    public void enemyHasAType(){
        assertEquals("Orc", enemy.getType());
    }

    @Test
    public void enemyHasHealthPoints(){
        assertEquals(20, enemy.getHealthPoints());
    }

    @Test
    public void enemyHasAWeapon(){
        assertEquals(enemyWeapon, enemy.getEnemyWeapon());
    }

    @Test
    public void enemyWeaponHasAValue(){
        assertEquals(100, enemy.getEnemyWeaponValue());
    }
}
