
/**
 * It draws a complete house on screen using individual shapes
 *
 * @author Joe Huang
 * @version Jan 11
 */
public class MyHouse
{
    // instance variables - replace the example below with your own
    // ACCESS_MODIFIER TYPE NAME
    private Circle door;
    private Square doorBottom;
    private Triangle roof;
    private Square base;
    private Square window;
    private Square window2;
    
    /**
     * The job of a constructor is to intialize all the instance variables 
     */
    public MyHouse()
    {
        // initialise instance variables
        door = new Circle();
        doorBottom = new Square();
        roof = new Triangle();
        base = new Square();
        window = new Square();
        window2 = new Square();
        
    }

    /**
     * Draw the house for us
     */
    public void drawHouse()
    {
        // put the roof in position 
        
        roof.moveVertical(100);
        roof.changeSize(30, 120);
        roof.moveHorizontal(50);
        roof.makeVisible();
        base.changeSize(100);
        base.moveVertical(100);
        base.moveHorizontal(-12);
        base.makeVisible();       
        window.changeColor("yellow");
        window.moveVertical(110);
        window.moveHorizontal(10);
        window.makeVisible();        
        window2.changeColor("yellow");
        window2.moveVertical(110);
        window2.moveHorizontal(50);
        window2.makeVisible();       
        door.moveVertical(150);
        door.moveHorizontal(50);
        door.changeSize(31);
        door.makeVisible();        
        doorBottom.moveVertical(170);
        doorBottom.changeSize(32);
        doorBottom.moveHorizontal(10);
        doorBottom.changeColor("blue");
        doorBottom.makeVisible();
    }
}
