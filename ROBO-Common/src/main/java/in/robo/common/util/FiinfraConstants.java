/*
 * To change this template, choose Tools | Templates
 * and open the template in the eDIYor.
 */
package in.robo.common.util;


/**
 *
 * @author Nikhil Thakkar
 */
public class FiinfraConstants {

    /**
     * checks the database operation successfully executed or not.
     */
    public static final String fail = "fail";
    public static final String success = "success";
    public static final String PARTIAL_SUCCESS = "partial success";
    public static final String error = "error";
    public static final String EMPTY_RESULT_SET = "EMPTY_RESULT_SET";
    public static final String FAIL = "fail";
    public static final String SUCCESS = "success";
    
    //constants for GOAL
    public static final String EDUCATION = "Education";
    public static final String  PROPERTY_OR_HOUSE = "Property House";
    public static final String MARRIAGE = "Marriage";
    public static final String TRAVEL_AND_VACATION = "Travel & Vacation";
    public static final String SPECIAL = "Special Goal";
    public static final String BUISNESS = "Buisness Goal";
    public static final String OTHER = "Other Goal";
    public static final String CAR = "Car Goal";
    public static final String TARGET_CORPUS = "Target Corpus Goal";
    
    public static final Integer EDUCATION_GOAL = 35001;
    public static final Integer  PROPERTY_OR_HOUSE_GOAL = 35003;
    public static final Integer MARRIAGE_GOAL = 35004;
    public static final Integer TRAVEL_AND_VACATION_GOAL = 35005;
    public static final Integer SPECIAL_GOAL = 35008;
    public static final Integer BUISNESS_GOAL = 35012;
    public static final Integer OTHER_GOAL = 35013;
    public static final Integer CAR_GOAL = 35006;
    public static final Integer TARGET_CORPUS_GOAL = 35016;
    /**
     * below constant is used for getting data from session.
     */
    public static final String userId = "validUserName";
//    public static final String userType = "usertype";

    /**
     * below constants is used for checking name available or not.
     */
    public static final String yes = "yes";
    public static final String no = "no";
    /**
     * below constants is used to check wither data is updated or not.
     */
    public static final int zero = 0;
    /**
     * below constants is used for redirecting page to login.
     */
    public static final String login = "loginPage";

   
    /**
     * below constant is used to check if the string equals to 1
     */

    public static final String one = "1";
    
    /**
     * below constants are name of code type
     */
    public static final String userType = "PartyType";
    public static final String country = "Countries";
    public static final String state = "State";
    public static final String city = "Cities";
    public static final String salutation = "Salutation";
    public static final String sceurityQuestions = "SceurityQuestions";
    public static final String ffrredomUserName = "FfreedomUserName";
    public static final String ffreedomPassword = "FfreedomPassword";
    public static final String queryType = "Query type";
    public static final String INTERESTED_IN = "Interested_In__c";
    public static final String LEAD_STATUS = "Status";
    public static final String branchLocation = "BranchLocation";
    public static final String LOCATION_TO_UPLOADFILE = "D:/APP/UPLOADEDFILES";
    public static final String SRP_SOURCE_MODULE_PARTNER = "Service Portal Partner Module";
    public static final String SRP_NOTIFY_TEMPLETE = "Notify template Module";
    public static final String SRP_ADD_EDIT_PARTNER = "Add/Edit Partner";
    public static final String SRP_DELETE_PARTNER = "Delete Partner";
    public static final String SRP_SEND_WELCOME_MAIL_PARTNER = "Send Welcome Mail Partner";
    public static final String SRP_BULK_UPLOAD_PARTNER = "Bulk Upload Partner";
    public static final String SRP_STA_PARTNER = "Service Team Allocation Partner";
    public static final String SRP_BULK_STA_PARTNER = "Bulk Service Team Allocation Partner";
	public static final String SRP_ASSIGN_COMMUNICATION_EMAIL_PARTNER = "Assign Communication Email Partner";
	public static final String SRP_SAVE_CHECKLIST = "Save Onboard Checklist ";
	public static final String SRP_ADD_EDIT_OPPORTUNITY = "Add/Edit Opportunity ";    
    
	
	
    /**
     * below constants are the event ids for notification
     */
    
    public static final int NEWPARTNEREVENT=9;
    public static final int NEWADMINEVENT=7;
    public static final int NEWMEMBEREVENT=8;
    public static final int NEWOPSEVENT=106;
    public static final int PATHFINDERACTIVATIONEVENT=10;
    public static final int PATHFINDERREACTIVATIONEVENT=11;
    public static final int FORGOTPASSWORDEVENT=12;
    public static final int QUERYMEMBEREVENT=13;
    public static final int QUERYPARTNEREVENT=14;
    public static final int QUERYLEADEVENT=15;
    public static final int DATACOLLECTIONACCEPTEVENT=16;
    public static final int DATACOLLECTIONRESUBMITEVENT=17;
    public static final int DATACOLLECTIONSUBMITMEMBEREVENT=18;
    public static final int DATACOLLECTIONSUBMITPARTNEREVENT=19;
    public static final int PATHFINDERINPUTACCEPTEVENT=20;
    public static final int PATHFINDERINPUTRESUBMITEVENT=21;
    public static final int PATHFINDERSUBMIT=22;
    public static final int SCHEDULEPARTNERREPORTEVENT=23;
    public static final int QUERYCOMMENTMEMBER=24;
    public static final int QUERYCOMMENTPARTNERONMEMBEREVENT=25;
    public static final int QUERYCOMMENTLEADEVENT=26;
    public static final int PATHFINDERATTACHMENTEVENT=27;
    public static final int QUERYMEMBERBYPARTNEREVENT=30;
    public static final int QUERYLEADBYPARTNEREVENT=31;
    public static final int QUERYCOMMENTPARTNERONLEADEVENT=32;
    public static final int QUERYCOMMENTPSTONMEMBEREVENT=33;
    public static final int QUERYCOMMENTPSTONLEADEVENT=34;
    public static final int QUERYCOMMENTPARTNERONSELFEVENT=35;
    public static final int QUERYCOMMENTPARTNERONMEMBERPRIVATEEVENT=36;
    public static final int QUERYCOMMENTPARTNERONLEADPRIVATEEVENT=37;
    public static final int QUERYCOMMENTPSTONMEMBERPRIVATEEVENT=38;
    public static final int QUERYCOMMENTPSTONLEADPRIVATEEVENT=39;
    public static final int QUERYCOMMENTPSTONPARTNEREVENT=40;
    public static final int PFREMINDERTOLEADEVENT=28;
    public static final int CHATTERPARTNERTOMEMBER=111;
    public static final int CHATTER_COMMENT_PARTNERTOMEMBER=112;
    public static final int CHATTER_POST_PARTNERTO_LEAD=113;
    public static final int CHATTER_COMMENT_PARTNERTO_LEAD=114;
    public static final int CHATTER_POST_TAG_PST_PARTNER_TO_MEMBER=115;
    public static final int CHATTER_COMMENT_TAG_PST_PARTNER_TO_MEMBER=116;
    public static final int CHATTER_POST_TAG_MST_PARTNER_TO_MEMBER=117;
    public static final int CHATTER_COMMENT_TAG_MST_PARTNER_TO_MEMBER=118;
    public static final int CHATTER_POST_TAG_FPA_PARTNER_TO_MEMBER=119;
    public static final int CHATTER_COMMENT_TAG_FPA_PARTNER_TO_MEMBER=120;
    public static final int CHATTER_POST_TAG_MST2_PARTNER_TO_MEMBER=121;
    public static final int CHATTER_COMMENT_TAG_MST2_PARTNER_TO_MEMBER=122;
    public static final int CHATTER_POST_TAG_PST_PARTNER_TO_LEAD=123;
    public static final int CHATTER_COMMENT_TAG_PST_PARTNER_TO_LEAD=124;
    
    public static final int CHATTER_COMMENT_MEMBER_To_PARTNER=133;
    public static final int CHATTER_POST_MEMBER_To_PARTNER=134;
    
    public static final int ADDNEWTASK = 104;

    public static final int EDIYTASK = 105;

    public static final int SCEDUALPARTNERREPORT = 23;
    
    public static final int WORKSTATIONCHANGEPARTNEREVENTOPS = 107;
    public static final int WORKSTATIONCHANGEMEMBEREVENTOPS = 108;
    public static final int WORKSTATIONCHANGELEADEVENTOPS = 109;
    
    public static final int WELCOMEKITAGREED = 126;
    public static final int WELCOMEKITDISAGREED = 127;
    public static final int WELCOMEKITUPDATED = 135;
    
    
    public static final int CHATTER_POST_PST_TO_PARTNER=138;
    public static final int CHATTER_COMMENT__OPS=139;
    public static final int CHATTER_POST_PST_TO_FPA=140;
    
    public static final int CHATTER_POST_MST_TO_PARTNER=141;
    public static final int CHATTER_POST_MST_TO_PST=142;
    public static final int CHATTER_POST_MST_TO_FPA=143;
    
    public static final int CHATTER_POST_FPA_TO_PARTNER=144;
    public static final int CHATTER_POST_FPA_TO_PST=145;
    public static final int CHATTER_POST_FPA_TO_MST=146;
    
    /**
     * below constants are owner types for events
     */
    
    public static final int PARTNER=185002;
    public static final int LEAD=185003;
    public static final int MEMBER=185001;
    public static final int USER=185004;
    public static final int TASK = 185005;
    
    
    
    
    /**
     * following constant is Ffreedom business unit id
     * 
     */
    
    public static final int FFREEDOMBUID=27828;
    public static final int AXISMFBUID=27827;
    public static final int BU_DEFAULT=AXISMFBUID;
    public static final Integer BU_ROBO=27808;
    
    
    public static final int MAX_FILE_SIZE=100000000;
    
    
    
    /**
     * following constants are profile section names
     */
    
    public static final String PROFILE_PERSONAL_INFO="PersonalInfo";
    public static final String PROFILE_COMPANY_INFO="CompanyInfo";
    public static final String PROFILE_CHANGE_PASSWORD_INFO="ChangePasswordInfo";
    
    
    
    public static final String PROFILE_PERSONAL_INFO_2="PersonalInfo2";
    
    public static final String PROFILE_EMAIL_DETAILS="EmailDetails";
    public static final String PROFILE_EMAIL_SIGNATURE="EmailSignature";
    public static final String PROFILE_EMAIL_DISCLAIMER="EmailDisclaimer";
    public static final String PROFILE_EMAIL_DND="EmailDND";
    
    public static final String PROFILE_SHCEME="Partner Scheme";
    public static final String PROFILE_SHCEME_EVENT="Add Partner Scheme";
    public static final String PROFILE_BROKERAGE_EVENT="Add Partner Brokerage";
    public static final String PROFILE_BROKERAGE="Partner Brokerage";
    
    
    
    public static final String PROFILE_BANK_DETAILS="BankDetails";
    
    public static final String PROFILE_USER_ACCOUNT_DETAILS="UserAccountDetails";
    
    public static final String PROFILE_RECIDENCE_ADDRESS="RecidenceAddress";
    public static final String PROFILE_OFFICE_ADDRESS="OfficeAddress";
    public static final String PROFILE_PERSONAL_INFO_1="PersonalInfo1";
    
    public static final String PROFILE_EMAIL_OTHER_DETAILS="EmailOtherDetails";
    public static final String PROFILE_FINANCIAL_PRODUCTS="FinancialProduct";
    public static final String PROFILE_INTERESTED_FP="InterestedFPDetails";
    public static final String UPDATE_PARTNER_PROFILE_FAILED="update partner profile failed";
     
    /**
     * following constants are Opportunity Profile section names
     */
    public static final String OPPORTUNITY_PERSONAL_DETAILS="PersonalDetails";
    public static final String OPPORTUNITY_CONTACT_DETAILS="ContactDetails";
    public static final String OPPORTUNITY_FAMILY_DETAILS="FamilyDetails";
    public static final String OPPORTUNITY_ORIGINATION_DETAILS="OriginationDetails";
    public static final String OPPORTUNITY_TRACKER_DETAILS="TrackerDetails";
    public static final String OPPORTUNITY_NOTES_DETAILS="NotesDetails";
    public static final String OPPORTUNITY_DOCUMENT_DETAILS="DocumentDetails";
    public static final String OPPORTUNITY_ASSUMPTION_DETAILS="AssumptionDetails"; 
    public static final String OPPORTUNITY_BULK_UPLOAD="BulkUploadOpportunity";
    public static final String OPPORTUNITY_INTERESTED_FP="InterestedFPDetails";
    
    /**
     * following constants are Client Profile section names
     */
    public static final String CLIENT_PERSONAL_DETAILS="PersonalDetails";
    public static final String CLIENT_CONTACT_DETAILS="ContactDetails";
    public static final String CLIENT_FAMILY_DETAILS="FamilyDetails";
    public static final String CLIENT_OPERATIONAL_DETAILS="OperationalDetails";   
    public static final String CLIENT_NOTES_DETAILS="NotesDetails";
    public static final String CLIENT_DOCUMENT_DETAILS="DocumentDetails";
    public static final String CLIENT_ASSUMPTION_DETAILS="AssumptionDetails";
    public static final String CLIENT_HEALTH_HISTORY_DETAILS="HealthHistoryDetails"; 
    public static final String CLIENT_INTERESTED_FP="InterestedFPDetails";
    
    /*
     * STORED PROCEDURE NAMES
     * */
     public static final String SP_USP_CP_GET_CODEVALUES_BY_CODETYPEID ="{CALL usp_cp_getCodeValuesByCodeTypeId(?,?)}";
     public static final String SP_USP_CP_TEST_GET_CONTACT_TYPES = "{CALL usp_cp_test_getContactTypes(?)}";
     public static final String SP_USP_CP_GET_USER_LIST_BY_OWNERPARTY_ID = "{CALL usp_cp_getUserListByOwnerPartyId(?,?)}";
     public static final String SP_USP_PP_GET_RECENT_CHATTER_FEEDS_FOR_PARTTNER = "{CALL usp_pp_GetRecentChatterFeedsForParttner(?,?,?)}";
     public static final String SP_USP_CP_GET_DOWNLOADS_LIST = "{CALL usp_cp_getDownloadsList(?)}";
     public static final String SP_USP_CP_GET_FAQS_LIST = "{CALL usp_cp_getFaqsList(?)}";
     public static final String SP_USP_CP_GET_CONTACT_US_DETAILS = "{CALL usp_cp_getContactUsDetails(?)}" ;
     public static final String SP_USP_CP_SAVE_QUERY = "{CALL usp_cp_saveQuery()}";
     public static final String SP_USP_CP_DELETE_QUERIES = "{CALL usp_cp_deleteQueries(?)}";
     public static final String SP_DO_AUDIT = ("{CALL usp_frw_doAudit(?,?,?,?,?,?,?,?,?,?,?,?,?)}");
     public static final String SP_INSERT_NOTIFICATION = "{CALL usp_frw_insertNotification(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
    
    
    
     /**
      * below constants are the event ids for audit
      */
     
     public static final int PARTNER_PROFILE_UPDATE=97001;
     public static final int OPPORTUNITY_PROFILE_UPDATE=97002;     
     public static final int USER_PROFILE_CREATE=97003;
     public static final int ET_INVESTMENT_UPDATE=97004;
     public static final int ET_PREPRINTED_FORM_GENERATION=97005;
     public static final int ET_CLIENT_APPROVAL_STATUS_UPDATE=97008;
     public static final int ET_EXECUTION_CANCELLED=97006;
     public static final int CLIENT_PROFILE_UPDATE=97007;
     public static final int DC_FUTURE_FINANCIALEXPECTATIONS=97009;
     public static final int DC_PERSONAL_INFO_DETAILS=97010;
     public static final int DC_INSERT_FINANCIAL_STATUS_RECORD=97011;
     public static final int DC_SUBMIT_DC_INPUT=97012;
     public static final int SAVE_OPPORTUNITY=97013;
     public static final int SAVE_CLIENT=97014;
     public static final int CONVERT_CONTACT=97015;
     public static final int PARTNER_PROFILE_UPDATE_FAILED=97016;
     public static final int WELCOME_KIT_ACCEPTED=97016;
     public static final int WELCOME_KIT_REJECTED=97017;
     public static final int SETUP_WIZARD_UPDATED=97018;
     public static final int DELETE_OPPORTUNITY=97192;
     public static final int DELETE_CLIENT=97193;
     public static final int MERGE_CLIENT=97194;
     
     public static final String SETUP_WIZARD_MODULE="Setup Wizard";
     
     /**
      * below constants are the event ids and source for Mobile Web related auDIY
      */     
     public static final int DIY_SUCCESSFULL_LOGIN=97019;
     
     public static final int DIY_SUCCESSFULLY_ADDED_OPPORTUNITY=97020;
     public static final int DIY_ADD_OPPORTUNITY_FAILED=97021;
     public static final int DIY_SUCCESSFULLY_UPDATED_CONTACT=97022;
     public static final int DIY_UPDATE_CONTACT_FAILED=97023;
     public static final int DIY_SUCCESSFULLY_UPDATED_PERSONAL_INFORMATION=97024;
     public static final int DIY_PERSONAL_INFORMATION_UPDATE_FAILED=97025;
     public static final int DIY_CONTACT_DELETED_SUCCESSFULLY=97026;
     public static final int DIY_CONTACT_DELETE_FAILED=97027;
     
     public static final int DIY_CFS_DATA_SAVED_SUCCESSFULLY=97028;
     public static final int DIY_CFS_DATA_SAVE_FAILED=97029;
     public static final int DIY_RISK_PROFILE_SAVED_SUCCESSFULLY=97030;
    
     
     
     
     public static final int DIY_SUCCESSFULLY_ADDED_EDUCATION_GOAL=97031;
     public static final int DIY_ADD_EDUCATION_GOAL_FAILED=97032;
     public static final int DIY_SUCCESSFULLY_ADDED_PROPERTY_GOAL=97033;
     public static final int DIY_ADD_PROPERTY_GOAL_FAILED=97034;
     public static final int DIY_SUCCESSFULLY_ADDED_WEDDING_GOAL=97035;
     public static final int DIY_ADD_WEDDING_GOAL_FAILED=97036;
     public static final int DIY_SUCCESSFULLY_ADDED_TRAVEL_GOAL=97037;
     public static final int DIY_ADD_TRAVEL_GOAL_FAILED=97038;
     public static final int DIY_SUCCESSFULLY_ADDED_CAR_GOAL=97039;
     public static final int DIY_ADD_CAR_GOAL_FAILED=97040;
     public static final int DIY_SUCCESSFULLY_ADDED_BUSINESS_GOAL=97041;
     public static final int DIY_ADD_BUSINESS_GOAL_FAILED=97042;
     public static final int DIY_SUCCESSFULLY_ADDED_OTHER_GOAL=97043;
     public static final int DIY_ADD_OTHER_GOAL_FAILED=97044;
     public static final int DIY_SUCCESSFULLY_ADDED_SPECIAL_GOAL=97045;
     public static final int DIY_ADD_SPECIAL_GOAL_FAILED=97046;
     public static final int DIY_SUCCESSFULLY_ADDED_TARGET_CORPUS_GOAL=97106;
     public static final int DIY_ADD_TARGET_CORPUS_GOAL_FAILED=97107;
     
     public static final int DIY_ADD_TASK_SUCCESSFUL=97047;
     public static final int DIY_ADD_TASK_FAILED=97048;
     public static final int DIY_UPDATE_TASK_SUCCESSFUL=97049;
     public static final int DIY_UPDATE_TASK_FAILED=97050;
     public static final int DIY_DELETE_TASK_SUCCESSFUL=97051;
     public static final int DIY_DELETE_TASK_FAILED=97052;
     
     public static final int DIY_ADD_QUERY_SUCCESSFUL=97053;
     public static final int DIY_ADD_QUERY_FAILED=97054;
     public static final int DIY_UPDATE_QUERY_SUCCESSFUL=97055;
     public static final int DIY_DELETE_QUERY_SUCCESSFUL=97056;
     public static final int DIY_DELETE_QUERY_FAILED=97057;
     
     public static final int UPDATE_PROFILE_EMAIL_DETAILS=97058;
     public static final int UPDATE_PROFILE_EMAIL_SIGNATURE=97059;
     public static final int UPDATE_PROFILE_EMAIL_DISCLAIMER=97060;
     public static final int UPDATE_PROFILE_EMAIL_DND=97061;
     public static final int UPDATE_PROFILE_BANK_DETAILS=97062;
     public static final int UPDATE_PROFILE_USER_ACCOUNT_DETAILS=97063;
     public static final int UPDATE_PROFILE_RECIDENCE_ADDRESS=97064;
     public static final int UPDATE_PROFILE_OFFICE_ADDRESS=97065;
     public static final int UPDATE_PROFILE_PERSONAL_INFO_1=97066;
     public static final int UPDATE_PROFILE_EMAIL_OTHER_DETAILS=97067;
     public static final int UPDATE_PROFILE_FINANCIAL_PRODUCTS=97068;
     public static final int UPDATE_PROFILE_PERSONAL_INFO_2=97069;
     
     public static final int DIY_UPDATE_OPPORTUNITY_ASSUMPTION_DETAILS_SUCCESSFUL=97070;
     public static final int DIY_UPDATE_OPPORTUNITY_ASSUMPTION_DETAILS_FAILED=97071;
     
     public static final int DIY_SAVE_ADVICE_RECOMMENDATION_SUCESSFUL=97072;
     public static final int DIY_SAVE_ADVICE_RECOMMENDATION_FAILED=97073;
     public static final int DIY_SAVE_GOAL_PLANNING_SUCESSFUL=97074;
     public static final int DIY_SAVE_GOAL_PLANNING_FAILED=97075;
     public static final int DIY_SAVE_GOAL_PLANNING_ASSETTYPES_SUCESSFUL=97076;
     public static final int DIY_SAVE_GOAL_PLANNING_ASSETTYPES_FAILED=97077;
     public static final int DIY_SAVE_GOAL_PLANNING_PRODUCT_SUCESSFUL=97078;
     public static final int DIY_SAVE_GOAL_PLANNING_PRODUCT_FAILED=97079;
     public static final int DIY_SAVE_GOAL_PLANNING_PRODUCT_TYPE_SUCESSFUL=97080;
     public static final int DIY_SAVE_GOAL_PLANNING_PRODUCT_TYPE_FAILED=97081;
     public static final int DIY_SAVE_RECOMMENDATIONS_SUCESSFUL=97082;
     public static final int DIY_SAVE_RECOMMENDATIONS_FAILED=97083;
     
     public static final int DIY_DC_ACIVATE_SUCCESSFUL=97084;
     public static final int DIY_DC_ACIVATE_FAILED=97085;
     
     public static final int DIY_SAVE_VACATION_PLANNING_SUCCESSFUL=97086;
     public static final int DIY_SAVE_VACATION_PLANNING_FAILED=97087;
     public static final int DIY_SAVE_TAX_PLANNING_SUCCESSFUL=97088;
     public static final int DIY_SAVE_TAX_PLANNING_FAILED=97089;
     public static final int DIY_SAVE_SUCCESSION_PLANNING_SUCCESSFUL=97090;
     public static final int DIY_SAVE_SUCCESSION_PLANNING_FAILED=97091;
     public static final int DIY_SAVE_EMERGENCY_PLANNING_SUCCESSFUL=97092;
     public static final int DIY_SAVE_EMERGENCY_PLANNING_SUCCESSFUL_SERVICE_PORTAL=97230;
     public static final int DIY_SAVE_EMERGENCY_PLANNING_FAILED=97093;
     public static final int DIY_SAVE_ASSUMPTIONS_SUCCESSFUL=97094;
     public static final int DIY_SAVE_ASSUMPTIONS_FAILED=97095;
     public static final int DIY_CHANGE_PASSWORD_SUCCESSFUL = 97096;
     public static final int DIY_CHANGE_PASSWORD_FAILED=97097;
     
     public static final int DIY_SAVE_EMERGENCY_READINESS_SUCCESSFUL = 97098;
     public static final int DIY_SAVE_RISK_COVER_SUCCESSFUL = 97099;
     public static final int DIY_SAVE_RISK_COVER_FAILED = 97229;
     public static final int DIY_SAVE_RETIREMENT_READINESS_SUCCESSFUL = 97100;
     public static final int DIY_SAVE_SUCCESSION_READINESS_SUCCESSFUL = 97101;
     public static final int DIY_SAVE_FINANCIAL_READINESS_SUCCESSFUL = 97102;
     public static final int DIY_SAVE_CASH_FLOW_SUCCESSFUL = 97103;
     public static final int DIY_SAVE_LOAN_STATUS_SUCCESSFUL = 97104;
     public static final int DIY_PARTNER_PROFILE_UPDATE_FAILED=97105;
     public static final int DIY_X_RAY_ACTIVATION=97106;
     public static final int DIY_SAVE_REDEEM_DETAIL=97223;
     public static final int SAVE_CLIENT_IIN_DETAIL_SUCCESSFUL=97224;
     public static final int SAVE_CLIENT_IIN_DETAIL_FAIL=97226;  
     public static final int SAVE_PURCHASE_DETAIL_SUCCESSFUL=97225;
     public static final int SAVE_PURCHASE_DETAIL_FAIL=97227;     
     public static final int SAVE_SWITCH_DETAIL_SUCCESSFUL=97228;
     public static final int SAVE_SWITCH_DETAIL_FAIL=97229;
     
     public static final String DIY_SOURCE_MODULE_LOGIN="Login";
     public static final String DIY_SOURCE_MODULE_ADD_CONTACT="Add Contact";
     public static final String DIY_SOURCE_MODULE_UPDATE_CONTACT="Update Contact";
     public static final String DIY_SOURCE_MODULE_PERSONAL_INFORMATION="Personal Information";
     public static final String DIY_SOURCE_MODULE_DELETE_CONTACT="Delete Contact";
     public static final String DIY_SM_ADD_EDUCATION_GOAL="Education Goal";
     public static final String DIY_SM_ADD_PROPERTY_GOAL="Property Goal";
     public static final String DIY_SM_ADD_WEDDING_GOAL="Wedding Goal";
     public static final String DIY_SM_ADD_TRAVEL_GOAL="Travel Goal";
     public static final String DIY_SM_ADD_CAR_GOAL="Car Goal";
     public static final String DIY_SM_ADD_BUSINESS_GOAL="Business Goal";
     public static final String DIY_SM_ADD_SPECIAL_GOAL="Special Goal";
     public static final String DIY_SM_ADD_TARGET_CORPUS_GOAL="Target Corpus Goal";     
     public static final String DIY_SM_ADD_OTHER_GOAL="Other Goal";   
     public static final String DIY_SOURCE_MODULE_ADD_TASK="Add Task";
     public static final String DIY_SOURCE_MODULE_DELETE_TASK="Delete Task";
     public static final String DIY_SOURCE_MODULE_UPDATE_TASK="Update Task";
     public static final String DIY_SOURCE_MODULE_ADD_QUERY="Add Query";
     public static final String DIY_SOURCE_MODULE_UPDATE_QUERY="Update Query";
     public static final String DIY_SOURCE_MODULE_DELETE_QUERY="Delete Query";
     public static final String DIY_SOURCE_MODULE_ASSUMPTION_DETAILS_SUCCESSFUL="Update Assumptions";     
     public static final String DIY_SOURCE_MODULE_ADVICE_RECOMMENDATION="Save Advice REcommendation";  
     public static final String DIY_SOURCE_MODULE_GOAL_PLANNING="Save Goal Planning";  
     public static final String DIY_SOURCE_MODULE_GOAL_PLANNING_ASSETTYPES="Save Goal Planning Asset Type";    
     public static final String DIY_SOURCE_MODULE_GOAL_PLANNING_PRODUCT="Save Goal Planning ";
     public static final String DIY_SOURCE_MODULE_GOAL_PLANNING_PRODUCT_TYPE="Save Goal Planning product type";
     public static final String DIY_SOURCE_MODULE_RECOMMENDATIONS="Save  REcommendation";
     public static final String DIY_SOURCE_MODULE_DC_ACTIVATION="Acivate DC";
     public static String DIY_SOURCE_MODULE_VACATION_PLANNING_SOURCE = "Save Vacation Planning Recommondation";
     public static String DIY_SOURCE_MODULE_TAX_PLANNING_SOURCE = "Save Tax Planning Recommondation";
     public static String DIY_SOURCE_MODULE_SUCCESSION_PLANNING_SOURCE = "Save Succesion Planning Recommondation";
     public static String DIY_SOURCE_MODULE_EMERGENCY_PLANNING_SOURCE = "Save Emergency Planning Recommondation";
     public static String DIY_SAVE_RISK_COVER= "Save Risk Cover Recommondation";
     public static String DIY_SOURCE_MODULE_GOAL_PLAN_ASSET_TYPE_SOURCE = "Save Goal Plan Asset Type Recommondation";
     public static String DIY_SOURCE_MODULE_GOAL_PLAN_PRODUCT_TYPE_SOURCE = "Save Goal Plan Product Type Recommondation";
     public static String DIY_SOURCE_MODULE_GOAL_PLAN_ASSOCIATED_PRODUCT_SOURCE = "Save Goal Plan Associated product Recommondation";
     public static String DIY_SOURCE_MODULE_ASSUMPTIONS = "Save Assumptions";
     public static String DIY_SOURCE_MODULE_CHANGE_PASSWORD = "Change Password";
     
     public static String DIY_SOURCE_MODULE_EMERGENCY_READINESS = "Save Emergency Readiness";
     public static String DIY_SOURCE_MODULE_FINANCIAL_READINESS = "Save Financial Readiness";
     public static String DIY_SOURCE_MODULE_RISK_COVER = "Save Risk Cover";
     public static String DIY_SOURCE_MODULE_RETIREMENT_READINESS = "Save Retirement Readiness";
     public static String DIY_SOURCE_MODULE_SUCCESSION_READINESS = "Save Succession Readiness";
     public static String DIY_SOURCE_MODULE_CASH_FLOW = "Save Cash Flow";
     public static String DIY_SOURCE_MODULE_LOAN_STATUS = "Save Loan Status";
     public static String DIY_SOURCE_MODULE_REDEEM = "Save Redeem Detail";
     public static String DIY_SOURCE_MODULE_PURCHASE = "Save Purchase Detail";
     public static String DIY_SOURCE_MODULE_SWITCH = "Save Switch Detail";
     public static String DIY_SOURCE_MODULE_CREATE_IIN = "Create IIN";
     
     
     
     /**
      * below constants are the source system ids for audit
      */
     
     public static final int PARTNER_PORTAL=31001;
     public static final int PARTNER_MOBILE_PORTAL=31006;
     public static final int SERVICE_PORTAL=31003;
     public static final int CLIENT_PORTAL = 31004;
     public static final int INTEGRATION_PORTAL = 31007;
     public static final int FIINFRA_TOOLS = 31008;
     public static final int SPA_PORTAL = 31011;
	  public static final int MOBILE_API = 31009;
     
     
     
     
     /**Notyify Type**/
     public static final int SYSTEM=56001; 
     
     
     
     
     /**Mail Events**/
     public static final int QUERY_REMINDER=176;
     public static final int DC_ACTIVATION=173;
     public static final int XRAY_ACTIVATION=508;
     public static final int ANALYSIS_REPORT_GENERATION=185;
     public static final int OPPORTUNITY_CONVERSION_TO_CLIENT=306;
     public static final int CLIENT_CONVERSION_TO_PREMIUM_CLIENT=307;
     public static final int FORGOT_PASSWORD=175;
     public static final int DC_REMINDER=191;
     public static final int XRAY_REMINDER=521;
     public static final int SEND_GENERATED_REPORT=518;
     public static final int WELCOME_KIT_ACCEPTED_NOTIFICATION=284;
     public static final int WELCOME_KIT_REJECTED_NOTIFICATION=285;
     public static final int SETUP_WIZARD_UPDATED_NOTIFICATION=293;
     public static final int EXECUTION_APPROVAL_TO_CLIENT = 311;
	 
     
     public static final int CREATE_IIN_PARTNER=6241;
     public static final int CREATE_IIN_CONTACT=6242;
     
	 public static final int EVENT_CP_XRAY_REPORT = 424;
	 public static final int EVENT_CP_DC_SUBMIT = 426;
	 public static final int EVENT_CP_DC_SUBMIT_CLIENT_INTIMATION = 425;
	 public static final int EVENT_CP_INITIATE_GOAL= 388;
	 public static final int EVENT_CP_INFORM_IFA= 417;
	 public static final int EVENT_CP_BUY_PRODUCTS_ONLINE= 97212;
	 
	 public static final int EVENT_PG_PAYMENT_RECEIVED= 407;
	 public static final int EVENT_PG_FREE_WAIVER= 413;
	 
     public static final int EVENT_SEND_WELCOME_MAIL_PARNER_SRP=97133;
     public static final int EVENT_NEW_PARNER_SRP=97130;
     public static final int EVENT_EDIT_PARNER_SRP=97131;
     public static final int EVENT_STA_FOR_PARNER_SRP=97134;
     public static final int EVENT_BULK_STA_FOR_PARNER_SRP=97135;
     public static final int EVENT_DELETE_PARNER_SRP=97132;
     public static final int EVENT_BULK_UPLOAD_PARNER_SRP=97137;
	 public static final int EVENT_ASSIGN_COMMUNICATION_EMAIL_PARNER_SRP=97136;
	 public static final int EVENT_SAVE_ONBOARD_CHECKLIST_SRP=97136;
     
     public static final int SEND_PREPRINTED_FORM=427;
     
     
     
     
     
     
     /** Delivery Channel **/
     
     public static final int EMAIL=32001;
     public static final int SMS=32002;
     public static final int DIY=31006;

    
     /** Login Access log **/
     
     public static final Integer LOGIN_ACCESS_MODE_STANDARD=53001;
     public static final Integer LOGIN_ACCESS_MODE_SSO=53002;
     public static final Integer LOGIN_ACCESS_MODE_LOB=53003;
     public static final Integer LOGIN_ACCESS_MODE_TERMS_ACCEPTED=53004;
     public static final String INVALID_PASSWORD="139001";
     public static final String INACTIVE_ACCOUNT="139002";
     public static final String LOCKED_ACCOUNT="139003";
     public static final String EXPIRED_ACCOUNT="139004";
     
     
     /** Roles **/
     public static final int PARTNER_ROLE=2;
     
    


       
     ///Service portal constants

      public static int NOTIFYTYPE_ID = 56001; 
     public static int NOTIFYTARGET_ID = 28; 
     public static int DELIVERYCHANNEL_ID = 32;  
     public static int SIGNATURE_ID = 29;

     public static int FAQ_CODE_TYPE_ID=25;
     public static int SEQ_CODE_TYPE_ID=52;
 	public static int DOWNLOAD_CODE_TYPE_ID=24;	
 	public static int BU_RECORD_TYPE_ID=14002;
 	public static int ATTRIBUTE_CODE_VALUE_ID=98088;
 	public static int ATTRIBUTE_CODE_VALUE_EMAILSIGN_ID=91037;
 	public static int ATTRIBUTE_CODE_VALUE_DND_TEMPLATE=91039;
 	public static int ATTRIBUTE_CODE_VALUE_DISCLIAMER=91038;
 	public static int DATA_TYPE_ID=37001;
 	public static int DISPLAY_SEQ=1;
 	public static int CITY_ID=1;
 	public static int STATE_ID=2;
 	public static int COUNTRY_ID=3;
 	public static int DEPARTMENT_CODE_TYPE_ID = 42; 
	public static int EVENTCATEGORY_CODE_TYPE_ID=54;
	public static int EVENTSYSTEM_CODE_TYPE_ID=31; 
 	public static int ALLOCATION_TYPE_ID = 43001; 
 	public static int USER_ID = 1; 
 	public static int COLOR_CODE_TYPE_ID = 92;
 	public static int DATA_TYPE_VALUE = 37;
 	public static int ASSUME_TYPE_VALUE = 98;
 	public static int SMS_SIGN = 91040;
 	public static int  THEMEID= 92;
 	public static int ATTRIBUTE_SEQ=1;
 	
 	

 	
 	//FiinfraConstants for codetype 
 	public static final String SP_GET_CODETYPE_DETAILS_LIST="{CALL usp_srp_showCodeTypeDetails(?)}";
 	public static final String SP_MAX_CODETYPE_ID="{CALL usp_srp_getMaxCodeTypeId()}";
 	public static final String SP_ADD_NEW_CODE_TYPE="{CALL  usp_srp_addCodeType(?,?,?)}";
 	public static final String SP_EDIT_CODE_TYPE="{CALL  usp_srp_updateCodeType(?,?,?)}";
 	public static final String SP_DELETE_CODETYPES="{CALL usp_srp_deleteCodeType(?)}";
 	public static final String SP_GET_CODETYPE_VALUES_BY_CODETYPEID="{CALL usp_srp_getCodeValuesByCodetypeId(?)}";
 	public static final String SP_UPDATE_DISPLAY_SEQ_NO="{CALL usp_srp_updateDisplaySeqNo(?)}";
 	public static final String SP_SET_DEFAULT_CODEVALUE="{CALL usp_srp_setDefaultValueOFCodeValue(?,?)}";
 	 
 	//FiinfraConstant for codevalue
 	public static final String SP_GET_ALL_CODEVALUES_DETAILS="{CALL usp_srp_showAllCodeValuesDetails(?,?)}";
 	public static final String SP_DELETE_SELECTED_CODE_VALUES="{Call usp_srp_deleteCodeValues(?)}";
 	public static final String SP_GET_ALL_CODETYPES="{CALL usp_srp_getAllCodeTypes()}";
 	public static final String SP_GET_PARENT_CODE_VALUES="{CALL usp_srp_getParentCodeValues(?)}";
 	public static final String SP_GET_MAX_CODE_VALUEID="{CALL usp_srp_getMaxCodeValueId(?)}";
 	public static final String SP_GET_MAX_DISPLAY_SEQ_NO="{CALL usp_srp_getMaxDisplaySeqNo(?)}";
 	public static final String SP_ADD_NEW_CODE_VALUE="{CALL usp_srp_addCodeValue(?,?,?,?,?,?,?,?,?,?,?,?)}";
 	public static final String SP_GET_CODEVALUE_DETAILS_TO_UPDATE="{CALL usp_srp_getCodeValueDetailsToUpdate(?)}";
 	public static final String SP_UPDATE_CODE_VALUE="{CALL usp_srp_updateCodeValue(?,?,?,?,?,?,?,?,?,?)}";
 	
 	
 	public static String SP_GET_CODEVALUE_BY_CODETYPE_ID = "{CALL  usp_srp_getCodeValue(?)}";  
 	public static final String  SP_CODETYPE_TO_CODETYPE_ID_CONVERSION="{CALL usp_srp_getCodeTypeIdByCodeType(?)}";
 	//public static final String SP_GET_CODETYPE_LIST="{CALL usp_srp_ListCodeTypes()}";
 	
 	// start download  section related  SP
 	public static final String SP_GET_DOWNLOAD_DETAILS_LIST="{CALL usp_srp_getDownloadsList_Details(?)}";
 	public static final String SP_ADD_NEW_DOC_TO_DOWNLOAD="{CALL usp_srp_addDocToDownload(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";

   public static final String SP_GET_BIZUNIT_BY_PARTY_ID="{CALL usp_srp_getPartyByPartyId(?,?,?)}";	
 	public static final String SP_GET_DOWNLOAD_SECTION_BY_CODETYPE_ID="{CALL usp_srp_getCodeValue(?)}";
 	public static final String SP_EDIT_DOC_TO_DOWNLOAD="{CALL usp_srp_editDocToDownloads(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
 	public static String SP_USP_DELETE_DOWNLOAD_LIST="{CALL usp_srp_deleteDocTODownload(?,?)}";

 	public static String SP_USP_FILE_NAME="{CALL usp_srp_getFileName(?)}";
 	// end download  section related  SP
 	
 	
 // start Testimonial related  SP
	public static final String SP_GET_TESTIMONIALS="{CALL usp_srp_getTestimonial(?,?,?,?)}";
	public static final String SP_ADD_TESTIMONIALS="{CALL usp_srp_insertTestimonial(?,?,?,?,?,?,?,?,?)}";
	public static final String SP_USP_DELETE_TESTIMONIAL="{CALL usp_srp_deleteTestimonial(?,?)}";
	
 // end Testimonial related  SP
	
 // start Logged User related  SP
	
	public static final String SP_GET_LOGGED_USERS="{CALL usp_srp_getLoggedInUser(?,?,?)}";
	public static final String SP_GET_LOGGED_CHART_USERS="{CALL usp_srp_getLoggedChartUser(?)}";
// end Logged User related  SP
 	
	
	
	//Start Monitor Email SMS
	public static final String SP_GET_EMAIL_SMS_LIST="{CALL usp_srp_getEmailSmsList(?,?)}";
	public static final String SP_GET_EMAIL_CHART="{CALL usp_srp_getEmailSMSChart(?)}";	
	
	
	
 	//public static final String SP_DELETE_CODETYPES="{CALL usp_srp_deleteCodeType(?)}";
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	//public static String SP_USP_CP_GET_CODE_VALUES_BY_CODE_TYPE_ID = "{CALL usp_cp_getCodeValuesByCodeTypeId(?,?)}";
 	public static String SP_USP_FAQ_ADD ="{CALL usp_srp_addFAQ(?,?,?,?,?,?)}";
 	public static String SP_USP_GET_FAQ = "{CALL usp_srp_getFAQ(?)}";
 	public static String SP_USP_FETCH_FAQMODULE = "{CALL  usp_srp_getCodeValue(?)}";
 	public static String SP_USP_GET_FAQBUPARTY = "{CALL usp_srp_getPartyByPartyId(?,?,?)}";
 	public static String SP_USP_UPDATE_FAQ="{CALL usp_srp_updateFAQ(?,?,?,?,?,?,?)}";
 	public static String SP_USP_DELETE_FAQ="{CALL usp_srp_deleteFAQ(?,?)}";
 	public static String SP_USP_GET_USERID="{CALL usp_srp_getUserIdByUser(?)}";
 	public static String SP_GET_FAQDEATIL="{CALL usp_srp_getFaqDetail(?)}";
 	public static String SP_GET_PICKLIST="{CALL usp_cp_getCodeValuesByCodeTypeId(?,?)}";
 	public static String SP_USP_GET_FAQ_ADMIN="{CALL usp_srp_getFAQAdmin(?)}";
 	 
	public static String SP_USP_GET_CODEIDS="{CALL usp_srp_getCodeIds(?,?)}";
 	
 	//FiinfraConstants for Role
 	public static final String SP_GET_ROLE_LIST="{CALL usp_srp_getRole(?)}";
 	public static final String SP_ADD_NEW_ROLE="{CALL usp_srp_addRole(?,?,?,?,?,?)}";
 	public static final String SP_EDIT_ROLE="{CALL usp_srp_updateRole_1(?,?,?,?,?,?,?)}";
 	public static final String SP_DELETE_ROLE="{CALL usp_srp_deleteRole(?,?)}";
 	//public static final String SP_DELETE_LIST="{CALL usp_srp_deleteRole(?)}";
 	public static final String SP_GET_UNIQUE_ROLE="{CALL usp_srp_getUniqueRole(?)}";
 	public static final String SP_GET_ROLEACCESS_LIST="{CALL usp_srp_getRoleAccessList()}";
 	public static final String SP_GET_ROLEACCESS_LIST_FORROLEID="{CALL usp_srp_getAccessListForPerticularRole(?)}";
 	
 	//FiinfraConstants for User
 	public static final String SP_GET_USER_LIST_BU="{CALL usp_srp_getUserListForBu(?,?,?,?,?,?)}";
 	public static final String SP_VIEW_LOGIN_HISTORY="{CALL usp_srp_viewLoginHistory(?,?)}";
 	public static final String SP_GET_ROLE="{CAll usp_srp_getRoleName()}"; 
 	public static final String SP_GET_PARTYTYPE="{CALL usp_srp_getPartyTypeByCodevalueId()}";
 	public static final String SP_UPDATE_USER="{CALL usp_srp_updateUser(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
 	public static final String SP_GET_USER_DETAIL="{CALL  usp_srp_getUserDetail(?)}";
 	public static final String SP_GET_UNIQUSERNAME="{CALL usp_srp_getUniqueUser(?)}";
 	public static final String SP_ADD_USER="{CALL usp_srp_addUser(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}"; 
 	
 	public static final String SP_GET_USER_LIST_BU_COUNT="{CALL usp_srp_getUserListForBucount(?)}";
 	
 	public static final String SP_GET_USER_LIST_EXPORT="{CALL usp_srp_getUserListForexport(?)}";
 	
 	//public static final String SP_ADD_USER="{CALL usp_srp_addUserTest(?,?,?,?,?,?,?,?,?,?)}";
 	public static final String SP_GET_USERNAME="{CALL usp_srp_getUserNamefromParty(?)}";
 	public static final String SP_GET_SEQURITYQUESTION="{CALL usp_srp_getCodeValue(?)}";
 	public static final String SP_DELETE_USER="{CALL usp_srp_deleteUser(?,?)}";
 	public static final String SP_USER_CURRENT_LOGIN="{CALL usp_srp_getTopLoginList_Details(?,?)}";
 	public static final String SP_ADD_PASSWORD_DETAIL="{CALL usp_srp_updatePassword(?,?)}";
 	public static final String SP_GET_AUDITUSER_LIST="{CALL usp_srp_viewAuditHistory(?,?)}";
 	public static final String SP_UPDATE_USER_PROFILE="{CALL usp_srp_updateUserHeirarchyProfile(?,?,?,?,?,?,?,?,?,?,?)}";
 	
	
	
 	///FiinfraConstants for Biz Unit
 	public static final String SP_GET_BIZUNIT_LIST="{CALL usp_srp_getBizUnit(?)}";
 	public static final String SP_GET_CODEVALUE_FOR_PARENTID="{CALL usp_srp_getValueForParentId(?)}";
 	public static final String SP_ADD_BIZ_UNIT="{CALL usp_srp_addBizUnit(?,?,?,?,?,?,?,?,?,?,?,?)}";
 	public static final String SP_GET_BIZ_UNIT_DETAIL="{CALL usp_srp_getBizUnitDetail(?)}";
 	public static final String SP_UPDATE_BIZ_UNIT="{CALL usp_srp_updateBizUnit(?,?,?,?,?,?,?,?,?,?,?,?,?)}";
 	public static final String SP_DELETE_BIZ_UNIT="{CALL usp_srp_deleteBizUnit(?,?)}";
 	public static final String SP_ADD_EMAIL_BIZ_UNIT="{CALL usp_srp_addEmailforBizUnit(?,?,?,?)}";
 	public static final String SP_ADD_EMAIL_SIGN_BIZ_UNIT="{CALL usp_srp_addEmailSignature(?,?,?,?,?,?)}";
 	public static final String SP_ADD_DND_TEPMLATE_BIZ_UNIT="{CALL usp_srp_addDndTemplate(?,?,?,?,?,?)}";
 	public static final String SP_ADD_DISCLIAMER_BIZ_UNIT="{CALL usp_srp_addDisclaimer(?,?,?,?,?,?)}";
 	public static final String SP_GET_WHITE_LABEL="{CALL usp_srp_getWhitePageDtail(?)}";
 	public static final String SP_GET_ASSUMPTION_LIST="{CALL usp_srp_getAssumptionsList(?)}";
 	public static final String SP_ADD_ASSUMPTION="{CALL usp_srp_addupBizAssumption(?,?,?,?,?,?,?,?,?,?)}";
 	public static String SP_DELETE_ASSUME="{CALL usp_srp_deleteAssumption(?)}";
 	public static String SP_GET_ASSUME_DETAIL="{CALL usp_srp_getAssumeDetail(?)}";
 	public static final String SP_UPDATE_ASSUMPTION="{CALL usp_srp_updateAssumption(?,?,?,?,?,?,?,?,?,?)}";
 	public static final String SP_COPY_BU="{CALL usp_srp_copyBizUnits(?,?)}";
 	public static final String SP_GETUNIQUE_BU="{CALL usp_srp_getUniqueBizUnit(?)}";
 	public static final String SP_ADD_SMS_FOR_BU="{CALL usp_srp_addSmsSign(?,?,?,?,?,?,?)}";
 	public static final String SP_UPDATE_BIZ_UNIT_GENERAL="{CALL usp_srp_updateBizUnitGeneral(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
 	
 	
 	///FiinfraConstants for SL Finence Opportunity
 	public static final String SP_GET_VIEW_OPPORTUNITY="{CALL usp_srp_getViewOpportunity(?,?,?)}";
 	public static final String SP_ADD_VIEW_OPPORTUNITY="{CALL usp_srp_AddEditOpp(?,?,?,?,?,?,?,?,?,?,?, ?,?,?,?,?,?,?)}";
 	public static final String SP_USP_DELETE_VIEW_OPPORTUNITY="{CALL usp_srp_deleteOpp(?,?)}";
 	public static final String SP_GET_EDIT_OPPORTUNITY="{CALL usp_srp_getEditOppList(?)}";
 	public static final String SP_UPDATE_TRACKER="{CALL usp_srp_updateTracker(?,?,?,?,?,?)}";
 	public static final String SP_CHANGE_TO_CLIENT = "{CALL usp_srp_changeToClient(?,?,?,?)}";
 	
 	//setting
 	public static final String SP_GET_SETTING_LIST="{CALL usp_srp_getSettingList(?)}";
 	public static final String SP_ADD_BIZUNIT_SETTING="{CALL usp_srp_addupBizSetting(?,?,?,?,?,?,?,?,?,?)}";
 	public static final String SP_DELETE_BIZUNIT_SETTING="{CALL  usp_srp_deleteSetting(?,?)}";
 	public static final String SP_GET_BIZUNIT_SETTING_DETAIL="{CALL  usp_srp_getSettingDetail(?,?)}";
 	public static final String SP_UPDATE_BIZUNIT_SETTING="{CALL usp_srp_updateBizSetting(?,?,?,?,?,?,?,?,?,?)}";
 	public static final String SP_GET_CHECK_BIZUNIT_SETTING_COUNT="{CALL usp_srp_getSettingCount(?,?)}";
 	
 	
 	
 	
 	
 	
 	//FiinfraConstants for Department      Created By : Suvarna Jagadale                           
 	public static final String SP_GET_DEPARTMENT_LIST="{CALL usp_srp_getDepartment(?)}";         
 	public static final String SP_ADD_NEW_DEPARTMENT = "{CALL usp_srp_insertDepartment(?,?,?,?,?,?)}";          
 	public static final String SP_EDIT_DEPARTMENT = "{CALL usp_srp_updateDepartment(?,?,?,?,?,?,?)}";                  
 	public static final String SP_DELETE_DEPARTMENT = "{CALL usp_srp_deleteDepartment(?,?)}";
 	public static final String SP_GET_BIZ_UNIT_BY_PARTY_ID="{CALL usp_srp_getPartyByPartyId(?,?,?)}";         
 	public static final String SP_GET_DEPARTMENT_TYPE = "{CALL usp_srp_getCodeValuesByCodetypeId(?)}";          
 	public static final String SP_GET_DEPARTMENT_NAME = "{CALL usp_srp_getdepartmentName()}"; 
 	public static final String SP_GET_USERID="{CALL usp_srp_getUserIdByUser(?)}"; 
 	public static final String SP_GET_DEPARTMENTTYPEID = "{CALL usp_srp_getDepartmentTypeIdByCodeValue(?)}";    
 	public static final String SP_UPDATE_ACCESS_LIST="{CALL usp_srp_updateAccessList(?)}";
 	public static final String SP_CASCADE_DELETE="{CALL usp_srp_cascadeDelDep(?)}";      
 	  
 	//FiinfraConstants for Notify Event      Created By : Suvarna Jagadale        
		public static final String SP_GET_NOTIFYEVENT_LIST="{CALL usp_srp_getNotifyEventList(?)}";
		public static final String SP_DELETE_NOTIFYEVENT = "{CALL usp_srp_deleteNotifyEvent(?,?)}";
		public static final String SP_GET_CATEGORY = "{CALL usp_srp_getCodeValuesByCodetypeId(?)}";
		public static final String SP_GET_SYSTEM = "{CALL usp_srp_getCodeValuesByCodetypeId(?)}";   
		public static final String SP_ADD_NOTIFYEVENT = "{CALL usp_srp_addNotifyEvent(?,?,?,?,?)}";   
		public static final String SP_EDIT_NOTIFYEVENT = "{CALL usp_srp_updateNotifyEvent(?,?,?,?,?,?)}"; 
 	
 		
 	//FiinfraConstants for Team Member
 	public static final String SP_GET_TEAMMEMBERLIST="{CALL usp_srp_getServiceTeamMember(?,?)}";
 	public static final String SP_ADDTEAMMEMBER="{CALL usp_srp_addServiceTeamMember(?,?,?,?,?,?,?,?,?,?,?)}";
 	public static final String SP_UPDATETEAMMEMBER="{CALL usp_srp_updateServiceTeamMember(?,?,?,?,?)}";
 	public static final String SP_DELETETEAMMEMBER="{CALL usp_srp_deleteServiceTeamMember(?,?)}";
 	public static final String SP_GET_PARTYTYPES="{CALL usp_srp_getPartyType()}";
 	public static final String SP_GET_ALLOCATION_LIST_FORDEPARTMENT="{CALL usp_srp_getAllocationListforTeamMember(?)}";
 	public static final String SP_GET_UNIQUETEAMMEMBER="{CALL usp_srp_getUniqueMember(?)}";
 	
 	
 	//FiinfraConstants for Partner
 	//public static final String SP_GET_PARTNER_LIST_="{CALL usp_srp_getPartnerList()}";
 	//public static final String SP_ADD_PARTNER="{CALL usp_srp_addPartner(?,?,?,?,?,?,?,?)}";
 	public static final String SP_TOP_PARTNER_LIST="{CALL usp_srp_getSelectTopPartnerList(?,?,?)}";
 	
 	
	/* Birt Report     */
    
	public static final String SP_GET_CATEGORYTYPEID = "{CALL USP_rpt_getCatagarytypeId(?)}";
	public static final String SP_GET_PRODUCTTYPEID = "{CALL USP_rpt_getProducttypeId(?)}";
 	public static final String SP_GET_COMPANYID = "{CALL usp_rpt_getCompanyName(?)}";
 	public static final String SP_GET_AMCS = "{CALL usp_rpt_getAMCs(?)}";
 	public static final String SP_GET_PRODUCTID = "{CALL usp_rpt_getProductName(?,?)}";
	public static final String SP_GET_FOLIONO = "{CALL usp_rpt_getFolioNo(?,?)}";
	
	public static final String SP_GET_TRANSACTION_TYPES = "{CALL usp_pp_getCodeValuesByCodeTypeId(?)}";
	
 	public static final String SP_GET_INVESTORTXNSTARTDATE = "{CALL usp_rpt_InvestorTxnStartDate(?,?)}";
 	public static final String SP_GET_ISSUERID = "{CALL usp_rpt_getIssuerID()}";
    public static final String SP_GET_PARTNERLIST = "{CALL usp_rpt_getPartnerList(?,?,?)}";
    public static final String SP_GET_CLIENTLIST = "{CALL usp_rpt_getClientList(?,?)}";
    public static final String SP_GET_CLIENTLISTONLY = "{CALL usp_rpt_getClientListForOnlyClient(?,?,?)}";
    public static final String SP_GET_SECTIONTYPEID = "{CALL usp_rpt_getSectionType()}";
    public static final String SP_GET_ServiceTeamMember = "{CALL usp_rpt_getServiceTeamMember()}";
    
    
	//FiinfraConstants for Partner
	public static final String SP_GET_PARTNER_LIST="{CALL usp_srp_getPartnerListHierarchy(?,?,?,?,?,?,?,?)}"; 
	public static final String SP_GET_PARTNER_LIST_COUNT="{CALL usp_srp_getPartnerListHierarchyDetailsCount(?,?,?,?)}"; 
	public static final String SP_ADD_PARTNER="{CALL usp_srp_addPartner(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	public static final String SP_ADD_PARTNERTHIRDPARTY = "{CALL usp_srp_addPartnerForThirdParty(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	public static final String SP_EDIT_PARTNER="{CALL usp_srp_editPartner(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	public static final String SP_GET_PSTPKTPOT_NAMES="{CALL usp_srp_getPSTPKTPOTNames(?)}";
	public static final String SP_SEARCH_PSTPKTPOT="{CALL usp_srp_searchPSTPKTPOT(?,?)}";
	public static final String SP_STA_FOR_PARTNER="{CALL usp_srp_addSTAforPartner(?,?,?,?,?,?)}";
	public static final String SP_BULK_STA_FOR_PARTNER="{CALL usp_srp_addBulkSTAforPartner(?,?,?,?,?,?)}";
	public static final String SP_DELETE_PARTNER="{CALL usp_srp_deletePartner(?,?)}";
	public static final String SP_GET_LOCATION="{CALL usp_srp_getLocation()}";
	public static final String SP_GET_UNIQUE_ARN="{CALL usp_srp_getUniqueArn(?)}";
	public static final String SP_GET_UNIQUE_COMMUNICATION_EMAIL="{CALL usp_srp_getUniqueCommunicationEmail(?,?,?,?)}";
	
	public static final String SP_GET_LOGINNAME="{CALL usp_srp_getLoginName(?)}";
	public static final String SP_GET_TOP_PARTNER_LIST="{CALL usp_srp_getTopPartnerList(?,?)}";
	public static final String SP_BULK_UPLOAD_FOR_PARTNER="usp_srp_bulkUploadForPartner";
	public static final String SP_ASSIGN_COMMUNICATION_EMAIL_PARTNER="{CALL usp_srp_assignCommunicationEmail(?,?,?,?,?,?)}";
	public static final String SP_SEND_WELCOME_MAIL="{CALL usp_srp_sendWelcomeMail(?)}";
	public static final String SP_SAVE_ONBOARD_CHECK_LIST="{CALL usp_srp_saveOnboardChecklist1(?,?,?,?,?,?,?,?,?,?,?,?)}";
	public static final String SP_SAVE_LEGENTS_CHECK_LIST="{CALL usp_srp_saveLegendsChecklist(?,?,?,?,?)}";
	public static final String SP_GET_LEGENTS_CHECK_LIST="{CALL usp_srp_getLegendsChecklist(?)}"; 
	
 // for broadcast
  	public static final String SP_GET_BROADCAST_LIST="{CALL usp_srp_getAllBroadcastList(?,?)}";
  	public static final String SP_GET_BROADCAST_USERTYPE_LIST="{CALL usp_srp_getUserTypeList()}";
  	public static String SP_USP_DELETE_BROADCAST_LIST="{CALL usp_srp_deleteBroadCast(?,?)}";
  	public static final String SP_GET_BROADCAST_CITY_LIST="{CALL usp_srp_getCityList()}";
  	public static final String SP_INSERT_OR_UPDATE_BROADCAST="{CALL usp_srp_insertOrUpdateBroadcast(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	public static final String SP_BROADCAST_NEWS="{CALL usp_srp_getBroadcastList(?)}";
	public static final String SP_BROADCAST_DETAIL="{CALL usp_srp_getBroadcastDetail(?)}";
     
  //Dashboard
	public static final String SP_USER_COUNT_TASK="{CALL usp_srp_getUsersCountPendingTask(?,?)}";
	public static final String SP_QUERY_ALERT_LIST="{CALL usp_srp_getQueryAlerts(?,?)}";
	public static final String SP_ADV_CAL_ALERT="{CALL usp_srp_getUserAdvTasklist(?)}";
	public static final String SP_PARTNER_QUERY_ALERT="{CALL usp_srp_getPartnerQueryAlerts(?)}";
	public static final String SP_PARTNER_RECENT_CHAT="{CALL usp_srp_getPartnerRecentChat(?,?)}";
	public static final String SP_PARTNER_LAST_LOGIN="{CALL usp_srp_getPartnerTopLogin(?)}";
	public static final String SP_PARTNER_EXE_TRACKER="{CALL usp_srp_PartnerExecutionTracker(?)}";
	public static final String SP_PARTNER_ENTITY="{CALL usp_srp_getPartnerEntitiesAccount(?)}";
	public static final String SP_PARTNER_EXECUTION="{CALL usp_srp_getPartnerExecution(?)}";
	public static final String SP_PARTNER_DATA_COLLECTION="{CALL usp_srp_getPartnerDataCollection(?)}";
	public static final String SP_TASK_DETAIL="{CALL usp_srp_getUsersPendingTaskdetails(?,?)}";
	public static final String SP_BROAD_NEWS="{CALL usp_cp_getBroadcastList(?,?)}";
	public static final String SP_ACTIVITY_TRACKER="{CALL usp_srp_getPartnerActivityTracker(?)}";
	public static final String SP_ACTIVITY_TYPE="{CALL usp_srp_getPartnerActivityType()}";
	public static final String SP_ACTIVITY_CONTEXT="{CALL usp_srp_getPartnerActivityContext()}";
	public static final String SP_ADD_ACTIVITY="{CALL usp_srp_addPartnerActivity(?,?,?,?,?,?,?,?,?)}";
	public static final String SP_ADD_CHAT="{CALL usp_srp_addRecentChat(?,?,?,?,?,?,?,?,?,?)}";
	public static final String SP_GET_ACTIVITY="{CALL usp_srp_getPartnerActivity(?)}";
	public static final String SP_PARTNER_BASED="{CALL usp_srp_getPartnerBasedType()}";
	public static final String SP_ADD_GUPSHUP="{CALL usp_srp_addGupShup(?,?,?,?,?,?,?,?)}";
  	public static final String SP_GUPSHUP_LIST="{CALL usp_srp_getGupShupList()}";
  	public static final String SP_ADD_GUPSHUP_LIKE="{CALL usp_srp_addGupShupLike(?,?,?,?,?)}";
 	public static final String SP_ADD_GUPSHUP_COMMENT="{CALL usp_srp_addPostComments(?,?,?,?,?)}";
 	public static final String SP_GET_GS_LIKE_COUNT="{CALL usp_srp_getGupShupCountLike(?)}";
 	public static final String SP_GET_GS_COMMENT_COUNT="{CALL usp_srp_getGupShupCountComment(?)}";
	public static final String SP_GET_GS_IS_LIKE="{CALL usp_srp_getGupShupIsLike(?,?)}";
	public static final String SP_GET_GS_EDIT="{CALL usp_srp_getGupShupEdit(?)}";
	public static final String SP_GET_GS_COMMENTS_LIST="{CALL usp_srp_getGupShupPostList(?)}";
	public static final String SP_GET_GS_LIKE_LIST="{CALL usp_srp_getGupShupLikeList(?)}";
	public static final String SP_GET_RATING_VALUES="{CALL usp_srp_RatingValues(?,?)}";	
	public static final String SP_SAVE_RATING_VALUES="{CALL usp_srp_savePartnerRating(?,?,?,?,?,?,?,?)}";	
	public static final String SP_GET_CURRUNT_RATING_REASON="{CALL usp_srp_getCurruntRatingNReason(?)}";	
	public static final String SP_GET_RATING_HISTORY="{CALL usp_srp_getRatingHistory(?)}";	
	public static final String SP_EXECTION_ENABLER="{CALL usp_srp_getExecutionEnabler(?)}";
	public static final String SP_RECOMMENDED_INSTRUMENT="{CALL usp_srp_getRecommendedInstrument(?,?)}";
	public static final String SP_AUTOPING_SCH_UPDATE="{CALL usp_srp_getAutopingUpdateScheduled(?)}";
 	
	
  	
	
	
	
	
	
	
     //team memeber allocation
	public static final String SP_GET_UNIQUEALLOCATION="{CALL usp_srp_getUniqueDepartmentAllocation(?,?,?)}";
	public static final String SP_ADDTEAMMEMBERALLOCATION="{CALL usp_srp_addTeamMemberAllocation(?,?,?,?,?,?)}";
	public static final String SP_UPDATEALLOCATIONLIST="{CALL usp_srp_updateAllocationTeamMember(?,?,?,?,?,?)}";     
	public static final String SP_DELETEALLOCATION="{CALL usp_srp_deleteAllocationdepartment(?,?)}";
	public static final String SP_GET_AVAILABLE_BIZ_UNIT_DEPARTMENT_LIST="{CALL usp_srp_getAvailableBizUnitDepartment()}";
	public static final String SP_GET_DEPARTMENTTYPE_BU="{CALL usp_srp_getDepartmentTypeonBizunit(?)}";
	
     
	public static final String SP_ADD_BULK_ALLOCATION="{CALL usp_srp_BulkAllocationTeamMember(?,?,?,?,?,?,?)}";
     
     
     
	//role access
	public static final String SP_GET_ALL_ROLE_ACCESS_LIST="{CALL usp_srp_getAllRoleAccessList(?,?,?)}";
	public static final String SP_GET_SOURCE_SYSTEM_LIST="{CALL usp_srp_getSourceSystemList()}";
	public static final String SP_UPDATE_ROLE_ACCESS_LIST="{CALL usp_srp_updateRoleAccessList(?,?,?,?)}"; 
	
     
    
	//PP role access 
	public static final String PP_GET_ALL_ROLE_ACCESS_LIST="{CALL usp_pp_getAllRoleAccessListByPartyId(?,?,?)}";
	public static final String PP_UPDATE_ROLE_ACCESS_LIST="{CALL usp_pp_updateRoleAccessListByPartyId(?,?,?,?)}"; 
    
	 
	//FiinfraConstants for Notify Template      Created By : Suvarna Jagadale  
	public static final String SP_GET_NOTIFYTEMPLATE_LIST = "{CALL usp_srp_getNotifyTemplate(?,?)}";
	public static final String SP_DELETE_NOTIFYTEMPLATE ="{CALL usp_srp_deleteNotifyTemplate(?,?)}";   
	public static final String SP_GET_TEMP_BIZ_UNIT="{CALL usp_srp_getPartyByPartyId(?,?,?)}";    
	public static final String SP_GET_SYSTEM_RECEPIENT_CHANNEL = "{CALL usp_srp_getCodeValuesByCodetypeId(?)}";  
	public static final String SP_ADD_NOTIFY_TEMPLATE = "{CALL usp_srp_addNotifyTemplate(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	public static final String SP_GET_EMAIL = "{CALL usp_srp_getCodeValueForEmail()}" ; 
	public static final String SP_GET_EMAILPHONE = "{CALL usp_srp_getCodeValueForPhone(?)}" ; 
	public static final String SP_GET_NAME = "{CALL usp_srp_getCodeValueForName()}";   
	public static final String SP_GET_EVENT = "{CALL usp_srp_getEventName()}";  
	public static final String SP_GET_XMLVALUES = "{CALL usp_srp_getXmlTemplate(?)}";
	public static final String SP_EDIT_NOTIFYTEMPLATE = "{CALL usp_srp_updateNotifyTemplate(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";  
	public static final String SP_VALIDATE_TEMPLATE = "{CALL usp_srp_validateTemplateBody(?)}";  
	public static final String SP_FTP_BASEPATH = "{CALL usp_srp_getUploadTxnBasePath(?,?)}";
	public static final String SP_IMPORT_NOTIFYTEMPLATE = "{CALL usp_srp_importNotifyTemplate(?,?)}";   
	 
	
	//PRODUCT 
	public static final String SP_GET_ASSET_CLASS_LIST = "{CALL usp_srp_getProductAssetList()}";
	public static final String SP_GET_ASSET_PRODUCT_TYPE_LIST = "{CALL usp_srp_getAssetProductTypeList(?)}";
	public static final String SP_GET_PRODUCT_MASTER_LIST = "{CALL usp_srp_getProductMasterList(?,?,?,?)}";
	public static final String SP_GET_PRODUCT_CATEGORY_LIST = "{CALL usp_srp_getAssetProductCategoryList(?)}";
	public static final String SP_INSERT_OR_UPDATE_PRODUCT="{CALL usp_srp_insertOrUpdateProduct(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	public static final String SP_GET_UNIQUE_CUSTODIAN_CODE = "{CALL usp_srp_checkCustodianCode(?,?)}";
	public static final String SP_GET_AMC_LIST = "{CALL usp_srp_ShowAMCName()}";
	//RTA operations
	public static final String SP_GET_UPLOAD_HISTORY = "{CALL usp_srp_getBulkUploadTxnHistory(?,?,?,?,?,?,?,?)}";
	public static final String SP_GET_UPLOAD_HISTORY_COUNT = "{CALL usp_srp_getBulkUploadTxnHistoryCount(?,?,?,?)}";
		public static final String SP_GET_PARTNER_PST_LIST = "{CALL usp_srp_getETPartnerList(?,?)}";      
		public static final String SP_GET_REQUEST_REPROCESS = "{CALL usp_srp_ReprocessTxn(?,?)}";
		public static final String SP_GET_BULK_REPROCESS = "{CALL usp_srp_bulkReprocessTrxn(?,?)}";  
		public static final String SP_GET_CODETYPEVALUES_BY_CODETYPEID = "{CALL usp_cp_getCodeValuesByCodeTypeId(?,?)}";  
		public static final String SP_GET_TXN_HISTORYDETAILS = "{CALL usp_srp_getBulkUploadTxnHistoryDetails(?,?)}"; 
		public static final String SP_GET_TXN_HISTORYERRORLOG = "{CALL usp_srp_getBulkUploadTxnHistoryErrorLog(?)}";   
		public static final String SP_GET_FILETYPE = "{CALL usp_cp_getCityList(?)}"; 	
		public static final String SP_UPLOAD_RTAFILES = "{CALL usp_srp_addbulkUploadTxn(?,?,?)}"; 	
		public static final String SP_UNIQUE_BASEPATH = "{CALL usp_srp_getUploadTxnBasePath(?)}";   
		
	//premium master
	public static final String SP_GET_PREMIUM_MASTER_LIST = "{CALL usp_srp_getPremiumMasterList(?,?)}";
	public static final String SP_INSERT_OR_UPDATE_PREMIUM_MASTER="{CALL usp_srp_insertOrUpdatePremiumMaster(?,?,?,?,?,?,?,?,?,?,?)}";
	public static final String SP_CHECK_PREMIUM_MASTER_AGE_RANGE = "{CALL usp_srp_checkPremiumMasterAgeRange(?,?)}";
	 
	//price history
	public static final String SP_GET_PRODUCT_PRICE_HISTORY_LIST = "{CALL usp_srp_getProductPriceHistoryList(?,?)}";
	public static final String SP_INSERT_OR_UPDATE_PRODUCT_PRICE="{CALL usp_srp_insertOrUpdateProductPrice(?,?,?,?,?)}";
	public static final String SP_CHECK_PRICE_VALUE_FOR_DATE = "{CALL usp_srp_checkProductPriceValueForDate(?,?)}";
	
	//product revenue
	public static final String SP_GET_PRODUCT_REVENUE_LIST = "{CALL usp_srp_getProductRevenueBookList(?,?)}";
	public static final String SP_INSERT_OR_UPDATE_PRODUCT_REVENUE = "{CALL usp_srp_insertOrUpdateProductRevenue(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	public static final String SP_GET_RECORD_TYPE_LIST = "{CALL usp_srp_getRecordTypeList(?,?)}";
	public static final String SP_GET_RECORD_LIST = "{CALL usp_srp_getRecordType()}";
	public static final String SP_CHECK_PRODUCT_REVENUE_AMOUNT_RANGE = "{CALL usp_srp_checkProductRevenueRange(?,?,?)}";
	public static final String SP_CHECK_PRODUCT_REVENUE_YEAR_RANGE = "{CALL usp_srp_checkProductRevenueAgeRange(?,?,?)}";
	public static final String SP_GET_PRODUCT_CATEGORY_REVENUE_LIST = "{CALL usp_srp_getProductCategoryRevenueList(?)}";
	public static final String SP_CHECK_PRODUCT_CATEGORY_REVENUE = "{CALL usp_srp_checkProductCategoryRevenue(?,?,?)}";
	public static final String SP_INSERT_OR_UPDATE_PRODUCT_CATEGORY_REVENUE = "{CALL usp_srp_insertOrUpdateProductCategoryRev(?,?,?,?,?,?,?,?,?,?,?,?)}";
	/* BU ids for different BU's */	
	public static final Integer SHUBHCHINTAK = 27827;
	public static final Integer FIINFRA = 27828;
	public static final Integer SPA = 27829;
	public static final Integer DFDA = 27830;
	public static final Integer VISTA = 460355;
	public static final Integer WAY_To_WEALTH = 509597;
	public static final Integer ESSEL = 457481;
	public static final Integer BDF = 382013;
	public static final Integer FGP = 508812;
	
		public static final String SP_GET_EXECUTION_TRACK_DETAIL="{CALL usp_srp_getAvailablePrePrintedForms(?,?)}";
	
	
//Profile Password
		public static final String SP_GETPROFILE_PWD="{CALL usp_srp_checkOldpassword(?,?)}";
		public static final String SP_UPDATE_PROFILE_PWD="{CALL usp_srp_changePasswordManualy(?,?)}";	
		public static final String SP_GET_PROFILE="{CALL usp_srp_getUserProfile(?)}";
		public static final String SP_UPDATE_PROFILE="{CALL usp_srp_updateUserProfile(?,?,?,?,?,?,?,?,?)}";
		// below constants for FP Section -Ketan



		
		
		
		//task
		
		public static final String SP_GET_TASK_ASSIGN="{CALL usp_srp_getTaskAssignTo(?,?)}";
		public static final String SP_GET_PARNTER_FOR_TASK="{CALL usp_srp_getPesronToAssignTAsk(?,?,?,?,?)}";
		public static final String SP_GET_TASK_DETAIL="{CALL usp_srp_getTaskDetail(?)}";
		public static final String SP_GET_TASK_LIST="{CALL usp_DIY_getTasksOriginatedByPartyID(?,?,?,?,?,?,?,?,?)}";
		public static final String SP_GET_TASK_ALERT="{CALL usp_srp_getTask_Alert(?)}";
		public static final String SP_DELETE_TASK_SP ="{CALL usp_srp_deleteTask(?,?)}";
		public static final String SP_GET_TASK_ALERT_BEFORE_ONE_DAY="{CALL usp_srp_getTask_Alert_BeforeOneDay(?)}";
		
		
	    public static final Integer EMERGENCY =39001;
	    public static final Integer CASH_FLOW =39002;
	    public static final Integer RISK_COVER =39003;
	    public static final Integer GOAL_READINESS =39005;
	    public static final Integer RETIREMENT =39006; 
	    public static final Integer SUCCESSION_READINESS =39007;
	    public static final Integer LOAN_STATUS =39008;
	    public static final Integer RISK_PROFILE =39009;	
	    
	    
	 public static final Integer SEND_ATTACHMENT_EMAIL = 393;   

	    public static final String SUBX_SOURCE_MODULE_SUBSCRIPTION="Subscription";
	    public static final int SUBX_AUDIT_ID=97019;
	    
	    //product Manufacturer
	    public static final String SP_GET_PRODUCT_MFG_LIST = "{CALL usp_srp_getProductMfgList(?,?)}";
	    public static final String SP_INSERT_OR_UPDATE_PRODUCT_MFG = "{CALL usp_srp_insertOrUpdateProductMfg(?,?,?,?,?)}";
	    public static final String SP_GET_PRODUCT_MFG_TYPE_LIST = "{CALL usp_srp_getProductMfgTypeList()}";
	    
	    
	  //constants for audit
	    public static final String SRP_SOURCE_MODULE_BROADCAST = "Service Portal Broadcast Module";
	    public static final String SRP_ADD_BROADCAST = "Add Broadcast";
	    public static final String SRP_EDIT_BROADCAST = "Edit Broadcast";
	    public static final String SRP_DELETE_BROADCAST = "Delete Broadcast";
	    
	    public static final String SRP_SOURCE_MODULE_SERVICE_TEAM = "Service Portal Service Team Member";
	    public static final String SRP_ADD_SERVICE_TEAM = "Add Service Team Member";
	    public static final String SRP_EDIT_SERVICE_TEAM = "Edit Service Team Member";
	    public static final String SRP_DELETE_SERVICE_TEAM = "Delete Service Team Member";
	    public static final String SRP_BULK_ALLOCATE_SERVICE_TEAM = "Bulk Allocation For Service Team Member";
	    public static final String SRP_ADD_SERVICE_TEAM_MEMBER_ALLOCATION = "Add Service Team Member Allocation";
	    public static final String SRP_EDIT_SERVICE_TEAM_MEMBER_ALLOCATION = "Edit Service Team Member Allocation";
	    public static final String SRP_DELETE_SERVICE_TEAM_MEMBER_ALLOCATION = "Delete Service Team Member Allocation";
	    
	    public static final String SRP_SOURCE_MODULE_ROLE = "Service Portal Role Module";
	    public static final String SRP_ADD_ROLE = "Add Role";
	    public static final String SRP_EDIT_ROLE = "Edit Role";
	    public static final String SRP_DELETE_ROLE = "Delete Role";
	    public static final String SRP_EDIT_ROLE_ACCESS_LIST = "Edit Role Access List";
	    
	    public static final Integer SRP_ADD_ROLE_EVENT_ID =97168;
	    public static final Integer SRP_EDIT_ROLE_EVENT_ID = 97169;
	    public static final Integer SRP_DELETE_ROLE_EVENT_ID =97170;
	    
	

	    
	    
	    public static final String SRP_SOURCE_MODULE_PRODUCT = "Service Portal Product Module";
	    public static final String SRP_ADD_PRODUCT = "Add Product";
	    public static final String SRP_EDIT_PRODUCT = "Edit Product";
	    public static final String SRP_DELETE_PRODUCT = "Delete Product";
	    
	    public static final String SRP_ADD_PRODUCT_PRICE = "Add Product Price";
	    public static final String SRP_EDIT_PRODUCT_PRICE = "Edit Product Price";
	    public static final String SRP_DELETE_PRODUCT_PRICE = "Delete Product Price";
	    
	    public static final String SRP_ADD_PRODUCT_REVENUE_MASTER = "Add Product Revenue Master";
	    public static final String SRP_EDIT_PRODUCT_REVENUE_MASTER = "Edit Product Revenue Master";
	    public static final String SRP_DELETE_PRODUCT_REVENUE_MASTER = "Delete Product Revenue Master";
	    
	    public static final String SRP_ADD_PRODUCT_PREMIUM_MASTER = "Add Product Premium Master";
	    public static final String SRP_EDIT_PRODUCT_PREMIUM_MASTER = "Edit Product Premium Master";
	    public static final String SRP_DELETE_PRODUCT_PREMIUM_MASTER = "Delete Product Premium Master";

	    public static final String SRP_SOURCE_MODULE_PRODUCT_CATEGORY = "Service Portal Product Category Revenue Module";
	    public static final String SRP_ADD_PRODUCT_CATEGORY = "Add Product Category Revenue";
	    public static final String SRP_EDIT_PRODUCT_CATEGORY = "Edit Product Category Revenue";
	    public static final String SRP_DELETE_PRODUCT_CATEGORY = "Delete Product Category Revenue";
	    
	    public static final String SRP_SOURCE_MODULE_PRODUCT_MFG = "Service Portal Product Manufacturer Module";
	    public static final String SRP_ADD_PRODUCT_MFG = "Add Product Manufacturer";
	    public static final String SRP_EDIT_PRODUCT_MFG = "Edit Product Manufacturer";
	    public static final String SRP_DELETE_PRODUCT_MFG = "Delete Product Manufacturer";
	    public static final String PP_SOURCE_MODULE_TASK = "Partner Portal Task Module";
	    public static final String SRP_SOURCE_MODULE_TASK = "Service Portal Task Module";
	    public static final String SRP_ADD_TASK = "Add Task";
	    public static final String SRP_EDIT_TASK = "Edit Task";
	    public static final String SRP_DELETE_TASK = "Delete Task";
	    
	    public static final Integer SRP_ADD_TASK_EVENT_ID = 97159;
	    public static final Integer SRP_EDIT_TASK_EVENT_ID = 97160;
	    public static final Integer SRP_DELETE_TASK_EVENT_ID =97161;
	    public static final Integer SRP_CHANGE_PASSWORD =97198;
	    public static final Integer SRP_CHANGE_PROFILE =97199;
	    public static final String SRP_SOURCE_MODULE_SELF = "Service Portal Profile Module";
	    
	    
	    public static final int SPA_ADD_CLIENT_ID  = 97219;
	    public static final String SPA_ADD_CLIENT="Add institutional client";
	    
	    public static final int SPA_EDIT_CLIENT_ID  = 97220;
	    public static final String SPA_EDIT_CLIENT="Edit institutional client";
	    
	    public static final int SPA_UPLOAD_DOCUMENT_ID = 97221;
	    public static final String SPA_UPLOAD_DOCUMENT="Upload Document";
	    
	    public static final String SP_SWITCH_PARTNER = "{CALL usp_srp_switchPartnerBu(?,?,?,?,?,?,?)}";
	    public static final String SP_GET_LIST_FOR_CHANGE = "{CALL usp_srp_getPartnerListToswitchClienOrOpp(?,?,?)}";
	    public static final String SP_SWITCH_PARTNER_FOR_CLIENT_OPPORTUNITY = "{CALL usp_srp_switchClientOrOpportunity(?,?)}";
	    public static final String SP_GET_ONBOARD_CHECKLIST = "{CALL usp_srp_getOnboardChecklist1(?)}";
	    
	    
	    public static final String SRP_SOURCE_MODULE_TESTIMONIAL = "Service Portal Testimonial Module";
	    public static final String SRP_ADD_TESTIMONIAL = "Add Testimonial";
	    public static final String SRP_EDIT_TESTIMONIAL = "Edit Testimonial";
	    public static final String SRP_DELETE_TESTIMONIAL = "Delete Testimonial";
	    
	    public static final Integer SRP_ADD_TESTIMONIAL_EVENT_ID = 97141;
	    public static final Integer SRP_EDIT_TESTIMONIAL_EVENT_ID = 97142;
	    public static final Integer SRP_DELETE_TESTIMONIAL_EVENT_ID =97143;
	    

	    public static final String SRP_SOURCE_MODULE_DOWNLOAD = "Service Portal Download Module";
	    public static final String SRP_ADD_DOWNLOAD = "Add Download";
	    public static final String SRP_EDIT_DOWNLOAD = "Edit Download";
	    public static final String SRP_DELETE_DOWNLOAD = "Delete Download";
	    
	    public static final Integer SRP_ADD_DOWNLOAD_EVENT_ID = 97138;
	    public static final Integer SRP_EDIT_DOWNLOAD_EVENT_ID = 97139;
	    public static final Integer SRP_DELETE_DOWNLOAD_EVENT_ID =97140;
	    
	    //User
	    public static final String SRP_SOURCE_MODULE_USER = "Service Portal User Module";
	    public static final String SRP_ADD_USER = "Add User";
	    public static final String SRP_EDIT_USER = "Edit User";
	    public static final String SRP_DELETE_USER = "Delete User";
	    public static final String SRP_LOGINONBEHALF_USER = "Login on Behalf User";
	    
	    public static final Integer SRP_ADD_USER_EVENT_ID = 97120;
	    public static final Integer SRP_EDIT_USER_EVENT_ID = 97121;
	    public static final Integer SRP_DELETE_USER_EVENT_ID = 97122;
	    public static final Integer SRP_LOGINONBEHALF_USER_EVENT_ID = 97123; 
	    
	    //CodeType
	    public static final String SRP_SOURCE_MODULE_CODETYPE = "Service Portal CodeType Module";
	    public static final String SRP_ADD_CODETYPE = "Add CodeType";
	    public static final String SRP_EDIT_CODETYPE = "Edit CodeType";
	    public static final String SRP_DELETE_CODETYPE = "Delete CodeType";
	    
	    public static final Integer SRP_ADD_CODETYPE_EVENT_ID = 97124;
	    public static final Integer SRP_EDIT_CODETYPE_EVENT_ID = 97125;
	    public static final Integer SRP_DELETE_CODETYPE_EVENT_ID = 97126;

	    //CodeValue
	    public static final String SRP_SOURCE_MODULE_CODEVALUE = "Service Portal CodeValue Module";
	    public static final String SRP_ADD_CODEVALUE = "Add CodeValue";
	    public static final String SRP_EDIT_CODEVALUE = "Edit CodeValue";
	    public static final String SRP_DELETE_CODEVALUE = "Delete CodeValue";

	    public static final Integer SRP_ADD_CODEVALUE_EVENT_ID = 97127;
	    public static final Integer SRP_EDIT_CODEVALUE_EVENT_ID = 97128;
	    public static final Integer SRP_DELETE_CODEVALUE_EVENT_ID = 97129;
	    
	    
	    //Ping Module SRP
	    public static final String SRP_SOURCE_MODULE_PING = "Service Portal Ping Module";
	    public static final String SRP_ADD_PING = "Add Ping";
	    public static final String SRP_EDIT_PING = "Edit Ping";
	    public static final String SRP_DELETE_PING = "Delete Ping";
	    
	    public static final Integer SRP_ADD_PING_EVENT_ID = 97200;
	    public static final Integer SRP_EDIT_PING_EVENT_ID = 97201;
	    public static final Integer SRP_DELETE_PING_EVENT_ID = 97202;
	    
	    
	    //Auto Ping Module SRP
	    public static final String SRP_SOURCE_MODULE_AUTOPING = "Service Portal Auto Ping Module";
	    public static final String SRP_ADD_AUTOPING = "Add AutoPing";
	    public static final String SRP_EDIT_AUTOPING = "Edit AutoPing";
	    public static final String SRP_DELETE_AUTOPING = "Delete Ping";
	    
	    public static final Integer SRP_ADD_AUTOPING_EVENT_ID = 97203;
	    public static final Integer SRP_EDIT_AUTOPING_EVENT_ID = 97204;
	    public static final Integer SRP_DELETE_AUTOPING_EVENT_ID = 97205;
	  
	    

		public static final String REPORT_SSRS_URL = "http://202.87.46.144/ReportServer/Pages/ReportViewer.aspx?%2fFIINFRA-Reports%2f";

		public static final Integer BASIC_PARTNER = 81173;
	    public static final Integer ADVANCED_PARTNER = 81174;
	    public static final Integer GOLDEN_PARTNER = 81175;

	    public static final Integer BASIC_PLAN = 522001;
	    public static final Integer DETAILED_PLAN = 522002;	    
	    
		 public static final String SRP_SOURCE_MODULE_DEPARTMENT = "Service Portal Department Module";
		 public static final String SRP_ADD_DEPARTMENT = "Add Department";
		 public static final String SRP_EDIT_DEPARTMENT = "Edit Department";
		 public static final String SRP_DELETE_DEPARTMENT = "Delete Department";

		 public static final String SRP_SOURCE_MODULE_NOTIFYEVENT = "Service Portal Notify Event Module";
		 public static final String SRP_ADD_NOTIFYEVENT = "Add Notify Event";
		 public static final String SRP_EDIT_NOTIFYEVENT = "Edit Notify Event";
		 public static final String SRP_DELETE_NOTIFYEVENT = "Delete Notify Event";

		 public static final String SRP_SOURCE_MODULE_NOTIFYTEMPLATE = "Service Portal Notify Template Module";
		 public static final String SRP_ADD_NOTIFYTEMPLATE = "Add Notify Template";
		 public static final String SRP_EDIT_NOTIFYTEMPLATE = "Edit Notify Template";
		 public static final String SRP_DELETE_NOTIFYTEMPLATE = "Delete Notify Template"; 

	public static final String SRP_SOURCE_MODULE_RTAFILE = "Service Portal RTA File Upload Module";
	public static final String SRP_BULK_REPROCESS_RTAFILE = "Bulk Reprocess";
	public static final String SRP_INDIVIDUAL_REPROCESS_RTAFILE = "Individual Reprocess";
	public static final String SRP_UPLOAD_RTAFILE = "Upload RTA File";
	public static final String SRP_DOWNLOAD_RTAFILE = "Download RTA File";
	public static final String SRP_SOURCE_MODULE_FAQ = "Service Portal Faq Module";
	public static final String SRP_ADD_FAQ = "Add Faq";
	public static final String SRP_EDIT_FAQ = "Edit Faq";
	public static final String SRP_DELETE_FAQ = "Delete Faq";

		 public static final Integer SRP_ADD_FAQ_EVENT_ID = 97144;
		 public static final Integer SRP_EDIT_FAQ_EVENT_ID = 97145;
		 public static final Integer SRP_DELETE_FAQ_EVENT_ID =97146;


		 public static final String SRP_SOURCE_MODULE_BIZUNIT = "Service Portal Biz Unit Module";
		 public static final String SRP_ADD_BIZUNIT = "Add Biz Unit";
		 public static final String SRP_UPDATE_BIZUNIT = "Edit Biz Unit";
		 public static final String SRP_DELETE_BIZUNIT = "Delete Biz Unit";
		 public static final String SRP_COPY_BIZUNIT = "Copy Biz Unit";

		 public static final Integer SRP_ADD_BIZUNIT_EVENT_ID = 97147;
		 public static final Integer SRP_UPDATE_BIZUNIT_EVENT_ID = 97148;
		 public static final Integer SRP_DELETE_BIZUNIT_EVENT_ID =97149;
		 public static final Integer SRP_COPY_BIZUNIT_EVENT_ID =97150;

		 public static final String SRP_ADD_CALL_TRACKER="Add Call tracker";
		 public static final String SRP_EDIT_CALL_TRACKER="Edit Call tracker";

		public static final String SP_GET_APPLICANT_DETAILS_LIST = "{CALL usp_pp_getApplicantNames(?,?)}";   
		public static final String SP_GET_CLIENT_DETAILS_LIST = "{CALL usp_pp_getClientDetailsForApprovelEmail(?)}";

		 public static final Integer SRP_ADD_BU_SETTING_EVENT_ID = 97156;
		 public static final Integer SRP_EDIT_BU_SETTING_EVENT_ID = 97157;
		 public static final Integer SRP_DELETE_BU_SETTING_EVENT_ID =97158;

		// public static final String SRP_SOURCE_MODULE_BIZUNIT = "Service Portal Biz Unit Module";
		 public static final String SRP_ADD_BU_SETTING = "Add Biz Unit Setting";
		 public static final String SRP_UPDATE_BU_SETTING = "Edit Biz Unit Setting";
		 public static final String SRP_DELETE_BU_SETTING = "Delete Biz Unit Setting";


		 public static final Integer SRP_ADD_BU_EMAIL_EVENT_ID = 97151;
		 public static final Integer SRP_ADD_BU_EMAIL_SIGNATURE_EVENT_ID = 97152;
		 public static final Integer SRP_ADD_BU_SMS_BULOGO_EVENT_ID =97153;
		 public static final Integer SRP_ADD_BU_DNDTEMPLATE_EVENT_ID = 97154;
		 public static final Integer SRP_ADD_BU_DISCLAIMER_EVENT_ID = 97155;

		 public static final String SRP_ADD_BU_EMAIL= "Add or update BU Email";
		 public static final String SRP_ADD_BU_EMAIL_SIGNATURE = "Add or update BU Email Signature";
		 public static final String SRP_ADD_BU_SMS_BULOGO="Add or update BU SMS Signature or Logo";
		 public static final String SRP_ADD_BU_DNDTEMPLATE= "Add or update BU DNDTemplate";
		 public static final String SRP_ADD_BU_DISCLAIMER= "Add or update BU Disclaimer";

		public static final String SP_GET_GENERAL_SEARCH = "{CALL usp_srp_searchObjectsByParty(?,?,?) }"; 
		//AutoPing
		public static final String SP_AUTOPING_LIST="{CALL usp_srp_getAutoPingList()}";
		public static final String SP_SELECT_EVENT_LIST="{CALL usp_srp_getAutoPingEvent(?)}";
		public static final String SP_ADD_AUTOPING="{CALL usp_srp_saveAutoPing(?,?,?,?,?,?,?,?,?,?,?,?)}";
		public static final String SP_AUTOPING_EDIT_LIST="{CALL usp_srp_getAutoPingDetail(?,?)}";
		public static final String SP_ADD_AUTOPING_EVENT="{CALL usp_srp_addAutoPingEvent(?,?,?,?,?,?)}";
		public static final String SP_AUTOPING_EVENT_LIST="{CALL usp_srp_getAutopingEventList()}";
		public static final String SP_AUTOPING_SCH_LIST="{CALL usp_srp_getAutopingScheduled()}";
		public static final String SP_EVENT_LIST="{CALL usp_srp_AutopingEvent(?)}";
		public static final String SP_SCH_AUTOPING="{CALL usp_batch_insertrecipientforautoPing(?,?,?,?,?,?,?)}";
		
		
		public static final String SP_GET_HEIRARCHY_USER="{CALL usp_srp_getHeirarchyUser(?,?)}";
		public static final String SP_ADD_HEIRARCHY_USER="{CALL usp_srp_addHeirarchyUser(?,?,?)}";
		
		
		public static final String BU_ID = "buId";



		 public static String SP_USP_GET_PREPRINTED_FORM = "{CALL usp_SRP_getAllAvailablePrePrintedForms(?,?)}";
		 public static String SP_USP_GET_PREPRINTED_FORM_CHART = "{CALL usp_srp_getChartListForPrePrintedForm(?,?)}";
		 
	 //quartz
		 public static String SP_GET_QUARTZ_LIST = "{CALL usp_srp_QuartzJobList()}";

		 
		 
		 //DC Colletral

		 public static final String SP_ADD_DC_COLLETRAL="{CALL usp_srp_addDCCollateral(?,?,?,?,?,?,?,?,?)}";
		 public static final String SP_GET_DC_COLLETRAL="{CALL usp_srp_getDCCollateralList(?)}";
		 public static final String SP_DELETE_DC_COLLETRAL="{CALL usp_srp_deleteDocTODownload(?)}";

		 
		 //Document
		 public static final String SP_COMMON_INSERT_OR_UPDATE_DOCUMENT="{CALL usp_util_insertorupdatedocument(?,?,?,?,?,?,?,?,?,?,?,?,?)}";

		 
		 //RM List
		 public static final String SP_GET_RM_LIST="{CALL usp_srp_getRMList(?,?,?)}";
		 public static final String SP_GET_MULTISELECT="{CALL usp_srp_getValueForMulptipleParentId(?)}";
		 public static final String PP_SOURCE_MODULE_ROLE = "Partner Portal Role Module";
		 public static final String PP_EDIT_ROLE_ACCESS_LIST = "Save Role Access List";

	//PST List
	public static final String SP_GET_PST_CALL_TRACKER_LIST = "{CALL usp_srp_getPSTcalltrackerList(?,?,?)}";
	
		public static final String SP_RETRIVE_USER_DETAILS="{CALL usp_srp_getUserDetailsForHierachy(?,?)}";
		public static final String SP_SET_USER_SESSION="{CALL usp_srp_getHeirarchyChangeNode(?,?)}";
		public static final String SP_UPDATE_CURRENT_NODEID_FORPARTYID="{CALL usp_srp_updateNodeId(?,?,?)}";
		public static final String SP_DELETE_USER_HIERARCHY="{CALL usp_srp_deleteUserHierarchy(?,?)}";
		
		
		

		 public static final String SRP_SOURCE_MODULE_HEIRARCHY = "Service Portal Faq Module";
		 public static final String SRP_ADD_LOCATION = "Add Location";
		 public static final String SRP_CHANGE_PARENT_NODEID = "Change Parent Node Id ";
		 public static final String SRP_ADD_USER_HEIRARCHY = "Add User in Heirarachy";

		 public static final Integer SRP_ADD_LOCATION_EVENT_ID = 97214;
		 public static final Integer SRP_CHANGE_PARENT_NODEID_ID = 97215;
		 public static final Integer SRP_ADD_USER_HEIRARCHY_ID =97213;

		 
			// OPP Dashboard
			public static final String SP_OPP_EXECUTION_TRACKER_DATA = "{CALL usp_srp_getOppExecutionTrackerList(?,?,?,?,?)}";
			public static final String SP_OPP_PING_DATA = "{CALL usp_srp_getOppPingList(?,?,?,?,?)}";
			public static final String SP_OPP_TASK_DATA = "{CALL usp_srp_getOppTaskList(?,?,?,?,?)}";
			public static final String SP_OPP_DOCUMENT_DATA = "{CALL usp_srp_getOppDocumentList(?,?,?,?,?)}";
			public static final String SP_OPP_TEAM_MEMBER_DATA = "{CALL usp_srp_getOppTeammemberList(?,?,?,?,?)}";
			public static final String SP_OPP_CALL_TRACKER_DATA = "{CALL usp_srp_getOppCallTrackerList(?,?,?,?,?)}";
			public static final String SP_OPP_QUERY_DATA = "{CALL usp_srp_getOppQueryList(?,?,?,?,?)}";
			public static final String SP_OPP_NOTE_DATA = "{CALL usp_srp_getOppNoteList(?,?,?,?,?)}";
			public static final String SP_OPP_CHAT_DATA = "{CALL usp_srp_getOppChatList(?,?,?,?,?)}";
			public static final String SP_OPP_INT_PRODUCT_DATA = "{CALL usp_srp_getOppInterestedproductList(?,?,?,?,?)}";
			public static final String SP_OPP_INT_RATING_REASON = "{CALL usp_srp_getOppCurruntRatingNReason(?,?,?,?,?)}";
			public static final String SP_OPP_INT_RATING_LIST = "{CALL usp_srp_getOppRatingHistory(?,?,?,?,?)}";
			public static final String SP_OPP_INT_RATING_VALUES = "{CALL usp_srp_getOppRatingValues(?,?,?,?,?,?)}";
			public static final String SP_ADD_OPP_CALL_TRACKER = "{CALL usp_srp_addOpportunityCallTracker(?,?,?,?,?,?,?,?)}";
			public static final String SP_ADD_OPP_RATING_REASON = "{CALL usp_srp_saveOpportunityRating(?,?,?,?,?,?)}";
			public static final String SP_OPP_DEATILS = "{CALL usp_srp_getOppDeatils(?,?,?,?,?)}";
			public static final String SP_ADD_OPP_CHAT = "{CALL usp_srp_addOppChat(?,?,?,?,?,?,?,?,?,?)}";
			public static final String SP_ADD_OPP_TRACKER = "{CALL usp_srp_saveOpportunityTracker(?,?,?,?,?)}";
		 
		 
		 
		 public static final int CLIENT_PORTFOLIO_ADD=97216;
		 public static final int CLIENT_PORTFOLIO_UPDATE=97217;
		 public static final int CLIENT_PORTFOLIO_DELETE=97218;

		 
		 
		 
	public static String SP_USP_GET_QUERY = "{CALL usp_srp_getQueryList(?,?,?)}";
	public static String SP_USP_GET_CLIENT_LIST = "{CALL usp_srp_getClientList(?,?,?)}";
	public static String SP_USP_ADD_QUERY = "{CALL usp_srp_insertQuery(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	public static String SP_USP_DELETE_QUERY = "{CALL usp_srp_deleteQuery(?,?,?,?)}";
	public static String SP_GET_QUERY_DETAIL = "{CALL usp_srp_getQueryDetail(?)}";
	public static String SP_USP_ADD_BULK_ALLOCATION = "{CALL usp_srp_AddBulkAllocationForQuery(?,?,?,?,?,?)}";
	public static String SP_USP_GET_QUERY_HISTORY = "{CALL usp_srp_getQueryHistory(?,?,?,?)}";
	 public static String SP_USP_ADD_QUERY_ESCALATION = "{CALL usp_srp_getAddQueryEscalation(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	 public static Integer SP_USP_QUERY_ESCALATION = 527001;
	 public static String SP_USP_GEY_QUERY_ESCALATION = "{CALL usp_srp_getEscalationDetailForQuery(?,?,?,?,?,?)}";
	 public static String SP_USP_GET_ROLE_ESCALATION = "{CALL usp_srp_getEscalationRole(?,?,?,?)}";
	 public static String SP_USP_GET_ESCALATION_DETAIL = "{CALL usp_srp_getEscalationDetail(?,?,?,?,?,?)}";
	 public static String SP_USP_DELETE_ESCALATION = "{CALL usp_srp_getDeleteEscalation(?,?,?)}";
	

	public static final String SRP_SOURCE_MODULE_QUERY = "Service Portal Query Module";
	public static final Integer SRP_ADD_QUERY_EVENT_ID = 97223;
	public static final Integer SRP_EDIT_QUERY_EVENT_ID = 97224;
	public static final Integer SRP_DELETE_QUERY_EVENT_ID = 97225;
	public static final Integer SRP_BULK_ALLCATE_QUERY_EVENT_ID = 97226;
	
	

	
	public static final String SRP_SOURCE_MODULE_ESCALATION= "Service Portal Escalation Module";
	public static final Integer SRP_ADD_ESCALATION_EVENT_ID = 97227;
	public static final Integer SRP_DELETE_ESCALATION_EVENT_ID = 97228;
	
	
	
	
	public static final String SRP_ADD_QUERY = "Add Query Sp";
	public static final String SRP_EDIT_QUERY = "Edit Query Sp";
	public static final String SRP_DELETE_QUERY = "Delete Query Sp";
	public static final String SRP_BULK_ALLCATE_QUERY = "Bulk Allocation Query Sp";
	
	
	public static final String SRP_ADD_ESCALATION_QUERY = "Add Escalation Query Sp";
	public static final String SRP_DELETE_ESCALATION = "Delete Escalation Query Sp";
	

	///Add Institutional user
	public static final String SP_GET_ALL_INSTITUTIONAL_USER_LIST="{CALL usp_spa_getInstitutoialUser(?,?,?,?,?)}";
	public static final String SP_ADD_INSTITUTIONAL_USER="{CALL usp_spa_addUser(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}"; 	
	
	public static final String SP_NEW_REGIONAL_MANAGER_CREATION="{CALL usp_SPA_newRegionalManagerCreation(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}"; 
	
	public static final String SP_RM_AND_SR_RM_CREATION="{CALL usp_SPA_rmAndSrRmCreation(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}"; 
	
	//public static final String SP_DELETE_INSTITUTIONAL_USER="{CALL usp_sep_deleteUser(?,?,?,?)}";
	//public static final String SP_GET_UNIQUE_INSTITUTIONAL_USERNAME="{CALL usp_sep_getUniqueBizUnit(?)}";
	public static final String SP_GET_INSTITUTIONAL_ROLE_LIST="{CALL usp_spa_getRoleList(?,?,?)}";
	public static final String SP_ADD_TREASURY_MANAGER="{CALL usp_srp_spa_addEditTreasuryManager(?,?,?,?,?,?,?,?,?,?,?,?)}";
	public static final String SP_GET_INSTITUTIONAL_CLIENTS="{CALL usp_spa_getClientNameforRm(?,?,?,?,?)}";
	public static final String SP_GET_INSTITUTIONAL_TREASURY_MANAGER="{CALL usp_srp_getTreasuryManager(?,?,?,?,?,?)}";
	public static final String SP_DELETE_TREASURY_MANAGER="{CALL usp_srp_deleteTreasuryManager(?,?)}";	
	
	
	//Document Category
	public static final Integer SPA_GET_LIST_OF_DOCUMENT_CATEGOTRY = 97229;
	public static final Integer SPA_GET_DOCUMENT_CATEGOTRY_FOR_GIVEN_ID = 97230;
	public static final Integer SPA_GET_DOCUMENT_CATEGOTRY_BY_AUTO_COMPLETE = 97231;
	public static final Integer SPA_INSERT_OR_UPDATE_DOCUMENT_CATEGOTRY = 97232;
	public static String SPA_GET_PREPRINTED_FORM = "{CALL usp_SPA_getAllAvailablePrePrintedForms(?,?,?,?,?,?,?)}";
	
	public static String SPA_GET_CLIENT_DETAIL = "{CALL usp_SPA_getIntitutionalClientDetail(?,?,?)}";
	
	
	

	public static String SPA_CHECK_PASSWORD_CORRECT = "{CALL usp_SPA_isPasswordCorrect(?,?,?)}";
	
	public static String SPA_MANAGE_CONTACT_DETAILS = "{CALL usp_SPA_manageContactDetails(?,?,?,?,?,?,?)}";
	
	public static String SPA_CHANGE_PASSWORD = "{CALL usp_cp_updatePassword(?,?,?,?,?)}";
	
	public static String SPA_MANAGE_CONTACT_SCREEN= "SPA Portal Manage Update User ProFile";
	
	 public static final String SPA_SOURCE_MODULE_MANAGE_CONTACT_DETAILS = "SPA Portal Manage Contact Details";
	
	
	 public static String SPA_CHANGE_PASSWORD_SCREEN= "SPA Portal Update Password";
		
	 public static final String SPA_SOURCE_MODULE_CHANGE_PASSWORD = "SPA Portal Change Password";
	
	 public static String SPA_IS_PAN_NO_EXISTS = "{CALL usp_SPA_isPanNoExits(?,?,?)}";
	 
	 public static String SPA_DELETE_INSTITUTIONAL_CLIENT = "{CALL usp_spa_deleteInstitutionalRm(?,?,?,?,?,?)}";
	 
	 public static String 	 SPA_APPROVE_OR_REJECT_CLIENT=	 "{CALL usp_spa_approveorRejectClient(?,?,?,?)}";
	 
	 
	 public static String 	 SPA_APPROVE_TM_CHANGE_PASSWORD=	 "{CALL usp_spa_approveTmChangePassword(?,?,?,?)}";
	 

	 
	 
	 
	 public static final String SRP_APPROVE_CLIENT = "Approve or Reject Client ";
	 public static final String SRP_SOURCE_MODULE_APPROVE_CLIENT = "Approve or Client Module";
	 public static final int SRP_APPROVE_CLIENT_EVENT_ID =97222;
	 
	 public static final String SRP_SPA_DELETE_RM = "Approve or Reject Client ";
	 public static final String SRP_SOURCE_MODULE_SPA_RM = "Approve or Client Module";
	 public static final int SRP_SPA_DELETE_RM_EVENT_ID =97223;
	 
	 public static String 	 SPA_ADD_TICKER=	 "{CALL usp_spa_addTicker(?,?,?,?)}";
	 
	 
	 /*for report delivery history*/
	 public static String SP_USP_getreport_deliveryhistory = "{CALL usp_srp_getreportdeliveryhistory(?)}";

	 public static String SP_COMMON_GET__COUNT_UNVIEWED_DOCUMENT ="{CALL usp_srp_getDocumentCount(?,?)}";
	 public static String SP_COMMON_UPDATE_DOCUMENT_COUNT ="{CALL usp_srp_updateDocumentCount(?,?,?,?)}";
	 
//-----------------------------------------------------------------------------------------------------------------------------------------
	//FIINFRA CONSTANT FOR FIINFRA MOBILE API
	 public static String SOURCE_MODULE_CONTACT = "Mobile Contact Module";
	 public static String SOURCE_MODULE_DELETE_CONTACT = "deleteContact";
	 public static String SOURCE_MODULE_ADD_CONTACT = "addContact";
	 public static String SOURCE_MODULE_ADD_GET_CONTACTLIST = "getContactList";
	 public static String MOBILE_SOURCE_MODULE_SAVE_BULK_CONTACT= "saveBulkContactsDetails";
	 
	 public static String SOURCE_MODULE_FOLIOLIST = "getAdditionalPurchase";
	 public static String SOURCE_MODULE_RECOMMENDATION_FOR_PARTYID = "Recommendation";
	 public static String SOURCE_MODULE_SAVE_SWITCH = "saveSwitchTransaction";	 
	 public static String SOURCE_MODULE_SAVE_STP = "saveSTPTransaction";
 
	 
	
	 public static String MOBILE_SOURCE_MODULE_REDEEM = "saveRedeemTransaction";
	 public static String MOBILE_SOURCE_MODULE_RESUBMIT_TRANSACTION = "Resubmit Transaction";
	 public static String MOBILE_SOURCE_MODULE_UPDATE_TRXN_STATUS = "Update Trxn Status";
	 public static String MOBILE_SOURCE_MODULE_GET_PAYLOAD_FOR_TRXN = "getPayloadForTransaction";
	 public static String MOBILE_SOURCE_MODULE_SWITCH = "Save Switch Detail";
	 public static String MOBILE_SOURCE_MODULE_SAVE_PURCHASE = "savePurchaseDetails";
	 public static String MOBILE_SOURCE_MODULE_GET_CLIENT_IIN_DETAILIST = "getClientIINDetailList";
	 
	 
	 
	 public static String MOBILE_SOURCE_MODULE_GET_ONLINE_TRXN_HISTORY = "getOnlineTransactionHistory";
	 public static String MOBILE_SOURCE_MODULE_GET_ONLINE_TRXN_REGISTER = "getOnlineTransactionRegister";
	 
	 public static String MOBILE_SOURCE_MODULE_GET_AMC_LIST = "getAMCList";
	 public static String MOBILE_SOURCE_MODULE_GET_SCHEME_LIST = "getSchemeList";
	 public static String MOBILE_SOURCE_MODULE_GET_TOKEN = "getToken";
	 
	 public static String MOBILE_SOURCE_SYNC_MODULE = "sync";
	 
	 public static String MOBILE_SOURCE_MODULE_GET_GOAL_LIST = "getClientGoalList";
	 public static String MOBILE_SOURCE_MODULE_SAVE_GOAL_LIST = "saveClientGoal";
	 public static String MOBILE_SOURCE_MODULE_GET_ADVICE = "getAdvice";
	 public static String MOBILE_SOURCE_MODULE_SAVE_ADVICE = "saveAdvice";
	 
	 public static String MOBILE_SOURCE_MODULE_GET_PARTNERFOLIO_SUMMARRY = "getPartnerFolioSummary";
	 public static String MOBILE_SOURCE_MODULE_GET_CLIENTFOLIO_SUMMARRY = "getClientFolioSummary";
	 
	 public static String MOBILE_SOURCE_MODULE_GET_CODEVALUES_FOR_CONTRY = "country";
	 public static String MOBILE_SOURCE_MODULE_GET_CODEVALUES_FOR_STATE = "state";
	 public static String MOBILE_SOURCE_MODULE_GET_CODEVALUES_FOR_CITY = "city";
	 public static String MOBILE_SOURCE_MODULE_GET_CODEVALUES_FOR_GOALTYPE = "goaltype";
	 
	 public static String MOBILE_SOURCE_MODULE_LOGIN_ACTIVATE = "activate";
	 public static String MOBILE_SOURCE_MODULE_LOGIN_AUTHORIZE = "authorize";
	 public static String MOBILE_SOURCE_MODULE_LOGIN_RESET = "reset";
	 
	 
	 
	 public static String MOBILE_SOURCE_MODULE_GET_PARTNERINFO = "getPartnerInfo";
	// usp_pp_saveRedeemTransactionDetails
	
	 
	 //EVENT ID'S FOR MOBILE API
	 public static final int SOURCE_MODULE_DELETE_CONTACT_EVENT_ID = 97232;
	 public static final int SOURCE_MODULE_ADD_CONTACT_EVENT_ID = 97233;
	 public static final int SOURCE_MODULE_GET_CONTACTLIST_EVENT_ID = 97234;
	 public static final int MOBILE_SOURCE_MODULE_SAVE_BULK_CONTACT_EVENT_ID= 97235;
	 
	 public static final int SOURCE_MODULE_FOLIOLIST_EVENT_ID = 97236;
	 public static final int SOURCE_MODULE_RECOMMENDATION_FOR_PARTYID_EVENT_ID = 97237;
	 public static final int SOURCE_MODULE_SAVE_SWITCH_EVENT_ID = 97238;
	 public static final int SOURCE_MODULE_SAVE_STP_EVENT_ID = 97272;
	 
	
	 public static final int MOBILE_SOURCE_MODULE_REDEEM_EVENT_ID = 97239;
	 public static final int MOBILE_SOURCE_MODULE_RESUBMIT_TRANSACTION_EVENT_ID = 97240;
	 public static final int MOBILE_SOURCE_MODULE_UPDATE_TRXN_STATUS_EVENT_ID = 97241;
	 public static final int MOBILE_SOURCE_MODULE_GET_PAYLOAD_FOR_TRXN_EVENT_ID = 97242;
	 public static final int MOBILE_SOURCE_MODULE_SWITCH_EVENT_ID = 97243;
	 public static final int MOBILE_SOURCE_MODULE_SAVE_PURCHASE_EVENT_ID = 97244;
	 public static final int MOBILE_SOURCE_MODULE_GET_CLIENT_IIN_DETAILIST_EVENT_ID = 97245;
	 
	 
	 
	 public static final int MOBILE_SOURCE_MODULE_GET_ONLINE_TRXN_HISTORY_EVENT_ID = 97246;
	 public static final int MOBILE_SOURCE_MODULE_GET_ONLINE_TRXN_REGISTER_EVENT_ID= 97247;
	 
	 public static final int MOBILE_SOURCE_MODULE_GET_AMC_LIST_EVENT_ID = 97248;
	 public static final int MOBILE_SOURCE_MODULE_GET_SCHEME_LIST_EVENT_ID = 97249;
	 public static final int MOBILE_SOURCE_MODULE_GET_TOKEN_EVENT_ID = 97250;
	 
	 public static final int MOBILE_SOURCE_SYNC_MODULE_EVENT_ID = 97251;
	 
	 public static final int MOBILE_SOURCE_MODULE_GET_GOAL_LIST_EVENT_ID = 97252;
	 public static final int MOBILE_SOURCE_MODULE_SAVE_GOAL_LIST_EVENT_ID = 97253;
	 public static final int MOBILE_SOURCE_MODULE_GET_ADVICE_EVENT_ID = 97254;
	 public static final int MOBILE_SOURCE_MODULE_SAVE_ADVICE_EVENT_ID = 97255;
	 
	 public static final int MOBILE_SOURCE_MODULE_GET_PARTNERFOLIO_SUMMARRY_EVENT_ID = 97256;
	 public static final int MOBILE_SOURCE_MODULE_GET_PARTNER_INFO_EVENT_ID = 97266;
	 public static final int MOBILE_SOURCE_MODULE_GET_CLIENTFOLIO_SUMMARRY_EVENT_ID = 97257;
	 
	 public static final int MOBILE_SOURCE_MODULE_GET_CODEVALUES_FOR_CONTRY_EVENT_ID = 97258;
	 public static final int MOBILE_SOURCE_MODULE_GET_CODEVALUES_FOR_STATE_EVENT_ID = 97259;
	 public static final int MOBILE_SOURCE_MODULE_GET_CODEVALUES_FOR_CITY_EVENT_ID = 97260;
	 public static final int MOBILE_SOURCE_MODULE_GET_CODEVALUES_FOR_GOALTYPE_EVENT_ID = 97261;
	 
	 public static final int MOBILE_SOURCE_MODULE_LOGIN_ACTIVATE_EVENT_ID = 97262;
	 public static final int MOBILE_SOURCE_MODULE_LOGIN_AUTHORIZE_EVENT_ID = 97263;
	 public static final int MOBILE_SOURCE_MODULE_LOGIN_RESET_EVENT_ID = 97264;
	 
	 
	 public static final int MOBILE_SOURCE_MODULE_GET_CODEVALUES_FOR_SIPFREQUENCY_EVENT_ID = 97265; 
	 
	
	 
	 public static final Integer qw = 97223;
	 //FIINFRA CONSTANT FOR FIINFRA MOBILE API
	public static final String SP_GETCONTACTLIST="{CALL usp_common_v1015_getContactList(?,?,?,?,?,?,?)}";
	public static final String V1_SP_ADD_CONTACT_DETAILS ="{CALL usp_common_v1015_saveContact(?,?,?,?,?,?,?,?)}";
	public static final String SP_DELETECONTACTDETAILS ="{CALL usp_common_v1015_deleteContactDetails(?,?,?)}";
	public static final String V1_SP_GET_CONTACT_GOAL_LIST ="{CALL usp_common_v1015_getContactGoalList(?,?,?,?,?,?,?)}";
	//public static final String V1_SP_GET_CONTACT_ADVICE_LIST ="{CALL usp_common_v1015_getAdviceDetails(?,?,?,?,?,?,?)}";
	public static final String V1_SP_GET_RECOMMENDATION_LIST ="{CALL usp_common_v1015_getAllRecommendationForPartyId(?,?)}";
	//public static final String V1_SP_GET_PARTNER_SUMMARY_LIST ="{CALL usp_common_v1015_getMFPortfolioSummary(?)}";
	public static final String V1_SP_GET_CLIENT_FOLIO_SUMMARY_LIST ="{CALL usp_common_v1015_getClientPortfolioSummary(?,?)}";
	public static final String V1_SP_PARTNER_DASHBOARD_DATA ="{CALL usp_pp_v1015_getPartnerDashBoardData(?,?,?,?,?,?,?,?)}";
	//public static final String SAVE_CLIENT_GOAL="{CALL usp_common_v1015_saveContactGoalList(?,?,?)}";
	//public static String SAVE_CLIENT_GOAL = "usp_common_v1015_saveContactGoalList";

	

	public static final String SP_SAVE_USER_ACCESS ="{CALL usp_srp_saveUesrAccess(?,?,?,?,?,?,?,?,?,?)}";
	public static final String SP_GET_USER_ACCESS_DETAIL ="{CALL usp_srp_getUesrAccessDetail(?,?,?,?)}";

	
	public static final Integer SRP_SAVE_USER_ACCESS_ID = 97231;
	//public static final String SRP_SOURCE_MODULE_USER = "Service Portal Biz Unit Module";
	
	
//	public static final String PP_SAVE_ONLINE_CONFIGURE_DATA="{CALL usp_pp_saveOnlineConfigureData(?,?,?,?)}";
	
	
	public static final String V1_SP_GET_USER_ACCESS_DETAIL ="{CALL usp_cp_getUesrAccessDetail(?,?)}";
	
	public static final String SP_GET_CLIENTLISTONLY_FOR_AUM = "{CALL usp_rpt_getClientListForOnlyForAUM(?,?)}";
	 
	 public static final String SP_GET_AMC_LIST_FOR_AUM = "{CALL usp_rpt_getAMCList(?,?,?)}";
	 
	 public static final String SP_GET_SEGMENT_LIST_FOR_AUM = "{CALL usp_rpt_getSegmentList(?,?,?,?)}";
	 
	 public static final String SP_GET_PRODUCT_LIST_FOR_AUM = "{CALL usp_rpt_getProductListForAUM(?,?,?,?,?)}";
	 
	 public static final int getOLTransactionAMCConfiguration=97267;
	 public static final int saveOLTransactionAMCConfiguration=97268;
	 public static final String PP_GET_LI_PRODUCT_LIST="{CALL usp_pp_getInsuranceProductForPartyID(?,?,?)}";
	 public static final String PP_GET_PRODUCTS_LIST="{CALL usp_PP_getProductsForLIGI(?,?,?)}";
	 public static final String PP_GET_ADD_PRODUCTS_FOR_LIGI="{CALL updateProductsDetailForLIGI(?,?,?,?,?)}";
	 public static final String PP_GET_ADD_SUB_PRODUCTS_FOR_LIGI="{CALL updateSubProductsDetailForLIGI(?,?,?,?,?,?,?)}";

	 
	 public static final String PP_PRODUCT_LI_GI = "Partner Portal Products LI and GI";
	 public static final String PP_PRODUCT_LI_GI_ADD_SCHEME = "Products add for LI and GI";
	 
	 
	 public static final String COMMON_GET_OTP="{CALL usp_common_getOTPNo(?,?)}";
	 
	 
	 public static final Integer COMMON_GET_OTP_EVENT_ID = 97272;
	 public static final String COMMON_SOURCE_MODULE_OTP = "Client Portal OTP Module";
	 public static final String COMMON_GET_OTP_MODULE = "Get OTP method";
	 
	 
	 public static final Integer COMMON_VALIDATE_OTP_EVENT_ID = 97272;
	 public static final String COMMON_SOURCE_MODULE_VALIDATE_OTP = "Client Portal validate OTP Module";
	 public static final String COMMON_VALIDATE_OTP_MODULE = "Validate OTP method";
	 
	 

	 public static final Integer COMMON_QUICKREGISTRATION_EVENT_ID = 97273;
	 public static final String COMMON_SOURCE_MODULE_QUICKREGISTRATION = "Client Portal QUICKREGISTRATION Module";
	 public static final String COMMON_QUICKREGISTRATION_MODULE = "Quick registration module.";
	 
	 public static final Integer COMMON_USER_UPDATE_DETAILS_EVENT_ID=92275;		
	 public static final String COMMON_SOURCE_MODULE_USER_UPDATE_DETAILS =" Client Portal QUICKREGISTRATION - USER_UPDATE_DETAILS  Module";
	 public static final String COMMON_USER_UPDATE_DETAILS_MODULE = "Quick registration  - USER_UPDATE_DETAILS module.";
	 public static final String NOT_FOUND="PartyId not found.";
	 
	 public static final Integer COMMON_PAN_EVENT_ID = 97274;
	 public static final String COMMON_SOURCE_PAN_MODULE = "Partner Portal Pan Module";
	 public static final String COMMON_PAN_MODULE = "Pan module.";
	 
	 public static int merchantID;
	 public static final Integer COMMON_OTPVALIDATE_EVENT_ID = 97275;
	 public static final String COMMON_SOURCE_MODULE_OTPVALIDATE = "Client Portal OTP Module";
	 public static final String COMMON_OTPVALIDATE_MODULE = "OTP Validate module.";
}

