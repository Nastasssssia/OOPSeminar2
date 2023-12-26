package Interfaces;

import Classes.Actor;

public interface iQueueBehaviour {
    public void takeInQueue(iActorBehavior actor);
    public void releaseFromQueue();
    public void takeOrder ();
    public void giveOrder ();
}
