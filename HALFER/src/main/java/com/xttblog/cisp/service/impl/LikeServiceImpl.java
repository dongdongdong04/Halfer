package com.xttblog.cisp.service.impl;

import com.xttblog.cisp.dao.ArticleMapper;
import com.xttblog.cisp.dao.LikeMapper;
import com.xttblog.cisp.domain.Article;
import com.xttblog.cisp.domain.Like;
import com.xttblog.cisp.domain.User;
import com.xttblog.cisp.service.LikeService;
import com.xttblog.cisp.vo.ArticleVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LikeServiceImpl implements LikeService {

    @Resource
    LikeMapper likeMapper;

    @Resource
    ArticleMapper articleMapper;

    @Override
    public void create(Like like) {
            likeMapper.create(like);
            articleMapper.addLike(like.getArticleId());
    }

    @Override
    public Like getByUserAndArticle(Integer userId, Integer articleId) {
        Like like = likeMapper.getByUserAndArticle(userId,articleId);
        return like;
    }

    @Override
    public List<Like> getLikeByArticleId(Integer articleId) {
        List<Like> likeList = likeMapper.getLikeByArticleId(articleId);
        return likeList;
    }

    @Override
    public int countAllLike() {
        List<ArticleVO> articleVOList = articleMapper.getIndexArticles(null);
        int count = 0;
        for (ArticleVO articleVO : articleVOList) {
            count += this.getLikeByArticleId(articleVO.getId()).size();
        }
        return count;
    }

    @Override
    public void delete(Like like) {
        Like tmpLike = likeMapper.getById(like.getId());
        likeMapper.delete(like);
        articleMapper.deleteLike(tmpLike.getArticleId());
    }


}
