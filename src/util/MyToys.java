/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author ACER
 */
public class MyToys {
    // bộ thư viện các hàm xài chung, cho nên chúng là static
    
    //cF: compute factorial, tính n giai thừa n! = 1.2.3....n
    //0! = 1
    //n! tăng nhanh lắm, cho nên để long đỡ
    public static long cF(int n){
        if(n < 0 || n > 15)
            throw new IllegalArgumentException("Sorry, n must be >= 0");
        if(n == 0)
            return 1;
        //phần còn lại là hợp lệ, tính bình thường
        long product = 1;
        for(int i = 1; i <= n; i++)
            product *= i;
        return product;
    }
}
//mọi đoạn code bạn viết ra, phải cố gắng đảm bảo rằng nó có chất lượng
//chất lượng nghĩa là: hàm trả về, xử lý đúng như mình dự kiến, kì vọng
//expected
//ví dụ tính giai thừa() thì ta đưa vào 5, hi vọng nhận về 120
//vậy ta phải chuẩn bị bộ dữ liệu để test từng hàm, đảm bảo nó xử lý đúng
//từng hàm xử lý đúng, class xử lý đúng
//việc đảm bảo cho từng class/module/từng đơn thể/từng hàm chạy như dự kiến
//->DEV CÓ TRÁCH NHIỆM VỤ NÀY, VIỆC NÀY SONG SONG VIẾT CODE
//QUÁ TRÌNH NÀY GỌI LÀ UNIT TESTING
//làm sao test hàm(), chạy đúng ko
//ch bị data -> đưa data -> gọi hàm -> nhìn kết quả -> so với dự kiến
//nhìn kết quả: mắt(nhìn con số trả ra, so với con số mong đợi)
//              nhìn bằng màu, số trả ra khớp với số mong đợi -> XANH
//                                      KO KHỚP               -> ĐỎ
//mắt -> sout, JOptionPane, POPUP, LOG, xem luận anh hùng, luận kết quả
//màu -> JUnit, TestNG, xUnit, NUnit, CPPUnit, PHPUnit,...
//      bộ thư viện, .dll, .jar, giúp chúng ta luận theo màu