package cn.chanze.tacos;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * 说明：测试根路径“/”发送HTTP GET请求并期望得到成功结果，视图名称为home
 * Create By Chanze on 2020/4/20.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(HomeController.class)           //针对HomeController的Web测试
public class HomeControllerTest {

    @Autowired
    private MockMvc mockMvc;            //注入MockMvc

    @Test
    public void testHomePage() throws Exception {
        mockMvc.perform(get("/"))      //发起对“/”的GET
        .andExpect(status().isOk())                 //希望得到HTTP 200
        .andExpect(view().name("home"))     //期望得到home视图
        .andExpect(content().string(
                containsString("Welcome to ...")));
    }

}
