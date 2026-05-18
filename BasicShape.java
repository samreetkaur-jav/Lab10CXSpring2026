
/**
 * BasicShape is a superclass that represents a simple text-based shape
 * using horizontal (xAdj) and vertical (yAdj) offsets for positioning.
 * It is designed to be extended by specific shape classes such as arrows.
 *
 * @author Samreet Kaur
 * @version v1.1
 * @since 5/18/2026
 */
public class BasicShape {

    protected int xAdj;
    protected int yAdj;

    /**
     * Default constructor initializes position to (0,0).
     */
    public BasicShape() {
        xAdj = 0;
        yAdj = 0;
    }

    /**
     * Constructor initializes position using given offsets.
     *
     * @param xAdj horizontal offset
     * @param yAdj vertical offset
     */
    public BasicShape(int xAdj, int yAdj) {
        this.xAdj = xAdj;
        this.yAdj = yAdj;
    }

    public void setXAdj(int newXAdj) {
        xAdj = newXAdj;
    }

    public int getXAdj() {
        return xAdj;
    }

    public void setYAdj(int newYAdj) {
        yAdj = newYAdj;
    }

    public int getYAdj() {
        return yAdj;
    }

    /**
     * Prints vertical spacing based on yAdj.
     */
    public void drawShapeOn() {
        for (int i = 0; i < yAdj; i++) {
            System.out.println();
        }
    }
}