# D-D-RPG

#### Description

This is a console game in which the user choose team of heroes
of particular Race (_Elf, Human, Dwarf_).

Each hero has some specific features.

In team _**one Hero is a leader**_, and others are team-members.

Hero start game from _**Level 1**_ with 10XP and can improve himself 
up to _**Level 10**_.

In one move character can do one action, which chosen from set of actions
for particular hero.

The team will be fight against monsters in some fabulous location.

_**Location is unique for each play and generated with 
[Prim's Algorithm](https://en.wikipedia.org/wiki/Prim%27s_algorithm).**_
For each play Team of heroes randomly placed in some part of our fabulous location
and start to discover locality, in which exist monsters... or not).

Game ends when the goal is reached (reach some Rabbit Hole to next location),
or when the Team's Leader dies.


#### Prerequisites:
- install [Maven](https://maven.apache.org/download.cgi). 

#### How to start up ?
- git clone
- build the maven project ```mvn package```
- start app with the below cmd
          
            java -cp target/D-D-RPG-1.0-SNAPSHOT.jar StartGame


