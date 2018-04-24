package org.cboard.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Chaiwenjun on 2018/3/27.
 *
 */
public class DashboardUserOption implements Serializable {
    private Integer id;

    private Long userId;

    private String optKey;

    private String optValue;

    private String createBy;

    private Date createDate;

    private String dashboardUserOption;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getOptKey() {
        return optKey;
    }

    public void setOptKey(String optKey) {
        this.optKey = optKey == null ? null : optKey.trim();
    }

    public String getOptValue() {
        return optValue;
    }

    public void setOptValue(String optValue) {
        this.optValue = optValue == null ? null : optValue.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getDashboardUserOption() {
        return dashboardUserOption;
    }

    public void setDashboardUserOption(String dashboardUserOption) {
        this.dashboardUserOption = dashboardUserOption == null ? null : dashboardUserOption.trim();
    }
}