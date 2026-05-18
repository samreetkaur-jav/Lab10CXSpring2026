/**
 * RightArrow is a subclass of BasicShape that draws a right-pointing
 * text-based arrow using a tail and an arrow head. Width is always forced odd.
 *
 * @author Samreet Kaur
 * @version v1.2
 * @since 5/18/2026
 */
public class RightArrow extends BasicShape {

    private int tail;
    private int width;

    public RightArrow() {
        super();
        tail = 5;
        width = 5;
    }

    public RightArrow(int xAdj, int yAdj, int tail, int width) {
        super(xAdj, yAdj);
        setArrowDim(tail, width);
    }

    public void setArrowDim(int tail, int width) {
        this.tail = tail;

        if (width % 2 == 0) {
            width++;
        }
        this.width = width;
    }

    public void drawShape() {

        for (int i = 0; i < xAdj; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < tail; i++) {
            System.out.print("-");
        }

        int mid = width / 2;

        for (int i = 0; i < width; i++) {
            if (i == mid) {
                System.out.print(">");
            } else {
                System.out.print("-");
            }
        }

        System.out.println();
    }
}