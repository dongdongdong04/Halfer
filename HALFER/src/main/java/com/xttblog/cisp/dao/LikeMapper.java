package com.xttblog.cisp.dao;

import com.xttblog.cisp.domain.Article;
import com.xttblog.cisp.domain.Like;
import com.xttblog.cisp.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface LikeMapper {

    void create(Like like);

    List<Like> getLikeByArticleId(Integer articleId);

    void delete(Like like);

    Like getById(Integer id);

    Like getByUserAndArticle(Integer userId, Integer articleId);

    void deleteByArticleId(Integer articleId);
}
