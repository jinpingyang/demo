package com.example.demo.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yangjinping
 * @createDate 2024/3/21
 **/
@Data
public class ResponseResultDto implements Serializable {

    private Integer code;
    private String description;
    private Object data;

    public Integer getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    public Object getData() {
        return this.data;
    }

    public void setCode(final Integer code) {
        this.code = code;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setData(final Object data) {
        this.data = data;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ResponseResultDto)) {
            return false;
        } else {
            ResponseResultDto other = (ResponseResultDto)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label47: {
                    Object this$code = this.getCode();
                    Object other$code = other.getCode();
                    if (this$code == null) {
                        if (other$code == null) {
                            break label47;
                        }
                    } else if (this$code.equals(other$code)) {
                        break label47;
                    }

                    return false;
                }

                Object this$description = this.getDescription();
                Object other$description = other.getDescription();
                if (this$description == null) {
                    if (other$description != null) {
                        return false;
                    }
                } else if (!this$description.equals(other$description)) {
                    return false;
                }

                Object this$data = this.getData();
                Object other$data = other.getData();
                if (this$data == null) {
                    if (other$data != null) {
                        return false;
                    }
                } else if (!this$data.equals(other$data)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ResponseResultDto;
    }

//    @Override
//    public int hashCode() {
////        int PRIME = true;
////        int result = 1;
//        Object $code = this.getCode();
//        int result = result * 59 + ($code == null ? 43 : $code.hashCode());
//        Object $description = this.getDescription();
//        result = result * 59 + ($description == null ? 43 : $description.hashCode());
//        Object $data = this.getData();
//        result = result * 59 + ($data == null ? 43 : $data.hashCode());
//        return result;
//    }

    @Override
    public String toString() {
        return "ResponseResultDto(code=" + this.getCode() + ", description=" + this.getDescription() + ", data=" + this.getData() + ")";
    }

    public ResponseResultDto(final Integer code, final String description, final Object data) {
        this.code = code;
        this.description = description;
        this.data = data;
    }

    public ResponseResultDto() {
    }

}
