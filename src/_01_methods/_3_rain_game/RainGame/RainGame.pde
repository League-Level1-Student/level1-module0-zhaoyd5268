/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
 
/** This program makes a game where the user has to catch rain drops in a bucket
 */


int score = 0;
int bucketWidth = 400;
int bucketHeight=800;
PImage bucket;
int y=50;
int x=100;

// The setup method is run once when the program starts
void setup() {

  //Set your canvas size
  size(1000,1200);
  
  //If you are using an image for the bucket, load it and resize it here.
  // A bucket image -  bucket.png - has been provided if you want to use it.
bucket=loadImage("bucket.png");
image(bucket, 0, 0);

}
// The draw method runs continuously (in a loop) until the program ends
void draw(){
  // Set a background color
  background(30,40,50);
  // Draw a raindrop (ellipse) at the top of the screen
     fill(50, 60, 80);
    stroke(90, 20, 50);
    ellipse(x, y,40,70);
  
  // Make the rain fall down the screen.
  // Hint: make a variable for the raindrop's Y position and change it after you
  // draw the raindrop
  y+=10;
  

  // When the rain falls off the bottom of the canvas, 
  // start a new rain drop falling from the top.
  // Each new drop should start at a random position (X position) at the top. 
  // Hint: This code will give you a random number between 0 and the width of your sketch.
  int randomNumber = (int) random(width);
  
  if (y>=height){

y=0;
}
  // Draw a bucket (rectangle or image) at the bottom of the screen. 
  // The bucket's width needs to be stored in the bucketWidth variable.
 
  image(bucket, mouseX, bucketHeight);
  bucket.resize(150,150);
  // Make the bucket move side-to-side with the mouse. Hint: use mouseX

  
  // When the rain drop has fallen to the bucket, call the checkCatch method
  //  to see if the rain drop is in the bucket.
 checkCatch(x, y);
 
 //This code will display the score on the screen. 
 // Change the color if it does not show up on your background.
    fill(100, 70, 0);
    textSize(50);
    text("Score: " + score, 20, 40);
}


// DO NOT CHANGE THIS METHOD - CALL IT FROM THE DRAW METHOD 
void checkCatch(int x, int y){
     if(x > mouseX && x < mouseX+bucketWidth){
          if(y > mouseY-17 && y < mouseY+30){
               score++;
              y = 0; //if the food was eaten, make more food fall from the top
             int randomNumber = (int) random(width);
          }
     }
     else if (y > height && score > 0){
          score--;
     }
}
