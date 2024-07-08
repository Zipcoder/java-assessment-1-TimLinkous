package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {

//        int jumps= k / j;
//        int jums =+ k % j;
//        return jumps;

        int numOfJumps = k / j;
        int heightRemaining = k % j;

        if (heightRemaining > 0){
            return numOfJumps +1;
        }else return numOfJumps;
    }
}
