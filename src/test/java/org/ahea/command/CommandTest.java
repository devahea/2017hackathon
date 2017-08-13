package org.ahea.command;

import org.ahea.build.entity.FieldCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommandTest {


    Command command = new Command();

    @Test
    public void input() throws Exception {

        Map frontRequestMap = new HashMap();

        List<FieldCategory> fieldCategoryList = new ArrayList<>();
        fieldCategoryList.add(new FieldCategory("name", "name", null, "Repo_1", null));

        frontRequestMap.put("fieldCategoryList", fieldCategoryList);
        frontRequestMap.put("dataLength", 5);


    }

    @Test
    public void buildDummy() throws Exception {

        List<FieldCategory> fieldCategoryList = new ArrayList<>();
        fieldCategoryList.add(new FieldCategory("name", "name", null, "Repo_1", null));

        command.buildDummy(fieldCategoryList, 5);

    }

    @Test
    public void exportDummy() throws Exception {

    }

}