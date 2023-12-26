package Classes;
import Interfaces.iActorBehavior;
public class TaxInspector implements iActorBehavior{

    private final String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;

    public TaxInspector() {
        this.name = "Tax Audit";
    }
    @Override
    public boolean  isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean val) {
        isTakeOrder = val;

    }

    @Override
    public void setMakeOrder(boolean val) {
        isMakeOrder = val;

    }

    @Override
    public Actor geActor() {
        return new OrdinaryClient(name);
    }

    public String getName() {
        return name;
    }
}
