package Task_12;

/**
 * Created by kevin.toerpsch on 03.04.2017.
 */
public class Quad implements IScope {

    int edgeLenght;

    public Quad(int edgeLenght) {
        this.edgeLenght = edgeLenght;
    }

    @Override
    public int getScopeValue() {
        return edgeLenght * 4;
    }
}
