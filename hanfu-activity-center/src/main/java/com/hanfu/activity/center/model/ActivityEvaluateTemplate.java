package com.hanfu.activity.center.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ActivityEvaluateTemplate implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_evaluate_template.id
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_evaluate_template.parent_template_id
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private Integer parentTemplateId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_evaluate_template.evaluate_type
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private String evaluateType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_evaluate_template.evaluate_content
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private String evaluateContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_evaluate_template.evaluate_weight
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private String evaluateWeight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_evaluate_template.remarks
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private String remarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_evaluate_template.create_time
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private LocalDateTime createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_evaluate_template.modify_time
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private LocalDateTime modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_evaluate_template.is_deleted
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private Short isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table activity_evaluate_template
     *
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_evaluate_template.id
     *
     * @return the value of activity_evaluate_template.id
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_evaluate_template.id
     *
     * @param id the value for activity_evaluate_template.id
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_evaluate_template.parent_template_id
     *
     * @return the value of activity_evaluate_template.parent_template_id
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public Integer getParentTemplateId() {
        return parentTemplateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_evaluate_template.parent_template_id
     *
     * @param parentTemplateId the value for activity_evaluate_template.parent_template_id
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public void setParentTemplateId(Integer parentTemplateId) {
        this.parentTemplateId = parentTemplateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_evaluate_template.evaluate_type
     *
     * @return the value of activity_evaluate_template.evaluate_type
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public String getEvaluateType() {
        return evaluateType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_evaluate_template.evaluate_type
     *
     * @param evaluateType the value for activity_evaluate_template.evaluate_type
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public void setEvaluateType(String evaluateType) {
        this.evaluateType = evaluateType == null ? null : evaluateType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_evaluate_template.evaluate_content
     *
     * @return the value of activity_evaluate_template.evaluate_content
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public String getEvaluateContent() {
        return evaluateContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_evaluate_template.evaluate_content
     *
     * @param evaluateContent the value for activity_evaluate_template.evaluate_content
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public void setEvaluateContent(String evaluateContent) {
        this.evaluateContent = evaluateContent == null ? null : evaluateContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_evaluate_template.evaluate_weight
     *
     * @return the value of activity_evaluate_template.evaluate_weight
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public String getEvaluateWeight() {
        return evaluateWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_evaluate_template.evaluate_weight
     *
     * @param evaluateWeight the value for activity_evaluate_template.evaluate_weight
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public void setEvaluateWeight(String evaluateWeight) {
        this.evaluateWeight = evaluateWeight == null ? null : evaluateWeight.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_evaluate_template.remarks
     *
     * @return the value of activity_evaluate_template.remarks
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_evaluate_template.remarks
     *
     * @param remarks the value for activity_evaluate_template.remarks
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_evaluate_template.create_time
     *
     * @return the value of activity_evaluate_template.create_time
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_evaluate_template.create_time
     *
     * @param createTime the value for activity_evaluate_template.create_time
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_evaluate_template.modify_time
     *
     * @return the value of activity_evaluate_template.modify_time
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_evaluate_template.modify_time
     *
     * @param modifyTime the value for activity_evaluate_template.modify_time
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_evaluate_template.is_deleted
     *
     * @return the value of activity_evaluate_template.is_deleted
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public Short getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_evaluate_template.is_deleted
     *
     * @param isDeleted the value for activity_evaluate_template.is_deleted
     * @mbg.generated Tue Dec 03 07:29:15 CST 2019
     */
    public void setIsDeleted(Short isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_evaluate_template
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
        sb.append(", parentTemplateId=").append(parentTemplateId);
        sb.append(", evaluateType=").append(evaluateType);
        sb.append(", evaluateContent=").append(evaluateContent);
        sb.append(", evaluateWeight=").append(evaluateWeight);
        sb.append(", remarks=").append(remarks);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append("]");
        return sb.toString();
    }
}