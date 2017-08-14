package org.ahea.service;

import lombok.extern.slf4j.Slf4j;
import org.ahea.build.entity.FieldCategory;
import org.ahea.build.service.CategoryType;
import org.ahea.build.service.RepoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class RepoServiceTest {

    @Autowired
    RepoService repoService;

    @Test
    public void repoServiceTest(){
        List<String> conditions3 = new ArrayList<String>();
        conditions3.add("first,김");
        FieldCategory fieldCategory = new FieldCategory(
                "이름",
                "이름 입니다",
                "",
                CategoryType.Repo,
                "1",
                conditions3
        );
        log.info("result : " + repoService.genetateData(fieldCategory));
    }
}
