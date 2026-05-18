/**
 * BasicShape
 * This class provides the x and y adjustment offsets for shapes.
 * It also provides the drawShapeOn method which prints blank lines
 * based on the yAdj value before drawing the actual shape.
 * 
 * @author Samreet Kaur
 * @version v1.5
 * @since 18/5/2026
 */
public class BasicShape
{
    private int xAdj;
    private int yAdj;

    /**
     * Default constructor.
     * Sets xAdj and yAdj to 0.
     */
    public BasicShape()
    {
        xAdj = 0;
        yAdj = 0;
    }

    /**
     * Parameterized constructor.
     * Sets xAdj and yAdj to custom values.
     * 
     * @param xAdj horizontal adjustment
     * @param yAdj vertical adjustment
     */
    public BasicShape(int xAdj, int yAdj)
    {
        this.xAdj = xAdj;
        this.yAdj = yAdj;
    }

    /**
     * Sets the horizontal adjustment.
     * 
     * @param newXAdj new x adjustment
     */
    public void setXAdj(int newXAdj)
    {
        xAdj = newXAdj;
    }

    /**
     * Returns the horizontal adjustment.
     * 
     * @return x adjustment value
     */
    public int getXAdj()
    {
        return xAdj;
    }

    /**
     * Sets the vertical adjustment.
     * 
     * @param newYAdj new y adjustment
     */
    public void setYAdj(int newYAdj)
    {
        yAdj = newYAdj;
    }

    /**
     * Returns the vertical adjustment.
     * 
     * @return y adjustment value
     */
    public int getYAdj()
    {
        return yAdj;
    }

    /**
     * Prints blank lines based on yAdj value.
     */
    public void drawShapeOn()
    {
        for (int i = 0; i < yAdj; i++)
        {
            System.out.println();
        }
    }
}