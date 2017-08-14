package org.ahea.api;

import org.ahea.Constant.Constant;
import org.ahea.build.entity.FieldCategory;
import org.ahea.command.Command;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mio on 2017. 8. 14..
 */
@RestController
public class DummyApiController {
    @RequestMapping(value = Constant.URI_SEARCH_DUMMY_API)
    public String search(@Valid List<FieldCategory> fieldCategoryList, Integer dataLength, Map option){
        Map params = new HashMap();
        Command command = new Command();
        params.put(Constant.KEY_FIELD_CATEGORY_LIST, fieldCategoryList);
        params.put(Constant.KEY_DATA_LENGHT, dataLength);
        params.put(Constant.KEY_OPTION, option);
        return command.input(params);
    }
}
