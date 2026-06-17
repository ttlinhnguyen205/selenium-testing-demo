# Selenium Testing Demo

## 1. Giới thiệu

### 1.1 Mục tiêu

Dự án được thực hiện nhằm tìm hiểu và thực hành công cụ kiểm thử tự động Selenium WebDriver. Sinh viên xây dựng các kịch bản kiểm thử tự động cho website thương mại điện tử nhằm kiểm tra các chức năng quan trọng của hệ thống.

### 1.2 Website kiểm thử

Website được sử dụng:

https://www.saucedemo.com/

Tài khoản kiểm thử:

* Username: standard_user
* Password: secret_sauce


# 2. Công cụ sử dụng

* Java 17
* Selenium WebDriver 4
* JUnit 5
* Maven
* Google Chrome
* GitHub Codespaces
* GitHub


# 3. Môi trường thực hiện

| Thành phần         | Thông tin                        |
| ------------------ | -------------------------------- |
| Hệ điều hành       | Ubuntu Linux (GitHub Codespaces) |
| Ngôn ngữ lập trình | Java 17                          |
| Framework kiểm thử | JUnit 5                          |
| Công cụ kiểm thử   | Selenium WebDriver               |
| Trình duyệt        | Google Chrome Headless           |
| Build Tool         | Maven                            |
| Quản lý mã nguồn   | GitHub                           |


# 4. Danh sách Test Case

| Mã TC | Chức năng kiểm thử        | Mục đích                                                           | Kết quả |
| ----- | ------------------------- | ------------------------------------------------------------------ | ------- |
| TC01  | Login Successfully        | Kiểm tra đăng nhập với tài khoản hợp lệ                            | PASS    |
| TC02  | Check Product Displayed   | Kiểm tra sản phẩm "Sauce Labs Backpack" hiển thị sau khi đăng nhập | PASS    |
| TC03  | Add Product To Cart       | Kiểm tra chức năng thêm sản phẩm vào giỏ hàng                      | PASS    |
| TC04  | Login Failed              | Kiểm tra đăng nhập với mật khẩu không hợp lệ                       | PASS    |
| TC05  | Sort Product By Price     | Kiểm tra sắp xếp sản phẩm theo giá từ thấp đến cao                 | PASS    |
| TC06  | Logout Successfully       | Kiểm tra chức năng đăng xuất khỏi hệ thống                         | PASS    |
| TC07  | Remove Product From Cart  | Kiểm tra chức năng xóa sản phẩm khỏi giỏ hàng                      | PASS    |
| TC08  | Verify Cart Contents      | Kiểm tra nội dung giỏ hàng sau khi thêm sản phẩm                   | PASS    |
| TC09  | Open Product Details Page | Kiểm tra chức năng mở trang chi tiết sản phẩm                      | PASS    |

### Tổng kết

* Tổng số Test Case: 9
* Passed: 9
* Failed: 0
* Errors: 0
* Tỷ lệ thành công: 100%


# 5. Cách chạy dự án

### Clone repository

```bash
git clone <repository-link>
```

### Di chuyển vào thư mục dự án

```bash
cd selenium-testing-demo
```

### Chạy kiểm thử

```bash
mvn clean test
```


# 6. Kết quả thực hiện

Sau khi thực thi toàn bộ các test case bằng Maven:

```text
Tests run: 9
Failures: 0
Errors: 0
Skipped: 0

BUILD SUCCESS
```

Ảnh minh họa kết quả:

```markdown
<img width="923" height="272" alt="image" src="https://github.com/user-attachments/assets/218d5c2a-99e0-40ff-ad37-03f6a42cf83f" />

```


# 7. Kết luận

Qua bài thực hành, sinh viên đã:

* Tìm hiểu Selenium WebDriver.
* Thực hiện kiểm thử tự động giao diện web.
* Sử dụng JUnit để xây dựng test case.
* Sử dụng Maven để quản lý và thực thi kiểm thử.
* Triển khai dự án trên GitHub Codespaces.
* Xây dựng thành công 09 test case kiểm thử tự động.

Kết quả cuối cùng:

* Tổng số Test Case: 9
* Passed: 9
* Failed: 0
* Errors: 0
* Tỷ lệ thành công: 100%







