# Selenium Testing Demo

## 1. Giới thiệu

### 1.1 Mục tiêu

Dự án được thực hiện nhằm tìm hiểu và thực hành công cụ kiểm thử tự động Selenium WebDriver. Nội dung bài thực hành tập trung vào việc xây dựng các kịch bản kiểm thử tự động cho một website thực tế, từ đó giúp sinh viên làm quen với quy trình kiểm thử giao diện người dùng (UI Testing) và kiểm thử chức năng (Functional Testing).

### 1.2 Website kiểm thử

Website được lựa chọn để kiểm thử:

https://www.saucedemo.com/

Đây là website mẫu được thiết kế dành cho việc học tập và thực hành kiểm thử phần mềm.

### 1.3 Công nghệ sử dụng

* Java 17
* Selenium WebDriver 4
* JUnit 5
* Maven
* Google Chrome
* GitHub Codespaces
* GitHub


# 2. Môi trường thực hiện

| Thành phần           | Thông tin                        |
| -------------------- | -------------------------------- |
| Hệ điều hành         | Ubuntu Linux (GitHub Codespaces) |
| Ngôn ngữ lập trình   | Java 17                          |
| Công cụ build        | Maven                            |
| Framework kiểm thử   | JUnit 5                          |
| Công cụ kiểm thử     | Selenium WebDriver               |
| Trình duyệt          | Google Chrome Headless           |
| Kho lưu trữ mã nguồn | GitHub                           |


# 3. Các Test Case đã xây dựng

## TC01 – Đăng nhập thành công

### Mục đích

Kiểm tra hệ thống cho phép người dùng đăng nhập bằng tài khoản hợp lệ.

### Dữ liệu kiểm thử

* Username: standard_user
* Password: secret_sauce

### Kết quả mong đợi

Người dùng được chuyển đến trang danh sách sản phẩm (inventory.html).

### Kết quả thực tế

PASS


## TC02 – Kiểm tra sản phẩm hiển thị

### Mục đích

Kiểm tra sản phẩm "Sauce Labs Backpack" được hiển thị sau khi đăng nhập.

### Kết quả mong đợi

Tên sản phẩm xuất hiện trên màn hình.

### Kết quả thực tế

PASS


## TC03 – Thêm sản phẩm vào giỏ hàng

### Mục đích

Kiểm tra chức năng thêm sản phẩm vào giỏ hàng.

### Thao tác

* Đăng nhập hệ thống.
* Chọn Add to Cart.

### Kết quả mong đợi

Biểu tượng giỏ hàng hiển thị số lượng là 1.

### Kết quả thực tế

PASS


## TC04 – Đăng nhập thất bại

### Mục đích

Kiểm tra hệ thống xử lý trường hợp nhập sai mật khẩu.

### Dữ liệu kiểm thử

* Username: standard_user
* Password: wrong_password

### Kết quả mong đợi

Hệ thống hiển thị thông báo lỗi đăng nhập.

### Kết quả thực tế

PASS


## TC05 – Sắp xếp sản phẩm theo giá tăng dần

### Mục đích

Kiểm tra chức năng sắp xếp sản phẩm theo giá từ thấp đến cao.

### Kết quả mong đợi

Sản phẩm có giá thấp nhất được hiển thị đầu tiên.

### Kết quả thực tế

PASS


## TC06 – Đăng xuất

### Mục đích

Kiểm tra chức năng đăng xuất khỏi hệ thống.

### Kết quả mong đợi

Người dùng quay trở lại trang đăng nhập.

### Kết quả thực tế

PASS


# 4. Kết quả thực hiện

Sau khi hoàn thành các kịch bản kiểm thử, dự án được thực thi bằng Maven trong môi trường GitHub Codespaces.

Lệnh thực hiện:

```bash
mvn clean test
```

Kết quả:



# 5. Hướng dẫn chạy dự án

### Bước 1: Clone repository

```bash
git clone <repository-link>
```

### Bước 2: Di chuyển vào thư mục dự án

```bash
cd selenium-testing-demo
```

### Bước 3: Chạy kiểm thử

```bash
mvn clean test
```

### Bước 4: Kiểm tra kết quả

Nếu tất cả test case thành công sẽ hiển thị:

```text
BUILD SUCCESS
```


# 6. Kết luận

Qua bài thực hành, sinh viên đã:

* Tìm hiểu được Selenium WebDriver.
* Biết cách xây dựng và thực thi các kịch bản kiểm thử tự động.
* Sử dụng Maven để quản lý và chạy kiểm thử.
* Áp dụng GitHub Codespaces trong quá trình phát triển.
* Thực hiện thành công 06 test case kiểm thử chức năng cho website SauceDemo.

Kết quả cuối cùng cho thấy tất cả các test case đều thực thi thành công với tỷ lệ PASS đạt 100%.

