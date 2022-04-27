package com.pdv.solution.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "category_article", schema = "pdvsolution_db", catalog = "")
public class CategoryArticle {
    private int categoryArticleId;
    private String name;
    private String cssColor;

    @Id
    @Column(name = "category_article_id")
    public int getCategoryArticleId() {
        return categoryArticleId;
    }

    public void setCategoryArticleId(int categoryArticleId) {
        this.categoryArticleId = categoryArticleId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "cssColor")
    public String getCssColor() {
        return cssColor;
    }

    public void setCssColor(String cssColor) {
        this.cssColor = cssColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryArticle that = (CategoryArticle) o;
        return categoryArticleId == that.categoryArticleId &&
                Objects.equals(name, that.name) &&
                Objects.equals(cssColor, that.cssColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryArticleId, name, cssColor);
    }
}
