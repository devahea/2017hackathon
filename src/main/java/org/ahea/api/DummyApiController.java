package org.ahea.api;

import lombok.extern.apachecommons.CommonsLog;
import org.ahea.constant.Constant;
import org.ahea.build.service.CategoryType;
import org.ahea.command.Command;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mio on 2017. 8. 14..
 */
@RestController
@CommonsLog
public class DummyApiController {

    @RequestMapping(value = Constant.URI_SEARCH_DUMMY_API)
    public String search(@RequestBody DummyApiRequestVO requestVO){
        Map params = new HashMap();
        Command command = new Command();
        params.put(Constant.KEY_FIELD_CATEGORY_LIST, requestVO.getFieldCategoryList());
        params.put(Constant.KEY_DATA_LENGHT, requestVO.getDataLength());
        params.put(Constant.KEY_OPTION, requestVO.getOption());
        return command.input(params);
    }
    @RequestMapping(value = Constant.URI_CATEGORY_TYPE_API)
    public String getCategoryType(){
        List<Enum> categoryType = new ArrayList<>();
        categoryType.add(CategoryType.Date);
        categoryType.add(CategoryType.Random);
        categoryType.add(CategoryType.Repo);
        return categoryType.toString();
    }
}
