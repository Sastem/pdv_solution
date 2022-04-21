package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "order_line", schema = "pdvsolution_db", catalog = "")
public class OrderLineEntity {
    private int orderLineId;
    private OrderEntity orderByOrderId;
    private ArticleEntity articleByArticleId;

    @Id
    @Column(name = "order_line_id")
    public int getOrderLineId() {
        return orderLineId;
    }

    public void setOrderLineId(int orderLineId) {
        this.orderLineId = orderLineId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderLineEntity that = (OrderLineEntity) o;
        return orderLineId == that.orderLineId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderLineId);
    }

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    public OrderEntity getOrderByOrderId() {
        return orderByOrderId;
    }

    public void setOrderByOrderId(OrderEntity orderByOrderId) {
        this.orderByOrderId = orderByOrderId;
    }

    @ManyToOne
    @JoinColumn(name = "article_id", referencedColumnName = "id")
    public ArticleEntity getArticleByArticleId() {
        return articleByArticleId;
    }

    public void setArticleByArticleId(ArticleEntity articleByArticleId) {
        this.articleByArticleId = articleByArticleId;
    }
}
