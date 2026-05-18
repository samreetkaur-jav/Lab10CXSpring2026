/**
 * LeftArrow
 * This class creates a text based left pointing hollow arrow.
 * The class extends the BasicShape class and uses inheritance
 * for x and y adjustments.
 * 
 * @author Samreet Kaur
 * @version v1.7
 * @since 18/5/2026
 */
public class LeftArrow extends BasicShape
{
    private int tail;
    private int width;

    /**
     * Default constructor.
     * Sets xAdj and yAdj to 0.
     * Sets tail and width to 5.
     */
    public LeftArrow()
    {
        super(0, 0);

        tail = 5;
        width = 5;
    }

    /**
     * Parameterized constructor.
     * Sets all values for the arrow.
     * Width is automatically changed to odd if even.
     * 
     * @param xAdj horizontal adjustment
     * @param yAdj vertical adjustment
     * @param tail tail length
     * @param width arrow width
     */
    public LeftArrow(int xAdj, int yAdj, int tail, int width)
    {
        super(xAdj, yAdj);

        this.tail = tail;

        setArrowDim(tail, width);
    }

    /**
     * Sets the arrow dimensions.
     * Width is automatically changed to odd if even.
     * 
     * @param tail tail length
     * @param width arrow width
     */
    public void setArrowDim(int tail, int width)
    {
        this.tail = tail;

        if (width % 2 == 0)
        {
            this.width = width + 1;
        }
        else
        {
            this.width = width;
        }
    }

    /**
     * Helper method that prints spaces.
     * 
     * @param count number of spaces
     */
    private void drawSpaces(int count)
    {
        for (int i = 0; i < count; i++)
        {
            System.out.print(" ");
        }
    }

    /**
     * Helper method that prints tail characters.
     * 
     * @param count number of stars
     */
    private void drawTail(int count)
    {
        for (int i = 0; i < count; i++)
        {
            System.out.print("*");
        }
    }

    /**
     * Draws the left hollow arrow shape.
     */
    public void drawShape()
    {
        int midRow = width / 2;

        for (int r = 0; r < width; r++)
        {
            // Applies horizontal spacing
            drawSpaces(getXAdj());

            if (r == midRow)
            {
                // Middle row with arrow tail
                System.out.print("*");

                drawSpaces(midRow - 1);

                drawTail(tail);

                System.out.println();
            }
            else
            {
                // Creates upper and lower hollow arrow sections
                int distFromMid = Math.abs(r - midRow);
                int leadingSpaces = distFromMid;
                int innerSpaces = midRow - distFromMid;

                drawSpaces(leadingSpaces);

                System.out.print("*");

                if (innerSpaces > 0)
                {
                    drawSpaces(innerSpaces - 1);

                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
}