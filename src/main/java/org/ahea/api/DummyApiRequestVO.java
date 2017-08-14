package org.ahea.api;

import lombok.Getter;
import lombok.Setter;
import org.ahea.build.entity.FieldCategory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class DummyApiRequestVO {

    private static final long serialVersionUID = -5780664251633122157L;

    List<FieldCategory> fieldCategoryList= new ArrayList<>();

    Integer dataLength;

    Map option = new HashMap();
}
