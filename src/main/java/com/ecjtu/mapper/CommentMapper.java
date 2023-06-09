package com.ecjtu.mapper;

import com.ecjtu.entity.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 */
public interface CommentMapper {

    /**
     * 新增的评论
     * @param comment 新增的评论
     * @return int
     * */
    int addComment(Comment comment);

    /**
     * 删除评论
     * @param id 评论的id
     * @return int
     * */
    int deleteComment(Integer id);

    /**
     * 更新评论的信息
     * @param  comment 更新的评论信息
     * @return int
     * */
    int updateComment(Comment comment);

    /**
     * 破除用户表外键关系
     * @param user_id 评论表的外键
     * */
    void  updateRelationUser(Integer user_id);

    /**
     * 破除流浪动物表的外键
     * @param pet_id 评论表的主键
     * */
    void  updateRelationPet(Integer pet_id);
    /**
     * 查询所有的评论
     * @return list
     * */
    List<Comment> getComments();

    /**
     * 根据流浪动物id查询评论
     * @param pet_id 流浪动物狗的外键
     * @return list
     * */
    List<Comment> findByPetId(Integer pet_id);

    /**
     * 根据用户昵称查询评论
     * @param name 名字
     * @return list
     * */
    List<Comment> findByName(String name);

    /**
     * 根据评论表id查询信息
     * @param id
     * @return comment
     * */
    Comment findById(Integer id);



    /**
     * 批量删除
     * @param ids id的集合
     * */
    void deleteBatch(@Param("ids")List<Integer>ids);
}
