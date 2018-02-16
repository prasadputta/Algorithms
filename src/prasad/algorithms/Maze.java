package prasad.algorithms;

public class Maze {

    //X = A Wall
    //S = Starting Position
    //E = Finish Line
    static char[][] theMaze =  {{'X', 'X', 'X', 'X', 'S', 'X','0'},
            {'X', 'X', 'X', 'X', '0', '0','0'},
            {'0', '0', '0', '0', '0', 'X','0'},
            {'0', 'X', '0', 'X', '0', 'X','0'},
            {'0', 'X', '0', 'E', '0', '0','0'},
            {'X', 'X', 'X', 'X', 'X', 'X','0'}};

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
        boolean startLocFound = false;
        Location startLoc = new Location(-1,-1);

        //find the starting point
        startLoc = isStartLocFound(startLocFound, startLoc);

        System.out.println("Starting point: "+startLoc.x+","+startLoc.y);
        if(startLoc.x==-1 && startLoc.y==-1){
            System.out.println("No start location found in the maze!!!");
            System.exit(0);
        }
        if(solve(startLoc.x,startLoc.y)){
            printMaze();
        }else{
            System.out.println("No Solution found!");

        }

    }

    void printMaze(){

        for(char[] row: theMaze) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }



    public static boolean solveMaze(int r,int c){

        //make sure that we are within the maze. if we are outside, just do not process any further
        if(r<0 ||c <0 ||
                r >= theMaze.length ||
                c >= theMaze[0].length){
            return false;
        }

        if(theMaze[r][c]=='E'){
            System.out.println("Found it at row:"+r+" col:"+c);
            return true;
        }

        if(theMaze[r][c]=='X' || theMaze[r][c]=='A'){
            return false;
        }

        theMaze[r][c]='A';

        if(solveMaze(r-1,c)){
            theMaze[r][c]='#';
            return true;
        }
        if(solveMaze(r+1,c)){
            theMaze[r][c]='#';
            return true;
        }if(solveMaze(r,c-1)){
            theMaze[r][c]='#';
            return true;
        }if(solveMaze(r,c+1)){
            theMaze[r][c]='#';
            return true;
        }
        return false;

    }

    private Location isStartLocFound(boolean startLocFound, Location startLoc) {
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

        return startLoc;
    }


boolean solve(int r,int c){

     //if 0 --> keep checking
        // if X  or beyond the limits--> blocked, return
    // if E --> found it
    // else --> can't solve it

   //terminal conditions
    if(r < 0 || r > theMaze.length ||
            c < 0 || c> theMaze[0].length)return false;
    if(theMaze[r][c]=='E'){
        System.out.println("found it at " + r + ","+c);
        theMaze[r][c] = '#';
        return true;
    }
    if(theMaze[r][c]=='X'){
        return false;
    }
    theMaze[r][c]='X';

    if(solve(r-1,c)) {theMaze[r-1][c]='#'; return true;}//above
    if(solve(r+1,c)) {theMaze[r+1][c]='#'; return true;}//above
    if(solve(r,c-1)) {theMaze[r][c-1]='#'; return true;}//above
    if(solve(r,c+1)) {theMaze[r][c+1]='#'; return true;}//above

    return false;


}


    boolean solve2(int r,int c){
        //check if we are outside
        if(r<0 || (r>= theMaze.length || c<0) || c>= theMaze[0].length){
             return false;
        }
        if(theMaze[r][c]=='E'){
            return true;
        }

        if(theMaze[r][c]=='X'){//blocked, return
            return false;
        }


        theMaze[r][c]='X';

        //check in all directions
        if(solve2(r-1,c)){ theMaze[r-1][c]='#'; return true;};
        solve2(r+1,c);
        solve2(r,c-1);
        solve2(r,c+1);
return false;


    }


    public static void main(String[] args) {
        Maze pr = new Maze();
        pr.navigateTheMaze();
    }

}
