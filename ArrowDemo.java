/**
 * ArrowDemo
 * This driver class tests the RightArrow and LeftArrow classes.
 * It demonstrates inheritance, constructors, mutators,
 * and shape drawing methods.
 * 
 * @author Samreet Kaur
 * @version v1.4
 * @since 18/5/2026
 */
public class ArrowDemo
{
    /**
     * Main method.
     * Creates and displays arrow objects.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args)
    {
        // Create default RightArrow object
        RightArrow right1 = new RightArrow();

        right1.drawShapeOn();
        right1.drawShape();

        System.out.println();

        // Set x adjustment to 10
        right1.setXAdj(10);

        right1.drawShapeOn();
        right1.drawShape();

        System.out.println();

        // Set y adjustment to 5
        right1.setYAdj(5);

        right1.drawShapeOn();
        right1.drawShape();

        System.out.println();

        // Change tail and width
        right1.setArrowDim(10, 15);

        right1.drawShapeOn();
        right1.drawShape();

        System.out.println();

        // Create second RightArrow object
        RightArrow right2 = new RightArrow(5, 10, 15, 14);

        right2.drawShapeOn();
        right2.drawShape();

        System.out.println();

        // Create LeftArrow object
        LeftArrow left1 = new LeftArrow(13, 0, 15, 15);

        left1.drawShapeOn();
        left1.drawShape();

        System.out.println();

        // Change tail and width
        left1.setArrowDim(10, 10);

        left1.drawShapeOn();
        left1.drawShape();

        System.out.println();

        // Change x adjustment
        left1.setXAdj(5);

        left1.drawShapeOn();
        left1.drawShape();

        System.out.println();

        // Change y adjustment
        left1.setYAdj(5);

        left1.drawShapeOn();
        left1.drawShape();

        System.out.println();

        // Create default LeftArrow object
        LeftArrow left2 = new LeftArrow();

        left2.drawShapeOn();
        left2.drawShape();
    }
}