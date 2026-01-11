// Главный класс с методом main: показывает пример работы корзины
public class Main {
    public static void main(String[] args) {
        // Создаём несколько товаров
        Product laptop = new Product("Ноутбук", 75000.0);
        Product mouse = new Product("Мышка", 1500.0);
        Product keyboard = new Product("Клавиатура", 3000.0);

        // Создаём корзину
        Cart cart = new Cart();

        // Добавляем товары в корзину
        cart.addProduct(laptop);
        cart.addProduct(mouse);
        cart.addProduct(keyboard);

        // Показываем корзину и итоговую сумму
        cart.printCart();

        // Удаляем один товар
        System.out.println();
        System.out.println("Удаляем: Мышка");
        cart.removeProduct("Мышка");

        // Снова показываем корзину
        System.out.println();
        cart.printCart();
    }
}
