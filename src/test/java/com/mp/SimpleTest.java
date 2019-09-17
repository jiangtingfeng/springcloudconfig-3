package com.mp;

import com.mp.dao.CategoryMapper;
import com.mp.pojo.Category;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleTest {
    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    public void select() {
        List<Category> categoryList = categoryMapper.selectList(null);
        Assert.assertEquals(5,categoryList.size());
        categoryList.forEach(System.out::println);
    }

    @Test
    public void insert() {
        Category category = new Category();
        category.setCategoryName("sad");
        category.setCategoryPic("dasd");
        category.setText("dasdada");
        category.setDeleted(0);
        int rows = categoryMapper.insert(category);
        System.out.println(rows);
    }

    /*
    * 逻辑删除  具体使用方法  在实体中定义一个相应的属性  添加TableLogic注解   即可进行逻辑删除
    * */
    @Test
    public void delete() {
    }


    @Test
    public void update() {
        Category category = new Category();
        int rows = categoryMapper.updateById(category);
        System.out.println(rows);
    }
}
