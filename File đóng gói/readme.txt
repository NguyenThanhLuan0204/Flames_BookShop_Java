1.	GIỚI THIỆU ỨNG DỤNG
Để phù với yêu cầu thực tế, phần mềm tạo ra phải thân thiện và dễ sử dụng với mọi đối tượng người dùng thì việc tìm hiểu và phân tích các yêu cầu đề ra về mặt nghiệp vụ là rất cần thiết đối với một phần mềm.
Vấn đề đặt ra là xây dựng phần mềm quản lý Nhà sách. Phần mềm sẽ phải sử dụng tài khoản và mật khẩu của nhân viên và chủ cửa hàng riêng để đảm bảo tính bảo mật hệ thống quản lý Nhà Sách tránh việc truy cập trái phép.
Do việc quản lý cơ sở dữ liệu còn thô sơ và thủ công gây mất thời gian và hiệu quả công việc không cao.
Từ nhu cầu đó Phần mềm quản lý Nhà Sách do nhóm lập trình đã ra đời với mong muốn phần mềm sẽ giúp việc quản lý Nhà Sách trở nên dễ dàng và hiệu quả hơn.
Phần mềm bao gồm các chức năng cơ bản như: thêm, xóa, sửa, tìm kiếm các đối tượng. Ngoài ra, kèm theo các chức năng nâng cao hơn như: xuất hóa đơn, thống kê. Điều đó, giúp cho việc quản lý và nhìn nhận tổng thể về quy trình làm việc và hiệu quả của cửa hàng một cách tiện lợi, nhanh chóng và xác suất chính xác cao hơn.
Phầm mềm lưu trữ dữ liệu bằng Hệ quản trị cơ sỡ dữ liệu SQL Server.

 
2.	CẤU HÌNH PHẦN CỨNG - PHẦN MỀM
2.1	Phần cứng:
CPU: Intel Core i3, 2.3GHz
RAM: 4 GB
HDD: 360 GB
Architecture: 64 bit
2.2	Phần mềm: 
Hệ quản trị cơ sở dữ liệu: MS SQL Server 2012 R2 trở lên
Hệ điều hành: MS Windows 10 64bit, MacOS
Môi trường chạy: Java (JDK 14.0 trở lên)
Các thư viện hỗ trợ: sqljdbc42, jcalendar-1.4, jcommon-1.0.23, jfreechart-1.0.19, jTatoo-1-6.13,datetimepicker-1.3.1





 
3.	CÁC CHỨC NĂNG CHÍNH
3.1	Chức năng của Nhân viên:
3.1.1	Đăng nhập
Người dùng khi mở ứng dụng sẽ xuất hiện giao diện đăng nhập, người dùng cần nhập thông tin tài khoản: tên tài khoản, mật khẩu. Nhấn nút Đăng nhập để thực hiện đăng nhập
+ Đăng nhập thành công thì sẽ được vào giao diện chính
+ Sai thông tin đăng nhập sẽ có thông báo thông tin đăng nhập lỗi
+ Nếu quên mật khẩu thì người dùng có thể điền địa chỉ Email để thực hiện đặt lại mật khẩu
3.1.2	Đăng Xuất
Người dùng nhấn nút đăng xuất trên giao diện làm việc, có thông báo xác nhận đăng xuất:
+ Chọn Yes để xác nhận đăng xuất, sau khi đăng xuất sẽ được đưa về màn hình đăng nhập
+ Chọn No để thoát đăng xuất
3.1.3	Đổi mật khẩu
Người dùng chọn vào nút Đổi mật khẩu trên giao diện làm việc, sau đó nhập đúng thông tin tài khoản: Tài khoản, mật khẩu cũ, mật khẩu mới.
Nhấn nút Lưu thay đổi để xác nhận đổi mật khẩu:
+ Nếu đúng thông tin, sẽ có thông báo đúng mật khẩu
+ Nếu sai Thông tin sẽ có hiển thị thông báo
3.1.4	Quản lý sản phẩm 
- Ở màn hình quản lí sản phẩm, hệ thống sẽ có 2 tab sách và dụng cụ học tập
+ Với sách sẽ hiển thị tất cả các loại sách, nhân viên có thể tìm sách theo thể loại, tên sách, tác giả, nhà xuất bản, ... và cũng có thể sắp xếp sách theo giá thấp nhất cao nhất hoặc sắp xếp theo số lượng tồn, lọc theo tình trạng của sản phẩm
+ Với dụng cụ học tập sẽ hiển thị tất cả các loại dụng cụ học tập, nhân viên có thể tìm dụng cụ học tập theo thể loại, tên, ... và cũng có thể sắp xếp dụng cụ học tập theo giá thấp nhất cao nhất hoặc sắp xếp theo số lượng tồn, lọc theo tình trạng của sản phẩm
- Khi nhân viên chọn chức năng ngừng kinh doanh thì sản phẩm sẽ hiện thông báo ngưng kinh doanh và không thể sửa được sản phẩm
- Khi nhân viên chọn chức năng Thêm sản phẩm hệ thống sẽ mở form thêm như bên dưới
	+ Mã sách sẽ tự động, nhân viên nhập theo các trường như ảnh. Với đơn giá, năm xuất bản, số trang số lượng tồn cần phải nhập kiểu số. 
	+ Nút Làm mới sẽ xóa hết các trường đã nhập
	+ Nút Lưu thực hiện lưu sản phẩm xuống database và hiển thị sản phẩm vừa thêm trên màn hình
- Khi nhân viên chọn chức năng Nhập excel hệ thống sẽ mở form và chọn đường dẫn tới file excel cần nhập vào, hệ thống sẽ nhập sách từ file excel vào hệ thống và hiển thị trên giao diện những cuốn sách vừa thêm
- Khi nhân viên chọn chức năng Sửa  hệ thống sẽ mở form và hiện thông tin như bên dưới, nhập giá trị cần sửa và chọn Lưu, sản phẩm sẽ được cập nhật lại vào hệ thống




 
H7.12: Giao diện sửa thông tin sách
3.1.5	Quản lý hoá đơn
3.1.5.1 Lập hóa đơn
- Để sử dụng được chức năng Lập hóa đơn thì người dùng phải đăng nhập thành công vào hệ thống, chọn chức năng Quản Lý Hóa Đơn và chọn tab Hóa đơn
-Người dùng nhập số điện thoại ở phần thông tin khách hàng, nếu số điện thoại của khách hàng đã tồn tại trong danh sách khách hàng ở cơ sở dữ liệu thì các thông tin như: mã khách hàng, tên khách hàng, địa chỉ sẽ được hiển thị lên phần thông tin khách hàng. Ngược lại, nếu khách hàng không có trong cơ sở dữ liệu hay nói cách khác khách hàng chưa từng mua tại cửa hang thì các thông tin đó sẽ không được hiển thị lên phần thông tin khách hàng.
- Sau đó, người dùng nhập mã sản phẩm ở Jtextfield mã sản phẩm trong phần Thông tin sản phẩm. Nếu mã sản phẩm hợp lệ thì các thông tin như: tác giả, thương hiệu, tên sản phẩm, năm xuất sẽ hiển thị lên phần thông tin sản phẩm. Tiếp tục người dùng nhập số lượng khách mua ở Jtextfield số lượng và người dùng nhấn nút Thêm sản phẩm, nếu số lượng hợp lệ thì sản phẩm đó sẽ được lưu vào danh sách mua hàng đồng thời hiển thị lên bảng Danh sách sản phẩm bán.
-Nút Thêm sản phẩm thực hiện them sản phẩm vào bảng Danh sách sản phẩm bán. Nếu thông tin sản phẩm, số lượng đã có đây đủ thì sẽ them vào bảng Danh sách sản phẩm bán. Ngược lại thông báo “Số lượng phải lớn hơn hoặc bằng 1” hoặc thông báo “Không tìm thấy sản phẩm”.
- Nút Xóa Trắng dùng để xóa trỗng các thông tin phần  Thông tin sản phẩm.
- Nút Xóa SP CTHD Thực hiện xóa sản phẩm ra khỏi bảng Danh sách sản phẩm bán. Nếu chưa chọn sản phẩm thì thông báo “Vui lòng chọn sản phẩm để xóa”. Ngược lại, xóa sản phẩm ra khỏi bảng Danh sách sản phẩm và xóa ra khỏi danh sách mua hàng.
- Nút Thanh Toán thực hiển mở cửa sổ thanh toán. Nếu chưa có thông tin khách hàng thì sẽ thông báo “Chưa có khách hàng!”, nếu bảng Danh sách sản phẩm bán rỗng sẽ thông báo “Chưa có sản phẩm”. Ngược lại mở cửa sổ thanh toán.
3.1.5.2 Danh sách hóa đơn
- Để sử dụng được chức năng này thì người dùng phải đăng nhập thành công vào hệ thống và chọn chức năng Quản Lý Hóa Đơn, sau đó chọn tab Danh sách hóa đơn.
- Người dùng có thể tìm kiếm hóa đơn bằng cách nhập mã hóa đơn hoặc số điện thoại hoặc chọn ngày lập hóa đơn tại phần Thông tin tìm kiếm. Người dùng chỉ có thể tìm kiếm Hóa đơn do mình lập.
- Người dùng chọn bất kỳ hóa đơn trên bảng Thông tin hóa đơn, giao diện sẽ hiển thị danh sách chi tiết hóa đơn tưởng ứng tại bảng Thông tin chi tiết hóa đơn.
- Nút Làm mới thực hiện tải lại trang, tải lại hóa đơn mới nhất được lập, đồng thời ngày lập hóa đơn được chọn là ngày hiện tại.
- Nút Xuất Hóa Đơn thực hiện chức năng xuất lại hóa đơn bất kỳ trước đó. Nếu bảng Thông tin hóa đơn chưa được chọn sẽ thông báo “Vui lòng chọn hóa đơn cần xuất”. Ngược lại, sẽ mở cửa sổ xuất hóa đơn.
3.1.6	Quản lý khách hàng
Người dùng sau khi đăng nhập thành công thì chọn vào ô “Quản lý khách hàng”  ở thanh điểu khiển để tiến hành thao tác cần thiết với đối tượng là Khách hàng
a.	Tìm kiếm
Người dùng nhập mã khách hàng hoặc số điện thoại của khách hàng tại ô tìm kiếm, kết quả sẽ được trả về ở bảng bên dưới
b.	Sửa thông tin
Bước 1: Người dùng chọn khách hàng để chỉnh sửa thông tin (có thể dùng kết quả của tìm kiếm trước đó, khách hàng được chọn sẽ được hiển thị màu khác với các khách hàng còn lại trên Danh sách Khách hàng)
Bước 2: Chọn nút sửa thông tin
Bước 3: Thực hiện chỉnh sửa thông tin trong giao diện Cập nhật Khách hàng
Bước 4: Nhấn nút cập nhật 
+ Nếu có lỗi, vui lòng kiểm tra lại thông tin đã nhập
Bước 5: Trên giao diện thông báo Xác nhận cập nhật
+ Chọn Yes để xác nhận cập nhật
+Chọn No để huỷ xác nhận cập nhật
Bước 6: nhấn nút làm mới để cập nhật lại thông tin trên giao diện
c.	Thêm khách hàng
Bước 1: Chọn nút Thêm khách hàng
Bước 2: Điền thông tin khách hàng và chọn nút thêm khách hàng
Bước 3: 
+ Nếu có lỗi sẽ có thông báo hiển thị thông tin lỗi, vui lòng kiểm tra lại thông tin đã nhập theo thông báo lỗi
+Nếu thêm thành công, nhấn nút Ok để hoàn thành
Bước 4: nhấn nút làm mới để cập nhật lại thông tin trên giao diện
3.1.7	Quản lý thống kê
-	Ở màn hình Quản lí thống kê, nhân viên và quản lí sẽ có mỗi chức năng khác nhau
+ Với quản lí, quản lí thống kê top những sản phẩm bán chạy nhất và top những nhân viên có doanh thu cao nhất trong ngày hoặc thống kê theo quý của một năm. Ngoài ra còn các thông tin khác như :Tổng số lượng hóa đơn đã xuất của cửa hàng, tổng doanh thu của cửa hàng, số lượng sản phẩm chưa được bán và số lượng sản phẩm đã bán của cửa hàng
+ Với nhân viên, nhân viên thống kê top những sản phẩm bán chạy nhất và top hóa đơn có doanh thu cao nhất, và một số thông tin thống kê giúp nhân viên nắm được tình hình làm việc như : Tổng số hóa đơn đã xuất của nhân viên, tổng doanh thu, số lượng sản phẩm chưa bán, số lượng sản phẩm đã bán của nhân viên đó.
-	Có 2 phương thức thống kê là thống kê theo quý hoặc thống kê theo khoảng thời gian xác định :
o	Khi chọn thống kê theo quý, hệ thống sẽ hiện ra tổng doanh thu của quý đó, tổng số lượng sản phẩm đã bán trong quý đó và sẽ hiện top những tên sách đã bán nhiều
o	Để sử dụng thống kê theo quý người dùng cần chọn năm của quý cần thống kê ở ô ”Chọn năm” rồi chọn quý cần thống kê,khi ấn nút ”Thống kê quý ... ” sẽ hiển thị các thông tin thống kê của quý đã chọn.
o	Khi chọn thống kê từ ngày này đén ngày khác, hệ thống sẽ hiện ra tổng doanh thu, tổng số lượng sản phẩm đã bán trong khoảng thời gian đó và sẽ hiện top những tên sách đã bán nhiều trong thời gian đó
o	Để sử dụng thống kê theo khoảng thời gian xác định đầu tiên người dùng chọn nút   của ô ”từ ngày” để chọn ngày bắt đầu và tương tự chọn ngày kết thúc. Khi đã xác định được ngày bắt đầu và kết thúc của thống kê, người dùng ấn nút ”Thống Kê”. Thông tin về thống kê của khoảng thời gian đã chọn sẽ hiển thị trên màn hình.
-	Khi chọn xuất báo cáo, hệ thống sẽ xuất báo cáo thống kê ra file excel
3.1.8	Trợ giúp (Help)
Khi người dùng cần đọc tài liệu hướng dẫn sử dụng tính năng trên phần mềm, người dùng nhấn vào ô Help trên giao diện làm việc, giao diện trợ giúp sẽ hiển thị với các mục hướng dẫn sử dụng tương ứng với chức năng trên phần mềm
3.2	Chức năng của Quản Lý:
3.2.1	Quản lý nhân viên
Người dùng sau khi đăng nhập thành công thì chọn vào ô “Quản lý khách hàng”  ở thanh điểu khiển để tiến hành thao tác cần thiết với đối tượng là Khách hàng
a.	Tìm nhân viên, Lọc theo giới tính
-	Tìm nhân viên: Người dùng nhập mã Nhân viên hoặc số điện thoại của Nhân viên tại ô tìm kiếm, kết quả sẽ được trả về ở bảng bên dưới
-	Lọc theo giới tính: người dùng chọn vào biểu tượng lựa chọn ở mục lọc, chọn giới tính để lọc và hệ thống sẽ xuất ra danh sách nhân viên theo giới tính
b.	Sửa thông tin
Bước 1: Người dùng chọn Nhân viên để chỉnh sửa thông tin (có thể dùng kết quả của tìm kiếm trước đó, Nhân viên được chọn sẽ được hiển thị màu khác với các Nhân viên còn lại trên Danh sách Nhân viên)
Bước 2: Chọn nút sửa thông tin
Bước 3: Thực hiện chỉnh sửa thông tin trong giao diện Cập nhật Nhân viên
Bước 4: Nhấn nút cập nhật 
+ Nếu có lỗi, vui lòng kiểm tra lại thông tin đã nhập
Bước 5: Trên giao diện thông báo Xác nhận cập nhật
+ Chọn Yes để xác nhận cập nhật
+Chọn No để huỷ xác nhận cập nhật
Bước 6: nhấn nút làm mới để cập nhật lại thông tin trên giao diện
c.	Thêm Nhân viên
Bước 1: Chọn nút Thêm Nhân viên
Bước 2: Điền thông tin Nhân viên và chọn nút thêm Nhân viên
Bước 3: 
+ Nếu có lỗi sẽ có thông báo hiển thị thông tin lỗi, vui lòng kiểm tra lại thông tin đã nhập theo thông báo lỗi
+Nếu thêm thành công, nhấn nút Ok để hoàn thành
Bước 4: nhấn nút làm mới để cập nhật lại thông tin trên giao diện
 
H7.43: thông báo lỗi
3.2.2	Quản Lý Tài khoản
- Để sử dụng được chức năng này thì chỉ có chủ cửa hàng mới được quyền sử dụng chức năng này
- Chức năng “Tạo Tài Khoản” thì chủ cửa hàng cần phải nhập mã nhân viên cần tạo tài khoản. Nếu mã nhân viên đó không tồn tại thì hệ thống sẽ thông báo lỗi, ngược lại sẽ tạo tài khoản thành công cho nhân viên
- Chức năng Đặt lại mật khẩu thực hiện đặt lại mật khẩu về dạng mặt định 123456. Nếu chưa chọn tài khoản sẽ thông báo “Vui lòng chọn tài khoản”. Ngược lại thông báo đặt lại mật khẩu thành công.
- Chức năng Làm mới thực hiện làm mới lại table quản lí tài khoản


