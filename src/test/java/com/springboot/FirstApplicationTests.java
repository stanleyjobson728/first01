package com.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FirstApplicationTests {

    private MockMvc mvc;

    @Test
    public void contextLoads() {
    }



    @Test
    public void getHello() throws Exception {
//        mvc.perform(MockMvcRequestBuilders.post("/user/findall").accept(MediaType.APPLICATION_JSON))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andDo(MockMvcResultHandlers.print())
//                .andReturn();
    }
}
