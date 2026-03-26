SPO

INSERT INTO "STRDBA".apirequest
(apirequestid, apino, "filter", typename, description, example, required, apimasterid, objectname, isarray)
VALUES
((select max(apirequestid) +1 from apirequest), 1, 'posTotal', 'String', 'จำนวนเงินทั้งหมด', 500,  'Y', 52, 'poServiceMasterFilter', 'N'),
((select max(apirequestid) +2 from apirequest), 2, 'posTotalNovat', 'String', '', 0,  'Y', 52, 'poServiceMasterFilter', 'N'),
((select max(apirequestid) +3 from apirequest), 3, 'posDiscRate', 'String', 'อัตราส่วนลด', 0,  'Y', 52, 'poServiceMasterFilter', 'N'),
((select max(apirequestid) +4 from apirequest), 4, 'posDiscAmt', 'String', 'ส่วนลด', 0,  'Y', 52, 'poServiceMasterFilter', 'N'),
((select max(apirequestid) +5 from apirequest), 5, 'posVatRate', 'String', 'อัตราภาษี', 7,  'Y', 52, 'poServiceMasterFilter', 'N'),
((select max(apirequestid) +6 from apirequest), 6, 'posVatAmt', 'String', 'ภาษี', 35,  'Y', 52, 'poServiceMasterFilter', 'N'),
((select max(apirequestid) +7 from apirequest), 7, 'posNetAmt', 'String', 'จำนวนเงินสุทธิ', 535,  'Y', 52, 'poServiceMasterFilter', 'N'),
((select max(apirequestid) +8 from apirequest), 8, 'posRemark', 'String', 'หมายเหตุ', 'remark',  'Y', 52, 'poServiceMasterFilter', 'N'),
((select max(apirequestid) +9 from apirequest), 9, 'posLinkDocNo', 'String', '', 'N',  'Y', 52, 'poServiceMasterFilter', 'N'),
((select max(apirequestid) +10 from apirequest), 10, 'companyCode', 'String', 'รหัสบริษัท (ตัวพิมพ์ใหญ่)', 'TESTER01',  'Y', 52, 'poServiceMasterFilter', 'N'),
((select max(apirequestid) +11 from apirequest), 11, 'vatInclude', 'String', 'ภาษีรวมอยู่ในมูลค่า', 'N',  'Y', 52, 'poServiceMasterFilter', 'N'),
((select max(apirequestid) +12 from apirequest), 12, 'exchangeRate', 'String', 'อัตราแลกเปลี่ยน', 1,  'Y', 52, 'poServiceMasterFilter', 'N'),
((select max(apirequestid) +13 from apirequest), 13, 'exchageRateDate', 'String', 'วันที่อัตราแลกเปลี่ยน', '2024-05-02',  'Y', 52, 'poServiceMasterFilter', 'N'),
((select max(apirequestid) +14 from apirequest), 14, 'currencyCode', 'String', 'รหัสสกุลเงิน', 'THB',  'Y', 52, 'poServiceMasterFilter', 'N'),
((select max(apirequestid) +15 from apirequest), 15, 'documentGroupGroup', 'String', 'รหัสกลุ่มเอกสาร', '00',  'Y', 52, 'poServiceMasterFilter', 'N'),
((select max(apirequestid) +16 from apirequest), 16, 'suppCode', 'String', 'รหัสผู้จำหน่าย', '000',  'Y', 52, 'poServiceMasterFilter', 'N'),
((select max(apirequestid) +17 from apirequest), 17, 'empCode', 'String', 'รหัสพักงาน', 'ADMIN',  'Y', 52, 'poServiceMasterFilter', 'N'),
((select max(apirequestid) +18 from apirequest), 18, 'divisionCode', 'String', 'รหัสสาขา',  '00',  'Y', 52, 'poServiceMasterFilter', 'N'),
((select max(apirequestid) +19 from apirequest), 19, 'sectionCode', 'String', 'รหัสแผนก',  '00',  'Y', 52, 'poServiceMasterFilter', 'N'),
((select max(apirequestid) +20 from apirequest), 20, 'createByEmpCode', 'String', 'รหัสผู้สร้าง',  'ADMIN',  'Y', 52, 'poServiceMasterFilter', 'N'),
((select max(apirequestid) +21 from apirequest), 21, 'suppDivisionNo', 'String', 'รหัสสาขาของผู้จำหน่าย', '00',  'Y', 52, 'poServiceMasterFilter', 'N'),
((select max(apirequestid) +22 from apirequest), 22, 'jobCode', 'String', 'รหัสงาน',  '00',  'Y', 52, 'poServiceMasterFilter', 'N');

INSERT INTO "STRDBA".apirequest
(apirequestid, apino, "filter", typename, description, example, required, apimasterid, objectname, isarray)
VALUES
((select max(apirequestid) +1 from apirequest), 1, 'serviceCode', 'String', 'รหัสบริการ', '000000', 'Y', 52, 'poServiceDetailFilter', 'N'),
((select max(apirequestid) +2 from apirequest), 2, 'serviceUnit', 'String', 'รหัสหน่วยนับ', '00', 'Y', 52, 'poServiceDetailFilter', 'N'),
((select max(apirequestid) +3 from apirequest), 3, 'serviceVat', 'String', 'คิดภาษี', 'Y', 'Y', 52, 'poServiceDetailFilter', 'N'),
((select max(apirequestid) +4 from apirequest), 4, 'serviceQTY', 'String', 'จำนวนบนิการ', 1, 'Y', 52, 'poServiceDetailFilter', 'N'),
((select max(apirequestid) +5 from apirequest), 5, 'servicePrice', 'String', 'ราคาบริการ', 500, 'Y', 52, 'poServiceDetailFilter', 'N'),
((select max(apirequestid) +6 from apirequest), 6, 'serviceDiscRate0', 'String', 'อัตราภาษี %', '0%', 'Y', 52, 'poServiceDetailFilter', 'N'),
((select max(apirequestid) +7 from apirequest), 7, 'serviceDiscAmt', 'String', 'จำนวนส่วนลด', 0, 'Y', 52, 'poServiceDetailFilter', 'N'),
((select max(apirequestid) +8 from apirequest), 8, 'serviceNetPrice', 'String', 'ราคาสุทธิ', 500, 'Y', 52, 'poServiceDetailFilter', 'N'),
((select max(apirequestid) +10 from apirequest), 10, 'serviceDiscRate', 'String', 'อัตราภาษี', 0, 'Y', 52, 'poServiceDetailFilter', 'N'),
((select max(apirequestid) +11 from apirequest), 11, 'companyCode', 'String', 'รหัสบริษัท (ตัวพิมพ์ใหญ่)', 'TESTER01', 'Y', 52, 'poServiceDetailFilter', 'N'),
((select max(apirequestid) +13 from apirequest), 13, 'docRefNo', 'String', 'เอกสารอ้างอิง', 'SPR-XX-XXXX/XXXX', 'N', 52, 'poServiceDetailFilter', 'N'),
((select max(apirequestid) +14 from apirequest), 14, 'sprDocIndex', 'String', 'แถวของเอกสารอ้างอิง', '1', 'N', 52, 'poServiceDetailFilter', 'N'),
((select max(apirequestid) +15 from apirequest), 15, 'divisionCode', 'String', 'รหัสสาขา', '00', 'Y', 52, 'poServiceDetailFilter', 'N'),
((select max(apirequestid) +16 from apirequest), 16, 'sectionCode', 'String', 'รหัสแผนก', '00', 'Y', 52, 'poServiceDetailFilter', 'N'),
((select max(apirequestid) +17 from apirequest), 17, 'serviceReceivePrice', 'String', 'จำนวนบริการรับ', 0, 'N', 52, 'poServiceDetailFilter', 'N'),
((select max(apirequestid) +18 from apirequest), 18, 'serviceReceiveDate', 'String', 'วันที่รับบริการ', '2024-05-09', 'Y', 52, 'poServiceDetailFilter', 'N'),
((select max(apirequestid) +19 from apirequest), 19, 'jobCode', 'String', 'รหัสงาน', '00', 'Y', 52, 'poServiceDetailFilter', 'N');