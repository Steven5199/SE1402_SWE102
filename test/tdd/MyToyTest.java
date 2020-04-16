/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import static util.MyToys.cF;   //lát hồi xài hàm static éo cần MyToys
                                //gọi cF() như bên C, ko chấm
                                //chỉ dùng cho static

/**
 *
 * @author ACER
 */
public class MyToyTest {
    
    public MyToyTest() {
        //test cases
        //ví dụ ta test tình huống ngon lành, nhận về ngon lành
        //ví dụ ta test cà chớn, nhận về Exception
        //đảm bảo những tình huống này chạy đúng dự kiến/mong đợi/expected
        //lúc đó NetBeans ném màu xanh khi ổn, đỏ khi có vấn đề
        
        
    }
    
    @Test
        public void testSuccessfullCases(){
            assertEquals(1, cF(0));
            assertEquals(6, cF(2));
            assertEquals(6, cF(3));
            assertEquals(24, cF(4));
            assertEquals(120, cF(5));
            assertEquals(720, cF(6));   //đỏ xảy ra đi 2 tình huống
                                        //hoặc bạn xử lí sai
                                        //hoặc bạn kì vọng sai
                                        //có đỏ, kiểm tra code đi
        }
        
        //Ngoại lệ Exection là 1 thứ ko phải value để ước lượng
        //vậy thì ko thể assert được, vì nó cần phải có value để so sánh
        //xài thêm kĩ thuật bắt ngoại lệ coi ngoại lệ xảy ra giống như mình kỳ vọng ko
        //
        
        @Test(expected = IllegalArgumentException.class)
        public void testExceptionCases(){
        //ko có value để assert do hàm cF() ném ra ngoại lệ
            cF(-5);
            cF(100);
  }
       
        //CODE KO BỊ LỖI CÚ PHÁP, THAM CHIẾU THƯ VIỆN, LUÔN CLEAN AND BUILD RA FILE RAR
        //TEST DÙNG MẮT, MÀU, CÂU CHUYỆN LOGIC TRONG CODE, CHỨ KO PHẢI LÀ CÂU CHUYỆN CỦA BUILD JAR
        //BUILD JAR, .JAVA -> .CLASS, NÉN .CLASS .CLASS -> .JAR .WAR (.RAR)
        //TIỀM ẨN RỦI RO LỚN, CODE SAI LOGIC, KO SAI CÚ PHÁP
        //NÂNG CAO, MẸ BỐ, NẾU SAI LOGIC, ĐANG MÀU ĐỎ -> KO CHO RA .JAR
        //JUNIT ĐỀU CÓ THỂ KẾT HỢP ĐƯỢC VỚI ANT ĐỂ CẤM APP KO ĐC RA ĐỜI NẾU CÒN MÀU ĐỎ
        
        
    
}
