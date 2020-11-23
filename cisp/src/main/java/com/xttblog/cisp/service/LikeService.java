package com.xttblog.cisp.service;

import com.xttblog.cisp.domain.Article;
import com.xttblog.cisp.domain.Like;
import com.xttblog.cisp.domain.User;


import java.util.List;

public interface LikeService {

    void create(Like like);

    List<Like> getLikeByArticleId(Integer articleId);

    int countAllLike();

    void delete(Like like);

    Like getByUserAndArticle(Integer userId,Integer articleId);

}
