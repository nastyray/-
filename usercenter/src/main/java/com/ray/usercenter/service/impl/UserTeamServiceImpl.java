package com.ray.usercenter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ray.usercenter.model.domain.UserTeam;
import com.ray.usercenter.service.UserTeamService;
import com.ray.usercenter.mapper.UserTeamMapper;
import org.springframework.stereotype.Service;

/**
* @author lil ray
* @description 针对表【user_team(用户队伍关系)】的数据库操作Service实现
* @createDate 2023-11-10 15:32:07
*/
@Service
public class UserTeamServiceImpl extends ServiceImpl<UserTeamMapper, UserTeam>
    implements UserTeamService{

}




