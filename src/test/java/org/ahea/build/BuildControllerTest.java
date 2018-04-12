package org.ahea.build;

import lombok.extern.apachecommons.CommonsLog;
import org.ahea.BootTest;
import org.ahea.build.entity.FieldCategory;
import org.ahea.build.inter.BuildController;
import org.ahea.build.service.CategoryType;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

@CommonsLog
public class BuildControllerTest extends BootTest{

    @Test
    public void BuildControllerTest(){

        List<FieldCategory> fieldCategoryList = new ArrayList<FieldCategory>();

        FieldCategory fieldCategory1 = new FieldCategory(
                "핸드폰번호",
                "핸드폰 입니다",
                "(01[01]{1})-([0-9]{4})-([0-9]{4})",
                CategoryType.Random,
                "",
                null
        );

        List<String> conditions = new ArrayList<String>();
        conditions.add("남자");
        conditions.add("여자");
        conditions.add("남성");
        conditions.add("여성");
        FieldCategory fieldCategory2 = new FieldCategory(
                "성별",
                "성별 입니다",
                "",
                CategoryType.Select,
                "string",
                conditions
        );

        FieldCategory fieldCategory3 = new FieldCategory(
                "날짜",
                "날짜 입니다",
                "yyyy-MM-dd HH:mm:ss",
                CategoryType.Date,
                "string",
                null
        );
        List<String> conditions2 = new ArrayList<String>();
        conditions2.add(">,5");
        conditions2.add("<,9");

        FieldCategory fieldCategory4 = new FieldCategory(
                "숫자",
                "숫자 입니다",
                "[0-9]{1}",
                CategoryType.Random,
                "",
                conditions2
        );

        List<String> conditions3 = new ArrayList<String>();
        conditions3.add("first,김");

        FieldCategory fieldCategory5 = new FieldCategory(
                "이름",
                "이름 입니다",
                "",
                CategoryType.Repo,
                "1",
                conditions3
        );

        fieldCategoryList.add(fieldCategory5);
        fieldCategoryList.add(fieldCategory2);
        fieldCategoryList.add(fieldCategory3);
        fieldCategoryList.add(fieldCategory4);

        BuildController contorller = new BuildController();
        //log.info(contorller.build(fieldCategoryList, 100) + "");
    }
}
