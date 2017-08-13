package org.ahea.build.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QFieldData is a Querydsl query type for FieldData
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFieldData extends EntityPathBase<FieldData> {

    private static final long serialVersionUID = 1285867034L;

    public static final QFieldData fieldData = new QFieldData("fieldData");

    public final StringPath data = createString("data");

    public final StringPath fieldCategoryId = createString("fieldCategoryId");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QFieldData(String variable) {
        super(FieldData.class, forVariable(variable));
    }

    public QFieldData(Path<? extends FieldData> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFieldData(PathMetadata metadata) {
        super(FieldData.class, metadata);
    }

}

