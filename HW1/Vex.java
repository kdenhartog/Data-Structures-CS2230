class Vex {

    int x, y, z;

    /**
     * Vex Constructor
     *
     * @param x integer of x coordinate
     * @param y integer of y coordinate
     * @param z integer of z coordinate
     */
    public Vex( int x, int y, int z ) {

        this.x = x;

        this.y = y;

        this.z = z;

    }

    /**
     * Method toString
     *
     * @return a string listing the 3 coordinates of the vector
     */
    public String toString() {

        return "Vex( " + x + ", " + y + ", " + z + " )";

    }

    /**
     * Method add
     *
     * @param other - A vector of class Vex()
     * @return The result of adding two vectors, one of which is passed through
     * the argument
     */
    public Vex add( Vex other ) {

        int new_x = this.x + other.x,

        new_y = this.y + other.y,

        new_z = this.z + other.z;

        return new Vex( new_x , new_y, new_z );

    }

    /**
     * Method subtract
     *
     * @param other A vector of class Vex()
     * @return the result of the subtraction of one vector to another
     */
    public Vex subtract( Vex other ){
        Vex temp = new Vex(this.x-other.x, this.y - other.y, this.z - other.z);
        return temp;
    }

    /**
     * Method scalarMult
     *
     * @param scale - the scalar multiplier to be used
     * @return the resulting vector after taking this.vector by the scalar
     */
    public Vex scalarMult( int scale ){
        Vex temp = new Vex(this.x*scale, this.y*scale, this.z*scale);
        return temp;
    }

    /**
     * Method innerMult
     *
     * @param other - the second vector to be used for dot product
     * @return an int representing the dot product of two vectors 
     */
    public int innerMult( Vex other ){
        int tempX = (this.x)*(other.x);
        int tempY = (this.y)*(other.y);
        int tempZ = (this.z)*(other.z);

        return tempX+tempY+tempZ;
    }

    /**
     * Method norm1
     *
     * @return the absolute value each coordinate and then added together
     */
    public int norm1(){
        int tempX = Math.abs(this.x);
        int tempY = Math.abs(this.y);
        int tempZ = Math.abs(this.z);
        return tempX+tempY+tempZ;
    }

    /**
     * Method norm2
     *
     * @return the square of each coordinated added together then square rooted
     */
    public double norm2(){
        double temp = (this.x)*(this.x) + (this.y)*(this.y) + (this.z)*(this.z);
        return Math.sqrt(temp);   
    }

    /**
     * Method equals
     *
     * @param other - the vector of class Vex() being compared
     * @return - return true if the vectors are the same otherwise return false
     */
    public boolean equals( Vex other ){
        if(this.x == other.x){
            if(this.y == other.y){
                if(this.z == other.z){
                    return true;
                }
            }
        }
            return false;
    }

    /**
     * Method clone
     *
     * @return a copy of the vector of class Vex() being used
     */
    public Vex clone(){
        return new Vex(this.x, this.y, this.z);
    }

}