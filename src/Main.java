public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();

        Product laptop = new Product("Ноутбук", 75000);
        Product mouse = new Product("Мышка", 1500);
        Product keyboard = new Product("Клавиатура", 3000);

        cart.addProduct(laptop);
        cart.addProduct(mouse);
        cart.addProduct(keyboard);

        cart.printCart();

        System.out.println("Удаляем: Мышка\n");
        cart.removeProduct("Мышка");

        cart.printCart();
    }
}
