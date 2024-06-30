package com.icodeap.ecommerce.backend.infrastructure.mapper;

import com.icodeap.ecommerce.backend.domain.model.Product;
import com.icodeap.ecommerce.backend.infrastructure.entity.CategoryEntity;
import com.icodeap.ecommerce.backend.infrastructure.entity.ProductEntity;
import com.icodeap.ecommerce.backend.infrastructure.entity.UserEntity;
import java.util.ArrayList;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-30T15:48:57-0600",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.11 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product toProduct(ProductEntity productEntity) {
        if ( productEntity == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( productEntity.getId() );
        product.setName( productEntity.getName() );
        product.setCode( productEntity.getCode() );
        product.setDescription( productEntity.getDescription() );
        product.setUrlImage( productEntity.getUrlImage() );
        product.setPrice( productEntity.getPrice() );
        product.setDateCreated( productEntity.getDateCreated() );
        product.setDateUpdated( productEntity.getDateUpdated() );
        product.setUserId( productEntityUserEntityId( productEntity ) );
        product.setCategoryId( productEntityCategoryEntityId( productEntity ) );

        return product;
    }

    @Override
    public Iterable<Product> toProductList(Iterable<ProductEntity> productEntities) {
        if ( productEntities == null ) {
            return null;
        }

        ArrayList<Product> iterable = new ArrayList<Product>();
        for ( ProductEntity productEntity : productEntities ) {
            iterable.add( toProduct( productEntity ) );
        }

        return iterable;
    }

    @Override
    public ProductEntity toProductEntity(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductEntity productEntity = new ProductEntity();

        productEntity.setUserEntity( productToUserEntity( product ) );
        productEntity.setCategoryEntity( productToCategoryEntity( product ) );
        productEntity.setId( product.getId() );
        productEntity.setName( product.getName() );
        productEntity.setCode( product.getCode() );
        productEntity.setDescription( product.getDescription() );
        productEntity.setUrlImage( product.getUrlImage() );
        productEntity.setPrice( product.getPrice() );
        productEntity.setDateCreated( product.getDateCreated() );
        productEntity.setDateUpdated( product.getDateUpdated() );

        return productEntity;
    }

    private Integer productEntityUserEntityId(ProductEntity productEntity) {
        if ( productEntity == null ) {
            return null;
        }
        UserEntity userEntity = productEntity.getUserEntity();
        if ( userEntity == null ) {
            return null;
        }
        Integer id = userEntity.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Integer productEntityCategoryEntityId(ProductEntity productEntity) {
        if ( productEntity == null ) {
            return null;
        }
        CategoryEntity categoryEntity = productEntity.getCategoryEntity();
        if ( categoryEntity == null ) {
            return null;
        }
        Integer id = categoryEntity.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected UserEntity productToUserEntity(Product product) {
        if ( product == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setId( product.getUserId() );

        return userEntity;
    }

    protected CategoryEntity productToCategoryEntity(Product product) {
        if ( product == null ) {
            return null;
        }

        CategoryEntity categoryEntity = new CategoryEntity();

        categoryEntity.setId( product.getCategoryId() );

        return categoryEntity;
    }
}
