39 insert supplier

INSERT INTO "STRDBA".apirequest
(apirequestid, apino, "filter", typename, description, example, required, apimasterid, objectname, isarray)
VALUES
((select max(apirequestid) +1 from apirequest), 1, 'suppCode', 'String', 'รหัสผู้จำหน่าย', 'TESTSUPPAPI2345', 'Y', 39, 'supplierMasterFilter', 'N'),
((select max(apirequestid) +2 from apirequest), 2, 'suppTName', 'String', 'ชื่อผู้จำหน่าย', 'ทดสอบ ', 'Y', 39, 'supplierMasterFilter', 'N'),
((select max(apirequestid) +3 from apirequest), 3, 'suppEName', 'String', 'ชื่อผู้จำหน่าย Eng', 'test sup', 'Y', 39, 'supplierMasterFilter', 'N'),
((select max(apirequestid) +4 from apirequest), 4, 'suppIdNo', 'String', 'invoice no', 'invoice no', 'Y', 39, 'supplierMasterFilter', 'N'),
((select max(apirequestid) +5 from apirequest), 5, 'suppCurrentBalance', 'String', 'ยอดคงเหลือปัจจุบัน', 0, 'Y', 39, 'supplierMasterFilter', 'N'),
((select max(apirequestid) +6 from apirequest), 6, 'suppStatus', 'String', 'สถานะ', 'N', 'Y', 39, 'supplierMasterFilter', 'N'),
((select max(apirequestid) +7 from apirequest), 7, 'suppAllowOver', 'String', 'อนุญาติเกิดวงเงิน', 'Y', 'Y', 39, 'supplierMasterFilter', 'N'),
((select max(apirequestid) +8 from apirequest), 8, 'companyCode', 'String', 'รหัสบริษัท (ตัวพิมพ์ใหญ่)', 'TESTER01', 'Y', 39, 'supplierMasterFilter', 'N'),
((select max(apirequestid) +9 from apirequest), 9, 'defaultC', 'String', 'defaultC', 'Y', 'Y', 39, 'supplierMasterFilter', 'N'),
((select max(apirequestid) +10 from apirequest), 10, 'currencyCode', 'String', 'รหัสสกุลเงิน', 'THB', 'Y', 39, 'supplierMasterFilter', 'N'),
((select max(apirequestid) +11 from apirequest), 11, 'supplierPassword', 'String', 'รหัสผ่าน', '123456', 'Y', 39, 'supplierMasterFilter', 'N'),
((select max(apirequestid) +12 from apirequest), 12, 'leadTime', 'Decimal', 'ระยะเวลาดำเนินการ', 31, 'Y', 39, 'supplierMasterFilter', 'N'),
((select max(apirequestid) +13 from apirequest), 13, 'supplierGrade', 'String', 'เกรด', 'A', 'Y', 39, 'supplierMasterFilter', 'N'),
((select max(apirequestid) +14 from apirequest), 14, 'createByCode', 'String', 'รหัสผู้สร้าง', 'ADMIN', 'Y', 39, 'supplierMasterFilter', 'N'),
((select max(apirequestid) +15 from apirequest), 15, 'remark', 'String', 'หมายเหตุ', 'remark', 'Y', 39, 'supplierMasterFilter', 'N'),
((select max(apirequestid) +16 from apirequest), 16, 'remark1', 'String', 'หมายเหตุ 1', '', 'Y', 39, 'supplierMasterFilter', 'N'),
((select max(apirequestid) +17 from apirequest), 17, 'suppGroupCode', 'String', 'รหัสกลุ่มผู้จำหน่าย', '001', 'Y', 39, 'supplierMasterFilter', 'N'),
((select max(apirequestid) +18 from apirequest), 18, 'accountCode', 'String', 'รหัสบัญชี', '21100', 'Y', 39, 'supplierMasterFilter', 'N'),
((select max(apirequestid) +19 from apirequest), 19, 'bankBranchNumber', 'String', 'สาขาธนาคาร', '1511', 'Y', 39, 'supplierMasterFilter', 'N'),
((select max(apirequestid) +20 from apirequest), 20, 'bankAccountNumber', 'String', 'เลขที่บัญชีธนาคาร', '01122412535', 'Y', 39, 'supplierMasterFilter', 'N'),
((select max(apirequestid) +21 from apirequest), 21, 'billingStatus', 'String', 'สถานะการเรียกเก็บเงิน', 'N', 'Y', 39, 'supplierMasterFilter', 'N'),
((select max(apirequestid) +22 from apirequest), 22, 'billingDate', 'String', 'วันที่เรียกเก็บเงิน', '2', 'Y', 39, 'supplierMasterFilter', 'N'),
((select max(apirequestid) +23 from apirequest), 23, 'email', 'String', 'อีเมล', 'test@email', 'Y', 39, 'supplierMasterFilter', 'N'),
((select max(apirequestid) +24 from apirequest), 24, 'bankCode', 'String', 'รหัสธนาคาร', 'BBL', 'Y', 39, 'supplierMasterFilter', 'N'),
((select max(apirequestid) +25 from apirequest), 25, 'bankTName', 'String', 'ชื่อธนาคาร', 'กรุงเทพ', 'Y', 39, 'supplierMasterFilter', 'N'),
((select max(apirequestid) +26 from apirequest), 26, 'suppBankName', 'String', 'ชื่อธนาคารผู้จำหน่าย', 'bank name4', 'Y', 39, 'supplierMasterFilter', 'N');

INSERT INTO "STRDBA".apirequest
(apirequestid, apino, "filter", typename, description, example, required, apimasterid, objectname, isarray)
VALUES
((select max(apirequestid) +1 from apirequest), 1, 'houseNoStreet', 'String', 'ที่อยู่', '1/11 moo 1 Bangsue Bangsue Bangkok 11140', 'N', 39, 'addressFilter', 'N'),
((select max(apirequestid) +2 from apirequest), 2, 'telNo', 'String', 'เบอร์โทร', '0999992329', 'N', 39, 'addressFilter', 'N'),
((select max(apirequestid) +3 from apirequest), 3, 'faxNo', 'String', 'แฟกซ์', '0991124212', 'N', 39, 'addressFilter', 'N'),
((select max(apirequestid) +4 from apirequest), 4, 'companyCode', 'String', 'รหัสบริษัท (ตัวพิมพ์ใหญ่)', 'TESTER01', 'Y', 39, 'addressFilter', 'N');

INSERT INTO "STRDBA".apirequest
(apirequestid, apino, "filter", typename, description, example, required, apimasterid, objectname, isarray)
VALUES
((select max(apirequestid) +1 from apirequest), 1, 'suppCreditTerm', 'String', 'จำนวนเครดิต', 999999999, 'Y', 39, 'supplierCreditFilter', 'N'),
((select max(apirequestid) +2 from apirequest), 2, 'suppCreditDay', 'String', 'วันที่เครดิต', 30, 'Y', 39, 'supplierCreditFilter', 'N'),
((select max(apirequestid) +3 from apirequest), 3, 'companyCode', 'String', 'รหัสบริษัท (ตัวพิมพ์ใหญ่)', 'TESTER01', 'Y', 39, 'supplierCreditFilter', 'N');

INSERT INTO "STRDBA".apirequest
(apirequestid, apino, "filter", typename, description, example, required, apimasterid, objectname, isarray)
VALUES
((select max(apirequestid) +1 from apirequest), 1, 'suppContPer', 'String', 'ชื่อผู้ติดต่อ', 'contact name', 'N', 39, 'supplierCreditFilter', 'N'),
((select max(apirequestid) +2 from apirequest), 2, 'companyCode', 'String', 'รหัสบริษัท (ตัวพิมพ์ใหญ่)', 'TESTER01', 'Y', 39, 'supplierContactFilter', 'N');

    "supplierCreditFilter": {
    },
    "supplierContactFilter": {
      "suppContPer": "contact name",
      "companyCode": "TESTER01"
    }
[
  {
    "supplierMasterFilter": {
      "suppCode": "TESTSUPPAPI2345",
      "suppTName": "ทดสอบ ",
      "suppEName": "test sup",
      "suppIdNo": "invoice no",
      "suppCurrentBalance": 0,
      "suppStatus": "N",
      "suppAllowOver": "Y",
      "companyCode": "TESTER01",
      "defaultC": "Y",
      "currencyCode": "THB",
      "supplierPassword": "123456",
      "leadTime": 31,
      "supplierGrade": "A",
      "createByCode": "ADMIN",
      "updateByCode": "ADMIN",
      "remark": "remark",
      "remark1": "",
      "suppGroupCode": "001",
      "accountCode": "21100",
      "bankBranchNumber": "1511",
      "bankAccountNumber": "01122412535",
      "billingStatus": "N",
      "billingDate": "2",
      "email": "test@email",
      "bankCode": "BBL",
      "bankTName": "กรุงเทพ",
      "suppBankName": "bank name4"
    },
    "addressFilter": {
      "houseNoStreet": "1/11 moo 1 Bangsue Bangsue Bangkok 11140",
      "telNo": "0999992329",
      "faxNo": "0991124212",
      "companyCode": "TESTER01"
    },
    "supplierCreditFilter": {
      "suppCreditTerm": 999999999,
      "suppCreditDay": 30,
      "companyCode": "TESTER01"
    },
    "supplierContactFilter": {
      "suppContPer": "contact name",
      "companyCode": "TESTER01"
    }
  }
]