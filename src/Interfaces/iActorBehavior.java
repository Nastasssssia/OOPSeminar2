package Interfaces;

import Classes.Actor;

public interface iActorBehavior {

    public boolean isTakeOrder();
    public boolean isMakeOrder();
    public void setTakeOrder(boolean val);
    public void setMakeOrder(boolean val);
    public Actor geActor();

}
