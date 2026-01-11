import java.util.ArrayList;

// Класс корзины: хранит список товаров и в то же время с ним работает
public class Cart {
    // Список товаров в корзине
    private ArrayList<Product> products = new ArrayList<>();

    // Добавить товар в корзину
    public void addProduct(Product p) {
        products.add(p);
    }

    // Удалить  товар по названию
    public void removeProduct(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                products.remove(i);  // Удаляем и выходим из метода
                return;
            }
        }
    }

    // Посчитать общую сумму всего
    public double getTotal() {
        double total = 0.0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    // Вывести содержимое корзины в консоль
    public void printCart() {
        System.out.println("=== Корзина ===");
        for (int i = 0; i < products.size(); i++) {
            // Нумеруем товары с 1
            System.out.println((i + 1) + ". " + products.get(i).toString());
        }
        System.out.println("Итого: " + getTotal() + " руб.");
    }
}
