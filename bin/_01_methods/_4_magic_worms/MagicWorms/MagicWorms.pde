/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

/** This program draws a magical pattern **/

// The setup method is run once when the program starts
void setup() {

  //Set your canvas size
size(1200,800);
  //Set a background color 
background(#000000);
}
float x = 10;
float y = 10;
// The draw method runs continuously (in a loop) until the program ends
void draw() {

  // STEP 1.
  // Use a for loop to draw 300 small ellipses in a diagonal line across the canvas.
  // Make them a bright color.
  // RUN THE PROGRAM TO CHECK IT (see the recipe for the expected outcome).
int i = 0;
fill(frameCount, i,  100);
  ellipse( getWormX(i), getWormY(i), 10, 10);
makeMagical();
for(i = 0; i<300; i++) {

x = random(1200);
y = random(800);
}
  // STEP 2.
  // Now make each ellipse use random values for their x and y co-ordinates. Make sure they are inside the canvas. 
  // Hint:  random(int maxValue)
  // RUN THE PROGRAM TO CHECK IT (see the recipe for the expected outcome).
  
  // STEP 3.
  // Now use the getWormX() and getWormY() methods for x and y co-ordinates of each ellipse
  //(use the for loop variable as the parameter to these methods).
  // RUN THE PROGRAM TO CHECK IT (see the recipe for the expected outcome).


  // STEP 4.
  // Call makeMagical() in your draw method before the for loop. 
  // OPTIONS: Pass in frameCount or another variable for the ellipse "red value", 
  // and i as the "green value" for some extra color coolness.

}

/// DO NOT CHANGE THE CODE BELOW. CALL THE METHODS FROM THE DRAW METHOD
   float frequency = .005;
   float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
