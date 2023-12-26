package Interfaces;
import Classes.Actor;

/**
 * Интерфейс, определяющий методы для возврата и замены товара.
 */
public interface iReturnOrder {

    /**
     * Метод для принятия возврата товара.
     *
     * @param actor Актер, осуществляющий возврат товара.
     */
    public void acceptReturnOrder(iActorBehavior actor);

    /**
     * Метод для замены товара.
     *
     * @param actor Актер, осуществляющий замену товара.
     */
    public void changeReturnOrder(iActorBehavior actor);
}

