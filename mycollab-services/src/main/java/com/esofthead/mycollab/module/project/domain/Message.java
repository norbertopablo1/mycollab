/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
/*Domain class of table m_prj_message*/
package com.esofthead.mycollab.module.project.domain;

import com.esofthead.mycollab.core.arguments.ValuedBean;
import java.util.Date;

@SuppressWarnings("ucd")
@com.esofthead.mycollab.core.db.metadata.Table("m_prj_message")
public class Message extends ValuedBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_message.id
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("id")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_message.title
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=1000, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("title")
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_message.posteddate
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("posteddate")
    private Date posteddate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_message.posteduser
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("posteduser")
    private String posteduser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_message.projectid
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("projectid")
    private Integer projectid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_message.category
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("category")
    private String category;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_message.createdTime
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("createdTime")
    private Date createdtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_message.lastUpdatedTime
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("lastUpdatedTime")
    private Date lastupdatedtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_message.sAccountId
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("sAccountId")
    private Integer saccountid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_message.isStick
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("isStick")
    private Boolean isstick;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_message.key
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("key")
    private Integer key;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_message.message
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=65535, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("message")
    private String message;

    private static final long serialVersionUID = 1;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_message.id
     *
     * @return the value of m_prj_message.id
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_message.id
     *
     * @param id the value for m_prj_message.id
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_message.title
     *
     * @return the value of m_prj_message.title
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_message.title
     *
     * @param title the value for m_prj_message.title
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_message.posteddate
     *
     * @return the value of m_prj_message.posteddate
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    public Date getPosteddate() {
        return posteddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_message.posteddate
     *
     * @param posteddate the value for m_prj_message.posteddate
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    public void setPosteddate(Date posteddate) {
        this.posteddate = posteddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_message.posteduser
     *
     * @return the value of m_prj_message.posteduser
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    public String getPosteduser() {
        return posteduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_message.posteduser
     *
     * @param posteduser the value for m_prj_message.posteduser
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    public void setPosteduser(String posteduser) {
        this.posteduser = posteduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_message.projectid
     *
     * @return the value of m_prj_message.projectid
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_message.projectid
     *
     * @param projectid the value for m_prj_message.projectid
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_message.category
     *
     * @return the value of m_prj_message.category
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    public String getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_message.category
     *
     * @param category the value for m_prj_message.category
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_message.createdTime
     *
     * @return the value of m_prj_message.createdTime
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_message.createdTime
     *
     * @param createdtime the value for m_prj_message.createdTime
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_message.lastUpdatedTime
     *
     * @return the value of m_prj_message.lastUpdatedTime
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    public Date getLastupdatedtime() {
        return lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_message.lastUpdatedTime
     *
     * @param lastupdatedtime the value for m_prj_message.lastUpdatedTime
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    public void setLastupdatedtime(Date lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_message.sAccountId
     *
     * @return the value of m_prj_message.sAccountId
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_message.sAccountId
     *
     * @param saccountid the value for m_prj_message.sAccountId
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_message.isStick
     *
     * @return the value of m_prj_message.isStick
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    public Boolean getIsstick() {
        return isstick;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_message.isStick
     *
     * @param isstick the value for m_prj_message.isStick
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    public void setIsstick(Boolean isstick) {
        this.isstick = isstick;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_message.key
     *
     * @return the value of m_prj_message.key
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    public Integer getKey() {
        return key;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_message.key
     *
     * @param key the value for m_prj_message.key
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    public void setKey(Integer key) {
        this.key = key;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_message.message
     *
     * @return the value of m_prj_message.message
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    public String getMessage() {
        return message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_message.message
     *
     * @param message the value for m_prj_message.message
     *
     * @mbggenerated Wed Sep 24 09:27:16 ICT 2014
     */
    public void setMessage(String message) {
        this.message = message;
    }
}