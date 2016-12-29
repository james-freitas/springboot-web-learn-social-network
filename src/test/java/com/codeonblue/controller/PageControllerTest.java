package com.codeonblue.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(SpringRunner.class)
@WebMvcTest(PageController.class)
public class PageControllerTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MockMvc mvc;

    @Test
    public void testShouldFowardToIndexPageWhenAccessingRoot() throws Exception {
        mvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"));
    }

    @Test
    public void testShouldForwardToAboutPageWhenAccessingAboutMapping() throws Exception {
        mvc.perform(get("/about"))
                .andExpect(status().isOk())
                .andExpect(view().name("about"));
    }
}
