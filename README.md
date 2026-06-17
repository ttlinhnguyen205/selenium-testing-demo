# Selenium Testing Demo

## 1. Giới thiệu

Dự án này được xây dựng nhằm thực hành công cụ kiểm thử tự động Selenium WebDriver.

Website được kiểm thử:

https://www.saucedemo.com/

Mục tiêu của bài thực hành là xây dựng tối thiểu 03 test case kiểm thử tự động cho một website.

## 2. Công cụ sử dụng

- GitHub Codespaces
- Java 17
- Maven
- Selenium WebDriver
- JUnit 5
- Chrome Headless
- WebDriverManager

## 3. Website kiểm thử

Website SauceDemo là website mẫu dùng để thực hành kiểm thử tự động.

Tài khoản sử dụng:

- Username: standard_user
- Password: secret_sauce

## 4. Danh sách test case

| Mã test case | Chức năng kiểm thử | Mô tả | Kết quả mong đợi |
|---|---|---|---|
| TC01 | Đăng nhập | Kiểm tra đăng nhập với tài khoản hợp lệ | Người dùng đăng nhập thành công |
| TC02 | Kiểm tra sản phẩm | Kiểm tra sản phẩm Sauce Labs Backpack hiển thị | Sản phẩm hiển thị trên trang |
| TC03 | Thêm vào giỏ hàng | Thêm sản phẩm Sauce Labs Backpack vào giỏ hàng | Giỏ hàng hiển thị số lượng 1 |

## 5. Cách chạy project

Clone repository:

```bash
git clone <link-repo>
cd selenium-testing-demo
