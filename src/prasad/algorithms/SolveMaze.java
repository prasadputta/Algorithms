package prasad.algorithms;

import java.io.FileNotFoundException;

public class SolveMaze {
    static Maze theMaze;
    public static void main(String[] args) throws FileNotFoundException {



        int startRow = 1;
        int startCol = 6;
        System.out.println("Start from (" + startRow + ", " + startCol + ")");


        solve(theMaze, startRow, startCol);
    }


    // Finds a pathway out of the given maze from the given start location.
    // Preconditions: maze != null and startRow/Col are within the maze
    public static void solve(Maze maze, int startRow, int startCol) {
        if (explore(maze, startRow, startCol)) {
            System.out.println(maze);
        } else {
            System.out.println("no solution");
        }
    }

    // Private helper that finds a pathway out of the maze from the given start
    // using recursive backtracking.  Marks each square it examines as having
    // been 'explored'.  Returns true if a path out was found, and false if not.
    // If a pathway out is found, marks every step along that path with a '.'.
    private static boolean explore(Maze maze, int row, int col) {
        System.out.println(maze);    // animate

        // unproductive path: wall or previously explored
        if (maze.isWall(row, col) || maze.isExplored(row, col)) {
            return false;
        } else if (row == 0 || row == maze.getHeight() - 1 || col == 0
                || col == maze.getWidth() - 1) {
            // exit has been found
            maze.mark(row, col);
            return true;
        } else {
            maze.setExplored(row, col, true);

            if (explore(maze, row, col - 1) || // left
                    explore(maze, row - 1, col) || // up
                    explore(maze, row + 1, col) || // down
                    explore(maze, row, col + 1)) { // right
                maze.mark(row, col);
                System.out.println(maze);    // animate
                return true;    // location is on the exit path
            }
            // unchoose
        }
        return false;    // not on exit path
    }


    class Maze {
        private char[][] squares=  {{'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', '0', 'S'},
                {'0', '0', '0', '0', '0', 'X'},
                {'0', 'X', '0', 'X', '0', 'X'},
                {'E', 'X', 'X', 'X', '0', '0'},
                {'X', 'X', 'X', 'X', 'X', 'X'}};
        ;
        private boolean[][] explored;
        private boolean animated;
        private int lastIsRow, lastIsCol;   // last location on which an 'is' method
        // was called; used for toString '?'

        public Maze(String text) {
            if (text == null || (text = text.trim()).length() == 0) {
                throw new IllegalArgumentException("empty lines data");
            }

            String[] lines = text.split("[\r]?\n");
            squares = new char[lines.length][lines[0].length()];
            explored = new boolean[lines.length][lines[0].length()];

            for (int row = 0; row < getHeight(); row++) {
                if (lines[row].length() != getWidth()) {
                    throw new IllegalArgumentException("line " + (row + 1) + " wrong length (was "
                            + lines[row].length() + " but should be " + getWidth() + ")");
                }

                for (int col = 0; col < getWidth(); col++) {
                    squares[row][col] = lines[row].charAt(col);
                }
            }

            lastIsRow = -1;
            lastIsCol = -1;
            animated = false;
        }

        public int getHeight() {
            return squares.length;
        }

        public char getSquare(int row, int col) {
            checkIndexes(row, col);
            return squares[row][col];
        }

        public int getWidth() {
            return squares[0].length;
        }

        public boolean isEscaped() {
            // check left/right edges
            for (int row = 0; row < getHeight(); row++) {
                if (explored[row][0] || explored[row][getWidth() - 1]) {
                    return true;
                }
            }

            // check top/bottom edges
            for (int col = 0; col < getWidth(); col++) {
                if (explored[0][col] || explored[getHeight() - 1][col]) {
                    return true;
                }
            }

            return false;
        }

        public boolean isExplored(int row, int col) {
            checkIndexes(row, col);
            lastIsRow = row;
            lastIsCol = col;
            return explored[row][col];
        }

        public boolean isMarked(int row, int col) {
            checkIndexes(row, col);
            lastIsRow = row;
            lastIsCol = col;
            return squares[row][col] == '.';
        }

        public boolean isWall(int row, int col) {
            checkIndexes(row, col);
            lastIsRow = row;
            lastIsCol = col;
            return squares[row][col] == '#';
        }

        public void mark(int row, int col) {
            checkIndexes(row, col);
            maybePause();
            squares[row][col] = 'x';
        }

        public void setAnimated(boolean value) {
            animated = value;
        }

        public void setExplored(int row, int col, boolean value) {
            checkIndexes(row, col);
            explored[row][col] = value;
        }

        public String toString() {
            StringBuilder result = new StringBuilder(getWidth() * (getHeight() + 1));
            for (int row = 0; row < getHeight(); row++) {
                for (int col = 0; col < getWidth(); col++) {
                    if (row == lastIsRow && col == lastIsCol) {
                        result.append('?');
                    } else if (squares[row][col] == '#') {
                        result.append('#');
                    } else if (squares[row][col] == 'x') {
                        result.append('x');
                    } else if (explored[row][col]) {
                        result.append('.');
                    } else {
                        result.append(' ');
                    }
                }
                result.append('\n');
            }
            maybePause();
            return result.toString();
        }

        private void checkIndexes(int row, int col) {
            if (row < 0 || row >= getHeight() || col < 0 || col >= getWidth()) {
                throw new IllegalArgumentException("illegal indexes: (" +
                        row + ", " + col + ")");
            }
        }

        private void maybePause() {
            if (animated) {
                sleep(100);
            }
        }

        private void sleep(int ms) {
            try {
                Thread.sleep(ms);
            } catch (InterruptedException ie) {
            }
        }
    }

}