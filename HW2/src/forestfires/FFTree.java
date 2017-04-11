package forestfires;

public class FFTree {

    private final int x;
    private final int y;
    private boolean healthy;
    private boolean burning;
    private boolean burnt;
    private int day;

    // Constructor. It takes in coordinates x and y.
    public FFTree(int x, int y) {
        this.x = x;
        this.y = y;
        healthy = true;
        burning = false;
        burnt = false;
        day = 0;
    }

    // Returns the x-coordinate of the tree.
    public int getX() {
        return x;
    }

    // Returns the y-coordinate of the tree.
    public int getY() {
        return y;
    }

    // Computes the Euclidean distance (norm 2) between this
    // tree and the other tree
    public double distanceTo(FFTree other) {
        return Math.abs(Math.sqrt(((other.x - x) * (other.x - x))
                + ((other.y - y) * (other.y - y))));
    }

    // Sets the tree on fire. Has an effect only if the tree is
    // healthy.
    public void setFire() {
        if (healthy == true) {
            healthy = false;
            burning = true;
        }
    }

    // True if and only if the tree is currently on fire.
    public boolean isBurning() {
        if (day < 3) {
            if (burning == true) {
                return burning;
            }
        }
        burning = false;
        return burning;
    }

    // True if and only if the fire consumed the tree.
    public boolean isBurnt() {
        return burnt;
    }

    // Advances one day for the tree.
    public void newDay() {
        if(isBurning()){
            day++;
        }if(day > 2){
            burnt = true;
        }
    }

  // Additional methods (if you happen to need them) are to be
    // left private.
}
