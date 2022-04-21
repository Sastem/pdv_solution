package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "reward", schema = "pdvsolution_db", catalog = "")
public class RewardEntity {
    private int rewardId;
    private Integer rewardValue;

    @Id
    @Column(name = "reward_id")
    public int getRewardId() {
        return rewardId;
    }

    public void setRewardId(int rewardId) {
        this.rewardId = rewardId;
    }

    @Basic
    @Column(name = "reward_value")
    public Integer getRewardValue() {
        return rewardValue;
    }

    public void setRewardValue(Integer rewardValue) {
        this.rewardValue = rewardValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RewardEntity that = (RewardEntity) o;
        return rewardId == that.rewardId &&
                Objects.equals(rewardValue, that.rewardValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rewardId, rewardValue);
    }
}
