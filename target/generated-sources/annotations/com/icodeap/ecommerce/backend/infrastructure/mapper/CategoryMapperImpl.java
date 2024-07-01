package com.icodeap.ecommerce.backend.infrastructure.mapper;

import com.icodeap.ecommerce.backend.domain.model.Category;
import com.icodeap.ecommerce.backend.infrastructure.entity.CategoryEntity;
import java.util.ArrayList;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-01T15:00:05-0600",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public Category toCategory(CategoryEntity categoryEntity) {
        if ( categoryEntity == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( categoryEntity.getId() );
        category.setName( categoryEntity.getName() );
        category.setDateCreated( categoryEntity.getDateCreated() );
        category.setDateUpdated( categoryEntity.getDateUpdated() );

        return category;
    }

    @Override
    public Iterable<Category> toCategoryList(Iterable<CategoryEntity> categoryEntities) {
        if ( categoryEntities == null ) {
            return null;
        }

        ArrayList<Category> iterable = new ArrayList<Category>();
        for ( CategoryEntity categoryEntity : categoryEntities ) {
            iterable.add( toCategory( categoryEntity ) );
        }

        return iterable;
    }

    @Override
    public CategoryEntity toCategoryEntity(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryEntity categoryEntity = new CategoryEntity();

        categoryEntity.setId( category.getId() );
        categoryEntity.setName( category.getName() );
        categoryEntity.setDateCreated( category.getDateCreated() );
        categoryEntity.setDateUpdated( category.getDateUpdated() );

        return categoryEntity;
    }
}
