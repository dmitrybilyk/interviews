package toknow.nikita.duplicate.i18n;

import com.google.gwt.i18n.client.Messages;
import com.google.gwt.i18n.client.impl.plurals.DefaultRule_en;

public interface ScorecardMessages extends Messages {

  @DefaultMessage("An unknown problem with communication with server (ref: {0}). Check that you are connected to your network and try to repeat the operation.")
  public String general_message_rpcfailed(String errorReference);

  @DefaultMessage("The current user is not authorized for this operation")
  public String general_message_authorizationException();

  @DefaultMessage("Cannot perform the operation")
  public String about_messageBox_RPCFailed_title();

  @DefaultMessage("Bad file parameters. Please check the filename and file size before trying again")
  public String aboutPanel_uploadLicense_error();

  @DefaultMessage("License has been uploaded")
  public String aboutPanel_uploadLicense_text();

  @DefaultMessage("Cannot perform the operation")
  public String administration_ApplicationOptions_SaveOptions_SaveOptionsFailed_notAllowExc_title();

  @DefaultMessage("Options could not be saved due to an application error. Please contact the administrator if this error persists")
  public String administration_ApplicationOptions_SaveOptions_SaveOptionsFailed_text();

  @DefaultMessage("Options Save Error")
  public String administration_ApplicationOptions_SaveOptions_SaveOptionsFailed_title();

  @DefaultMessage("Options updated in the application")
  public String administration_ApplicationOptions_SaveOptions_SaveOptionsSuccess_text();

  @DefaultMessage("Save Options")
  public String administration_ApplicationOptions_SaveOptions_SaveOptionsSuccess_title();

  @DefaultMessage("{0}, {1}")
  public String administration_auditLog_grid_toUser_displayValue(String surname, String name);

  @DefaultMessage("{0}, {1}")
  public String administration_auditLog_toolBar_userFilter_displayValue(String surname, String name);

  @DefaultMessage("Edit the currently selected category")
  public String administration_categories_editButton_toolTip_text();

  @DefaultMessage("Edit Category")
  public String administration_categories_editButton_toolTip_title();

  @DefaultMessage("Add a category. Categories are used for organizing agent interactions")
  public String administration_category_addButton_toolTip_text();

  @DefaultMessage("Add Category")
  public String administration_category_addButton_toolTip_title();

  @DefaultMessage("Category {0} created")
  public String administration_category_infoBox_categoryCreateMessage(String categoryName);

  @DefaultMessage("Category {0} deleted")
  public String administration_category_infoBox_categoryDeleteMessage(String categoryName);

  @DefaultMessage("Category {0} updated")
  public String administration_category_infoBox_categoryUpdateMessage(String categoryName);

  @DefaultMessage("Alert!")
  public String administration_category_messageBox_deleteCategory_authorizationRequiredException_title();

  @DefaultMessage("Category Object error: {0} ID cannot be null!")
  public String administration_category_messageBox_deleteCategory_notAllowedException_text(String categoryName);

  @DefaultMessage("Alert!")
  public String administration_category_messageBox_deleteCategory_notAllowedException_title();

  @DefaultMessage("Cannot perform the operation")
  public String administration_category_messageBox_deleteCategory_otherException_title();

  @DefaultMessage("Do you really want to remove category {0}?")
  public String administration_category_messageBox_deleteCategory_removeDecision_text(String categoryName);

  @DefaultMessage("Remove Category")
  public String administration_category_messageBox_deleteCategory_removeDecision_title();

  @DefaultMessage("Alert!")
  public String administration_category_messageBox_insertCategory_onFailure_authorizationRequiredException_title();

  @DefaultMessage("The category has an invalid (null) ID!")
  public String administration_category_messageBox_insertCategory_onFailure_notAllowedException_text();

  @DefaultMessage("Alert!")
  public String administration_category_messageBox_insertCategory_onFailure_notAllowedException_title();

  @DefaultMessage("Cannot perform the operation")
  public String administration_category_messageBox_insertCategory_onFailure_RequestFailedException_title();

  @DefaultMessage("The database already contains a category named {0}! Please specify a unique name")
  public String administration_category_messageBox_newCategoryIsNotUnique_text(String categoryName);

  @DefaultMessage("Alert!")
  public String administration_category_messageBox_newCategoryIsNotUnique_title();

  @DefaultMessage("Alert!")
  public String administration_category_messageBox_newWrapUpIsNotUnique_title();

  @DefaultMessage("Remove a category. Removing a category does not remove the associated agent interactions.")
  public String administration_category_removeButton_toolTip_text();

  @DefaultMessage("Remove Category")
  public String administration_category_removeButton_toolTip_title();

  @DefaultMessage("This category already exists - a unique category name is required")
  public String administration_category_uniqueCategory();

  @DefaultMessage("a unique name for this agent group")
  public String administration_groupManager_addButton_addWindow_groupName_toolTip_text();

  @DefaultMessage("Group Name")
  public String administration_groupManager_addButton_addWindow_groupName_toolTip_title();

  @DefaultMessage("Group {0} created")
  public String administration_groupManager_addButton_addWindow_infoMessage_groupCretedSuccesful_text(String groupName);

  @DefaultMessage("Group Creation")
  public String administration_groupManager_addButton_addWindow_infoMessage_groupCretedSuccesful_title();

  @DefaultMessage("Group {0} updated")
  public String administration_groupManager_addButton_addWindow_infoMessage_groupUpdateSuccesful_text(String groupName);

  @DefaultMessage("Update Group")
  public String administration_groupManager_addButton_addWindow_infoMessage_groupUpdateSuccesful_title();

  @DefaultMessage("Add a user group - used for organizing users into relevant hierarchical teams")
  public String administration_groupManager_addButton_toolTip_text();

  @DefaultMessage("Add Group")
  public String administration_groupManager_addButton_toolTip_title();

  @DefaultMessage("a unique name for this agent group")
  public String administration_groupManager_addGroup_newGroupNameFieldLabel_tooltip_text();

  @DefaultMessage("Group Name")
  public String administration_groupManager_addGroup_newGroupNameFieldLabel_tooltip_title();

  @DefaultMessage("Edit the currently selected user group")
  public String administration_groupManager_editButton_toolTip_text();

  @DefaultMessage("Edit Group")
  public String administration_groupManager_editButton_toolTip_title();

  @DefaultMessage("There is no root group in the database!")
  public String administration_groupManager_groupTree_messageBox_getRootGroup_noSuchEntityException_text();

  @DefaultMessage("Alert!")
  public String administration_groupManager_groupTree_messageBox_getRootGroup_noSuchEntityException_title();

  @DefaultMessage("Cannot perform the operation")
  public String administration_groupManager_groupTree_messageBox_getRootGroup_otherException_title();

  @DefaultMessage("Alert!")
  public String administration_groupManager_groupTree_messageBox_updateGroup_authorizationException_title();

  @DefaultMessage("There is already a main group")
  public String administration_groupManager_groupTree_messageBox_updateGroup_notAllowedException_text();

  @DefaultMessage("Alert!")
  public String administration_groupManager_groupTree_messageBox_updateGroup_notAllowedException_title();

  @DefaultMessage("Group {0} or certain group data is not in the database")
  public String administration_groupManager_groupTree_messageBox_updateGroup_onFailure_noSuchEntityException_text(String groupName);

  @DefaultMessage("Alert!")
  public String administration_groupManager_groupTree_messageBox_updateGroup_onFailure_noSuchEntityException_title();

  @DefaultMessage("Alert!")
  public String administration_groupManager_groupTree_messageBox_updateGroup_onFailure_notAllowedException_title();

  @DefaultMessage("Alert!")
  public String administration_groupManager_groupTree_messageBox_updateGroup_onFailure_otherException_title();

  @DefaultMessage("Alert!")
  public String administration_groupManager_groupTree_messageBox_updateGroup_otherException_title();

  @DefaultMessage("The group tree shows the group folders and subgroups.")
  public String administration_groupManager_groupTree_toolTip_text();

  @DefaultMessage("Group Tree")
  public String administration_groupManager_groupTree_toolTip_title();

  @DefaultMessage("A group with this name already exists!")
  public String administration_groupManager_nameOfNewGroupLabel_validatorUniqueGroupName();

  @DefaultMessage("The name for the group is not valid")
  public String administration_groupManager_nameOfNewGroupLabel_validatorProperName();

  @DefaultMessage("Group {0} contains some other groups, so cannot be deleted!")
  public String administration_groupManager_removeButton_alertMessage_groupHasChildren_text(String groupName);

  @DefaultMessage("Alert!")
  public String administration_groupManager_removeButton_alertMessage_groupHasChildren_title();

  @DefaultMessage("Group {0} contains some users or required data, so cannot be deleted!")
  public String administration_groupManager_removeButton_alertMessage_groupHasUsers_text(String groupName);

  @DefaultMessage("Alert!")
  public String administration_groupManager_removeButton_alertMessage_groupHasUsers_title();

  @DefaultMessage("Group {0} has an invalid (null) ID!")
  public String administration_groupManager_removeButton_alertMessage_onFailure_notAllowedException_text(String groupName);

  @DefaultMessage("Alert!")
  public String administration_groupManager_removeButton_alertMessage_onFailure_notAllowedException_title();

  @DefaultMessage("Cannot perform the operation")
  public String administration_groupManager_removeButton_alertMessage_onFailure_otherException_title();

  @DefaultMessage("Group {0} deleted")
  public String administration_groupManager_removeButton_infoMessage_groupDeleted_text(String groupName);

  @DefaultMessage("Group deletion")
  public String administration_groupManager_removeButton_infoMessage_groupDeleted_title();

  @DefaultMessage("Remove a group permanently. Ensure there are no users or child groups in this group first!")
  public String administration_groupManager_removeButton_toolTip_text();

  @DefaultMessage("Remove Group")
  public String administration_groupManager_removeButton_toolTip_title();

  @DefaultMessage("The selected interaction type is already in use. Are you sure you want to edit it?")
  public String administration_interactionTypes_confirmEditDialog_text();

  @DefaultMessage("Interaction Type In Use")
  public String administration_interactionTypes_confirmEditDialog_title();

  @DefaultMessage("The interaction type is in use and cannot be deleted")
  public String administration_interactionTypes_deleteFailedDialog_text();

  @DefaultMessage("Delete Failure")
  public String administration_interactionTypes_deleteFailedDialog_title();

  @DefaultMessage("Name does not match the required format")
  public String administration_interactionTypes_interactionsGrid_nameColumn_regexValidation_failed_text();

  @DefaultMessage("This Interaction Type name already exists - please specify a unique name!")
  public String administration_interactionTypes_interactionsGrid_nameColumn_uniqueNameValidation_failed_text();

  @DefaultMessage("Add a custom interaction type, e.g. Skype")
  public String administration_interactionTypes_toolbar_addButton_toolTip_text();

  @DefaultMessage("Add Interaction Type")
  public String administration_interactionTypes_toolbar_addButton_toolTip_title();

  @DefaultMessage("Delete the selected interaction type. System interaction types (Call, Screen) cannot be deleted")
  public String administration_interactionTypes_toolbar_deleteButton_toolTip_text();

  @DefaultMessage("Delete Interaction Type")
  public String administration_interactionTypes_toolbar_deleteButton_toolTip_title();

  @DefaultMessage("Edit the properties (name, etc.) of the selected interaction type")
  public String administration_interactionTypes_toolbar_editButton_toolTip_text();

  @DefaultMessage("Edit Interaction Type")
  public String administration_interactionTypes_toolbar_editButton_toolTip_title();

  @DefaultMessage("Remove all permissions from role")
  public String administration_roleManagement_editRoleWindow_leftAllSenderButton_toolTip_text();

  @DefaultMessage("Remove selected permission(s) from role")
  public String administration_roleManagement_editRoleWindow_leftSenderButton_toolTip_text();

  @DefaultMessage("Remove Permissions")
  public String administration_roleManagement_editRoleWindow_leftSenderButton_toolTip_title();

  @DefaultMessage("Some text to explain the purpose of this role")
  public String administration_roleManagement_editRoleWindow_propertiesPanel_descriptionField_toolTip_text();

  @DefaultMessage("Role Description")
  public String administration_roleManagement_editRoleWindow_propertiesPanel_descriptionField_toolTip_title();

  @DefaultMessage("A clear, unique name for this role")
  public String administration_roleManagement_editRoleWindow_propertiesPanel_nameField_toolTip_text();

  @DefaultMessage("Role Name")
  public String administration_roleManagement_editRoleWindow_propertiesPanel_nameField_toolTip_title();

  @DefaultMessage("This name is already in use! Please enter a unique name for this role")
  public String administration_roleManagement_editRoleWindow_propertiesPanel_nameField_uniqueError();

  @DefaultMessage("Add all permissions to role")
  public String administration_roleManagement_editRoleWindow_rightAllSenderButton_toolTip_text();

  @DefaultMessage("Add selected permission(s) to role")
  public String administration_roleManagement_editRoleWindow_rightSenderButton_toolTip_text();

  @DefaultMessage("Add Permissions")
  public String administration_roleManagement_editRoleWindow_rightSenderButton_toolTip_title();

  @DefaultMessage("Add a new user role to ScoreCARD")
  public String administration_roleManagement_toolBar_addButton_toolTip_text();

  @DefaultMessage("Add Role")
  public String administration_roleManagement_toolBar_addButton_toolTip_title();

  @DefaultMessage("Copy the selected user role as a new role")
  public String administration_roleManagement_toolBar_copyButton_toolTip_text();

  @DefaultMessage("Copy Role")
  public String administration_roleManagement_toolBar_copyButton_toolTip_title();

  @DefaultMessage("Cannot perform the operation")
  public String administration_roleManagement_toolBar_deletingError_RPCFailed_title();

  @DefaultMessage("The {0} role is in use, so cannot be deleted!")
  public String administration_roleManagement_toolBar_deletingRecordInUse_text(String name);

  @DefaultMessage("Alert!")
  public String administration_roleManagement_toolBar_deletingRecordInUse_title();

  @DefaultMessage("Edit the selected user role")
  public String administration_roleManagement_toolBar_editButton_toolTip_text();

  @DefaultMessage("Edit Role")
  public String administration_roleManagement_toolBar_editButton_toolTip_title();

  @DefaultMessage("Remove the selected user role")
  public String administration_roleManagement_toolBar_removeButton_toolTip_text();

  @DefaultMessage("Remove Role")
  public String administration_roleManagement_toolBar_removeButton_toolTip_title();

  @DefaultMessage("Cannot perform the operation")
  public String administration_roleManagement_toolBar_savingError_RPCFailed_title();

  @DefaultMessage("Login ID can only contain the following character types: a-Z . _ 0-9")
  public String administration_userManager_add_message_uniqueLogin_badChars_deleted();

  @DefaultMessage("The selected login name cannot be re-used, since the user is marked as deleted")
  public String administration_userManager_add_message_uniqueLogin_deleted();

  @DefaultMessage("This username already exists, please specify a unique username")
  public String administration_userManager_add_message_uniqueLogin_used();

  @DefaultMessage("Add a user to the current agent group")
  public String administration_userManager_addButton_toolTip_text();

  @DefaultMessage("Add User")
  public String administration_userManager_addButton_toolTip_title();

  @DefaultMessage("Edit the currently selected user")
  public String administration_userManager_editButton_toolTip_text();

  @DefaultMessage("Edit User")
  public String administration_userManager_editButton_toolTip_title();

  @DefaultMessage("Required text: enter the new password again")
  public String administration_userManager_editUser_confirmasswordFieldLabel_toolTip_text();

  @DefaultMessage("Confirm Password")
  public String administration_userManager_editUser_confirmasswordFieldLabel_toolTip_title();

  @DefaultMessage("The passwords are not the same!")
  public String administration_userManager_editUser_confirmPassword_notEqual_text();

  @DefaultMessage("Required text: new password (at least 8 characters long)")
  public String administration_userManager_editUser_newPasswordFieldLabel_toolTip_text();

  @DefaultMessage("New Password")
  public String administration_userManager_editUser_newPasswordFieldLabel_toolTip_title();

  @DefaultMessage("New password saved for user {0} {1}")
  public String administration_userManager_editUser_resetPassword_alertMessage_passwordSaved_text(String name, String surname);

  @DefaultMessage("User Updated")
  public String administration_userManager_editUser_resetPassword_alertMessage_passwordSaved_title();

  @DefaultMessage("The current user is not authorized for this operation")
  public String administration_userManager_editUser_resetPassword_alertMessage_passwordUpdateError_authorizationException_text();

  @DefaultMessage("Alert!")
  public String administration_userManager_editUser_resetPassword_alertMessage_passwordUpdateError_authorizationException_title();

  @DefaultMessage("User {0} {1} has an invalid (null) ID!")
  public String administration_userManager_editUser_resetPassword_alertMessage_passwordUpdateError_notAllowedException_text(String userName, String userSurname);

  @DefaultMessage("Alert!")
  public String administration_userManager_editUser_resetPassword_alertMessage_passwordUpdateError_notAllowedException_title();

  @DefaultMessage("An error occurred when attempting to save the password. Please contact the administrator if this error persists")
  public String administration_userManager_editUser_resetPassword_alertMessage_passwordUpdateError_text();

  @DefaultMessage("Alert!")
  public String administration_userManager_editUser_resetPassword_alertMessage_passwordUpdateError_title();

  @DefaultMessage("Sorry, you are not currently authorized to reset the password")
  public String administration_userManager_editUser_resetPasswordButton_message_noPermission_toolTip_text();

  @DefaultMessage("Alert!")
  public String administration_userManager_editUser_resetPasswordButton_message_noPermission_toolTip_title();

  @DefaultMessage("Change the existing password for this user")
  public String administration_userManager_editUser_resetPasswordButton_toolTip_text();

  @DefaultMessage("Reset Password")
  public String administration_userManager_editUser_resetPasswordButton_toolTip_title();

  @DefaultMessage("Cannot perform the operation")
  public String administration_userManager_message_onFailure_getAdminUserCount_notAllowException_title();

  @DefaultMessage("Cannot perform the operation")
  public String administration_userManager_message_onFailure_getAdminUserCount_otherException_title();

  @DefaultMessage("Cannot perform the operation")
  public String administration_userManager_message_onFailure_getAdminUserCount_title();

  @DefaultMessage("Required: set this user as active (available) or de-activated (unavailable) for evaluations and reports in ScoreCARD")
  public String administration_userManager_newEditUser_activeCheckButton_toolTip_text();

  @DefaultMessage("User Status")
  public String administration_userManager_newEditUser_activeCheckButton_toolTip_title();

  @DefaultMessage("Optional: the existing ScoreCARD group to which this user will belong (if any)")
  public String administration_userManager_newEditUser_agentGroupComboBox_toolTip_text();

  @DefaultMessage("Agent Group")
  public String administration_userManager_newEditUser_agentGroupComboBox_toolTip_title();

  @DefaultMessage("Optional number: unique Agent ID number")
  public String administration_userManager_newEditUser_agentIdRadioButton_toolTip_text();

  @DefaultMessage("Agent ID")
  public String administration_userManager_newEditUser_agentIdRadioButton_toolTip_title();

  @DefaultMessage("Alert!")
  public String administration_userManager_newEditUser_alertMessage_createUser_RPCFailed_authorizationException_title();

  @DefaultMessage("Cannot perform the operation")
  public String administration_userManager_newEditUser_alertMessage_createUser_RPCFailed_title();

  @DefaultMessage("Cannot create new user because maximum user count has been reached")
  public String administration_userManager_newEditUser_alertMessage_createUser_userLicenseFailed_text();

  @DefaultMessage("User License Error")
  public String administration_userManager_newEditUser_alertMessage_createUser_userLicenseFailed_title();

  @DefaultMessage("You have {0} user licenses available. Please contact your sales representative")
  public String administration_userManager_newEditUser_alertMessage_createUser_userLicenseWarn_text(int count);

  @DefaultMessage("User License Warning")
  public String administration_userManager_newEditUser_alertMessage_createUser_userLicenseWarn_title();

  @DefaultMessage("Added user {0} {1}")
  public String administration_userManager_newEditUser_alertMessage_creatingSuccess_text(String firstName, String surName);

  @DefaultMessage("Create User")
  public String administration_userManager_newEditUser_alertMessage_creatingSuccess_title();

  @DefaultMessage("E-mail address must be in the format \"username@example.com\"!")
  public String administration_userManager_newEditUser_alertMessage_emailInBadFormat_text();

  @DefaultMessage("Alert!")
  public String administration_userManager_newEditUser_alertMessage_emailInBadFormat_title();

  @DefaultMessage("Alert!")
  public String administration_userManager_newEditUser_alertMessage_saveUser_RPCFailed_authorizationException_title();

  @DefaultMessage("User {0} {1} has an invalid (null) ID!")
  public String administration_userManager_newEditUser_alertMessage_saveUser_RPCFailed_notAllowedException_text(String firstName, String surName);

  @DefaultMessage("Alert!")
  public String administration_userManager_newEditUser_alertMessage_saveUser_RPCFailed_notAllowedException_title();

  @DefaultMessage("Cannot perform the operation")
  public String administration_userManager_newEditUser_alertMessage_saveUser_RPCFailed_title();

  @DefaultMessage("Cannot activate user - maximum user count already reached")
  public String administration_userManager_newEditUser_alertMessage_updateUser_userLicenseFailed_text();

  @DefaultMessage("User license error")
  public String administration_userManager_newEditUser_alertMessage_updateUser_userLicenseFailed_title();

  @DefaultMessage("User {0} {1} updated")
  public String administration_userManager_newEditUser_alertMessage_updatingSuccess_text(String firstName, String surName);

  @DefaultMessage("User Update")
  public String administration_userManager_newEditUser_alertMessage_updatingSuccess_title();

  @DefaultMessage("Alert!")
  public String administration_userManager_newEditUser_alertMessage_userUpdatingError_authorizationException_title();

  @DefaultMessage("Cannot perform the operation")
  public String administration_userManager_newEditUser_alertMessage_userUpdatingError_notAllowedException_title();

  @DefaultMessage("An unknown problem with communication with server (error 186). Check that you are connected to your network and try to repeat the operation.")
  public String administration_userManager_newEditUser_alertMessage_userUpdatingError_text();

  @DefaultMessage("Cannot perform the operation")
  public String administration_userManager_newEditUser_alertMessage_userUpdatingError_title();

  @DefaultMessage("User {0} {1} updated")
  public String administration_userManager_newEditUser_alertMessage_userUpdatingSuccess_text(String firstName, String surName);

  @DefaultMessage("User Update")
  public String administration_userManager_newEditUser_alertMessage_userUpdatingSuccess_title();

  @DefaultMessage("Enter your chosen password again")
  public String administration_userManager_newEditUser_confirmPasswordFieldLabel_toolTip_text();

  @DefaultMessage("Re-type Password")
  public String administration_userManager_newEditUser_confirmPasswordFieldLabel_toolTip_title();

  @DefaultMessage("Required: the database to which this user will be added")
  public String administration_userManager_newEditUser_databaseComboBox_toolTip_text();

  @DefaultMessage("Database")
  public String administration_userManager_newEditUser_databaseComboBox_toolTip_title();

  @DefaultMessage("Enter a date to deactivate this user, or leave blank for no end date")
  public String administration_userManager_newEditUser_deactivationDate_toolTip_text();

  @DefaultMessage("De-Activation Date")
  public String administration_userManager_newEditUser_deactivationDate_toolTip_title();

  @DefaultMessage("Required text: the unique email address for this user")
  public String administration_userManager_newEditUser_emailFieldLabel_toolTip_text();

  @DefaultMessage("Email")
  public String administration_userManager_newEditUser_emailFieldLabel_toolTip_title();

  @DefaultMessage("If no email address is specified, the user will not receive ScoreCARD messages in his/her email inbox")
  public String administration_userManager_newEditUser_emptyEmailWarningLabel();

  @DefaultMessage("Required text: user first name (or forename)")
  public String administration_userManager_newEditUser_firstNameFieldLabel_toolTip_text();

  @DefaultMessage("First Name")
  public String administration_userManager_newEditUser_firstNameFieldLabel_toolTip_title();

  @DefaultMessage("Select the language for the application that is most suitable for this user")
  public String administration_userManager_newEditUser_languageComboBox_toolTip_text();

  @DefaultMessage("Language")
  public String administration_userManager_newEditUser_languageComboBox_toolTip_title();

  @DefaultMessage("Required text: unique user login ID")
  public String administration_userManager_newEditUser_nameFieldLabel_toolTip_text();

  @DefaultMessage("Login ID")
  public String administration_userManager_newEditUser_nameFieldLabel_toolTip_title();

  @DefaultMessage("Required text: the user password must be a minimum of 8 and maximum of 20 characters long")
  public String administration_userManager_newEditUser_passwordFieldLabel_toolTip_text();

  @DefaultMessage("Password")
  public String administration_userManager_newEditUser_passwordFieldLabel_toolTip_title();

  @DefaultMessage("Optional number: unique phone number for this user")
  public String administration_userManager_newEditUser_phoneRadioButton_toolTip_text();

  @DefaultMessage("Phone")
  public String administration_userManager_newEditUser_phoneRadioButton_toolTip_title();

  @DefaultMessage("Required: the type of user, selected from existing ScoreCARD roles")
  public String administration_userManager_newEditUser_roleFieldLabel_toolTip_text();

  @DefaultMessage("Role")
  public String administration_userManager_newEditUser_roleFieldLabel_toolTip_title();

  @DefaultMessage("Saving user...")
  public String administration_userManager_newEditUser_saving_text();

  @DefaultMessage("Required text: user surname (or family name)")
  public String administration_userManager_newEditUser_surnameFieldLabel_toolTip_text();

  @DefaultMessage("Surname")
  public String administration_userManager_newEditUser_surnameFieldLabel_toolTip_title();

  @DefaultMessage("Optional: keep this profile synchronized with the selected database")
  public String administration_userManager_newEditUser_synchronizedCheckBox_toolTip_text();

  @DefaultMessage("Synchronized")
  public String administration_userManager_newEditUser_synchronizedCheckBox_toolTip_title();

  @DefaultMessage("Optional: synchronizes this information with the selected database")
  public String administration_userManager_newEditUser_synchronizeNowButton_toolTip_text();

  @DefaultMessage("Synchronize Now")
  public String administration_userManager_newEditUser_synchronizeNowButton_toolTip_title();

  @DefaultMessage("A password must be at least 8 characters long and contain at least one of each of the following: a lowercase character (a-z), an uppercase character (A-Z), a number (0-9).")
  public String administration_userManager_password_regExError_text();

  @DefaultMessage("At least one administrator must remain in the application!")
  public String administration_userManager_removeButton_message_mustStayAdmin_toolTip_text();

  @DefaultMessage("Alert!")
  public String administration_userManager_removeButton_message_mustStayAdmin_toolTip_title();

  @DefaultMessage("You cannot delete your own user account!")
  public String administration_userManager_removeButton_message_myAccount_toolTip_text();

  @DefaultMessage("Alert!")
  public String administration_userManager_removeButton_message_myAccount_toolTip_title();

  @DefaultMessage("Removing user...")
  public String administration_userManager_removeButton_removing_text();

  @DefaultMessage("Remove the currently selected user permanently")
  public String administration_userManager_removeButton_toolTip_text();

  @DefaultMessage("Remove User")
  public String administration_userManager_removeButton_toolTip_title();

  @DefaultMessage("Are you sure you want to remove the selected user(s)?")
  public String administration_userManager_removeUser_questionMessage_text();

  @DefaultMessage("User Removal")
  public String administration_userManager_removeUser_questionMessage_title();

  @DefaultMessage("User(s) removed")
  public String administration_userManager_removeUser_removeSuccess_text();

  @DefaultMessage("User Removal")
  public String administration_userManager_removeUser_removeSuccess_title();

  @DefaultMessage("Alert!")
  public String administration_userManager_removeUser_RPCFailed_authorizationException_title();

  @DefaultMessage("At least one of the users to be deleted has an invalid (null) ID")
  public String administration_userManager_removeUser_RPCFailed_notAllowedException_text();

  @DefaultMessage("Alert!")
  public String administration_userManager_removeUser_RPCFailed_notAllowedException_title();

  @DefaultMessage("Cannot perform the operation")
  public String administration_userManager_removeUser_RPCFailed_title();

  @DefaultMessage("Are you sure you want to remove all {0} users?")
  public String administration_userManager_removeUsers_questionMessage_text(String usersNumber);

  @DefaultMessage("Multiple User Removal")
  public String administration_userManager_removeUsers_questionMessage_title();

  @DefaultMessage("User {0} {1} does not exist!")
  public String administration_userManger_addEditUser_messages_onFailure_noSuchEntityException_text(String userName, String userSurname);

  @DefaultMessage("Alert!")
  public String administration_userManger_addEditUser_messages_onFailure_noSuchEntityException_title();

  @DefaultMessage("User {0} {1} has an invalid (null) ID!")
  public String administration_userManger_addEditUser_messages_onFailure_notAllowedException_text(String userName, String userSurname);

  @DefaultMessage("Alert!")
  public String administration_userManger_addEditUser_messages_onFailure_notAllowedException_title();

  @DefaultMessage("Cannot perform the operation")
  public String administration_userManger_addEditUser_messages_onFailure_otherException_title();

  @DefaultMessage("Add a new wrapup. Call wrapup text can be identified here, for selection during agent evaluation.")
  public String administration_wrapUp_addButton_toolTip_text();

  @DefaultMessage("Add Wrapup")
  public String administration_wrapUp_addButton_toolTip_title();

  @DefaultMessage("Edit the currently selected wrapup")
  public String administration_wrapUp_editButton_toolTip_text();

  @DefaultMessage("Edit Wrapup")
  public String administration_wrapUp_editButton_toolTip_title();

  @DefaultMessage("Alert!")
  public String administration_wrapUp_message_wrapUpCreated_RPCFailed_authorizationException_title();

  @DefaultMessage("Wrap Up is too long. The Wrap Up is limited to 100 characters.")
  public String administration_wrapUp_message_wrapUpCreated_MaxLengthFailed_text();

  @DefaultMessage("Cannot perform the operation")
  public String administration_wrapUp_message_wrapUpCreated_RPCFailed_title();

  @DefaultMessage("Wrapup {0} created")
  public String administration_wrapUp_message_wrapUpCreated_success_text(String wrapUpName);

  @DefaultMessage("Create Wrapup")
  public String administration_wrapUp_message_wrapUpCreated_success_title();

  @DefaultMessage("Do you really want to remove wrapup {0}?")
  public String administration_wrapUp_message_wrapUpDelete_removeDecision_text(String description);

  @DefaultMessage("Remove Wrapup")
  public String administration_wrapUp_message_wrapUpDelete_removeDecision_title();

  @DefaultMessage("Alert!")
  public String administration_wrapUp_message_wrapUpDeleted_RPCFailed_authorizationException_title();

  @DefaultMessage("Cannot perform the operation")
  public String administration_wrapUp_message_wrapUpDeleted_RPCFailed_title();

  @DefaultMessage("Wrapup {0} deleted")
  public String administration_wrapUp_message_wrapUpDeleted_success_text(String wrapUpName);

  @DefaultMessage("Delete Wrapup")
  public String administration_wrapUp_message_wrapUpDeleted_success_title();

  @DefaultMessage("Alert!")
  public String administration_wrapUp_message_wrapUpUpdated_RPCFailed_authorizationRequiredException_title();

  @DefaultMessage("Cannot perform the operation")
  public String administration_wrapUp_message_wrapUpUpdated_RPCFailed_title();

  @DefaultMessage("Wrapup {0} updated")
  public String administration_wrapUp_message_wrapUpUpdated_success_text(String wrapUpName);

  @DefaultMessage("Update Wrapup")
  public String administration_wrapUp_message_wrapUpUpdated_success_title();

  @DefaultMessage("The database already contains a wrapup named {0}! Please specify a unique name")
  public String administration_wrapUp_messageBox_newWrapUpIsNotUnique_text(String wrapUpName);

  @DefaultMessage("Remove the currently selected wrapup permanently")
  public String administration_wrapUp_removeButton_toolTip_text();

  @DefaultMessage("Remove Wrapup")
  public String administration_wrapUp_removeButton_toolTip_title();

  @DefaultMessage("This wrapup already exists, please specify a unique wrapup name")
  public String administration_wrapUp_uniqueWrapUp();

  @DefaultMessage("Maximal length for wrapup description is 100 characters.")
  public String administration_wrapUp_wrapUpDescMaxSize();

  @DefaultMessage("Maximal length for wrapup is 100 characters.")
  public String administration_wrapUp_wrapUpMaxSize();

  @DefaultMessage("The entered text is not in the required format")
  public String appOptionGuiFactory_validation_textField_regexError();

  @DefaultMessage("Unable to retrieve the call storage location from the database")
  public String configuration_getConfigurationMap_onFailure_message_text();

  @DefaultMessage("Alert!")
  public String configuration_getConfigurationMap_onFailure_message_title();

  @DefaultMessage("{0} saved")
  public String dashboard_dashboardTab_savedMessage(String text);

  @DefaultMessage("The dashboard has been modified, would you like to save the changes?")
  public String dashboard_panel_saveDialog_saveBothText();

  @DefaultMessage("The default dashboard has been modified, would you like to save the changes?")
  public String dashboard_panel_saveDialog_saveDefaultText();

  @DefaultMessage("The user dashboard has been modified, would you like to save the changes?")
  public String dashboard_panel_saveDialog_saveUserText();

  @DefaultMessage("The selected questionnaires have different scoring systems")
  public String dashboard_topUsersWidget_differentScoringSystems_warningLabel();

  @DefaultMessage("Questionnaires with different scoring systems cannot be used for this widget")
  public String dashboard_trendWidget_differentScoringSystems_warningLabel();

  @DefaultMessage("{1}, {0}")
  public String dashboard_topUsersWidget_table_nameColumn(String name, String surname);

  @DefaultMessage("{0} - Questionnaire: {1} {2}, Group: {3}")
  public String dashboard_widget_config_baseTitle(String name, String questformName, String questformVersion, String groupName);

  @DefaultMessage("Out of range ({0}-{1})")
  public String dashboard_widget_config_countField_validatorMessage(int minCount, int maxCount);

  @DefaultMessage("{0} - Configuration")
  public String dashboard_widget_config_heading(String widgetHeading);

  @DefaultMessage(", Good Threshold: {0}, Bad Threshold: {1}, Scoring System: {2}")
  public String dashboard_widget_config_pieTitle(int goodThreshold, int badThreshold, String localizedScoringSystemString);

  @DefaultMessage("{0} - Questionnaire: {1}, Count: {2}")
  public String dashboard_widget_config_topGroupsTitle(String name, String questformName, int count);

  @DefaultMessage(", Count: {0}")
  public String dashboard_widget_config_topUsersTitle(int count);

  @DefaultMessage("Invalid questionnaire")
  public String dashboard_widget_config_trasholdValidator_badQuestformMessage();

  @DefaultMessage("''bad threshold'' value must not be greater than ''good threshold'' value")
  public String dashboard_widget_config_trasholdValidatorMessage();

  @DefaultMessage("No result for requested parameters")
  public String dashobard_pieWidget_noDataMessage();

  @DefaultMessage("Do you really want to remove {0}?")
  public String dministration_roleManagement_toolBar_removeDecision_text(String roleName);

  @DefaultMessage("Remove Role")
  public String dministration_roleManagement_toolBar_removeDecision_title();

  @DefaultMessage("Add a new {0}")
  public String editToolbar_addButton_toolTip_text(String objectName);

  @DefaultMessage("Add {0}")
  public String editToolbar_addButton_toolTip_title(String objectName);

  @DefaultMessage("Delete the selected {0}")
  public String editToolbar_deleteButton_toolTip_text(String objectName);

  @DefaultMessage("Delete {0}")
  public String editToolbar_deleteButton_toolTip_title(String objectName);

  @DefaultMessage("Edit the selected {0}")
  public String editToolbar_editButton_toolTip_text(String objectName);

  @DefaultMessage("Edit {0}")
  public String editToolbar_editButton_toolTip_title(String objectName);

  @DefaultMessage("Date: {0}")
  public String evaluations_evaluationList_evaluationForm_feedBackButton_improve_grid_date_defaultValue(String date);

  @DefaultMessage("Date: {0} ({1})")
  public String evaluations_evaluationList_evaluationForm_feedBackButton_improve_grid_date_defaultValueWithEvaluatorLogin(String date, String evaluatorLogin);

  @DefaultMessage("Date: {0}")
  public String evaluations_evaluationList_evaluationForm_feedBackButton_maintain_grid_date_defaultValue(String date);

  @DefaultMessage("Date: {0} ({1})")
  public String evaluations_evaluationList_evaluationForm_feedBackButton_maintain_grid_date_defaultValueWithEvaluatorLogin(String date, String evaluatorLogin);

  @DefaultMessage("Require a minimum number of agent interactions of the required media type(s) (e.g. calls)")
  public String evaluations_evaluationPlanner_addLineButton_toolTip_text();

  @DefaultMessage("Add Interaction Media")
  public String evaluations_evaluationPlanner_addLineButton_toolTip_title();

  @DefaultMessage("Add one or more specific interactions (such as calls), which satisfy certain criteria (e.g. recorded on a particular day)")
  public String evaluations_evaluationPlanner_addParticularCallButton_toolTip_text();

  @DefaultMessage("Add Specific Interaction(s)")
  public String evaluations_evaluationPlanner_addParticularCallButton_toolTip_title();

  @DefaultMessage("Interaction media (e.g. calls) can be replaced in the evaluation")
  public String evaluations_evaluationPlanner_allowCallReplaceButton_toolTip_text();

  @DefaultMessage("Allow Replacement")
  public String evaluations_evaluationPlanner_allowCallReplaceButton_toolTip_title();

  @DefaultMessage("Interaction media (such as calls) can be selected for the evaluation (allows specific interaction search)")
  public String evaluations_evaluationPlanner_allowCallSelectionButton_toolTip_text();

  @DefaultMessage("Allow Selection")
  public String evaluations_evaluationPlanner_allowCallSelectionButton_toolTip_title();

  @DefaultMessage("Allow modification of interaction media during evaluation")
  public String evaluations_evaluationPlanner_allowModificationButton_toolTip_text();

  @DefaultMessage("Allow Modification")
  public String evaluations_evaluationPlanner_allowModificationButton_toolTip_title();

  @DefaultMessage("Allow modification of interaction media during evaluation")
  public String evaluations_evaluationPlanner_allowModificationCheckBox_toolTip_text();

  @DefaultMessage("Allow Modification")
  public String evaluations_evaluationPlanner_allowModificationCheckBox_toolTip_title();

  @DefaultMessage("This option is enabled by default, and only editable when sub-criteria are defined")
  public String evaluations_evaluationPlanner_allowRandomCallsButton_toolTip_text();

  @DefaultMessage("Allow Random Call Selection")
  public String evaluations_evaluationPlanner_allowRandomCallsButton_toolTip_title();

  @DefaultMessage("Enable the results of this evaluation to be included in agent statistics (reports)")
  public String evaluations_evaluationPlanner_applyToStatisticsCheckBox_toolTip_text();

  @DefaultMessage("Apply To Statistics")
  public String evaluations_evaluationPlanner_applyToStatisticsCheckBox_toolTip_title();

  @DefaultMessage("Specify the direction of media (e.g. calls) used for this evaluation")
  public String evaluations_evaluationPlanner_basicTab_callDirectionComboBox_toolTip_text();

  @DefaultMessage("Media Direction")
  public String evaluations_evaluationPlanner_basicTab_callDirectionComboBox_toolTip_title();

  @DefaultMessage("{0}, {1} ({2})")
  public String evaluations_evaluationPlanner_basicTab_evaluatorGrid_displayValue(String surname, String name, String login);

  @DefaultMessage("{0}, {1}")
  public String speechrec_SpeechCriteria_displayValue(String id, String name);

  @DefaultMessage("Select a wrapup value (if available) that interactions such as calls must contain.")
  public String evaluations_evaluationPlanner_basicTab_wrapupComboBox_toolTip_text();

  @DefaultMessage("Wrapup")
  public String evaluations_evaluationPlanner_basicTab_wrapupComboBox_toolTip_title();

  @DefaultMessage("Number of days before the evaluation deadline that evaluators are sent an evaluation reminder")
  public String evaluations_evaluationPlanner_daysToDeadlineNumberField_toolTip_text();

  @DefaultMessage("Days To Deadline")
  public String evaluations_evaluationPlanner_daysToDeadlineNumberField_toolTip_title();

  @DefaultMessage("Enter the date for the evaluation deadline (last date when an evaluation can be performed)")
  public String evaluations_evaluationPlanner_deadlineDateField_toolTip_text();

  @DefaultMessage("Deadline Date")
  public String evaluations_evaluationPlanner_deadlineDateField_toolTip_title();

  @DefaultMessage("Select an evaluator for an agent evaluation, or one or more evaluators for an agent group evaluation")
  public String evaluations_evaluationPlanner_evaluatorComboBox_toolTip_text();

  @DefaultMessage("Evaluator")
  public String evaluations_evaluationPlanner_evaluatorComboBox_toolTip_title();

  @DefaultMessage("Enter the earliest date for the evaluation period")
  public String evaluations_evaluationPlanner_fromDateField_toolTip_text();

  @DefaultMessage("From Date")
  public String evaluations_evaluationPlanner_fromDateField_toolTip_title();

  @DefaultMessage("Enter the earliest time for evaluation")
  public String evaluations_evaluationPlanner_fromTimeField_toolTip_text();

  @DefaultMessage("From Time")
  public String evaluations_evaluationPlanner_fromTimeField_toolTip_title();

  @DefaultMessage("Choose to evaluate a whole agent group")
  public String evaluations_evaluationPlanner_groupEvaluationRadio_toolTip_text();

  @DefaultMessage("Group Evaluation")
  public String evaluations_evaluationPlanner_groupEvaluationRadio_toolTip_title();

  @DefaultMessage("Expected format: {0}")
  public String evaluations_evaluationPlanner_lengthFields_regexErrorMessage(String param);

  @DefaultMessage("The maximum interaction length (format: mm:ss or ss)")
  public String evaluations_evaluationPlanner_maxCallLengthField_toolTip_text();

  @DefaultMessage("Max Interaction Length")
  public String evaluations_evaluationPlanner_maxCallLengthField_toolTip_title();

  @DefaultMessage("The minimum number of interactions required - more may be added during evaluation")
  public String evaluations_evaluationPlanner_maxInteractions_toolTip_text();

  @DefaultMessage("Minimum Interaction Count")
  public String evaluations_evaluationPlanner_maxInteractions_toolTip_title();

  @DefaultMessage("The minimum length of an interaction (format: mm:ss or ss)")
  public String evaluations_evaluationPlanner_minCallLengthField_toolTip_text();

  @DefaultMessage("Min Interaction Length")
  public String evaluations_evaluationPlanner_minCallLengthField_toolTip_title();

  @DefaultMessage("Select a pre-defined evaluation period (To/From Dates can then be modified)")
  public String evaluations_evaluationPlanner_periodComboBox_toolTip_text();

  @DefaultMessage("Date Range")
  public String evaluations_evaluationPlanner_periodComboBox_toolTip_title();

  @DefaultMessage("Select a questionnaire to be used within this evaluation")
  public String evaluations_evaluationPlanner_questionaireComboBox_toolTip_text();

  @DefaultMessage("Questionnaire")
  public String evaluations_evaluationPlanner_questionaireComboBox_toolTip_title();

  @DefaultMessage("Enter the date on which to send a reminder (if the Remind Evaluator setting is enabled)")
  public String evaluations_evaluationPlanner_reminderDateField_toolTip_text();

  @DefaultMessage("Reminder Date")
  public String evaluations_evaluationPlanner_reminderDateField_toolTip_title();

  @DefaultMessage("Send a reminder to the evaluator(s)")
  public String evaluations_evaluationPlanner_remindEvaluatorCheckBox_toolTip_text();

  @DefaultMessage("Remind Evaluator")
  public String evaluations_evaluationPlanner_remindEvaluatorCheckBox_toolTip_title();

  @DefaultMessage("Do you wish to remove all agent interactions?")
  public String evaluations_evaluationPlanner_removeCallsDialog_text();

  @DefaultMessage("Remove Interactions")
  public String evaluations_evaluationPlanner_removeCallsDialog_title();

  @DefaultMessage("Choose to evaluate only one or more individual agent(s)")
  public String evaluations_evaluationPlanner_singleEvaluationRadio_toolTip_text();

  @DefaultMessage("Single Evaluation")
  public String evaluations_evaluationPlanner_singleEvaluationRadio_toolTip_title();

  @DefaultMessage("Delete external data")
  public String evaluations_evaluationPlanner_subcriteria_externalData_deleteLineButton_toolTip_text();

  @DefaultMessage("Delete")
  public String evaluations_evaluationPlanner_subcriteria_externalData_deleteLineButton_toolTip_title();

  @DefaultMessage("Require that this Sub-Criteria tab is complete before the editor can close this evaluation")
  public String evaluations_evaluationPlanner_subcriteriaRequiredCheckBox_toolTip_text();

  @DefaultMessage("Sub-Criteria Required")
  public String evaluations_evaluationPlanner_subcriteriaRequiredCheckBox_toolTip_title();

  @DefaultMessage("You are about to switch to Group Evaluation mode; associated calls will be removed. Do you wish to continue?")
  public String evaluations_evaluationPlanner_switchToGroupDialog_text();

  @DefaultMessage("A template name cannot be blank (spaces only), empty or with leading and trailing spaces")
  public String evaluations_evaluationPlanner_templateSaveWindow_templateNameValidation_notEmpty_text();

  @DefaultMessage("A template with this name already exists. Please specify a unique name")
  public String evaluations_evaluationPlanner_templateSaveWindow_templateNameValidation_notUnique_text();

  @DefaultMessage("Alert!")
  public String evaluations_evaluationPlanner_templateWindow_authorizationRequired_title();

  @DefaultMessage("The template could not be deleted. Please contact the administrator if this error persists")
  public String evaluations_evaluationPlanner_templateWindow_removeFailed_text();

  @DefaultMessage("Template Deletion")
  public String evaluations_evaluationPlanner_templateWindow_removeFailed_title();

  @DefaultMessage("The template could not be updated. Please contact the administrator if this error persists")
  public String evaluations_evaluationPlanner_templateWindow_updateFailed_text();

  @DefaultMessage("Template Update")
  public String evaluations_evaluationPlanner_templateWindow_updateFailed_title();

  @DefaultMessage("Enter the latest date for the evaluation period")
  public String evaluations_evaluationPlanner_toDateField_toolTip_text();

  @DefaultMessage("To Date")
  public String evaluations_evaluationPlanner_toDateField_toolTip_title();

  @DefaultMessage("Close the Evaluation Planner without saving any modifications")
  public String evaluations_evaluationPlanner_toolBar_cancelButton_toolTip_text();

  @DefaultMessage("Close")
  public String evaluations_evaluationPlanner_toolBar_cancelButton_toolTip_title();

  @DefaultMessage("Create the evaluation (modification of settings will no longer be possible!)")
  public String evaluations_evaluationPlanner_toolBar_createEvalsButton_toolTip_text();

  @DefaultMessage("Create Evaluations")
  public String evaluations_evaluationPlanner_toolBar_createEvalsButton_toolTip_title();

  @DefaultMessage("Create Template")
  public String evaluations_evaluationPlanner_toolBar_templateCreateButton_creatingTemplate_text();

  @DefaultMessage("Create an evaluation template from the current evaluation")
  public String evaluations_evaluationPlanner_toolBar_templateCreateButton_toolTip_text();

  @DefaultMessage("Save As Template")
  public String evaluations_evaluationPlanner_toolBar_templateCreateButton_toolTip_title();

  @DefaultMessage("Manage evaluation templates")
  public String evaluations_evaluationPlanner_toolBar_templatesButton_toolTip_text();

  @DefaultMessage("Templates")
  public String evaluations_evaluationPlanner_toolBar_templatesButton_toolTip_title();

  @DefaultMessage("Enter the latest time for evaluation")
  public String evaluations_evaluationPlanner_toTimeField_toolTip_text();

  @DefaultMessage("To Time")
  public String evaluations_evaluationPlanner_toTimeField_toolTip_title();

  @DefaultMessage("Validation Error")
  public String evaluations_evaluationsPlanner_agentsValidation_agentNotselected_toolTip_title();

  @DefaultMessage("The sum of all media type counts must be lower than the interaction count!")
  public String evaluations_evaluationsPlanner_basicTab_onAddCriteria_maxInteractionsExceeded_text();

  @DefaultMessage("Please add at least one media type to the current criteria!")
  public String evaluations_evaluationsPlanner_basicTab_onAddCriteria_mediaLimitMinimumError_text();

  @DefaultMessage("At least one evaluator must be selected")
  public String evaluations_evaluationsPlanner_evaluatorValidation_overAllError_text();

  @DefaultMessage("Validation Error")
  public String evaluations_evaluationsPlanner_evaluatorValidation_overAllError_toolTipTitle_title();

  @DefaultMessage("At least one media type is required!")
  public String evaluations_evaluationsPlanner_grid_mediaType_MediaNotPresent_tooltip_text();

  @DefaultMessage("Validation Error")
  public String evaluations_evaluationsPlanner_grid_mediaType_mediaNotPresent_toolTip_title();

  @DefaultMessage("Please add at least one media type to the current criteria!")
  public String evaluations_evaluationsPlanner_gridValidation_mediaNotPresent_tooltip_text();

  @DefaultMessage("Validation Error")
  public String evaluations_evaluationsPlanner_gridValidation_overAllError_toolTipTitle_title();

  @DefaultMessage("Validation Error")
  public String evaluations_evaluationsPlanner_groupsValidation_overAllError_toolTipTitle_title();

  @DefaultMessage("At least one group must be selected for evaluation!")
  public String evaluations_evaluationsPlanner_groupValidation_overAllError_text();

  @DefaultMessage("An agent must be selected for evaluation!")
  public String evaluations_evaluationsPlanner_message_agentValidation_agentNotSelected_tooltip_text();

  @DefaultMessage("{0} evaluation(s) created")
  public String evaluations_evaluationsPlanner_message_evaluationsCreatedText(Integer count);

  @DefaultMessage("{0} evaluation(s) created")
  public String interactionPanel_message_evaluationsCreatedText(Integer count);

  @DefaultMessage("Evaluation creation failed!")
  public String evaluations_evaluationsPlanner_message_evaluationsFailedText();

  @DefaultMessage("Invalid number format!")
  public String evaluations_evaluationsPlanner_onAddCriteria_externalData_numberFormatValidationError_text();

  @DefaultMessage("Reminder Date must be set before Deadline Date!")
  public String evaluations_evaluationsPlanner_onAddCriteria_reminderDateValidation_text();

  @DefaultMessage("To Date must be after From Date!")
  public String evaluations_evaluationsPlanner_onAddCriteria_toDateValidationError_text();

  @DefaultMessage("At least one media type is required!")
  public String evaluations_evaluationsPlanner_subriteriaTab_onAddCriteria_mediaLimitMinimumError_text();

  @DefaultMessage("At least one field in the Criteria tab is invalid!")
  public String evaluations_evaluationsPlanner_tabValidation_overAllError_tooltip_text();
  
  @DefaultMessage("One or more fields in the Criteria tab are invalid!")
  String evaluations_evaluationsPlanner_gridValidation_overAllError_toolTipTitle_text();

  @DefaultMessage("Validation Error")
  public String evaluations_evaluationsPlanner_tabValidation_overAllError_tooltip_title();

  @DefaultMessage("Template load Error")
  public String evaluations_evaluationsPlanner_toolbar_templatesMenu_templateLoadError_title();

  @DefaultMessage("Some groups or agents not assigned/accessible")
  public String evaluations_evaluationsPlanner_toolbar_templatesMenu_templateLoadError_text();

  @DefaultMessage("The selected template is no longer available. Please reload Evaluations Planner")
  public String evaluations_evaluationsPlanner_toolbar_templatesMenu_templateNotAvailableError_text();

  @DefaultMessage("Template Unavailable")
  public String evaluations_evaluationsPlanner_toolbar_templatesMenu_templateNotAvailableError_title();

  @DefaultMessage("{0} ({1})")
  public String evaluations_evaluationsPlanner_usedQuestionaireComboBox_displayMask(String qformName, String version);

  @DefaultMessage("The current user is not authorized for this operation")
  public String evaluations_listOfEvaluations_deleteEvaluation_authorizationException_text();

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_deleteEvaluation_authorizationException_title();

  @DefaultMessage("Evaluation(s) removed")
  public String evaluations_listOfEvaluations_deleteEvaluation_evaluationDeletedSuccess_text();

  @DefaultMessage("Evaluation Removal")
  public String evaluations_listOfEvaluations_deleteEvaluation_evaluationDeletedSuccess_title();

  @DefaultMessage("Training(s) removed")
  public String evaluations_listOfEvaluations_deleteTraining_evaluationDeletedSuccess_text();

  @DefaultMessage("Training Removal")
  public String evaluations_listOfEvaluations_deleteTraining_evaluationDeletedSuccess_title();

  @DefaultMessage("Survey(s) removed")
  public String evaluations_listOfEvaluations_deleteSurvey_evaluationDeletedSuccess_text();

  @DefaultMessage("Survey Removal")
  public String evaluations_listOfEvaluations_deleteSurvey_evaluationDeletedSuccess_title();

  @DefaultMessage("Evaluation update failed for evaluation: {0}; reason: no ID found")
  public String evaluations_listOfEvaluations_deleteEvaluation_noSuchEntityException_text(String evaluationName);

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_deleteEvaluation_noSuchEntityException_title();

  @DefaultMessage("Training update failed for training: {0}; reason: no ID found")
  public String evaluations_listOfEvaluations_deleteTraining_noSuchEntityException_text(String evaluationName);

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_deleteTraining_noSuchEntityException_title();

  @DefaultMessage("Survey update failed for survey: {0}; reason: no ID found")
  public String evaluations_listOfEvaluations_deleteSurvey_noSuchEntityException_text(String evaluationName);

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_deleteSurvey_noSuchEntityException_title();

  @DefaultMessage("Cannot perform the operation")
  public String evaluations_listOfEvaluations_deleteEvaluation_otherException_title();

  @DefaultMessage("Delete selected evaluations permanently")
  public String evaluations_listOfEvaluations_deleteEvaluationsButton_toolTip_text();

  @DefaultMessage("Delete Evaluations")
  public String evaluations_listOfEvaluations_deleteEvaluationsButton_toolTip_title();

  @DefaultMessage("Delete selected trainings permanently")
  public String evaluations_listOfEvaluations_deleteTrainingsButton_toolTip_text();

  @DefaultMessage("Delete Trainings")
  public String evaluations_listOfEvaluations_deleteTrainingsButton_toolTip_title();

  @DefaultMessage("Delete selected surveys permanently")
  public String evaluations_listOfEvaluations_deleteSurveysButton_toolTip_text();

  @DefaultMessage("Delete Surveys")
  public String evaluations_listOfEvaluations_deleteSurveysButton_toolTip_title();

  @DefaultMessage("Open a dialog to search for and add a specific interaction")
  public String evaluations_listOfEvaluations_evaluate_addParticularCallButton_toolTip_text();

  @DefaultMessage("Add Specific Interaction")
  public String evaluations_listOfEvaluations_evaluate_addParticularCallButton_toolTip_title();

  @DefaultMessage("Configuration Problem")
  String evaluations_listOfEvaluations_evaluate_addRandomCall_invalidConfigurationMessage_title();

  @DefaultMessage("Added {0} interaction(s)")
  public String evaluations_listOfEvaluations_evaluate_addRandomCall_successMessage_message(int count);

  @DefaultMessage("Add Interactions")
  public String evaluations_listOfEvaluations_evaluate_addRandomCall_successMessage_title();

  @DefaultMessage("{0}, {1}")
  public String evaluations_listOfEvaluations_evaluate_agentField_displayValue(String surname, String name);

  @DefaultMessage("The agent(s) being evaluated")
  public String evaluations_listOfEvaluations_evaluate_agentFieldLabel_toolTip_text();

  @DefaultMessage("Agent")
  public String evaluations_listOfEvaluations_evaluate_agentFieldLabel_toolTip_title();

  @DefaultMessage("Some or all interactions have already been evaluated, delete anyway?")
  public String evaluations_listOfEvaluations_evaluate_clearAllInterations_evalStartedWarning();

  @DefaultMessage("Some or all interaction has been already evaluated, delete anyway?")
  public String evaluations_listOfEvaluations_evaluate_clearInteration_evalStartedWarning();

  @DefaultMessage("Comments")
  public String evaluations_listOfEvaluations_evaluate_commentsTextArea_toolTip_text();

  @DefaultMessage("General notes from the evaluator regarding agent performance")
  public String evaluations_listOfEvaluations_evaluate_commentsTextArea_toolTip_title();

  @DefaultMessage("Mark this evaluation as complete. Ensure all interaction questionnaires are filled in first")
  public String evaluations_listOfEvaluations_evaluate_completeEvaluationButton_toolTip_text();

  @DefaultMessage("Complete Evaluation")
  public String evaluations_listOfEvaluations_evaluate_completeEvaluationButton_toolTip_title();

  @DefaultMessage("View a report of the results for this evaluation")
  public String evaluations_listOfEvaluations_evaluate_evaluationReportButton_toolTip_text();

  @DefaultMessage("Evaluation Report")
  public String evaluations_listOfEvaluations_evaluate_evaluationReportButton_toolTip_title();

  @DefaultMessage("ScoreCARD user who is responsible for this evaluation")
  public String evaluations_listOfEvaluations_evaluate_evaluatorFieldLabel_toolTip_text();

  @DefaultMessage("Evaluator")
  public String evaluations_listOfEvaluations_evaluate_evaluatorFieldLabel_toolTip_title();

  @DefaultMessage("{0}, {1}")
  public String evaluations_listOfEvaluations_evaluate_evaluatorLabel_displayValue(String surname, String name);

  @DefaultMessage("Notes from the evaluator regarding agent performance that needs to improve")
  public String evaluations_listOfEvaluations_evaluate_feedbackImproveTextArea_toolTip_text();

  @DefaultMessage("Feedback: To Improve")
  public String evaluations_listOfEvaluations_evaluate_feedbackImproveTextArea_toolTip_title();

  @DefaultMessage("Notes from the evaluator regarding agent performance that is acceptable")
  public String evaluations_listOfEvaluations_evaluate_feedbackMaintainTextArea_toolTip_text();

  @DefaultMessage("Feedback: To Maintain")
  public String evaluations_listOfEvaluations_evaluate_feedbackMaintainTextArea_toolTip_title();

  @DefaultMessage("Get the minimum number of required interactions by random selection of calls that fulfill selection criteria.")
  public String evaluations_listOfEvaluations_evaluate_getRandomIterationsButton_toolTip_text();

  @DefaultMessage("Get Random Interaction(s)")
  public String evaluations_listOfEvaluations_evaluate_getRandomIterationsButton_toolTip_title();

  @DefaultMessage("Feedback sent")
  public String evaluations_listOfEvaluations_evaluate_gradingForm_sendFeedbackButton_message();

  @DefaultMessage("Interaction has been removed")
  public String evaluations_listOfEvaluations_evaluate_grid_remove_successMessage_message();

  @DefaultMessage("Remove Interaction")
  public String evaluations_listOfEvaluations_evaluate_grid_remove_successMessage_title();

  @DefaultMessage("Use the play button (right) to listen to this call, then evaluate the call (far right button), or replace/delete the call (center right buttons)")
  public String evaluations_listOfEvaluations_evaluate_grid_typeColumn_call_toolTip_text();

  @DefaultMessage("Interaction: Call")
  public String evaluations_listOfEvaluations_evaluate_grid_typeColumn_call_toolTip_title();

  @DefaultMessage("This email record must be reviewed outside ScoreCARD")
  public String evaluations_listOfEvaluations_evaluate_grid_typeColumn_email_toolTip_text();

  @DefaultMessage("Interaction: Email")
  public String evaluations_listOfEvaluations_evaluate_grid_typeColumn_email_toolTip_title();

  @DefaultMessage("This chat record must be reviewed outside ScoreCARD")
  public String evaluations_listOfEvaluations_evaluate_grid_typeColumn_chat_toolTip_text();

  @DefaultMessage("Interaction: Chat")
  public String evaluations_listOfEvaluations_evaluate_grid_typeColumn_chat_toolTip_title();

  @DefaultMessage("This type of record must be reviewed outside ScoreCARD")
  public String evaluations_listOfEvaluations_evaluate_grid_typeColumn_other_toolTip_text();

  @DefaultMessage("Interaction: {0}")
  public String evaluations_listOfEvaluations_evaluate_grid_typeColumn_other_toolTip_title(String interactionType);

  @DefaultMessage("This type of record must be reviewed outside ScoreCARD")
  public String evaluations_listOfEvaluations_evaluate_grid_typeColumn_registration_toolTip_text();

  @DefaultMessage("Interaction: Registration")
  public String evaluations_listOfEvaluations_evaluate_grid_typeColumn_registration_toolTip_title();

  @DefaultMessage("Use the play button (right) to watch this video, then evaluate it (far right button), or replace/delete the video (center right buttons)")
  public String evaluations_listOfEvaluations_evaluate_grid_typeColumn_screen_toolTip_text();

  @DefaultMessage("Interaction: Screen")
  public String evaluations_listOfEvaluations_evaluate_grid_typeColumn_screen_toolTip_title();

  @DefaultMessage("Modify the existing parameters for this evaluation only")
  public String evaluations_listOfEvaluations_evaluate_changeEvaluationParametersButton_toolTip_text();

  @DefaultMessage("Change Evaluation Parameters")
  public String evaluations_listOfEvaluations_evaluate_changeEvaluationParametersButton_toolTip_title();

  @DefaultMessage("Include the results (scores) of this evaluation in statistics, for display in reports and graphs")
  public String evaluations_listOfEvaluations_evaluate_changeEvalutionParametersWindow_applyToStatistics_toolTip_text();

  @DefaultMessage("Include In Statistics")
  public String evaluations_listOfEvaluations_evaluate_changeEvalutionParametersWindow_applyToStatistics_toolTip_title();

  @DefaultMessage("The interaction has been replaced")
  public String evaluations_listOfEvaluations_evaluate_changeSelected_successMessage_message();

  @DefaultMessage("Change Interaction")
  public String evaluations_listOfEvaluations_evaluate_changeSelected_successMessage_title();

  @DefaultMessage("Unable to retrieve call storage location from database!")
  public String evaluations_listOfEvaluations_evaluate_mediaPlayer_configurationError_text();

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluate_mediaPlayer_configurationError_title();

  @DefaultMessage("The earliest and latest dates for interaction evaluation")
  public String evaluations_listOfEvaluations_evaluate_periodFieldLabel_toolTip_text();

  @DefaultMessage("Period")
  public String evaluations_listOfEvaluations_evaluate_periodFieldLabel_toolTip_title();

  @DefaultMessage("Name of the questionnaire being used in this evaluation")
  public String evaluations_listOfEvaluations_evaluate_questionaryFieldLabel_toolTip_text();

  @DefaultMessage("Questionnaire")
  public String evaluations_listOfEvaluations_evaluate_questionaryFieldLabel_toolTip_title();

  @DefaultMessage("Removed {0} interaction(s)")
  public String evaluations_listOfEvaluations_evaluate_removeAll_successMessage_message(int removedCallsCount);

  @DefaultMessage("Remove All Interactions")
  public String evaluations_listOfEvaluations_evaluate_removeAll_successMessage_title();

  @DefaultMessage("Removed {0} selected interaction(s)")
  public String evaluations_listOfEvaluations_evaluate_removeSelected_successMessage_message(int removedCallsCount);

  @DefaultMessage("Remove Interactions")
  public String evaluations_listOfEvaluations_evaluate_removeSelected_successMessage_title();

  @DefaultMessage("Remove selected interactions from this evaluation")
  public String evaluations_listOfEvaluations_evaluate_removeSelectedIterationsButton_toolTip_text();

  @DefaultMessage("Remove Selected")
  public String evaluations_listOfEvaluations_evaluate_removeSelectedIterationsButton_toolTip_title();

  @DefaultMessage("Send Agent Feedback")
  public String evaluations_listOfEvaluations_evaluate_sendAgentsFeedbackButton_toolTip_title();

  @DefaultMessage("Send feedback now to the agent under evaluation")
  public String evaluations_listOfEvaluations_evaluate_sendFeedbackButton_toolTip_text();

  @DefaultMessage("Send Feedback")
  public String evaluations_listOfEvaluations_evaluate_sendFeedbackButton_toolTip_title();

  @DefaultMessage("Show the settings chosen in the Evaluation Planner")
  public String evaluations_listOfEvaluations_evaluate_showEvaluationParametersButton_toolTip_text();

  @DefaultMessage("Show Evaluation Parameters")
  public String evaluations_listOfEvaluations_evaluate_showEvaluationParametersButton_toolTip_title();

  @DefaultMessage("No interactions found in database!")
  public String evaluations_listOfEvaluations_evaluate_subevalationGrid_replaceButton_callsNotFoundInDB_text();

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluate_subevalationGrid_replaceButton_callsNotFoundInDB_title();

  @DefaultMessage("Evaluator Form ({0})")
  public String evaluations_listOfEvaluations_evaluate_tabTitle_evaluatorForm(String evaluationID);

  @DefaultMessage("Grading Form ({0})")
  public String evaluations_listOfEvaluations_evaluate_tabTitle_gradingForm(String evaluationID);

  @DefaultMessage("Training ({0})")
  public String evaluations_listOfTrainings_evaluate_tabTitle_training(String evaluationID);

  @DefaultMessage("Survey Results ({0})")
  public String evaluations_listOfSurveys_evaluate_tabTitle_surveyResult(String evaluationID);

  @DefaultMessage("Open the evaluation form to begin the evaluation process")
  public String evaluations_listOfEvaluations_evaluateButton_toolTip_text();

  @DefaultMessage("Evaluate")
  public String evaluations_listOfEvaluations_evaluateButton_toolTip_title();

  @DefaultMessage("Open form to start Training")
  public String evaluations_listOfEvaluations_trainButton_toolTip_text();

  @DefaultMessage("Training")
  public String evaluations_listOfEvaluations_trainButton_toolTip_title();

  @DefaultMessage("Open evaluation form in read-only mode to review")
  public String evaluations_listOfEvaluations_viewEvaluationButton_toolTip_text();

  @DefaultMessage("View")
  public String evaluations_listOfEvaluations_viewEvaluationButton_toolTip_title();

  @DefaultMessage("Open training form in read-only mode to review")
  public String evaluations_listOfEvaluations_viewTrainingButton_toolTip_text();

  @DefaultMessage("View")
  public String evaluations_listOfEvaluations_viewTrainingButton_toolTip_title();

  @DefaultMessage("Open survey form in read-only mode to review")
  public String evaluations_listOfEvaluations_viewSurveyButton_toolTip_text();

  @DefaultMessage("View")
  public String evaluations_listOfEvaluations_viewSurveyButton_toolTip_title();

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluatePanel_addFastNote_authorizationException_title();

  @DefaultMessage("Evaluation update failed for evaluation: {0}; reason: no ID found")
  public String evaluations_listOfEvaluations_evaluatePanel_addFastNote_noSuchEntityException_text(String evaluationName);

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluatePanel_addFastNote_noSuchEntityException_title();

  @DefaultMessage("Cannot perform the operation")
  public String evaluations_listOfEvaluations_evaluatePanel_addFastNote_onFailureMessage_otherException_title();

  @DefaultMessage("Error sending email. Please contact the administrator if this error persists")
  public String evaluations_listOfEvaluations_evaluatePanel_addFastNote_onFailureMessage_sendMessageException_text();

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluatePanel_addFastNote_onFailureMessage_sendMessageException_title();

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCall_authorizationException_title();

  @DefaultMessage("Evaluation update failed for evaluation: {0}; reason: no ID found")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCall_noSuchEntityException_text(String evaluationName);

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCall_noSuchEntityException_title();

  @DefaultMessage("An unknown problem with communication with server (error 452). Check that you are connected to your network and try to repeat the operation.")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCall_onFailureMessage_otherException_text();

  @DefaultMessage("Cannot perform the operation")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCall_onFailureMessage_otherException_title();

  @DefaultMessage("Value must not be greater than today''s date")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallDialog_dateField_errorMessage();

  @DefaultMessage("From date must not be greater than To date")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallDialog_dateFields_errorMessage();

  @DefaultMessage("Max value must not be less then Min value")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallDialog_lengthFields_errorMessage();

  @DefaultMessage("Loading failed;")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallDialog_query_failed_title();

  @DefaultMessage("Loading media failed. Probably problem with setup of External Data or Wrapup.")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallDialog_query_failed_errorMessage();

  @DefaultMessage("{0}, {1}")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallWindow_agentField_displayValue(String surname, String name);

  @DefaultMessage("The evaluation has been changed. Do you want to save it before closing?")
  public String evaluations_listOfEvaluations_evaluatePanel_close_confirmSave_text();

  @DefaultMessage("Save")
  public String evaluations_listOfEvaluations_evaluatePanel_close_confirmSave_title();

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluatePanel_completeEvaluation_authorizationException_title();

  @DefaultMessage("Do you want to send feedback to the user?")
  public String evaluations_listOfEvaluations_evaluatePanel_completeEvaluation_confirmEmail_text();

  @DefaultMessage("Confirmation Email")
  public String evaluations_listOfEvaluations_evaluatePanel_completeEvaluation_confirmEmail_title();

  @DefaultMessage("Evaluation update failed for evaluation: {0}; reason: no ID found")
  public String evaluations_listOfEvaluations_evaluatePanel_completeEvaluation_noSuchEntityException_text(String evaluationName);

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluatePanel_completeEvaluation_noSuchEntityException_title();

  @DefaultMessage("Cannot perform the operation")
  public String evaluations_listOfEvaluations_evaluatePanel_completeEvaluation_RPCFailed_title();

  @DefaultMessage("Cannot perform the operation")
  public String evaluations_listOfEvaluations_evaluatePanel_completeEvalution_onFailureMessage_otherException_title();

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluatePanel_createEvaluations_authorizationException_title();

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluatePanel_createEvaluations_onFailureMessage_otherException_title();

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluatePanel_createGroupEvaluations_onFailureMessage_authorizationException_title();

  @DefaultMessage("There is an object with an invalid (null) ID in the evaluations group")
  public String evaluations_listOfEvaluations_evaluatePanel_createGroupEvaluations_onFailureMessage_notAllowedException_text();

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluatePanel_createGroupEvaluations_onFailureMessage_notAllowedException_title();

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluatePanel_createGroupEvaluations_onFailureMessage_otherException_title();

  @DefaultMessage("The template could not be created. Please contact the administrator if this error persists")
  public String evaluations_listOfEvaluations_evaluatePanel_createTemplate_failed_text();

  @DefaultMessage("Template Creation")
  public String evaluations_listOfEvaluations_evaluatePanel_createTemplate_failed_title();

  @DefaultMessage("Template created")
  public String evaluations_listOfEvaluations_evaluatePanel_createTemplate_success_text();

  @DefaultMessage("Template Creation")
  public String evaluations_listOfEvaluations_evaluatePanel_createTemplate_success_title();

  @DefaultMessage("Evaluation Detail")
  public String evaluations_listOfEvaluations_evaluatePanel_evaluationReport_evaluationDetail();

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluatePanel_getQuestionFormComplete_authorizationException_title();

  @DefaultMessage("Evaluation update failed for: {0}; reason: no ID found")
  public String evaluations_listOfEvaluations_evaluatePanel_getQuestionFormComplete_noSuchEntityException_text(String evaluationName);

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluatePanel_getQuestionFormComplete_noSuchEntityException_title();

  @DefaultMessage("The evaluation object: {0} has an invalid (null) ID")
  public String evaluations_listOfEvaluations_evaluatePanel_getQuestionFormComplete_onFailure_notAllowedException_text(String evalutionName);

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluatePanel_getQuestionFormComplete_onFailure_notAllowedException_title();

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluatePanel_getQuestionFormComplete_onFailure_otherException_title();

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluatePanel_getQuestionFormComplete_otherException_title();

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluatePanel_getRandomCalls_authorizationException_title();

  @DefaultMessage("Evaluation update failed for: {0}; reason: no ID found")
  public String evaluations_listOfEvaluations_evaluatePanel_getRandomCalls_noSuchEntityException_text(String evaluationName);

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluatePanel_getRandomCalls_noSuchEntityException_title();

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluatePanel_getRandomCalls_onFailureMessage_otherException_title();

  @DefaultMessage("{0}, {1}")
  public String evaluations_listOfEvaluations_evaluatePanel_gradingPanel_agentLabel_displayValue(String surname, String name);

  @DefaultMessage("You will lose unsaved data if you close this window now. Do you want to save the data?")
  public String evaluations_listOfEvaluations_evaluatePanel_gradingPanel_decisionQuestionSaveBeforeClose_text();

  @DefaultMessage("Close Confirmation")
  public String evaluations_listOfEvaluations_evaluatePanel_gradingPanel_decisionQuestionSaveBeforeClose_title();

  @DefaultMessage("From: {0}   To: {1}")
  public String evaluations_listOfEvaluations_evaluatePanel_gradingPanel_periodeLabelField_displayValue(String from, String to);

  @DefaultMessage("{0}")
  public String evaluations_listOfSurveys_surveyPanel_evalCallDateLabelField_displayValue(String date);

  @DefaultMessage("{0} ({1})")
  public String evaluations_listOfEvaluations_evaluatePanel_gradingPanel_questionaireLabel_displayMask(String qformname, String version);

  @DefaultMessage("Questionnaire")
  public String evaluations_listOfEvaluations_evaluatePanel_gradingPanel_questionaireLabel_toolTip_title();

  @DefaultMessage("Evaluation: {0} no longer exists in the database")
  public String evaluations_listOfEvaluations_evaluatePanel_loadEvalProperties_onFailureMessage_noSuchEntity_text(String evaluationName);

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluatePanel_loadEvalProperties_onFailureMessage_noSuchEntity_title();

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluatePanel_loadEvalProperties_onFailureMessage_otherException_title();

  @DefaultMessage("Count of interactions added: {0}")
  public String evaluations_listOfEvaluations_evaluatePanel_message_callsSuccessfulyAdded_text(int count);

  @DefaultMessage("Interactions Added")
  public String evaluations_listOfEvaluations_evaluatePanel_message_callsSuccessfulyAdded_title();

  @DefaultMessage("From: {0}   To: {1}")
  public String evaluations_listOfEvaluations_evaluatePanel_periodeLabelField_displayValue(String from, String to);

  @DefaultMessage("{0} ({1})")
  public String evaluations_listOfEvaluations_evaluatePanel_questionaireLabel_displayMask(String qformname, String version);

  @DefaultMessage("Evaluation already contains the specified number of interactions, so no new interactions added!")
  public String evaluations_listOfEvaluations_evaluatePanel_randomCalls_maximumReached_text();

  @DefaultMessage("The current user is not authorized for this operation")
  public String evaluations_listOfEvaluations_evaluatePanel_removeCalls_authorizationException_text();

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluatePanel_removeCalls_authorizationException_title();

  @DefaultMessage("Evaluation update failed for: {0}; reason: no ID found")
  public String evaluations_listOfEvaluations_evaluatePanel_removeCalls_noSuchEntityException_text(String evaluationName);

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluatePanel_removeCalls_noSuchEntityException_title();

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluatePanel_removeCalls_onFailureMessage_otherException_title();

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluatePanel_replaceCall_authorizationException_title();

  @DefaultMessage("Evaluation update failed for: {0}; reason: no ID found")
  public String evaluations_listOfEvaluations_evaluatePanel_replaceCall_noSuchEntityException_text(String evaluationName);

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluatePanel_replaceCall_noSuchEntityException_title();

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluatePanel_replaceCall_onFailureMessage_otherException_title();

  @DefaultMessage("There is no feedback to send.")
  public String evaluations_listOfEvaluations_evaluatePanel_sendFeedback_noFeedback_text();

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluatePanel_sendFeedback_noFeedback_title();

  @DefaultMessage("An error occurred while attempting to send feedback. Please contact the administrator.")
  public String evaluations_listOfEvaluations_evaluatePanel_sendFeedback_onFailure_text();

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluatePanel_sendFeedback_onFailure_title();

  @DefaultMessage("Feedback sent successfully")
  public String evaluations_listOfEvaluations_evaluatePanel_sendFeedback_onSuccess_text();

  @DefaultMessage("Send Feedback")
  public String evaluations_listOfEvaluations_evaluatePanel_sendFeedback_onSuccess_title();

  @DefaultMessage("Are you sure you want to remove evaluation(s) {0}?")
  public String evaluations_listOfEvaluations_evaluationRemoveDecision_text(String evaluationName);

  @DefaultMessage("Evaluation Deletion")
  public String evaluations_listOfEvaluations_evaluationRemoveDecision_title();

  @DefaultMessage("Are you sure you want to remove training(s) {0}?")
  public String evaluations_listOfEvaluations_trainingRemoveDecision_text(String trainingName);

  @DefaultMessage("Training Deletion")
  public String evaluations_listOfEvaluations_trainingRemoveDecision_title();

  @DefaultMessage("Are you sure you want to remove survey(s) {0}?")
  public String evaluations_listOfEvaluations_surveyRemoveDecision_text(String surveyName);

  @DefaultMessage("Survey Deletion")
  public String evaluations_listOfEvaluations_surveyRemoveDecision_title();

  @DefaultMessage("{0}, {1}")
  public String evaluations_listOfEvaluations_grid_agentColumn_displayMask(String surname, String name);

  @DefaultMessage("{0}, {1}")
  public String evaluations_listOfEvaluations_grid_evaluatorColumn_displayMask(String surname, String name);

  @DefaultMessage("{0} ({1})")
  public String evaluations_listOfEvaluations_grid_questionaireColumn_displayMask(String qformName, String version);

  @DefaultMessage("Evaluation parameters saved")
  public String evaluations_listOfEvaluations_changeParamWindow_saveInfoText();

  @DefaultMessage("The interaction being replaced has already been evaluated. Replace anyway?")
  public String evaluations_listOfEvaluations_changeSelected_confirm_text();

  @DefaultMessage("Change Confirmation")
  public String evaluations_listOfEvaluations_changeSelected_confirm_title();

  @DefaultMessage("Open the Evaluation Planner to create a new evaluation")
  public String evaluations_listOfEvaluations_newEvaluationButton_toolTip_text();

  @DefaultMessage("New Evaluation")
  public String evaluations_listOfEvaluations_newEvaluationButton_toolTip_title();

  @DefaultMessage("Open Training Planner to create new training")
  public String evaluations_listOfEvaluations_newTrainingButton_toolTip_text();

  @DefaultMessage("New Training")
  public String evaluations_listOfEvaluations_newTrainingButton_toolTip_title();

  @DefaultMessage("Open the selected evaluation")
  public String evaluations_listOfEvaluations_openEvaluationCombo_toolTip_text();

  @DefaultMessage("Open Evaluation")
  public String evaluations_listOfEvaluations_openEvaluationCombo_toolTip_title();

  @DefaultMessage("Re-use the selected evaluation by creating a copy")
  public String evaluations_listOfEvaluations_reEvaluateButton_toolTip_text();

  @DefaultMessage("Re-Evaluate")
  public String evaluations_listOfEvaluations_reEvaluateButton_toolTip_title();

  @DefaultMessage("Re-open the selected finished evaluation")
  public String evaluations_listOfEvaluations_reOpenButton_toolTip_text();

  @DefaultMessage("Re-open evaluation")
  public String evaluations_listOfEvaluations_reOpenButton_toolTip_title();

  @DefaultMessage("Optional: filter by category")
  public String evaluations_listOfEvaluations_searchCriteria_categoriesFieldLabel_toolTip_text();

  @DefaultMessage("Category")
  public String evaluations_listOfEvaluations_searchCriteria_categoryFieldLabel_toolTip_title();

  @DefaultMessage("{0}, {1}")
  public String evaluations_listOfEvaluations_searchCriteria_evaluatorCombo_displayValue(String surname, String name);

  @DefaultMessage("Optional: filter by group")
  public String evaluations_listOfEvaluations_searchCriteria_groupFieldLabel_toolTip_text();

  @DefaultMessage("Group")
  public String evaluations_listOfEvaluations_searchCriteria_groupFieldLabel_toolTip_title();

  @DefaultMessage("{0} ({1})")
  public String evaluations_listOfEvaluations_searchCriteria_questionaireComboBox_displayMask(String qformName, String version);

  @DefaultMessage("{0} - {1} ({2})")
  public String evaluations_listOfEvaluations_evaluate_evaluate_playRelatedCallComboBox_MaskField(String startdate, String enddate, String calllength);

  @DefaultMessage("To Date must be set after From Date!")
  public String evaluations_listOfEvaluations_searchCriteria_toDateGreaterThanFromDateError_text();

  @DefaultMessage("Optional: filter by Wrapup value")
  public String evaluations_listOfEvaluations_searchCriteria_wrapUpFieldLabel_toolTip_text();

  @DefaultMessage("Wrapup")
  public String evaluations_listOfEvaluations_searchCriteria_wrapUpFieldLabel_toolTip_title();

  @DefaultMessage("This evaluator was not found in the system")
  public String evaluations_listOfEvaluations_sendFeedbackDialog_onFailure_noSuchEntityException_text();

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_sendFeedbackDialog_onFailure_noSuchEntityException_title();

  @DefaultMessage("The evaluator user ID cannot be null (empty)")
  public String evaluations_listOfEvaluations_sendFeedbackDialog_onFailure_notAllowedException_text();

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_sendFeedbackDialog_onFailure_notAllowedException_title();

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_sendFeedbackDialog_onFailure_otherException_title();

  @DefaultMessage("Message was sent successfully")
  public String evaluations_listOfEvaluations_sendFeedbackDialog_sendSuccessful_text();

  @DefaultMessage("Send Message")
  public String evaluations_listOfEvaluations_sendFeedbackDialog_sendSuccessful_title();

  @DefaultMessage("This field is required")
  public String evaluations_listOfEvaluations_sendFeedbackDialog_messageBox_emptyValue_text();

  @DefaultMessage("View a report for the results of this evaluation")
  public String evaluations_listOfEvaluations_toolBar_evaluationReportButton_toolTip_text();

  @DefaultMessage("Evaluation Report")
  public String evaluations_listOfEvaluations_toolBar_evaluationReportButton_toolTip_title();

  @DefaultMessage("View results report for training")
  public String evaluations_listOfEvaluations_toolBar_trainingReportButton_toolTip_text();

  @DefaultMessage("Training Report")
  public String evaluations_listOfEvaluations_toolBar_trainingReportButton_toolTip_title();

  @DefaultMessage("View results report for survey")
  public String evaluations_listOfEvaluations_toolBar_surveyReportButton_toolTip_text();

  @DefaultMessage("Survey Report")
  public String evaluations_listOfEvaluations_toolBar_surveyReportButton_toolTip_title();

  @DefaultMessage("View all feedback for this agent")
  public String evaluations_listOfEvaluations_toolBar_historyForFeedbacksButton_toolTip_text();

  @DefaultMessage("Feedback History")
  public String evaluations_listOfEvaluations_toolBar_historyForFeedbacksButton_toolTip_title();

  @DefaultMessage("The Agent ID or Phone is not enabled in User Manager. Search by Agent is disabled. Verify settings in User Manager.")
  public String evaluations_planner_addSpecificInteraction_agentIdentifierIsNone_warnMessage();

  @DefaultMessage("Either all Agent IDs or Phones are not enabled in User Manager. Search by Agent is disabled. Verify settings in User Manager.")
  public String evaluations_planner_addSpecificInteraction_allAgentsIdentifierIsNone_warnMessage();

  @DefaultMessage("No data found according to current criteria")
  public String chartNode_anyChartPanel_computeChart_info();

  @DefaultMessage("Login was successful, but ScoreCARD license is missing or has expired. Please contact the administrator if this error persists")
  public String licenseAlert_text();

  @DefaultMessage("License Alert")
  public String licenseAlert_title();

  @DefaultMessage("Alert!")
  public String loginDialog_forgotPassword_confirmTitle();

  @DefaultMessage("A new password has been generated for user {0}")
  public String loginDialog_forgotPassword_passwordSentSuccess(String userLogin);

  @DefaultMessage("Please enter the login of the user. A new password will be generated and sent to the e-mail account registered for this account")
  public String loginDialog_forgotPassword_promptMessage();

  @DefaultMessage("The username you entered does not exist")
  public String loginDialog_forgotPassword_userNotFound();

  @DefaultMessage("The username you entered is an external account - the password cannot be reset")
  public String loginDialog_forgotPassword_userIsExternal();

  @DefaultMessage("An unknown problem with communication with server (error 676). Check that you are connected to your network and try to repeat the operation.")
  public String loginDialog_massages_onFailure_otherException_text();

  @DefaultMessage("Cannot perform the operation")
  public String loginDialog_massages_onFailure_otherException_title();

  @DefaultMessage("User name is required")
  public String loginDialog_required_loginField();

  @DefaultMessage("Password is required")
  public String loginDialog_required_passwordField();

  @DefaultMessage("{0} grd")
  public String questionaires_grades_format(String gradesValue);

  @DefaultMessage("{0} %")
  public String questionaires_percentage_format(String percentageValue);

  @DefaultMessage("{0} pts")
  public String questionaires_points_format(String pointsValue);

  @DefaultMessage("Alert")
  public String questionaires_questionaire_importQuestionnaire_error_title();

  @DefaultMessage("Optional text: additional information about this answer")
  public String questionaires_Questionaire_QuestionaireDetail_AnswerGrid_RowEditor_DescriptionTextField_ToolTip_Text();

  @DefaultMessage("Answer Description")
  public String questionaires_Questionaire_QuestionaireDetail_AnswerGrid_RowEditor_DescriptionTextField_ToolTip_Title();

  @DefaultMessage("Required text: the text that appears for this answer")
  public String questionaires_Questionaire_QuestionaireDetail_AnswerGrid_RowEditor_NameTextField_ToolTip_Text();

  @DefaultMessage("Answer Name")
  public String questionaires_Questionaire_QuestionaireDetail_AnswerGrid_RowEditor_NameTextField_ToolTip_Title();

  @DefaultMessage("The answer text must be unique!")
  public String questionaires_Questionaire_QuestionaireDetail_AnswerGrid_RowEditor_NameTextField_Validatior_UniqueError();

  @DefaultMessage("Answer digit key must be unique!")
  public String questionaires_Questionaire_QuestionaireDetail_AnswerGrid_RowEditor_KeyComboBox_Validatior_UniqueError();

  @DefaultMessage("Required number: the numeric weight of this answer in a questionnaire")
  public String questionaires_Questionaire_QuestionaireDetail_AnswerGrid_RowEditor_ValueTextField_ToolTip_Text();

  @DefaultMessage("Answer Weight")
  public String questionaires_Questionaire_QuestionaireDetail_AnswerGrid_RowEditor_ValueTextField_ToolTip_Title();

  @DefaultMessage("Agent Extension Length")
  public String questionaires_Questionaire_QuestionaireDetail_CallSelectionRules_AgentsExtensionLengthCheckBox_ToolTipTitle();

  @DefaultMessage("Allow Internal Call Scoring")
  public String questionaires_Questionaire_QuestionaireDetail_CallSelectionRules_AllowInternalCallsScoringCheckBox_ToolTipTitle();

  @DefaultMessage("Optional: if selected, the call number must match the agent phone number exactly for selection. If not selected, a call will be selected when the agent phone number is found within the called number.")
  public String questionaires_Questionaire_QuestionaireDetail_CallSelectionRules_ExactNumberCheckBox_ToolTipText();

  @DefaultMessage("Exact Number")
  public String questionaires_Questionaire_QuestionaireDetail_CallSelectionRules_ExactNumberCheckBox_ToolTipTitle();

  @DefaultMessage("Matching Part Title")
  public String questionaires_Questionaire_QuestionaireDetail_CallSelectionRules_MatchingPartCheckBox_ToolTipTitle();

  @DefaultMessage("To value needs to be greater than From value")
  public String questionaires_Questionaire_QuestionaireDetail_CallSelectionRules_RecordCriteriaPanel_fromTimeGreaterThanToTimeError_text();

  @DefaultMessage("SIP Number")
  public String questionaires_Questionaire_QuestionaireDetail_CallSelectionRules_SIPNumberCheckBox_ToolTip_Title();

  @DefaultMessage("Do you really want to close questionnaire {0} without saving?")
  public String questionaires_Questionaire_QuestionaireDetail_decisionQuestionReallyClose_text(String questformName);

  @DefaultMessage("Close Confirmation")
  public String questionaires_Questionaire_QuestionaireDetail_decisionQuestionReallyClose_title();

  @DefaultMessage("Do you really want to change the scoring system? This operation may result in rounding of weights")
  public String questionaires_Questionaire_QuestionaireDetail_Details_ScoringSystem_ChangeConfirmation_Text();

  @DefaultMessage("Confirm Scoring System Change")
  public String questionaires_Questionaire_QuestionaireDetail_Details_ScoringSystem_ChangeConfirmation_Title();

  @DefaultMessage("Optional text: additional information about this group")
  public String questionaires_Questionaire_QuestionaireDetail_GroupManager_Grid_RowEditor_GroupDescriptionTextField_ToolTip_Text();

  @DefaultMessage("Group Description")
  public String questionaires_Questionaire_QuestionaireDetail_GroupManager_Grid_RowEditor_GroupDescriptionTextField_ToolTip_Title();

  @DefaultMessage("Required text: a unique name for this question group")
  public String questionaires_Questionaire_QuestionaireDetail_GroupManager_Grid_RowEditor_GroupNameTextField_ToolTip_Text();

  @DefaultMessage("Group Name")
  public String questionaires_Questionaire_QuestionaireDetail_GroupManager_Grid_RowEditor_GroupNameTextField_ToolTip_Title();

  @DefaultMessage("Required number: the level of weight (or influence) in the final rating, measured in the current scoring system")
  public String questionaires_Questionaire_QuestionaireDetail_GroupManager_Grid_RowEditor_GroupValueTextField_ToolTip_Text();

  @DefaultMessage("Group Weight")
  public String questionaires_Questionaire_QuestionaireDetail_GroupManager_Grid_RowEditor_GroupValueTextField_ToolTip_Title();

  @DefaultMessage("The group {0} is not empty. Do you really want to remove it?")
  public String questionaires_Questionaire_QuestionaireDetail_GroupManager_RemoveGroupDecision_Text(String groupname);

  @DefaultMessage("Remove Group")
  public String questionaires_Questionaire_QuestionaireDetail_GroupManager_RemoveGroupDecision_Title();

  @DefaultMessage("{0}, {1} ({2,number} items) - {3}")
  @AlternateMessage({"one", "{0}, {1} ({2,number} item) - {3}"})
  public String questionaires_Questionaire_QuestionaireDetail_GroupQuestionGrid_GroupView_Items_displayValue(String groupname, String numberString, @PluralCount(DefaultRule_en.class) int count, String description);

  @DefaultMessage("{0}, {1} ({2,number} items)")
  @AlternateMessage({"one", "{0}, {1} ({2,number} item)"})
  public String questionaires_Questionaire_QuestionaireDetail_GroupQuestionGrid_GroupView_Items_displayValueNoDescription(String groupname, String numberString, @PluralCount(DefaultRule_en.class) int count);

  @DefaultMessage("The question {0} is not empty. Do you really want to remove it?")
  public String questionaires_Questionaire_QuestionaireDetail_GroupQuestionGrid_RemoveQuestionDecision_Text(String questionText);

  @DefaultMessage("Remove Question")
  public String questionaires_Questionaire_QuestionaireDetail_GroupQuestionGrid_RemoveQuestionDecision_Title();

  @DefaultMessage("The question text must be unique!")
  public String questionaires_Questionaire_QuestionaireDetail_GroupQuestionGrid_RowEditor_NameTextField_Validatior_UniqueError();

  @DefaultMessage("The questionnaire form: {0} has an invalid (null) ID")
  public String questionaires_Questionaire_QuestionaireDetail_messages_onFailed_notAllowedException_text(String groupName);

  @DefaultMessage("Alert!")
  public String questionaires_Questionaire_QuestionaireDetail_messages_onFailed_notAllowedException_title();

  @DefaultMessage("Cannot perform the operation")
  public String questionaires_Questionaire_QuestionaireDetail_messages_onFailed_otherException_title();

  @DefaultMessage("Questionnaire ID: {0}")
  public String questionaires_Questionaire_QuestionaireDetail_QuestformIdLabel_Value(Integer questformId);

  @DefaultMessage("Status:")
  public String questionaires_Questionaire_QuestionaireDetail_QuestformCompleteLabel_Status();

  @DefaultMessage("Questionnaire is valid and ready for use")
  public String questionaires_Questionaire_QuestionaireDetail_QuestformCompleteLabel_Complete();

  @DefaultMessage("Questionnaire is used - save a copy to make changes")
  public String questionaires_Questionaire_QuestionaireDetail_QuestformCompleteLabel_QuestformUsedInEvaluation();

  @DefaultMessage("Questionnaire, or parts of it, are blank")
  public String questionaires_Questionaire_QuestionaireDetail_QuestformCompleteLabel_BlankForm();

  @DefaultMessage("Some questions have wrong percentage sums")
  public String questionaires_Questionaire_QuestionaireDetail_QuestformCompleteLabel_WrongPercentageSum();

  @DefaultMessage("Names are not unique")
  public String questionaires_Questionaire_QuestionaireDetail_QuestformCompleteLabel_NamesNotUnique();

  @DefaultMessage("Check specific properties of survey questionnaire")
  public String questionaires_Questionaire_QuestionaireDetail_QuestformCompleteLabel_MissingSurveyProperties();

  @DefaultMessage("Questionnaire is invalid")
  public String questionaires_Questionaire_QuestionaireDetail_QuestformCompleteLabel_Incomplete();

  @DefaultMessage("({0} issue(s)...)")
  public String questionaires_Questionaire_QuestionaireDetail_QuestformCompleteLabel_Errors(Integer errorCount);

  @DefaultMessage("Questionnaire form has no groups")
  public String questionaires_Questionaire_QuestionaireDetail_QuestformCompleteLabel_QuestformEmpty();

  @DefaultMessage("Questionnaire group has no questions")
  public String questionaires_Questionaire_QuestionaireDetail_QuestformCompleteLabel_GroupEmpty();

  @DefaultMessage("Question has no answers")
  public String questionaires_Questionaire_QuestionaireDetail_QuestformCompleteLabel_QuestionEmpty();

  @DefaultMessage("Question needs one answer with compliance \"None\"")
  public String questionaires_Questionaire_QuestionaireDetail_QuestformCompleteLabel_ScoredAnswerMissing();

  @DefaultMessage("Multiple question groups with same name")
  public String questionaires_Questionaire_QuestionaireDetail_QuestformCompleteLabel_GroupNameNotUnique();

  @DefaultMessage("Multiple questions with same name in same group")
  public String questionaires_Questionaire_QuestionaireDetail_QuestformCompleteLabel_QuestionNameNotUnique();

  @DefaultMessage("Multiple answers with same name for same question")
  public String questionaires_Questionaire_QuestionaireDetail_QuestformCompleteLabel_AnswerNameNotUnique();

  @DefaultMessage("Sum of question group weight values does not equal 100%")
  public String questionaires_Questionaire_QuestionaireDetail_QuestformCompleteLabel_QuestformValueIncorrect();

  @DefaultMessage("Sum of question weight values does not equal 100%")
  public String questionaires_Questionaire_QuestionaireDetail_QuestformCompleteLabel_GroupValueIncorrect();

  @DefaultMessage("Answer has score value outside range")
  public String questionaires_Questionaire_QuestionaireDetail_QuestformCompleteLabel_AnswerValueInvalid();

  @DefaultMessage("Survey question has no media file")
  public String questionaires_Questionaire_QuestionaireDetail_QuestformCompleteLabel_MediaFileEmpty();

  @DefaultMessage("Survey question does not have the last answer with compliance \"n/a\" and key \"None\"")
  public String questionaires_Questionaire_QuestionaireDetail_QuestformCompleteLabel_LastAnswerIncorrect();

  @DefaultMessage("Survey answer has no digit key")
  public String questionaires_Questionaire_QuestionaireDetail_QuestformCompleteLabel_AnswerKeyEmpty();

  @DefaultMessage("Multiple answers with same key for same question")
  public String questionaires_Questionaire_QuestionaireDetail_QuestformCompleteLabel_AnswerKeyNotUnique();

  @DefaultMessage("Required text: the unique text name that identifies this questionnaire in the Questionnaire Manager")
  public String questionaires_Questionaire_QuestionaireDetail_QuestformNameTextField_ToolTip_Text();

  @DefaultMessage("Questionnaire Name:")
  public String questionaires_Questionaire_QuestionaireDetail_QuestformNameTextField_ToolTip_Title();

  @DefaultMessage("Required number: the version number of this questionnaire")
  public String questionaires_Questionaire_QuestionaireDetail_QuestformVersionTextField_ToolTip_Text();

  @DefaultMessage("Version:")
  public String questionaires_Questionaire_QuestionaireDetail_QuestformVersionTextField_ToolTip_Title();

  @DefaultMessage("Optional text: additional information about this group")
  public String questionaires_Questionaire_QuestionaireDetail_QuestionaireAddGroup_GroupDescriptionTextField_ToolTip_Text();

  @DefaultMessage("Group Description")
  public String questionaires_Questionaire_QuestionaireDetail_QuestionaireAddGroup_GroupDescriptionTextField_ToolTip_Title();

  @DefaultMessage("Required text: a unique name for this question group")
  public String questionaires_Questionaire_QuestionaireDetail_QuestionaireAddGroup_GroupNameTextField_ToolTip_Text();

  @DefaultMessage("Group Name")
  public String questionaires_Questionaire_QuestionaireDetail_QuestionaireAddGroup_GroupNameTextField_ToolTip_Title();

  @DefaultMessage("Required number: the level of weight (or influence) in the final rating, measured in the current scoring system")
  public String questionaires_Questionaire_QuestionaireDetail_QuestionaireAddGroup_GroupValueTextField_ToolTip_Text();

  @DefaultMessage("Group Weight")
  public String questionaires_Questionaire_QuestionaireDetail_QuestionaireAddGroup_GroupValueTextField_ToolTip_Title();

  @DefaultMessage("Saving a copy of the questionnaire...")
  public String questionaires_Questionaire_QuestionaireDetail_ToolBar_SaveAsCopyButton_Saveing_text();

  @DefaultMessage("Alert!")
  public String questionaires_Questionaire_QuestionaireDetail_ToolBar_SaveAsCopyButton_SavingError_RPCFailed_authorizationRequiredException_title();

  @DefaultMessage("The questionnaire form: {0} has an invalid (null) ID")
  public String questionaires_Questionaire_QuestionaireDetail_ToolBar_SaveAsCopyButton_SavingError_RPCFailed_notAllowedException_text(String questFormBoName);

  @DefaultMessage("Alert!")
  public String questionaires_Questionaire_QuestionaireDetail_ToolBar_SaveAsCopyButton_SavingError_RPCFailed_notAllowedException_title();

  @DefaultMessage("The questionnaire form: {0} is already being used!")
  public String questionaires_Questionaire_QuestionaireDetail_ToolBar_SaveAsCopyButton_SavingError_RPCFailed_recordInUseException_text(String questFormBoName);

  @DefaultMessage("Alert!")
  public String questionaires_Questionaire_QuestionaireDetail_ToolBar_SaveAsCopyButton_SavingError_RPCFailed_recordInUseException_title();

  @DefaultMessage("Alert!")
  public String questionaires_Questionaire_QuestionaireDetail_ToolBar_SaveAsCopyButton_SavingError_RPCFailed_title();

  @DefaultMessage("The questionnaire cannot be saved - this name and version are already used in the application! Please modify the name and/or version before saving")
  public String questionaires_questionaire_questionaireDetail_toolBar_saveButton_cannotSaveThisNameAndVersionAlreadyExistError_text();

  @DefaultMessage("Alert!")
  public String questionaires_questionaire_questionaireDetail_toolBar_saveButton_cannotSaveThisNameAndVersionAlreadyExistError_title();

  @DefaultMessage("The questionnaire cannot be saved - ensure the name and version are unique!")
  public String questionaires_Questionaire_QuestionaireDetail_ToolBar_SaveButton_CannotSaveUniqueNameAndVersionError_text();

  @DefaultMessage("Cannot Save Questionnaire")
  public String questionaires_Questionaire_QuestionaireDetail_ToolBar_SaveButton_CannotSaveUniqueNameAndVersionError_title();

  @DefaultMessage("Alert!")
  public String questionaires_Questionaire_QuestionaireDetail_ToolBar_SaveButton_CanSave_RPCFailed_title();

  @DefaultMessage("Validating save...")
  public String questionaires_Questionaire_QuestionaireDetail_ToolBar_SaveButton_CanSave_text();

  @DefaultMessage("Saving questionnaire...")
  public String questionaires_Questionaire_QuestionaireDetail_ToolBar_SaveButton_Saveing_text();

  @DefaultMessage("Alert!")
  public String questionaires_Questionaire_QuestionaireDetail_ToolBar_SaveButton_SavingError_authorizationException_title();

  @DefaultMessage("The questionnaire form: {0} has an invalid (null) ID")
  public String questionaires_Questionaire_QuestionaireDetail_ToolBar_SaveButton_SavingError_notAllowedException_text(String questFormBoName);

  @DefaultMessage("Alert!")
  public String questionaires_Questionaire_QuestionaireDetail_ToolBar_SaveButton_SavingError_notAllowedException_title();

  @DefaultMessage("The questionnaire form: {0} is already being used!")
  public String questionaires_Questionaire_QuestionaireDetail_ToolBar_SaveButton_SavingError_recordInUseException_text(String questFormBoName);

  @DefaultMessage("Alert!")
  public String questionaires_Questionaire_QuestionaireDetail_ToolBar_SaveButton_SavingError_recordInUseException_title();

  @DefaultMessage("Alert!")
  public String questionaires_Questionaire_QuestionaireDetail_ToolBar_SaveButton_SavingError_RPCFailed_title();

  @DefaultMessage("Removing questionnaire...")
  public String questionaires_questionaire_removeButton_removing_text();

  @DefaultMessage("Alert!")
  public String questionaires_Questionaire_SavingError_RPCFailed_title();

  @DefaultMessage("This operation is not allowed on questionnaire")
  public String questionaires_Questionaire_SavingNotAllowed_Text();

  @DefaultMessage("Not Allowed")
  public String questionaires_Questionaire_SavingNotAllowed_Title();

  @DefaultMessage("The questionnaire {0} is currently used in an evaluation and therefore cannot be deleted!")
  public String questionaires_questionaire_savingRecordInUse_text(String qFormName);

  @DefaultMessage("Alert!")
  public String questionaires_questionaire_savingRecordInUse_title();

  @DefaultMessage("Import a previously exported questionnaire (file must be in XML format only)")
  public String questionaires_questionaire_toolBar_importQuestionaire_text();

  @DefaultMessage("Import Questionnaire")
  public String questionaires_questionaire_toolBar_importQuestionaire_title();

  @DefaultMessage("Only valid XML files can be imported")
  public String questionaires_questionaire_toolBar_importQuestionaireButton_importValidator_wrongFileFormat_value();

  @DefaultMessage("Questionnaire {0} ({1}) cannot be removed because it is open. Switch to the questionnaire tab?")
  public String questionaires_questionaire_toolBar_qFormOpened_text(String qformname, String version);

  @DefaultMessage("Alert!")
  public String questionaires_questionaire_toolBar_qFormOpened_title();

  @DefaultMessage("All questionnaire tabs must be closed before closing this window! Switch to the first questionnaire tab?")
  public String questionaires_questionaire_toolBar_qFormsOpened_text();

  @DefaultMessage("Alert!")
  public String questionaires_questionaire_toolBar_qFormsOpened_title();

  @DefaultMessage("Do you really want to remove questionnaire {0} ({1})?")
  public String questionaires_Questionaire_ToolBar_RemoveDecision_Text(String questFormName, String questFromVersion);

  @DefaultMessage("Remove Questionnaire")
  public String questionaires_Questionaire_ToolBar_RemoveDecision_Title();

  @DefaultMessage("Required: specify the earliest selectable call time")
  public String questionaires_questionnaireManger_questionaireForm_callSelectionRules_fromComboBox_toolTip_text();

  @DefaultMessage("From Time")
  public String questionaires_questionnaireManger_questionaireForm_callSelectionRules_fromComboBox_toolTip_title();

  @DefaultMessage("Required: specify the longest length of call for selection (format: mm:ss or ss)")
  public String questionaires_questionnaireManger_questionaireForm_callSelectionRules_maxFiledLabel_toolTip_text();

  @DefaultMessage("Max Call Length")
  public String questionaires_questionnaireManger_questionaireForm_callSelectionRules_maxFiledLabel_toolTip_title();

  @DefaultMessage("Required: specify the shortest length of call for selection (format: mm:ss or ss)")
  public String questionaires_questionnaireManger_questionaireForm_callSelectionRules_minFiledLabel_toolTip_text();

  @DefaultMessage("Min Call Length")
  public String questionaires_questionnaireManger_questionaireForm_callSelectionRules_minFiledLabel_toolTip_title();

  @DefaultMessage("Required: specify the latest selectable call time")
  public String questionaires_questionnaireManger_questionaireForm_callSelectionRules_toComboBox_toolTip_text();

  @DefaultMessage("To Time")
  public String questionaires_questionnaireManger_questionaireForm_callSelectionRules_toComboBox_toolTip_title();

  @DefaultMessage("Optional: give access to this questionnaire for all users")
  public String questionaires_questionnaireManger_questionaireForm_permissions_allowForAllRadio_toolTip_text();

  @DefaultMessage("Allow For All")
  public String questionaires_questionnaireManger_questionaireForm_permissions_allowForAllRadio_toolTip_title();

  @DefaultMessage("Optional: give access to this questionnaire to users in the filter (righthand) list only")
  public String questionaires_questionnaireManger_questionaireForm_permissions_allowSelectedOnlyRadio_toolTip_text();

  @DefaultMessage("Allow Selected Only")
  public String questionaires_questionnaireManger_questionaireForm_permissions_allowSelectedOnlyRadio_toolTip_title();

  @DefaultMessage("Optional: block access to this questionnaire for all users")
  public String questionaires_questionnaireManger_questionaireForm_permissions_denyForAllRadio_toolTip_text();

  @DefaultMessage("Deny For All")
  public String questionaires_questionnaireManger_questionaireForm_permissions_denyForAllRadio_toolTip_title();

  @DefaultMessage("Optional: block access to this questionnaire to users in the filter (righthand) list only")
  public String questionaires_questionnaireManger_questionaireForm_permissions_denySelectedOnlyRadio_toolTip_text();

  @DefaultMessage("Deny Selected Only")
  public String questionaires_questionnaireManger_questionaireForm_permissions_denySelectedOnlyRadio_toolTip_title();

  @DefaultMessage("Remove the selected users from the filter list")
  public String questionaires_questionnaireManger_questionaireForm_permissions_leftSenderButton_toolTip_text();

  @DefaultMessage("Send To Left")
  public String questionaires_questionnaireManger_questionaireForm_permissions_leftSenderButton_toolTip_title();

  @DefaultMessage("Add the selected users to the filter list")
  public String questionaires_questionnaireManger_questionaireForm_permissions_rightSenderButton_toolTip_text();

  @DefaultMessage("Send To Right")
  public String questionaires_questionnaireManger_questionaireForm_permissions_rightSenderButton_toolTip_title();

  @DefaultMessage("Add an answer to the currently selected question")
  public String questionnaires_questionnaireManger_questionaireForm_addAnswerButton_toolTip_text();

  @DefaultMessage("Add Answer")
  public String questionnaires_questionnaireManger_questionaireForm_addAnswerButton_toolTip_title();

  @DefaultMessage("Add a question to the currently selected question group")
  public String questionnaires_questionnaireManger_questionaireForm_addQuestionButton_toolTip_text();

  @DefaultMessage("Add Question")
  public String questionnaires_questionnaireManger_questionaireForm_addQuestionButton_toolTip_title();

  @DefaultMessage("Specify what type of effect this answer has on the question group or questionnaire")
  public String questionnaires_questionnaireManger_questionaireForm_answerGrid_addRow_complianceCombo_toolTip_text();

  @DefaultMessage("Answer Type")
  public String questionnaires_questionnaireManger_questionaireForm_answerGrid_addRow_complianceCombo_toolTip_title();

  @DefaultMessage("Visible answer text")
  public String questionnaires_questionnaireManger_questionaireForm_answerGrid_answerColumn_toolTip_text();

  @DefaultMessage("Type of answer (effect of this answer on the question group or questionnaire) - usually None")
  public String questionnaires_questionnaireManger_questionaireForm_answerGrid_complianceColumn_toolTip_text();

  @DefaultMessage("Optional explanation of when to use this answer")
  public String questionnaires_questionnaireManger_questionaireForm_answerGrid_descriptionColumn_toolTip_text();

  @DefaultMessage("Value for this answer (in points, percent or grade value)")
  public String questionnaires_questionnaireManger_questionaireForm_answerGrid_valueColumn_toolTip_text();

  @DefaultMessage("Add a question group to this questionnaire. A group is required in order to add questions")
  public String questionnaires_questionnaireManger_questionaireForm_manageGroups_toolBar_addGroupButton_toolTip_text();

  @DefaultMessage("Add Group")
  public String questionnaires_questionnaireManger_questionaireForm_manageGroups_toolBar_addGroupButton_toolTip_title();

  @DefaultMessage("Close this dialog")
  public String questionnaires_questionnaireManger_questionaireForm_manageGroups_toolBar_closeButton_toolTip_text();

  @DefaultMessage("Close")
  public String questionnaires_questionnaireManger_questionaireForm_manageGroups_toolBar_closeButton_toolTip_title();

  @DefaultMessage("Permanently remove the currently selected group")
  public String questionnaires_questionnaireManger_questionaireForm_manageGroups_toolBar_removeGroupButton_toolTip_text();

  @DefaultMessage("Remove Group")
  public String questionnaires_questionnaireManger_questionaireForm_manageGroups_toolBar_removeGroupButton_toolTip_title();

  @DefaultMessage("Required: select the order in which answers are displayed for each question")
  public String questionnaires_questionnaireManger_questionaireForm_questionnaireDetails_autosortingOfAnswersBy_toolTip_text();

  @DefaultMessage("Auto-Sort Options")
  public String questionnaires_questionnaireManger_questionaireForm_questionnaireDetails_autosortingOfAnswersBy_toolTip_title();

  @DefaultMessage("Required: select which system to use in this questionnaire")
  public String questionnaires_questionnaireManger_questionaireForm_questionnaireDetails_scoringSystemPanel_toolTip_text();

  @DefaultMessage("Type")
  public String questionaires_Questionaire_QuestionaireDetail_Details_type_toolTip_title();

  @DefaultMessage("Type")
  public String questionaires_Questionaire_QuestionaireDetail_Details_type_toolTip_text();

  @DefaultMessage("Scoring System")
  public String questionnaires_questionnaireManger_questionaireForm_questionnaireDetails_scoringSystemPanel_toolTip_title();

  @DefaultMessage("Optional: display all possible answers (with the selected one highlighted) in reports, instead of only the selected answer")
  public String questionnaires_questionnaireManger_questionaireForm_questionnaireDetails_showAllPosibleAnswer_toolTip_text();

  @DefaultMessage("Show All Possible Answers")
  public String questionnaires_questionnaireManger_questionaireForm_questionnaireDetails_showAllPosibleAnswer_toolTip_title();

  @DefaultMessage("Value expected in the format {0}")
  public String questionnaires_questionnaireManger_questionaireForm_questionnaireDetails_WeightNumberField_regexValidation_text(String decimalSeparator);

  @DefaultMessage("When multiple questionnaires are selected for a report, their relative weights are determined by the global \"q\" weight value (between 0 and 1)")
  public String questionnaires_questionnaireManger_questionaireForm_questionnaireDetails_weightNumberField_toolTip_text();

  @DefaultMessage("Global Weight Value")
  public String questionnaires_questionnaireManger_questionaireForm_questionnaireDetails_weightNumberField_toolTip_title();

  @DefaultMessage("Permanently remove the selected answer")
  public String questionnaires_questionnaireManger_questionaireForm_removeAnswerButton_toolTip_text();

  @DefaultMessage("Remove Answer")
  public String questionnaires_questionnaireManger_questionaireForm_removeAnswerButton_toolTip_title();

  @DefaultMessage("Permanently remove the selected question")
  public String questionnaires_questionnaireManger_questionaireForm_removeQuestionButton_toolTip_text();

  @DefaultMessage("Remove Question")
  public String questionnaires_questionnaireManger_questionaireForm_removeQuestionButton_toolTip_title();

  @DefaultMessage("Add a new question group (required for adding questions)")
  public String questionnaires_questionnaireManger_questionaireForm_toolBar_addGroupButton_toolTip_text();

  @DefaultMessage("Add Group")
  public String questionnaires_questionnaireManger_questionaireForm_toolBar_addGroupButton_toolTip_title();

  @DefaultMessage("Edit call selection rules for this questionnaire")
  public String questionnaires_questionnaireManger_questionaireForm_toolBar_callSRButton_toolTip_text();

  @DefaultMessage("Edit Call Selection Rules")
  public String questionnaires_questionnaireManger_questionaireForm_toolBar_callSRButton_toolTip_title();

  @DefaultMessage("Edit properties (such as the scoring system) for this questionnaire")
  public String questionnaires_questionnaireManger_questionaireForm_toolBar_detailsButton_toolTip_text();

  @DefaultMessage("Edit Properties")
  public String questionnaires_questionnaireManger_questionaireForm_toolBar_detailsButton_toolTip_title();

  @DefaultMessage("Edit user permissions for this questionnaire")
  public String questionnaires_questionnaireManger_questionaireForm_toolBar_permissionButton_toolTip_text();

  @DefaultMessage("Edit Permissions")
  public String questionnaires_questionnaireManger_questionaireForm_toolBar_permissionButton_toolTip_title();

  @DefaultMessage("Manage question groups for this questionnaire")
  public String questionnaires_questionnaireManger_questionaireForm_toolBar_questionareGroupButton_toolTip_text();

  @DefaultMessage("Manage Question Groups")
  public String questionnaires_questionnaireManger_questionaireForm_toolBar_questionareGroupButton_toolTip_title();

  @DefaultMessage("Duplicate this questionnaire (keeping the original) for fast new questionnaire creation")
  public String questionnaires_questionnaireManger_questionaireForm_toolBar_saveAsCopyButton_toolTip_text();

  @DefaultMessage("Save As Copy")
  public String questionnaires_questionnaireManger_questionaireForm_toolBar_saveAsCopyButton_toolTip_title();

  @DefaultMessage("You need to change either the name or the version of this form")
  public String questionnaires_questionnaireManger_questionaireForm_toolBar_saveAsCopyButton_uniqueNameOrVersionRequired_text();

  @DefaultMessage("Alert!")
  public String questionnaires_questionnaireManger_questionaireForm_toolBar_saveAsCopyButton_uniqueNameOrVersionRequired_title();

  @DefaultMessage("Update the saved version of this questionnaire")
  public String questionnaires_questionnaireManger_questionaireForm_toolBar_saveButton_toolTip_text();

  @DefaultMessage("Save")
  public String questionnaires_questionnaireManger_questionaireForm_toolBar_saveButton_toolTip_title();

  @DefaultMessage("Add a new empty questionnaire")
  public String questionnaires_questionnaireManger_toolBar_addButton_toolTip_text();

  @DefaultMessage("Add Questionnaire")
  public String questionnaires_questionnaireManger_toolBar_addButton_toolTip_title();

  @DefaultMessage("Edit the selected questionnaire")
  public String questionnaires_questionnaireManger_toolBar_editButton_toolTip_text();

  @DefaultMessage("Edit Questionnaire")
  public String questionnaires_questionnaireManger_toolBar_editButton_toolTip_title();

  @DefaultMessage("Questionnaire contains voice-over files - files will not be exported")
  public String questionnaires_questionnaireManger_toolBar_exportButton_surveyWarning_text();

  @DefaultMessage("Export the entire questionnaire as an XML format file")
  public String questionnaires_questionnaireManger_toolBar_exportButton_toolTip_text();

  @DefaultMessage("Export Questionnaire")
  public String questionnaires_questionnaireManger_toolBar_exportButton_toolTip_title();

  @DefaultMessage("This file is invalid.")
  public String questionnaires_questionnaireManger_toolBar_importButton_parsingError_text();

  @DefaultMessage("Alert!")
  public String questionnaires_questionnaireManger_toolBar_importButton_parsingError_title();

  @DefaultMessage("Alert!")
  public String questionnaires_questionnaireManger_toolBar_importButton_RPCFailed_title();

  @DefaultMessage("Import a previously exported questionnaire (XML file format only)")
  public String questionnaires_questionnaireManger_toolBar_importButton_toolTip_text();

  @DefaultMessage("Import Questionnaire")
  public String questionnaires_questionnaireManger_toolBar_importButton_toolTip_title();

  @DefaultMessage("Permanently remove the selected questionnaire")
  public String questionnaires_questionnaireManger_toolBar_removeButton_toolTip_text();

  @DefaultMessage("Remove Questionnaire")
  public String questionnaires_questionnaireManger_toolBar_removeButton_toolTip_title();

  @DefaultMessage("Find a specific questionnaire by searching for keywords or part of the name")
  public String questionnaires_questionnaireManger_toolBar_searchButton_toolTip_text();

  @DefaultMessage("Search")
  public String questionnaires_questionnaireManger_toolBar_searchButton_toolTip_title();

  @DefaultMessage("{0} {1}")
  public String reports_graphs_agentCombo_displayedName(String surname, String name);

  @DefaultMessage("Group {0} contains no users")
  public String reports_graphs_agents_eastPanel_groupCombo_errorText(String name);

  @DefaultMessage("Alert!")
  public String reports_graphs_agents_eastPanel_groupCombo_errorTitle();

  @DefaultMessage("All Skills")
  public String reports_graphs_agents_eastPanel_skillCombo_allSkillsLabel();

  @DefaultMessage("Questionnaire: {0} ({1}), Skill: {2}, Period: {3}-{4}")
  public String reports_graphs_agents_chartTitle(String qformname, String version, String groupname, String startDate, String endDate);

  @DefaultMessage("{0} {1} skills in {2} {3}")
  public String reports_graphs_agentsSkill_chartTitle(String name, String surname, String qformname, String version);

  @DefaultMessage("{0}, {1}")
  public String reports_graphs_compareEvaluators_chart_label(String name, String value);

  @DefaultMessage("To date must be greater than From date")
  public String reports_graphs_dateValidation_errorMessage();

  @DefaultMessage("No data for requested parameters")
  public String reports_graphs_evaluatorsGraphsPanel_text();

  @DefaultMessage("{0} (1 = best, 5 = worst)")
  public String reports_graphs_evaluatorsChart_yLegend(String localizedName);

  @DefaultMessage("{0}: {1}")
  public String reports_graphs_graphValue_tooltip_display(String date, String value);

  @DefaultMessage("Select the target agent(s) from the grid")
  public String reports_graphs_questionTrend_eastPanel_agentGrid_toolTip_text();

  @DefaultMessage("Agent Grid")
  public String reports_graphs_questionTrend_eastPanel_agentGrid_toolTip_title();

  @DefaultMessage("Please select at least one agent from the grid")
  public String reports_graphs_questionTrend_eastPanel_agentsList_validationFailed_text();

  @DefaultMessage("Agent Selection Error")
  public String reports_graphs_questionTrend_eastPanel_agentsList_validationFailed_title();

  @DefaultMessage("Value must be less than the Good threshold")
  public String reports_graphs_questionTrend_eastPanel_badNumberField_lessThanExcellentValidation_errorText();

  @DefaultMessage("Value must be lower than the Maximum value")
  public String reports_graphs_questionTrend_eastPanel_badNumberField_maximumValueValidation_errorText();

  @DefaultMessage("Value must be greater than the Minimum value")
  public String reports_graphs_questionTrend_eastPanel_badNumberField_minimumValueValidation_errorText();

  @DefaultMessage("The highest score value that is still considered bad. The value must be between the Minimum and Maximum values of the applicable scoring system, and lower than the Excellent threshold. Natural numbers only.")
  public String reports_graphs_questionTrend_eastPanel_badNumberField_toolTip_text();

  @DefaultMessage("Bad Threshold Value")
  public String reports_graphs_questionTrend_eastPanel_badNumberField_toolTip_title();

  @DefaultMessage("Value must be lower than the Maximum value")
  public String reports_graphs_questionTrend_eastPanel_excellentNumberField_maximumValueValidation_errorText();

  @DefaultMessage("Value must be greater than the Minimum value")
  public String reports_graphs_questionTrend_eastPanel_excellentNumberField_minimumValueValidation_errorText();

  @DefaultMessage("Value must be greater than the Bad threshold")
  public String reports_graphs_questionTrend_eastPanel_excellentNumberField_moreThanBadValidation_errorText();

  @DefaultMessage("The lowest score value still considered excellent. The value must be between the Minimum and Maximum values of the applicable scoring system, and higher than the Bad threshold. Natural numbers only.")
  public String reports_graphs_questionTrend_eastPanel_excellentNumberField_toolTip_text();

  @DefaultMessage("Excellent Threshold Value")
  public String reports_graphs_questionTrend_eastPanel_excellentNumberField_toolTip_title();

  @DefaultMessage("The From date must be before the To date")
  public String reports_graphs_questionTrend_eastPanel_fromDateField_dateValidation_errorText();

  @DefaultMessage("Select the starting date for the report")
  public String reports_graphs_questionTrend_eastPanel_fromDateField_toolTip_text();

  @DefaultMessage("From Date")
  public String reports_graphs_questionTrend_eastPanel_fromDateField_toolTip_title();

  @DefaultMessage("Select at least one group from the grid")
  public String reports_graphs_questionTrend_eastPanel_groupGrid_toolTip_text();

  @DefaultMessage("Group Grid")
  public String reports_graphs_questionTrend_eastPanel_groupGrid_toolTip_title();

  @DefaultMessage("Please select at least one group from the list")
  public String reports_graphs_questionTrend_eastPanel_groupsList_validationFailed_text();

  @DefaultMessage("Group Selection Error")
  public String reports_graphs_questionTrend_eastPanel_groupsList_validationFailed_title();

  @DefaultMessage("Select the finishing date for the report")
  public String reports_graphs_questionTrend_eastPanel_toDateField_toolTip_text();

  @DefaultMessage("To Date")
  public String reports_graphs_questionTrend_eastPanel_toDateField_toolTip_title();

  @DefaultMessage("Questionnaire: {0} ({1}), Question Group: {2}, Question: {3}\nPeriod: {4}-{5}, Excellent Threshold: {7}, Bad Threshold: {6}")
  public String reports_graphs_questionTrend_chart_titleLegend(String qformname, String version, String groupname, String questionText, String fromDate, String toDate, String badTrashold, String goodTrashold);

  @DefaultMessage("Count")
  public String reports_graphs_questionTrend_chart_yLegend();

  @DefaultMessage("Select a question")
  public String reports_graphs_questionTrend_secondaryToolBar_questionComboBox_toolTip_text();

  @DefaultMessage("Select what will be represented by columns in chart")
  public String reports_graphs_questionTrend_secondaryToolBar_typeComboBox_toolTip_text();

  @DefaultMessage("Evaluations Score History")
  public String reports_graphs_questionTrend_chart_byEvaluations_title();

  @DefaultMessage("evaluation")
  public String reports_graphs_questionTrend_chart_byEvaluations_tooltip_singular();

  @DefaultMessage("evaluations")
  public String reports_graphs_questionTrend_chart_byEvaluations_tooltip_plural_2_to_4();

  @DefaultMessage("evaluations")
  public String reports_graphs_questionTrend_chart_byEvaluations_tooltip_plural_5_and_more();

  @DefaultMessage("interaction")
  public String reports_graphs_questionTrend_chart_byInteractions_tooltip_singular();

  @DefaultMessage("interactions")
  public String reports_graphs_questionTrend_chart_byInteractions_tooltip_plural_2_to_4();

  @DefaultMessage("interactions")
  public String reports_graphs_questionTrend_chart_byInteractions_tooltip_plural_5_and_more();

  @DefaultMessage("agent")
  public String reports_graphs_questionTrend_chart_byAgents_tooltip_singular();

  @DefaultMessage("agents")
  public String reports_graphs_questionTrend_chart_byAgents_tooltip_plural_2_to_4();

  @DefaultMessage("agents")
  public String reports_graphs_questionTrend_chart_byAgents_tooltip_plural_5_and_more();

  @DefaultMessage("Interactions Score History")
  public String reports_graphs_questionTrend_chart_byInteractions_title();

  @DefaultMessage("Agents Score History")
  public String reports_graphs_questionTrend_chart_byAgents_title();

  @DefaultMessage("Time Period")
  public String reports_graphs_questionTrend_chart_xAxis_date_label();

  @DefaultMessage("Number of Agents")
  public String reports_graphs_questionTrend_chart_yAxis_agents_label();

  @DefaultMessage("Number of Interactions")
  public String reports_graphs_questionTrend_chart_yAxis_interactions_label();

  @DefaultMessage("Number of Evaluations")
  public String reports_graphs_questionTrend_chart_yAxis_evaluations_label();

  @DefaultMessage("Total")
  public String reports_graphs_questionTrend_export_total();

  @DefaultMessage("Bad")
  public String reports_graphs_questionTrend_chart_serie_bad_label();

  @DefaultMessage("Average")
  public String reports_graphs_questionTrend_chart_serie_average_label();

  @DefaultMessage("Good")
  public String reports_graphs_questionTrend_chart_serie_good_label();

  @DefaultMessage("Week")
  public String reports_graphs_questionTrend_chart_label_week();

  @DefaultMessage("Quarter")
  public String reports_graphs_questionTrend_chart_label_quarter();

  @DefaultMessage("Use recommended {0} scale instead of the current scale?")
  public String reports_graphs_questionTrend_chart_too_granular_scale_confirm_Header(String scale);

  @DefaultMessage("The current scale is too granular to display the chart properly.")
  public String reports_graphs_questionTrend_chart_too_granular_scale_confirm_text();

  @DefaultMessage("Please select shorter interval than 10 years to display.")
  public String reports_graphs_questionTrend_chart_too_granular_scale_alert_text();

  @DefaultMessage("Question")
  public String reports_graphs_questionTrend_secondaryToolBar_questionComboBox_toolTip_title();

  @DefaultMessage("Column representation")
  public String reports_graphs_questionTrend_secondaryToolBar_typeComboBox_toolTip_title();

  @DefaultMessage("Select a question group")
  public String reports_graphs_questionTrend_secondaryToolBar_questionGroupComboBox_toolTip_text();

  @DefaultMessage("Question Group")
  public String reports_graphs_questionTrend_secondaryToolBar_questionGroupComboBox_toolTip_title();

  @DefaultMessage("Select a questionnaire")
  public String reports_graphs_questionTrend_secondaryToolBar_questionnaireComboBox_toolTip_text();

  @DefaultMessage("Questionnaire")
  public String reports_graphs_questionTrend_secondaryToolBar_questionnaireComboBox_toolTip_title();

  @DefaultMessage("Error")
  public String reports_graphs_questionTrend_computeError_title();

  @DefaultMessage("Error when computing the graph: {0}")
  public String reports_graphs_questionTrend_computeError_text(String cause);

  @DefaultMessage("Select the agent whose skills you want to display")
  public String reports_graphs_skillsOfAgent_toolbar_agentComboBox_toolTip_text();

  @DefaultMessage("Agent")
  public String reports_graphs_skillsOfAgent_toolbar_agentComboBox_toolTip_title();

  @DefaultMessage("Close this tab")
  public String reports_graphs_skillsOfAgent_toolBar_closeButton_toolTip_text();

  @DefaultMessage("Close")
  public String reports_graphs_skillsOfAgent_toolBar_closeButton_toolTip_title();

  @DefaultMessage("Generate a graph for the parameters below")
  public String reports_graphs_skillsOfAgent_toolBar_comuteGraphButton_toolTip_text();

  @DefaultMessage("Compute Graph")
  public String reports_graphs_skillsOfAgent_toolBar_comuteGraphButton_toolTip_title();

  @DefaultMessage("Export the current graph to an Excel spreadsheet")
  public String reports_graphs_skillsOfAgent_toolBar_exportToSpreadsheetButton_toolTip_text();

  @DefaultMessage("Export Spreadsheet")
  public String reports_graphs_skillsOfAgent_toolBar_exportToSpreadsheetButton_toolTip_title();

  @DefaultMessage("Select an agent group to display the overall group skills")
  public String reports_graphs_skillsOfAgent_toolbar_groupComboBox_toolTip_text();

  @DefaultMessage("Group")
  public String reports_graphs_skillsOfAgent_toolbar_groupComboBox_toolTip_title();

  @DefaultMessage("How often in time the graph displays a skill rating")
  public String reports_graphs_skillsOfAgent_toolbar_intervalCombo_toolTip_text();

  @DefaultMessage("Interval")
  public String reports_graphs_skillsOfAgent_toolbar_intervalCombo_toolTip_title();

  @DefaultMessage("Select the questionnaire to be used as the source of the agent skill data")
  public String reports_graphs_skillsOfAgent_toolbar_questionnaireCombo_toolTip_text();

  @DefaultMessage("Questionnaire")
  public String reports_graphs_skillsOfAgent_toolbar_questionnaireCombo_toolTip_title();

  @DefaultMessage("You are about to leave the ScoreCARD application. Do you want to continue?")
  public String scorecard_leavingPage_warning();

  @DefaultMessage("Failed to load application!")
  public String scorecard_loadSplitFailed_text();

  @DefaultMessage("Load Failure")
  public String scorecard_loadSplitFailed_title();

  @DefaultMessage("Some records are selected. If you navigate away those records will no longer be selected. Do you want to continue?")
  public String scorecard_pagingToolBar_navigateToADifferentPage_selectedRecords_text();

  @DefaultMessage("Alert")
  public String scorecard_pagingToolBar_navigateToADifferentPage_selectedRecords_title();

  @DefaultMessage("Max. value needs to be greater than Min. value.")
  public String scorecard_timeValidator_minGreaterThanMaxNumberFieldsError_text();

  @DefaultMessage("Enter a value either in seconds (e.g. 45) or as minutes and seconds (e.g. 6:23 or 6m23s)")
  public String scorecard_timeValidator_regExpError_text();

  @DefaultMessage("Please enter the current password")
  public String toolbar_loginUser_passwordValidation_currentPasswordNeeded_text();

  @DefaultMessage("The passwords are not the same!")
  public String toolbar_loginUser_passwordValidation_notEqual_text();

  @DefaultMessage("Save Profile")
  public String toolbar_loginUser_saveProfile_title();

  @DefaultMessage("Alert!")
  public String toolbar_loginUser_saveProfileFailed_notAllowedException_title();

  @DefaultMessage("Profile update failed!")
  public String toolbar_loginUser_saveProfileFailed_text();

  @DefaultMessage("Alert!")
  public String toolbar_loginUser_saveProfileFailed_title();

  @DefaultMessage("Incorrect password!")
  public String toolbar_loginUser_saveProfileFailed_wrongCurrentPasswordException_text();

  @DefaultMessage("Alert!")
  public String toolbar_loginUser_saveProfileFailed_wrongCurrentPasswordException_title();

  @DefaultMessage("Profile updated")
  public String toolbar_loginUser_saveProfileSuccess_text();

  @DefaultMessage("{0}, {1}")
  public String toolbar_messages_ccUserField_displayValue(String surname, String name);

  @DefaultMessage("{0}, {1}")
  public String toolbar_messages_grig_fromUserColumn_displayValue(String surname, String name);

  @DefaultMessage("{0}, {1}")
  public String toolbar_messages_grig_toUserColumn_displayValue(String surname, String name);

  @DefaultMessage("{0}, {1}")
  public String toolbar_messages_toUserField_displayValue(String surname, String name);

  @DefaultMessage("{0}, {1} ({2})")
  public String toolBar_userButton_displayMask(String surname, String name, String login);

  @DefaultMessage("{0}, {1} ({2})")
  public String userProfile_delegate_dateField_evaluatorCombo_displayValue(String surname, String name, String login);

  @DefaultMessage("The To date must be the same or later than the From date")
  public String userProfile_delegate_dateField_toDateValidator_errorMessage();

  @DefaultMessage("A valid date must be provided")
  public String userProfile_delegate_dateField_validator_errorMessage();

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_evaluatePanel_gradingPanel_decisionQuestionUncompleteBeforeClose_title();

  @DefaultMessage("Evaluation of this interaction is not complete. Do you really want to save and close?")
  public String evaluations_listOfEvaluations_evaluatePanel_gradingPanel_decisionQuestionUncompleteBeforeClose_text();

  @DefaultMessage("This evaluation is not complete. You will lose unsaved data if you close this window now. Do you want to save and close?")
  public String evaluations_listOfEvaluations_evaluatePanel_gradingPanel_decisionQuestionSaveAndUncompleteBeforeClose_text();

  @DefaultMessage("Status")
  public String evaluations_listOfEvaluations_evaluate_grid_statusColumn_finished_toolTip_title();

  @DefaultMessage("Finished")
  public String evaluations_listOfEvaluations_evaluate_grid_statusColumn_finished_toolTip_text();

  @DefaultMessage("Status")
  public String evaluations_listOfEvaluations_evaluate_grid_statusColumn_inprogress_toolTip_title();

  @DefaultMessage("In Progress")
  public String evaluations_listOfEvaluations_evaluate_grid_statusColumn_inprogress_toolTip_text();

  @DefaultMessage("Status")
  public String evaluations_listOfEvaluations_evaluate_grid_statusColumn_created_toolTip_title();

  @DefaultMessage("Created")
  public String evaluations_listOfEvaluations_evaluate_grid_statusColumn_created_toolTip_text();

  @DefaultMessage("Complete")
  public String questionnaires_questionnaireManger_grid_completeColumn_complete_toolTip_title();

  @DefaultMessage("A finished evaluation")
  public String questionnaires_questionnaireManger_grid_completeColumn_complete_toolTip_text();

  @DefaultMessage("Incomplete")
  public String questionnaires_questionnaireManger_grid_completeColumn_incomplete_toolTip_title();

  @DefaultMessage("An open evaluation that is not yet finished")
  public String questionnaires_questionnaireManger_grid_completeColumn_incomplete_toolTip_text();

  @DefaultMessage("Replace Interaction")
  public String evaluations_listOfEvaluations_changeSelected_confirmUnused_title();

  @DefaultMessage("Do you really want to replace this interaction?")
  public String evaluations_listOfEvaluations_changeSelected_confirmUnused_text();

  @DefaultMessage("Remove Interactions")
  public String evaluations_listOfEvaluations_removeSelected_confirm_title();

  @DefaultMessage("Do you really want to remove the selected interactions?")
  public String evaluations_listOfEvaluations_removeSelected_confirm_text();

  @DefaultMessage("Remove Interaction")
  public String evaluations_listOfEvaluations_removeInteraction_confirm_title();

  @DefaultMessage("Do you really want to remove this interaction?")
  public String evaluations_listOfEvaluations_removeInteraction_confirm_text();

  @DefaultMessage("Evaluation export failed")
  public String evaluations_listOfEvaluations_exportError();

  @DefaultMessage("Chart data export failed")
  public String chart_panel_export_exportError();

  @DefaultMessage("Probably problem with configuration of Agent ID column in CallREC settings")
  public String chart_panel_render_Error();

  @DefaultMessage("Audit Log export failed")
  public String evaluations_auditlog_exportError();

  @DefaultMessage("Media Loading Error")
  public String evaluations_listOfEvaluations_evaluate_mediaPlayer_loadError_title();

  @DefaultMessage("Failed to load the media file.")
  public String evaluations_listOfEvaluations_evaluate_mediaPlayer_loadError_text();

  @DefaultMessage("Plugin Version Error")
  public String evaluations_mediaPlayerFactory_createMediaPlayer_pluginVersionError_title();

  @DefaultMessage("The current version of a required plugin is not compatible.\nPlugin: {0}\nRequired version: {1}\nCurrent version: {2}")
  public String evaluations_mediaPlayerFactory_createMediaPlayer_pluginVersionError_text(String pluginName, String requiredVersion, String foundVersion);

  @DefaultMessage("Plugin Error")
  public String evaluations_mediaPlayerFactory_createMediaPlayer_pluginNotFoundError_title();

  @DefaultMessage("A required plugin was not found.\nPlugin: {0}")
  public String evaluations_mediaPlayerFactory_createMediaPlayer_pluginNotFoundError_text(String pluginName);

  @DefaultMessage("Too Many Widgets")
  public String dashboard_dashboardTab_tooManyWidgetsError_title();

  @DefaultMessage("You have already reached the limit of {0} widgets. To add a further widget, please remove an existing one first.")
  public String dashboard_dashboardTab_tooManyWidgetsError_text(int widgetLimit);

  @DefaultMessage("Self-Evaluation")
  public String evaluations_evaluationPlanner_selfEvaluationRadio_toolTip_title();

  @DefaultMessage("Choose to evaluate yourself")
  public String evaluations_evaluationPlanner_selfEvaluationRadio_toolTip_text();

  @DefaultMessage("You are about to switch to Group Evaluation mode; associated calls will be removed. Do you wish to continue?")
  public String evaluations_evaluationPlanner_switchToSelfDialog_text();

  @DefaultMessage("Export Report")
  public String reports_export_compareScoresPanel_toolbar_exportButton_toolTip_title();

  @DefaultMessage("Export the current selected report to Excel format")
  public String reports_export_compareScoresPanel_toolbar_exportButton_toolTip_text();

  @DefaultMessage("Close Report")
  public String reports_export_compareScoresPanel_toolbar_closeButton_toolTip_title();

  @DefaultMessage("Close the current report")
  public String reports_export_compareScoresPanel_toolbar_closeButton_toolTip_text();

  @DefaultMessage("Close Report Confirmation")
  public String reports_export_compareScoresPanel_toolbar_closeButton_confirmClose_title();

  @DefaultMessage("Do you really want to close this report?")
  public String reports_export_compareScoresPanel_toolbar_closeButton_confirmClose_text();

  @DefaultMessage("{0} {1} {2} - {3}")
  public String reports_export_compareScoresPanel_evaluationListView_displayMask(String userName, String userSurname, String periodFrom, String periodTo);

  @DefaultMessage("Export Spreadsheet")
  public String reports_export_leagueTablePanel_toolbar_exportButton_toolTip_title();

  @DefaultMessage("Export data")
  public String reports_export_leagueTablePanel_toolbar_exportButton_toolTip_text();

  @DefaultMessage("Close")
  public String reports_export_leagueTablePanel_toolbar_closeButton_toolTip_title();

  @DefaultMessage("All settings you have made in the league table will be lost")
  public String reports_export_leagueTablePanel_toolbar_closeButton_confirmClose_text();

  @DefaultMessage("Close panel")
  public String reports_export_leagueTablePanel_toolbar_closeButton_toolTip_text();

  @DefaultMessage("Close league table?")
  public String reports_export_leagueTablePanel_toolbar_closeButton_confirmClose_title();

  @DefaultMessage("Period")
  public String reports_export_leagueTablePanel_periodComboBox_toolTip_title();

  @DefaultMessage("Select period")
  public String reports_export_leagueTablePanel_periodComboBox_toolTip_text();

  @DefaultMessage("From Date")
  public String reports_export_leagueTablePanel_fromDateField_toolTip_title();

  @DefaultMessage("Select start date")
  public String reports_export_leagueTablePanel_fromDateField_toolTip_text();

  @DefaultMessage("To Date")
  public String reports_export_leagueTablePanel_toDateField_toolTip_title();

  @DefaultMessage("Select end date")
  public String reports_export_leagueTablePanel_toDateField_toolTip_text();

  @DefaultMessage("To Date must be later than From Date!")
  public String reports_export_leagueTablePanel_toDateValidationError_text();

  @DefaultMessage("Starting Threshold")
  public String reports_export_leagueTablePanel_startingThresholdNumberField_toolTip_title();

  @DefaultMessage("All values including and above this threshold are shown as mainstream")
  public String reports_export_leagueTablePanel_startingThresholdNumberField_toolTip_text();

  @DefaultMessage("Ending Threshold")
  public String reports_export_leagueTablePanel_endingThresholdNumberField_toolTip_title();

  @DefaultMessage("All values including and below this threshold are shown as mainstream")
  public String reports_export_leagueTablePanel_endingThresholdNumberField_toolTip_text();

  @DefaultMessage("Ending score threshold must be higher than starting threshold.")
  public String reports_export_leagueTablePanel_endingThresholdNumberField_validationError_endingWorseThanStarting_text();

  @DefaultMessage("Threshold value must be between 0 and 100")
  public String reports_export_leagueTablePanel_highThresholdNumberField_validationError_percentageRange_text();

  @DefaultMessage("Threshold value must be between 1 and 5")
  public String reports_export_leagueTablePanel_highThresholdNumberField_validationError_gradeRange_text();

  @DefaultMessage("Grouping by Agent")
  public String reports_export_leagueTablePanel_agentGroupingRadio_toolTip_title();

  @DefaultMessage("Group scores in the spreadsheet by agent")
  public String reports_export_leagueTablePanel_agentGroupingRadio_toolTip_text();

  @DefaultMessage("Group scores in the spreadsheet by agent group")
  public String reports_export_leagueTablePanel_groupGroupingRadio_toolTip_text();

  @DefaultMessage("Grouping by Agent Group")
  public String reports_export_leagueTablePanel_groupGroupingRadio_toolTip_title();

  @DefaultMessage("Please export fewer than 1000 evaluations at once!")
  public String evaluations_listOfEvaluations_exportMaximumNotice();

  @DefaultMessage("All Groups")
  public String agentChooser_selectAllGroupsChcekBox_toolTip_title();

  @DefaultMessage("Exports currently have a limit of 20,000 rows in total. Please modify your export criteria and try again.")
  public String auditlog_exportMaximumNotice();

  @DefaultMessage("Click to select all groups, click again to select no groups")
  public String agentChooser_selectAllGroupsChcekBox_toolTip_text();

  @DefaultMessage("All Agents")
  public String agentChooser_selectAllAgentsChcekBox_toolTip_title();

  @DefaultMessage("Please wait...")
  public String progressBar_please_wait();

  @DefaultMessage("Click to select all agents, click again to select no agents")
  public String agentChooser_selectAllAgentsChcekBox_toolTip_text();

  @DefaultMessage("Exporting data...")
  public String progressBar_exporting_data();


  @DefaultMessage("Working...")
  public String progressBar_working();

  @DefaultMessage("The template name cannot be validated now, please try again later")
  public String evaluations_evaluationPlanner_templateSaveWindow_templateNameValidation_notInitialized_text();

  @DefaultMessage("Agent Selection Error")
  public String agentChooser_agentsList_validationFailed_title();

  @DefaultMessage("Count of selected interactions is over limit, would you like to continue?")
  public String evaluations_listOfEvaluations_evaluatePanel_addParticularCallDialog_limitOver_warning();

  @DefaultMessage("Please select at least one agent from the list")
  public String agentChooser_agentsList_validationFailed_text();

  @DefaultMessage("Group Selection Error")
  public String agentChooser_groupTree_validationFailed_title();

  @DefaultMessage("Please select at least one group from the tree")
  public String agentChooser_groupTree_validationFailed_text();

  @DefaultMessage("To Date must be equal or after From Date!")
  public String administration_auditLog_toDateValidationError_text();

  @DefaultMessage("{0} - Questionnaire: {1} {2}, Group: {3}, User: {4}")
  public String dashboard_widget_config_trendWidgetTitle(String localizedName, String questformName, String questformVersion, String groupName, String userName);

  @DefaultMessage("Alert")
  public String evaluations_listOfEvaluations_toolBar_alert_value();

  @DefaultMessage("Please select max {0} evaluations")
  public String evaluations_listOfEvaluations_toolBar_alertLimit_value(int limit);

  @DefaultMessage("Include In Statistics")
  public String evaluations_listOfEvaluations_includeInStatsMenuItem_toolTip_title();

  @DefaultMessage("Specifies whether selected evaluations will be included or excluded from statistics.")
  public String evaluations_listOfEvaluations_includeInStatsMenuItem_toolTip_text();

  @DefaultMessage("Reveal to Agent")
  public String evaluations_listOfEvaluations_revealToAgentMenuItem_toolTip_title();

  @DefaultMessage("Specifies whether selected evaluations will be visible to agents.")
  public String evaluations_listOfEvaluations_revealToAgentMenuItem_toolTip_text();

  @DefaultMessage("Group {0}")
  public String administration_groupManager_usersByGroupPanel_text(String groupName);

  @DefaultMessage("The list does not show interactions included in sub-criteria. But these interactions will also be included in re-evaluation.")
  public String evaluations_evaluationPlanner_reEvaluation();

  @DefaultMessage("Evaluation update")
  public String evaluations_evaluationList_updateInfo_updateSuccessful_title();

  @DefaultMessage("{0} of {1} evaluations have been updated. You do not have a permission to edit the other evaluations.")
  public String evaluations_evaluationList_updateInfo_updateSuccessful_message(int updated, int totalCount);

  @DefaultMessage("Group name must be unique")
  public String questionaires_Questionaire_QuestionaireDetail_GroupManager_Grid_RowEditor_GroupNameTextField_ValidationError_notUnique();

  @DefaultMessage("Alert!")
  public String evaluations_listOfEvaluations_changeParamWindow_saveFailedTitle();

  @DefaultMessage("Agent ID must not start or end with a whitespace")
  public String administration_userManager_newEditUser_agentIdRadioButton_toolTip_validation_error();

  @DefaultMessage("Logout from ScoreCARD?")
  public String logoutDialog_title();

  @DefaultMessage("All unsaved changes and opened tabs will be lost after logout.")
  public String logoutDialog_text();

  @DefaultMessage("You are not allowed to perform this operation.")
  public String general_message_notAllowedException();

  @DefaultMessage("None")
  public String reports_graphs_questionTrend_export_none();

  @DefaultMessage("Scoring")
  public String reports_graphs_questionTrend_export_scoring();

  @DefaultMessage("History From")
  public String reports_graphs_questionTrend_export_historyFrom();

  @DefaultMessage("History To")
  public String reports_graphs_questionTrend_export_historyTo();

  @DefaultMessage("Groups")
  public String reports_graphs_questionTrend_export_groups();

  @DefaultMessage("Agents")
  public String reports_graphs_questionTrend_export_agents();

  @DefaultMessage("All")
  public String reports_graphs_questionTrend_export_all();

  @DefaultMessage("Daily")
  public String reports_graphs_questionTrend_daily();

  @DefaultMessage("Weekly")
  public String reports_graphs_questionTrend_weekly();

  @DefaultMessage("Monthly")
  public String reports_graphs_questionTrend_monthly();

  @DefaultMessage("Quarterly")
  public String reports_graphs_questionTrend_quarterly();

  @DefaultMessage("Yearly")
  public String reports_graphs_questionTrend_yearly();

  @DefaultMessage("Week")
  public String reports_graphs_questionTrend_week();

  @DefaultMessage("Q")
  public String reports_graphs_questionTrend_quarter_firstLetter();

  @DefaultMessage("Active User")
  public String administration_userManager_user_active_tooltip_header();

  @DefaultMessage("The From date must be before the To date")
  public String reports_graphs_interactionsVolume_eastPanel_fromDateField_dateValidation_errorText();

  @DefaultMessage("Blocked User")
  public String administration_userManager_user_blocked_tooltip_header();

  @DefaultMessage("Inactive User")
  public String administration_userManager_user_inactive_tooltip_header();

  @DefaultMessage("The From date must be before the To date")
  String reports_graphs_evaluationsVolume_eastPanel_fromDateField_dateValidation_errorText();

  @DefaultMessage("Interaction Length")
  String reports_graphs_Interaction_length_chart_title();

  @DefaultMessage("Interaction Volume")
  String reports_graphs_InteractionVolume_chart_title();

  @DefaultMessage("Evaluators")
  String reports_graphs_InteractionVolume_export_evaluators();

  @DefaultMessage("User is allowed to use the application.")
  public String administration_userManager_user_active_tooltip_text();

  @DefaultMessage("User is temporarily blocked either manually or due to multiple failed login attempts.")
  public String administration_userManager_user_blocked_tooltip_text();

  @DefaultMessage("User cannot use the application but all data including evaluation results are preserved.")
  public String administration_userManager_user_inactive_tooltip_text();

  @DefaultMessage("Planned")
  String reports_graphs_evaluation_volume_chart_serie_created_label();

  @DefaultMessage("In Progress")
  String reports_graphs_evaluation_volume_chart_serie_in_progress_label();

  @DefaultMessage("Finished")
  String reports_graphs_evaluation_volume_chart_serie_finished_label();

  @DefaultMessage("Number of Evaluations")
  String reports_graphs_evaluation_volume_chart_yAxis();

  @DefaultMessage("Evaluations Volume")
  String reports_graphs_evaluation_volume_chart_title();

  @DefaultMessage("from")
  public String reports_graphs_evaluation_volume_chart_n_from_m();

  @DefaultMessage("Interaction {0}")
  String reports_graphs_interactionsVolume_chart_title(String chartType);

  @DefaultMessage("All")
  String reports_export_interactionsVolume_all_possible_values();

  @DefaultMessage("Replaced")
  String reports_export_interactionsVolume_interaction_replaced();

  @DefaultMessage("Evaluated")
  String reports_export_interactionsVolume_interaction_evaluated();

  @DefaultMessage("Not Evaluated")
  String reports_export_interactionsVolume_interaction_not_evaluated();

  @DefaultMessage("Email")
  String reports_export_interactionsVolume_interaction_email();

  @DefaultMessage("Chat")
  String reports_export_interactionsVolume_interaction_chat();

  @DefaultMessage("Other")
  String reports_export_interactionsVolume_interaction_other();

  @DefaultMessage("Registration")
  String reports_export_interactionsVolume_interaction_registration();

  @DefaultMessage("Call & Screen")
  String reports_export_interactionsVolume_interaction_callscreen();

  @DefaultMessage("At least {0} lowercase characters")
  String password_change_dialog_minimum_lowercase_letters(int number);

  @DefaultMessage("At least {0} uppercase characters")
  String password_change_dialog_minimum_capital_letters(int number);

  @DefaultMessage("At least {0} numbers")
  String password_change_dialog_minimum_numbers(int number);

  @DefaultMessage("At least {0} non alphanumeric characters")
  String password_change_dialog_minimum_other_characters(int number);

  @DefaultMessage("At least {0} characters long")
  String password_change_dialog_minimum_length(int number);

  @DefaultMessage("New passwords are not the same")
  String password_change_dialog_newPassword_mismatch_newRepeatedPassword_label();

  @DefaultMessage("The old password was not correct, please try again")
  String password_change_dialog_incorrect_oldPassword_label();

  @DefaultMessage("Please Fill in All Fields")
  String password_change_dialog_fill_all_fields_label();

  @DefaultMessage("New password is not different from {0} previously used passwords")
  String password_change_dialog_repeated_oldPassword_from_history(int number);

  @DefaultMessage("Your password has expired. Please provide a new one.")
  String password_change_dialog_password_has_expired();

  @DefaultMessage("Password is well known and can be used by other users")
  String password_change_dialog_password_is_well_known();

  @DefaultMessage("Pick a new password for the user {0}")
  String password_change_dialog_choose_password_for_new_user(String login);

  @DefaultMessage("Show details for the first {0} interactions?")
  String reports_graphs_questionTrend_chart_too_much_data_title(int maxAllowedEvaluations);

  @DefaultMessage("Cannot show details for all {0} interactions. Narrow your selection by using a smaller time scale or choose less agents to view all their interactions. Show details for the first {1} interactions?")
  String reports_graphs_questionTrend_chart_too_much_data_message(int thisy, int maxAllowedEvaluations);

  @DefaultMessage("Ctrl+click to select multiple interactions, Shift+click to select a range of interactions")
  String interactions_helpBar_helpLabel_text();

  @DefaultMessage("Too many decimal places")
  String questionaires_Questionaire_QuestionaireDetail_QuestionaireCommon_Wrong_Decimal_number();

  @DefaultMessage("Alert!")
  String interactions_noQuestionnaires_messageBox_title();

  @DefaultMessage("Creating an evaluation questionnaire is required before evaluating an interaction. \nThis can be done using Questionnaire Manager.")
  String interactions_noQuestionnaires_messageBox_text();

  @DefaultMessage("{0} {1}")
  String interactions_interactionGrid_agentColumn_agentTemplate(String name, String surname);

  @DefaultMessage("{0}, {1}")
  String interactions_interactionGrid_agentColumn_twoAgentTemplate(String agent1, String agent2);

  @DefaultMessage("Showing first {0} interactions")
  String interactions_notificationBar_tooManyInteractions_text(String shown);

  @DefaultMessage("Narrow your search to find a specific interaction")
  String interactions_notificationBar_tooManyInteractions_subtitle_text();

  @DefaultMessage("Showing the first {0} interactions from more than {1} matching your search")
  String interactions_notificationBar_tooManySearchResults_text(String shown, String total);

  @DefaultMessage("Showing the first {0} interactions from {1} total matching your search")
  String interactions_notificationBar_tooManySearchResultsExactNumber_title_text(String shown, String total);

  @DefaultMessage("Please narrow your search if you are looking for a specific interaction")
  String interactions_notificationBar_tooManySearchResults_subtitle_text();

  @DefaultMessage("There are no recorded interactions yet")
  String interactions_noInteractions_titleText();

  @DefaultMessage("Interactions recorded by CallREC will appear here")
  String interactions_noInteractions_subTitleText();

  @DefaultMessage("Setup Recording")
  String interactions_noInteractions_setupRecordingButtonText();

  @DefaultMessage("List calls matching currently set search criteria")
  String interaction_toolBar_updateSearchResultsButton_toolTip_title();

  @DefaultMessage("Updates search results to match current search criteria")
  String interaction_toolBar_updateSearchResultsButton_toolTip_text();

  @DefaultMessage("No user found")
  String userSmartInputCombo_noUsersFound_text();

  @DefaultMessage("Cannot load users due to an unknown database error")
  String interactions_userLoadError_title();

  @DefaultMessage("Cannot load speech criteria due to an unknown database error")
  String interactions_speechCriteriaLoadError_title();

  @DefaultMessage("Please contact your administrator and report the error ({0})")
  String interactions_contactAdminAndReport(String errorCode);

  @DefaultMessage("Do you really want to close {0} without saving?")
  String interactions_ConfirmOnCloseWindow_decisionQuestionReallyClose_message(String windowName);

  @DefaultMessage("Cannot show interactions due to an unknown database error")
  String interactions_interactionLoadError_title();

  @DefaultMessage("Cannot show questionnaires due to an unknown database error: {0}")
  String interactions_questionnairesLoadError_text(String errorCode);

  @DefaultMessage("Cannot create evaluations due to an unknown database error: {0}")
  String interactions_createEvaluationsError_text(String errorCode);

  @DefaultMessage("Cannot load information for segment: {0}")
  String interactions_loadCoupleError_text(String errorCode);

  @DefaultMessage("Cannot check evaluation permissions for the current user due to an unknown database error: {0}")
  String interactions_evaluationsPermissionsCheckError_text(String errorCode);

  @DefaultMessage("Cannot load groups due to an unknown database error")
  String interactions_gropLoadError_title();

  @DefaultMessage("No group found")
  String userSmartInputCombo_noGroupsFound_text();

  @DefaultMessage("There are no interactions matching your search")
  String interactions_noInteractionsAccordingToCriteria_titleText();

  @DefaultMessage("Refine your search criteria to find interactions")
  String interactions_noInteractionsAccordingToCriteria_subTitleText();

  @DefaultMessage("Between {0}")
  String interactions_dateTimeSearchPanel_shortInfo_customHoursStart(String start);

  @DefaultMessage("Last {0} {1}")
  String interactions_dateTimeSearchPanel_shortInfo_customPeriod(Integer periodCount, String name);

  @DefaultMessage("From {0}")
  String interactions_dateTimeSearchPanel_shortInfo_fixedDateFrom(String fromDate);

  @DefaultMessage("to {0}")
  String interactions_dateTimeSearchPanel_shortInfo_dateTo(String toDate);

  @DefaultMessage("Maximum 3 digit number is allowed")
  String interactions_dateTimeSearchPanel_countPerid_validationMessage();

  @DefaultMessage("Start date must be set before end date")
  String interactions_dateTimeSearchPanel_fixedDatePanel_dateValidationMessage();

  @DefaultMessage("Start time must be set before end time")
  String interactions_dateTimeSearchPanel_hoursRangePanel_timeValidationMessage();

  @DefaultMessage("From the beginning of the day")
  String interactions_dateTimeSearchPanel_hoursRangePanel_noStartTime();

  @DefaultMessage("Until the end of the day")
  String interactions_dateTimeSearchPanel_hoursRangePanel_noEndTime();

  @DefaultMessage("Showing calls containing the phrase \"{0}\", searching for \"{1}\" may take a long time\nPress Update Search Results button to display results for \"{1}\"")
  String interactions_notificationBar_updateSearchResults(String phrase, String term);

  @DefaultMessage("Showing calls containing phrase \"{0}\"")
  String interactions_notificationBar_showingPhraseCalls(String phrase);

  @DefaultMessage("Searching for \"{0}\" may take a long time")
  String interactions_notificationBar_slowSearch(String phrase);

  @DefaultMessage("Searching for {0} is based on old indexes and may be inaccurate. New indexes are currently being prepared in the background")
  String interactions_notificationBar_newIndexesPreparedBackground(String phrase);

  @DefaultMessage("The saved search already exists and will be overwritten")
  String interactions_saveInteractionSearch_overwriteConfirmation();

  @DefaultMessage("Searching for phrases that were said in calls requires ZOOM SpeechREC license.")
  String interactions_speechPanel_learn_text();

  @DefaultMessage("More info at zoomint.com/speechrec")
  String interactions_speechPanel_moreInfo_text();

  @DefaultMessage("There are no interactions you have access to")
  String interactions_noInteractionsAccess_titleText();

  @DefaultMessage("You do not have privileges to view any of the recorded interactions")
  String interactions_noInteractionsAccess_subtitleText();

  @DefaultMessage("Import Speech Tag")
  public String speechrec_SpeechTag_toolBar_importButton_toolTip_title();

  @DefaultMessage("Import a previously exported speech tag (XML file format only)")
  public String speechrec_SpeechTag_toolBar_importButton_toolTip_text();

  @DefaultMessage("Alert!")
  public String speechrec_SpeechTag_toolBar_sTagOpened_title();

  @DefaultMessage("All speech tag tabs must be closed before closing this window! Switch to the first speech tag tab?")
  public String speechrec_SpeechTag_toolBar_sTagOpened_text();

  @DefaultMessage("Add a new empty speech tag")
  public String speechrec_SpeechTag_toolBar_addButton_toolTip_text();

  @DefaultMessage("Add Speech Tag")
  public String speechrec_SpeechTag_toolBar_addButton_toolTip_title();

  @DefaultMessage("Edit the selected speech tag")
  public String speechrec_SpeechTag_toolBar_editButton_toolTip_text();

  @DefaultMessage("Edit Speech Tag")
  public String speechrec_SpeechTag_toolBar_editButton_toolTip_title();

  @DefaultMessage("Export the entire speech tag as an XML format file")
  public String speechrec_SpeechTag_toolBar_exportButton_toolTip_text();

  @DefaultMessage("Export Speech Tag")
  public String speechrec_SpeechTag_toolBar_exportButton_toolTip_title();

  @DefaultMessage("{0}")
  public String speechrec_SpeechTag_toolBar_importButton_parsingError_text(String message);

  @DefaultMessage("Permanently remove the selected speech tag")
  public String speechrec_SpeechTag_toolBar_removeButton_toolTip_text();

  @DefaultMessage("Remove Speech Tag")
  public String speechrec_SpeechTag_toolBar_removeButton_toolTip_title();

  @DefaultMessage("The phrase text must be unique!")
  public String speechrec_SpeechTagPanel__SpeechTagDetail_PhraseGrid_RowEditor_NameTextField_Validatior_UniqueError();

  @DefaultMessage("Phrase Text")
  public String speechrec_SpeechTagPanel__SpeechTagDetail_PhraseGrid_RowEditor_NameTextField_ToolTip_Title();

  @DefaultMessage("Phrase Confidence")
  public String speechrec_SpeechTagPanel__SpeechTagDetail_PhraseGrid_RowEditor_ConfidenceTextField_ToolTip_Title();

  @DefaultMessage("Phrase Interactions")
  public String speechrec_SpeechTagPanel__SpeechTagDetail_PhraseGrid_RowEditor_InteractionsTextField_ToolTip_Title();

  @DefaultMessage("# of Interactions")
  public String speechrec_SpeechTagPanel__SpeechTagDetail_PhraseGrid_InteractionsColumn_ToolTip_Title();

  @DefaultMessage("Add Phrase")
  public String speechrec_SpeechTagPanel__speechTagEditPanel_addPhraseButton_toolTip_title();

  @DefaultMessage("Edit Phrase")
  public String speechrec_SpeechTagPanel__speechTagEditPanel_editPhraseButton_toolTip_title();

  @DefaultMessage("Save Phrase")
  public String speechrec_SpeechTagPanel__speechTagEditPanel_saveButton_toolTip_title();

  @DefaultMessage("Speech Tag {0} cannot be removed because it is open. Switch to the Speech Tag tab?")
  public String speechrec_speechTagsManagerPanel_toolBar_speechFormOpened_text(String qformname);

  @DefaultMessage("Alert!")
  public String speechrec_speechTagsManagerPanel_toolBar_speechFormOpened_title();

  @DefaultMessage("Existing occurrences of selected speech tags will be permanently deleted and no longer associated with calls")
  public String speechrec_speechTagsManagerPanel_ToolBar_RemoveDecision_Text();

  @DefaultMessage("Delete selected speech tags?")
  public String speechrec_speechTagsManagerPanel_ToolBar_RemoveDecision_Title();

  @DefaultMessage("Not Allowed")
  public String speechrec_speechTagsManagerPanel_SavingNotAllowed_Title();

  @DefaultMessage("This operation is not allowed for a speech tag")
  public String speechrec_speechTagsManagerPanel_SavingNotAllowed_Text();

  @DefaultMessage("Alert!")
  public String speechrec_speechTagsManagerPanel_SavingError_RPCFailed_title();

  @DefaultMessage("Speech Name:")
  public String speechrec_SpeechTagPanel__SpeechTagDetail_SpeechformNameTextField_ToolTip_Title();

  @DefaultMessage("Alert!")
  public String speechrec_SpeechTagPanel__SpeechTagDetail_ToolBar_SaveButton_CanSave_RPCFailed_title();

  @DefaultMessage("Alert!")
  public String speechrec_SpeechTagPanel__SpeechTagDetail_toolBar_saveButton_cannotSaveThisFormNameAlreadyExistError_title();

  @DefaultMessage("The Speech cannot be saved - this name is already used in the application! Please modify the name before saving")
  public String speechrec_SpeechTagPanel__SpeechTagDetail_toolBar_saveButton_cannotSaveThisFormNameAlreadyExistError_text();

  @DefaultMessage("Alert!")
  public String speechrec_SpeechTagPanel__SpeechTagDetail_ToolBar_SaveButton_SavingError_notAllowedException_title();

  @DefaultMessage("The Speech form: {0} has an invalid (null) id")
  public String speechrec_SpeechTagPanel__SpeechTagDetail_ToolBar_SaveButton_SavingError_notAllowedException_text(String speechFormBoName);

  @DefaultMessage("Alert!")
  public String speechrec_SpeechTagPanel__SpeechTagDetail_ToolBar_SaveButton_SavingError_recordInUseException_title();

  @DefaultMessage("The Speech form: {0} is already being used!")
  public String speechrec_SpeechTagPanel__SpeechTagDetail_ToolBar_SaveButton_SavingError_recordInUseException_text(String speechFormBoName);

  @DefaultMessage("Alert!")
  public String speechrec_SpeechTagPanel__SpeechTagDetail_ToolBar_SaveButton_SavingError_authorizationException_title();

  @DefaultMessage("Alert!")
  public String speechrec_SpeechTagPanel__SpeechTagDetail_ToolBar_SaveButton_SavingError_RPCFailed_title();

  @DefaultMessage("Alert")
  public String speechrec_SpeechTagPanel_importSpeech_error_title();

  @DefaultMessage("Cannot Save Speech Tag")
  public String speechrec_SpeechTagPanel__SpeechTagDetail_ToolBar_SaveButton_CannotSaveUniqueNameError_title();

  @DefaultMessage("The Speech Tag cannot be saved - ensure the name is unique!")
  public String speechrec_SpeechTagPanel__SpeechTagDetail_ToolBar_SaveButton_CannotSaveUniqueNameError_text();

  @DefaultMessage("Only valid XML files can be imported")
  public String speechrec_ImportDialog_importValidator_wrongFileFormat_value();

  @DefaultMessage("Alert!")
  public String speechrec_ImportDialog_importValidator_parsingError_title();

  @DefaultMessage("{0}")
  public String speechrec_ImportDialog_importValidator_parsingError_text(String message);

  @DefaultMessage("Alert!")
  public String speechrec_ImportDialog_importValidator_RPCFailed_title();

  @DefaultMessage("Narrower search scope enables to faster prepare searches for new phrases")
  public String speechrec_SpeechTagPanel__SpeechTagDetail_NarrowerSearchMessage_text();

  @DefaultMessage("You can enable and disable phrases to tune speech tag instead of deleting phrases to avoid time consuming search preparation")
  public String speechrec_SpeechTagPanel__SpeechTagDetail_BottomLabelFieldMessage_text();

  @DefaultMessage("Search phrase {0} is too short and may to lead to many false positive search results. Consider making the phrase longer")
  public String speechrec_SpeechTagPanel__SpeechTagDetail_TopLabelFieldTooShortMessage_text(String msg);

  @DefaultMessage("Search phrase {0} is part of {1} which may lead to confusing search results. Consider modifying one of the phrases")
  public String speechrec_SpeechTagPanel__SpeechTagDetail_TopLabelFieldNestedMessage_text(String phraseOne, String phraseTwo);

  @DefaultMessage("Unnamed tag")
  public String speechrec_SpeechTagPanel_EmptyTabItem_title();

  @DefaultMessage("Updating")
  public String speechrec_speechTagsManagerPanel_StateColumn_UpdatingMessage_text();

  @DefaultMessage("Preparing for Search")
  public String speechrec_speechTagsManagerPanel_StateColumn_PreparingMessage_text();

  @DefaultMessage("Ready for Search")
  public String speechrec_speechTagsManagerPanel_StateColumn_ReadyMessage_text();

  @DefaultMessage("Close Confirmation")
  public String speechrec_SpeechTagPanel__SpeechTagDetail_decisionQuestionReallyClose_title();

  @DefaultMessage("Do you really want to close Speech Tag {0} without saving?")
  public String speechrec_SpeechTagPanel__SpeechTagDetail_decisionQuestionReallyClose_text(String speechtagName);

  @DefaultMessage("Interactions containing one of the phrases: {0}")
  public String speechrec_SpeechTagPanel__StatusBar_interactionsPercentage_text(String percentage);

  @DefaultMessage("Add a new phrase that will be searched in speech")
  public String speechrec_SpeechTagPanel__SpeechTagDetail_addNewPhraseButton_toolTip_text();

  @DefaultMessage("Edit the text of a phrase")
  public String speechrec_SpeechTagPanel__SpeechTagDetail_editPhraseButton_toolTip_text();

  @DefaultMessage("Saves changes in the speech tag")
  public String speechrec_SpeechTagPanel__SpeechTagDetail__saveSpeechTagButton_toolTip_text();

  @DefaultMessage("Required text: Phrase searched in interactions")
  public String speechrec_SpeechTagPanel__SpeechTagDetail_NameTextField_ToolTip_Text();

  @DefaultMessage("Phrase searched in interactions")
  public String speechrec_SpeechTagPanel__SpeechTagDetail_PhraseGrid_RowEditor_NameTextField_ToolTip_Text();

  @DefaultMessage("The confidence that a phrase was detected correctly in the speech")
  public String speechrec_SpeechTagPanel__SpeechTagDetail_PhraseGrid_RowEditor_ConfidenceTextField_ToolTip_Text();

  @DefaultMessage("Percentage of interactions within the limit containing the phrase")
  public String speechrec_SpeechTagPanel__SpeechTagDetail_PhraseGrid_RowEditor_InteractionsTextField_ToolTip_Text();

  @DefaultMessage("How confident the search has to be")
  public String speechrec_SpeechSearchPanel_ProbabilityCombo_ToolTip_Text();

  @DefaultMessage("Who said the phrase")
  public String speechrec_SpeechSearchPanel_UserCombo_ToolTip_Text();

  @DefaultMessage("Contains")
  public String interactions_SpeechSearchPanel_collapsedMsg_Contains();

  @DefaultMessage("By")
  public String interactions_SpeechSearchPanel_collapsedMsg_By();

  @DefaultMessage("Maybe")
  public String interactions_SpeechSearchPanel_collapsedMsg_Maybe();

  @DefaultMessage("May not contain")
  public String interactions_SpeechSearchPanel_collapsedMsg_MayNotContain();

  @DefaultMessage("Does not contain")
  public String interactions_SpeechSearchPanel_collapsedMsg_DoesNotContain();

  @DefaultMessage("No such group for name: {0}")
  public String interactions_SpeechSearchPanel_NoSuchGroupException(String name);

  @DefaultMessage("Media File {0}")
  String interactions_infoWindow_Media_File(int index);

  @DefaultMessage("No tags found")
  String speechCriteriaCombo_noTagsFound_text();

  @DefaultMessage("Training")
  String questionnaires_questionnaireManger_questionaireForm_questionnaireDetails_type_training_toolTip_title();

  @DefaultMessage("Is this questionnaire for training purposes?")
  String questionnaires_questionnaireManger_questionaireForm_questionnaireDetails_type_training_toolTip_text();

  @DefaultMessage("Survey")
  String questionnaires_questionnaireManger_questionaireForm_questionnaireDetails_type_survey_toolTip_title();

  @DefaultMessage("Survey enabled")
  String questionnaires_questionnaireManger_questionaireForm_questionnaireDetails_type_survey_toolTip_text();

  @DefaultMessage("Instructions")
  String evaluations_trainingPlanner_instructionsTextArea_toolTip_title();

  @DefaultMessage("Instructions")
  String evaluations_trainingPlanner_instructionsTextArea_toolTip_text();

  @DefaultMessage("Questionnaire")
  String evaluations_trainingPlanner_questionaireComboBox_toolTip_title();

  @DefaultMessage("Questionnaire")
  String evaluations_trainingPlanner_questionaireComboBox_toolTip_text();

  @DefaultMessage("Apply to Statistics")
  String evaluations_trainingPlanner_applyToStatisticsCheckBox_toolTip_title();

  @DefaultMessage("Apply to statistics")
  String evaluations_trainingPlanner_applyToStatisticsCheckBox_toolTip_text();

  @DefaultMessage("Choose Interaction")
  String evaluations_trainingPlanner_chooseInteractionButton_toolTip_title();

  @DefaultMessage("Choose interaction")
  String evaluations_trainingPlanner_chooseInteractionButton_toolTip_text();

  @DefaultMessage("Remove Interaction")
  String evaluations_trainingPlanner_removeInteractionButton_toolTip_title();

  @DefaultMessage("Remove interaction")
  String evaluations_trainingPlanner_removeInteractionButton_toolTip_text();

  @DefaultMessage("{0} {1}")
  String evaluations_trainingPlanner_interactionDescription(String name, String date);

  @DefaultMessage("Training evaluation(s) created")
  String evaluations_trainingPlanner_evaluationCreated_text();

  @DefaultMessage("Success")
  String evaluations_trainingPlanner_evaluationCreated_title();

  @DefaultMessage("Export")
  String evaluations_listOfEvaluations_evaluate_exportAudioButton_toolTip_title();

  @DefaultMessage("Export audio")
  String evaluations_listOfEvaluations_evaluate_exportAudioButton_toolTip_text();

  @DefaultMessage("{0} is")
  String interactions_searchPanel_externdalData_comparatorEqual(String text);

  @DefaultMessage("{0} starts with")
  String interactions_searchPanel_externdalData_comparatorStartsWith(String text);

  @DefaultMessage("{0} contains")
  String interactions_searchPanel_externdalData_comparatorContains(String text);

  @DefaultMessage("No options found")
  String externalDataCombo_noOptionsFound_text();

  @DefaultMessage("Key tone digit")
  String questionnaires_questionnaireManger_questionaireForm_answerGrid_addRow_keyCombo_toolTip_text();

  @DefaultMessage("Answer Key")
  String questionnaires_questionnaireManger_questionaireForm_answerGrid_addRow_keyCombo_toolTip_title();

  @DefaultMessage("Digit key on phone")
  String questionnaires_questionnaireManger_questionaireForm_answerGrid_keyColumn_toolTip_text();

  @DefaultMessage("An error occured in media file upload")
  String questionaires_questionaire_questionaireDetail_questionGrid_surveyMediaUploadWindow_mediaFileUploadError();

  @DefaultMessage("If you save questionnaire and change type from survey, voice-over files will be excluded")
  String questionnaires_questionnaireManager_questionnaireChoiceWindow_saveCopyWarningMessage();
}
