package org.ahea.command;

import lombok.extern.apachecommons.CommonsLog;
import org.ahea.BootTest;
import org.ahea.build.entity.FieldCategory;
import org.ahea.build.inter.BuildInterface;
import org.ahea.build.service.CategoryType;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

@CommonsLog
public class CommandTest extends BootTest{


    Command command = new Command();

    @Test
    public void input() throws Exception {

        Map frontRequestMap = new HashMap();

        List<FieldCategory> fieldCategoryList = new ArrayList<>();
        fieldCategoryList.add(new FieldCategory("name", "name", null, CategoryType.Random,"String", null));

        frontRequestMap.put("fieldCategoryList", fieldCategoryList);
        frontRequestMap.put("dataLength", 5);
        String result = command.input(frontRequestMap);
        log.debug(result);
    }

    @Test
    public void buildDummy() throws Exception {

        List<FieldCategory> fieldCategoryList = new ArrayList<>();
        fieldCategoryList.add(new FieldCategory("name", "name", null, CategoryType.Random,"String", null));

        command.buildDummy(fieldCategoryList, 5);

    }

    @Test
    @Ignore
    public void exportDummy() throws Exception {
        fail("Not yet implemented");
    }

}