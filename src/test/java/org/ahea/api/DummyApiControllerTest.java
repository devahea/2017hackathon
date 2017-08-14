package org.ahea.api;

import lombok.extern.apachecommons.CommonsLog;
import org.ahea.build.entity.FieldCategory;
import org.ahea.build.service.CategoryType;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by mio on 2017. 8. 14..
 */
@CommonsLog
public class DummyApiControllerTest {
    @Test
    public void search() throws Exception {

        DummyApiRequestVO vo = new DummyApiRequestVO();
        List<FieldCategory> fieldCategoryList = new ArrayList<>();
        fieldCategoryList.add(new FieldCategory("name", "name", null, CategoryType.Random,"String", null));

        DummyApiController c = new DummyApiController();
        vo.setDataLength(5);
        vo.setFieldCategoryList(fieldCategoryList);
        String result = c.search(vo);
        log.debug(result);
    }

}