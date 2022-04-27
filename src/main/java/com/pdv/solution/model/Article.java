package com.pdv.solution.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "article", schema = "pdvsolution_db", catalog = "")
public class Article {
    private int id;
    private String nom;
    private String description;
    private String price;
    private Byte isAvailable;
    private byte[] image;
    private Integer quantity;
    private CategoryArticle categoryArticleByCategoryId;
    private Promotion promotionByPromotionId;

    public Article(String nom, String description, String price) {
        this.nom = nom;
        this.description = description;
        this.price = price;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nom")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "price")
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Basic
    @Column(name = "is_available")
    public Byte getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Byte isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Basic
    @Column(name = "image")
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Basic
    @Column(name = "quantity")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article that = (Article) o;
        return id == that.id &&
                Objects.equals(nom, that.nom) &&
                Objects.equals(description, that.description) &&
                Objects.equals(price, that.price) &&
                Objects.equals(isAvailable, that.isAvailable) &&
                Arrays.equals(image, that.image) &&
                Objects.equals(quantity, that.quantity);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, nom, description, price, isAvailable, quantity);
        result = 31 * result + Arrays.hashCode(image);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_article_id")
    public CategoryArticle getCategoryArticleByCategoryId() {
        return categoryArticleByCategoryId;
    }

    public void setCategoryArticleByCategoryId(CategoryArticle categoryArticleByCategoryId) {
        this.categoryArticleByCategoryId = categoryArticleByCategoryId;
    }

    @ManyToOne
    @JoinColumn(name = "promotion_id", referencedColumnName = "promotion_id", nullable = false)
    public Promotion getPromotionByPromotionId() {
        return promotionByPromotionId;
    }

    public void setPromotionByPromotionId(Promotion promotionByPromotionId) {
        this.promotionByPromotionId = promotionByPromotionId;
    }
}
