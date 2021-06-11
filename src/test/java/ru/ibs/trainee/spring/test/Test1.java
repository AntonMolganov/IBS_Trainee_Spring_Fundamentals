package ru.ibs.trainee.spring.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.Assert;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/web-application-context.xml" })
@WebAppConfiguration
public class Test1 {

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;
    @BeforeEach
    public void setup() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
    }

    @Test
    public void test1() {
        ServletContext servletContext = webApplicationContext.getServletContext();

        Assert.notNull(servletContext, "Null context");
        Assert.isTrue(servletContext instanceof MockServletContext, "Not instance of MockServletContext");
        Assert.notNull(webApplicationContext.getBean("springRestController"), "RestController is null");
    }

    @Test
    public void test2() throws Exception {
        this.mockMvc.perform(get("/mvc/add?value=1")).andDo(print());
        this.mockMvc.perform(get("/rest/show")).andDo(print());
    }
}
