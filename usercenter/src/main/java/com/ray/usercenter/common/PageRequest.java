package com.ray.usercenter.common;

import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

/**
 * ClassName: PageRequest
 * Package: com.ray.usercenter.common
 * Description: 通用分页请求参数
 *
 * @Author lil ray
 * @Create 2023/11/11 14:50
 * @Version 1.0
 */
@Data
public class PageRequest implements Serializable {

     private static final long serialVersionUID = -5860707094194210842L;

    /**
     * 页面大小
     */
    protected int pageSize = 10 ;
    /**
     * 当前是第几页
     */
    private int pageNum = 1;


}
