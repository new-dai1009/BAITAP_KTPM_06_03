interface Food {
    void prepare();
}

class MainCourse implements Food {
    private String name;

    public MainCourse(String name) {
        this.name = name;
    }

    public void prepare() {
        System.out.println("Chuẩn bị món chính: " + name);
    }
}

class Dessert implements Food {
    private String name;

    public Dessert(String name) {
        this.name = name;
    }

    public void prepare() {
        System.out.println("Chuẩn bị tráng miệng: " + name);
    }
}

abstract class FoodFactory {
    public abstract Food createFood();
}

class MainCourseFactory extends FoodFactory {
    public Food createFood() {
        return new MainCourse("Món chính mặc định"); // Thêm tham số String
    }
}

class DessertFactory extends FoodFactory {
    public Food createFood() {
        return new Dessert("Tráng miệng mặc định"); // Thêm tham số String
    }
}