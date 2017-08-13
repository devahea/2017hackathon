package org.ahea.build;

import lombok.extern.apachecommons.CommonsLog;
import org.ahea.build.entity.FieldCategory;
import org.ahea.build.inter.BuildController;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

@CommonsLog
public class BuildControllerTest {

    @Test
    public void BuildControllerTest(){

        List<FieldCategory> fieldCategoryList = new ArrayList<FieldCategory>();

//        String fieldName
//        String description
//        String regularExpression
//        String categoryType
//        String dataType
//        List<String> conditions
        FieldCategory fieldCategory1 = new FieldCategory(
                "핸드폰번호",
                "핸드폰 입니다",
                "(01[01]{1})-([0-9]{4})-([0-9]{4})",
                "random",
                "string",
                null
        );

        List<String> conditions = new ArrayList<String>();
        conditions.add("남자");
        conditions.add("여자");
        conditions.add("남성");
        conditions.add("여성");
        conditions.add("1");
        conditions.add("2");
        conditions.add("3");
        FieldCategory fieldCategory2 = new FieldCategory(
                "성별",
                "성별 입니다",
                "",
                "select",
                "string",
                conditions
        );

        FieldCategory fieldCategory3 = new FieldCategory(
                "날짜",
                "날짜 입니다",
                "yyyy-MM-dd HH:mm:ss",
                "date",
                "string",
                conditions
        );

        fieldCategoryList.add(fieldCategory1);
        fieldCategoryList.add(fieldCategory2);
        fieldCategoryList.add(fieldCategory3);

        BuildController contorller = new BuildController();
        log.debug(contorller.build(fieldCategoryList, 100));
    }
}
