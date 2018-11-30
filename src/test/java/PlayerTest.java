import RoomsAndBunnies.Enums.*;
import RoomsAndBunnies.Player.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Barbarian barbarian;
    Dwarf dwarf;
    Enemy enemy;
    Knight knight;
    Warlock warlock;
    Wizzard wizzard;
    Cleric cleric;

    @Before
    public void before(){
//        truncheon = 60 barbarian = 100hp 25arm
        barbarian = new Barbarian("Conan", 150, Club.TRUNCHEON);
//      tomahawk = 80 dwarf = 75hp 50arm
        dwarf = new Dwarf("Shorty", 400, Axe.TOMAHAWK);
//        huge hammer = 50 hp 60 0arm
        enemy = new Enemy("Terrible Person", "Evil Dude", 60, EnemyWeapon.HUGEHAMMER);
//        knightly sword = 60 hp75 armour80
        knight = new Knight("Sir Sur", 800, Sword.KNIGHTLYSWORD);
//        warlock = hp100 zombie = -75 evilcurse = 10
        warlock = new Warlock("Donnie Darko", 400, Undead.ZOMBIE, WarSpell.EVILCURSE);
//        wizard 200hp wind = 500 purple = 75
        wizzard = new Wizzard("Whiz Zard", 200, WizSpell.WIND, Dragon.PURPLE);
        cleric = new Cleric("Maud", "Cleric", 300, Potion.POTION1, 150);
    }

    //    BATTLE!!!!
    @Test
//    aka dwarf can be attaced.
    public void barbarianAttacksDwarf(){
        barbarian.attack(dwarf);
//        60-50 = 10 damage = 65 remaining hp
        assertEquals(65, dwarf.getHealthPoints());
    }

    @Test
    public void dwarfAttacksBarbarian(){
        dwarf.attack(barbarian);
//        80-25 = 55 damage = 45 remaining hp
        assertEquals(45, barbarian.getHealthPoints());
    }

    @Test
    public void enemyCanAttackKnight(){
        enemy.attack(knight);
//        90-80 = 10 damage = 65hp
        assertEquals(65, knight.getHealthPoints());
    }

    @Test
    public void knightCanAttackEnemy(){
        knight.attack(enemy);
//        60-0 = 60 damage = 0hp
        assertEquals(0, enemy.getHealthPoints());
    }

    @Test
    public void warlockCanAttackWizard(){
        warlock.attack(wizzard);
//        -75 - 75 = -150 damage
        assertEquals(265, wizzard.getHealthPoints());
    }
    /*
    warlock weapon = 10
    wizzard defence = 75
    wizard hp = 200

    damage = 10 - 75 = -65
    200 - -65 =
    */

    @Test
    public void wizzardCanAttackWarlock(){
        wizzard.attack(warlock);
//        wind 50 + 75 125 damage -25
        assertEquals(-25, warlock.getHealthPoints());
    }
    /*
    wizard weapon = wind = 50
    warlock defence = -75
    warlock hp = 100

    50

    */

    @Test
    public void clericCanHealBarbarian(){
        cleric.heal(barbarian);
        assertEquals(120, barbarian.getHealthPoints());
    }

    @Test
    public void clericCanHealDwarf(){
        cleric.heal(dwarf);
        assertEquals(95, dwarf.getHealthPoints());
    }

    @Test
    public void clericCanHealKnight(){
        cleric.heal(knight);
        assertEquals(95, knight.getHealthPoints());
    }

    @Test
    public void clericCanHealWarlock(){
        cleric.heal(warlock);
        assertEquals(120, warlock.getHealthPoints());
    }

    @Test
    public void clericCanHealWizard(){
        cleric.heal(wizzard);
        assertEquals(220, wizzard.getHealthPoints());
    }

}
