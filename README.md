I tried to make it so that it was easy to add a new race and a parameter.
Now there are 3 races and 2 specialities.

________________________________________________________________________
## Good ‘ol RPG
We must fight against monsters in the Labyrinth.
For doing this we need a team of three characters, one of them is a leader.
In case of a leader's death or if we find special item "the Great Crystal", the game will end.
The team can be compiled from the characters of three races: Elf, Human, Dwarf.
Each race have a specialities which have their own advantages.
### Hero Races and specialities
 - __Elf__ influential, have a good magic and have the best endurance, but there is a small number of xp
   - mage:
imposition of an improvement on the character of his unit
can hold wizard Stuff (attack d6)
can have various spells (requires mana consumption):
      - Fireball (45 mp) 3d10, cd (calldown) 3 turns (not moving turns, but battle phase turns)
      - Spell Shield (15 mp), block 60 dmg till destruction, cd 2 turns
      - Frost Bolt (20 mp), 2d6, cd 1 turn
      - Dispell (20 mp), dispells any spell, cd 3 turns
      - Stone Gaze (20 mp), transform enemy into stone for 2 turns, cd 4 turns.

   - gunslinger:
        Shoot from the bow – regular attack (damage 2d6)
        attack the enemy with dagger (d6)
        can have spell skills (requires mana consumption):
      - Multishot (30 mp) – attack 1 additional target, cd 2 turns
      - RapidFire(30 mp) – attack single target with 1 additional attack, cd 3 turns
      - BullsEye(40 mp) – archer takes aim and deal crit damage to sinle target 3d10, cd 3 turns
 - __Human__ середній вплив середня магія невелика виносливість
    - Priest/monk:
attack with fists – regular attack d10
skills
      - Lay of Fists (10 RP), cd 3 turns, hits multiple targets (from 2 to 3)
      - Battle Fury(30 RP), cd 4 turns, hits every enemy with additional 2d6 damage
Spells: 
      - Hand of God(25 mp), cd 2 turns, heals 20 hits (can be cast on itself or other unit, if casts on UNDEAD deal damage instead of heal)
      - Battle trance(65 mp), cd 4 turns, gain immunity for next turn.
    - paladin:
attack with a sword (damage done by 2d10), regular
Skills:
      - Splash (20 rp) – attack 2 additional targets, cd 2 turns
      - Rush(20 rp) – dashes to nearest enemy to deal additional 2d6 damage
 - __Dwarf__ мала ініціатива і слабка магія , але велике здоровя і витривалість
    - Warrior:
Attack with axe, 2d10, regular
Skils:
      - Whriling Axe(30 rp) – throw axe into nearest enemy, deal additional 2d6 damage, cd 2 turns, apply regular attack to this unit
      - Stand my ground(20 rp), cd 4 turns, gain 50 HP shield for 2 turns
    - Mechanist:
Attack with gun, 2d6, regular
Skills:
      - Bombs! (25rp) – throw a bomb that hits 2 enemys and deal 2d6 dmg to each, cd 2 turns
      - Droid to arms(25 rp) – crate droid that attack random enemy with 2d6 every turn, lasts 3 turns, cd 5 turns, has 50 HP
### Hero parameters
#### Main
 - __Race__
 - __Name__
 - __Health__
 - __Manna__
 - __Level__ min -1, max -10.
 - __isLeader__ 
 - __Health__
 #### Regular
 - __Charisma__
 - __Stamina__ it affects the number and rehabilitation of health (1 stamina point = 2 hp, 4 stamina point=1 hp regeneration). 
 - __Intellect__ it affects the amount and recovery of manna (1 intelect point = 2 mp, 4 intelect point = 1 mp regeneration).
 - __Agility__  вона впливає на 4 rp per 1 agility point, chance to avoid hit 1% per 2 points
 - __Concentration__ 1 hp, 1,5 mp/1 rp regen per turn for 1 consentartion point, 1 turn cd decresion per 25 points
 ### Start stats for each race:
  Race  |  Charisma | Stamina | Intellect | Agility | Concentration  
------- | --------- | ------- | --------- | ------- | -------------   
  Elf | 15 | 10 | 25 | 22 | 18
  Human | 10 | 30 | 20 | 15 | 15
  Dwarf | 5 | 45 | 15 | 20 | 5 
  
### algorithm of actions:
 - greetings
 - repeat 3 times:
   - a)choose race
   - b)choose speciality
 - choose leader
 - display info of chosen characters
### how to start
 - download or git clone
 - in directory with pom file: mvn package
 - java -cp target/GoodOldRpg-1.0-SNAPSHOT.jar Main
 
#### __stuff__
 - [unicode symbols](https://unicode-table.com/ru/#box-drawing)
        
            java -jar target/D-D-RPG-1.0-SNAPSHOT.jar


