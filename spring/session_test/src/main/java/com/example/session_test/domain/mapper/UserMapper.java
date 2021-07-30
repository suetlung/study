package com.example.session_test.domain.mapper;

import com.example.session_test.domain.dto.UserView;
import com.example.session_test.domain.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class UserMapper {

    public abstract UserView toUserView(User user);
    public abstract User toUser(UserView userView);
}
