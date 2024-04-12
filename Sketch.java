import processing.core.PApplet;

/**
 * This program draws 15x7 stickmen and 7x6 hearts
 * @author T. Martins
 */

public class Sketch extends PApplet {
	
  public void settings() {
    size(800, 400);
  }

  public void setup() {
    background(210, 255, 173);
  }

  public void draw() {

    // draw all the coloured stickmen
    stroke(242, 0, 5);
    manRow(0);
    stroke(230, 142, 28);
    manRow(50);
    stroke(221, 234, 27);
    manRow(100);
    stroke(0, 139, 0);
    manRow(150);
    stroke(87, 150, 171);
    manRow(200);
    stroke(0, 0, 226);
    manRow(250);
    stroke(168, 158, 209);
    manRow(300);

    // draw the hearts
    for (int y = 1; y < 7; y++) {
      for (int x = 50; x < 700; x += 100) {
        drawHeart(x + y % 2 * 50, y * 50);
      }
    }
    
  }
  
  /**
   * Draws a stickman with adjustable x and y coordinates
   * @param x x-coordinates of where stickman is drawn + 50
   * @param y y-coordinates of where stickman is draw + 40
   * @author T. Martins
   */
  private void drawMan(int x, int y) {

    // the x int and y int of drawMan() allow the x to be adjusted by manRow and the y in draw() 
    fill(210, 255, 173);

    // body
    line(50 + x, 40 + y, 50 + x, 55 + y);
    
    // legs
    line(50 + x, 55 + y, 60 + x, 65 + y);  
    line(50 + x, 55 + y, 40 + x, 65 + y);  
    
    // head
    ellipse(50 + x, 30 + y, 20, 20);

    // arms
    line(50 + x, 50 + y, 60 + x, 40 + y);  
    line(50 + x, 50 + y, 40 + x, 40 + y);

  }

  /**
   * Draws 15 stickmen in a row using drawMan() with adjustable y coordinates
   * @param y y-coordinates of row
   * @author T. Martins
   */
  private void manRow(int y) {

    // this draws a row, allowing me to adjust the y of manRow() in order to change height in draw()
    for(int x = 0; x < 750; x += 50){
      drawMan(x, y);
    }

  }

  /**
   * Draws a heart with adjustable x and y coordinates
   * @param x x-coordinates of where heart is drawn + 17
   * @param y y-coordinates of where heart is drawn + 10
   * @author T. Martins
   */
  private void drawHeart(int x, int y) {

    stroke(0);
    fill(0);
    
    // draw 3 triangles which are adjusted by x and y variables
    triangle(17 + x, 10 + y, 25 + x, 20 + y, 33 + x, 10 + y);
    triangle(17 + x, 10 + y, 21 + x, 5 + y, 25 + x, 10 + y);
    triangle(25 + x, 10 + y, 29 + x, 5 + y, 33 + x, 10 + y);

  }
}