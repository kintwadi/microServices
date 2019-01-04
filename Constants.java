
/**
 * com.lutzwolf.tyche.manager.remote.Constants
 * 
 *  © 2009-2016 Glory Global Solutions
 *  http://www.gloryglobalsolutions.com
 *
 *
 * Modification history
 * -------------------------------------------------------------------------
 * 17.11.2016 added none
 * 24.06.2011 Added "Dispensed from recycler" to screen 3 of a deposit transaction
 * 18.02.2010 added new table cell constant
 * 11.02.2010 removed unused
 * 25.01.2010 renamed value of calculateMix to buttonChanged
 * 21.01.2010 removed business period related stuff
 *            added constants related to counting
 * 22.07.2009 added online support
 * 01.03.2009 created
 */

package com.lutzwolf.tyche.manager.remote;

import java.util.Arrays;
import java.util.List;


/**
 * A collection of common constants used in the system.
 */
public interface Constants
{
    // ---------------------------------------------------------------------
    // Constants
    // ---------------------------------------------------------------------
    public static final String          LDAP_USER_KEY                         = "ldap.user";
    public static final String          LDAP_PASSWORD_KEY                     = "ldap.password";

    public static final int             FEATURE_LOCATION_ID                   = 1;

    public static final String          ECB_REPORT_CURRENCY                   = "EUR";

    public static final String          REMOTE_INTERFACE_NAME                 = "TycheManager";

    public static final String          TRANSACTION_WINDOW_HEADER             = "CashInsight Assure";

    public static final String          DEVICECONTROLLER_PORT                 = "1099";

    public static final String          PROPERTY_KEY_DEVICECONTROLLER         = "DeviceControllerHost";

    public static final String          PROPERTY_DC_ERROR_CODE                = "dc_error_code";
    public static final String          PROPERTY_ERROR_CODE                   = "error_code";
    public static final String          PROPERTY_ERROR_LEVEL                  = "error_level";
    public static final String          PROPERTY_ERROR_TEXT                   = "error_text";

    public static final String          PROPERTY_DEVICE_TYPE                  = "device_type";

    public static final int             DEVICE_TYPE_RECYCLER                  = 0;
    public static final int             DEVICE_TYPE_DISPENSER                 = 1;
    public static final String          IS_RECYCLER                           = "is_recycler";
    public static final String          IS_COIN_RECYCLER                      = "is_coin_recycler";
    public static final String          ISM_CASSETTE                          = "ISM";

    public static final String          DELIMITER                             = "#";

    public static final String          CASHMASTER_FLAG                       = "cashmaster_flag";
    public static final String          ACTION_CONFIRMATION                   = "check_activity";
    public static final String          CLIENT_DISPLAY_FLAG                   = "client_display_flag";
    public static final String          TRANSACTION_ID_NONE                   = "transaction_id_none";

    public static final int             NUMBER_OF_STANDARD_DIGITS             = 9;
    public static final int             NUMBER_OF_TOTAL_DIGITS                = 12;

    public static final long            MAX_DEPOSIT                           = 2000000000;
    public static final int             MAX_LOGIN_NAME_LENGTH                 = 50;
    public static final int             MAX_LOGIN_NAME_DISPLAY_LENGTH         = 20;
    public static final String          CURRENCY_MUL                          = "MUL";

    public static final String          WINDOW_TYPE_MODAL                     = "window_type_modal";

    public static final String          FIELD_ACTIVATED                       = "field_activated";
    public static final String          FIELD_ACTIVATION_KEY                  = "field_activationkey";
    public static final String          FIELD_AD_STATE                        = "field_ad_state";
    public static final String          FIELD_ADDRESS                         = "devicecontrolleraddress";
    public static final String          FIELD_AMOUNT                          = "field_amount";
    public static final String          FIELD_AMOUNT2                         = "field_amount2";
    public static final String          FIELD_APPROVAL_USER_NAME              = "field_approval_user_name";
    public static final String          FIELD_AUTO_LOGIN_NAME                 = "field_auto_login_name";
    public static final String          FIELD_BRANCH                          = "field_branch";
    public static final String          FIELD_BUNDLE                          = "field_bundle";
    public static final String          FIELD_BYPASS_SCREEN                   = "field_bypass_screen";
    public static final String          FIELD_CASHBOX                         = "field_cashbox";
    public static final String          FIELD_CASHMASTER                      = "field_cashmaster";
    public static final String          FIELD_CASHUNIT                        = "field_cashunit";
    public static final String          FIELD_CATEGORY                        = "field_catecory";
    public static final String          FIELD_CAT23SELECT                     = "field_cat23select";
    public static final String          FIELD_CLIENT_ID                       = "field_client_id";
    public static final String          FIELD_COIN                            = "field_coin";
    public static final String          FIELD_COIN_DIFF                       = "field_coin_diff";
    public static final String          FIELD_COIN_AMOUNT                     = "field_coin_amount";
    public static final String          FIELD_COIN_AVAILABLE                  = "field_coin_available";
    public static final String          FIELD_COIN_RECYCLER_AVAILABLE         = "field_coin_recycler_available";
    public static final String          FIELD_COIN_DEPOSITED                  = "field_coin_deposited";
    public static final String          FIELD_COIN_DISPENSED                  = "field_coin_dispensed";
    public static final String          FIELD_COINDISPENSER                   = "field_coindispenser";
    public static final String          FIELD_COINRECYCLER                    = "field_coinrecycler";
    public static final String          FIELD_COINER_TYPE                     = "field_coiner_type";
    public static final String          FIELD_COMMENT                         = "field_comment";
    public static final String          FIELD_CONFIGURATION_REQUIRED          = "field_configuration_required";
    public static final String          FIELD_CONFIGURED                      = "field_configured";
    public static final String          FIELD_CONFIGURED_DISPENSER            = "field_configured_dispenser";
    public static final String          FIELD_CONFIGURED_RECYCLER             = "field_configured_recycler";
    public static final String          FIELD_CONFIRMATION                    = "field_confirmation";
    public static final String          FIELD_NAME_LABEL                      = "field_name";
    public static final String          FIELD_COUNTRY                         = "field_country";
    public static final String          FIELD_CURRENCY                        = "field_currency";
    public static final String          FIELD_CURRENCY2                       = "field_currency2";
    public static final String          FIELD_CURRENCY_EXPONENT               = "field_currency_exponent";
    public static final String          FIELD_CUSTREF                         = "field_custref";
    public static final String          FIELD_DCKEY                           = "field_dckey";
    public static final String          FIELD_DENOM_TARGET                    = "field_denom_limit";
    public static final String          FIELD_DENOM_TARGET_ID                 = "field_denom_limit_id";
    public static final String          FIELD_DENOM_TARGET_CURR               = "field_denom_limit_curr";
    public static final String          FIELD_DENOM_TARGET_VAL                = "field_denom_limit_val";
    public static final String          FIELD_DENOM_TARGET_THRES              = "field_denom_limit_thres";
    public static final String          FIELD_ID                              = "field_id";
    public static final String          FIELD_DELAY                           = "field_delay";
    public static final String          FIELD_DEPOSIT_OK                      = "field_deposit_ok";
    public static final String          FIELD_DEPOSIT_ORDER                   = "field_deposit_order";
    public static final String          FIELD_DEPOSITED                       = "field_deposited";
    public static final String          FIELD_DESTINATION                     = "field_destination";
    public static final String          FIELD_DEVICE_NAME                     = "field_device_name";
    public static final String          FIELD_DETAIL_REPORT                   = "field_detailReport";
    public static final String          FIELD_DISPENSED                       = "field_dispensed";
    public static final String          FIELD_DISPENSED_DISABLED              = "field_dispensed_disabled";
    public static final String          FIELD_DISPENSER                       = "field_dispenser";
    public static final String          FIELD_DISPENSER_ID                    = "field_dispenser_id";
    public static final String          FIELD_DISTRESS_DISPENSE_KEY           = "field_distress_dispense_key";
    public static final String          FIELD_DOUBLE_NOTES                    = "field_double_notes";
    public static final String          FIELD_EMPTIED                         = "field_emptied";
    public static final String          FIELD_END_DATE                        = "field_end_date";
    public static final String          FIELD_END_TIME                        = "field_end_time";
    public static final String          FIELD_EQUIVALENT_ENABLED              = "field_equivalent_enabled";
    public static final String          FIELD_FIRMWARE_VERSION                = "field_firmware_version";
    public static final String          FIELD_FW_VERSION_DEFAULT              = "field_fw_version_default";
    public static final String          FIELD_GRAND_TOTAL                     = "field_grand_total";
    public static final String          FIELD_GROUPING                        = "field_grouping";
    public static final String          FIELD_HAS_NO_REQUEST                  = "field_has_no_request";
    public static final String          FIELD_HOSTNAME                        = "field_hostname";
    public static final String          FIELD_INITIAL_AMOUNT                  = "field_initial_amount";
    public static final String          FIELD_INITIAL_AMOUNT2                 = "field_initial_amount2";
    public static final String          FIELD_IP_ADDRESS                      = "field_ip_address";
    public static final String          FIELD_IP_PORT                         = "field_ip_port";
    public static final String          FIELD_IS_EXIT                         = "field_is_exit";
    public static final String          FIELD_IS_US                           = "field_is_us";
    public static final String          FIELD_ISM_DISPENSE                    = "ism_dispense";
    public static final String          FIELD_ISM_DISPENSE_DISABLED           = "ism_dispense_disabled";
    public static final String          FIELD_JOURNAL_ID                      = "field_journal_id";
    public static final String          FIELD_JOURNAL_TYPE                    = "field_journal_type";
    public static final String          FIELD_LANGUAGE                        = "field_language";
    public static final String          FIELD_LAST_ACTIVATION_DATE            = "field_last_activation_date";
    public static final String          FIELD_LAST_CHANGED_DATE               = "field_last_changed_date";
    public static final String          FIELD_LICENCEKEY                      = "field_licencekey";
    public static final String          FIELD_LOADED                          = "field_loaded";
    public static final String          FIELD_LOCATION_ID                     = "field_location_id";
    public static final String          FIELD_LOGIN                           = "field_login";
    public static final String          FIELD_MAJOR_FW_VERSION                = "field_major_fw_version";
    public static final String          FIELD_MANUAL                          = "field_manual";
    public static final String          FIELD_MANUAL_DEPOSIT                  = "field_manual_deposit";
    public static final String          FIELD_MANUAL_DISPENSE                 = "field_manual_dispense";
    public static final String          FIELD_MAX_ID_DEVICE                   = "field_max_id_device";
    public static final String          FIELD_MAX_ID_LOCATION                 = "field_max_id_location";
    public static final String          FIELD_MAX_ID_USER                     = "field_max_id_user";
    public static final String          FIELD_MIX_NAME                        = "field_mix_name";
    public static final String          FIELD_NAME_START_WITH                 = "field_name_start_with";
    public static final String          FIELD_NHC_VERSION                     = "field_nhc_version";
    public static final String          FIELD_NO_OF_DISPENSER                 = "field_no_of_dispenser";
    public static final String          FIELD_NO_OF_RECYCLER                  = "field_no_of_recycler";
    public static final String          FIELD_NODE_VALUE                      = "field_node_value";
    public static final String          FIELD_NOTE                            = "field_note";
    public static final String          FIELD_NOTE_ORIENTATION                = "field_note_orientation";
    public static final String          FIELD_NOTE_ORIENTATION_VALUE          = "field_note_orientation_value";
    public static final String          FIELD_NOTE_ORIENTATION_CURRENCY       = "field_note_orientation_currency";
    public static final String          FIELD_NUMBER_OF_RSMS                  = "field_number_of_rsms";
    public static final String          FIELD_ONLINE                          = "field_online";
    public static final String          FIELD_ONLINE_RESULT_DATA_AVAILABLE    = "field_online_result_data_available";
    public static final String          FIELD_CLOSE_EVENT_AVAILABLE           = "field_close_event_available";
    public static final String          FIELD_ONLINE_RESULT_STRING_AVAILABLE  = "field_online_result_string_available";
    public static final String          FIELD_ONLINE_URL                      = "field_online_url";
    public static final String          FIELD_OPTIONS                         = "field_options";

    public static final String          FIELD_ORDER_ID                        = "field_order_id";
    public static final String          FIELD_ORDER_AMOUNT                    = "field_order_amount";
    public static final String          FIELD_ORDER_CURRENCY                  = "field_order_currency";
    public static final String          FIELD_ORDER_KEY                       = "field_order_key";
    public static final String          FIELD_ORDER_NOTE                      = "field_order_note";
    public static final String          FIELD_ORDER_TYPE                      = "field_order_type";

    public static final String          FIELD_OPEN_ALL_SUBNODES               = "field_open_all_subnodes";
    public static final String          FIELD_PARTIAL_AMOUNT                  = "field_partial_amount";
    public static final String          FIELD_PASSWORD                        = "field_password";
    public static final String          FIELD_PASSWORD_CONFIRM                = "field_password_confirm";
    public static final String          FIELD_PASSWORD_NEW                    = "field_password_new";
    public static final String          FIELD_PASSWORD_RESET                  = "field_password_reset";
    public static final String          FIELD_PERMISSION                      = "field_permission";
    public static final String          FIELD_PIN                             = "field_pin";
    public static final String          FIELD_POSSIBLE_COUNTING_ERROR_ONLY    = "field_possible_counting_error_only";
    public static final String          FIELD_PRINT_DATA                      = "field_print_data";
    public static final String          FIELD_RECALCULATE_MIX_KEY             = "field_recalculate_mix_key";
    public static final String          FIELD_RECYCLER_DISPENSE               = "filed_recycler_dispense";
    public static final String          FIELD_REQUESTED_AMOUNT                = "field_requested_amount";
    public static final String          FIELD_RESET_SESSION                   = "field_reset_session";
    public static final String          FIELD_RESULT_AMOUNT                   = "field_result_amount";
    public static final String          FIELD_ROLE                            = "field_role";
    public static final String          FIELD_ROLE_ADGROUP                    = "field_role_adgroup";
    public static final String          FIELD_ROLE_ID                         = "field_role_id";
    public static final String          FIELD_ROLE_NAME                       = "field_role_name";
    public static final String          FIELD_ROLE_SORT_ORDER                 = "field_role_sort_order";
    public static final String          FIELD_SECURITY_CONFIG                 = "field_security_config";
    public static final String          FIELD_SCREEN_ID                       = "field_screen_id";
    public static final String          FIELD_SELECT_CATEGORY                 = "field_select_category";
    public static final String          FIELD_SELECTED_DEVICE                 = "field_selected_device";
    public static final String          FIELD_SELECTED_LOCATION               = "field_selected_location";
    public static final String          FIELD_SELECTED_USER                   = "field_selected_user";
    public static final String          FIELD_SELECTED_QUEUE_STATUS           = "field_selected_queue_status";
    public static final String          FIELD_SENSORS                         = "field_sensors";
    public static final String          FIELD_SERIAL_NUMBER                   = "field_serial_number";
    public static final String          FIELD_SESSION_LIMIT                   = "field_session_limit";
    public static final String          FIELD_SESSION_NAME                    = "field_session_name";
    public static final String          FIELD_SESSION_SUM                     = "field_session_sum";
    public static final String          FIELD_SESSION_REQUESTEDSUM            = "field_session_requestedsum";
    public static final String          FIELD_SHOW_ISM_DISPENSE               = "field_show_ism_dispense";
    public static final String          FIELD_SORT_BY_ROLES                   = "field_sort_by_roles";
    public static final String          FIELD_START_DATE                      = "field_start_date";
    public static final String          FIELD_START_TIME                      = "field_start_time";
    public static final String          FIELD_STATUS                          = "field_status";
    public static final String          FIELD_STC_ID                          = "field_stc_id";
    public static final String          FIELD_TABLE_SORTED                    = "field_table_sorted";
    public static final String          FIELD_TIMESLIDE_LIMIT                 = "field_timeslide_limit";
    public static final String          FIELD_TOTAL                           = "field_total";
    public static final String          FIELD_TOTAL2                          = "field_total2";
    public static final String          FIELD_TRANSACTION_LIMIT               = "field_transaction_limit";
    public static final String          FIELD_ONLINE_TRANSACTION_LIMIT        = "field_online_transaction_limit";
    public static final String          FIELD_TRANSACTION_TO_AUTHORIZE        = "field_transaction_to_authorize";
    public static final String          FIELD_TRC_VERSION                     = "field_trc_version";
    public static final String          FIELD_UNALLOCATED                     = "field_unallocated";
    public static final String          FIELD_UNRECOGNIZED                    = "field_unrecognized";
    public static final String          FIELD_USER                            = "field_user";
    public static final String          FIELD_USER_ID                         = "field_user_id";
    public static final String          FIELD_USER_NAME                       = "field_user_name";
    public static final String          FIELD_USER_STATE                      = "field_user_state";
    public static final String          FIELD_VERSION                         = "field_version";
    public static final String          FIELD_VERSION_RSM1                    = "field_version_rsm_1";
    public static final String          FIELD_VERSION_RSM2                    = "field_version_rsm_2";
    public static final String          FIELD_VERSION_RSM3                    = "field_version_rsm_3";
    public static final String          FIELD_VERSION_RSM4                    = "field_version_rsm_4";
    public static final String          FIELD_VERSION_RSM5                    = "field_version_rsm_5";
    public static final String          FIELD_VERSION_RSM6                    = "field_version_rsm_6";
    public static final String          FIELD_VERSION_RSM7                    = "field_version_rsm_7";
    public static final String          FIELD_VERSION_RSM8                    = "field_version_rsm_8";
    public static final String          FIELD_VERTERA6G_MACHINE_DATA_SCREEN   = "field_vertera6g_machine_data_screen";
    public static final String          FIELD_VERTERA6G_MACHINE_DATA_FILE     = "field_vertera6g_machine_data_file";
    public static final String          FIELD_RBG100_MACHINE_DATA_SCREEN      = "field_rbg100_machine_data_screen";
    public static final String          FIELD_RBG100_MACHINE_DATA_FILE        = "field_rbg100_machine_data_file";
    public static final String          FIELD_RBG100CN_MACHINE_DATA_SCREEN    = "field_rbg100cn_machine_data_screen";
    public static final String          FIELD_RBG100CN_MACHINE_DATA_FILE      = "field_rbg100cn_machine_data_file";
    public static final String          FIELD_RBG200_MACHINE_DATA_SCREEN      = "field_rbg200_machine_data_screen";
    public static final String          FIELD_RBG200_MACHINE_DATA_FILE        = "field_rbg200_machine_data_file";
    public static final String          FIELD_WINDOW_HEADER                   = "field_window_header";
    public static final String          FIELD_WORKSTATION                     = "field_workstation";

    public static final String          FIELD_ENABLE_STATE                    = "field_enable_state";
    public static final String          FIELD_LOCK_STATE                      = "field_lock_state";

    public static final String          FIELD_TSL_SECONDS                     = "field_tsl_seconds";
    public static final String          FIELD_TSL_TRANSACTIONS                = "field_tsl_transactions";
    public static final String          FIELD_TSL_AMOUNT                      = "field_tsl_amount";
    public static final String          FIELD_TSL_DEFAULT                     = "field_tsl_default";
    public static final String          FIELD_COIN_AND_MANUAL                 = "field_coin_and_manual";
    public static final String          FIELD_RESTORE_MESS                    = "restore_mess";

    public static final String          FIELD_ERROR_CODE                      = "field_error_code";
    public static final String          FIELD_ERROR_TEXT                      = "field_error_text";

    public static final String          FLAG_AMOUNT2                          = "flag_amount2";
    public static final String          FLAG_BALANCE_CALLED                   = "flag_balance_called";
    public static final String          FLAG_CONTINUOUS_DEPOSIT               = "flag_continuousDeposit";
    public static final String          FLAG_STATUS_CHANGED                   = "flag_status_changed";
    public static final String          FLAG_TEN_CASHUNITS                    = "flag_ten_cashunits";
    public static final String          FLAG_RBG100G_CASHUNITS                = "flag_rbg100g_cashunits";

    public static final String          BOX_BRANCHES                          = "box_branches";
    public static final String          BOX_CATEGORY                          = "box_category";
    public static final String          BOX_COIN                              = "box_coin";
    public static final String          BOX_COIN_ID                           = "box_coin_id";
    public static final String          BOX_COMMANDS                          = "box_commands";
    public static final String          BOX_CURRENCIES                        = "box_currencies";
    public static final String          BOX_CURRENCIES2                       = "box_currencies2";
    public static final String          BOX_DESTINATION                       = "box_destination";
    public static final String          BOX_DEVICE                            = "box_device";
    public static final String          BOX_DEVICECONTROLLER                  = "box_devicecontroller";
    public static final String          BOX_DISPENSER                         = "box_dispenser";
    public static final String          BOX_GROUPING                          = "box_grouping";
    public static final String          BOX_GROUP_SELECT                      = "box_group_select";
    public static final String          BOX_ISSUES                            = "box_issues";
    public static final String          BOX_INSERTION                         = "box_insertion";
    public static final String          BOX_LOCATIONS                         = "box_locations";
    public static final String          BOX_MENU_SELECT                       = "box_menu_select";
    public static final String          BOX_MIXES                             = "box_mixes";
    public static final String          BOX_QUEUE_STATUS                      = "box_queue_status";
    public static final String          BOX_SESSIONS                          = "box_sessions";
    public static final String          BOX_SORT_BY                           = "box_sort_by";
    public static final String          BOX_UNIT_ID                           = "box_unitid";
    public static final String          BOX_USER                              = "box_user";
    public static final String          BOX_USER_ROLES                        = "box_user_roles";

    public static final String          BOX_ACCEPT_NON_EMPTY_STC              = "box_accept_non_empty_stc";
    public static final String          BOX_DENOMINATIONS                     = "box_denominations";

    public static final String          LINK_LOGOUT                           = "link_logout";

    public static final String          LIST_DETAILS                          = "list_details";
    public static final String          LIST_DEVICEBLOCK                      = "list_device_block";
    public static final String          LIST_ONLINEDEVICEBLOCK                = "list_online_device_block";
    public static final String          LIST_ONLINEDEVICECOINBLOCK            = "list_online_device_coin_block";
    public static final String          LIST_STATUS                           = "list_status";

    public static final String          TABLE_AMOUNT_DELAYS                   = "table_amount_delays";
    public static final String          TABLE_ASSIGNMENTS                     = "table_assignments";
    public static final String          TABLE_BILLEXTEND                      = "table_billextend";
    public static final String          TABLE_COIN                            = "table_coin";
    public static final String          TABLE_COMMENT                         = "table_comment";
    public static final String          TABLE_COUNTED                         = "table_counted";
    public static final String          TABLE_CURRENCIES                      = "table_currrencies";
    public static final String          TABLE_DENOM                           = "table_denom";
    public static final String          TABLE_DEPOSITED                       = "table_deposited";
    public static final String          TABLE_DISPENSER                       = "table_dispenser";
    public static final String          TABLE_FIT                             = "table_fit";
    public static final String          TABLE_UNFIT                           = "table_unfit";
    public static final String          TABLE_MIXED                           = "table_mixed";
    public static final String          TABLE_OPEN_ORDERS                     = "table_open_orders";
    public static final String          TABLE_PROPERTIES                      = "table_properties";
    public static final String          TABLE_ROLE_APPROVAL                   = "table_role_approval";
    public static final String          TABLE_ROLE_LIMIT                      = "table_role_limit";
    public static final String          TABLE_ROLE_LIST                       = "table_role_list";
    public static final String          TABLE_ROLE_ORDERING                   = "table_role_ordering";
    public static final String          TABLE_ROLE_PERMISSION                 = "table_role_permission";
    public static final String          TABLE_ROLE_RANK                       = "table_role_rank";
    public static final String          TABLE_ROLE_AD_RANK                    = "table_role_ad_rank";
    public static final String          TABLE_ROLE_TSL                        = "table_role_tsl";
    public static final String          TABLE_SORT_ORDER_DEFAULT              = "1,1";
    public static final String          TABLE_STATUS                          = "table_status";
    public static final String          TABLE_STC_INVENTORY                   = "table_stc_inventory";
    public static final String          TABLE_TRANSFERRED                     = "table_transferred";
    public static final String          TABLE_THRESHOLDS                      = "table_thresholds";
    public static final String          TABLE_USER_APPROAL                    = "table_user_approval";
    public static final String          TABLE_USER_LIMIT                      = "table_user_limit";
    public static final String          TABLE_USER_LIMIT_LIST                 = "table_user_limit_list";
    public static final String          TABLE_USER_LIST                       = "table_user_list";
    public static final String          TABLE_USER_TSL                        = "table_user_tsl";
    public static final String          TABLE_RANGES                          = "table_ranges";
    public static final String          TABLE_LOCATIONS                       = "table_locations";
    public static final String          TABLE_WORKSTATIONS                    = "table_workstations";
    public static final String          TABLE_INFORMATION                     = "table_information";
    public static final String          ACTION_ACCEPT                         = "ACCEPT";
    public static final String          ACTION_ADD                            = "ADD";
    public static final String          ACTION_ADD_AD_GROUP_NODE              = "ADD_AD_GROUP_NODE";
    public static final String          ACTION_ADD_DEVICE_NODE                = "ADD_DEVICE_NODE";
    public static final String          ACTION_ADD_DEVICECONTROLLER_NODE      = "ADD_DEVICECONTROLLER_NODE";
    public static final String          ACTION_ADD_LOCATION_NODE              = "ADD_LOCATION_NODE";
    public static final String          ACTION_ADD_USER_NODE                  = "ADD_USER_NODE";
    public static final String          ACTION_ADMIN                          = "ADMIN";
    public static final String          ACTION_ALARM                          = "ALARM";
    public static final String          ACTION_ALPHA                          = "ALPHA";
    public static final String          ACTION_APPROVE                        = "APPROVE";
    public static final String          ACTION_APPROVE2                       = "APPROVE2";
    public static final String          ACTION_ASSIGN_MAPPING                 = "ASSIGN_MAPPING";
    public static final String          ACTION_AUTHORIZE_SECOND               = "AUTHORIZE_SECOND";
    public static final String          ACTION_BACK                           = "BACK";
    public static final String          ACTION_BACK_FROM_VIDEO                = "BACK_FROM_VIDEO";
    public static final String          ACTION_BACK_FROM_APPROVE              = "BACK_FROM_APPROVE";
    public static final String          ACTION_BACK_FROM_RECOVER              = "BACK_FROM_RECOVER";
    public static final String          ACTION_BALANCE                        = "BALANCE";
    public static final String          ACTION_CAPABILITIES                   = "CAPABILITIES";
    public static final String          ACTION_CASHMASTER                     = "CASHMASTER";
    public static final String          ACTION_CASHMASTER_1                   = "CASHMASTER_1";
    public static final String          ACTION_CALCULATE_MIX                  = "CALCULATE_MIX";
    public static final String          ACTION_CANCEL                         = "CANCEL";
    public static final String          ACTION_CHANGE                         = "CHANGE";
    public static final String          ACTION_CHANGE_MIX                     = "BUTTON_CHANGED";
    public static final String          ACTION_CHANGE_CURRENCY                = "CHANGE_CURRENCY";
    public static final String          ACTION_CHANGE_DEVICE                  = "CHANGE_DEVICE";
    public static final String          ACTION_CHANGE_DISPLAY                 = "CHANGE_DISPLAY";
    public static final String          ACTION_CHANGE_DEVICECONTROLLER        = "CHANGE_DEVICECONTROLLER";
    public static final String          ACTION_CHANGE_DENOMINATION            = "CHANGE_CHANGE_DENOMINATION";
    public static final String          ACTION_CHANGE_LOCATION                = "CHANGE_LOCATION";
    public static final String          ACTION_CHANGE_PASSWORD                = "CHANGE_PASSWORD";
    public static final String          ACTION_CHANGE_USER                    = "CHANGE_USER";
    public static final String          ACTION_CHANGE_ISM_DISPENSE_1          = "CHANGE_ISM_DISPENSE_1";
    public static final String          ACTION_CHANGE_ISM_DISPENSE_2          = "CHANGE_ISM_DISPENSE_2";
    public static final String          ACTION_CHECK                          = "CHECK";
    public static final String          ACTION_CHECK_NOTE_EVENTS              = "CHECK_NOTE_EVENTS";
    public static final String          ACTION_CHECK_COIN_EVENTS              = "CHECK_COIN_EVENTS";
    public static final String          ACTION_CLEAR                          = "CLEAR";
    public static final String          ACTION_CLEAR_REJECT_BOX               = "CLEAR_REJECT_BOX";
    public static final String          ACTION_CLOSE                          = "CLOSE";
    public static final String          ACTION_LOGIN_CLOSE                    = "LOGIN_CLOSE";
    public static final String          ACTION_CLOSE_DETAIL                   = "CLOSE_DETAIL";
    public static final String          ACTION_COLLAPSE                       = "COLLAPSE";
    public static final String          ACTION_COMMENT                        = "COMMENT";
    public static final String          ACTION_COMPLETE                       = "COMPLETE";
    public static final String          ACTION_COMPLETE_WITH_CASHBOX          = "COMPLETE_WITH_CASHBOX";
    public static final String          ACTION_CONFIRM                        = "CONFIRM";
    public static final String          ACTION_CONNECT                        = "CONNECT";
    public static final String          ACTION_CONTINUE                       = "CONTINUE";
    public static final String          ACTION_COUNT                          = "COUNT";
    public static final String          ACTION_CREATE                         = "CREATE";
    public static final String          ACTION_DEFAULT                        = "DEFAULT";
    public static final String          ACTION_DELETE                         = "DELETE";
    public static final String          ACTION_DELETE_NODE                    = "DELETE_NODE";
    public static final String          ACTION_DENY                           = "DENY";
    public static final String          ACTION_DEPOSIT                        = "DEPOSIT";
    public static final String          ACTION_DEPOSIT_COIN                   = "DEPOSIT_COIN";
    public static final String          ACTION_DEPOSIT_RECEIPT                = "DEPOSIT_RECEIPT";
    public static final String          ACTION_DISPENSE                       = "DISPENSE";
    public static final String          ACTION_DISPENSE_CORRECTED_AMT         = "DISPENSE_CORRECTED_AMOUNT";
    public static final String          ACTION_DISTRESS_DISPENSE              = "DISTRESS_DISPENSE";
    public static final String          ACTION_DONE                           = "DONE";
    public static final String          ACTION_DOWN                           = "DOWN";
    public static final String          ACTION_EDIT                           = "EDIT";
    public static final String          ACTION_EDIT_RANK                      = "EDIT_RANK";
    public static final String          ACTION_EDIT_AD_RANK                   = "EDIT_AD_RANK";
    public static final String          ACTION_EDIT_THRESHOLDS                = "EDIT_THRESHOLDS";
    public static final String          ACTION_EMPTY                          = "EMPTY";
    public static final String          ACTION_EMPTY_COL_BOX                  = "EMPTY_COL_BOX";
    public static final String          ACTION_EMPTY_CAT2                     = "EMPTY_CAT2";
    public static final String          ACTION_ENABLE_ESCROW                  = "ENABLE_ESCROW";
    public static final String          ACTION_EXCHANGE_CASSETTE              = "EXCHANGE_CASSETTE";
    public static final String          ACTION_EXECUTE                        = "EXECUTE";
    public static final String          ACTION_EXPAND                         = "EXPAND";
    public static final String          ACTION_EXPORT                         = "EXPORT";
    public static final String          ACTION_HIDE                           = "HIDE";
    public static final String          ACTION_IMPORT                         = "IMPORT";
    public static final String          ACTION_INFO                           = "INFO";
    public static final String          ACTION_INIT                           = "INIT";
    public static final String          ACTION_KEY                            = "ACTION";
    public static final String          ACTION_LIFTS_DOWN                     = "LIFTS_DOWN";
    public static final String          ACTION_LIFTS_UP                       = "LIFTS_UP";
    public static final String          ACTION_LOAD                           = "LOAD";
    public static final String          ACTION_LOAD_COIN                      = "LOAD_COIN";
    public static final String          ACTION_LOGIN                          = "LOGIN";
    public static final String          ACTION_LOGOUT                         = "LOGOUT";
    public static final String          ACTION_MACHINE_DATA                   = "MACHINE_DATA";
    public static final String          ACTION_MACHINE_DATA_VERTERA6G         = "MACHINE_DATA_VERTERA6G";
    public static final String          ACTION_MANAGE_STC                     = "MANAGE_STC";
    public static final String          ACTION_MINUS                          = "MINUS";
    public static final String          ACTION_MIX_AND_DISPENSE               = "MIX_AND_DISPENSE";
    public static final String          ACTION_MOVE_NODE                      = "MOVE_NODE";
    public static final String          ACTION_NEW                            = "NEW";
    public static final String          ACTION_NEXT                           = "NEXT";
    public static final String          ACTION_NO                             = "NO";
    public static final String          ACTION_NONE                           = "NONE";
    public static final String          ACTION_OK                             = "OK";
    public static final String          ACTION_ONLINE                         = "ONLINE";
    public static final String          ACTION_OPEN_ALL_SUBNODES              = "OPEN_ALL_SUBNODES";
    public static final String          ACTION_OPEN_DOOR                      = "OPEN_DOOR";
    public static final String          ACTION_ORDERING                       = "ORDERING";
    public static final String          ACTION_PLUS                           = "PLUS";
    public static final String          ACTION_PRINT                          = "PRINT";
    public static final String          ACTION_PRINT_INIT                     = "PRINT_INIT";
    public static final String          ACTION_PRINT_DETAIL                   = "PRINT_DETAIL";
    public static final String          ACTION_PURGE                          = "PURGE";
    public static final String          ACTION_READ_DEVICECONTROLLER_NODE     = "READ_DEVICECONTROLLER_NODE";
    public static final String          ACTION_READY                          = "READY";
    public static final String          ACTION_RECALCULATE_MIX                = "RECALCULATE_MIX";
    public static final String          ACTION_RECOVER                        = "RECOVER";
    public static final String          ACTION_REFRESH                        = "REFRESH";
    public static final String          ACTION_REFRESH_TREE                   = "REFRESH_TREE";
    public static final String          ACTION_RELEASE                        = "RELEASE";
    public static final String          ACTION_REMOVE_MAPPING                 = "REMOVE_MAPPING";
    public static final String          ACTION_RESET                          = "RESET";
    public static final String          ACTION_RESUME                         = "RESUME";
    public static final String          ACTION_RESTART                        = "RESTART";
    public static final String          ACTION_RESTORE                        = "RESTORE";
    public static final String          ACTION_RETRY_SCREEN                   = "retry_screen";
    public static final String          ACTION_ROLLBACK                       = "ROLLBACK";
    public static final String          ACTION_RUN                            = "RUN";
    public static final String          ACTION_SAME_RANK                      = "SAME_RANK";
    public static final String          ACTION_SAVE                           = "SAVE";
    public static final String          ACTION_SAVE_THRESHOLDS                = "SAVE_THRESHOLDS";
    public static final String          ACTION_SELECT                         = "SELECT";
    public static final String          ACTION_SHOW                           = "SHOW";
    public static final String          ACTION_SHOW_VIDEO                     = "SHOW_VIDEO";
    public static final String          ACTION_SORT                           = "SORT";
    public static final String          ACTION_START                          = "START";
    public static final String          ACTION_STEP_IN                        = "STEP_IN";
    public static final String          ACTION_STORE_ESCROW                   = "STORE_ESCROW";
    public static final String          ACTION_THRESHOLDS                     = "THRESHOLDS";
    public static final String          ACTION_TRANSFER                       = "TRANSFER";
    public static final String          ACTION_TRANSFER_TO_EXIT               = "TRANSFER_TO_EXIT";
    public static final String          ACTION_TRANSFER_TO_COLBOX             = "TRANSFER_TO_COLBOX";
    public static final String          ACTION_SELF_AUDIT                     = "SELF_AUDIT";
    public static final String          ACTION_UNFIT                          = "UNFIT";
    public static final String          ACTION_UP                             = "UP";
    public static final String          ACTION_UPDATE                         = "UPDATE";
    public static final String          ACTION_UPDATE_COIN                    = "UPDATE_COIN";
    public static final String          ACTION_UPDATE_DISPENSER               = "UPDATE_DISPENSER";
    public static final String          ACTION_UPDATE_RECYCLER                = "UPDATE_RECYCLER";
    public static final String          ACTION_VIEW                           = "VIEW";
    public static final String          ACTION_YES                            = "YES";

    public static final String          BUTTON_I18N_PREFIX                    = "BUTTON.";
    public static final String          BUTTON_TYPE_EVENT                     = "eventbutton";
    public static final String          BUTTON_TYPE_TRANSACTION               = "transactionbutton";
    public static final String          BUTTON_TYPE_WINDOW                    = "windowbutton";
    public static final String          BUTTON_DEFAULT_ACTION                 = "defaultActionButton";

    public static final String          CELL_LIMITED_VALUE                    = "...";

    public static final String          CURRENT_NODE_ID                       = "current_node_id";
    public static final String          CURRENT_NODE_VALUE                    = "current_node_value";
    public static final String          CURRENT_NODE_TYPE                     = "current_node_type";
    public static final String          EXPANDED_NODES                        = "expanded_nodes";

    public static final String          NAVIGATION_TYPE                       = "navigationtype";
    public static final String          STANDARD_NAVIGATION                   = "standardnavigation";
    public static final String          PACKED_NAVIGATION                     = "packednavigation";

    public static final String          DEVICE_TYPE                           = "navigation_device_type";
    public static final String          DEVICE_TYPE_BOTH                      = "inner_navigation_both";
    public static final String          DEVICE_TYPE_NONE                      = "inner_navigation";
    public static final String          DEVICE_TYPE_REMOTE                    = "inner_navigation_remote";
    public static final String          DEVICE_TYPE_TCD                       = "inner_navigation_tcd";
    public static final String          DEVICE_TYPE_VERTERA                   = "inner_navigation_vertera";
    public static final String          DEVICE_TYPE_MEI                       = "inner_navigation_mei";
    public static final String          DEVICE_TYPE_VERTERA_6G                = "inner_navigation_vertera6g";
    public static final String          DEVICE_TYPE_RBG100                    = "inner_navigation_rbg100";
    public static final String          DEVICE_TYPE_RBG100G                   = "inner_navigation_rbg100g";
    public static final String          DEVICE_TYPE_RBG100CN                  = "inner_navigation_rbg100cn";
    public static final String          DEVICE_TYPE_RBG200                    = "inner_navigation_rbg200";
    public static final String          DEVICE_TYPE_GDB100                    = "inner_navigation_gdb100";

    // Table cell types
    public static final int             TABLE_CELL_TYPE_TEXT                  = 0;
    public static final int             TABLE_CELL_TYPE_EDITOR                = 1;
    public static final int             TABLE_CELL_TYPE_CHECKBOX              = 2;
    public static final int             TABLE_CELL_TYPE_RADIOBUTTON           = 3;
    public static final int             TABLE_CELL_TYPE_NUMERIC               = 4;
    public static final int             TABLE_CELL_TYPE_DECIMAL               = 5;
    public static final int             TABLE_CELL_TYPE_LINK                  = 6;
    public static final int             TABLE_CELL_TYPE_SHORT_DECIMAL         = 7;
    public static final int             TABLE_CELL_TYPE_FLAGGED_NUMERIC       = 8;
    public static final int             TABLE_CELL_TYPE_FLAGGED_DECIMAL       = 9;
    public static final int             TABLE_CELL_TYPE_TABLE                 = 10;
    public static final int             TABLE_CELL_TYPE_TRISTATE              = 11;
    public static final int             TABLE_CELL_TYPE_FLAGGED_TEXT          = 12;
    public static final int             TABLE_CELL_TYPE_NUMERIC_ONLINE        = 13;
    public static final int             TABLE_CELL_TYPE_SELECT_BOX            = 14;

    // Radio buttons
    public static final String          RADIO_BUTTON_AMOUNT                   = "button_amount";
    public static final String          RADIO_BUTTON_COUNT                    = "button_count";
    public static final String          RADIO_BUTTON_COUNTING_MODE            = "counting_mode";
    public static final String          RADIO_BUTTON_DEVICE                   = "button_device";
    public static final String          RADIO_BUTTON_LEFT                     = "button_left";
    public static final String          RADIO_BUTTON_NORMAL_MODE              = "button_normal_mode";
    public static final String          RADIO_BUTTON_ORDER                    = "selected_order";
    public static final String          RADIO_BUTTON_PERIOD                   = "button_period";
    public static final String          RADIO_BUTTON_POSITION                 = "selected_position";
    public static final String          RADIO_BUTTON_REQUESTED_MIX            = "request_type";
    public static final String          RADIO_BUTTON_RIGHT                    = "button_right";
    public static final String          RADIO_BUTTON_ROLE                     = "selected_role";
    public static final String          RADIO_BUTTON_STOP_MODE                = "button_stop_mode";
    public static final String          RADIO_BUTTON_USER                     = "selected_user";
    public static final String          RADIO_BUTTON_USER_LIST                = "selected_user_list";
    public static final String          RADIO_BUTTON_DENOM_LIMIT              = "selected_denom_limit";
    public static final String          RADIO_BUTTON_AMOUNT_DELAYS            = "selected_amount_delays";
    public static final String          RADIO_BUTTON_SEARCH_JOURNAL_ID_MY     = "search_journal_id_my_transactions";
    public static final String          RADIO_BUTTON_SEARCH_JOURNAL_ID_ALL    = "search_journal_id_all_transactions";
    public static final String          RADIO_BUTTON_DISPENSE_COMPLETE        = "dispense_complete";
    public static final String          RADIO_BUTTON_ASSIGNMENT               = "selected_assignment";

    // Tree element
    public static final String          TREE_LOCATION                         = "tree_location";

    public static final String          TYPE_AMOUNT                           = "type_amount";
    public static final String          TYPE_COUNT                            = "type_count";
    public static final String          TYPE_DATE                             = "type_date";
    public static final String          TYPE_LEFT                             = "type_left";
    public static final String          TYPE_NORMAL_MODE                      = "type_normal_mode";
    public static final String          TYPE_RIGHT                            = "type_right";
    public static final String          TYPE_SESSION                          = "type_session";
    public static final String          TYPE_STOP_MODE                        = "type_stop_mode";
    public static final String          TYPE_TODAY                            = "type_today";
    public static final String          TYPE_ALL                              = "type_all";
    public static final String          TYPE_NAME_START_WITH                  = "type_name_start_with";
    public static final String          TYPE_COMPLETE_WITH_CASHBOX            = "type_complete_with_cashbox";
    public static final String          TYPE_COMPLETE_WITH_DEVICE             = "type_complete_with_device";

    public static final String          KEY_CLIENT                            = "key_client";
    public static final String          KEY_COIN                              = "key_coin";
    public static final String          KEY_AUTOLOGON_USER                    = "key_default_user";
    public static final String          KEY_BLOCK                             = "key_block";
    public static final String          KEY_DISPENSER                         = "key_dispenser";
    public static final String          KEY_JOURNALID                         = "key_journalid";
    public static final String          KEY_MAX_SESSIONS                      = "MaxSessions";
    public static final String          KEY_ORDER                             = "key_order";
    public static final String          KEY_ENTRY                             = "key_entry";
    public static final String          KEY_QUEUE_STATUS_JRNL_ENTRY           = "key_queue_status_jrnl_entry";
    public static final String          KEY_SECOND_USER                       = "key_second_user";
    public static final String          KEY_UNITID                            = "unitid";
    public static final String          KEY_USER                              = "key_user";
    public static final String          KEY_USER_ADGROUPS                     = "key_user_adgroups";
    public static final String          KEY_DISPLAY                           = "key_display";
    public static final String          KEY_CLIENT_DISPLAY                    = "key_client_display";
    // log in/out
    public static final String          CHANGE_PASSWORD                       = "change_password";
    public static final String          RESULT_FAILED                         = "failed";
    public static final String          RESULT_LOGIN                          = "result_login";
    public static final String          RESULT_LOGOUT                         = "result_logout";
    public static final String          SUCCESS                               = "success";

    // parameter passing
    public static final String          CHOOSEN_ACTION                        = "choosen_action";
    // business period
    public static final int             TYPE_MACHINE_PERIOD                   = 1;
    public static final int             TYPE_USER_PERIOD                      = 2;
    public static final int             TYPE_TERMINAL_PERIOD                  = 3;

    public static final int             CASHTYPE_BILL                         = 1;
    public static final int             CASHTYPE_COIN                         = 2;
    public static final int             CASHTYPE_CASHBOX                      = 3;

    // cassette status
    public static final int             STATUS_OK                             = 0;
    public static final int             STATUS_UNKNOWN                        = 1;
    public static final int             STATUS_INOPERABLE                     = 2;
    public static final int             STATUS_NOT_DISPENSABLE                = 3;
    public static final int             STATUS_MISSING                        = 4;

    public static final int             THRESHOLD_FULL                        = 0;
    public static final int             THRESHOLD_HIGH                        = 1;
    public static final int             THRESHOLD_NORMAL                      = 2;
    public static final int             THRESHOLD_LOW                         = 3;
    public static final int             THRESHOLD_EMPTY                       = 4;

    // result status
    public static final int             STATUS_SUCCESS                        = 0;
    public static final int             STATUS_FAILED                         = 1;
    public static final int             STATUS_CANCELLED                      = 2;

    // transactions
    public static final String          TRANSACTION_ABOUT                     = "transaction_about";
    public static final String          TA_ALL_TRANSACTIONS_REPORT            = "transaction_all_transactions_report";
    public static final String          TRANSACTION_AUDIT                     = "transaction_audit";
    public static final String          TRANSACTION_BALANCE                   = "transaction_balance";
    public static final String          TRANSACTION_BALANCE_TERMINAL          = "transaction_balance_terminal";
    public static final String          TRANSACTION_CIT_EMPTY                 = "transaction_cit_empty";
    public static final String          TRANSACTION_CLEAR_DAILY_SUM           = "transaction_clear_daily_sum";
    public static final String          TRANSACTION_COLLECT                   = "transaction_collect";
    public static final String          TRANSACTION_COMMENT                   = "transaction_comment";
    public static final String          TRANSACTION_CONFIGURE_DENOM_TARGET    = "transaction_configure_denom_target";
    public static final String          TA_COUNT                              = "transaction_count";
    public static final String          TRANSACTION_COUNTER_CORRECTION        = "transaction_counter_correction";
    public static final String          TRANSACTION_SECURITY_CONFIGURATION    = "transaction_security_configuration";
    public static final String          TRANSACTION_DEPOSIT                   = "transaction_deposit";
    public static final String          TA_DETAIL_REPORT                      = "transaction_detail_report";
    public static final String          TRANSACTION_DEVICE_LOCKING            = "transaction_device_locking";
    public static final String          TA_DEVICE_LOCKING_REPORT              = "transaction_device_locking_report";
    public static final String          TRANSACTION_FORCE_RELEASE             = "transaction_force_release";
    public static final String          TRANSACTION_CURRENCY_CONFIGURATION    = "transaction_currency_configuration";
    public static final String          TRANSACTION_DEVICES_CONFIG            = "transaction_devicesconfig";
    public static final String          TRANSACTION_DEVICE_REPORT             = "transaction_device_report";
    public static final String          TRANSACTION_DEVICE_STATUS             = "transaction_device_status";
    public static final String          TRANSACTION_DISPENSE                  = "transaction_dispense";
    public static final String          TRANSACTION_DISTRESS_DISPENSE         = "transaction_distress_dispense";
    public static final String          TRANSACTION_EMPTY                     = "transaction_empty";
    public static final String          TRANSACTION_EMPTY_CURRENCY            = "transaction_empty_currency";
    public static final String          TRANSACTION_EXCHANGE                  = "transaction_exchange";
    public static final String          TRANSACTION_FITNESS_INVENTORY         = "transaction_fitness_inventory";
    public static final String          TRANSACTION_FITNESS_SORTING           = "transaction_fitness_sorting";
    public static final String          TRANSACTION_GET_LIMITS                = "transaction_get_limits";
    public static final String          TRANSACTION_HELP                      = "transaction_help";
    public static final String          TRANSACTION_INIT                      = "transaction_init";
    public static final String          TRANSACTION_INVENTORY                 = "transaction_inventory";
    public static final String          TRANSACTION_LOAD                      = "transaction_load";
    public static final String          TRANSACTION_LOCATIONS_CONFIG          = "transaction_locationsconfig";
    public static final String          TRANSACTION_LOGIN                     = "transaction_login";
    public static final String          TRANSACTION_LOGOUT                    = "transaction_logout";
    public static final String          TRANSACTION_AUTO_LOGOUT               = "transaction_auto_logout";
    public static final String          TRANSACTION_MAINTENANCE               = "transaction_maintenance";
    public static final String          TA_MYTRANSACTIONS_REPORT              = "transaction_mytransactions_report";
    public static final String          TA_INVENTORY_SUMMARY_REPORT           = "transaction_inventory_summary_report";
    public static final String          TA_QUEUE_STATUS_REPORT                = "transaction_queue_status_report";
    public static final String          TA_QUEUE_STATUS_DETAIL_REPORT         = "transaction_queue_status_detail_report";
    public static final String          TRANSACTION_MANAGE_STC                = "transaction_manage_stc";
    public static final String          TRANSACTION_ONLINE                    = "transaction_online";
    public static final String          TRANSACTION_OPEN_ORDERS               = "transaction_open_orders";
    public static final String          TRANSACTION_PERMISSION_DENIED         = "transaction_permission_denied";
    public static final String          TRANSACTION_PROFILE                   = "transaction_profile";
    public static final String          TRANSACTION_PROPERTIES                = "transaction_properties";
    public static final String          TRANSACTION_ROLE_CONFIGURATION        = "transaction_role_configuration";
    public static final String          TRANSACTION_SECOND_USER_AUTHORIZATION = "transaction_second_user_authorization";
    public static final String          TRANSACTION_SELF_AUDIT                = "transaction_self_audit";
    public static final String          TRANSACTION_STATUS                    = "transaction_status";
    public static final String          TRANSACTION_STEP_IN                   = "transaction_step_in";

    public static final String          TA_STEP_IN_DEPOSIT                    = "transaction_step_in_deposit";
    public static final String          TA_STEP_IN_DISPENSE                   = "transaction_step_in_dispense";
    public static final String          TA_STEP_IN_VAULT_BUY                  = "transaction_step_in_vault_buy";
    public static final String          TA_STEP_IN_VAULT_SELL                 = "transaction_step_in_vault_sell";
    public static final String          TRANSACTION_TRANSFER_CURRENCY         = "transaction_transfer_currency";
    public static final String          TRANSACTION_TRANSFER_NOTES            = "transaction_transfer_notes";
    public static final String          TRANSACTION_SYSTEM_CONFIGURATION      = "transaction_system_configuration";
    public static final String          TRANSACTION_USER_CONFIGURATION        = "transaction_user_configuration";
    public static final String          TRANSACTION_USER_REPORT               = "transaction_user_report";
    public static final String          TRANSACTION_USER_LIST_REPORT          = "transaction_user_list_report";
    public static final String          TRANSACTION_VAULT_BUY                 = "transaction_vault_buy";
    public static final String          TRANSACTION_VAULT_SELL                = "transaction_vault_sell";
    public static final String          TRANSACTION_TERMINAL_BALANCE          = "transaction_terminal_balance";
    public static final String          TRANSACTION_WORKSTATION_CONFIG        = "transaction_workstationconfig";
    public static final String          TRANSACTION_WORKSTATION_MAPPING       = "transaction_workstation_mapping";
    public static final String          TRANSACTION_DEVICE_SETTINGS           = "transaction_device_settings";
    public static final String          TRANSACTION_SPECIAL                   = "transaction_special";
    public static final String          TRANSACTION_OVERRIDE_SESSION_LIMIT    = "transaction_override_session_limit";
    public static final String          TA_INVENTORY_TRACKING_REPORT          = "transaction_inventory_tracking_report";
    public static final String          TRANSACTION_ECB_REPORT                = "transaction_ecb_report";
    public static final String          TRANSACTION_CLEAR_REJECT_BOX          = "transaction_clear_reject_box";
    public static final String          ACCESS_HEAD_LEVEL                     = "access_head_level";
    public static final String          ACCESS_REGION_LEVEL                   = "access_region_level";
    public static final String          ACCESS_BRANCH_LEVEL                   = "access_branch_level";

    // commands
    public static final String          COMMAND_EMPTY                         = "command_empty";
    public static final String          COMMAND_TRANSFER                      = "command_transfer";

    // online keys
    public static final String          RESPONSE_FILENAME                     = "response_filename";

    public static final String          XML_FORMAT                            = "xml_format";

    public static final String          DENOM_1                               = "denom_1";
    public static final String          DENOM_2                               = "denom_2";
    public static final String          DENOM_3                               = "denom_3";
    public static final String          DENOM_4                               = "denom_4";
    public static final String          DENOM_5                               = "denom_5";
    public static final String          DENOM_6                               = "denom_6";
    public static final String          DENOM_7                               = "denom_7";
    public static final String          DENOM_8                               = "denom_8";
    public static final String          DENOM_9                               = "denom_9";
    public static final String          DENOM_10                              = "denom_10";
    public static final String          DENOM_11                              = "denom_11";
    public static final String          DENOM_12                              = "denom_12";

    // online command file keys
    public static final String          CMD_ACTION_REQUESTED                  = "action";
    public static final String          CMD_COUNT_1                           = "count_1";
    public static final String          CMD_COUNT_2                           = "count_2";
    public static final String          CMD_COUNT_3                           = "count_3";
    public static final String          CMD_COUNT_4                           = "count_4";
    public static final String          CMD_COUNT_5                           = "count_5";
    public static final String          CMD_COUNT_6                           = "count_6";
    public static final String          CMD_COUNT_7                           = "count_7";
    public static final String          CMD_COUNT_8                           = "count_8";
    public static final String          CMD_COUNT_9                           = "count_9";
    public static final String          CMD_COUNT_10                          = "count_10";
    public static final String          CMD_COUNT_11                          = "count_11";
    public static final String          CMD_COUNT_12                          = "count_12";
    public static final String          CMD_ALARM                             = "alarm";
    public static final String          CMD_ADDITIONAL_INFO                   = "additional_info";
    public static final String          CMD_FREE_TEXT                         = "free_text";

    // online response file keys
    public static final String          RSP_COUNT_1_ACHIEVED                  = "count_1_achieved";
    public static final String          RSP_COUNT_2_ACHIEVED                  = "count_2_achieved";
    public static final String          RSP_COUNT_3_ACHIEVED                  = "count_3_achieved";
    public static final String          RSP_COUNT_4_ACHIEVED                  = "count_4_achieved";
    public static final String          RSP_COUNT_5_ACHIEVED                  = "count_5_achieved";
    public static final String          RSP_COUNT_6_ACHIEVED                  = "count_6_achieved";
    public static final String          RSP_COUNT_7_ACHIEVED                  = "count_7_achieved";
    public static final String          RSP_COUNT_8_ACHIEVED                  = "count_8_achieved";
    public static final String          RSP_COUNT_9_ACHIEVED                  = "count_9_achieved";
    public static final String          RSP_COUNT_10_ACHIEVED                 = "count_10_achieved";
    public static final String          RSP_COUNT_11_ACHIEVED                 = "count_11_achieved";
    public static final String          RSP_COUNT_12_ACHIEVED                 = "count_12_achieved";

    // xml constants
    public static final String          XML_JOURNAL_ID                        = "journal_id";
    public static final String          XML_TRANSACTION_ID                    = "transaction_id";
    public static final String          XML_USER                              = "user";
    public static final String          XML_AMOUNT                            = "amount";
    public static final String          XML_CURRENCY                          = "currency";
    public static final String          XML_COIN                              = "coin";
    public static final String          XML_MANUAL                            = "manual";
    public static final String          XML_ALARM                             = "alarm";
    public static final String          XML_ADDITIONAL_INFO                   = "additional_info";
    public static final String          XML_NOTE                              = "note";
    public static final String          XML_BYPASS_ONLINE_CONFIRMATION_SCREEN = "bypass_online_confirmation_screen";
    public static final String          XML_DENOMINATION                      = "denomination";
    public static final String          XML_ITEM                              = "item";
    public static final String          XML_COUNT                             = "count";
    public static final String          XML_VALUE                             = "value";
    public static final String          XML_DISPENSE_AMOUNT                   = "dispense_amount";
    public static final String          XML_DISPENSE_CURRENCY                 = "dispense_currency";
    public static final String          XML_MIX                               = "mix_id";
    public static final String          XML_RESPONSE                          = "response";
    public static final String          XML_ERROR_CODE                        = "error_code";
    public static final String          XML_ERROR_LEVEL                       = "error_level";
    public static final String          XML_ERROR_TEXT                        = "error_text";
    public static final String          XML_TOTAL                             = "total";

    public static final String          EMPTY_DELAY                           = "empty_delay";
    public static final String          VIDEO_ID                              = "video_id";
    public static final String          ID                                    = "id";
    public static final String          UNFIT_PRESENT                         = "unfit_present";
    public static final String          AUTODISPENSE                          = "AUTODISPENSE";
    public static final String          DISPENSE_DELAY                        = "DISPENSE_DELAY";
    public static final String          CBAUTOEXEC                            = "CBAUTOEXEC";
    public static final String          COUNTING_MODES                        = "counting_modes";

    public static final String          SELECT_ALL_BOX                        = "<input type=\"checkbox\" name=\"select_all_box\" onClick=\"selectall(this)\" />";
    public static final String          SELECT_ALL_BOX_DISABLED               = "<input type=\"checkbox\" name=\"select_all_box\" onClick=\"selectall(this)\" disabled/>";
    public static final String          SELECT_ALL_COIN_BOX                   = "<input type=\"checkbox\" name=\"select_all_coin_box\" onClick=\"selectall_coin(this)\" />";
    public static final String          SELECT_ALL_COIN_BOX_DISABLED          = "<input type=\"checkbox\" name=\"select_all_coin_box\" onClick=\"selectall_coin(this)\" disabled/>";
    public static final String          CHECK_SELECT_ALL_BOX                  = "check_select_all_box()";
    public static final String          CHECK_SELECT_ALL_COIN_BOX             = "check_select_all_coin_box()";
    public static final String          FOOTER_CELL_STYLE                     = "border-left:hidden;border-bottom:hidden;border-right:hidden;background-color:transparent;";
    public static final String          FOOTER_CELL_STYLE_BOLD                = "font-weight:bold;border-left:hidden;border-bottom:hidden;border-right:hidden;background-color:transparent;";
    public static final String          CELL_STYLE_BOLD                       = "font-weight:bold;";

    public static final String          ALIGN_LEFT                            = "left";
    public static final String          ALIGN_RIGHT                           = "right";
    public static final String          ALIGN_CENTER                          = "center";

    // vertera6g status
    public static final String          VERTERA_6G_STATUS_AVAILABLE           = "OK";
    public static final String          VERTERA_6G_STATUS_UNAVAILABLE         = "KO";
    public static final String          VERTERA_6G_STATUS_REPAIRING           = "RE";
    public static final String          VERTERA_6G_STATUS_NOTDEFINED          = "UN";
    public static final String          VERTERA_6G_STATUS_NOTDEFINED_TOOLTIP  = "unknown";

    // vertera6g sensors
    public static final String          SENSOR_STATUS_RSC1                    = "sensor_status_rsc1";
    public static final String          SENSOR_STATUS_RSC2                    = "sensor_status_rsc2";
    public static final String          SENSOR_STATUS_RSC3                    = "sensor_status_rsc3";
    public static final String          SENSOR_STATUS_RSC4                    = "sensor_status_rsc4";
    public static final String          SENSOR_STATUS_RSC5                    = "sensor_status_rsc5";
    public static final String          SENSOR_STATUS_RSC6                    = "sensor_status_rsc6";
    public static final String          SENSOR_STATUS_RSC7                    = "sensor_status_rsc7";
    public static final String          SENSOR_STATUS_RSC8                    = "sensor_status_rsc8";

    public static final String          SENSOR_STATUS_RSM1                    = "sensor_status_rsm1";
    public static final String          SENSOR_STATUS_RSM2                    = "sensor_status_rsm2";
    public static final String          SENSOR_STATUS_RSM3                    = "sensor_status_rsm3";
    public static final String          SENSOR_STATUS_RSM4                    = "sensor_status_rsm4";
    public static final String          SENSOR_STATUS_RSM5                    = "sensor_status_rsm5";
    public static final String          SENSOR_STATUS_RSM6                    = "sensor_status_rsm6";
    public static final String          SENSOR_STATUS_RSM7                    = "sensor_status_rsm7";
    public static final String          SENSOR_STATUS_RSM8                    = "sensor_status_rsm8";

    public static final String          SENSOR_STATUS_TRANSPORT_RSM1          = "sensor_status_transport_rsm1";
    public static final String          SENSOR_STATUS_TRANSPORT_RSM2          = "sensor_status_transport_rsm2";
    public static final String          SENSOR_STATUS_TRANSPORT_RSM3          = "sensor_status_transport_rsm3";
    public static final String          SENSOR_STATUS_TRANSPORT_RSM4          = "sensor_status_transport_rsm4";
    public static final String          SENSOR_STATUS_TRANSPORT_RSM5          = "sensor_status_transport_rsm5";
    public static final String          SENSOR_STATUS_TRANSPORT_RSM6          = "sensor_status_transport_rsm6";
    public static final String          SENSOR_STATUS_TRANSPORT_RSM7          = "sensor_status_transport_rsm7";
    public static final String          SENSOR_STATUS_TRANSPORT_RSM8          = "sensor_status_transport_rsm8";

    public static final String          SENSOR_STATUS_RSC                     = "sensor_status_rsc";
    public static final String          SENSOR_STATUS_RSM                     = "sensor_status_rsm";
    public static final String          SENSOR_STATUS_TRANSPORT_RSM           = "sensor_status_transport_rsm";

    public static final String          SENSOR_STATUS_NHM_DEVICE              = "sensor_status_nhm_device";
    public static final String          SENSOR_STATUS_NHM_FEEDER              = "sensor_status_nhm_feeder";
    public static final String          SENSOR_STATUS_NHM_INPUT               = "sensor_status_nhm_input";
    public static final String          SENSOR_STATUS_NHM_DIVERTER            = "sensor_status_nhm_diverter";
    public static final String          SENSOR_STATUS_NHM_TRANSPORT_SAFE      = "sensor_status_nhm_transport_safe";
    public static final String          SENSOR_STATUS_NHM_TRANSPORT_OUT       = "sensor_status_nhm_transport_out";
    public static final String          SENSOR_STATUS_NHM_TRANSPORT_STM       = "sensor_status_nhm_transport_stm";
    public static final String          SENSOR_STATUS_NHM_REJECT              = "sensor_status_nhm_reject";
    public static final String          SENSOR_STATUS_NHM_OUTPUT              = "sensor_status_nhm_output";
    public static final String          SENSOR_STATUS_SDA_DEVICE              = "sensor_status_sda_device";
    public static final String          SENSOR_STATUS_SSC_DEVICE              = "sensor_status_ssc_device";
    public static final String          SENSOR_STATUS_SSC_TRANSPORT_SAFE      = "sensor_status_ssc_transport_safe";

    public static final String          SENSOR_STATUS_TOOLTIP                 = "_tooltip";

    // one and done transactions
    public static final String          ONE_AND_DONE_FLAG                     = "-o";

    // note jam error (relevant for RBG100G)
    public static final int             NOTE_JAM_ERROR                        = 247;
    public static final int             ESCROW_NOTE_JAM                       = 298;
    public static final int             SAFE_DOOR_ERROR                       = 275;
    public static final int             COMMUNICATION_TIMEOUT_ERROR           = 210;

    // errors codes to skip the Correction screen and also update the
    // journal.counting_error db column
    public static final List< Integer > VERTERA_COUNTING_ERRORS               = Arrays.asList( 311,
                                                                                               312,
                                                                                               928 );

    // errors codes to run the CounterCorretion screen and also update the
    // journal.counting_error db column
    public static final List< Integer > RBG100G_COUNTING_ERRORS               = Arrays.asList( NOTE_JAM_ERROR );

    public static final int             INPUT_POCKET_NOT_EMPTY                = 55296;

    public static final String          GRAND_TOTAL_REQUESTED                 = "grand_total_requested_";
    public static final String          GRAND_TOTAL_DISPENSED                 = "grand_total_dispensed_";
    public static final String          GRAND_TOTAL_AVAILABLE                 = "grand_total_available_";
    public static final String          GRAND_TOTAL_EMPTIED                   = "grand_total_emptied_";
    public static final String          GRAND_TOTAL_LOADED                    = "grand_total_loaded_";
    public static final String          GRAND_TOTAL_DIFFERENCE                = "grand_total_difference_";
    public static final String          GRAND_TOTAL_NEW                       = "grand_total_new_";

    public static final String          TOTAL                                 = "total";
    public static final long            CLIENT_DISPLAY_FAST_DELAY             = 5000L;

    public static final int             DEVICE_CLAIMED_SUCCESSFULLY           = 0;
    public static final int             DEVICE_ALREADY_CLAIMED_BY_MYSELF      = 1;
    public static final int             DEVICE_CLAIMED_BY_ANOTHER_TRANSACTION = 2;
    public static final int             DEVICE_NOT_CLAIMED                    = 3;

    // MixNbr
    public static final int             NO_AUTOMIX                            = -1;
    public static final int             MINIMUM_NOTES                         = 0;

    // CashInfo
    public static final int             RADIO_AMOUNT                          = 0;
    public static final int             RADIO_COUNT                           = 1;

    public static final String          THRESHOLD_MODE_SENSOR                 = "eSensor";
    public static final String          THRESHOLD_MODE_COUNT_SENSOR           = "eNoteNumberOrSensor";
    public static final String          THRESHOLD_MODE_AMOUNT_SENSOR          = "eAmountOrSensor";
    public static final String          THRESHOLD_MODE_ALL                    = "eNoteNumberOrAmountOrSensor";

}
// -------------------------------------------------------------------------
// end of interface Constants
