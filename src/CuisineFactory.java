interface CuisineFactory {
    Food createMainCourse();
    Food createDessert();
}

class VietnameseCuisine implements CuisineFactory {
    public Food createMainCourse() { return new MainCourse("Phở"); }
    public Food createDessert() { return new Dessert("Chè"); }
}

class EuropeanCuisine implements CuisineFactory {
    public Food createMainCourse() { return new MainCourse("Steak"); }
    public Food createDessert() { return new Dessert("Tiramisu"); }
}