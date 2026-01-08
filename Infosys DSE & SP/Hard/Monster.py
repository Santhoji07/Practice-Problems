'''Problem Statement: While playing an RPG game, you were assigned to complete one of the hardest quests in this game. There are n monsters you’ll need to defeat in this quest.

Each monster i is described with two integer numbers – poweri and bonusi. To defeat this monster, you’ll need at least poweri experience points. If you try fighting this monster without having enough experience points, you lose immediately. You will also gain bonusi experience points if you defeat this monster. You can defeat monsters in any order.
The quest turned out to be very hard – you try to defeat the monsters but keep losing repeatedly. Your friend told you that this quest is impossible to complete.
Knowing that, you’re interested, what is the maximum possible number of monsters you can defeat?

(Question difficulty level: Hardest)'''

n=int (input())
exp= int(input())
power=[int (input()) for n in range(n)]
bonus=[int (input()) for n in range(n)]

arr=sorted(zip(power,bonus))
count=0

for power,bonus in arr:
    if exp<power:
        break
    exp+=bonus
    count+=1
print(count)
