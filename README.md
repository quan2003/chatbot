# Chatbot Spring Boot Integration

Dự án này tích hợp Chatbot vào một ứng dụng Spring Boot để cung cấp khả năng tương tác chat thông minh.

## Cài Đặt

Hướng dẫn người dùng cách cài đặt và chạy dự án trên máy tính cá nhân của họ. 

```bash
git clone https://github.com/yourusername/chatgpt-spring-boot.git
cd chatgpt-spring-boot
./mvnw spring-boot:run

**Yêu Cầu Hệ Thống**

Java JDK 11 trở lên
Maven (được tích hợp trong wrapper mvnw/mvnw.cmd)
Spring Boot 2.x
Cách Sử Dụng
Sau khi chạy ứng dụng, gửi các yêu cầu POST đến endpoint /api/chat với payload chứa trường query để nhận câu trả lời từ bot.

Cấu Hình
Cập nhật các giá trị trong src/main/resources/application.properties để phù hợp với thông tin API và cấu hình cá nhân của bạn:
properties
api.url=your_api_url
api.access_token=your_access_token
api.bot_id=your_bot_id
api.user_id=your_user_id

Thư Viện Sử Dụng
Spring Boot Starter Web
Jackson Databind
Spring Boot Starter Test

API Tham Chiếu
Tham chiếu đến tài liệu API chính thức của ChatGPT (hoặc API bạn sử dụng) để biết thêm thông tin chi tiết về các tham số và cách hoạt động của API.

Hỗ Trợ
Nếu bạn gặp vấn đề, vui lòng mở một issue trên GitHub hoặc liên hệ với tôi qua email tại luuquan232003@gmail.com.

Đóng Góp
Nếu bạn có ý tưởng hoặc muốn cải thiện dự án này, xin đừng ngần ngại mở một pull request hoặc gửi các đề xuất qua issues.

Bản Quyền và Giấy Phép
Dự án này được phân phối dưới Giấy Phép MIT. Xem file LICENSE để biết thêm thông tin chi tiết.

Tác Giả
Trương Lưu Quân - quan2003
