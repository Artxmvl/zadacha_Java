import java.util.ArrayList;

// Класс корзины: хранит список товаров и умеет работать с ним
public class Cart {
    // Список всех товаров, которые сейчас лежат в корзине
    private ArrayList<Product> products = new ArrayList<>();

    // Метод добавляет один товар в конец списка корзины
    public void addProduct(Product p) {
        products.add(p);
    }

    // Метод удаляет товар по названию
    public void removeProduct(String name) {
        for (int i = 0; i < products.size(); i++) {
            // equals() — это метод String, который сравнивает строки по содержимому
            if (products.get(i).getName().equals(name)) {
                // Если нашли товар с таким названием — удаляем его из списка
                products.remove(i);
                // После удаления выходим из метода, дальше ничего не ищем
                return;
            }
        }
    }

    // Метод считает общую стоимость всех товаров в корзине
    public double getTotal() {
        double total = 0.0;           // Сумма начинается с 0 потому что изначально ее нет
        // Проходим по всем товарам в корзине
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    // Метод выводит содержимое корзины и общую сумму в консоль
    public void printCart() {
        System.out.println(" Корзина ");
        for (int i = 0; i < products.size(); i++) {
            // i + 1 — номер товара в списке (начинаем с 1, а не с 0)
            System.out.println((i + 1) + ". " + products.get(i).toString());
        }
        System.out.println("Итого: " + getTotal() + " руб.");
    }
}
