package prasad.algorithms;

/**
 A building has 100 floors. One of the floors is the highest floor an egg can be dropped from without breaking.
 If an egg is dropped from above that floor, it will break. If it is dropped from that floor or below,
 it will be completely undamaged and you can drop the egg again.
 Given two eggs, find the highest floor an egg can be dropped from without breaking, with as few drops as possible.
 */
public class EggProblem {

    int[] floors = {0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,1,
            1,1,1,1,1,1,1,1,1,1};


    boolean checkIfdDropBreaksTheEgg(int fromFloor){
        return floors[fromFloor] == 1;
    }

    int getMinFloorWhereEggBreaks(int increment){
        int startFloor=0;
        int topFloor;
/*
        1) drop it at 10 floor increments until it breaks
        2) if it breaks,  try at start floor and increment by 1 until it breaks
*/
        topFloor = 0;
        int tryAtFloor = 0;
        int totalAttempts =0;
        while(!checkIfdDropBreaksTheEgg(topFloor = topFloor+increment)) {
            totalAttempts++;
          //  --increment;
            startFloor = startFloor +increment;
        }

        tryAtFloor = startFloor;
        while(!checkIfdDropBreaksTheEgg(tryAtFloor++)) {
            totalAttempts++;
        }
        System.out.println("Attempted "+totalAttempts+" times.");

        return tryAtFloor;
    }

    @FunctionalInterface
    interface FloorIncrement{
        int incrementBy(int totalFloors);
    }


    public static void main(String[] args) {
        EggProblem ep = new EggProblem();

        FloorIncrement increment =(max)-> max/10;
        FloorIncrement quadraticIncrement =(max)->{
            //an2+bn+c=0  c=max,a=1,b=1
            //-b+sqrt(b*b-2ac)/2a
            double inc = (-1+Math.sqrt(1+4*1*max)/2);
            System.out.println(inc);
            return ((int) inc);
        };

        System.out.println(ep.getMinFloorWhereEggBreaks(quadraticIncrement.incrementBy(100)));

        System.out.println(ep.getMinFloorWhereEggBreaks(increment.incrementBy(100)));
    }
}
