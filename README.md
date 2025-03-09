# BAITAP_KTPM_06_03
Nguyễn Bảo Đại_20015321
Date: 06_03_2025
BÀI TẬP KIẾN TRÚC PHẦN MỀM
Bài Tập Tự nghĩ triển khai đề bài: Quản lý hệ thống đặt món ăn trong nhà hàng

Hướng triển khai đề bài: 
Singleton, Factory (Method, Abstract)
Singleton (OrderManager): Đảm bảo chỉ có một instance quản lý đơn hàng trong hệ thống.
Factory Method (FoodFactory): Tạo các loại món ăn khác nhau (MainCourse, Dessert).
Abstract Factory (CuisineFactory): Tạo nhóm món ăn theo phong cách (VietnameseCuisine, EuropeanCuisine).
![image](https://github.com/user-attachments/assets/abd59476-3abf-4326-885c-dfdfd19591f9)

 

State, Strategy, Decorator
a. Hình thức thanh toán cho đơn hàng
State: Không áp dụng vì có sự chuyển đổi trạng thái.
Strategy: Áp dụng vì các phương thức thanh toán độc lập, không chuyển đổi lẫn nhau.
Decorator: Không áp dụng vì không cần thêm tính năng động vào đối tượng cơ bản.
 ![image](https://github.com/user-attachments/assets/cbaeb66e-da1c-4f51-9a9e-7584762e56af)

b. Tính lương nhân viên
State: Không áp dụng vì không có chuyển đổi trạng thái.
Strategy: Không áp dụng vì không có các chiến lược độc lập.
Decorator: Áp dụng để thêm các loại phụ cấp vào lương cơ bản.
![image](https://github.com/user-attachments/assets/ac780cc5-846d-47a3-8af8-269bf45415c4)

 
c. Quản lý trạng thái bàn ăn
State: Áp dụng vì bàn ăn có các trạng thái chuyển đổi qua lại (Free → Order → Done → Free → Fixing).
Strategy: Không áp dụng vì có sự chuyển đổi trạng thái.
Decorator: Không áp dụng vì không cần thêm tính năng vào bàn.

 

![image](https://github.com/user-attachments/assets/e5c0d264-d6f3-48a9-9ef2-7fd908695840)




