public class Lab2
{
  public static void cleanSquare()
  {
    Robot.load("square.txt");
    Robot.setDelay(0.1);
    
    //INSERT CODE HERE
    Robot.turnLeft();
    Lab2.moveRow();
    Lab2.turnRight();
    Lab2.moveRow();
    Lab2.turnRight();
    Lab2.moveRow();
    Lab2.turnRight();
    Lab2.moveRow();
  }
  
    public static void moveRow()
    {
      Robot.move();
      Robot.makeLight();
      Robot.move();
      Robot.makeLight();
      Robot.move();
      Robot.makeLight();
      Robot.move();
      Robot.makeLight();
      Robot.move();
      Robot.makeLight();
      Robot.move();
    }
  
  
    public static void turnRight()
    {
     Robot.turnLeft(); 
     Robot.turnLeft(); 
     Robot.turnLeft(); 
    }
  
  public static void darkenComb()
  {
    Robot.load("comb.txt");
    Robot.setDelay(0.05);
    
    //INSERT CODE HERE
    Lab2.completeComb();
    Lab2.darkenCombRow();
    Lab2.moveBack();
  }
  
    public static void darkenCombRow()
    {
        Lab2.turnRight();  
        Robot.move();
        Robot.makeDark();
        Robot.move();
        Robot.makeDark();
        Robot.move();
        Robot.makeDark();
        Robot.move();
        Robot.makeDark();
        Robot.move();
        Robot.makeDark();
        Robot.move();
        Robot.makeDark();
        Lab2.turnAround();
    }
    
    public static void moveBack()
    {
      Robot.move();
      Robot.move();
      Robot.move();
      Robot.move();
      Robot.move();
      Robot.move();
      Robot.makeDark();
      Lab2.turnRight(); 
    }
  
    
    public static void turnAround()
    {
      Robot.turnLeft();
      Robot.turnLeft();
    }
    
    public static void moveTwo()
    {
      Robot.move();
      Robot.makeDark();
      Robot.move();
    }
    
    public static void completeComb()
    {
      Lab2.darkenCombRow();
      Lab2.moveBack();
      Lab2.moveTwo();
      Lab2.darkenCombRow();
      Lab2.moveBack();
      Lab2.moveTwo();
      Lab2.darkenCombRow();
      Lab2.moveBack();
      Lab2.moveTwo();
      Lab2.darkenCombRow();
      Lab2.moveBack();
      Lab2.moveTwo();
    }
    
  
  public static void makeCheckered()
  {
    Robot.load("blank.txt");
    Robot.setDelay(0.05);
    
    //INSERT CODE HERE
    Lab2.checkerRow1();
    Lab2.checkerRow2();
    Lab2.checkerRow3();
    Lab2.checkerRow2();
    Lab2.checkerRow3();
    Lab2.checkerRow2();    
    Lab2.checkerRow3();
    Lab2.checkerLastRow();
  }
  
    public static void checkerRow()
    {
      Robot.makeDark();
        Robot.move();
        Robot.move();
        Robot.makeDark();
        Robot.move();
        Robot.move();
        Robot.makeDark();
        Robot.move();
        Robot.move();
        Robot.makeDark();
        Robot.move();  
    }
    
    public static void checkerRow1()
    {
        //precondition: robot in far bottom left corner facing north
        //postcondition: robot at top row 2nd square facing south
        Lab2.checkerRow();
        Lab2.turnRight();
        Robot.move();
        Lab2.turnRight();
    }
    
    public static void checkerRow2()
    {
      //precondition: robot at top row 2nd square facing south
      //postcondition: robot in bottom row 3rd square from the left facing east
      Lab2.checkerRow();
      Robot.turnLeft();
      Robot.move();
    }
    
    public static void checkerRow3()
    {
      //precondition: robot in bottom row 3rd square from the left facing east
      //postcondition: robot top row 4th square from the right facing south
      Robot.turnLeft();
      Lab2.checkerRow();
      Lab2.turnRight();
      Robot.move();
      Lab2.turnRight();
    }
    
    public static void checkerLastRow()
    {
     Lab2.checkerRow();
     Robot.turnLeft();   
    }
    
}
