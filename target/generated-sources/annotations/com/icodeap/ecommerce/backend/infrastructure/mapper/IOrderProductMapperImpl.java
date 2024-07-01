package com.icodeap.ecommerce.backend.infrastructure.mapper;

import com.icodeap.ecommerce.backend.domain.model.OrderProduct;
import com.icodeap.ecommerce.backend.infrastructure.entity.OrderProductEntity;
import java.util.ArrayList;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-01T15:00:16-0600",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class IOrderProductMapperImpl implements IOrderProductMapper {

    @Override
    public OrderProduct toOrderProduct(OrderProductEntity orderProductEntity) {
        if ( orderProductEntity == null ) {
            return null;
        }

        OrderProduct orderProduct = new OrderProduct();

        orderProduct.setId( orderProductEntity.getId() );
        orderProduct.setQuantity( orderProductEntity.getQuantity() );
        orderProduct.setPrice( orderProductEntity.getPrice() );
        orderProduct.setProductId( orderProductEntity.getProductId() );

        return orderProduct;
    }

    @Override
    public Iterable<OrderProduct> toOrderProductList(Iterable<OrderProductEntity> orderProductEntities) {
        if ( orderProductEntities == null ) {
            return null;
        }

        ArrayList<OrderProduct> iterable = new ArrayList<OrderProduct>();
        for ( OrderProductEntity orderProductEntity : orderProductEntities ) {
            iterable.add( toOrderProduct( orderProductEntity ) );
        }

        return iterable;
    }

    @Override
    public OrderProductEntity toOrderProductEntity(OrderProduct orderProduct) {
        if ( orderProduct == null ) {
            return null;
        }

        OrderProductEntity orderProductEntity = new OrderProductEntity();

        orderProductEntity.setId( orderProduct.getId() );
        orderProductEntity.setQuantity( orderProduct.getQuantity() );
        orderProductEntity.setPrice( orderProduct.getPrice() );
        orderProductEntity.setProductId( orderProduct.getProductId() );

        return orderProductEntity;
    }
}
