package Task_12;

/**
 * Created by kevin.toerpsch on 03.04.2017.
 */
public class Rectangle implements IScope {

    int edgeLength1;
    int edgeLength2;

    public Rectangle(int edgeLength1, int edgeLength2) {
        this.edgeLength1 = edgeLength1;
        this.edgeLength2 = edgeLength2;
    }

    @Override
    public int getScopeValue() {
        return (edgeLength1 * 2) + (edgeLength2 * 2);
    }
}
