
import RoomsAndBunnies.Enums.EnemyWeapon;
import RoomsAndBunnies.Enums.Potion;
import RoomsAndBunnies.Player.Enemy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    EnemyWeapon enemyWeapon;
    Enemy enemy;


    @Before
    public void before(){
        enemyWeapon = EnemyWeapon.GUILLOTINE;
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
        assertEquals(1000, enemy.getEnemyWeaponValue());
    }
}
