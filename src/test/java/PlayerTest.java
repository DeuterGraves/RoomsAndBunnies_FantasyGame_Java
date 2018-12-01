import RoomsAndBunnies.Enums.*;
import RoomsAndBunnies.Player.*;
import RoomsAndBunnies.Rooms.GoodRoom;
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
    GoodRoom goodRoom;

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
        goodRoom = new GoodRoom("Money Storage", 1000);
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

    @Test
    public void knightEntersRoom(){
        knight.enterRoom(goodRoom);
        assertEquals(knight, goodRoom.getPlayer());
    }

    @Test
    public void knightTakesTreasure(){
        knight.enterRoom(goodRoom);
        knight.collectTreasure(goodRoom);
        assertEquals(0, goodRoom.getTreasure());
        assertEquals(1800, knight.getTreasury());
    }

    @Test
    public void barbarianTakesTreasure(){
        barbarian.enterRoom(goodRoom);
        barbarian.collectTreasure(goodRoom);
        assertEquals(0, goodRoom.getTreasure());
        assertEquals(1150, barbarian.getTreasury());
    }

    @Test
    public void dwarfTakesTreasure(){
        dwarf.enterRoom(goodRoom);
        dwarf.collectTreasure(goodRoom);
        assertEquals(0, goodRoom.getTreasure());
        assertEquals(1400, dwarf.getTreasury());
    }

    @Test
    public void clericTakesTreasure(){
        cleric.enterRoom(goodRoom);
        cleric.collectTreasure(goodRoom);
        assertEquals(0, goodRoom.getTreasure());
        assertEquals(1150, cleric.getTreasury());
    }

    @Test
    public void warlockTakesTreasure(){
        warlock.enterRoom(goodRoom);
        warlock.collectTreasure(goodRoom);
        assertEquals(0, goodRoom.getTreasure());
        assertEquals(1400, warlock.getTreasury());
    }


    @Test
    public void wizardTakesTreasure(){
        wizzard.enterRoom(goodRoom);
        wizzard.collectTreasure(goodRoom);
        assertEquals(0, goodRoom.getTreasure());
        assertEquals(1200, wizzard.getTreasury());
    }


}
