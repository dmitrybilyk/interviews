package toknow.nikita.duplicate.i18n;

import com.google.gwt.i18n.client.Constants;

/**
 * This is the final translation class. Follow the rules!!!
 * <p/>
 * The key generating:
 * Key contains several words separated by an underscore.
 * 1) First few word are made by left menu tree. i.e. Evaluations_ListOfEvaluations or About
 * 2) if the described control is on a different window then follows the name of the window.
 * i.e. Evaluations_ListOfEvaluations_SearchCriteria or Evaluations_ListOfEvaluations_Evaluate
 * 3) next is the type of the control i.e. SearchButton, SupervisorComboBox...
 * 4) follows by the name and type of a control i.e. clearButton or AgentComboBox and
 * 5) finally the last word describes the property we set. i.e. value, description, blankText or toolTip.
 * 6) If there is a need to add more info input another word. i.e. tooltip_title or just input more specific comment...
 * <p/>
 * A few examples:
 * Evaluations_ListOfEvaluations_SearchCriteria_ClearButton_value
 * Evaluations_ListOfEvaluations_SearchCriteria_ClearButton_tooltip_title
 * Evaluations_ListOfEvaluations_SearchCriteria_AgentComboBox_BlankText
 * <p/>
 * Evaluations_ListOfEvaluations_SearchCriteria_EvaluationsGrid_Header_Column_LastModified_value
 * @author Martin Zdarsky
 */
public interface ScorecardConstants extends Constants {

  @DefaultStringValue("Build:")
  public String about_buildField_fieldLabel();

  @DefaultStringValue("Error:")
  public String about_errorField_fieldLabel();

  @DefaultStringValue("Upload License File")
  public String about_fileUploadPanel_uploadButton();

  @DefaultStringValue("About")
  public String about_header_title();

  @DefaultStringValue("Product Info")
  public String about_infoPanel_heading();

  @DefaultStringValue("Activation Key")
  public String about_licensePanel_grid_activationKeyRow();

  @DefaultStringValue("Expiry Date")
  public String about_licensePanel_grid_expiryDateRow();

  @DefaultStringValue("State")
  public String about_licensePanel_grid_licenseStateRow();

  @DefaultStringValue("Issue Date")
  public String about_licensePanel_grid_productid_issueDateRow();

  @DefaultStringValue("Product Name")
  public String about_licensePanel_grid_productNameRow();

  @DefaultStringValue("Owner")
  public String about_licensePanel_grid_productOwnerRow();

  @DefaultStringValue("Product Version")
  public String about_licensePanel_grid_productVersionRow();

  @DefaultStringValue("Product License")
  public String about_licensePanel_heading_productLicense();

  @DefaultStringValue("Support License")
  public String about_licensePanel_heading_suportLicense();

  @DefaultStringValue("Loading...")
  public String about_licensePanel_loading_mask();

  @DefaultStringValue("ScoreCARD")
  public String about_licensePanel_feature_scorecard();

  @DefaultStringValue("SpeechREC")
  public String about_licensePanel_feature_speechrec();

  @DefaultStringValue("Customer Interactions")
  public String about_licensePanel_feature_customer_interactions();

  @DefaultStringValue("eLEARN")
  public String about_licensePanel_feature_elearn();

  @DefaultStringValue("FeedBACK")
  public String about_licensePanel_feature_feedback();

  @DefaultStringValue("Enabled")
  public String about_licensePanel_feature_enabled();

  @DefaultStringValue("Disabled")
  public String about_licensePanel_feature_disabled();

  @DefaultStringValue("Upload License")
  public String about_uploadPanel_title();

  @DefaultStringValue("Version:")
  public String about_versionField_fieldLabel();

  @DefaultStringValue("General Settings")
  public String administration_ApplicationOptions_generalFieldSet_heading();

  @DefaultStringValue("Saving...")
  public String administration_applicationOptions_savingData_mask();

  @DefaultStringValue("Close")
  public String administration_ApplicationOptions_ToolBar_CancelButton_Text();

  @DefaultStringValue("Save")
  public String administration_ApplicationOptions_ToolBar_SaveButton_Text();

  @DefaultStringValue("Integration Settings")
  public String administration_ApplicationOptions_ucceFieldSet_heading();

  @DefaultStringValue("select event type")
  public String administration_auditLog_eventTypeComboBox_defaultEventType();

  @DefaultStringValue("from")
  public String administration_auditLog_fromDateTimeField_emptyText();

  @DefaultStringValue("Date")
  public String administration_auditLog_grid_date_columnName();

  @DefaultStringValue("Description")
  public String administration_auditLog_grid_description_columnName();

  @DefaultStringValue("N.")
  public String administration_auditLog_grid_orderNumberTitle_columnName();

  @DefaultStringValue("Result")
  public String administration_auditLog_grid_result_columnName();

  @DefaultStringValue("Logged In User")
  public String administration_auditLog_grid_toUser_columnName();

  @DefaultStringValue("Event")
  public String administration_auditLog_grid_type_columnName();

  @DefaultStringValue("to")
  public String administration_auditLog_toDateTimeField_emptyText();

  @DefaultStringValue("Close")
  public String administration_auditLog_toolBar_closeButton_value();

  @DefaultStringValue("Search")
  public String administration_auditLog_toolBar_searchButton_value();

  @DefaultStringValue("select user")
  public String administration_auditLog_userComboBox_defaultUser();

  @DefaultStringValue("Edit")
  public String administration_categories_toolBar_editButton_value();

  @DefaultStringValue("Add")
  public String administration_category_addButton_value();

  @DefaultStringValue("Category")
  public String administration_category_grid_categoryColumn_columnName();

  @DefaultStringValue("Category Name")
  public String administration_category_grid_newAdditionText_categoryName_text();

  @DefaultStringValue("Category")
  public String administration_category_header_title();

  @DefaultStringValue("Create Category:")
  public String administration_category_infoBox_createCategoryString();

  @DefaultStringValue("Delete Category:")
  public String administration_category_infoBox_deleteCategoryString();

  @DefaultStringValue("Update Category:")
  public String administration_category_infoBox_updateCategoryString();

  @DefaultStringValue("Deleting...")
  public String administration_category_messageBox_deleteCategory_deleting_mask();

  @DefaultStringValue("Remove")
  public String administration_category_removeButton_value();

  @DefaultStringValue("Add")
  public String administration_groupManager_addButton_value();

  @DefaultStringValue("Add new group")
  public String administration_groupManager_addGroup_header_title();

  @DefaultStringValue("Rename group")
  public String administration_groupManager_renameGroup_header_title();

  @DefaultStringValue("Group Name")
  public String administration_groupManager_addGroup_newGroupNameFieldLabel_labelField();

  @DefaultStringValue("Cancel")
  public String administration_groupManager_addGroupWindow_cancelButton_value();

  @DefaultStringValue("Save")
  public String administration_groupManager_addGroupWindow_saveButton_value();

  @DefaultStringValue("saving group...")
  public String administration_groupManager_addGroupWindow_saving_mask();

  @DefaultStringValue("loading...")
  public String administration_groupManager_loading_text();

  @DefaultStringValue("new group name")
  public String administration_groupManager_nameOfNewGroupLabel_emptyText();

  @DefaultStringValue("Remove")
  public String administration_groupManager_removeButton_value();

  @DefaultStringValue("Add")
  public String administration_groupManager_toolBar_addButton_value();

  @DefaultStringValue("Rename")
  public String administration_groupManager_toolBar_editButton_value();

  @DefaultStringValue("Remove")
  public String administration_groupManager_toolBar_removeButton_value();

  @DefaultStringValue("removing group...")
  public String administration_groupManager_toolBar_removing_mask();

  @DefaultStringValue("Search")
  public String administration_groupManager_toolBar_searchLabel();

  @DefaultStringValue("Name")
  public String administration_interactionTypes_interactionsGrid_nameColumn_text();

  @DefaultStringValue("Type")
  public String administration_interactionTypes_interactionsGrid_typeColumn_text();

  @DefaultStringValue("Interaction Type")
  public String administration_interactionTypes_toolbar_objectName_text();

  @DefaultStringValue("Cancel")
  public String administration_roleManagement_editRoleWindow_cancelButton_value();

  @DefaultStringValue("saving...")
  public String administration_roleManagement_editRoleWindow_grid_saving_mask();

  @DefaultStringValue("<<")
  public String administration_roleManagement_editRoleWindow_moveAllLeftButton_value();

  @DefaultStringValue(">>")
  public String administration_roleManagement_editRoleWindow_moveAllRightButton_value();

  @DefaultStringValue("<")
  public String administration_roleManagement_editRoleWindow_moveLeftButton_value();

  @DefaultStringValue(">")
  public String administration_roleManagement_editRoleWindow_moveRightButton_value();

  @DefaultStringValue("OK")
  public String administration_roleManagement_editRoleWindow_okButton_value();

  @DefaultStringValue("enter a description")
  public String administration_roleManagement_editRoleWindow_propertiesPanel_descriptionField_blankText();

  @DefaultStringValue("Description")
  public String administration_roleManagement_editRoleWindow_propertiesPanel_descriptionLabel_text();

  @DefaultStringValue("enter a name")
  public String administration_roleManagement_editRoleWindow_propertiesPanel_nameField_blankText();

  @DefaultStringValue("Name")
  public String administration_roleManagement_editRoleWindow_propertiesPanel_nameLabel_text();

  @DefaultStringValue("Role Properties")
  public String administration_roleManagement_editRoleWindow_propertiesPanel_title();

  @DefaultStringValue("Available Permissions")
  public String administration_roleManagement_editRoleWindow_sourceGrid_nameColumn_value();

  @DefaultStringValue("Assigned Permissions")
  public String administration_roleManagement_editRoleWindow_targetGrid_nameColumn_Value();

  @DefaultStringValue("Edit User Role")
  public String administration_roleManagement_editRoleWindow_window_title();

  @DefaultStringValue("Description")
  public String administration_roleManagement_grid_descriptionColumn_value();

  @DefaultStringValue("Role")
  public String administration_roleManagement_grid_nameColumn_value();

  @DefaultStringValue("Role Manager")
  public String administration_roleManagement_tabItem_title();

  @DefaultStringValue("Add")
  public String administration_roleManagement_toolBar_addButton_value();

  @DefaultStringValue("Copy")
  public String administration_roleManagement_toolBar_copyButton_value();

  @DefaultStringValue("Edit")
  public String administration_roleManagement_toolBar_editButton_value();

  @DefaultStringValue("deleting role...")
  public String administration_roleManagement_toolBar_removeButton_removing_mask();

  @DefaultStringValue("Delete")
  public String administration_roleManagement_toolBar_removeButton_value();

  @DefaultStringValue("Add All")
  public String administration_userManager_addEdit_administratorRole_groupPanel_addAllButton_value();

  @DefaultStringValue("Add")
  public String administration_userManager_addEdit_administratorRole_groupPanel_addButton_value();

  @DefaultStringValue("Groups Assigned to Supervisor:")
  public String administration_userManager_addEdit_administratorRole_groupPanel_assignedGroupsGrid_gridtitle();

  @DefaultStringValue("Groups:")
  public String administration_userManager_addEdit_administratorRole_groupPanel_groupsGrid_gridtitle();

  @DefaultStringValue("Remove All")
  public String administration_userManager_addEdit_administratorRole_groupPanel_removeAllButton_value();

  @DefaultStringValue("Remove")
  public String administration_userManager_addEdit_administratorRole_groupPanel_removeButton_value();

  @DefaultStringValue("Add or Edit User")
  public String administration_userManager_admin_newEditUser_windowHeader_title();

  @DefaultStringValue("Add or Edit User")
  public String administration_userManager_basic_newEditUser_windowHeader_title();

  @DefaultStringValue("Confirm Password")
  public String administration_userManager_editUser_confirmasswordFieldLabel_labelField();

  @DefaultStringValue("New Password")
  public String administration_userManager_editUser_newPasswordFieldLabel_labelField();

  @DefaultStringValue("Cancel")
  public String administration_userManager_editUser_resetPassword_cancelButton_value();

  @DefaultStringValue("Reset password")
  public String administration_userManager_editUser_resetPassword_header_title();

  @DefaultStringValue("Save")
  public String administration_userManager_editUser_resetPassword_saveButton_value();

  @DefaultStringValue("Reset Password")
  public String administration_userManager_editUser_resetPasswordButton_value();

  @DefaultStringValue("Belongs To Group")
  public String administration_userManager_grid_belongsToGroup_columnName();

  @DefaultStringValue("Database")
  public String administration_userManager_grid_database_columnName();

  @DefaultStringValue("Login ID")
  public String administration_userManager_grid_login_columnName();

  @DefaultStringValue("Name")
  public String administration_userManager_grid_name_columnName();

  @DefaultStringValue("N.")
  public String administration_userManager_grid_orderNumberTitle_columnName();

  @DefaultStringValue("User Role")
  public String administration_userManager_grid_role_columnName();

  @DefaultStringValue("Status")
  public String administration_userManager_grid_status_columnName();

  @DefaultStringValue("Surname")
  public String administration_userManager_grid_surname_columnName();

  @DefaultStringValue("Synchronized")
  public String administration_userManager_grid_synchronized_columnName();

  @DefaultStringValue("Status")
  public String administration_userManager_newEditUser_activeCheckButton_labelField();

  @DefaultStringValue("Cancel")
  public String administration_userManager_newEditUser_adminUser_cancelButton_value();

  @DefaultStringValue("Save")
  public String administration_userManager_newEditUser_adminUser_saveButton_value();

  @DefaultStringValue("Agent Group")
  public String administration_userManager_newEditUser_agentGroupComboBox_labelField();

  @DefaultStringValue("Agent ID")
  public String administration_userManager_newEditUser_agentIdRadioButton_labelField();

  @DefaultStringValue("Cancel")
  public String administration_userManager_newEditUser_basicUser_cancelButton_value();

  @DefaultStringValue("Save")
  public String administration_userManager_newEditUser_basicUser_saveButton_value();

  @DefaultStringValue("Re-Type Password")
  public String administration_userManager_newEditUser_confirmPasswordFieldLabel_labelField();

  @DefaultStringValue("Database")
  public String administration_userManager_newEditUser_databaseComboBox_labelField();

  @DefaultStringValue("De-Activation Date")
  public String administration_userManager_newEditUser_deactivationDate_labelField();

  @DefaultStringValue("Email")
  public String administration_userManager_newEditUser_emailFieldLabel_labelField();

  @DefaultStringValue("First Name")
  public String administration_userManager_newEditUser_firstNameFieldLabel_labelField();

  @DefaultStringValue("Language")
  public String administration_userManager_newEditUser_languageComboBox_labelField();

  @DefaultStringValue("Login ID")
  public String administration_userManager_newEditUser_loginFieldLabel_labelField();

  @DefaultStringValue("None")
  public String administration_userManager_newEditUser_noneRadioButton_labelField();

  @DefaultStringValue("Password")
  public String administration_userManager_newEditUser_passwordFieldLabel_labelField();

  @DefaultStringValue("Phone")
  public String administration_userManager_newEditUser_phoneRadioButton_labelField();

  @DefaultStringValue("User Role")
  public String administration_userManager_newEditUser_roleFieldLabel_labelField();

  @DefaultStringValue("Saving user...")
  public String administration_userManager_newEditUser_saving_mask();

  @DefaultStringValue("Surname")
  public String administration_userManager_newEditUser_surnameFieldLabel_labelField();

  @DefaultStringValue("Synchronized")
  public String administration_userManager_newEditUser_synchronizedCheckBox_labelField();

  @DefaultStringValue("Synchronize Now")
  public String administration_userManager_newEditUser_synchronizeNowButton_value();

  @DefaultStringValue("Synchronizing...")
  public String administration_userManager_newEditUser_synchronizing_mask();

  @DefaultStringValue("*no database*")
  public String administration_userManager_newUser_databaseComboBox_emptyText();

  @DefaultStringValue("*no language*")
  public String administration_userManager_newUser_languageComboBox_emptyText();

  @DefaultStringValue("Removing user...")
  public String administration_userManager_removeButton_removing_mask();

  @DefaultStringValue("*no group*")
  public String administration_userManager_tempText_defaultGroup();

  @DefaultStringValue("*no role*")
  public String administration_userManager_tempText_defaultRole();

  @DefaultStringValue("User Manager")
  public String administration_userManager_title();

  @DefaultStringValue("Add")
  public String administration_userManager_toolBar_addButton_value();

  @DefaultStringValue("Edit")
  public String administration_userManager_toolBar_editButton_value();

  @DefaultStringValue("Remove")
  public String administration_userManager_toolBar_removeButton_value();

  @DefaultStringValue("Search")
  public String administration_userManager_toolBar_searchButton_value();

  @DefaultStringValue("Add")
  public String administration_wrapUp_addButton_value();

  @DefaultStringValue("Wrapup Data")
  public String administration_wrapUp_grid_wrapUpData_columnName();

  @DefaultStringValue("data")
  public String administration_wrapUp_grid_wrapUpData_newRecord_emptyText();

  @DefaultStringValue("Wrapup Description")
  public String administration_wrapUp_grid_wrapUpDescription_columnName();

  @DefaultStringValue("description")
  public String administration_wrapUp_grid_wrapUpDescription_newRecord_emptyText();

  @DefaultStringValue("Wrapup")
  public String administration_wrapUp_header_title();

  @DefaultStringValue("Deleting...")
  public String administration_wrapUp_message_wrapUpDelete_deleting_mask();

  @DefaultStringValue("Remove")
  public String administration_wrapUp_removeButton_value();

  @DefaultStringValue("Edit")
  public String administration_wrapUp_toolBar_editButton_value();

  @DefaultStringValue("ZOOM ScoreCARD")
  public String applicationTitle_text();

  @DefaultStringValue("Add Widget")
  public String dashboard_dashboardTab_toolbar_addWidgetButtonText();

  @DefaultStringValue("Widgets per Row")
  public String dashboard_dashboardTab_toolbar_columnButtonTitle();

  @DefaultStringValue("Save")
  public String dashboard_dashboardTab_toolbar_saveButtonText();

  @DefaultStringValue("Default Dashboard")
  public String dashboard_defaultTab_title();

  @DefaultStringValue("loading...")
  public String dashboard_mask_loadMessage();

  @DefaultStringValue("please wait...")
  public String dashboard_mask_waitMessage();

  @DefaultStringValue("No")
  public String dashboard_panel_saveDialog_dontSaveCommand();

  @DefaultStringValue("Save Both")
  public String dashboard_panel_saveDialog_saveBothCommand();

  @DefaultStringValue("Save Default")
  public String dashboard_panel_saveDialog_saveDefaultCommand();

  @DefaultStringValue("Yes") // "Save User"
  public String dashboard_panel_saveDialog_saveUserCommand();

  @DefaultStringValue("Save Dashboard")
  public String dashboard_panel_saveDialog_title();

  @DefaultStringValue("Dashboard")
  public String dashboard_panel_title();

  @DefaultStringValue("Group")
  public String dashboard_topGroupsWidget_grid_header_nameColumn();

  @DefaultStringValue("Score")
  public String dashboard_topGroupsWidget_grid_header_scoreColumn();

  @DefaultStringValue("Agent")
  public String dashboard_topUsersWidget_grid_header_nameColumn();

  @DefaultStringValue("Score")
  public String dashboard_topUsersWidget_grid_header_scoreColumn();

  @DefaultStringValue("User Dashboard")
  public String dashboard_userTab_title();

  @DefaultStringValue("Title")
  public String dashboard_widet_titleFieldLabel();

  @DefaultStringValue("Refresh (minutes)")
  public String dashboard_widet_refreshFieldLabel();

  @DefaultStringValue("Bad Threshold")
  public String dashboard_widget_config_badTrasholdFieldField_label();

  @DefaultStringValue("Count")
  public String dashboard_widget_config_countField_label();

  @DefaultStringValue("Good Threshold")
  public String dashboard_widget_config_goodTrasholdFieldField_label();

  @DefaultStringValue("All Groups")
  public String dashboard_widget_config_groupCombo_allGroups();

  @DefaultStringValue("Group")
  public String dashboard_widget_config_groupCombo_label();

  @DefaultStringValue("Min-Max Value")
  public String dashboard_widget_config_minMaxTextField_label();

  @DefaultStringValue("Questionnaires")
  public String dashboard_widget_config_questformCombo_label();

  @DefaultStringValue("Questionnaire")
  public String dashboard_widget_config_questformComboPie_label();

  @DefaultStringValue("Add Questionnaire")
  public String dashboard_widget_config_questformCombo_initial_label();

  @DefaultStringValue("No Questionnaire")
  public String dashboard_widget_config_questformCombo_noQuestionnaire_label();

  @DefaultStringValue("No Item")
  public String dashboard_widget_config_combobox_noitem_label();

  @DefaultStringValue("Item")
  public String dashboard_widget_config_combobox_displayField_label();

  @DefaultStringValue("Save")
  public String dashboard_widget_config_saveButton_label();

  @DefaultStringValue("loading widget data...")
  public String dashboard_widget_loadingData_mask();

  @DefaultStringValue("Pie")
  public String dashboard_widget_title_pie();

  @DefaultStringValue("High Scoring Groups")
  public String dashboard_widget_title_topGroups();

  @DefaultStringValue("High Scoring Agents")
  public String dashboard_widget_title_topUsers();

  @DefaultStringValue("Trend")
  public String dashboard_widget_title_trend();

  @DefaultStringValue("Low Scoring Group")
  public String dashboard_widget_title_worstGroups();

  @DefaultStringValue("Low Scoring Agents")
  public String dashboard_widget_title_worstUsers();

  @DefaultStringValue("Add")
  public String editToolbar_addButton_text();

  @DefaultStringValue("Delete")
  public String editToolbar_deleteButton_text();

  @DefaultStringValue("Edit")
  public String editToolbar_editButton_text();

  @DefaultStringValue("Select a value")
  public String emptyComboOption_text();

  @DefaultStringValue("Feedback: [things to improve]")
  public String evaluations_evaluationList_evaluationForm_feedBackButton_grid_feedBackImprove_ColumnName();

  @DefaultStringValue("*no feedback*")
  public String evaluations_evaluationList_evaluationForm_feedBackButton_grid_feedBackImprove_defaultValue();

  @DefaultStringValue("Feedback: [things to maintain]")
  public String evaluations_evaluationList_evaluationForm_feedBackButton_grid_feedBackMaintain_ColumnName();

  @DefaultStringValue("*no feedback*")
  public String evaluations_evaluationList_evaluationForm_feedBackButton_grid_feedBackMaintain_defaultValue();

  @DefaultStringValue("N.")
  public String evaluations_evaluationList_evaluationForm_feedBackButton_grid_orderNumberTitle_columnName();

  @DefaultStringValue("Close")
  public String evaluations_evaluationList_evaluationForm_feedBackButton_toolBar_closeButton_value();

  @DefaultStringValue("Cancel")
  public String evaluations_evaluationPlanner_templateSaveWindow_cancelButton_value();

  @DefaultStringValue("Save Template")
  public String evaluations_evaluationPlanner_templateSaveWindow_heading_text();

  @DefaultStringValue("Save")
  public String evaluations_evaluationPlanner_templateSaveWindow_saveButton_value();

  @DefaultStringValue("Name")
  public String evaluations_evaluationPlanner_templateSaveWindow_templateNameLabel_labelField();

  @DefaultStringValue("Type")
  public String evaluations_evaluationPlanner_templateSaveWindow_templateTypeLabel_labelField();

  @DefaultStringValue("Template Type")
  public String evaluations_evaluationPlanner_templateWindow_grid_evalStatus_columnName();

  @DefaultStringValue("Last Modified")
  public String evaluations_evaluationPlanner_templateWindow_grid_lastModified_columnName();

  @DefaultStringValue("Name")
  public String evaluations_evaluationPlanner_templateWindow_grid_name_columnName();

  @DefaultStringValue("Templates")
  public String evaluations_evaluationPlanner_templateWindow_header_title();

  @DefaultStringValue("Saving")
  public String evaluations_evaluationPlanner_templateWindow_maskSaving_text();

  @DefaultStringValue("Close")
  public String evaluations_evaluationPlanner_templateWindow_toolbar_closeButton_value();

  @DefaultStringValue("Remove Template")
  public String evaluations_evaluationPlanner_templateWindow_toolbar_removeTemplateButton_value();

  @DefaultStringValue("Add Sub-Criteria")
  public String evaluations_evaluationsPlanner_addSubcriteriaTab_title();

  @DefaultStringValue("Apply To Statistics")
  public String evaluations_evaluationsPlanner_basic_applyToStatisticsCheckBox_fieldLabel();

  @DefaultStringValue("Media Direction")
  public String evaluations_evaluationsPlanner_basic_callDirectionComboLabel_fieldLabel();

  @DefaultStringValue("Delete")
  public String evaluations_evaluationsPlanner_basic_grid_deleteButton_value();

  @DefaultStringValue("Media Type")
  public String evaluations_evaluationsPlanner_basic_grid_mediaTypel_columnName();

  @DefaultStringValue("Min. Count")
  public String evaluations_evaluationsPlanner_basic_grid_minCount_columnName();

  @DefaultStringValue("Matching Interactions")
  public String evaluations_evaluationsPlanner_basic_matchingCallsLabel_fieldLabel();

  @DefaultStringValue("Delete")
  public String evaluations_evaluationsPlanner_basic_particularCallGrid_deleteButton_value();

  @DefaultStringValue("Wrapup")
  public String evaluations_evaluationsPlanner_basic_wrapupComboLabel_fieldLabel();

  @DefaultStringValue("Agent:")
  public String evaluations_evaluationsPlanner_basicTab_tableTitleLabel_agent_fieldLabel();

  @DefaultStringValue("Evaluator:")
  public String evaluations_evaluationsPlanner_basicTab_tableTitleLabel_evaluator_fieldLabel();

  @DefaultStringValue("Group:")
  public String evaluations_evaluationsPlanner_basicTab_tableTitleLabel_group_fieldLabel();

  @DefaultStringValue("Select All/None")
  public String evaluations_evaluationsPlanner_basicTab_tableTitleLabel_selectAllEvaluatorsCheckBox_fieldLabel();

  @DefaultStringValue("Select All/None")
  public String evaluations_evaluationsPlanner_basicTab_tableTitleLabel_selectAllGroupsCheckBox_fieldLabel();

  @DefaultStringValue("Group:")
  public String evaluations_evaluationsPlanner_basicTab_tableTitleLabel_userGroup_fieldLabel();

  @DefaultStringValue("Basic")
  public String evaluations_evaluationsPlanner_basicTab_title();

  @DefaultStringValue("OK")
  public String evaluations_evaluationsPlanner_created_infoDialog_okButton();

  @DefaultStringValue("OK")
  public String evaluations_evaluationsPlanner_failed_infoDialog_okButton();

  @DefaultStringValue("From")
  public String evaluations_evaluationsPlanner_fromDateLabel_fieldLabel();

  @DefaultStringValue("Time From")
  public String evaluations_evaluationsPlanner_fromDateLabel_subcriteria_fieldLabel();

  @DefaultStringValue("Group Evaluation")
  public String evaluations_evaluationsPlanner_groupEvaluationRadioLabel_fieldLabel();

  @DefaultStringValue("Interaction Count")
  public String evaluations_evaluationsPlanner_interactionCountLabel_fieldLabel();

  @DefaultStringValue("Date Range")
  public String evaluations_evaluationsPlanner_periodComboLabel_fieldLabel();

  @DefaultStringValue("Evaluator")
  public String evaluations_evaluationsPlanner_singleAgentEvaluationChooser_evaluatorComboLabel_fieldLabel();

  @DefaultStringValue("Add Interaction")
  public String evaluations_evaluationsPlanner_subcriteria_addParticularCallButton_value();

  @DefaultStringValue("Allow Replacement")
  public String evaluations_evaluationsPlanner_subcriteria_allowCallReplacementButton_value();

  @DefaultStringValue("Allow Selection")
  public String evaluations_evaluationsPlanner_subcriteria_allowCallSelectionButton_value();

  @DefaultStringValue("Allow Modification")
  public String evaluations_evaluationsPlanner_subcriteria_allowModificationCheckBox_value();

  @DefaultStringValue("Allow random calls selection")
  public String evaluations_evaluationsPlanner_subcriteria_allowRandomCallsButton_value();

  @DefaultStringValue("Days To Deadline")
  public String evaluations_evaluationsPlanner_subcriteria_daysToDeadlineFieldLabel_labelField();

  @DefaultStringValue("Deadline")
  public String evaluations_evaluationsPlanner_subcriteria_deadlineDateCombo_labelField();

  @DefaultStringValue("Remove")
  public String evaluations_evaluationsPlanner_subcriteria_externalData_deleteLineButton_value();

  @DefaultStringValue("Finish this Sub-Criteria before continuing?")
  public String evaluations_evaluationsPlanner_subcriteria_finishThisSubcriteriaBeforeContinueCheckBox_labelField();

  @DefaultStringValue("Add External Data")
  public String evaluations_evaluationsPlanner_subcriteria_first_addLineButton_value();

  @DefaultStringValue("Comparison")
  public String evaluations_evaluationsPlanner_subcriteria_grid_comparation_columnName();

  @DefaultStringValue("External Data")
  public String evaluations_evaluationsPlanner_subcriteria_grid_externalData_columnName();

  @DefaultStringValue("Logical Operator")
  public String evaluations_evaluationsPlanner_subcriteria_grid_logicalOperator_columnName();

  @DefaultStringValue("Value")
  public String evaluations_evaluationsPlanner_subcriteria_grid_value_columnName();

  @DefaultStringValue("Value Type")
  public String evaluations_evaluationsPlanner_subcriteria_grid_valueType_columnName();

  @DefaultStringValue("0:00")
  public String evaluations_evaluationsPlanner_subcriteria_maxLengthField_blankText();

  @DefaultStringValue("Max. Length")
  public String evaluations_evaluationsPlanner_subcriteria_maxLengthLabel_labelField();

  @DefaultStringValue("0:00")
  public String evaluations_evaluationsPlanner_subcriteria_minLengthField_blankText();

  @DefaultStringValue("Min. Length")
  public String evaluations_evaluationsPlanner_subcriteria_minLengthLabel_labelField();

  @DefaultStringValue("Remind Evaluator?")
  public String evaluations_evaluationsPlanner_subcriteria_remindEvaluatorLabel_labelField();

  @DefaultStringValue("Add Media Type")
  public String evaluations_evaluationsPlanner_subcriteria_second_addLineButton_value();

  @DefaultStringValue("Remove")
  public String evaluations_evaluationsPlanner_subcriteria_second_deleteLineButton_value();

  @DefaultStringValue("Weekdays")
  public String evaluations_evaluationsPlanner_subcriteria_weekdaysLabel_labelField();

  @DefaultStringValue("Sub-Criteria")
  public String evaluations_evaluationsPlanner_subcriteriaTab_title();

  @DefaultStringValue("To")
  public String evaluations_evaluationsPlanner_toDateLabel_fieldLabel();

  @DefaultStringValue("To")
  public String evaluations_evaluationsPlanner_toDateLabel_subcriteria_fieldLabel();

  @DefaultStringValue("Close")
  public String evaluations_evaluationsPlanner_toolbar_cancelButton_value();

  @DefaultStringValue("Count Matching Interactions")
  public String evaluations_evaluationsPlanner_toolbar_countMatchingCallsButton_value();

  @DefaultStringValue("Create Evaluations")
  public String evaluations_evaluationsPlanner_toolbar_createEvaluationsButton_value();

  @DefaultStringValue("Save As Template")
  public String evaluations_evaluationsPlanner_toolbar_templateSaveButton_value();

  @DefaultStringValue("Templates")
  public String evaluations_evaluationsPlanner_toolbar_templatesButton_value();

  @DefaultStringValue("Load Template")
  public String evaluations_evaluationsPlanner_toolbar_templateSelectButton_value();

  @DefaultStringValue("Questionnaire")
  public String evaluations_evaluationsPlanner_usedQuastionaireComboBox_fieldLabel();

  @DefaultStringValue("Agent Evaluation")
  public String evaluations_evaluationsPlanner_userEvaluationRadioLabel_fieldLabel();

  @DefaultStringValue("Deleting evaluation...")
  public String evaluations_listOfEvaluations_deleteEvaluation_deleting_mask();

  @DefaultStringValue("Getting random interactions...")
  public String evaluations_listOfEvaluations_evaluate_addRandomCall_getting_mask();

  @DefaultStringValue("Agent:")
  public String evaluations_listOfEvaluations_evaluate_agentField_labelField();

  @DefaultStringValue("Comments")
  public String evaluations_listOfEvaluations_evaluate_commentsTextArea_labelField();

  @DefaultStringValue("Agent:")
  public String evaluations_listOfEvaluations_evaluate_evaluate_agentLabel_labelField();

  @DefaultStringValue("select a category")
  public String evaluations_listOfEvaluations_evaluate_evaluate_categoryComboBox_emptyText();

  @DefaultStringValue("Category")
  public String evaluations_listOfEvaluations_evaluate_evaluate_categoryComboBox_labelField();

  @DefaultStringValue("Evaluation period:")
  public String evaluations_listOfEvaluations_evaluate_evaluate_evaluationPeriodLabel_labelField();

  @DefaultStringValue("Open")
  public String evaluations_listOfEvaluations_evaluate_evaluate_openUrlButton_label();

  @DefaultStringValue("Date:")
  public String evaluations_listOfSurveys_evaluate_evaluate_surveyCallDate_labelField();

  @DefaultStringValue("Feedback Panel")
  public String evaluations_listOfEvaluations_evaluate_evaluate_feedbackPanel_headerTitle();

  @DefaultStringValue("Answer")
  public String evaluations_listOfEvaluations_evaluate_evaluate_grid_answer_columnName();

  @DefaultStringValue("Group")
  public String evaluations_listOfEvaluations_evaluate_evaluate_grid_group_columnName();

  @DefaultStringValue("Question")
  public String evaluations_listOfEvaluations_evaluate_evaluate_grid_question_columnName();

  @DefaultStringValue("Internal Note")
  public String evaluations_listOfEvaluations_evaluate_evaluate_internalNoteTextArea_labelField();

  @DefaultStringValue("Mail Tracking Number")
  public String evaluations_listOfEvaluations_evaluate_evaluate_mailTrackingNumberFieldLabel_labelField();

  @DefaultStringValue("Select Interaction")
  public String evaluations_listOfEvaluations_evaluate_evaluate_playRelatedCallComboBox_emptyText();

  @DefaultStringValue("Play")
  public String evaluations_listOfEvaluations_evaluate_evaluate_playRelatedCallComboBox_labelField();

  @DefaultStringValue("Questionnaire:")
  public String evaluations_listOfEvaluations_evaluate_evaluate_questionaireFieldLabel_labelField();

  @DefaultStringValue("Evaluator Form")
  public String evaluations_listOfEvaluations_evaluate_evaluate_tabTitle_evaluatorForm();

  @DefaultStringValue("Ticket Number")
  public String evaluations_listOfEvaluations_evaluate_evaluate_ticketNumberFieldLabel_labelField();

  @DefaultStringValue("Close")
  public String evaluations_listOfEvaluations_evaluate_evaluate_toolBar_closeQuestionareButton_value();

  @DefaultStringValue("Things To Improve")
  public String evaluations_listOfEvaluations_evaluate_evaluate_toolBar_feedbackFoeAgentToImproveTextArea_labelField();

  @DefaultStringValue("Things To Maintain")
  public String evaluations_listOfEvaluations_evaluate_evaluate_toolBar_feedbackFoeAgentToMaintainTextArea_labelField();

  @DefaultStringValue("Go To Reports")
  public String evaluations_listOfEvaluations_evaluate_evaluate_toolBar_goToReportsButton_value();

  @DefaultStringValue("Save & Close")
  public String evaluations_listOfEvaluations_evaluate_evaluate_toolBar_saveAndCloseButton_value();

  @DefaultStringValue("Save for later")
  public String evaluations_listOfTraining_evaluate_evaluate_toolBar_saveForLater_value();

  @DefaultStringValue("Send Recording")
  public String evaluations_listOfEvaluations_evaluate_evaluate_toolBar_sendRecordingButton_value();

  @DefaultStringValue("Evaluator:")
  public String evaluations_listOfEvaluations_evaluate_evaluatorLabel_labelField();

  @DefaultStringValue("OK")
  public String evaluations_listOfEvaluations_evaluate_fastNoteWindow_okButton_value();

  @DefaultStringValue("Quick Note")
  public String evaluations_listOfEvaluations_evaluate_fastNoteWindow_title();

  @DefaultStringValue("Feedback")
  public String evaluations_listOfEvaluations_evaluate_feedbackPart_headerTitle();

  @DefaultStringValue("Current Rating")
  public String evaluations_listOfEvaluations_evaluate_grid_columnName_currentRating();

  @DefaultStringValue("Note")
  public String evaluations_listOfEvaluations_evaluate_grid_columnName_note();

  @DefaultStringValue("Type")
  public String evaluations_listOfEvaluations_evaluate_grid_columnName_type();

  @DefaultStringValue("Delete")
  public String evaluations_listOfEvaluations_evaluate_grid_deleteButton_value();

  @DefaultStringValue("End")
  public String evaluations_listOfEvaluations_evaluate_grid_end_columnName();

  @DefaultStringValue("Evaluate")
  public String evaluations_listOfEvaluations_evaluate_grid_evaluateButton_value();

  @DefaultStringValue("Training")
  public String evaluations_listOfEvaluations_evaluate_grid_trainButton_value();

  @DefaultStringValue("View") // displays read only version of grade form
  public String evaluations_listOfEvaluations_evaluate_grid_viewButton_value();

  @DefaultStringValue("Quick Note")
  public String evaluations_listOfEvaluations_evaluate_grid_fastNoteButton_value();

  @DefaultStringValue("From")
  public String evaluations_listOfEvaluations_evaluate_grid_from_columnName();

  @DefaultStringValue("Length")
  public String evaluations_listOfEvaluations_evaluate_grid_length_columnName();

  @DefaultStringValue("N.")
  public String evaluations_listOfEvaluations_evaluate_grid_nColumn_columnName();

  @DefaultStringValue("Play")
  public String evaluations_listOfEvaluations_evaluate_grid_play_columnName();

  @DefaultStringValue("Replace")
  public String evaluations_listOfEvaluations_evaluate_grid_replaceButton_value();

  @DefaultStringValue("Start")
  public String evaluations_listOfEvaluations_evaluate_grid_start_columnName();

  @DefaultStringValue("To")
  public String evaluations_listOfEvaluations_evaluate_grid_to_columnName();

  @DefaultStringValue("Include In Statistics")
  public String evaluations_listOfEvaluations_evaluate_changeEvalutionParametersWindow_applyToStatistics_label();

  @DefaultStringValue("Include In Statistics")
  public String evaluations_listOfEvaluations_evaluate_changeEvalutionParametersWindow_applyToStatistics_title();

  @DefaultStringValue("Cancel")
  public String evaluations_listOfEvaluations_evaluate_changeEvalutionParametersWindow_cancelButton_value();

  @DefaultStringValue("OK")
  public String evaluations_listOfEvaluations_evaluate_changeEvalutionParametersWindow_okButton_value();

  @DefaultStringValue("*none*")
  public String evaluations_listOfEvaluations_evaluate_periodFieldLabel_defaultValue_none();

  @DefaultStringValue("Evaluation Period:")
  public String evaluations_listOfEvaluations_evaluate_periodFieldLabel_labelField();

  @DefaultStringValue("Play Video")
  public String evaluations_listOfEvaluations_evaluate_playVideoButton_title();

  @DefaultStringValue("Questionnaire:")
  public String evaluations_listOfEvaluations_evaluate_questionaryFieldLabel_labelField();

  @DefaultStringValue("Saving...")
  public String evaluations_listOfEvaluations_evaluate_saving_mask();

  @DefaultStringValue("Include In Statistics")
  public String evaluations_listOfEvaluations_evaluate_showEvaluationParameters_applyToStatististics();

  @DefaultStringValue("Main Criteria")
  public String evaluations_listOfEvaluations_evaluate_showEvaluationParameters_mainCriteria();

  @DefaultStringValue("Sub-Criteria")
  public String evaluations_listOfEvaluations_evaluate_showEvaluationParameters_subCriteria();

  @DefaultStringValue("Allow random call selection")
  public String evaluations_listOfEvaluations_evaluate_showEvaluationsParameters_allowCallFilling_text();

  @DefaultStringValue("Allow Replacement")
  public String evaluations_listOfEvaluations_evaluate_showEvaluationsParameters_allowCallReplacement_text();

  @DefaultStringValue("Allow Selection")
  public String evaluations_listOfEvaluations_evaluate_showEvaluationsParameters_allowCallSelection_text();

  @DefaultStringValue("Media Direction")
  public String evaluations_listOfEvaluations_evaluate_showEvaluationsParameters_callDirection_text();

  @DefaultStringValue("Call Wrapup")
  public String evaluations_listOfEvaluations_evaluate_showEvaluationsParameters_callWrapup_text();

  @DefaultStringValue("Total Interaction Count")
  public String evaluations_listOfEvaluations_evaluate_showEvaluationsParameters_countTotalInteractions_text();

  @DefaultStringValue("External Data")
  public String evaluations_listOfEvaluations_evaluate_showEvaluationsParameters_externalData_text();

  @DefaultStringValue("Interactions")
  public String evaluations_listOfEvaluations_evaluate_showEvaluationsParameters_interactions_text();

  @DefaultStringValue("Wrapup")
  public String evaluations_listOfEvaluations_evaluate_showEvaluationsParameters_wrapUp_text();

  @DefaultStringValue("Close")
  public String evaluations_listOfEvaluations_evaluate_showEvalutionParametersWindow_closeButton_value();

  @DefaultStringValue("Add Interactions")
  public String evaluations_listOfEvaluations_evaluate_toolBar_addParticularCallButton_value();

  @DefaultStringValue("Complete")
  public String evaluations_listOfEvaluations_evaluate_toolBar_completeEvaluationButton_value();

  @DefaultStringValue("Report")
  public String evaluations_listOfEvaluations_evaluate_toolBar_evaluationReportButton_value();

  @DefaultStringValue("Evaluation Feedback [things to improve]")
  public String evaluations_listOfEvaluations_evaluate_toolBar_feedbackFoeAgentToImproveTextArea_labelField();

  @DefaultStringValue("Evaluation Feedback [things to maintain]")
  public String evaluations_listOfEvaluations_evaluate_toolBar_feedbackFoeAgentToMaintainTextArea_labelField();

  @DefaultStringValue("Add Random Interactions")
  public String evaluations_listOfEvaluations_evaluate_toolBar_getRandomIterationsButton_value();

  @DefaultStringValue("Change parameters")
  public String evaluations_listOfEvaluations_evaluate_toolBar_changeEvaluationParametersWindow_title();

  @DefaultStringValue("Remove")
  public String evaluations_listOfEvaluations_evaluate_toolBar_removeSelectedIterationsButton_value();

  @DefaultStringValue("Send Feedback")
  public String evaluations_listOfEvaluations_evaluate_toolBar_sendFeedbackButton_value();

  @DefaultStringValue("Evaluation Info")
  public String evaluations_listOfEvaluations_evaluate_toolBar_showEvaluationParametersButton_value();

  @DefaultStringValue("Total Rating")
  public String evaluations_listOfEvaluations_evaluate_totalRatingLabel_labelField();

  @DefaultStringValue("[not available]")
  public String evaluations_listOfEvaluations_evaluate_unavailable_tempValue();

  @DefaultStringValue("Evaluate")
  public String evaluations_listOfEvaluations_evaluateButton_value();

  @DefaultStringValue("Adding interactions...")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCall_adding_mask();

  @DefaultStringValue("Searching interactions...")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCall_searching_mask();

  @DefaultStringValue("Add Interactions")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallWindow_addCallsButton_value();

  @DefaultStringValue("Agent")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallWindow_agentFieldLabel_labelField();

  @DefaultStringValue("Media Direction")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallWindow_callDirectionComboBox_labelField();

  @DefaultStringValue("Media Type")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallWindow_callTypeComboBox_labelField();

  @DefaultStringValue("Count")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallWindow_count_label();

  @DefaultStringValue("Description")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallWindow_descriptionFieldLabel_labelField();

  @DefaultStringValue("External Data Key")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallWindow_externalDataKeyComboBox_labelField();

  @DefaultStringValue("External Data Value")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallWindow_externalDataValueFieldLabel_labelField();

  @DefaultStringValue("Customer Number")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallWindow_customerNumberFieldLabel_labelField();

  @DefaultStringValue("From")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallWindow_fromDateLabel_labelField();

  @DefaultStringValue("End")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallWindow_grid_columnName_end();

  @DefaultStringValue("From")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallWindow_grid_columnName_from();

  @DefaultStringValue("Length")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallWindow_grid_columnName_length();

  @DefaultStringValue("Main")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallWindow_grid_columnName_main();

  @DefaultStringValue("SID")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallWindow_grid_columnName_sid();

  @DefaultStringValue("Start")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallWindow_grid_columnName_start();

  @DefaultStringValue("To")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallWindow_grid_columnName_to();

  @DefaultStringValue("Add Specific Interaction(s)")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallWindow_header_title();

  @DefaultStringValue("Loading interactions...")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallWindow_loadingCalls_mask();

  @DefaultStringValue("Max. length")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallWindow_maxlength_label();

  @DefaultStringValue("Min. length")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallWindow_minlength_label();

  @DefaultStringValue("Period")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallWindow_periodComboBox_labelField();

  @DefaultStringValue("Search")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallWindow_searchButton_value();

  @DefaultStringValue("To")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallWindow_toDateLabel_labelField();

  @DefaultStringValue("Wrapup")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallWindow_wrapupComboBox_labelField();

  @DefaultStringValue("Completing...")
  public String evaluations_listOfEvaluations_evaluatePanel_completeEvalution_completing_mask();

  @DefaultStringValue("creating evaluations...")
  public String evaluations_listOfEvaluations_evaluatePanel_createEvaluations_mask();

  @DefaultStringValue("Saving...")
  public String evaluations_listOfEvaluations_evaluatePanel_gradingPanel_saveButton_saving_mask();

  @DefaultStringValue("Removing interactions...")
  public String evaluations_listOfEvaluations_evaluatePanel_removeCalls_removing_mask();

  @DefaultStringValue("Replacing interaction...")
  public String evaluations_listOfEvaluations_evaluatePanel_replaceCall_replacing_mask();

  @DefaultStringValue("Verifying interaction...")
  public String evaluations_listOfEvaluations_evaluatePanel_replaceCall_verifying_mask();

  @DefaultStringValue("Sending feedback...")
  public String evaluations_listOfEvaluations_evaluatePanel_sendFeedback_sending_mask();

  @DefaultStringValue("Agent")
  public String evaluations_listOfEvaluations_grid_agent_columnName();

  @DefaultStringValue("Evaluator")
  public String evaluations_listOfEvaluations_grid_columnName_evaluator();

  @DefaultStringValue("ID")
  public String evaluations_listOfEvaluations_grid_columnName_id();

  @DefaultStringValue("ID")
  public String evaluations_listOfEvaluations_grid_id_columnName();

  @DefaultStringValue("Last Modified")
  public String evaluations_listOfEvaluations_grid_lastModified_columnName();

  @DefaultStringValue("Created")
  public String evaluations_listOfEvaluations_grid_evaluateDate_columnName();

  @DefaultStringValue("N.")
  public String evaluations_listOfEvaluations_grid_nColumn_columnName();

  @DefaultStringValue("Period From")
  public String evaluations_listOfEvaluations_grid_periodFrom_columnName();

  @DefaultStringValue("Period To")
  public String evaluations_listOfEvaluations_grid_periodTo_columnName();

  @DefaultStringValue("Ques. Name")
  public String evaluations_listOfEvaluations_grid_questionaireName_columnName();

  @DefaultStringValue("Score")
  public String evaluations_listOfEvaluations_grid_score_columnName();

  @DefaultStringValue("Status")
  public String evaluations_listOfEvaluations_grid_status_columnName();

  @DefaultStringValue("Calling Number")
  public String evaluations_listOfEvaluations_grid_callingNr_columnName();

  @DefaultStringValue("Called Number")
  public String evaluations_listOfEvaluations_grid_callredNr_columnName();

  @DefaultStringValue("Media Direction")
  public String evaluations_listOfEvaluations_grid_direction_columnName();

  @DefaultStringValue("New")
  public String evaluations_listOfEvaluations_newEvaluationButton_value();

  @DefaultStringValue("Evaluation Planner")
  public String evaluations_listOfEvaluations_reevaluate_tabItem_title();

  @DefaultStringValue("Agent")
  public String evaluations_listOfEvaluations_SearchCriteria_agentFieldLabel_labelField();

  @DefaultStringValue("Select Media Direction")
  public String evaluations_listOfEvaluations_searchCriteria_callDirectionFieldLabel_defaultCallDirection();

  @DefaultStringValue("Media Direction")
  public String evaluations_listOfEvaluations_SearchCriteria_callDirectionFieldLabel_labelField();

  @DefaultStringValue("Category")
  public String evaluations_listOfEvaluations_SearchCriteria_categoryFieldLabel_labelField();

  @DefaultStringValue("Clear")
  public String evaluations_listOfEvaluations_SearchCriteria_clearButton_value();

  @DefaultStringValue("From")
  public String evaluations_listOfEvaluations_searchCriteria_fromDateLabel_fieldLabel();

  @DefaultStringValue("Group")
  public String evaluations_listOfEvaluations_SearchCriteria_groupFieldLabel_labelField();

  @DefaultStringValue("Search Criteria")
  public String evaluations_listOfEvaluations_SearchCriteria_header_title();

  @DefaultStringValue("To")
  public String evaluations_listOfEvaluations_searchCriteria_ID_tempText_to();

  @DefaultStringValue("From")
  public String evaluations_listOfEvaluations_searchCriteria_ID_tempTextl_from();

  @DefaultStringValue("ID")
  public String evaluations_listOfEvaluations_SearchCriteria_idFieldLabel_labelField();

  @DefaultStringValue("Period")
  public String evaluations_listOfEvaluations_searchCriteria_periodComboLabel_fieldLabel();

  @DefaultStringValue("Select Period")
  public String evaluations_listOfEvaluations_searchCriteria_periodFieldLabel_defaultPeriod();

  @DefaultStringValue("Period")
  public String evaluations_listOfEvaluations_SearchCriteria_periodFieldLabel_labelField();

  @DefaultStringValue("Select Interaction Questionnaire")
  public String evaluations_listOfEvaluations_searchCriteria_questionaireFieldLabel_defaultQuestionaire();

  @DefaultStringValue("Questionnaire")
  public String evaluations_listOfEvaluations_SearchCriteria_questionaireFieldLabel_labelField();

  @DefaultStringValue("To")
  public String evaluations_listOfEvaluations_searchCriteria_score_tempText_to();

  @DefaultStringValue("From")
  public String evaluations_listOfEvaluations_searchCriteria_score_tempTextl_from();

  @DefaultStringValue("Score")
  public String evaluations_listOfEvaluations_SearchCriteria_scoreFieldLabel_labelField();

  @DefaultStringValue("Search")
  public String evaluations_listOfEvaluations_SearchCriteria_searchButton_value();

  @DefaultStringValue("Evaluator")
  public String evaluations_listOfEvaluations_SearchCriteria_supervisorFieldLabel_labelField();

  @DefaultStringValue("Select User")
  public String evaluations_listOfEvaluations_searchCriteria_tempText_defaultUser();

  @DefaultStringValue("To")
  public String evaluations_listOfEvaluations_searchCriteria_toDateLabel_fieldLabel();

  @DefaultStringValue("Select Wrapup")
  public String evaluations_listOfEvaluations_searchCriteria_wrapUpFieldLabel_defaultWrapUp();

  @DefaultStringValue("Wrapup")
  public String evaluations_listOfEvaluations_SearchCriteria_wrapUpFieldLabel_labelField();

  @DefaultStringValue("Send Evaluation Feedback")
  public String evaluations_listOfEvaluations_sendFeedback_dialog_title();

  @DefaultStringValue("Send")
  public String evaluations_listOfEvaluations_sendFeedbackDialog_sendButton();

  @DefaultStringValue("Select Status")
  public String evaluations_listOfEvaluations_showComboBox_defaultValue();

  @DefaultStringValue("All")
  public String evaluations_listOfEvaluations_showComboBox_evalStatusAll_text();

  @DefaultStringValue("Evaluation List")
  public String evaluations_listOfEvaluations_tabTitle();

  @DefaultStringValue("Training List")
  public String evaluations_listOfTraining_tabTitle();

  @DefaultStringValue("Customer Surveys")
  public String evaluations_listOfIVR_tabTitle();

  @DefaultStringValue("Delete...")
  public String evaluations_listOfEvaluations_toolBar_deleteEvaluationsButton_value();

  @DefaultStringValue("Report")
  public String evaluations_listOfEvaluations_toolBar_evaluationReportButton_value();

  @DefaultStringValue("Feedback History")
  public String evaluations_listOfEvaluations_toolBar_historyForFeedbacksButton_title();

  @DefaultStringValue("Feedback History")
  public String evaluations_listOfEvaluations_toolBar_historyForFeedbacksButton_value();

  @DefaultStringValue("Reevaluate")
  public String evaluations_listOfEvaluations_toolBar_reevaluateSelectedEvaluationsButton_value();

  @DefaultStringValue("Reopen")
  public String evaluations_listOfEvaluations_toolBar_reopenSelectedEvaluationsButton_value();

  @DefaultStringValue("Search")
  public String evaluations_listOfEvaluations_toolBar_searchEvaluationsButton_value();

  @DefaultStringValue("Send Evaluation Feedback")
  public String evaluations_listOfEvaluations_toolBar_sendEvaluationAgentFeedbackButton_value();

  @DefaultStringValue("Send Evaluation Feedback")
  public String evaluations_listOfEvaluations_toolBar_sendEvaluationFeedbackButton_value();

  @DefaultStringValue("Average")
  public String evaluatorsChart_questionaireMode_averageLine_legend();

  @DefaultStringValue("About")
  public String guiFactoryImpl_branch_about();

  @DefaultStringValue("About")
  public String guiFactoryImpl_branch_aboutNode();

  @DefaultStringValue("Group Manager")
  public String guiFactoryImpl_branch_administration_groupManager();

  @DefaultStringValue("Administration")
  public String guiFactoryImpl_branch_administrationNode();

  @DefaultStringValue("Agent Dashboard")
  public String guiFactoryImpl_branch_agentDashBoardNode();

  @DefaultStringValue("Agent Averages per Questionnaire")
  public String guiFactoryImpl_branch_agentNode();

  @DefaultStringValue("ScoreCARD Options")
  public String guiFactoryImpl_branch_applicationOptions();

  @DefaultStringValue("ScoreCARD Options")
  public String guiFactoryImpl_branch_applicationOptionsNode();

  @DefaultStringValue("Audit Log")
  public String guiFactoryImpl_branch_auditLog();

  @DefaultStringValue("Audit Log")
  public String guiFactoryImpl_branch_auditLogNode();

  @DefaultStringValue("Group Averages per Questionnaire")
  public String guiFactoryImpl_branch_averageAgentNode();

  @DefaultStringValue("Agent Averages in Group")
  public String guiFactoryImpl_branch_averageGroupNode();

  @DefaultStringValue("Category")
  public String guiFactoryImpl_branch_category();

  @DefaultStringValue("Category")
  public String guiFactoryImpl_branch_categoryNode();

  @DefaultStringValue("Compare Scores")
  public String guiFactoryImpl_branch_compareScoringNode();

  @DefaultStringValue("Evaluations")
  public String guiFactoryImpl_branch_evaluationListNode();

  @DefaultStringValue("Evaluation Planner")
  public String guiFactoryImpl_branch_evaluationPlannerNode();

  @DefaultStringValue("Training Planner")
  public String guiFactoryImpl_branch_trainingPlannerNode();

  @DefaultStringValue("Evaluation Planner")
  public String guiFactoryImpl_branch_evaluations_evaluationPlanner();

  @DefaultStringValue("Graphs")
  public String guiFactoryImpl_branch_graphsNode();

  @DefaultStringValue("Compare Agents")
  public String guiFactoryImpl_branch_graphsNode_compareAgents();

  @DefaultStringValue("Compare Evaluators")
  public String guiFactoryImpl_branch_graphsNode_compareEvaluators();

  @DefaultStringValue("Agent Skills")
  public String guiFactoryImpl_branch_graphsNode_skillsOfAgent();

  @DefaultStringValue("Results Distribution")
  public String guiFactoryImpl_branch_graphsNode_trendChart();

  @DefaultStringValue("Group Manager")
  public String guiFactoryImpl_branch_groupManagerNode();

  @DefaultStringValue("Interaction Types")
  public String guiFactoryImpl_branch_interactionTypeNode();

  @DefaultStringValue("Interaction Types")
  public String guiFactoryImpl_branch_interactionTypes();

  @DefaultStringValue("Evaluation List")
  public String guiFactoryImpl_branch_listOfEvaluationsNode();

  @DefaultStringValue("Questionnaire Manager")
  public String guiFactoryImpl_branch_questionaireManagerNode();

  @DefaultStringValue("Questionnaires")
  public String guiFactoryImpl_branch_questionairesListNode();

  @DefaultStringValue("Compare Agents")
  public String guiFactoryImpl_branch_reports_agentsChart();

  @DefaultStringValue("Compare Evaluators")
  public String guiFactoryImpl_branch_reports_evaluatorsChart();

  @DefaultStringValue("Graphs")
  public String guiFactoryImpl_branch_reports_graphs();

  @DefaultStringValue("Info")
  public String gradingPanel_infoButton();

  @DefaultStringValue("Results Distribution")
  public String guiFactoryImpl_branch_reports_questionTrendChart();

  @DefaultStringValue("Agent Skills")
  public String guiFactoryImpl_branch_reports_skillsForAgent();

  @DefaultStringValue("Reports")
  public String guiFactoryImpl_branch_reportsNode();

  @DefaultStringValue("Role Manager")
  public String guiFactoryImpl_branch_roleManagementNode();

  @DefaultStringValue("Trend Reports")
  public String guiFactoryImpl_branch_trendNode();

  @DefaultStringValue("User Manager")
  public String guiFactoryImpl_branch_userManagerNode();

  @DefaultStringValue("Wrapup")
  public String guiFactoryImpl_branch_wrapUp();

  @DefaultStringValue("Wrapup")
  public String guiFactoryImpl_branch_wrapUpNode();

  @DefaultStringValue("Reports")
  public String guiFactoryImpl_logiReportsError_title();

  @DefaultStringValue("Error loading the report - check the configuration")
  public String guiFactoryImpl_logiReportsError_text();

  @DefaultStringValue("Cancel")
  public String loginDialog_cancelButton_value();

  @DefaultStringValue("Clear")
  public String loginDialog_cleanButton_value();

  @DefaultStringValue("Forgot password?")
  public String loginDialog_forgotPassword_value();

  @DefaultStringValue("Log In")
  public String loginDialog_header_loginText();

  @DefaultStringValue("Log In")
  public String loginDialog_loginButton_value();

  @DefaultStringValue("Log In")
  public String loginDialog_loginTextField_labelField();

  @DefaultStringValue("Warning: The next incorrect entry will lead to the account being locked")
  public String loginDialog_message_loginFailedAboutToLock();

  @DefaultStringValue("Invalid username or password!")
  public String loginDialog_message_loginFailedLabel();

  @DefaultStringValue("Warning: The account has been temporarily locked")
  public String loginDialog_message_loginFailedLocked();

  @DefaultStringValue("A problem occurred during the authentication process - please try again later")
  public String loginDialog_message_loginFailedThirdParty();

  @DefaultStringValue("Password")
  public String loginDialog_passwordTextField_labelField();

  @DefaultStringValue("Dashboard")
  public String navigation_dashboard_title();

  @DefaultStringValue("Group")
  public String qreports_graphs_skillsOfAgent_toolbar_groupLabel_labelField();

  @DefaultStringValue("All")
  public String qreports_graphs_skillsOfAgent_sidebar_checkboxlabelall_labelField();

  @DefaultStringValue("Status")
  public String questionaires_Questionaire_Grid_completedColumn_value();

  @DefaultStringValue("Name")
  public String questionaires_Questionaire_Grid_NameColumn_Value();

  @DefaultStringValue("Scoring System")
  public String questionaires_Questionaire_Grid_ScoringSystemColumn_Value();

  @DefaultStringValue("Type")
  public String questionaires_Questionaire_Grid_TypeColumn_Value();

  @DefaultStringValue("Version")
  public String questionaires_Questionaire_Grid_VersionColumn_Value();

  @DefaultStringValue("Add Answer")
  public String questionaires_Questionaire_QuestionaireDetail_AnswerGrid_AddAnswerButton_Text();

  @DefaultStringValue("Compliance")
  public String questionaires_Questionaire_QuestionaireDetail_AnswerGrid_ComplianceColumn_Text();

  @DefaultStringValue("Answer Description")
  public String questionaires_Questionaire_QuestionaireDetail_AnswerGrid_DescriptionColumn_Text();

  @DefaultStringValue("Answer Name")
  public String questionaires_Questionaire_QuestionaireDetail_AnswerGrid_NameColumn_Text();

  @DefaultStringValue("Remove Answer")
  public String questionaires_Questionaire_QuestionaireDetail_AnswerGrid_RemoveAnswerButton_Text();

  @DefaultStringValue("Fail All")
  public String questionaires_Questionaire_QuestionaireDetail_AnswerGrid_RowEditor_ComplianceComboBox_Validatior_FailAll_Value();

  @DefaultStringValue("Fail Group")
  public String questionaires_Questionaire_QuestionaireDetail_AnswerGrid_RowEditor_ComplianceComboBox_Validatior_FailGroup_Value();

  @DefaultStringValue("Success All")
  public String questionaires_Questionaire_QuestionaireDetail_AnswerGrid_RowEditor_ComplianceComboBox_Validatior_SuccessAll_Value();

  @DefaultStringValue("Success Group")
  public String questionaires_Questionaire_QuestionaireDetail_AnswerGrid_RowEditor_ComplianceComboBox_Validatior_SuccessGroup_Value();

  @DefaultStringValue("Enter description")
  public String questionaires_Questionaire_QuestionaireDetail_AnswerGrid_RowEditor_DescriptionTextField_BlankText();

  @DefaultStringValue("Enter answer text")
  public String questionaires_Questionaire_QuestionaireDetail_AnswerGrid_RowEditor_NameTextField_BlankText();

  @DefaultStringValue("Enter weight")
  public String questionaires_Questionaire_QuestionaireDetail_AnswerGrid_RowEditor_ValueTextField_BlankText();

  @DefaultStringValue("Agent Extension Length")
  public String questionaires_Questionaire_QuestionaireDetail_CallSelectionRules_AgentsExtensionLengthLabel_Text();

  @DefaultStringValue("Allow Internal Call Scoring")
  public String questionaires_Questionaire_QuestionaireDetail_CallSelectionRules_AllowInternalCallsScoringLabel_Text();

  @DefaultStringValue("Cancel")
  public String questionaires_Questionaire_QuestionaireDetail_CallSelectionRules_CancelButton();

  @DefaultStringValue("Exact Number")
  public String questionaires_Questionaire_QuestionaireDetail_CallSelectionRules_ExactNumberLabel_Text();

  @DefaultStringValue("Inbound-Outbound Call Identification")
  public String questionaires_Questionaire_QuestionaireDetail_CallSelectionRules_IOCallsIdentificationLabel_Text();

  @DefaultStringValue("Matching Part")
  public String questionaires_Questionaire_QuestionaireDetail_CallSelectionRules_MatchingPartLabel_Text();

  @DefaultStringValue("OK")
  public String questionaires_Questionaire_QuestionaireDetail_CallSelectionRules_OkButton_Value();

  @DefaultStringValue("Week Days")
  public String questionaires_Questionaire_QuestionaireDetail_CallSelectionRules_RecordCriteriaPanel_DaysOfWeekLabel_Value();

  @DefaultStringValue("From")
  public String questionaires_Questionaire_QuestionaireDetail_CallSelectionRules_RecordCriteriaPanel_FromLabel_Value();

  @DefaultStringValue("From Time")
  public String questionaires_Questionaire_QuestionaireDetail_CallSelectionRules_RecordCriteriaPanel_FromTimeField_BlankText();

  @DefaultStringValue("Max")
  public String questionaires_Questionaire_QuestionaireDetail_CallSelectionRules_RecordCriteriaPanel_MaxLabel_Value();

  @DefaultStringValue("Enter max")
  public String questionaires_Questionaire_QuestionaireDetail_CallSelectionRules_RecordCriteriaPanel_MaxNumberField_BlankText();

  @DefaultStringValue("seconds")
  public String questionaires_Questionaire_QuestionaireDetail_CallSelectionRules_RecordCriteriaPanel_MaxSecondLabel_Value();

  @DefaultStringValue("Min")
  public String questionaires_Questionaire_QuestionaireDetail_CallSelectionRules_RecordCriteriaPanel_MinLabel_Value();

  @DefaultStringValue("Recording Length")
  public String questionaires_Questionaire_QuestionaireDetail_CallSelectionRules_RecordCriteriaPanel_MinMaxRecordingLabel_Value();

  @DefaultStringValue("Enter min")
  public String questionaires_Questionaire_QuestionaireDetail_CallSelectionRules_RecordCriteriaPanel_MinNumberField_BlankText();

  @DefaultStringValue("seconds")
  public String questionaires_Questionaire_QuestionaireDetail_CallSelectionRules_RecordCriteriaPanel_MinSecondLabel_Value();

  @DefaultStringValue("Time")
  public String questionaires_Questionaire_QuestionaireDetail_CallSelectionRules_RecordCriteriaPanel_TimeLabel_Value();

  @DefaultStringValue("Record Criteria Panel")
  public String questionaires_Questionaire_QuestionaireDetail_CallSelectionRules_RecordCriteriaPanel_Title();

  @DefaultStringValue("To")
  public String questionaires_Questionaire_QuestionaireDetail_CallSelectionRules_RecordCriteriaPanel_ToLabel_Value();

  @DefaultStringValue("To Time")
  public String questionaires_Questionaire_QuestionaireDetail_CallSelectionRules_RecordCriteriaPanel_ToTimeField_BlankText();

  @DefaultStringValue("SIP Number")
  public String questionaires_Questionaire_QuestionaireDetail_CallSelectionRules_SIPNumberLabel_Text();

  @DefaultStringValue("Call Selection Rules")
  public String questionaires_Questionaire_QuestionaireDetail_CallSelectionRules_Window_Title();

  @DefaultStringValue("Close Without Saving")
  public String questionaires_Questionaire_QuestionaireDetail_decisionQuestionReallyClose_noButton_text();

  @DefaultStringValue("Continue Working")
  public String questionaires_Questionaire_QuestionaireDetail_decisionQuestionReallyClose_yesButton_text();

  @DefaultStringValue("Answers")
  public String questionaires_Questionaire_QuestionaireDetail_Details_AnswersPanel_Title();

  @DefaultStringValue("Auto-Sort Answers By")
  public String questionaires_Questionaire_QuestionaireDetail_Details_AutosortingOfAnswersLabel_Value();

  @DefaultStringValue("Cancel")
  public String questionaires_Questionaire_QuestionaireDetail_Details_CancelButton_Value();

  @DefaultStringValue("OK")
  public String questionaires_Questionaire_QuestionaireDetail_Details_OkButton_Value();

  @DefaultStringValue("Grades")
  public String questionaires_Questionaire_QuestionaireDetail_Details_ScoringSystem_GradesLabel_Value();

  @DefaultStringValue("Percent")
  public String questionaires_Questionaire_QuestionaireDetail_Details_ScoringSystem_PercentLabel_Value();

  @DefaultStringValue("Points")
  public String questionaires_Questionaire_QuestionaireDetail_Details_ScoringSystem_PointsLabel_Value();

  @DefaultStringValue("Scoring System")
  public String questionaires_Questionaire_QuestionaireDetail_Details_ScoringSystemPanel_Title();

  @DefaultStringValue("Show All Possible Answers")
  public String questionaires_Questionaire_QuestionaireDetail_Details_ShowAllPosibleLabel_Value();

  @DefaultStringValue("Creation Time")
  public String questionaires_Questionaire_QuestionaireDetail_Details_SortingSystem_CreationTimeLabel_Value();

  @DefaultStringValue("Weight (Ascending)")
  public String questionaires_Questionaire_QuestionaireDetail_Details_SortingSystem_WeightASCLabel_Value();

  @DefaultStringValue("Weight (Descending)")
  public String questionaires_Questionaire_QuestionaireDetail_Details_SortingSystem_WeightDESCLabel_Value();

  @DefaultStringValue("Weight (q) for Reports:")
  public String questionaires_Questionaire_QuestionaireDetail_Details_WeightNumberField_Value();

  @DefaultStringValue("Questionnaire Properties")
  public String questionaires_Questionaire_QuestionaireDetail_Details_Window_Title();

  @DefaultStringValue("Yes")
  public String questionaires_Questionaire_QuestionaireDetail_Details_YesLabel_Value();

  @DefaultStringValue("Add Group")
  public String questionaires_Questionaire_QuestionaireDetail_GroupManager_AddGroupButton_Value();

  @DefaultStringValue("Close")
  public String questionaires_Questionaire_QuestionaireDetail_GroupManager_CloseGroupButton_Value();

  @DefaultStringValue("Group Description")
  public String questionaires_Questionaire_QuestionaireDetail_GroupManager_Grid_GroupDescriptionColumn_Text();

  @DefaultStringValue("Group Name")
  public String questionaires_Questionaire_QuestionaireDetail_GroupManager_Grid_GroupNameColumn_Text();

  @DefaultStringValue("Enter description")
  public String questionaires_Questionaire_QuestionaireDetail_GroupManager_Grid_RowEditor_GroupDescriptionTextField_BlankText();

  @DefaultStringValue("Enter name")
  public String questionaires_Questionaire_QuestionaireDetail_GroupManager_Grid_RowEditor_GroupNameTextField_BlankText();

  @DefaultStringValue("Enter weight")
  public String questionaires_Questionaire_QuestionaireDetail_GroupManager_Grid_RowEditor_GroupValueNumberField_BlankText();

  @DefaultStringValue("Remove Group")
  public String questionaires_Questionaire_QuestionaireDetail_GroupManager_RemoveGroupButton_Value();

  @DefaultStringValue("Question Group Manager")
  public String questionaires_Questionaire_QuestionaireDetail_GroupManager_Window_Title();

  @DefaultStringValue("Add Question")
  public String questionaires_Questionaire_QuestionaireDetail_GroupQuestionGrid_AddQuestionButton_Text();

  @DefaultStringValue("Description")
  public String questionaires_Questionaire_QuestionaireDetail_GroupQuestionGrid_DescriptionColumn_Text();

  @DefaultStringValue("Group Name")
  public String questionaires_Questionaire_QuestionaireDetail_GroupQuestionGrid_NameColumn_Text();

  @DefaultStringValue("To add a question to this group, click here, then click the Add Question button, below right")
  public String questionaires_Questionaire_QuestionaireDetail_GroupQuestionGrid_NewRow_Description_Value();

  @DefaultStringValue("-")
  public String questionaires_Questionaire_QuestionaireDetail_GroupQuestionGrid_NewRow_Text_Value();

  @DefaultStringValue("Remove Question")
  public String questionaires_Questionaire_QuestionaireDetail_GroupQuestionGrid_RemoveQuestionButton_Text();

  @DefaultStringValue("Enter question description")
  public String questionaires_Questionaire_QuestionaireDetail_GroupQuestionGrid_RowEditor_DescriptionTextField_BlankText();

  @DefaultStringValue("Enter question text")
  public String questionaires_Questionaire_QuestionaireDetail_GroupQuestionGrid_RowEditor_QuestionTextField_BlankText();

  @DefaultStringValue("Enter weight")
  public String questionaires_Questionaire_QuestionaireDetail_GroupQuestionGrid_RowEditor_ValueNumberField_BlankText();

  @DefaultStringValue("[Not Applicable]")
  public String questionaires_Questionaire_QuestionaireDetail_GroupQuestionGrid_ValueColumn_Points_ValueNotNeeded();

  @DefaultStringValue("Access Permissions")
  public String questionaires_Questionaire_QuestionaireDetail_Permission_AccessPanel_Title();

  @DefaultStringValue("Allow For All")
  public String questionaires_Questionaire_QuestionaireDetail_Permission_AllowAllLabel_Value();

  @DefaultStringValue("Allow Selected Only")
  public String questionaires_Questionaire_QuestionaireDetail_Permission_AllowSelectedLabel_Value();

  @DefaultStringValue("Cancel")
  public String questionaires_Questionaire_QuestionaireDetail_Permission_CancelButton_Value();

  @DefaultStringValue("Deny For All")
  public String questionaires_Questionaire_QuestionaireDetail_Permission_DenyAllLabel_Value();

  @DefaultStringValue("Deny Selected Only")
  public String questionaires_Questionaire_QuestionaireDetail_Permission_DenySelectedLabel_Value();

  @DefaultStringValue("<<")
  public String questionaires_Questionaire_QuestionaireDetail_Permission_MoveLeftButton_Value();

  @DefaultStringValue(">>")
  public String questionaires_Questionaire_QuestionaireDetail_Permission_MoveRightButton_Value();

  @DefaultStringValue("OK")
  public String questionaires_Questionaire_QuestionaireDetail_Permission_OkButton_Value();

  @DefaultStringValue("First Name")
  public String questionaires_Questionaire_QuestionaireDetail_Permission_SourceGrid_FirstnameColumn_Value();

  @DefaultStringValue("Surname")
  public String questionaires_Questionaire_QuestionaireDetail_Permission_SourceGrid_SurnameColumn_Value();

  @DefaultStringValue("First Name")
  public String questionaires_Questionaire_QuestionaireDetail_Permission_TargetGrid_FirstnameColumn_Value();

  @DefaultStringValue("Surname")
  public String questionaires_Questionaire_QuestionaireDetail_Permission_TargetGrid_SurnameColumn_Value();

  @DefaultStringValue("Questionnaire Permissions")
  public String questionaires_Questionaire_QuestionaireDetail_Permission_Window_Title();

  @DefaultStringValue("Questionnaire Name")
  public String questionaires_Questionaire_QuestionaireDetail_QuestformNameLabel_Value();

  @DefaultStringValue("Ver.")
  public String questionaires_Questionaire_QuestionaireDetail_QuestformVersionLabel_Value();

  @DefaultStringValue("Cancel")
  public String questionaires_Questionaire_QuestionaireDetail_QuestionaireAddGroup_CancelButton_Value();

  @DefaultStringValue("Group Description")
  public String questionaires_Questionaire_QuestionaireDetail_QuestionaireAddGroup_GroupDescriptionLabel_Value();

  @DefaultStringValue("Enter description")
  public String questionaires_Questionaire_QuestionaireDetail_QuestionaireAddGroup_GroupDescriptionTextField_BlankText();

  @DefaultStringValue("Group Name")
  public String questionaires_Questionaire_QuestionaireDetail_QuestionaireAddGroup_GroupNameLabel_Value();

  @DefaultStringValue("Enter name")
  public String questionaires_Questionaire_QuestionaireDetail_QuestionaireAddGroup_GroupNameTextField_BlankText();

  @DefaultStringValue("A question name must be unique in a Question Group")
  public String questionaires_Questionaire_QuestionaireDetail_QuestionaireAddGroup_GroupNameTextField_UniqueError();

  @DefaultStringValue("Group Weight")
  public String questionaires_Questionaire_QuestionaireDetail_QuestionaireAddGroup_GroupValueLabel_Value();

  @DefaultStringValue("Enter weight")
  public String questionaires_Questionaire_QuestionaireDetail_QuestionaireAddGroup_GroupValueTextField_BlankText();

  @DefaultStringValue("Save")
  public String questionaires_Questionaire_QuestionaireDetail_QuestionaireAddGroup_SaveButton_Value();

  @DefaultStringValue("Add Question Group")
  public String questionaires_Questionaire_QuestionaireDetail_QuestionaireAddGroup_Window_Title();

  @DefaultStringValue("Untitled Questionnaire")
  public String questionaires_Questionaire_QuestionaireDetail_TabItem_Header_Title_BlankText();

  @DefaultStringValue("Add Group")
  public String questionaires_Questionaire_QuestionaireDetail_ToolBar_AddGroupButton_Text();

  @DefaultStringValue("Call Selection Rules")
  public String questionaires_Questionaire_QuestionaireDetail_ToolBar_CallSelectionRulesButton_Text();

  @DefaultStringValue("Properties")
  public String questionaires_Questionaire_QuestionaireDetail_ToolBar_DetailsButton_Text();

  @DefaultStringValue("Manage Groups")
  public String questionaires_Questionaire_QuestionaireDetail_ToolBar_ManageGroupsButton_Text();

  @DefaultStringValue("Permissions")
  public String questionaires_Questionaire_QuestionaireDetail_ToolBar_PermissionButton_Text();

  @DefaultStringValue("Saving a copy of the questionnaire...")
  public String questionaires_Questionaire_QuestionaireDetail_ToolBar_SaveAsCopyButton_Saving_mask();

  @DefaultStringValue("Save a Copy")
  public String questionaires_Questionaire_QuestionaireDetail_ToolBar_SaveAsCopyButton_Text();

  @DefaultStringValue("Validating save...")
  public String questionaires_Questionaire_QuestionaireDetail_ToolBar_SaveButton_CanSave_mask();

  @DefaultStringValue("Saving questionnaire...")
  public String questionaires_Questionaire_QuestionaireDetail_ToolBar_SaveButton_Saving_mask();

  @DefaultStringValue("Save & Close")
  public String questionaires_Questionaire_QuestionaireDetail_ToolBar_SaveButton_Text();

  @DefaultStringValue("Removing questionnaire...")
  public String questionaires_questionaire_removeButton_removing_mask();

  @DefaultStringValue("Questionnaire Manager")
  public String questionaires_Questionaire_TabItem_Title();

  @DefaultStringValue("Add")
  public String questionaires_Questionaire_ToolBar_AddQuestionaireButton_Value();

  @DefaultStringValue("Edit")
  public String questionaires_Questionaire_ToolBar_EditQuestionaireButton_Value();

  @DefaultStringValue("Export")
  public String questionaires_questionaire_toolBar_exportQuestionaireButton_value();

  @DefaultStringValue("Import")
  public String questionaires_questionaire_toolBar_importQuestionaireButton_importButtonLabel_value();

  @DefaultStringValue("Detail")
  public String questionaires_questionaire_toolBar_importQuestionaireButton_detailSectionTitle_value();

  @DefaultStringValue("Import")
  public String questionaires_questionaire_toolBar_importQuestionaireButton_value();

  @DefaultStringValue("Import Questionnaire")
  public String questionaires_questionaire_toolBar_importQuestionaireDialog_header_title();

  @DefaultStringValue("Remove")
  public String questionaires_Questionaire_ToolBar_RemoveQuestionaireButton_Value();

  @DefaultStringValue("Search")
  public String questionaires_Questionaire_ToolBar_SearchQuestionaireButton_Value();

  @DefaultStringValue("Enter query")
  public String questionaires_Questionaire_ToolBar_SearchtextField_BlankText();


  @DefaultStringValue("Groups")
  public String reports_graphs_agents_eastPanel_groupRadio();

  @DefaultStringValue("Agents")
  public String reports_graphs_agents_eastPanel_title();

  @DefaultStringValue("Agents")
  public String reports_graphs_agents_eastPanel_userRadio();

  @DefaultStringValue("Loading...")
  public String reports_graphs_agents_loadingData_mask();

  @DefaultStringValue("Evaluations")
  public String reports_graphs_evaluators_eastPanel_evalMode();

  @DefaultStringValue("Questionnaires")
  public String reports_graphs_evaluators_eastPanel_questMode();

  @DefaultStringValue("Evaluators")
  public String reports_graphs_evaluators_chart_xLegend();

  @DefaultStringValue("Agents")
  public String reports_graphs_questionTrend_eastPanel_agentFieldSet_heading();

  @DefaultStringValue("Agents")
  public String reports_graphs_questionTrend_eastPanel_agentGrid_label();

  @DefaultStringValue("Bad Threshold")
  public String reports_graphs_questionTrend_eastPanel_badNumberField_label();

  @DefaultStringValue("Good Threshold")
  public String reports_graphs_questionTrend_eastPanel_excellentNumberField_label();

  @DefaultStringValue("From Date")
  public String reports_graphs_questionTrend_eastPanel_fromDateField_label();

  @DefaultStringValue("Groups")
  public String reports_graphs_questionTrend_eastPanel_groupGrid_label();

  @DefaultStringValue("Parameters")
  public String reports_graphs_questionTrend_eastPanel_heading();

  @DefaultStringValue("Maximum")
  public String reports_graphs_questionTrend_eastPanel_maximumTextField_label();

  @DefaultStringValue("Minimum")
  public String reports_graphs_questionTrend_eastPanel_minimumTextField_label();

  @DefaultStringValue("Period")
  public String reports_graphs_questionTrend_eastPanel_periodFieldSet_heading();

  @DefaultStringValue("Scale")
  public String reports_graphs_questionTrend_eastPanel_scaleCombobox_label();

  @DefaultStringValue("Scoring")
  public String reports_graphs_questionTrend_eastPanel_scoringFieldSet_heading();

  @DefaultStringValue("Scoring Type")
  public String reports_graphs_questionTrend_eastPanel_scoringTypeTextField_label();

  @DefaultStringValue("To Date")
  public String reports_graphs_questionTrend_eastPanel_toDateField_label();

  @DefaultStringValue("Select All/None")
  public String reports_graphs_questionTrend_eastPanel_selectAllEvaluatorsCheckBox_fieldLabel();

  @DefaultStringValue("Select All/None")
  public String reports_graphs_questionTrend_eastPanel_selectAllGroupsCheckBox_fieldLabel();

  @DefaultStringValue("Question")
  public String reports_graphs_questionTrend_secondaryToolBar_questionComboBox_label();

  @DefaultStringValue("Show")
  public String reports_graphs_questionTrend_secondaryToolBar_typeComboBox_label();

  @DefaultStringValue("Question Group")
  public String reports_graphs_questionTrend_secondaryToolBar_questionGroupComboBox_label();

  @DefaultStringValue("Questionnaire")
  public String reports_graphs_questionTrend_secondaryToolBar_questionnaireComboBox_label();

  @DefaultStringValue("(Entire Question Group)")
  public String reports_graphs_questionTrend_secondaryToolBar_wholeQuestionComboOption_text();

  @DefaultStringValue("(Entire Questionnaire)")
  public String reports_graphs_questionTrend_secondaryToolBar_wholeQuestionnaireComboOption_text();

  @DefaultStringValue("Skills")
  public String reports_graphs_skillsOfAgent_eastPanel_title();

  @DefaultStringValue("Loading...")
  public String reports_graphs_skillsOfAgent_loadingData_mask();

  @DefaultStringValue("Skills")
  public String reports_graphs_skillsOfAgent_questiongroupGrid_nameColumn_name();

  @DefaultStringValue("select agent")
  public String reports_graphs_skillsOfAgent_toolbar_agentComboBox_emtyText();

  @DefaultStringValue("Agent")
  public String reports_graphs_skillsOfAgent_toolbar_agentLabel_labelField();

  @DefaultStringValue("Close")
  public String reports_graphs_skillsOfAgent_toolbar_closeButton_value();

  @DefaultStringValue("Compute graph")
  public String reports_graphs_skillsOfAgent_toolbar_comuteGraphButton_value();

  @DefaultStringValue("Export Spreadsheet")
  public String reports_graphs_skillsOfAgent_toolbar_exportToSpreadsheetButton_value();

  @DefaultStringValue("From")
  public String reports_graphs_skillsOfAgent_toolbar_fromDateLabel_text();

  @DefaultStringValue("from")
  public String reports_graphs_skillsOfAgent_toolbar_fromDateTimeField_emptyText();

  @DefaultStringValue("select group")
  public String reports_graphs_skillsOfAgent_toolbar_groupComboBox_emptyText();

  @DefaultStringValue("Group")
  public String reports_graphs_skillsOfAgent_toolbar_groupLabel_text();

  @DefaultStringValue("Scale")
  public String reports_graphs_skillsOfAgent_toolbar_interval_text();

  @DefaultStringValue("select interval")
  public String reports_graphs_skillsOfAgent_toolbar_intervalCombo_emptyText();

  @DefaultStringValue("Interval:")
  public String reports_graphs_skillsOfAgent_toolbar_intervalLabel_labelField();

  @DefaultStringValue("Period")
  public String reports_graphs_skillsOfAgent_toolbar_periodLabel_labelField();

  @DefaultStringValue("select questionnaire")
  public String reports_graphs_skillsOfAgent_toolbar_questionnaireCombo_emptyText();

  @DefaultStringValue("Questionnaire")
  public String reports_graphs_skillsOfAgent_toolbar_questionnaireLabel_labelField();

  @DefaultStringValue("Questionnaire")
  public String reports_graphs_skillsOfAgent_toolbar_questionnaireLabel_text();

  @DefaultStringValue("Skill")
  public String reports_graphs_skillsOfAgent_toolbar_skillsLabel_text();

  @DefaultStringValue("To")
  public String reports_graphs_skillsOfAgent_toolbar_toDateLabel_text();

  @DefaultStringValue("to")
  public String reports_graphs_skillsOfAgent_toolbar_toDateTimeField_emptyText();

  @DefaultStringValue("Agent")
  public String reports_graphs_skillsOfAgent_toolbar_userLabel_text();

  @DefaultStringValue("Agent Averages per Questionnaire")
  public String reportsBranch_agentReport_title();


  @DefaultStringValue("Group Averages per Questionnaire")
  public String reportsBranch_averageAgentReport_title();

  @DefaultStringValue("Agent Averages in Group")
  public String reportsBranch_averageGroupReport_title();

  @DefaultStringValue("Compare Scores")
  public String reportsBranch_compareScoringReport_title();

  @DefaultStringValue("Evaluation Detail")
  public String reportsBranch_evaluationDetailReport_title();

  @DefaultStringValue("League Table")
  public String reportsBranch_league_title();

  @DefaultStringValue("Trend Report")
  public String reportsBranch_trend_title();

  @DefaultStringValue("First Quarter")
  public String timeInterval_firstQuarter();

  @DefaultStringValue("Fourth Quarter")
  public String timeInterval_fourthQuarter();

  @DefaultStringValue("Last Month")
  public String timeInterval_lastMonth();

  @DefaultStringValue("Last Week")
  public String timeInterval_lastWeek();

  @DefaultStringValue("Last Year")
  public String timeInterval_lastYear();

  @DefaultStringValue("Next Month")
  public String timeInterval_nextMonth();

  @DefaultStringValue("Second Quarter")
  public String timeInterval_secondQuarter();

  @DefaultStringValue("Third Quarter")
  public String timeInterval_thirdQuarter();

  @DefaultStringValue("Current Month")
  public String timeInterval_thisMonth();

  @DefaultStringValue("Current Quarter")
  public String timeInterval_thisQuarter();

  @DefaultStringValue("Current Week")
  public String timeInterval_thisWeek();

  @DefaultStringValue("Current Year")
  public String timeInterval_thisYear();

  @DefaultStringValue("Cancel")
  public String toolbar_loginUser_cancelButton_value();

  @DefaultStringValue("Check Name")
  public String toolbar_loginUser_delegate_checkNameButton_value();

  @DefaultStringValue("Delegate Evaluation To:")
  public String toolbar_loginUser_delegateEvaluationToFieldLabel_labelField();

  @DefaultStringValue("E-mail")
  public String toolbar_loginUser_emailFieldLabel_labelField();

  @DefaultStringValue("Enabled")
  public String toolbar_loginUser_enabledCheckBox_labelField();

  @DefaultStringValue("Check Name")
  public String toolbar_loginUser_feedback_checkNameButton_value();

  @DefaultStringValue("From")
  public String toolbar_loginUser_fromDateTimeLabel_labelField();

  @DefaultStringValue("Login ID")
  public String toolbar_loginUser_loginFieldLabel_labelField();

  @DefaultStringValue("My Language")
  public String toolbar_loginUser_myLanguageFieldLabel_labelField();

  @DefaultStringValue("Name")
  public String toolbar_loginUser_nameFieldLabel_labelField();

  @DefaultStringValue("New Password")
  public String toolbar_loginUser_newPasswordFieldLabel_labelField();

  @DefaultStringValue("Password")
  public String toolbar_loginUser_passwordFieldLabel_labelField();

  @DefaultStringValue("Save")
  public String toolbar_loginUser_saveButton_value();

  @DefaultStringValue("Saving...")
  public String toolbar_loginUser_saveProfile_saving_mask();

  @DefaultStringValue("Send Feedback To:")
  public String toolbar_loginUser_sendFeedbackToFieldLabel_labelField();

  @DefaultStringValue("Surname")
  public String toolbar_loginUser_surnameFieldLabel_labelField();

  @DefaultStringValue("User Profile")
  public String toolbar_loginUser_tabTitle();

  @DefaultStringValue("To")
  public String toolbar_loginUser_toDateTimeLabel_labelField();

  @DefaultStringValue("Re-type New Password")
  public String toolbar_loginUser_validateNewPasswordFieldLabel_labelField();

  @DefaultStringValue("Logout")
  public String toolBar_logoutButton_value();

  @DefaultStringValue("Cc")
  public String toolBar_messages_ccFieldLabel_labelField();

  @DefaultStringValue("Date")
  public String toolBar_messages_grid_date_columnName();

  @DefaultStringValue("From User")
  public String toolBar_messages_grid_fromUser_columnName();

  @DefaultStringValue("N.")
  public String toolBar_messages_grid_orderNumberTitle_columnName();

  @DefaultStringValue("Subject")
  public String toolBar_messages_grid_subject_columnName();

  @DefaultStringValue("To User")
  public String toolBar_messages_grid_toUser_columnName();

  @DefaultStringValue("Subject")
  public String toolBar_messages_subjectFieldLabel_labelField();

  @DefaultStringValue("Text")
  public String toolBar_messages_textFieldLabel_labelField();

  @DefaultStringValue("Close")
  public String toolBar_messages_toolBar_closeButton_value();

  @DefaultStringValue("Delete")
  public String toolBar_messages_toolBar_deleteButton_value();

  @DefaultStringValue("Mark As Unread")
  public String toolBar_messages_toolBar_markNotReadButton_value();

  @DefaultStringValue("Mark As Read")
  public String toolBar_messages_toolBar_markReadButton_value();

  @DefaultStringValue("Search")
  public String toolBar_messages_toolBar_searchButton_value();

  @DefaultStringValue("To User")
  public String toolBar_messages_toUserFieldLabel_labelField();

  @DefaultStringValue("Messages")
  public String toolBar_messagesButton_value();

  @DefaultStringValue("Tooltips Off")
  public String toolBar_tooltipsOffButton_value();

  @DefaultStringValue("Tooltips On")
  public String toolBar_tooltipsOnButton_value();

  @DefaultStringValue("Unknown User")
  public String toolBar_userButton_value();

  @DefaultStringValue("Display On Startup")
  public String userProfile_dasboardAutostartText();

  @DefaultStringValue("Dashboard")
  public String userProfile_dasboardHeadingText();

  @DefaultStringValue("Evaluator")
  public String userProfile_delegate_evaluatorLabelField_text();

  @DefaultStringValue("Delegation")
  public String userProfile_delegate_heading_text();

  @DefaultStringValue("General")
  public String userProfile_general_heading_text();

  @DefaultStringValue("User Settings")
  public String userProfile_userSettings_heading_text();

  @DefaultStringValue("Select Category")
  public String evaluations_listOfEvaluations_searchCriteria_categoryFieldLabel_defaultCategories();

  @DefaultStringValue("Category")
  public String evaluations_listOfEvaluations_searchCriteria_categoryFieldLabel_labelField();

  @DefaultStringValue("Select Group")
  public String evaluations_listOfEvaluations_searchCriteria_groupFieldLabel_defaultGroup();

  @DefaultStringValue("Group")
  public String evaluations_listOfEvaluations_searchCriteria_groupFieldLabel_labelField();

  @DefaultStringValue("Wrapup")
  public String evaluations_listOfEvaluations_searchCriteria_wrapUpFieldLabel_labelField();

  @DefaultStringValue("Select Agent")
  public String evaluations_listOfEvaluations_searchCriteria_agentFieldLabel_blankText();

  @DefaultStringValue("Select Evaluator")
  public String evaluations_listOfEvaluations_searchCriteria_supervisorFieldLabel_blankText();

  @DefaultStringValue("Status")
  public String evaluations_listOfEvaluations_evaluate_grid_status_columnName();

  @DefaultStringValue("License Type")
  String about_licensePanel_grid_licenseTypeRow();

  @DefaultStringValue("Active User Licenses")
  String about_licensePanel_grid_countOfActiveUsersRow();

  @DefaultStringValue("Maximum Allowed Users")
  String about_licensePanel_grid_countOfUsersRow();

  @DefaultStringValue("Maximum Allowed Users [warning]")
  String about_licensePanel_grid_countOfUsersWarnRow();

  @DefaultStringValue("Export Spreadsheet")
  String evaluations_listOfEvaluations_exportAllButton();

  @DefaultStringValue("Parent ID")
  String evaluations_listOfEvaluations_grid_parent_columnName();

  @DefaultStringValue("(Empty)")
  String evaluations_listOfEvaluations_searchCriteria_comboboxEmptyOption_text();

  @DefaultStringValue("Description")
  String evaluations_evaluationsPlanner_description_subcriteria_fieldLabel();

  @DefaultStringValue("Export")
  String auditLog_exportAllButton();

  @DefaultStringValue("Cancel")
  String scorecardRowEditor_cancelButton_text();

  @DefaultStringValue("Save")
  String scorecardRowEditor_saveButton_text();

  @DefaultStringValue("Evaluator")
  String evaluations_evaluationsPlanner_selfEvaluationChooser_evaluatorTextField_fieldLabel();

  @DefaultStringValue("Evaluated Agent")
  String evaluations_evaluationsPlanner_selfEvaluationChooser_evaluatedAgentTextField_fieldLabel();

  @DefaultStringValue("Self-Evaluation")
  String evaluations_evaluationsPlanner_selfEvaluationRadioLabel_fieldLabel();

  @DefaultStringValue("Matching Part")
  String evaluations_evaluationsPlanner_description_subcriteria_comparator_fieldLabel();

  @DefaultStringValue("Add to Feedback [Maintain]")
  String evaluations_listOfEvaluations_evaluate_evaluate_answerNoteWindow_maintainFeedback_button();

  @DefaultStringValue("Add to Feedback [Improve]")
  String evaluations_listOfEvaluations_evaluate_evaluate_answerNoteWindow_improveFeedback_button();

  @DefaultStringValue("Answer Note")
  String evaluations_listOfEvaluations_evaluate_evaluate_answerNoteWindow_title();

  @DefaultStringValue("Compare Scores")
  String reports_export_compareScoresPanel_tabTitle();

  @DefaultStringValue("Export Spreadsheet")
  String reports_export_compareScoresPanel_toolbar_exportButton_label();

  @DefaultStringValue("Close")
  String reports_export_compareScoresPanel_toolbar_closeButton_label();

  @DefaultStringValue("Evaluations for Comparison")
  String reports_export_compareScoresPanel_comparedEvaluationsFieldSet_title();

  @DefaultStringValue("Compare Scores")
  String guiFactoryImpl_branch_charts_compareScores();

  @DefaultStringValue("Base Evaluation")
  String reports_export_compareScoresPanel_baseEvaluationsFieldSet_title();

  @DefaultStringValue("Select a Questionnaire")
  String reports_export_compareScoresPanel_baseEvaluationsFieldSet_questionnaireListView_label_text();

  @DefaultStringValue("Select Evaluator Groups")
  String reports_export_compareScoresPanel_baseEvaluationsFieldSet_groupListView_Label_text();

  @DefaultStringValue("Select Evaluators")
  String reports_export_compareScoresPanel_baseEvaluationsFieldSet_evaluatorListView_label_text();

  @DefaultStringValue("Select Base Evaluation")
  String reports_export_compareScoresPanel_baseEvaluationsFieldSet_evaluationListView_label_text();

  @DefaultStringValue("Selected Questionnaire")
  String reports_export_compareScoresPanel_comparedEvaluationsFieldSet_selectQuestionnaire_label();

  @DefaultStringValue("Select Evaluator Groups")
  String reports_export_compareScoresPanel_compareEvaluationsFieldSet_groupListView_Label_text();

  @DefaultStringValue("Select Evaluators")
  String reports_export_compareScoresPanel_compareEvaluationsFieldSet_evaluatorListView_label_text();

  @DefaultStringValue("Select Evaluations to Compare")
  String reports_export_compareScoresPanel_compareEvaluationsFieldSet_evaluationListView_label_text();

  @DefaultStringValue("League Table")
  String reports_export_leagueTablePanel_tabTitle();

  @DefaultStringValue("Export Spreadsheet")
  String reports_export_leagueTablePanel_toolbar_exportButton_label();

  @DefaultStringValue("Close")
  String reports_export_leagueTablePanel_toolbar_closeButton_label();

  @DefaultStringValue("Period")
  String reports_export_leagueTablePanel_periodComboLabel_fieldLabel();

  @DefaultStringValue("Date From")
  String reports_export_leagueTablePanel_fromDateLabel_fieldLabel();

  @DefaultStringValue("To")
  String reports_export_leagueTablePanel_toDateLabel_fieldLabel();

  @DefaultStringValue("Time Interval")
  String reports_export_leagueTablePanel_periodFieldSet_heading_text();

  @DefaultStringValue("League Table")
  String guiFactoryImpl_branch_charts_leagueTable();

  @DefaultStringValue("Questionnaire")
  String reports_export_leagueTablePanel_questionnaireFieldSet_heading_text();

  @DefaultStringValue("Agents")
  String reports_export_leagueTablePanel_agentFieldSet_heading_text();

  @DefaultStringValue("Mainstream Thresholds")
  String reports_export_leagueTablePanel_mainstreamFieldSet_heading_text();

  @DefaultStringValue("Scoring System")
  String reports_export_leagueTablePanel_scoringSystemLabel_text();

  @DefaultStringValue("Questionnaire")
  String reports_export_leagueTablePanel_questionnaireLabel_text();

  @DefaultStringValue("Select All/None")
  String reports_export_leagueTablePanel_selectAllQuestionnairesLabel_text();

  @DefaultStringValue("Bad Threshold")
  String reports_export_leagueTablePanel_lowThresholdNumberField_label();

  @DefaultStringValue("Good Threshold")
  String reports_export_leagueTablePanel_highThresholdNumberField_label();

  @DefaultStringValue("Grouping")
  String reports_export_leagueTablePanel_groupingLabel_text();

  @DefaultStringValue("Agent")
  String reports_export_leagueTablePanel_agentGroupingRadio_label();

  @DefaultStringValue("Group")
  String reports_export_leagueTablePanel_groupGroupingRadio_label();

  @DefaultStringValue("Agent Groups")
  String reports_export_leagueTablePanel_groupsListViewLabel_text();

  @DefaultStringValue("Select All/None")
  String reports_export_leagueTablePanel_setectAllGroupsCheckBox_label();

  @DefaultStringValue("Agents")
  String reports_export_leagueTablePanel_agentsListViewLabel_text();

  @DefaultStringValue("Select All/None")
  String reports_export_leagueTablePanel_setectAllAgentsCheckBox_label();

  @DefaultStringValue("User")
  String dashboard_widget_config_usersCombo_label();

  @DefaultStringValue("(Whole group)")
  String dashboard_widget_config_usersCombo_wholeGroup();

  @DefaultStringValue("Select All/None")
  String agentChooser_setectAllGroupsCheckBox_label();

  @DefaultStringValue("Select All/None")
  String agentChooser_setectAllAgentsCheckBox_label();

  @DefaultStringValue("Agents")
  String agentChooser_agentsListViewLabel_text();

  @DefaultStringValue("Groups")
  String agentChooser_groupsTreeLabel_text();

  @DefaultStringValue("Export Spreadsheet")
  String evaluations_listOfEvaluations_reportDetail_exportButton();

  @DefaultStringValue("Print")
  String evaluations_listOfEvaluations_reportDetail_printButton();

  @DefaultStringValue("Include All Possible Answers")
  String evaluations_listOfEvaluations_reportDetail_allAnswerCheckBox();

  @DefaultStringValue("Eco Printing")
  String evaluations_listOfEvaluations_reportDetail_ecoPrintingCheckBox();

  @DefaultStringValue("Reveal Results to Agent")
  String evaluations_listOfEvaluations_evaluatePanel_visibleToAgentCheckBox();

  @DefaultStringValue("Reveal Results to Agent")
  String evaluations_listOfEvaluations_toolBar_moreActions_revealToAgents();

  @DefaultStringValue("Include in Statistics")
  String evaluations_listOfEvaluations_toolBar_moreActions_includeToStats();

  @DefaultStringValue("More Actions")
  String evaluations_listOfEvaluations_toolBar_moreActions();

  @DefaultStringValue("Reveal evaluation results to agent")
  String evaluations_listOfEvaluations_grid_revealToAgent_columnTooltip();

  @DefaultStringValue("Reveal")
  String evaluations_listOfEvaluations_grid_revealToAgent_columnName();

  @DefaultStringValue("Agent Averages")
  String reports_graphs_skillsOfAgent_eatsPanel_averageCombo_label();

  @DefaultStringValue("Agent Averages")
  String reports_graphs_skillsOfAgent_agentAverages_legend();

  @DefaultStringValue("Evaluator group")
  String reports_export_compareScoresPanel_baseEvaluationsFieldSet_evaluatorGroupListView_label_text();

  @DefaultStringValue("Logout")
  String logoutDialog_logoutButton_value();

  @DefaultStringValue("Cancel")
  String logoutDialog_cancelButton_value();

  @DefaultStringValue("All Skills")
  String reports_graphs_skillsOfAgent_sidebar_skillsCombo_allSkills();

  @DefaultStringValue("Overall Questionnaire")
  String qreports_graphs_skillsOfAgent_sidebar_questionnaireOverallCheckBox_labelField();

  @DefaultStringValue("Interactions")
  String guiFactoryImpl_interactionsNode_customerInteractions();

  @DefaultStringValue("Overall Skill")
  String qreports_graphs_skillsOfAgent_sidebar_skillOverallCheckBox_labelField();

  @DefaultStringValue("Customer Interactions")
  String guiFactoryImpl_branch_interactionsNode();

  @DefaultStringValue("Interaction Volume")
  String guiFactoryImpl_branch_charts_interactionsVolume();

  @DefaultStringValue("Chart Data")
  String reports_graphs_interactionsVolume_eastPanel_heading();

  @DefaultStringValue("Date Range")
  String reports_graphs_interactionsVolume_eastPanel_dateRangeLabel_text();

  @DefaultStringValue("From")
  String reports_graphs_interactionsVolume_eastPanel_fromDateField_label();

  @DefaultStringValue("To")
  String reports_graphs_interactionsVolume_eastPanel_toDateField_label();

  @DefaultStringValue("Scale")
  String reports_graphs_interactionsVolume_eastPanel_scaleCombo_label();

  @DefaultStringValue("All Questionnaires")
  String reports_graphs_interactionsVolume_eastPanel_questformCombo_allQuestformslabel();

  @DefaultStringValue("All Evaluators")
  String reports_graphs_interactionsVolume_eastPanel_questformCombo_allEvaluatorslabel();

  @DefaultStringValue("All Groups")
  String reports_graphs_interactionsVolume_eastPanel_questformCombo_allGroupsLabel();

  @DefaultStringValue("Chart Data")
  String reports_graphs_evaluationsVolume_eastPanel_heading();

  @DefaultStringValue("Planned")
  String reports_graphs_evaluationsVolume_eastPanel_evaluationCheckBox_label();

  @DefaultStringValue("In Progress")
  String reports_graphs_evaluationsVolume_eastPanel_replacedCheckBox_label();

  @DefaultStringValue("Completed")
  String reports_graphs_evaluationsVolume_eastPanel_notEvaluatedCheckBox_label();

  @DefaultStringValue("Filter")
  String reports_graphs_evaluationsVolume_eastPanel_filterLabel_text();

  @DefaultStringValue("Date Range")
  String reports_graphs_evaluationsVolume_eastPanel_dateRangeLabel_text();

  @DefaultStringValue("From")
  String reports_graphs_evaluationsVolume_eastPanel_fromDateField_label();

  @DefaultStringValue("To")
  String reports_graphs_evaluationsVolume_eastPanel_toDateField_label();

  @DefaultStringValue("Scale")
  String reports_graphs_evaluationsVolume_eastPanel_scaleCombo_label();

  @DefaultStringValue("All Questionnaires")
  String reports_graphs_evaluationsVolume_eastPanel_questformCombo_allQuestformslabel();

  @DefaultStringValue("All Evaluators")
  String reports_graphs_evaluationsVolume_eastPanel_questformCombo_allEvaluatorslabel();

  @DefaultStringValue("All Groups")
  String reports_graphs_evaluationsVolume_eastPanel_questformCombo_allGroupsLabel();

  @DefaultStringValue("Evaluation Volume")
  String guiFactoryImpl_branch_charts_evaluationsVolume();

  @DefaultStringValue("Number of Interactions")
  String reports_graphs_interactionsVolume_chart_yAxisVolume_label();

  @DefaultStringValue("of")
  String reports_graphs_interactionsVolume_chart_tooltip_conjunction();

  @DefaultStringValue("Interaction Length")
  String reports_graphs_interactionsVolume_chart_yAxisLength_label();

  @DefaultStringValue("Please Fill in All Fields")
  String password_change_dialog_fill_all_fields_label();

  @DefaultStringValue("Choose a New Password")
  String password_change_dialog_title();

  @DefaultStringValue("New passwords are not same")
  String password_change_dialog_newPassword_mismatch_newRepeatedPassword_label();

  @DefaultStringValue("Old Password")
  String password_change_dialog_old_password_label();

  @DefaultStringValue("New Password")
  String password_change_dialog_new_password_label();

  @DefaultStringValue("Repeat Password")
  String password_change_dialog_repeated_password_label();

  @DefaultStringValue("Change and Continue")
  String password_change_dialog_change_button_value();

  @DefaultStringValue("Cancel")
  String password_change_dialog_cancel_button_value();

  @DefaultStringValue("Change Password")
  String toolbar_loginUser_change_password_button();

  @DefaultStringValue("Yes")
  String dialog_button_yes();

  @DefaultStringValue("No")
  String dialog_button_no();

  @DefaultStringValue("Evaluated")
  String reports_graphs_interactionsVolume_eastPanel_evaluationCheckBox_label();

  @DefaultStringValue("Replaced")
  String reports_graphs_interactionsVolume_eastPanel_replacedCheckBox_label();

  @DefaultStringValue("Not Evaluated")
  String reports_graphs_interactionsVolume_eastPanel_notEvaluatedCheckBox_label();

  @DefaultStringValue("Interaction Types")
  String reports_graphs_interactionsVolume_eastPanel_interactionTypesLabel_text();

  @DefaultStringValue("Filter")
  String reports_graphs_interactionsVolume_eastPanel_filterLabel_text();

  @DefaultStringValue("Date")
  String interactions_interactionGrid_dateColumn_title();

  @DefaultStringValue("Time")
  String interactions_interactionGrid_timeColumn_title();

  @DefaultStringValue("Length")
  String interactions_interactionGrid_lengthColumn_title();

  @DefaultStringValue("-")
  String interactions_interactionGrid_column_emptyValue();

  @DefaultStringValue("Agent")
  String interactions_interactionGrid_agentColumn_title();

  @DefaultStringValue("Client")
  String interactions_interactionGrid_clientColumn_title();

  @DefaultStringValue("Score")
  String interactions_interactionGrid_scoreColumn_title();

  @DefaultStringValue("Save Search")
  String interactions_toolBar_saveSearchButton_text();

  @DefaultStringValue("Evaluate")
  String interactions_toolBar_evaluateButton_text();

  @DefaultStringValue("Info")
  String interactions_toolBar_infoButton_text();

  @DefaultStringValue("Export Audio")
  String interactions_toolBar_exportButton_text();

  @DefaultStringValue("Update Search Results")
  String interactions_toolBar_updateSearchResultsButton_text();

  @DefaultStringValue("Load More")
  String interactions_notificationBar_loadMoreButton_text();

  @DefaultStringValue("Update Search Results")
  String interactions_notificationBar_updateSearchResults_text();

  @DefaultStringValue("Search Now")
  String interactions_notificationBar_searchNow_text();

  @DefaultStringValue("Any Interaction")
  String interactions_searchPanel_interactionsTypePane_emptyText();

  @DefaultStringValue("Any Hour")
  String interactions_searchPanel_hoursRangePanel_emptyText();

  @DefaultStringValue("Group")
  String interactions_searchPanel_groupsUsersPane_groupComboLabel();

  @DefaultStringValue("Agent")
  String interactions_searchPanel_groupsUsersPane_agentComboLabel();

  @DefaultStringValue("Client Contact")
  String interactions_searchPanel_groupsUsersPane_clientContactLabel();

  @DefaultStringValue("seconds")
  String interactions_searchPanel_callLengthPane_secondsLabel();

  @DefaultStringValue("Call Length")
  String interactions_searchPanel_groupsUserPane_callLengthLabel();

  @DefaultStringValue("to")
  String interactions_searchPanel_callLengthPane_toLabel();

  @DefaultStringValue("My Users")
  String userSmartInputCombo_myUsersGroup_name();

  @DefaultStringValue("Recent")
  String userSmartInputCombo_recentUsersGroup_name();

  @DefaultStringValue("All Groups")
  String interactions_searchPanel_groupsUsersPane_groupComboEmptyText();

  @DefaultStringValue("All Agents")
  String interactions_searchPanel_groupsUsersPane_agentComboEmptyText();

  @DefaultStringValue("Any")
  String interactions_searchPanel_externdalData_comboEmptyText();

  @DefaultStringValue("Reset Search Criteria")
  String interactions_cancelSearchButton_titleText();

  @DefaultStringValue("From")
  String interactions_searchPanel_fixedDate_fromLabel();

  @DefaultStringValue("To")
  String interactions_searchPanel_fixedDate_toLabel();

  @DefaultStringValue("Last")
  String interactions_searchPanel_customDate_LastLabel();

  @DefaultStringValue("All")
  String interactions_searchPanel_intervalCombo_emtpyText();

  @DefaultStringValue("Time")
  String interactions_dateTimeSearchPanel_title();

  @DefaultStringValue("Every Day")
  String interactions_dateTimeSearchPanel_hoursRangeCombo_everyDay();

  @DefaultStringValue("Older Questionnaire")
  String interactions_evaluateMenu_olderQuestionnaire();

  @DefaultStringValue("Save Interaction Search")
  String interactions_saveInteractionSearch_title();

  @DefaultStringValue("Name")
  String interactions_saveInteractionSearch_name();

  @DefaultStringValue("Save")
  String interactions_saveInteractionSearch_save_button();

  @DefaultStringValue("Cancel")
  String interactions_saveInteractionSearch_cancel_button();

  @DefaultStringValue("Save and Replace")
  String interactions_saveInteractionSearch_saveReplace_button();

  @DefaultStringValue("Attached Data")
  String interactions_attachedDataSearchPanel_title();

  @DefaultStringValue("Match All")
  String interactions_attachedDataSearchPanel_matchAll_button();

  @DefaultStringValue("Match Any")
  String interactions_attachedDataSearchPanel_matchAny_button();

  @DefaultStringValue("Select Data")
  String interactions_attachedData_conditionEmptyText();

  @DefaultStringValue("Remove Condition")
  String interactions_attachedData_conditionRemove();

  @DefaultStringValue("Evaluation")
  String interactions_evaluationSearchPanel_title();

  @DefaultStringValue("Speech")
  String interactions_speechPanel_title();

  @DefaultStringValue("Learn about ZOOM SpeechREC")
  String interactions_speechPanel_learn_button();

  @DefaultStringValue("Any")
  String interactions_speechPanel_containstAny();

  @DefaultStringValue("None")
  String interactions_speechPanel_containstNone();

  @DefaultStringValue("Normal")
  String interactions_speechPanel_confidenceNormal();

  @DefaultStringValue("High")
  String interactions_speechPanel_confidenceHigh();

  @DefaultStringValue("Low")
  String interactions_speechPanel_confidenceLow();

  @DefaultStringValue("Confidence")
  String interactions_speechPanel_confidence_text();

  @DefaultStringValue("Calls Containing")
  String interactions_speechPanel_contains_text();

  @DefaultStringValue("Add Speech Tag")
  String interactions_speechPanel_speechTagAdd_emptyText();

  @DefaultStringValue("Search for Speech Tag")
  String interactions_speechPanel_speechTagSearch_emptyText();

  @DefaultStringValue("Search for Phrase")
  String interactions_speechPanel_phraseTextField_emptyText();

  @DefaultStringValue("Both")
  String interactions_speechPanel_channelMenu_both();

  @DefaultStringValue("Agent")
  String interactions_speechPanel_channelMenu_agent();

  @DefaultStringValue("Client")
  String interactions_speechPanel_channelMenu_client();

  @DefaultStringValue("Score")
  String interactions_evaluationPanel_score_text();

  @DefaultStringValue("Evaluator")
  String interactions_evaluationPanel_evaluator_text();

  @DefaultStringValue("Questionnaire")
  String interactions_evaluationPanel_questionnaire_text();

  @DefaultStringValue("Scored Only")
  String interactions_evaluationPanel_score_scoredOnly();

  @DefaultStringValue("Unscored Only")
  String interactions_evaluationPanel_score_unscoredOnly();

  @DefaultStringValue("Lower Than")
  String interactions_evaluationPanel_score_lower();

  @DefaultStringValue("Higher Than")
  String interactions_evaluationPanel_score_higherThan();

  @DefaultStringValue("Any")
  String interactions_evaluationPanel_comboboxEmptyText();

  @DefaultStringValue("Clear All")
  String interactions_noInteractions_clearSearchCriteria_all();

  @DefaultStringValue("Clear Agent and Group")
  String interactions_noInteractions_clearSearchCriteria_agentAndGroup();

  @DefaultStringValue("Clear Call Length")
  String interactions_noInteractions_clearSearchCriteria_callLength();

  @DefaultStringValue("Clear Speech Tags")
  String interactions_noInteractions_clearSearchCriteria_speechTags();

  @DefaultStringValue("Clear Date Range")
  String interactions_noInteractions_clearSearchCriteria_dateRange();

  @DefaultStringValue("Clear Evaluation Results")
  String interactions_noInteractions_clearSearchCriteria_evaluationResults();

  @DefaultStringValue("Clear Attached Data")
  String interactions_noInteractions_clearSearchCriteria_attachedData();

  @DefaultStringValue("Clear Search")
  String interactions_noInteractions_clearSearchCriteria_button();

  @DefaultStringValue("Custom Search")
  String interactions_savedSearch_customSearch();

  @DefaultStringValue("Save Search...")
  String interactions_savedSearch_saveSearch();

  @DefaultStringValue("Manage Searches...")
  String interactions_savedSearch_manageSearches();

  @DefaultStringValue("Export to ZIP")
  String interactions_exportToZipButton();

  @DefaultStringValue("Trend")
  String interactions_reportMenu_trend();

  @DefaultStringValue("Compare Trend With")
  String interactions_reportMenu_compareTrend();

  // this property is read by Scorecard.jsp
  @DefaultStringValue("Loading ScoreCARD...")
  String loading_scorecard();

  @DefaultStringValue("You are using an outdated browser")
  String loginDialog_obsoleteBrowserWarning_title();

  @DefaultStringValue("This browser is not fully supported and may cause poor responsiveness and limited functionality of the application. Please consider using Internet Explorer 8.0 or newer, Google Chrome, Mozilla Firefox or installing Google Chrome Frame into your browser for the best user experience.")
  String loginDialog_obsoleteBrowserWarning_message();

  @DefaultStringValue("Save Interaction Search")
  String interactions_saveSearchDialog_title_text();

  @DefaultStringValue("Name")
  String interactions_saveSearchDialog_nameLabel_text();

  @DefaultStringValue("Save")
  String interactions_saveSearchDialog_saveButton_text();

  @DefaultStringValue("Cancel")
  String interactions_saveSearchDialog_cancelButton_text();

  @DefaultStringValue("Tags")
  String interactions_interactionGrid_tagsColumn_title();

  @DefaultStringValue("Speech Tags")
  public String speechrec_SpeechTag_TabItem_Title();

  @DefaultStringValue("Removing Speech Tag...")
  public String speechrec_SpeechTag_removeButton_removing_mask();

  @DefaultStringValue("Speech Tags")
  public String guiFactoryImpl_branch_speechTagsManagerNode();

  @DefaultStringValue("SpeechREC Tags")
  public String guiFactoryImpl_branch_speechTagsListNode();

  @DefaultStringValue("New")
  public String speechrec_SpeechTag_ToolBar_AddSpeechTagButton_Value();

  @DefaultStringValue("Edit")
  public String speechrec_SpeechTag_ToolBar_EditSpeechTagButton_Value();

  @DefaultStringValue("Export")
  public String speechrec_SpeechTag_toolBar_exportSpeechTagButton_value();

  @DefaultStringValue("Import")
  public String speechrec_SpeechTag_toolBar_importSpeechTagButton_importButtonLabel_value();

  @DefaultStringValue("Import")
  public String speechrec_SpeechTag_toolBar_importSpeechTagButton_value();

  @DefaultStringValue("Import Speech Tag")
  public String speechrec_SpeechTag_toolBar_importSpeechTagDialog_header_title();

  @DefaultStringValue("Delete")
  public String speechrec_SpeechTag_ToolBar_RemoveSpeechTagButton_Value();

  @DefaultStringValue("Enter Phrase Text")
  public String speechrec_SpeechTagPanel_SpeechTagDetail_PhraseGrid_RowEditor_NameTextField_BlankText();

  @DefaultStringValue("Enter Confidence")
  public String speechrec_SpeechTagPanel_SpeechTagDetail_PhraseGrid_RowEditor_ConfidenceTextField_BlankText();

  @DefaultStringValue("Enter Interactions Count")
  public String speechrec_SpeechTagPanel_SpeechTagDetail_PhraseGrid_RowEditor_InteractionsTextField_BlankText();

  @DefaultStringValue("Phrase")
  public String speechrec_SpeechTagPanel_SpeechTagDetail_PhraseGrid_NameColumn_Text();

  @DefaultStringValue("Enabled")
  public String speechrec_SpeechTagPanel_SpeechTagDetail_PhraseGrid_EnabledColumn_Text();

  @DefaultStringValue("Confidence")
  public String speechrec_SpeechTagPanel_SpeechTagDetail_PhraseGrid_ConfidenceColumn_Text();

  @DefaultStringValue("# of Interactions")
  public String speechrec_SpeechTagPanel_SpeechTagDetail_PhraseGrid_InteractionsColumn_Text();

  @DefaultStringValue("New Phrase")
  public String speechrec_SpeechTagPanel_SpeechTagDetail_PhraseGrid_AddPhraseButton_Text();

  @DefaultStringValue("Edit Phrase")
  public String speechrec_SpeechTagPanel_SpeechTagDetail_PhraseGrid_EditPhraseButton_Text();

  @DefaultStringValue("Save")
  public String speechrec_SpeechTagPanel_SpeechTagDetail_PhraseGrid_SaveButton_Text();

  @DefaultStringValue("Customize...")
  public String speechrec_SpeechTagPanel_SpeechTagDetail_CustomizeButton_Text();

  @DefaultStringValue("Import Tags...")
  public String speechrec_ImportDialog_title();

  @DefaultStringValue("Tags File")
  public String speechrec_ImportDialog_FileUploadField_Text();

  @DefaultStringValue("Cancel")
  public String speechrec_ImportDialog_CancelButton_Text();

  @DefaultStringValue("Ok")
  public String speechrec_ImportDialog_OkButton_Text();

  @DefaultStringValue("Speech Tag")
  public String speechrec_SpeechTagsManagerPanel_SpeechTagManagerGrid_SpeechTagColumn_Text();

  @DefaultStringValue("Phrases")
  public String speechrec_SpeechTagsManagerPanel_SpeechTagManagerGrid_PhrasesColumn_Text();

  @DefaultStringValue("State")
  public String speechrec_SpeechTagsManagerPanel_SpeechTagManagerGrid_StateColumn_Text();

  @DefaultStringValue("Icon Chooser")
  public String speechrec_SpeechTagPanel_IconChooserDialog_WindowText();

  @DefaultStringValue("Recent Uploads")
  public String speechrec_SpeechTagPanel_IconChooserDialog_RecentUploadsText();

  @DefaultStringValue("Rename")
  public String speechrec_SpeechTagsManagerPanel_GridContextualMenu_RenameMenuItem_Text();

  @DefaultStringValue("Edit")
  public String speechrec_SpeechTagsManagerPanel_GridContextualMenu_EditMenuItem_Text();

  @DefaultStringValue("Export")
  public String speechrec_SpeechTagsManagerPanel_GridContextualMenu_ExportMenuItem_Text();

  @DefaultStringValue("Delete")
  public String speechrec_SpeechTagsManagerPanel_GridContextualMenu_DeleteMenuItem_Text();

  @DefaultStringValue("Search for Interactions")
  public String speechrec_SpeechTagsManagerPanel_GridContextualMenu_SearchForInteractionsMenuItem_Text();

  @DefaultStringValue("Containing the Speech Tag")
  public String speechrec_SpeechTagsManagerPanel_GridContextualMenu_ContainingTheSpeechTagMenuItem_Text();

  @DefaultStringValue("Not Containing the Speech Tag")
  public String speechrec_SpeechTagsManagerPanel_GridContextualMenu_NotContainingTheSpeechTagMenuItem_Text();

  @DefaultStringValue("Containing All Speech Tags")
  public String speechrec_SpeechTagsManagerPanel_GridContextualMenu_ContainingAllSpeechTagsMenuItem_Text();

  @DefaultStringValue("Containing Any Speech Tag")
  public String speechrec_SpeechTagsManagerPanel_GridContextualMenu_ContainingAnySpeechTagMenuItem_Text();

  @DefaultStringValue("Not Containing Any Speech Tag")
  public String speechrec_SpeechTagsManagerPanel_GridContextualMenu_NotContainingAnySpeechTagMenuItem_Text();

  @DefaultStringValue("Removing Speech Tag...")
  public String speechrec_SpeechTagsManagerPanel_removeButton_removing_mask();

  @DefaultStringValue("Name")
  public String speechrec_SpeechTagPanel_SpeechTagDetail_SpeechformNameLabel_Value();

  @DefaultStringValue("Validating save...")
  public String speechrec_SpeechTagPanel_SpeechTagDetail_ToolBar_SaveButton_CanSave_mask();

  @DefaultStringValue("Saving Speech Tag...")
  public String speechrec_SpeechTagPanel_SpeechTagDetail_ToolBar_SaveButton_Saving_mask();

  @DefaultStringValue("Icon Chooser")
  public String speechrec_SpeechTagsManagerPanel_IconChooserDialog_Text();

  @DefaultStringValue("Import")
  public String speechrec_SpeechTagsManagerPanel_toolBar_importButton_value();

  @DefaultStringValue("Limit Speech Tag Search")
  public String speechrec_SpeechTagPanel_savedDialog_Title();

  @DefaultStringValue("Cancel")
  public String speechrec_SpeechTagPanel_savedDialog_Cancel();

  @DefaultStringValue("Save")
  public String speechrec_SpeechTagPanel_savedDialog_Save();

  @DefaultStringValue("Search Name")
  public String speechrec_SavedSearchDialog_searchName_Text();

  @DefaultStringValue("Use")
  public String speechrec_SpeechTagPanel_savedDialog_Use();

  @DefaultStringValue("Time")
  public String speechrec_SpeechTagPanel_savedDialog_TimePanelTitle();

  @DefaultStringValue("Close Without Saving")
  public String speechrec_SpeechTagPanel_SpeechTagDetail_decisionQuestionReallyClose_noButton_text();

  @DefaultStringValue("Continue Working")
  public String speechrec_SpeechTagPanel_SpeechTagDetail_decisionQuestionReallyClose_yesButton_text();

  @DefaultStringValue("Wrap up")
  public String speechrec_AdvancedSearchPanel__SpeechTagDetail_WrapUpComboTitle();

  @DefaultStringValue("Category")
  public String speechrec_AdvancedSearchPanel__SpeechTagDetail_CategoryComboTitle();

  @DefaultStringValue("Advanced Search Panel")
  public String speechrec_AdvancedSearchPanel__title();

  @DefaultStringValue("Advanced")
  public String speechrec_AdvancedSearchPanel__HeadingText();

  @DefaultStringValue("Attached Data")
  String interactions_attachedData_title();

  @DefaultStringValue("Tags")
  String interactions_tags_title();

  @DefaultStringValue("Call Duration")
  String interactions_callDurationLabel();

  @DefaultStringValue("Evaluation Results")
  String interactions_evaluationResults_title();

  @DefaultStringValue("Interaction")
  String interaction_interaction_title();

  @DefaultStringValue("Contains")
  String interactions_combo_contains_label();

  @DefaultStringValue("Does Not Contain")
  String interactions_combo_doNotContain_label();

  @DefaultStringValue("Conditions")
  String interactions_attachedDataConditionLabel();

  @DefaultStringValue("Use My Time Zone")
  String interactions_TimeRangeSearchPanel_MyTimeZoneModel_title();

  @DefaultStringValue("Use Agent's Time Zone")
  String interactions_TimeRangeSearchPanel_UseAgentTimeZoneModel_title();

  @DefaultStringValue("Any Score")
  String interactions_evaluationPanel_ScoreSearchCombo_emptyText();

  @DefaultStringValue("Scored")
  String interactions_evaluationPanel_ScoreSearchCombo_Scored_Text();

  @DefaultStringValue("Not Scored")
  String interactions_evaluationPanel_ScoreSearchCombo_NotScored_Text();

  @DefaultStringValue("Custom Score Range")
  String interactions_evaluationPanel_ScoreSearchCombo_CustomScoreRange_Text();

  @DefaultStringValue("Any Questionnaires")
  String interactions_evaluationPanel_QuestionnaireSearchCombo_emptyText();

  @DefaultStringValue("Interaction Type")
  String interactions_interactionTypesPane_interactionLabel();

  @DefaultStringValue("Group")
  String interactions_groupAndUsersPane_groupLabel();

  @DefaultStringValue("Handled By")
  String interactions_groupAndUsersPane_handledByLabel();

  @DefaultStringValue("Client Phone")
  String interactions_groupAndUsersPane_clientContactLabel();

  @DefaultStringValue("Description")
  String interactions_groupAndUsersPane_descriptionLabel();

  @DefaultStringValue("Last 7 Days")
  String interactions_CustomDataPicker_LastSevenDaysButton_title();

  @DefaultStringValue("Last Week")
  String interactions_CustomDataPicker_LastWeekButton_title();

  @DefaultStringValue("Last 30 Days")
  String interactions_CustomDataPicker_LastThirtyDaysButton_title();

  @DefaultStringValue("Last Month")
  String interactions_CustomDataPicker_LastMonthButton_title();

  @DefaultStringValue("Last Year")
  String interactions_CustomDataPicker_LastYearButton_title();

  @DefaultStringValue("All Time")
  String interactions_CustomDataPicker_AllTimeButton_title();

  @DefaultStringValue("to")
  String interactions_searchPanel_customScore_toLabel();

  @DefaultStringValue("Score")
  String interactions_scoreSearchPane_scoreLabel_title();

  @DefaultStringValue("Questionnaire")
  String interactions_QuestionaireSearchPane_questionaireLabel_title();

  @DefaultStringValue("Any Evaluators")
  String interactions_evaluationPanel_EvaluatorSearchCombo_emptyText();

  @DefaultStringValue("Evaluator")
  String interactions_evaluationPanel_evaluatorLabel();

  @DefaultStringValue("unlimited")
  String interactions_scoreSearchPane_customScore_emptyText();

  @DefaultStringValue("Show")
  public String speechrec_CollapsiblePanel_CollapsedIcon_Show_Text();

  @DefaultStringValue("Hide")
  public String speechrec_CollapsiblePanel_ExpandedIcon_Hide_Text();

  @DefaultStringValue("Contains Speech Tag")
  public String interactions_SpeechSearchPanel_containsLabelField();

  @DefaultStringValue("Does Not Contain Speech Tag")
  public String interactions_SpeechSearchPanel_doesNotContainLabelField();

  @DefaultStringValue("+ add tag")
  public String interactions_SpeechSearchPanel_EmptyText();

  @DefaultStringValue("Anyone")
  public String interactions_speechPanel_GroupNameAnyOne_title();

  @DefaultStringValue("Anyone")
  public String interactions_speechPanel_ComboAnyOne_title();

  @DefaultStringValue("Agent")
  public String interactions_speechPanel_ComboAgent_title();

  @DefaultStringValue("Customer")
  public String interactions_speechPanel_ComboCustomer_title();

  @DefaultStringValue("No Speech Tag")
  String interactions_speechPanel_SpeechCriteriaCombo_emptyText();

  @DefaultStringValue("All Day")
  String interactions_searchPanel_hoursRange_emptySelection();

  @DefaultStringValue("Deny to Agents")
  String evaluations_listOfEvaluations_toolBar_moreActions_denyToAgents();

  @DefaultStringValue("Clear All Interactions")
  String evaluations_listOfEvaluations_evaluate_toolBar_clearAlliterationsButton_value();

  @DefaultStringValue("Close")
  String evaluations_listOfEvaluations_evaluate_toolBar_closeEvaluationButton_value();

  @DefaultStringValue("All")
  String interactions_speechPanel_containstAll();

  @DefaultStringValue("Updating search results...")
  String interactions_maskPanelOnLoad_text();

  @DefaultStringValue("Evaluate Interaction")
  String interactions_evaluateInteractionWindow_title_text();

  @DefaultStringValue("Evaluate")
  String interactions_evaluateInteractionWindow_evaluateButton_text();

  @DefaultStringValue("Cancel")
  String interactions_evaluateInteractionWindow_cancelButton_text();

  @DefaultStringValue("Questionnaire")
  String interactions_evaluateInteractionWindow_questionnaireCombo_label();

  @DefaultStringValue("Request to evaluate the interactions will be sent to all evaluators that can evaluate involved agents.")
  String interactions_evaluateInteractionWindow_warning_text();

  @DefaultStringValue("You do not have permission to plan evaluations for all involved agents. Evaluations will be planned only for agents in your assigned groups.")
  String interactions_evaluateInteractionWindow_errorPermissions_text();

  @DefaultStringValue("Creating evaluations")
  String interactions_evaluateInteractionWindow_mask_text();

  @DefaultStringValue("OK")
  String interactions_infoDialog_okButton_text();

  @DefaultStringValue("Call ID")
  String interactions_infoWindow_CallId();

  @DefaultStringValue("Couple ID")
  String interactions_infoWindow_CoupleId();

  @DefaultStringValue("Call Status")
  String interactions_infoWindow_CallStatus();

  @DefaultStringValue("Synchro Tool")
  String interactions_infoWindow_SynchroTool();

  @DefaultStringValue("Delete Tool")
  String interactions_infoWindow_DeleteTool();

  @DefaultStringValue("Mixer Tool")
  String interactions_infoWindow_MixerTool();

  @DefaultStringValue("Restore Tool")
  String interactions_infoWindow_RestoreTool();

  @DefaultStringValue("Archive Tool")
  String interactions_infoWindow_ArchiveTool();

  @DefaultStringValue("ScoreCARD Use")
  String interactions_infoWindow_ScorecardUse();

  @DefaultStringValue("Evaluation")
  String interactions_infoWindow_ScorecardUse_Evaluation();

  @DefaultStringValue("Survey")
  String interactions_infoWindow_ScorecardUse_Survey();

  @DefaultStringValue("Training")
  String interactions_infoWindow_ScorecardUse_Training();

  @DefaultStringValue("Unsuitable for evaluation")
  String interactions_infoWindow_ScorecardUse_Bad();

  @DefaultStringValue("Synchronization ID")
  String interactions_infoWindow_Sid();

  @DefaultStringValue("Protected From Deletion")
  String interactions_infoWindow_DeletionProtection();

  @DefaultStringValue("Segment Information")
  String interactions_infoWindow_Title();

  @DefaultStringValue("External Data")
  String interactions_infoWindow_Externa_Title();

  @DefaultStringValue("Key")
  String interactions_infoWindow_External_Key();

  @DefaultStringValue("Value")
  String interactions_infoWindow_External_Value();

  @DefaultStringValue("Synchronized and used")
  String interactions_infoWindow_used_synchronized();

  @DefaultStringValue("Synchronized but unused")
  String interactions_infoWindow_synchronized();

  @DefaultStringValue("Only external data saved")
  String interactions_infoWindow_synchronized_only_extdata();

  @DefaultStringValue("Synchronization failed")
  String interactions_infoWindow_synchronized_failed();

  @DefaultStringValue("Deleted")
  String interactions_infoWindow_couple_deleted();

  @DefaultStringValue("Delete failed")
  String interactions_infoWindow_couple_delete_failed();

  @DefaultStringValue("Mixed")
  String interactions_infoWindow_couple_mixed();

  @DefaultStringValue("Mixer failed")
  String interactions_infoWindow_couple_mix_failed();

  @DefaultStringValue("Restored")
  String interactions_infoWindow_couple_restored();

  @DefaultStringValue("Restore failed")
  String interactions_infoWindow_couple_restore_failed();

  @DefaultStringValue("Archived")
  String interactions_infoWindow_couple_archived();

  @DefaultStringValue("Archive failed")
  String interactions_infoWindow_couple_archive_failed();

  @DefaultStringValue("Yes")
  String interactions_infoWindow_couple_delete_protected();

  @DefaultStringValue("No")
  String interactions_infoWindow_couple_delete_not_protected();

  @DefaultStringValue("No problem")
  String interactions_infoWindow_couple_noproblem();

  @DefaultStringValue("No stream recorded")
  String interactions_infoWindow_couple_no_streams();

  @DefaultStringValue("Only one stream recorded")
  String interactions_infoWindow_couple_only_1_streams();

  @DefaultStringValue("Unknown codec")
  String interactions_infoWindow_couple_unknown_codec();

  @DefaultStringValue("Error communicating with recorder")
  String interactions_infoWindow_couple_no_reply_recorder();

  @DefaultStringValue("License problem")
  String interactions_infoWindow_couple_recorder_license_problem();

  @DefaultStringValue("Decoder failure (IO error)")
  String interactions_infoWindow_couple_decoder_io_error();

  @DefaultStringValue("Different codecs for each stream")
  String interactions_infoWindow_couple_decoder_diff_payload();

  @DefaultStringValue("File exceeds maximum size")
  String interactions_infoWindow_couple_decoder_oversize_target();

  @DefaultStringValue("Unavailable destination format for decoding")
  String interactions_infoWindow_couple_decoder_nodestformat();

  @DefaultStringValue("No recording device available")
  String interactions_infoWindow_couple_no_recording_device();

  @DefaultStringValue("Cannot find capture files")
  String interactions_infoWindow_couple_capture_file_not_found();

  @DefaultStringValue("Incomplete stream saved")
  String interactions_infoWindow_couple_capture_file_incomplete();

  @DefaultStringValue("Only one stream recorded (incomplete)")
  String interactions_infoWindow_couple_one_stream_incomplete();

  @DefaultStringValue("Overall")
  String overallChartInfo_overallHeading_text();

  @DefaultStringValue("Period From")
  String evaluations_listOfEvaluations_evaluate_showEvaluationsParameters_PeriodFrom_text();

  @DefaultStringValue("Period To")
  String evaluations_listOfEvaluations_evaluate_showEvaluationsParameters_PeriodTo_text();

  @DefaultStringValue("Day Time From")
  String evaluations_listOfEvaluations_evaluate_showEvaluationsParameters_DayTimeFrom_text();

  @DefaultStringValue("Day Time To")
  String evaluations_listOfEvaluations_evaluate_showEvaluationsParameters_DayTimeTo_text();

  @DefaultStringValue("Minimal Length")
  String evaluations_listOfEvaluations_evaluate_showEvaluationsParameters_MinLength_text();

  @DefaultStringValue("Maximal Length")
  String evaluations_listOfEvaluations_evaluate_showEvaluationsParameters_MaxLength_text();

  @DefaultStringValue("Delete")
  String speechTagPanel_removeDialog_deleteButton_text();

  @DefaultStringValue("Cancel")
  String speechTagPanel_removeDialog_cancelButton_text();

  @DefaultStringValue("Universal Player")
  String universal_player_name();

  @DefaultStringValue("no file")
  String speechrec_ImportDialog_FileUploadField_blankText();

  @DefaultStringValue("Evaluation ID")
  String administration_auditLog_grid_evaluationid_columnName();

  @DefaultStringValue("Quiz")
  String questionaires_Questionaire_QuestionaireDetail_Details_type_quiz_Value();

  @DefaultStringValue("Survey")
  String questionaires_Questionaire_QuestionaireDetail_Details_type_survey_Value();

  @DefaultStringValue("Close")
  String training_toolBar_closeButton_text();

  @DefaultStringValue("Plan Training")
  String training_toolBar_planTrainingButton_text();

  @DefaultStringValue("Training Planner")
  String guiFactoryImpl_trainingNode_trainingTab();

  @DefaultStringValue("Quiz")
  String evaluations_trainingPlanner_usedQuestionnaireComboBox_fieldLabel();

  @DefaultStringValue("Instructions")
  String evaluations_trainingPlanner_instructionsTextArea_fieldLabel();

  @DefaultStringValue("Apply to Statistics")
  String evaluations_trainingPlanner_basic_applyToStatisticsCheckBox_fieldLabel();

  @DefaultStringValue("Interaction")
  String evaluations_trainingPlanner_interaction_fieldLabel();

  @DefaultStringValue("Choose Interaction")
  String evaluations_trainingPlanner_interaction_chooseInteractionButon_text();

  @DefaultStringValue("Remove Interaction")
  String evaluations_trainingPlanner_interaction_removeInteractionButon_text();

  @DefaultStringValue("no interaction")
  String evaluations_trainingPlanner_interaction_blankSelection();

  @DefaultStringValue("Choose Questionnaire Type")
  String questionnaires_questionnaireManager_questionnaireChoice_title();

  @DefaultStringValue("Evaluation")
  String questionaires_Questionaire_QuestionaireDetail_Details_type_evaluation_Value();

  @DefaultStringValue("Type")
  String questionaires_Questionaire_QuestionaireDetail_Details_type_Title();

  @DefaultStringValue("Instructions:")
  String evaluations_listOfEvaluations_evaluate_evaluate_instructionTitle_labelField();

  @DefaultStringValue("Training List")
  String guiFactoryImpl_branch_listOfTrainingNode();

  @DefaultStringValue("Quiz")
  String evaluations_listOfTraining_grid_questionaireName_columnName();

  @DefaultStringValue("Customer Surveys")
  String guiFactoryImpl_branch_listOfIVRNode();

  @DefaultStringValue("Training")
  String guiFactoryImpl_branch_trainingListNode();

  @DefaultStringValue("Export Audio")
  String evaluations_evaluationList_evaluationForm_exportAudioButton_value();

  @DefaultStringValue("Digit")
  String questionaires_Questionaire_QuestionaireDetail_AnswerGrid_KeyColumn_Text();

  @DefaultStringValue("Tone Key")
  String questionaires_questionnaireManger_questionaireForm_answerGrid_keyColumn_toolTip_title();

  @DefaultStringValue("None")
  String questionnaires_questionnaireManger_questionaireForm_answerGrid_addRow_keyCombo_blankText();

  @DefaultStringValue("Voice-over")
  String questionaires_Questionaire_QuestionaireDetail_GroupQuestionGrid_MediaColumn_Text();

  @DefaultStringValue("Type")
  String questionaires_Questionaire_QuestionaireDetail_GroupQuestionGrid_TypeColumn_Text();

  @DefaultStringValue("Audio upload")
  String questionaires_questionaire_questionaireDetail_questionGrid_ivrMedaiaUploadWindow_header();

  @DefaultStringValue("Submit")
  String questionaires_questionaire_questionaireDetail_questionGrid_ivrMedaiaUploadWindow_submitButton();

  @DefaultStringValue("Cancel")
  String questionaires_questionaire_questionaireDetail_questionGrid_ivrMedaiaUploadWindow_cancelButton();

  @DefaultStringValue("No audio file selected")
  String questionaires_Questionaire_QuestionaireDetail_GroupQuestionGrid_NoMediaFileUploadedYet();

  @DefaultStringValue("Planner")
  String evaluations_listOfEvaluations_grid_planner_columnName();

  @DefaultStringValue("Trainee")
  String evaluations_listOfEvaluations_grid_traineee_columnName();

  @DefaultStringValue("Trainee")
  String evaluations_listOfTraining_SearchCriteria_traineeFieldLabel_labelField();

  @DefaultStringValue("Select trainee")
  String evaluations_listOfTraining_searchCriteria_TraineeFieldLabel_blankText();

  @DefaultStringValue("Quiz")
  String evaluations_listOfTraining_SearchCriteria_quizFieldLabel_labelField();

  @DefaultStringValue("Select quiz")
  String evaluations_listOftraining_searchCriteria_quizFieldLabel_defaultQuestionaire();

  @DefaultStringValue("View")
  String evaluations_surveyList_evaluateButton_value();
}
