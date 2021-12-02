import java.util.*;
import java.io.*;
import java.math.*;

/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
            int maxMountainH = 0; // highest mount 0-9
            int maxMountainX = 0; // highest mount number 0-7
        // game loop
        while (true) {
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain.
                if (maxMountainH <= mountainH) {
                    maxMountainH = mountainH;
                    maxMountainX = i;
                    
                }
            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            System.err.println(maxMountainH);

            System.out.println(maxMountainX); // The index of the mountain to fire on.
            maxMountainH = 0; //zeroig for the next loop
            maxMountainX = 0;
        }
    }
}
