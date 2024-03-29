package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author yangjinping
 * @createDate 2024/3/27
 **/
@MappedSuperclass
@JsonInclude(JsonInclude.Include.NON_NULL)
@EntityListeners({AuditingEntityListener.class})
public abstract class BaseModel implements Serializable, Cloneable {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private Long rowVersion = 0L;
    private Boolean recordStatus = true;
    @CreatedBy
    private String createUser;
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    @CreatedDate
    @Column(
            nullable = false,
            updatable = false
    )
    @JsonDeserialize(
            using = LocalDateTimeDeserializer.class
    )
    @JsonSerialize(
            using = LocalDateTimeSerializer.class
    )
    private LocalDateTime createTime;
    @LastModifiedBy
    private String updateUser;
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    @LastModifiedDate
    @Column(
            nullable = false
    )
    @JsonDeserialize(
            using = LocalDateTimeDeserializer.class
    )
    @JsonSerialize(
            using = LocalDateTimeSerializer.class
    )
    private LocalDateTime updateTime;

    public BaseModel() {
    }

    public Long getId() {
        return this.id;
    }

    public Long getRowVersion() {
        return this.rowVersion;
    }

    public Boolean getRecordStatus() {
        return this.recordStatus;
    }

    public String getCreateUser() {
        return this.createUser;
    }

    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    public String getUpdateUser() {
        return this.updateUser;
    }

    public LocalDateTime getUpdateTime() {
        return this.updateTime;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public void setRowVersion(final Long rowVersion) {
        this.rowVersion = rowVersion;
    }

    public void setRecordStatus(final Boolean recordStatus) {
        this.recordStatus = recordStatus;
    }

    public void setCreateUser(final String createUser) {
        this.createUser = createUser;
    }

    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    @JsonDeserialize(
            using = LocalDateTimeDeserializer.class
    )
    public void setCreateTime(final LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public void setUpdateUser(final String updateUser) {
        this.updateUser = updateUser;
    }

    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    @JsonDeserialize(
            using = LocalDateTimeDeserializer.class
    )
    public void setUpdateTime(final LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof BaseModel)) {
            return false;
        } else {
            BaseModel other = (BaseModel)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label95: {
                    Object this$id = this.getId();
                    Object other$id = other.getId();
                    if (this$id == null) {
                        if (other$id == null) {
                            break label95;
                        }
                    } else if (this$id.equals(other$id)) {
                        break label95;
                    }

                    return false;
                }

                Object this$rowVersion = this.getRowVersion();
                Object other$rowVersion = other.getRowVersion();
                if (this$rowVersion == null) {
                    if (other$rowVersion != null) {
                        return false;
                    }
                } else if (!this$rowVersion.equals(other$rowVersion)) {
                    return false;
                }

                Object this$recordStatus = this.getRecordStatus();
                Object other$recordStatus = other.getRecordStatus();
                if (this$recordStatus == null) {
                    if (other$recordStatus != null) {
                        return false;
                    }
                } else if (!this$recordStatus.equals(other$recordStatus)) {
                    return false;
                }

                label74: {
                    Object this$createUser = this.getCreateUser();
                    Object other$createUser = other.getCreateUser();
                    if (this$createUser == null) {
                        if (other$createUser == null) {
                            break label74;
                        }
                    } else if (this$createUser.equals(other$createUser)) {
                        break label74;
                    }

                    return false;
                }

                label67: {
                    Object this$createTime = this.getCreateTime();
                    Object other$createTime = other.getCreateTime();
                    if (this$createTime == null) {
                        if (other$createTime == null) {
                            break label67;
                        }
                    } else if (this$createTime.equals(other$createTime)) {
                        break label67;
                    }

                    return false;
                }

                Object this$updateUser = this.getUpdateUser();
                Object other$updateUser = other.getUpdateUser();
                if (this$updateUser == null) {
                    if (other$updateUser != null) {
                        return false;
                    }
                } else if (!this$updateUser.equals(other$updateUser)) {
                    return false;
                }

                Object this$updateTime = this.getUpdateTime();
                Object other$updateTime = other.getUpdateTime();
                if (this$updateTime == null) {
                    if (other$updateTime != null) {
                        return false;
                    }
                } else if (!this$updateTime.equals(other$updateTime)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof BaseModel;
    }

    public int hashCode() {
        int result = 1;
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $rowVersion = this.getRowVersion();
        result = result * 59 + ($rowVersion == null ? 43 : $rowVersion.hashCode());
        Object $recordStatus = this.getRecordStatus();
        result = result * 59 + ($recordStatus == null ? 43 : $recordStatus.hashCode());
        Object $createUser = this.getCreateUser();
        result = result * 59 + ($createUser == null ? 43 : $createUser.hashCode());
        Object $createTime = this.getCreateTime();
        result = result * 59 + ($createTime == null ? 43 : $createTime.hashCode());
        Object $updateUser = this.getUpdateUser();
        result = result * 59 + ($updateUser == null ? 43 : $updateUser.hashCode());
        Object $updateTime = this.getUpdateTime();
        result = result * 59 + ($updateTime == null ? 43 : $updateTime.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "BaseEntity(id=" + this.getId() + ", rowVersion=" + this.getRowVersion() + ", recordStatus=" + this.getRecordStatus() + ", createUser=" + this.getCreateUser() + ", createTime=" + this.getCreateTime() + ", updateUser=" + this.getUpdateUser() + ", updateTime=" + this.getUpdateTime() + ")";
    }
}
