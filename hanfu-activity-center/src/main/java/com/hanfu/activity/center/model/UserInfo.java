package com.hanfu.activity.center.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class UserInfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_user_info.id
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_user_info.user_id
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_user_info.file_id
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private Integer fileId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_user_info.base_info
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private String baseInfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_user_info.remarks
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private String remarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_user_info.create_time
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private LocalDateTime createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_user_info.modify_time
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private LocalDateTime modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_user_info.is_deleted
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private Short isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hf_user_info
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_user_info.id
     *
     * @return the value of hf_user_info.id
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_user_info.id
     *
     * @param id the value for hf_user_info.id
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_user_info.user_id
     *
     * @return the value of hf_user_info.user_id
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_user_info.user_id
     *
     * @param userId the value for hf_user_info.user_id
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_user_info.file_id
     *
     * @return the value of hf_user_info.file_id
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public Integer getFileId() {
        return fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_user_info.file_id
     *
     * @param fileId the value for hf_user_info.file_id
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_user_info.base_info
     *
     * @return the value of hf_user_info.base_info
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public String getBaseInfo() {
        return baseInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_user_info.base_info
     *
     * @param baseInfo the value for hf_user_info.base_info
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public void setBaseInfo(String baseInfo) {
        this.baseInfo = baseInfo == null ? null : baseInfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_user_info.remarks
     *
     * @return the value of hf_user_info.remarks
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_user_info.remarks
     *
     * @param remarks the value for hf_user_info.remarks
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_user_info.create_time
     *
     * @return the value of hf_user_info.create_time
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_user_info.create_time
     *
     * @param createTime the value for hf_user_info.create_time
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_user_info.modify_time
     *
     * @return the value of hf_user_info.modify_time
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_user_info.modify_time
     *
     * @param modifyTime the value for hf_user_info.modify_time
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_user_info.is_deleted
     *
     * @return the value of hf_user_info.is_deleted
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public Short getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_user_info.is_deleted
     *
     * @param isDeleted the value for hf_user_info.is_deleted
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public void setIsDeleted(Short isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_user_info
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", fileId=").append(fileId);
        sb.append(", baseInfo=").append(baseInfo);
        sb.append(", remarks=").append(remarks);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append("]");
        return sb.toString();
    }
}