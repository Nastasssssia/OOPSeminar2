import Classes.*;
import Interfaces.iActorBehavior;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Market magnit = new Market();
        iActorBehavior client1 = new OrdinaryClient("Boris");
        iActorBehavior client2  = new OrdinaryClient("Maria");
        iActorBehavior client3 = new SpecialClient("Gubernator",1);
        iActorBehavior client4 = new TaxInspector();
        iActorBehavior clientPromo1 = new PromotionClient("Katya",5);
        PromotionClient.getCount();
        iActorBehavior clientPromo2 = new PromotionClient("Sasha",6);
        PromotionClient.getCount();
        iActorBehavior clientPromo3 = new PromotionClient("Kostya",7);
        PromotionClient.getCount();
        iActorBehavior clientPromo4 = new PromotionClient("Lera",8);
        PromotionClient.getCount();

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(clientPromo1);
        magnit.acceptToMarket(clientPromo2);
        magnit.acceptToMarket(clientPromo3);
        magnit.acceptToMarket(clientPromo4);

        magnit.update();


    }
}