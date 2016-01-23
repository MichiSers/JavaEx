package game;

public class PlayerDetail<A> {

    protected enum PlayerDetailType { NAME, AGE, LEVEL };
    
    protected final PlayerDetailType attributeType;
    private final A attribute;
    
    protected PlayerDetail(A attribute, PlayerDetailType attributeType) {
        this.attribute = attribute;
        this.attributeType = attributeType;
    }
    
    protected A getAttribute() {
        return attribute;
    }
}
