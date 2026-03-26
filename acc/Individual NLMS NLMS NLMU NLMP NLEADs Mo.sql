Individual NLMS NLMS NLMU NLMP NLEADs Mortgage

Individual NLAS NLAS NLAU NLAP NLEADs Auto

Individual NLUS NLUS NLUU NLUP NLEADs Unsecure

Juristic NLDS NLDS NLDU NLDP NLEADs Mortgage

Juristic NLDS NLDS NLDU NLDP NLEADs Auto
 

-- sit
insert into con_config_app_code (app_code, target_app_code, app_name, mcs, bweb, rating, active)
values
('NLMS', 'NLMP', 'Individual NLEADs Mortgage', 'N', 'N', 'N', 'Y'),
('NLAS', 'NLAP', 'Individual NLEADs Auto', 'N', 'N', 'N', 'Y'),
('NLUS', 'NLUP', 'Individual NLEADs Unsecure', 'N', 'N', 'N', 'Y');

INSERT INTO  mas_key_value
(GROUP_NAME, KEY_NAME, key_value, ACTIVE_FLAG, CREATE_BY, CREATE_DATE, CREATE_TIME, UPDATE_BY, UPDATE_DATE, UPDATE_TIME)
VALUES
('APPLICATION_CODE','NLDS','NLDS','Y','SYSTEM',current_date(),current_time(),'SYSTEM',current_date(),current_time());

-- uat
insert into con_config_app_code (app_code, target_app_code, app_name, mcs, bweb, rating, active)
values
('NLMU', 'NLMP', 'Individual NLEADs Mortgage', 'N', 'N', 'N', 'Y'),
('NLAU', 'NLAP', 'Individual NLEADs Auto', 'N', 'N', 'N', 'Y'),
('NLUU', 'NLUP', 'Individual NLEADs Unsecure', 'N', 'N', 'N', 'Y');

INSERT INTO  mas_key_value
(GROUP_NAME, KEY_NAME, key_value, ACTIVE_FLAG, CREATE_BY, CREATE_DATE, CREATE_TIME, UPDATE_BY, UPDATE_DATE, UPDATE_TIME)
VALUES
('APPLICATION_CODE','NLDU','NLDU','Y','SYSTEM',current_date(),current_time(),'SYSTEM',current_date(),current_time());

-- prod
insert into con_config_app_code (app_code, target_app_code, app_name, mcs, bweb, rating, active)
values
('NLMP', 'NLMP', 'Individual NLEADs Mortgage', 'N', 'N', 'N', 'Y'),
('NLAP', 'NLAP', 'Individual NLEADs Auto', 'N', 'N', 'N', 'Y'),
('NLUP', 'NLUP', 'Individual NLEADs Unsecure', 'N', 'N', 'N', 'Y');

INSERT INTO  mas_key_value
(GROUP_NAME, KEY_NAME, key_value, ACTIVE_FLAG, CREATE_BY, CREATE_DATE, CREATE_TIME, UPDATE_BY, UPDATE_DATE, UPDATE_TIME)
VALUES
('APPLICATION_CODE','NLDP','NLDP','Y','SYSTEM',current_date(),current_time(),'SYSTEM',current_date(),current_time());


INSERT INTO mas_key_value (group_name, key_name, key_value, active_flag, create_by, create_date, create_time, update_by, update_date, update_time) VALUES('JURISTIC_CALL_BACK_URL', 'NLDS', 'https://proxy.nleadssit.se.scb.co.th/api/runtime/process?workflowName=INT_v1_customerservices_commercial_cbos_callback ', 'Y', 'SYSTEM', CURDATE(), CURRENT_TIME(), 'SYSTEM', CURDATE(), CURRENT_TIME());

INSERT INTO mas_key_value (group_name, key_name, key_value, active_flag, create_by, create_date, create_time, update_by, update_date, update_time) VALUES('JURISTIC_CALL_BACK_KEY', 'NLDS', '76b02b67-b215-4080-bcc6-38ed4753ba2e', 'Y', 'SYSTEM', CURDATE(), CURRENT_TIME(), 'SYSTEM', CURDATE(), CURRENT_TIME());

INSERT INTO mas_key_value (group_name, key_name, key_value, active_flag, create_by, create_date, create_time, update_by, update_date, update_time) VALUES('JURISTIC_CALL_BACK_SECRET', 'NLDS', '522af3a3-c206-4e3a-9fe3-124a8659462d', 'Y', 'SYSTEM', CURDATE(), CURRENT_TIME(), 'SYSTEM', CURDATE(), CURRENT_TIME());

INSERT INTO con_config_close_loop (app_code, is_close_loop, save_as_trans) VALUES ('NLMS', 'Y', 'Y');
INSERT INTO con_config_close_loop (app_code, is_close_loop, save_as_trans) VALUES ('NLAS', 'Y', 'Y');
INSERT INTO con_config_close_loop (app_code, is_close_loop, save_as_trans) VALUES ('NLUS', 'Y', 'Y');

INSERT INTO con_config_close_loop (app_code, is_close_loop, save_as_trans) VALUES ('NLMU', 'Y', 'Y');
INSERT INTO con_config_close_loop (app_code, is_close_loop, save_as_trans) VALUES ('NLAU', 'Y', 'Y');
INSERT INTO con_config_close_loop (app_code, is_close_loop, save_as_trans) VALUES ('NLUU', 'Y', 'Y');

INSERT INTO con_config_close_loop (app_code, is_close_loop, save_as_trans) VALUES ('NLMP', 'Y', 'Y');
INSERT INTO con_config_close_loop (app_code, is_close_loop, save_as_trans) VALUES ('NLAP', 'Y', 'Y');
INSERT INTO con_config_close_loop (app_code, is_close_loop, save_as_trans) VALUES ('NLUP', 'Y', 'Y');
