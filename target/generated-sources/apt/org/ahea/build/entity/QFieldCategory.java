package org.ahea.build.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QFieldCategory is a Querydsl query type for FieldCategory
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFieldCategory extends EntityPathBase<FieldCategory> {

    private static final long serialVersionUID = -624436370L;

    public static final QFieldCategory fieldCategory = new QFieldCategory("fieldCategory");

    public final StringPath description = createString("description");

    public final StringPath id = createString("id");

    public final StringPath name = createString("name");

    public final StringPath regularExpression = createString("regularExpression");

    public final StringPath type = createString("type");

    public QFieldCategory(String variable) {
        super(FieldCategory.class, forVariable(variable));
    }

    public QFieldCategory(Path<? extends FieldCategory> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFieldCategory(PathMetadata metadata) {
        super(FieldCategory.class, metadata);
    }

}

