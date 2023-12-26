package Classes;

import Interfaces.iActorBehavior;

import Interfaces.iReturnOrder;

public abstract class Actor implements iActorBehavior, iReturnOrder {
    protected String name;

    protected boolean isMakeOrder;

    protected boolean isTakeOrder;

    public Actor(String name) {
        this.name = name;
    }


    abstract String getName();

    abstract void setName(String str);

    @Override
    public  void acceptReturnOrder(iActorBehavior actor){
        String customerName = actor.geActor().getName();
        System.out.println(customerName + " the customer's order was canceled ");
    }

    @Override
    public void changeReturnOrder(iActorBehavior actor) {
        String customerName = actor.geActor().getName();
        System.out.println(customerName + " the customer's order was replaced ");
    }



    public Actor geActor() {
        return this;
    }



}
