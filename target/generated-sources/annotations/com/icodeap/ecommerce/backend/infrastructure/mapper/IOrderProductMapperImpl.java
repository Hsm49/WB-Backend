package com.icodeap.ecommerce.backend.infrastructure.mapper;

import com.icodeap.ecommerce.backend.domain.model.OrderProduct;
import com.icodeap.ecommerce.backend.infrastructure.entity.OrderProductEntity;
import java.util.ArrayList;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-30T15:48:59-0600",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.11 (Oracle Corporation)"
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
