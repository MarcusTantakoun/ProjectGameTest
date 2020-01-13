
import java.util.Random;
import org.newdawn.slick.*;
import org.newdawn.slick.geom.Rectangle;

public class wordClass {

    //list of random words String array
    private String[] arr = {"apple", "because", "cockroach", "deliver", "enough", "growing", "helping", "indiana", "jackboys", "kangaroo", "large", "monster", "nothing", "octopus", "pressure", "queen", "respect", "sativa", "truthful", "wonderful", "xeno", "yellow", "zebra"};
    private Random random = new Random(); //randomize the words
    private int select = random.nextInt(arr.length); //select index
    private String original = arr[select]; //when word is typed, it reverts back to full word
    private int stringy, stringx;
    private Rectangle hitbox;
    
    private static int mainCharX;
    private static int mainCharY;

    public wordClass(int x, int y) throws SlickException {
        hitbox = new Rectangle(x, y, arr[select].length(), 5);
    }
    
    public static void mainChar(int x, int y) {
        mainCharX = x;
        mainCharY = y;
    }

    public void move() {
        hitbox.setX(hitbox.getX() + stringx);
        hitbox.setY(hitbox.getY() + stringy);

        //if we hit a wall, change direction
        if (hitbox.getX() <= mainCharX || hitbox.getX() >= mainCharX) {
            stringx = -stringx;
        }
        if (hitbox.getY() <= mainCharY || hitbox.getY() >= mainCharY) {
            stringy = -stringy;
        }
    }
}
