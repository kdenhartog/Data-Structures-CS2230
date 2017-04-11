package forestfires;

public class FFCustomSimulator extends FFSimulator {

    // The fields are up to you. They must be left private.
    // Constructor. It does the same as FFSimulator(x,y).
    /**
     *
     * @param forest_size
     * @param fire_size
     */
    public FFCustomSimulator(int forest_size, int fire_size) {
        super(forest_size, fire_size);
    }

    // Constructor. It works the same as FFSimulator(500,2).
    public FFCustomSimulator() {
        super(500, 2);
    }

    // Constructor. Uses the provided array instead of its own.
    public FFCustomSimulator(FFTree[] aforest) {
        super(500, 2);
        myforest = aforest;
    }

    // Sets the animation speed. The parameter states how many
    // seconds uses a day in the simulation. The original speed
    // is 0.1 seconds per day.
    // Hint: there is a field in FFSimulator that you can use here.
    public void setFrameSpeed(double seconds) {
        wait_time = seconds;
    }

    // Sets the distance for the spread of fire. Initially, the
    // distance is set to 20 pixels (method spreadFire).
    public void setSpreadDistance(int pixels) {
        FFTree[] burningTrees = super.getBurningTrees();
        if (burningTrees == null) {
            return;
        }
        for (FFTree t : myforest) {
            for (FFTree b : burningTrees) {
                if (t.distanceTo(b) < pixels) {
                    t.setFire();
                }
            }

        }
    }
}
