50 DO

INSERT INTO "STRDBA".apirequest
(apirequestid, apino, "filter", typename, description, example, required, apimasterid, objectname, isarray)
VALUES((select max(apirequestid) +1 from apirequest), 1, 'doCreditTerm', 'Decimal', 'จำนวนวันที่ครบกำหนดชำระ', 30, 'Y', 50, 'deliveryOrderMasterFilter', 'N'),
((select max(apirequestid) +2 from apirequest), 2, 'doTotal', 'Decimal', 'จำนวนเงิน', 4512.5, 'Y', 50, 'deliveryOrderMasterFilter', 'N'),
((select max(apirequestid) +3 from apirequest), 3, 'doDiscRate', 'Decimal', 'อัตราส่วนลด', 3, 'N', 50, 'deliveryOrderMasterFilter', 'N'),
((select max(apirequestid) +4 from apirequest), 4, 'doDiscAmt', 'Decimal', 'จำนวนส่วนลด', 0, 'N', 50, 'deliveryOrderMasterFilter', 'N'),
((select max(apirequestid) +5 from apirequest), 5, 'doDepositNo', 'String', 'เลขที่มัดจำ', 'DR-XX-XXXX/XXXX', 'N', 50, 'deliveryOrderMasterFilter', 'N'),
((select max(apirequestid) +6 from apirequest), 6, 'doDepositAmt', 'Decimal', 'จำนวนเงินมัดจำ', 0, 'N', 50, 'deliveryOrderMasterFilter', 'N'),
((select max(apirequestid) +7 from apirequest), 7, 'doVatRate', 'Decimal', 'อัตราภาษี', 7, 'Y', 50, 'deliveryOrderMasterFilter', 'N'),
((select max(apirequestid) +8 from apirequest), 8, 'doVatAmt', 'Decimal', 'ภาษี', 135.38, 'Y', 50, 'deliveryOrderMasterFilter', 'N'),
((select max(apirequestid) +9 from apirequest), 9, 'doNetAmt', 'Decimal', 'จำนวนเงินสุทธิ', 4377.12, 'Y', 50, 'deliveryOrderMasterFilter', 'N'),
((select max(apirequestid) +10 from apirequest), 10, 'vatInclude', 'String', 'ภาษีรวมในมูลค่า', 'N', 'Y', 50, 'deliveryOrderMasterFilter', 'N'),
((select max(apirequestid) +11 from apirequest), 11, 'companyCode', 'String', 'รหัสบริษัท (ตัวพิมพ์ใหญ่)', 'TESTER01', 'Y', 50, 'deliveryOrderMasterFilter', 'N'),
((select max(apirequestid) +12 from apirequest), 12, 'exchangeRate', 'Decimal', 'อัตราแลกเปลี่ยน', 1, 'Y', 50, 'deliveryOrderMasterFilter', 'N'),
((select max(apirequestid) +13 from apirequest), 13, 'exchageRateDate', 'String', 'วันที่อัตราแลกเปลี่ยน', '2024-05-02', 'Y', 50, 'deliveryOrderMasterFilter', 'N'),
((select max(apirequestid) +14 from apirequest), 14, 'divisionNo', 'String', 'สาขาลูกค้า', '00', 'Y', 50, 'deliveryOrderMasterFilter', 'N'),
((select max(apirequestid) +15 from apirequest), 15, 'taxIdNo', 'String', 'หมายเลขประจำตัวผู้เสียภาษี', '0115531000684', 'Y', 50, 'deliveryOrderMasterFilter', 'N'),
((select max(apirequestid) +16 from apirequest), 16, 'doDueDate', 'String', 'วันที่ครบกำหนด', '2024-06-01', 'Y', 50, 'deliveryOrderMasterFilter', 'N'),
((select max(apirequestid) +17 from apirequest), 17, 'currencyCode', 'String', 'รหัสสกุลเงิน', 'THB', 'Y', 50, 'deliveryOrderMasterFilter', 'N'),
((select max(apirequestid) +18 from apirequest), 18, 'documentGroupCode', 'String', 'รหัสกลุ่มลูกค้า', '00', 'Y', 50, 'deliveryOrderMasterFilter', 'N'),
((select max(apirequestid) +19 from apirequest), 19, 'custCode', 'String', 'รหัสลูกค้า', '00000001', 'Y', 50, 'deliveryOrderMasterFilter', 'N'),
((select max(apirequestid) +20 from apirequest), 20, 'empCode', 'String', 'รหัสพนักงาน', 'J007', 'Y', 50, 'deliveryOrderMasterFilter', 'N'),
((select max(apirequestid) +21 from apirequest), 21, 'divisionCode', 'String', 'รหัสสาขา', '00', 'Y', 50, 'deliveryOrderMasterFilter', 'N'),
((select max(apirequestid) +22 from apirequest), 22, 'sectionCode', 'String', 'รหัสแผนก', '00', 'Y', 50, 'deliveryOrderMasterFilter', 'N'),
((select max(apirequestid) +23 from apirequest), 23, 'createByEmpCode', 'String', 'รหัสผู้สร้างเอกสาร', 'ADMIN', 'Y', 50, 'deliveryOrderMasterFilter', 'N'),
((select max(apirequestid) +24 from apirequest), 24, 'dueDate', 'String', 'วันที่ครบกำหนด', '2024-06-01', 'Y', 50, 'deliveryOrderMasterFilter', 'N'),
((select max(apirequestid) +25 from apirequest), 25, 'depositVat', 'String', 'ภาษีมัดจำ', '', 'N', 50, 'deliveryOrderMasterFilter', 'N'),
((select max(apirequestid) +26 from apirequest), 26, 'checkLot', 'String', 'ใช้ระบบ Lot', 'N', 'N', 50, 'deliveryOrderMasterFilter', 'N'),
((select max(apirequestid) +27 from apirequest), 27, 'jobeCode', 'String', 'รหัสงาน', '00', 'Y', 50, 'deliveryOrderMasterFilter', 'N');

INSERT INTO "STRDBA".apirequest
(apirequestid, apino, "filter", typename, description, example, required, apimasterid, objectname, isarray)
VALUES
((select max(apirequestid) +1 from apirequest), 1, 'prodCode', 'String', 'รหัสสินค้า', '000000002', 'Y', 50, 'deliveryOrderDetailFilter', 'N'),
((select max(apirequestid) +2 from apirequest), 2, 'whCode', 'String', 'รหัสคลัง', '00', 'Y', 50, 'deliveryOrderDetailFilter', 'N'),
((select max(apirequestid) +3 from apirequest), 3, 'prodVat', 'String', 'คิดภาษี', 'N', 'Y', 50, 'deliveryOrderDetailFilter', 'N'),
((select max(apirequestid) +4 from apirequest), 4, 'unitCode', 'String', 'รหัสหน่วยนับ', '002', 'Y', 50, 'deliveryOrderDetailFilter', 'N'),
((select max(apirequestid) +5 from apirequest), 5, 'prodConvFactor', 'String', 'ตัวคูณ', 1, 'Y', 50, 'deliveryOrderDetailFilter', 'N'),
((select max(apirequestid) +6 from apirequest), 6, 'prodQTY', 'String', 'จำนวนสินค้า', 1, 'Y', 50, 'deliveryOrderDetailFilter', 'N'),
((select max(apirequestid) +7 from apirequest), 7, 'prodPrice', 'String', 'ราคาสินค้า', 4750, 'Y', 50, 'deliveryOrderDetailFilter', 'N'),
((select max(apirequestid) +8 from apirequest), 8, 'prodDiscRate0', 'String', 'ส่วนลด %', '5%', 'Y', 50, 'deliveryOrderDetailFilter', 'N'),
((select max(apirequestid) +9 from apirequest), 9, 'prodDiscAmt', 'String', 'ส่วนลด', 237.5, 'Y', 50, 'deliveryOrderDetailFilter', 'N'),
((select max(apirequestid) +10 from apirequest), 10, 'prodNetPrice', 'String', 'ราคาสินค้าสุทธิ', 4512.5, 'Y', 50, 'deliveryOrderDetailFilter', 'N'),
((select max(apirequestid) +11 from apirequest), 11, 'prodBaseQTY', 'String', 'จำนวนสินค้าสุทธิ', 1, 'Y', 50, 'deliveryOrderDetailFilter', 'N'),
((select max(apirequestid) +12 from apirequest), 12, 'sendDate', 'String', 'วันที่ส่ง', '2024-05-02', 'N', 50, 'deliveryOrderDetailFilter', 'N'),
((select max(apirequestid) +13 from apirequest), 13, 'companyCode', 'String', 'รหัสบริษัท (ตัวพิมพ์ใหญ่)', 'TESTER01', 'Y', 50, 'deliveryOrderDetailFilter', 'N'),
((select max(apirequestid) +14 from apirequest), 14, 'jobCode', 'String', 'รหัสงาน', '00', 'Y', 50, 'deliveryOrderDetailFilter', 'N');



{
    "deliveryOrderMasterFilter": {
    "doCreditTerm": 30,
    "doTotal": 4512.5,
    "doTotalNoVat": 4512.5,
    "doDiscRate": 3,
    "doDiscAmt": 135.38,
    "doDepositNo": "",
    "doDepositAmt": 0,
    "doVatRate": 7,
    "doVatAmt": 0,
    "doNetAmt": 4377.12,
    "vatInclude": "N",
    "companyCode": "TESTER01",
    "doProdNetAmt": 4377.12,
    "exchangeRate": 1,
    "exchageRateDate": "2024-05-02",
    "divisionNo": "00",
    "taxIdNo": "0115531000684",
    "doDueDate": "2024-06-01",
    "currencyId": 8129,
    "currencyCode": "THB",
    "documentGroupCode": "00",
    "custCode": "00000001",
    "empCode": "J007",
    "divisionCode": "00",
    "sectionCode": "00",
    "createByEmpCode": "ADMIN",
    "dueDate": "2024-06-01",
    "depositVat": "",
    "checkLot": "N",
    "vatDrs": "0",
    "vatRateDrs": null,
    "amountDrs": "",
    "vatIncludeDrs": "",
    "billingDate": "2024-06-01",
    "custDelivery": "TestTestTestTestTest",
    "jobeCode": "00"
    },
    "deliveryOrderDetailFilter": [
    {
        "prodCode": "000000002",
        "whCode": "00",
        "prodVat": "N",
        "unitCode": "002",
        "prodConvFactor": 1,
        "prodQTY": 1,
        "prodPrice": 4750,
        "prodDiscRate0": "5%",
        "prodDiscAmt": 237.5,
        "prodNetPrice": 4512.5,
        "prodBaseQTY": 1,
        "sendDate": "2024-05-02",
        "companyCode": "TESTER01",
        "jobCode": "00"
    }
    ]
}