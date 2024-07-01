package com.icodeap.ecommerce.backend.infrastructure.mapper;

import com.icodeap.ecommerce.backend.domain.model.Order;
import com.icodeap.ecommerce.backend.domain.model.OrderProduct;
import com.icodeap.ecommerce.backend.infrastructure.entity.OrderEntity;
import com.icodeap.ecommerce.backend.infrastructure.entity.OrderProductEntity;
import com.icodeap.ecommerce.backend.infrastructure.entity.UserEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-01T15:00:11-0600",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class IOrderMapperImpl implements IOrderMapper {

    @Autowired
    private IOrderProductMapper iOrderProductMapper;

    @Override
    public Order toOrder(OrderEntity orderEntity) {
        if ( orderEntity == null ) {
            return null;
        }

        Order order = new Order();

        order.setId( orderEntity.getId() );
        order.setDateCreated( orderEntity.getDateCreated() );
        order.setOrderProducts( orderProductEntityListToOrderProductList( orderEntity.getOrderProducts() ) );
        order.setOrderState( orderEntity.getOrderState() );
        order.setUserId( orderEntityUserEntityId( orderEntity ) );

        return order;
    }

    @Override
    public Iterable<Order> toOrderList(Iterable<OrderEntity> orderEntities) {
        if ( orderEntities == null ) {
            return null;
        }

        ArrayList<Order> iterable = new ArrayList<Order>();
        for ( OrderEntity orderEntity : orderEntities ) {
            iterable.add( toOrder( orderEntity ) );
        }

        return iterable;
    }

    @Override
    public OrderEntity toOrderEntity(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderEntity orderEntity = new OrderEntity();

        orderEntity.setUserEntity( orderToUserEntity( order ) );
        orderEntity.setId( order.getId() );
        orderEntity.setDateCreated( order.getDateCreated() );
        orderEntity.setOrderProducts( orderProductListToOrderProductEntityList( order.getOrderProducts() ) );
        orderEntity.setOrderState( order.getOrderState() );

        return orderEntity;
    }

    protected List<OrderProduct> orderProductEntityListToOrderProductList(List<OrderProductEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<OrderProduct> list1 = new ArrayList<OrderProduct>( list.size() );
        for ( OrderProductEntity orderProductEntity : list ) {
            list1.add( iOrderProductMapper.toOrderProduct( orderProductEntity ) );
        }

        return list1;
    }

    private Integer orderEntityUserEntityId(OrderEntity orderEntity) {
        if ( orderEntity == null ) {
            return null;
        }
        UserEntity userEntity = orderEntity.getUserEntity();
        if ( userEntity == null ) {
            return null;
        }
        Integer id = userEntity.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected UserEntity orderToUserEntity(Order order) {
        if ( order == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setId( order.getUserId() );

        return userEntity;
    }

    protected List<OrderProductEntity> orderProductListToOrderProductEntityList(List<OrderProduct> list) {
        if ( list == null ) {
            return null;
        }

        List<OrderProductEntity> list1 = new ArrayList<OrderProductEntity>( list.size() );
        for ( OrderProduct orderProduct : list ) {
            list1.add( iOrderProductMapper.toOrderProductEntity( orderProduct ) );
        }

        return list1;
    }
}
