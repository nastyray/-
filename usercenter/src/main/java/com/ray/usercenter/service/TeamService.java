package com.ray.usercenter.service;

import com.ray.usercenter.model.domain.Team;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ray.usercenter.model.domain.User;
import com.ray.usercenter.model.dto.TeamQuery;
import com.ray.usercenter.model.request.TeamJoinRequest;
import com.ray.usercenter.model.request.TeamQuitRequest;
import com.ray.usercenter.model.request.TeamUpdateRequest;
import com.ray.usercenter.model.vo.TeamUserVO;

import java.util.List;

/**
* @author lil ray
* @description 针对表【team(队伍)】的数据库操作Service
* @createDate 2023-11-10 15:29:41
*/
public interface TeamService extends IService<Team> {


    /**
     * 创建队伍
     * @param team
     * @param loginUser
     * @return
     */
    long addTeam(Team team, User loginUser);

    /**
     * 搜索队伍
     * @param teamQuery
     * @param
     * @return
     */
    List<TeamUserVO> listTeams(TeamQuery teamQuery,boolean isAdmin);

    /**
     * 更新队伍信息
     * @param teamUpdateRequest
     * @return
     */

    boolean updateTeam(TeamUpdateRequest teamUpdateRequest, User loginUser);

    /**
     * 加入队伍
     * @param teamJoinRequest
     * @param loginUser
     * @return
     */
    boolean joinTeam(TeamJoinRequest teamJoinRequest, User loginUser);

    /**
     * 退出队伍
     * @param teamQuitRequest
     * @param loginUser
     * @return
     */
    boolean quitTeam(TeamQuitRequest teamQuitRequest, User loginUser);
}
