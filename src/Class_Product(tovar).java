// Класс товара: хранит название и цену
public class Product {
    private String name;   // Название товара
    private double price;  // Цена товара

    // Конструктор: создаёт товар с заданными названием и ценой
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Геттер для названия
    public String getName() {
        return name;
    }

    // Геттер для цены
    public double getPrice() {
        return price;
    }

    // Красивый вывод товара
    @Override
    public String toString() {
        return name + " — " + price + " руб.";
    }
}

