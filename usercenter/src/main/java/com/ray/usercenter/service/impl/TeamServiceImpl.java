package com.ray.usercenter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ray.usercenter.model.domain.Team;
import com.ray.usercenter.service.TeamService;
import com.ray.usercenter.mapper.TeamMapper;
import org.springframework.stereotype.Service;

/**
* @author lil ray
* @description 针对表【team(队伍)】的数据库操作Service实现
* @createDate 2023-11-10 15:29:41
*/
@Service
public class TeamServiceImpl extends ServiceImpl<TeamMapper, Team>
    implements TeamService{

}




