package com.hanfu.user.center.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class hfStoreMenber implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_store_menber.id
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_store_menber.store_id
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    private Integer storeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_store_menber.user_id
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_store_menber.store_role
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    private Integer storeRole;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_store_menber.is_cancel
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    private Integer isCancel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_store_menber.phone
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    private Integer phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_store_menber.create_time
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_store_menber.modify_time
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_store_menber.last_modifier
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    private String lastModifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_store_menber.is_deleted
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    private Short isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hf_store_menber
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_store_menber.id
     *
     * @return the value of hf_store_menber.id
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_store_menber.id
     *
     * @param id the value for hf_store_menber.id
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_store_menber.store_id
     *
     * @return the value of hf_store_menber.store_id
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_store_menber.store_id
     *
     * @param storeId the value for hf_store_menber.store_id
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_store_menber.user_id
     *
     * @return the value of hf_store_menber.user_id
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_store_menber.user_id
     *
     * @param userId the value for hf_store_menber.user_id
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_store_menber.store_role
     *
     * @return the value of hf_store_menber.store_role
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    public Integer getStoreRole() {
        return storeRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_store_menber.store_role
     *
     * @param storeRole the value for hf_store_menber.store_role
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    public void setStoreRole(Integer storeRole) {
        this.storeRole = storeRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_store_menber.is_cancel
     *
     * @return the value of hf_store_menber.is_cancel
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    public Integer getIsCancel() {
        return isCancel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_store_menber.is_cancel
     *
     * @param isCancel the value for hf_store_menber.is_cancel
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    public void setIsCancel(Integer isCancel) {
        this.isCancel = isCancel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_store_menber.phone
     *
     * @return the value of hf_store_menber.phone
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    public Integer getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_store_menber.phone
     *
     * @param phone the value for hf_store_menber.phone
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_store_menber.create_time
     *
     * @return the value of hf_store_menber.create_time
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_store_menber.create_time
     *
     * @param createTime the value for hf_store_menber.create_time
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_store_menber.modify_time
     *
     * @return the value of hf_store_menber.modify_time
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_store_menber.modify_time
     *
     * @param modifyTime the value for hf_store_menber.modify_time
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_store_menber.last_modifier
     *
     * @return the value of hf_store_menber.last_modifier
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    public String getLastModifier() {
        return lastModifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_store_menber.last_modifier
     *
     * @param lastModifier the value for hf_store_menber.last_modifier
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    public void setLastModifier(String lastModifier) {
        this.lastModifier = lastModifier == null ? null : lastModifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_store_menber.is_deleted
     *
     * @return the value of hf_store_menber.is_deleted
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    public Short getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_store_menber.is_deleted
     *
     * @param isDeleted the value for hf_store_menber.is_deleted
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    public void setIsDeleted(Short isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_store_menber
     *
     * @mbg.generated Sun Mar 22 10:08:45 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", storeId=").append(storeId);
        sb.append(", userId=").append(userId);
        sb.append(", storeRole=").append(storeRole);
        sb.append(", isCancel=").append(isCancel);
        sb.append(", phone=").append(phone);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", lastModifier=").append(lastModifier);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append("]");
        return sb.toString();
    }
}