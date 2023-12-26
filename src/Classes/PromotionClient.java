package Classes;

import Interfaces.iActorBehavior;

/**
 * Класс, представляющий акционного клиента в системе.
 * Наследуется от базового класса Actor и реализует интерфейс iActorBehavior.
 */
public class PromotionClient extends Actor {
    /**
     * Название акции, в которой участвует клиент.
     */
    private String nameOfPromotion;
    /**
     * Уникальный идентификатор акционного клиента.
     */
    private int idPromClient;

    /**
     * Счетчик акционных клиентов (статическое поле).
     */
    private static int count = 0;

    /**
     * Лимит участников акции.
     */
    private final int limit = 10; // Пример лимита участников акции

    /**
     * Конструктор класса PromotionClient.
     *
     * @param name          Имя акционного клиента.
     * @param idPromClient  Уникальный идентификатор акционного клиента.
     */
    public PromotionClient(String name, int idPromClient) {
        super(name);
        this.idPromClient = idPromClient;
        // Проверка на превышение лимита участников
        if (count >= limit)
            System.out.println("The limit of the campaign participants has been exceeded. The service is declined.");
        else {
            count++; // увеличиваем количество участников при создании нового акционного клиента
        }
    }

    // Геттеры и сеттеры

    /**
     * Получить название акции, в которой участвует клиент.
     *
     * @return Название акции.
     */
    public String getNameOfPromotion() {
        return nameOfPromotion;
    }

    /**
     * Установить название акции, в которой участвует клиент.
     *
     * @param nameOfPromotion Название акции.
     */
    public void setNameOfPromotion(String nameOfPromotion) {
        this.nameOfPromotion = nameOfPromotion;
    }

    /**
     * Получить уникальный идентификатор акционного клиента.
     *
     * @return Уникальный идентификатор акционного клиента.
     */
    public int getIdPromClient() {
        return idPromClient;
    }

    /**
     * Установить уникальный идентификатор акционного клиента.
     *
     * @param idPromClient Уникальный идентификатор акционного клиента.
     */
    public void setIdPromClient(int idPromClient) {
        this.idPromClient = idPromClient;
    }

    /**
     * Получить количество акционных клиентов.
     *
     * @return Количество акционных клиентов.
     */
    public static void getCount() {
        System.out.println(count);
    }

    /**
     * Установить количество акционных клиентов.
     *
     * @param count Количество акционных клиентов.
     */
    public static void setCount(int count) {
        PromotionClient.count = count;
    }

    @Override
    String getName() {
        return super.name;
    }

    @Override
    void setName(String str) {
        super.name = str;
    }

    @Override
    public boolean  isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;

    }

    @Override
    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;

    }
}




