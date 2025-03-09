public class Main {
    public static void main(String[] args) {
        // Singleton
        OrderManager manager = OrderManager.getInstance();
        manager.processOrder("Phở + Chè");

        // Factory Method
        FoodFactory mainCourseFactory = new MainCourseFactory();
        Food food = mainCourseFactory.createFood();
        food.prepare();

        // Abstract Factory
        CuisineFactory vnCuisine = new VietnameseCuisine();
        vnCuisine.createMainCourse().prepare();
        vnCuisine.createDessert().prepare();

        CuisineFactory euCuisine = new EuropeanCuisine();
        euCuisine.createMainCourse().prepare();
        euCuisine.createDessert().prepare();
    }
}