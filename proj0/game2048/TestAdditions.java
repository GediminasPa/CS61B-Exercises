package game2048;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests the additional methods I have implemented
 * @author Gediminas Pazera
 */

public class TestAdditions {

    /** The Board that we'll be testing on. */
    static Board b;

    @Test
    public void testAdjacentExists() {
        int[][] rawVals = new int[][] {
                {0, 0, 2, 2},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
        };

        b = new Board(rawVals, 0);
        assertTrue("Board has two adjacent numbers\n" + b,
                Model.adjacentExists(b));

        int[][] rawVals2 = new int[][] {
                {2, 4, 2, 32},
                {4, 8, 4, 0},
                {2, 16, 8, 4},
                {4, 32, 0, 2},
        };

        b = new Board(rawVals2, 0);
        assertFalse("Board has no adjacent numbers\n" + b,
                Model.adjacentExists(b));
    }

    @Test
    public void testCheckColMerge() {
        int[][] rawVals = new int[][] {
                {0, 0, 2, 0},
                {0, 0, 2, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
        };
        int j = 2;

        b = new Board(rawVals, 0);
        assertTrue("Col " + j + " can be merged\n" + b,
                Model.checkColMerge(b,j));

        int[][] rawVals2 = new int[][] {
                {0, 2, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 2, 0, 0},
        };
        j = 1;

        b = new Board(rawVals2, 0);
        assertTrue("Col " + j + " can be merged\n" + b,
                Model.checkColMerge(b,j));

        int[][] rawVals3 = new int[][] {
                {0, 0, 2, 0},
                {0, 0, 8, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
        };
        j = 2;

        b = new Board(rawVals3, 0);
        assertFalse("Col " + j + " can't be merged\n" + b,
                Model.checkColMerge(b,j));
    }

    @Test
    public void testCheckCanMoveUp() {
        int[][] rawVals = new int[][] {
                {4, 8, 2, 0},
                {0, 8, 2, 0},
                {0, 8, 0, 2},
                {0, 8, 0, 0},
        };
        int i = 2;
        int j = 3;
        b = new Board(rawVals, 0);
        assertFalse("Can't move tile in row" + j + " and col " + i + " in board\n" + b,
                Model.checkCanMoveUp(b,i,j));

        i = 3;
        j = 1;
        assertTrue("Can't move tile in row" + j + " and col " + i + " in board\n" + b,
                        Model.checkCanMoveUp(b,i,j));

        i = 2;
        j = 2;
        assertTrue("Can't move tile in row" + j + " and col " + i + " in board\n" + b,
                Model.checkCanMoveUp(b,i,j));
    }



}
