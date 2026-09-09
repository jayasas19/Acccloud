SC

INSERT INTO STRDBA.apirequest
(apirequestid, apino, "filter", typename, description, example, required, apimasterid, objectname, isarray)
VALUES
((select max(apirequestid) +1 from apirequest), 1, 'soCreditTerm', 'Integer', 'จำนวนวันครบกำหนด', 10, 'Y', 47, 'saleConsignMasterFilter', 'N'),
((select max(apirequestid) +2 from apirequest), 2, 'soTotal', 'Decimal', 'จำนวนเงินทั้งหมด', 4745, 'Y', 47, 'saleConsignMasterFilter', 'N'),
((select max(apirequestid) +3 from apirequest), 3, 'soVatRate', 'Decimal', 'จำนวนภาษี %', 7, 'Y', 47, 'saleConsignMasterFilter', 'N'),
((select max(apirequestid) +4 from apirequest), 4, 'soVatAmt', 'Decimal', 'จำนวนภาษี', 0, 'Y', 47, 'saleConsignMasterFilter', 'N'),
((select max(apirequestid) +5 from apirequest), 5, 'soNetAmt', 'Decimal', 'จำนวนเงินสุทธิ', 4602.65, 'Y', 47, 'saleConsignMasterFilter', 'N'),
((select max(apirequestid) +6 from apirequest), 6, 'companyCode', 'String', 'รหัสบริษัท (ตัวพิมพ์ใหญ่)', '''TESTER01''', 'Y', 47, 'saleConsignMasterFilter', 'N'),
((select max(apirequestid) +7 from apirequest), 7, 'vatInclude', 'String', 'ภาษีรวมในมูลค่า', '''N''', 'Y', 47, 'saleConsignMasterFilter', 'N'),
((select max(apirequestid) +8 from apirequest), 8, 'soDiscountRate', 'Decimal', 'อัตราส่วนลด', 3, 'Y', 47, 'saleConsignMasterFilter', 'N'),
((select max(apirequestid) +9 from apirequest), 9, 'soDiscountAmt', 'Decimal', 'จำนวนส่วนลด', 142.35, 'Y', 47, 'saleConsignMasterFilter', 'N'),
((select max(apirequestid) +10 from apirequest), 10, 'exchangeRate', 'Decimal', 'อัตราแลกเปลี่ยน', 1, 'Y', 47, 'saleConsignMasterFilter', 'N'),
((select max(apirequestid) +11 from apirequest), 11, 'exchageRateDate', 'String', 'วันที่อัตราแลกเปลี่ยน', '''2024-05-02''', 'Y', 47, 'saleConsignMasterFilter', 'N'),
((select max(apirequestid) +12 from apirequest), 12, 'currencyCode', 'String', 'รหัสสกุลเงิน', '''THB''', 'Y', 47, 'saleConsignMasterFilter', 'N'),
((select max(apirequestid) +13 from apirequest), 13, 'documentGroupGroup', 'String', 'รหัสกลุ่มเอกสาร', '''00''', 'Y', 47, 'saleConsignMasterFilter', 'N'),
((select max(apirequestid) +14 from apirequest), 14, 'custCode', 'String', 'รหัสลูกค้า', '''00000001''', 'Y', 47, 'saleConsignMasterFilter', 'N'),
((select max(apirequestid) +15 from apirequest), 15, 'saleEmpMasterCode', 'String', 'รหัสพนักงาน', '''J007''', 'Y', 47, 'saleConsignMasterFilter', 'N'),
((select max(apirequestid) +16 from apirequest), 16, 'divisionCode', 'String', 'รหัสสาขา',  '''00''', 'Y', 47, 'saleConsignMasterFilter', 'N'),
((select max(apirequestid) +17 from apirequest), 17, 'sectionCode', 'String', 'รหัสแผนก',  '''00''', 'Y', 47, 'saleConsignMasterFilter', 'N'),
((select max(apirequestid) +18 from apirequest), 18, 'createByEmpCode', 'String', 'รหัสผู้สร้าง',  '''ADMIN''', 'Y', 47, 'saleConsignMasterFilter', 'N'),
((select max(apirequestid) +19 from apirequest), 19, 'divisionNo', 'String', 'รหัสสาขาของลูกค้า', '''00''', 'Y', 47, 'saleConsignMasterFilter', 'N'),
((select max(apirequestid) +20 from apirequest), 20, 'custDelivery', 'String', 'ที่อยู่จัดส่งลูกค้า', '''476 หมู่ที่ 4 ซอย 2บี ถนนสุขุมวิท ต.แพรกษา อ.เมืองสมุทรปราการ จ.สมุทรปราการ 10280''', 'Y', 47, 'saleConsignMasterFilter', 'N'),
((select max(apirequestid) +21 from apirequest), 21, 'jobCode', 'String', 'รหัสงาน',  '00', 'Y', 47, 'saleConsignMasterFilter', 'N'),
((select max(apirequestid) +22 from apirequest), 22, 'voucherMode', 'String', '', '''N''' 'Y', 47, 'saleConsignMasterFilter', 'N'),


INSERT INTO "STRDBA".apirequest
(apirequestid, apino, "filter", typename, description, example, required, apimasterid, objectname, isarray)
VALUES
((select max(apirequestid) +1 from apirequest), 1, 'prodCode', 'String', 'รหัสสินค้า', '''000000002''', 'Y', 47, 'saleConsignDetailFilter', 'Y'),
((select max(apirequestid) +2 from apirequest), 2, 'whCode', 'String', 'รหัสคลัง', '''00''', 'Y', 47, 'saleConsignDetailFilter', 'Y'),
((select max(apirequestid) +3 from apirequest), 3, 'prodVat', 'String', 'สินค้าคิดภาษี', '''N''', 'Y', 47, 'saleConsignDetailFilter', 'Y'),
((select max(apirequestid) +4 from apirequest), 4, 'unitOfMeasureCode', 'String', 'รหัสหน่วยนับ', '''002''', 'Y', 47, 'saleConsignDetailFilter', 'Y'),
((select max(apirequestid) +5 from apirequest), 5, 'prodConvFactor', 'Decimal', 'จำนวนต่อหน่วยนับ', 1, 'Y', 47, 'saleConsignDetailFilter', 'Y'),
((select max(apirequestid) +6 from apirequest), 6, 'prodQTY', 'Decimal', 'จำนวนสินค้า', 1, 'Y', 47, 'saleConsignDetailFilter', 'Y'),
((select max(apirequestid) +7 from apirequest), 7, 'prodPrice', 'Decimal', 'ราคาสินค้า', 4750, 'Y', 47, 'saleConsignDetailFilter', 'Y'),
((select max(apirequestid) +8 from apirequest), 8, 'prodDiscRate0', 'String', 'อัตราส่วนลด', '''5.0000''', 'Y', 47, 'saleConsignDetailFilter', 'Y'),
((select max(apirequestid) +9 from apirequest), 9, 'prodDiscAmt', 'Decimal', 'จำนวนส่วนลด', 5, 'Y', 47, 'saleConsignDetailFilter', 'Y'),
((select max(apirequestid) +10 from apirequest), 10, 'prodNetPrice', 'Decimal', 'ราคาสุทธิ', 4745, 'Y', 47, 'saleConsignDetailFilter', 'Y'),
((select max(apirequestid) +11 from apirequest), 11, 'prodBaseQty', 'Decimal', 'จำนวนสุทธิ', 1, 'Y', 47, 'saleConsignDetailFilter', 'Y'),
((select max(apirequestid) +12 from apirequest), 12, 'companyCode', 'String', 'รหัสบริษัท (ตัวพิมพ์ใหญ่)', '''TESTER01''', 'Y', 47, 'saleConsignDetailFilter', 'Y'),
((select max(apirequestid) +13 from apirequest), 13, 'prodQtyUse', 'Decimal', 'จำนวน', 1, 'Y', 47, 'saleConsignDetailFilter', 'Y');