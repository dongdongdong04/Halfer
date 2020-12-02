package com.xttblog.cisp.service.impl;

import com.xttblog.cisp.domain.Category;
import com.xttblog.cisp.service.CategoryService;
import com.xttblog.cisp.dao.CategoryMapper;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * Created by Zbin on 2019-02-16
 */
@Service
public class CategoryServiceImpl implements CategoryService {

  @Resource
  CategoryMapper categoryMapper;

  @Override
  public List<Category> getAllCategory() {
    return categoryMapper.getAllCategory();
  }

  @Override
  public void create(Category category) {
    categoryMapper.create(category);
  }

  @Override
  public void deleteById(Integer id) {
    categoryMapper.deleteById(id);
  }

  @Override
  public void updateById(Category category) {
    categoryMapper.updateById(category);
  }
}
