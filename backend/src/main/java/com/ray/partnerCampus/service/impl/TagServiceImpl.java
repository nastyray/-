package com.ray.partnerCampus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ray.partnerCampus.mapper.TagMapper;
import com.ray.partnerCampus.model.domain.Tag;
import com.ray.partnerCampus.service.TagService;
import org.springframework.stereotype.Service;

/**
* @author lil ray
* @description 针对表【tag(标签表)】的数据库操作Service实现
* @createDate 2023-10-29 17:53:48
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService {

}




