package myLib;

public class MathMaster {
    
    /**
     * Returns the larger of two integers
     * @param x The first of two integers to compare
     * @param y The second of two integers to compare
     * @return Paramter of x or y, whichever is larger
     */
    public int max(int x, int y) {
        if(x == y) {
            return x;
        } if(x > y) {
            return x;
        } else {
            return y;
        }
    }

    /**
     * Returns the smaller of two integers
     * @param x The first tof two integers to compare
     * @param y The second of two integers to compare
     * @return Parameter x or y, whichever is smaller
     */
    public int min(int x, int y) {
        if(x == y) {
            return x;
        } if(x < y) {
            return x;
        } else {
            return y;
        }
    }
}