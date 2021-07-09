"use strict";
exports.__esModule = true;
exports.parsePermissions = void 0;
var ramda_1 = require("ramda");
// result
//
// permissions: {
//     canViewLabel: true,
//         canViewTagManagement: true,
//         canEditComplianceConfig: true,
//         canExportConversationMp3: true,
//         canViewAuditLog: true,
//         canExportConversationData: true,
//         canManageSurveyPlans: true,
//         canAnonymizeConversation: true,
//         canUpdateUserSettings: true,
//         canManageDataLifecycle: true,
//         canAddLabel: true,
//         canEditLabel: true,
//         canViewConversationsScreen: false
// }
var ACTIVITY_TO_PERMISSION = {
    INTERACTION_TAGS_ADD: 'canAddLabel',
    INTERACTION_ANONYMIZE: 'canAnonymizeConversation',
    MANAGE_COMPLIANCE: 'canEditComplianceConfig',
    INTERACTION_TAGS_EDIT: 'canEditLabel',
    INTERACTIONS_EXPORT_JSON: 'canExportConversationData',
    INTERACTIONS_EXPORT_MEDIA: 'canExportConversationMp3',
    MANAGE_DATA_LIFECYCLE: 'canManageDataLifecycle',
    SURVEY_PLANS: 'canManageSurveyPlans',
    EDIT_ADMIN_SETTING: 'canUpdateUserSettings',
    VIEW_AUDIT: 'canViewAuditLog',
    INTERACTION_TAGS_VIEW: 'canViewLabel',
    INTERACTION_TAGS_MANAGE: 'canViewTagManagement'
};
var parsePermissions = function (data, state) {
    var compositesFromRoles = data.roles.reduce(function (mainAcc, roleObject) {
        return mainAcc
            ? mainAcc.concat(roleObject.composites
                ? roleObject.composites.reduce(function (compositesAcc, composite) {
                    return compositesAcc.concat(composite.name);
                }, mainAcc)
                : [])
            : [];
    }, []);
    var simplePermissions = compositesFromRoles.reduce(function (acc, activity) { return (ACTIVITY_TO_PERMISSION[activity] ? ramda_1.assoc(ACTIVITY_TO_PERMISSION[activity], true)(acc) : acc); }, {});
    var composedPermissions = ramda_1.assoc('canViewConversationsScreen', data.roles.filter(function (value) { return value.name === "VIEW_CONVERSATIONS_SCREEN"; }).length > 0 &&
        ramda_1.allPass([
            // includes('VIEW_CONVERSATIONS_SCREEN'),
            ramda_1.anyPass(ramda_1.map(ramda_1.includes, [
                'INTERACTIONS_FULL_VIEW',
                'INTERACTIONS_AGENT_VIEW',
                'INTERACTIONS_GROUP_VIEW',
                'INTERACTION_REVIEWS_VIEW',
            ])),
        ])(compositesFromRoles))(simplePermissions);
    return ramda_1.assoc('permissions', composedPermissions, state);
};
exports.parsePermissions = parsePermissions;
console.log(exports.parsePermissions({ "username": "ccmanager", "userId": "2fae446b-4ed9-4775-bcca-9a8e287c07a0", "firstName": "CcManager", "lastName": "CcManager", "sourceId": "SCORE_CARD", "email": "jane.doe@company.domain", "enabled": true, "roles": [{ "name": "view-profile" }, { "name": "VIEW_CONVERSATIONS_SCREEN" }, { "name": "offline_access" }, { "name": "manage-account", "composites": [{ "name": "manage-account-links" }] }, { "name": "keycloak-event-provider" }, { "name": "DEFAULT_CC_MANAGER", "composites": [{ "name": "DATA_EXPORT_ALL_RESULTS" }, { "name": "REPORTING_ALL" }, { "name": "MANAGE_QUESTIONNAIRES" }, { "name": "REPORTING_SELF" }, { "name": "INTERACTION_ANONYMIZE" }, { "name": "INTERACTION_TAGS_VIEW" }, { "name": "REALLOCATE_EVALUATIONS" }, { "name": "EDIT_GLOBAL_TEMPLATES" }, { "name": "CREATE_EVALS" }, { "name": "EDIT_ADMIN_SETTING" }, { "name": "REPORTING_ASSIGNED_TEAMS" }, { "name": "INTERACTION_REVIEWS_VIEW" }, { "name": "MANAGE_DATA_LIFECYCLE" }, { "name": "EDIT_INTERACTION_TYPES" }, { "name": "REPLACE_CALLS" }, { "name": "INTERACTION_TAGS_MANAGE" }, { "name": "MANAGE_SPEECH_TAG" }, { "name": "ADD_AUDIT_REASON" }, { "name": "INTERACTIONS_FULL_VIEW" }, { "name": "EVAL_REMOVE_ALL" }, { "name": "DATA_TASK_ALL" }, { "name": "MANAGE_SHARED_DASHBOARD" }, { "name": "INTERACTION_TAGS_ADD" }, { "name": "EVAL_AGENTS" }, { "name": "SCORING_TIERS_MANAGE" }, { "name": "MANAGE_COMPLIANCE" }, { "name": "ADD_CALL" }, { "name": "INTERACTIONS_GROUP_VIEW" }, { "name": "EDIT_AUDIT_REASON" }, { "name": "INTERACTIONS_EXPORT_MEDIA" }, { "name": "INTERACTION_TAGS_EDIT" }, { "name": "VIEW_MY_EVALS" }, { "name": "SCORING_TIERS_VIEW" }, { "name": "VIEW_TEAM_EVALS" }, { "name": "PLAN_ALL_EVALS" }, { "name": "VIEW_ALL_EVALS" }, { "name": "PLAN_GROUP_EVALS" }, { "name": "VIEW_AUDIT" }, { "name": "INTERACTIONS_EXPORT_JSON" }, { "name": "INTERACTIONS_AGENT_VIEW" }, { "name": "VIEW_ZPA" }] }], "groups": ["4f1c68c2-a645-4dc0-b63b-537b7432daea"], "mainGroupId": "4f1c68c2-a645-4dc0-b63b-537b7432daea", "scorecardId": "2", "usersTeams": ["4f1c68c2-a645-4dc0-b63b-537b7432daea"], "created": 1619773494885, "locale": "en-US", "timezone": "UTC" }, null));
