-- auto-generated definition
create table tag
(
    id         bigint auto_increment comment 'id'
        primary key,
    tagname    varchar(256)                       null comment '标签名称',
    userId     bigint                             null comment '用户id',
    parentId   bigint                             null comment '父标签id',
    isParent   tinyint                            null comment '0 - 不是，1- 父标签',
    createTime datetime default CURRENT_TIMESTAMP null comment '创建时间',
    updateTime datetime default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '更新时间',
    isDelete   tinyint  default 0                 not null comment '是否删除',
    constraint unidx_taName
        unique (tagname)
)
    comment '标签表';

create index idx_userId
    on tag (userId);


