package com.icodeap.ecommerce.backend.infrastructure.mapper;

import com.icodeap.ecommerce.backend.domain.model.User;
import com.icodeap.ecommerce.backend.infrastructure.entity.UserEntity;
import java.util.ArrayList;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-30T01:34:54-0600",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.11 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toUser(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        User user = new User();

        user.setId( userEntity.getId() );
        user.setUsername( userEntity.getUsername() );
        user.setLastName( userEntity.getLastName() );
        user.setEmail( userEntity.getEmail() );
        user.setAddress( userEntity.getAddress() );
        user.setCellphone( userEntity.getCellphone() );
        user.setPassword( userEntity.getPassword() );
        user.setUserType( userEntity.getUserType() );
        user.setDateCreated( userEntity.getDateCreated() );
        user.setDateUpdated( userEntity.getDateUpdated() );
        user.setFirstName( userEntity.getFirstName() );

        return user;
    }

    @Override
    public Iterable<User> toUsers(Iterable<UserEntity> userEntities) {
        if ( userEntities == null ) {
            return null;
        }

        ArrayList<User> iterable = new ArrayList<User>();
        for ( UserEntity userEntity : userEntities ) {
            iterable.add( toUser( userEntity ) );
        }

        return iterable;
    }

    @Override
    public UserEntity toUserEntity(User user) {
        if ( user == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setId( user.getId() );
        userEntity.setUsername( user.getUsername() );
        userEntity.setLastName( user.getLastName() );
        userEntity.setEmail( user.getEmail() );
        userEntity.setAddress( user.getAddress() );
        userEntity.setCellphone( user.getCellphone() );
        userEntity.setPassword( user.getPassword() );
        userEntity.setUserType( user.getUserType() );
        userEntity.setDateCreated( user.getDateCreated() );
        userEntity.setDateUpdated( user.getDateUpdated() );
        userEntity.setFirstName( user.getFirstName() );

        return userEntity;
    }
}
