
import RoomsAndBunnies.Enums.EnemyWeaponType;
import RoomsAndBunnies.Player.Enemy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    EnemyWeaponType enemyWeaponType;
    Enemy enemy;


    @Before
    public void before(){
        enemyWeaponType = EnemyWeaponType.GUILLOTINE;
        enemy = new Enemy("Harold", "Orc", 20, enemyWeaponType);
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
        assertEquals(enemyWeaponType, enemy.getEnemyWeaponType());
    }

    @Test
    public void enemyWeaponHasAValue(){
        assertEquals(100, enemy.getEnemyWeaponValue());
    }
}
