package practice.test;

public class Problem5_Maze {

    //X = A Wall
    //S = Starting Position
    //E = Finish Line
    static char[][] theMaze =  {{'X', 'X', 'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X', '0', 'S'},
            {'0', '0', '0', '0', '0', 'X'},
            {'0', 'X', '0', 'X', '0', 'X'},
            {'E', 'X', 'X', 'X', '0', '0'},
            {'X', 'X', 'X', 'X', 'X', 'X'}};

    //INSTRUCTIONS: Write a program which starts at position S and navigates to position E.  Program must work
    //              for any maze.  Output the path from the starting node to the final node to the command line.

    class Location{
        Location(int x,int y){
            this.x=x;
            this.y=y;
        }
        int x;
        int y;

    }


    public void navigateTheMaze() {
        boolean reachedTheEnd = false;
        boolean startLocFound = false;
        Location startLoc = new Location(-1,-1);

        //find the starting point
        for(int i = 0;i<theMaze.length;i++){
            for(int j = 0;j<theMaze.length;j++){

                if(theMaze[i][j]=='S'){
                    startLoc.x=i;
                    startLoc.y=j;
                    startLocFound = true;
                    break;
                }
            }
            if(startLocFound){break;}
        }
        System.out.println("start loc"+startLoc.x + startLoc.y);
        if(!startLocFound){
            System.out.println("No start location found in the maze!!!");
            System.exit(0);
        }
        findEnd(startLoc);

    }

    Location findEnd(Location startLoc){

        System.out.println(startLoc);
        if(startLoc.x == -1) return startLoc;
        if(theMaze[startLoc.x][startLoc.y]=='X'){
          return(new Location(-1,-1));
        }
        if(theMaze[startLoc.x][startLoc.y]=='E'){
           return startLoc;
        }

        if(startLoc.y+1 <=theMaze.length)
            findEnd(new Location(startLoc.x,startLoc.y+1));
        if(startLoc.y-1 >=0)
            findEnd(new Location(startLoc.x,startLoc.y-1));
        if(startLoc.x+1 <=theMaze.length)
            findEnd(new Location(startLoc.x+1,startLoc.y));
        if(startLoc.x-1 >=0)
            findEnd(new Location(startLoc.x-1,startLoc.y));


        return startLoc;
    }

    public static void main(String[] args) {
        Problem5_Maze pr = new Problem5_Maze();
        pr.navigateTheMaze();
    }

}
