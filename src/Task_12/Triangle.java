package Task_12;

/**
 * Created by kevin.toerpsch on 03.04.2017.
 */
public class Triangle implements IScope {

    int edgeLength;

    public Triangle(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    @Override
    public int getScopeValue() {
        return edgeLength * 3;
    }
}
