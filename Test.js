"use strict";
exports.__esModule = true;
exports.parsePermissions = void 0;
var ramda_1 = require("ramda");

const ACTIVITY_TO_PERMISSION = {
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
    INTERACTION_TAGS_MANAGE: 'canViewTagManagement',
    SPEECHREC_ADMIN: 'canViewSpeechTags',
};

const VIEW_CONVERSATIONS_SCREEN = 'VIEW_CONVERSATIONS_SCREEN'

const parsePermissions = (data, state) => {

    const getAllAtomicRolesClosure = (roles) => {
        const getRolesWithCompositesAcc = (role, acc) => {
            // if (role.composites) {
            //     return role.composites.flatMap((compositeRole) => getRolesWithCompositesAcc(compositeRole, acc.concat(role.name)))
            // } else {
                return acc.concat(role.name)
            // }
        }
        return roles.flatMap(
            (role) => getRolesWithCompositesAcc(role, [])
        );
    }

    const allAtomicRoles = getAllAtomicRolesClosure(data.roles);

    const simplePermissions = allAtomicRoles.reduce(
        (acc, activity) => (ACTIVITY_TO_PERMISSION[activity] ? ramda_1.assoc(ACTIVITY_TO_PERMISSION[activity], true)(acc) : acc),
        {}
    );

    const composedPermissions = ramda_1.assoc(
        'canViewConversationsScreen',
        ramda_1.allPass([
            ramda_1.includes(VIEW_CONVERSATIONS_SCREEN),
            ramda_1.anyPass([
                ramda_1.includes('INTERACTIONS_FULL_VIEW'),
                ramda_1.includes('INTERACTIONS_AGENT_VIEW'),
                ramda_1.includes('INTERACTIONS_GROUP_VIEW'),
                ramda_1.includes('INTERACTION_REVIEWS_VIEW'),
            ]),
        ])(allAtomicRoles)
    )(simplePermissions);

    return ramda_1.assoc('permissions', composedPermissions, state);
};

exports.parsePermissions = parsePermissions;
// console.log(exports.parsePermissions({ "username": "ccmanager", "userId": "2fae446b-4ed9-4775-bcca-9a8e287c07a0", "firstName": "CcManager", "lastName": "CcManager", "sourceId": "SCORE_CARD", "email": "jane.doe@company.domain", "enabled": true, "roles": [{ "name": "view-profile" }, { "name": "VIEW_CONVERSATIONS_SCREEN" }, { "name": "offline_access" }, { "name": "manage-account", "composites": [{ "name": "manage-account-links" }] }, { "name": "keycloak-event-provider" }, { "name": "DEFAULT_CC_MANAGER", "composites": [{ "name": "DATA_EXPORT_ALL_RESULTS" }, { "name": "REPORTING_ALL" }, { "name": "MANAGE_QUESTIONNAIRES" }, { "name": "REPORTING_SELF" }, { "name": "INTERACTION_ANONYMIZE" }, { "name": "INTERACTION_TAGS_VIEW" }, { "name": "REALLOCATE_EVALUATIONS" }, { "name": "EDIT_GLOBAL_TEMPLATES" }, { "name": "CREATE_EVALS" }, { "name": "EDIT_ADMIN_SETTING" }, { "name": "REPORTING_ASSIGNED_TEAMS" }, { "name": "INTERACTION_REVIEWS_VIEW" }, { "name": "MANAGE_DATA_LIFECYCLE" }, { "name": "EDIT_INTERACTION_TYPES" }, { "name": "REPLACE_CALLS" }, { "name": "INTERACTION_TAGS_MANAGE" }, { "name": "MANAGE_SPEECH_TAG" }, { "name": "ADD_AUDIT_REASON" }, { "name": "INTERACTIONS_FULL_VIEW" }, { "name": "EVAL_REMOVE_ALL" }, { "name": "DATA_TASK_ALL" }, { "name": "MANAGE_SHARED_DASHBOARD" }, { "name": "INTERACTION_TAGS_ADD" }, { "name": "EVAL_AGENTS" }, { "name": "SCORING_TIERS_MANAGE" }, { "name": "MANAGE_COMPLIANCE" }, { "name": "ADD_CALL" }, { "name": "INTERACTIONS_GROUP_VIEW" }, { "name": "EDIT_AUDIT_REASON" }, { "name": "INTERACTIONS_EXPORT_MEDIA" }, { "name": "INTERACTION_TAGS_EDIT" }, { "name": "VIEW_MY_EVALS" }, { "name": "SCORING_TIERS_VIEW" }, { "name": "VIEW_TEAM_EVALS" }, { "name": "PLAN_ALL_EVALS" }, { "name": "VIEW_ALL_EVALS" }, { "name": "PLAN_GROUP_EVALS" }, { "name": "VIEW_AUDIT" }, { "name": "INTERACTIONS_EXPORT_JSON" }, { "name": "INTERACTIONS_AGENT_VIEW" }, { "name": "VIEW_ZPA" }] }], "groups": ["4f1c68c2-a645-4dc0-b63b-537b7432daea"], "mainGroupId": "4f1c68c2-a645-4dc0-b63b-537b7432daea", "scorecardId": "2", "usersTeams": ["4f1c68c2-a645-4dc0-b63b-537b7432daea"], "created": 1619773494885, "locale": "en-US", "timezone": "UTC" }, null));

// console.log(exports.parsePermissions({ "username": "ccmanager", "userId": "2fae446b-4ed9-4775-bcca-9a8e287c07a0", "firstName": "CcManager", "lastName": "CcManager", "sourceId": "SCORE_CARD", "email": "jane.doe@company.domain", "enabled": true, "roles": [{ "name": "view-profile" }, { "name": "VIEW_CONVERSATIONS_SCREEN" }, { "name": "offline_access" }, { "name": "manage-account", "composites": [{ "name": "manage-account-links" }] }, { "name": "keycloak-event-provider" }, { "name": "INTERACTIONS_FULL_VIEW" }, { "name": "INTERACTIONS_AGENT_VIEW" }, { "name": "INTERACTIONS_GROUP_VIEW" }, { "name": "INTERACTION_REVIEWS_VIEW" }], "groups": ["4f1c68c2-a645-4dc0-b63b-537b7432daea"], "mainGroupId": "4f1c68c2-a645-4dc0-b63b-537b7432daea", "scorecardId": "2", "usersTeams": ["4f1c68c2-a645-4dc0-b63b-537b7432daea"], "created": 1619773494885, "locale": "en-US", "timezone": "UTC" }, null));

console.log(exports.parsePermissions({ "username": "ccmanager", "userId": "2fae446b-4ed9-4775-bcca-9a8e287c07a0", "firstName": "CcManager", "lastName": "CcManager", "sourceId": "SCORE_CARD", "email": "jane.doe@company.domain", "enabled": true, "roles": [{"name":"view-profile"},{"name":"INTERACTIONS_AGENT_VIEW","composites":[]},{"name":"VIEW_TEAM_EVALS","composites":[]},{"name":"INTERACTION_TAGS_ADD","composites":[]},{"name":"manage-account","composites":[{"name":"manage-account-links"}]},{"name":"PLAN_ALL_EVALS","composites":[]},{"name":"SCORING_TIERS_VIEW","composites":[]},{"name":"MANAGE_COMPLIANCE","composites":[]},{"name":"EVAL_AGENTS","composites":[]},{"name":"VIEW_ZPA","composites":[]},{"name":"EDIT_AUDIT_REASON","composites":[]},{"name":"INTERACTIONS_EXPORT_JSON","composites":[]},{"name":"PLAN_GROUP_EVALS","composites":[]},{"name":"INTERACTION_TAGS_EDIT","composites":[]},{"name":"ADD_CALL","composites":[]},{"name":"VIEW_AUDIT","composites":[]},{"name":"INTERACTIONS_GROUP_VIEW","composites":[]},{"name":"INTERACTIONS_FULL_VIEW","composites":[]},{"name":"DATA_TASK_ALL","composites":[]},{"name":"EDIT_GLOBAL_TEMPLATES","composites":[]},{"name":"EVAL_REMOVE_ALL","composites":[]},{"name":"CREATE_EVALS","composites":[]},{"name":"SCORING_TIERS_MANAGE","composites":[]},{"name":"VIEW_CONVERSATIONS_SCREEN","composites":[]},{"name":"VIEW_MY_EVALS","composites":[]},{"name":"INTERACTIONS_EXPORT_MEDIA","composites":[]},{"name":"INTERACTION_ANONYMIZE","composites":[]},{"name":"EDIT_ADMIN_SETTING","composites":[]},{"name":"VIEW_ALL_EVALS","composites":[]},{"name":"EDIT_INTERACTION_TYPES","composites":[]},{"name":"MANAGE_DATA_LIFECYCLE","composites":[]},{"name":"REALLOCATE_EVALUATIONS","composites":[]},{"name":"INTERACTION_TAGS_VIEW","composites":[]},{"name":"DEFAULT_CC_MANAGER","composites":[]},{"name":"REPLACE_CALLS","composites":[]},{"name":"INTERACTION_REVIEWS_VIEW","composites":[]},{"name":"REPORTING_ASSIGNED_TEAMS","composites":[]},{"name":"MANAGE_QUESTIONNAIRES","composites":[]},{"name":"DATA_EXPORT_ALL_RESULTS","composites":[]},{"name":"MANAGE_SHARED_DASHBOARD","composites":[]},{"name":"INTERACTION_TAGS_MANAGE","composites":[]},{"name":"ADD_AUDIT_REASON","composites":[]},{"name":"REPORTING_SELF","composites":[]},{"name":"REPORTING_ALL","composites":[]}], "groups": ["4f1c68c2-a645-4dc0-b63b-537b7432daea"], "mainGroupId": "4f1c68c2-a645-4dc0-b63b-537b7432daea", "scorecardId": "2", "usersTeams": ["4f1c68c2-a645-4dc0-b63b-537b7432daea"], "created": 1619773494885, "locale": "en-US", "timezone": "UTC" }, null));



// console.log(exports.parsePermissions({ "username": "ccmanager", "userId": "2fae446b-4ed9-4775-bcca-9a8e287c07a0", "firstName": "CcManager", "lastName": "CcManager", "sourceId": "SCORE_CARD", "email": "jane.doe@company.domain", "enabled": true, "roles": [Role(name=view-profile, composites=null), Role(name=INTERACTIONS_AGENT_VIEW, composites=[]), Role(name=VIEW_TEAM_EVALS, composites=[]), Role(name=LIVE_MONITOR_VIEW, composites=null), Role(name=INTERACTION_TAGS_ADD, composites=[]), Role(name=manage-account, composites=[Role(name=manage-account-links, composites=null)]), Role(name=PLAN_ALL_EVALS, composites=[]), Role(name=SCORING_TIERS_VIEW, composites=[]), Role(name=MANAGE_COMPLIANCE, composites=[]), Role(name=EVAL_AGENTS, composites=[]), Role(name=VIEW_ZPA, composites=[]), Role(name=EDIT_AUDIT_REASON, composites=[]), Role(name=INTERACTIONS_EXPORT_JSON, composites=[]), Role(name=ADD_CALL, composites=[]), Role(name=INTERACTION_TAGS_EDIT, composites=[]), Role(name=PLAN_GROUP_EVALS, composites=[]), Role(name=VIEW_AUDIT, composites=[]), Role(name=DEFAULT_CC_MANAGER, composites=[Role(name=DATA_EXPORT_ALL_RESULTS, composites=null), Role(name=REPORTING_ALL, composites=null), Role(name=REPORTING_SELF, composites=null), Role(name=MANAGE_QUESTIONNAIRES, composites=null), Role(name=INTERACTION_ANONYMIZE, composites=null), Role(name=REALLOCATE_EVALUATIONS, composites=null), Role(name=INTERACTION_TAGS_VIEW, composites=null), Role(name=EDIT_GLOBAL_TEMPLATES, composites=null), Role(name=EDIT_ADMIN_SETTING, composites=null), Role(name=CREATE_EVALS, composites=null), Role(name=REPORTING_ASSIGNED_TEAMS, composites=null), Role(name=INTERACTION_REVIEWS_VIEW, composites=null), Role(name=MANAGE_DATA_LIFECYCLE, composites=null), Role(name=EDIT_INTERACTION_TYPES, composites=null), Role(name=REPLACE_CALLS, composites=null), Role(name=INTERACTION_TAGS_MANAGE, composites=null), Role(name=ADD_AUDIT_REASON, composites=null), Role(name=EVAL_REMOVE_ALL, composites=null), Role(name=INTERACTIONS_FULL_VIEW, composites=null), Role(name=DATA_TASK_ALL, composites=null), Role(name=MANAGE_SHARED_DASHBOARD, composites=null), Role(name=INTERACTION_TA
//         GS_ADD, composites=null), Role(name=EVAL_AGENTS, composites=null), Role(name=SCORING_TIERS_MANAGE, composites=null), Role(name=ADD_CALL, composites=null), Role(name=MANAGE_COMPLIANCE, composites=null), Role(name=INTERACTIONS_GROUP_VIEW, composites=null), Role(name=INTERACTIONS_EXPORT_MEDIA, composites=null), Role(name=EDIT_AUDIT_REASON, composites=null), Role(name=INTERACTION_TAGS_EDIT, composites=null), Role(name=VIEW_MY_EVALS, composites=null), Role(name=SCORING_TIERS_VIEW, composites=null), Role(name=PLAN_ALL_EVALS, composites=null), Role(name=VIEW_ALL_EVALS, composites=null), Role(name=VIEW_TEAM_EVALS, composites=null), Role(name=PLAN_GROUP_EVALS, composites=null), Role(name=VIEW_AUDIT, composites=null), Role(name=INTERACTIONS_EXPORT_JSON, composites=null), Role(name=INTERACTIONS_AGENT_VIEW, composites=null), Role(name=VIEW_ZPA, composites=null)]), Role(name=INTERACTIONS_GROUP_VIEW, composites=[]), Role(name=DATA_TASK_ALL, composites=[]), Role(name=INTERACTIONS_FULL_VIEW, composites=[]), Role(name=EDIT_GLOBAL_TEMPLATES, composites=[]), Role(name=EVAL_REMOVE_ALL, composites=[]), Role(name=CREATE_EVALS, composites=[]), Role(name=SCORING_TIERS_MANAGE, composites=[]), Role(name=VIEW_CONVERSATIONS_SCREEN, composites=[]), Role(name=INTERACTION_ANONYMIZE, composites=[]), Role(name=INTERACTIONS_EXPORT_MEDIA, composites=[]), Role(name=VIEW_MY_EVALS, composites=[]), Role(name=EDIT_ADMIN_SETTING, composites=[]), Role(name=VIEW_ALL_EVALS, composites=[]), Role(name=EDIT_INTERACTION_TYPES, composites=[]), Role(name=MANAGE_DATA_LIFECYCLE, composites=[]), Role(name=REALLOCATE_EVALUATIONS, composites=[]), Role(name=INTERACTION_TAGS_VIEW, composites=[]), Role(name=DEFAULT_CC_MANAGER, composites=[]), Role(name=REPLACE_CALLS, composites=[]), Role(name=INTERACTION_REVIEWS_VIEW, composites=[]), Role(name=VIEW_CONVERSATIONS_SCREEN, composites=null), Role(name=REPORTING_ASSIGNED_TEAMS, composites=[]), Role(name=MANAGE_QUESTIONNAIRES, composites=[]), Role(name=DATA_EXPORT_ALL_RESULTS, composites=[]), Role(name=MANAGE_SHARED_DASHBOARD
//     , composites=[]), Role(name=INTERACTION_TAGS_MANAGE, composites=[]), Role(name=ADD_AUDIT_REASON, composites=[]), Role(name=REPORTING_SELF, composites=[]), Role(name=LIVE_MONITOR_VIEW, composites=[]), Role(name=REPORTING_ALL, composites=[])], "groups": ["4f1c68c2-a645-4dc0-b63b-537b7432daea"], "mainGroupId": "4f1c68c2-a645-4dc0-b63b-537b7432daea", "scorecardId": "2", "usersTeams": ["4f1c68c2-a645-4dc0-b63b-537b7432daea"], "created": 1619773494885, "locale": "en-US", "timezone": "UTC" }, null));