package com.learn;

//import cz.zoom.callrec.core.callstorage.util.BaseBean;
//import cz.zoom.callrec.core.callstorage.util.SearchOrder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/** @author Martin Zdarsky, 26.5.2009 */
@XmlRootElement(name = "right")
@XmlAccessorType(XmlAccessType.FIELD)
public class RightBO {
  private static final long serialVersionUID = -3973653761673527020L;
  public enum Fields {
    RIGHT_NAME("name"), RIGHT_ID("rightid");
    private final String fieldName;

    Fields(final String fieldName) {
      this.fieldName = fieldName;
    }

    public String getFieldName() {
      return fieldName;
    }

    public static Fields getField(String fieldName) {
      for (Fields field: Fields.values())
        if (field.getFieldName().equals(fieldName))
          return field;
      return null;
    }
  }

  /**
   * Rights that should match the database values.
   * For detailed descriptions of individual permissions see
   * <a href="http://confluence:8080/display/ENG/Module+-+Permissions">Module - Permissions</a>.
   */
  public enum Rights {
    /** Add specific call to the evaluation */
    ADD_CALL,
    /** Add audit reason */
    ADD_AUDIT_REASON,
    /** Reviews - Plan Manual Review for Others */
    CREATE_EVALS,
    /** Create, view, edit owned data export tasks */
    DATA_TASK,
    /** Create, view, edit all data export tasks */
    DATA_TASK_ALL,
    /** Filter data export result */
    DATA_EXPORT_ALL_RESULTS,
    /** Edit admin settings */
    EDIT_ADMIN_SETTING,
    /** Edit audit reason*/
    EDIT_AUDIT_REASON,
    /** Edit global templates */
    EDIT_GLOBAL_TEMPLATES,
    /** Edit interaction types */
    EDIT_INTERACTION_TYPES,
    /** Edit Settings */
    EDIT_SETTINGS,
    /** Evaluate agents from group assigned to the current user */
    EVAL_AGENTS,
    /** Delete evaluations created by ANY user */
    EVAL_REMOVE_ALL,
    /** Only his own interactions */
    INTERACTIONS_AGENT_VIEW,
    /** Conversations - Anonymization */
    INTERACTION_ANONYMIZE,
    /** Conversations - Export JSON */
    INTERACTIONS_EXPORT_JSON,
    /** Conversations - Export MP3 */
    INTERACTIONS_EXPORT_MEDIA,
    /** User can view and play all interactions, interactions scores, and all tags */
    INTERACTIONS_FULL_VIEW,
    /** Conversations - Review View */
    INTERACTION_REVIEWS_VIEW,
    /** Conversations - Tag Add */
    INTERACTION_TAGS_ADD,
    /** Conversations - Tag Edit */
    INTERACTION_TAGS_EDIT,
    /** Manages Interaction Tags */
    INTERACTION_TAGS_MANAGE,
    /** Conversations - Tag View */
    INTERACTION_TAGS_VIEW,
    /** Only the interactions from users that belong to his can evaluate groups */
    INTERACTIONS_GROUP_VIEW,
    /** Manage evaluations assigned to *or created by* logged user */
    MANAGE_ASSIGNED_EVALUATIONS,
    /** Permission required to create (and exactly define) the role of the Compliance Analyst*/
    MANAGE_COMPLIANCE,
    /** Manage how data is kept/deleted in the system */
    MANAGE_DATA_LIFECYCLE,
    /** Create and modify questionnaires */
    MANAGE_QUESTIONNAIRES,
    /** Edit, delete, and create speech tags and speech phrases */
    MANAGE_SPEECH_TAG,
    /** Manage Shared Dashboard */
    MANAGE_SHARED_DASHBOARD,
    /** Plan evaluations for all groups */
    PLAN_ALL_EVALS,
    /** Plan evaluations for own group or subgroups */
    PLAN_GROUP_EVALS,
    /** Permission to Re-allocate evaluations to new evaluator*/
    REALLOCATE_EVALUATIONS,
    /** Reopen finished evaluations (4.7.2) - added to Supervisor role... */
    REOPEN_EVALS,
    /** Replace calls */
    REPLACE_CALLS,
    /** Permission for viewing all reports elements */
    REPORTING_ALL,
    /** Permission for viewing reports elements for assigned groups and members */
    REPORTING_ASSIGNED_TEAMS,
    /** Permission for viewing reports elements for self user */
    REPORTING_SELF,
    /** Scoring Tiers View*/
    SCORING_TIERS_VIEW,
    /** Scoring Tiers Manage (Add, Edit, Remove)*/
    SCORING_TIERS_MANAGE,
    /** Plan and evaluate self-evaluations */
    SELF_EVALUATE,
    /** Send evaluation feedback */
    SEND_EVAL_FEEDBACK,
    /** Survey Plans */
    SURVEY_PLANS,
    /** View all evaluations */
    VIEW_ALL_EVALS,
    /** List Audit events */
    VIEW_AUDIT,
    /** Ability to view the Encourage conversations screen */
    VIEW_CONVERSATIONS_SCREEN,
    /** View evaluations - agent view */
    VIEW_EVALS,
    /** View my evaluations where I am evaluator */
    VIEW_MY_EVALS,
    /** View team evaluations */
    VIEW_TEAM_EVALS,
    /** Use Performance Analytics*/
    VIEW_ZPA;
    /**
     * Safe get enum value by name
     * @param name string name, case-insensitive
     * @return instance of {@link Rights} or <code>null</code> if enum not found
     */
		public static Rights getByName(final String name) {
			Rights rights = null;
			if (name != null) {
				String nameUpper = name.trim().toUpperCase();
				if (!nameUpper.isEmpty()) {
					try {
						rights = valueOf(nameUpper);
					} catch (IllegalArgumentException e) {
						// cannot compile to GWT with link to org.slf4j.LoggerFactory
						System.err.println(e.getMessage());
					}
				}
			}
			return rights;
		}

  }

  private Integer rightid;
  private Rights name;
//  private List<RightValueBO> values= new ArrayList<>();
//
//  public RightBO() {
//    values = new ArrayList<>();
//  }
//
//  public List<RightValueBO> getValues() {
//    return values;
//  }
//
//
//  protected void setValues(List<RightValueBO> values) {
//    this.values = values;
//  }
//
//
//  public void addValue(RightValueBO value) {
//    if (value == null)
//      throw new IllegalArgumentException();
//    values.add(value);
//  }
//
//  public void removeValue(RightValueBO value) {
//    if (value == null)
//      throw new IllegalArgumentException();
//    values.remove(value);
//  }
//
//  public void addValues(Set<RightValueBO> values) {
//    if (values == null)
//      throw new IllegalArgumentException();
//    this.values.addAll(values);
//  }
//
//  public void removeValues(Set<RightValueBO> values) {
//    if (values == null)
//      throw new IllegalArgumentException();
//    this.values.removeAll(values);
//  }
//
//  @Override
//  public Integer getId() {
//    return getRightid();
//  }
//
//  @Override
//  public void setId(Integer value) {
//    setRightid(value);
//  }
//
//  public Integer getRightid() {
//    return rightid;
//  }
//
//  //used by ibatis
//  public void setRightid(Integer rightid) {
//    if (isLocked()) {
//      throw new UnsupportedOperationException("You cannot set a primary key");
//    }
//    this.rightid = rightid;
//  }
//
//  //used by ibatis
//  @SuppressWarnings("unused")
//  private String getName() {
//    return name != null ? name.toString() : null;
//  }
//
//  @SuppressWarnings("unused")
//  private void setName(String name) {
//    this.name = Rights.getByName(name);
//  }
//
//  public Rights getNameEnum() {
//    return name;
//  }
//
//  public void setNameEnum(Rights right) {
//    markChanged(this.name, right);
//    this.name = right;
//  }

//  @Override
//  public int hashCode() {
//    return getRightid() == null ? 0 : getRightid().hashCode();
//  }
//
//  @Override
//  public boolean equals(Object obj) {
//    if (this == obj) {
//      return true;
//    }
//    if (!(obj instanceof RightBO)) {
//      return false;
//    }
//    RightBO other = (RightBO) obj;
//    return getRightid() != null && other.getRightid() != null && getRightid().equals(other.getRightid());
//  }
//
//  @Override
//  public String toString() {
//    return "RightBO(" + rightid + ": " + name + ": " + values + ")";
//  }
//
//  @Override
//  public BaseBean newInstance() {
//    return new RightBO();
//  }
//
//  @Override
//  public List<SearchOrder> defaultSortOrder() {
//    List<SearchOrder> ordering = new ArrayList<>();
//    ordering.add(new SearchOrder(Fields.RIGHT_NAME, SearchOrder.Direction.ASC));
//    return ordering;
//  }

}
