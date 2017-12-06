package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcbq
  extends zche
{
  zcbq(PivotTable paramPivotTable, int paramInt)
    throws Exception
  {
    this.d = 280;
    int i = 32;
    byte[] arrayOfByte = { -1, -1, -1, -1 };
    String str = paramPivotTable.b.g;
    if (str != null) {
      i += str.length() * 2 + 4;
    }
    str = paramPivotTable.b.h;
    if (str != null) {
      i += str.length() * 2 + 4;
    }
    str = paramPivotTable.getErrorString();
    if ((str != null) && (str.length() != 0)) {
      i += str.length() * 2 + 4;
    }
    str = paramPivotTable.getNullString();
    if ((str != null) && (str.length() != 0)) {
      i += str.length() * 2 + 4;
    }
    str = paramPivotTable.getPivotTableStyleName();
    if (str != null) {
      i += str.length() * 2 + 4;
    }
    str = paramPivotTable.getTag();
    if (str != null) {
      i += str.length() * 2 + 4;
    }
    str = paramPivotTable.getColumnHeaderCaption();
    if (str != null) {
      i += str.length() * 2 + 4;
    }
    str = paramPivotTable.getRowHeaderCaption();
    if (str != null) {
      i += str.length() * 2 + 4;
    }
    this.c = new byte[i];
    int j = 0;
    int k = 0;
    int m = 0;
    if (paramPivotTable.getDisplayImmediateItems()) {
      j |= 0x100;
    }
    if (paramPivotTable.O) {
      j |= 0x200;
    }
    if (!paramPivotTable.getEnableFieldList()) {
      j |= 0x400;
    }
    if (!paramPivotTable.getShowDrill()) {
      j |= 0x100000;
    }
    if (paramPivotTable.getPrintDrill()) {
      j |= 0x200000;
    }
    if (paramPivotTable.getShowMemberPropertyTips()) {
      j |= 0x400000;
    }
    if (!paramPivotTable.getShowDataTips()) {
      j |= 0x800000;
    }
    int n = 0;
    n = (byte)(n | (byte)paramPivotTable.C);
    if (!paramPivotTable.getShowRowHeaderCaption()) {
      n = (byte)(n | 0x80);
    }
    if (paramPivotTable.getShowEmptyRow()) {
      k |= 0x4;
    }
    if (paramPivotTable.getShowEmptyCol()) {
      k |= 0x8;
    }
    if (paramPivotTable.getEnableWizard()) {
      k |= 0x10;
    }
    if (paramPivotTable.getEnableDrilldown()) {
      k |= 0x20;
    }
    if (paramPivotTable.getEnableFieldDialog()) {
      k |= 0x40;
    }
    if (paramPivotTable.getPreserveFormatting()) {
      k |= 0x80;
    }
    if (paramPivotTable.isAutoFormat()) {
      k |= 0x100;
    }
    if (paramPivotTable.getDisplayErrorString()) {
      k |= 0x200;
    }
    if (paramPivotTable.getDisplayNullString()) {
      k |= 0x400;
    }
    if (paramPivotTable.getPageFieldOrder() == 1) {
      k |= 0x800;
    }
    if (paramPivotTable.getSubtotalHiddenPageItems()) {
      k |= 0x1000;
    }
    if (paramPivotTable.getColumnGrand()) {
      k |= 0x2000;
    }
    if (paramPivotTable.getRowGrand()) {
      k |= 0x4000;
    }
    if (paramPivotTable.getPrintTitles()) {
      k |= 0x8000;
    }
    if (paramPivotTable.getItemPrintTitles()) {
      k |= 0x20000;
    }
    if (paramPivotTable.getMergeLabels()) {
      k |= 0x40000;
    }
    int i1 = ((k & 0xF0000) >> 16 & 0x8) != 0 ? 1 : 0;
    int i2 = ((k & 0xF00000) >> 20 & 0x1) != 0 ? 1 : 0;
    int i3 = ((k & 0xF00000) >> 20 & 0x2) != 0 ? 1 : 0;
    int i4 = ((k & 0xF00000) >> 20 & 0x4) != 0 ? 1 : 0;
    int i5 = ((k & 0xF00000) >> 20 & 0x8) != 0 ? 1 : 0;
    int i6 = ((k & 0xF0000000) >> 28 & 0x4) != 0L ? 1 : 0;
    if (paramPivotTable.b.h != null) {
      k |= 0x80000;
    }
    if (paramPivotTable.getTag() != null) {
      k |= 0x40000000;
    }
    if (paramPivotTable.getPivotTableStyleName() != null) {
      k |= 0x400000;
    }
    if (paramPivotTable.u) {
      m |= 0x1;
    }
    if (paramPivotTable.v) {
      m |= 0x8;
    }
    if (paramPivotTable.w) {
      m |= 0x2;
    }
    if (paramPivotTable.x) {
      m |= 0x4;
    }
    if (!paramPivotTable.t) {
      m |= 0x10;
    }
    if (!paramPivotTable.isMultipleFieldFilters()) {
      m |= 0x200;
    }
    if ((paramPivotTable.getErrorString() == null) || (paramPivotTable.getErrorString().length() == 0)) {
      m |= 0x40;
    }
    if ((paramPivotTable.getNullString() == null) || (paramPivotTable.getNullString().length() == 0)) {
      m |= 0x80;
    }
    if ((paramPivotTable.getRowHeaderCaption() != null) && (paramPivotTable.getRowHeaderCaption().length() != 0)) {
      m |= 0x400;
    }
    if ((paramPivotTable.getColumnHeaderCaption() != null) && (paramPivotTable.getColumnHeaderCaption().length() != 0)) {
      m |= 0x800;
    }
    if (paramPivotTable.getFieldListSortAscending()) {
      m |= 0x1000;
    }
    if (!paramPivotTable.getCustomListSort()) {
      m |= 0x4000;
    }
    j |= 0x4000;
    System.arraycopy(zc.a(j), 0, this.c, 0, 4);
    this.c[0] = 4;
    this.c[3] = n;
    System.arraycopy(zc.a(k), 0, this.c, 4, 4);
    byte[] tmp1063_1058 = this.c;
    tmp1063_1058[6] = ((byte)(tmp1063_1058[6] | 0x1));
    int i7 = zauj.Z(paramPivotTable.getAutoFormatType());
    if (i7 == 4117)
    {
      byte[] tmp1092_1087 = this.c;
      tmp1092_1087[7] = ((byte)(tmp1092_1087[7] | 0x20));
    }
    System.arraycopy(zc.a(m), 0, this.c, 8, 4);
    if (paramPivotTable.getDataField() != null)
    {
      if (paramPivotTable.getDataField().m == 1) {
        this.c[12] = 1;
      } else if (paramPivotTable.getDataField().m == 2) {
        this.c[12] = 2;
      }
    }
    else {
      this.c[12] = 2;
    }
    this.c[13] = ((byte)paramPivotTable.getPageFieldWrapCount());
    this.c[14] = ((byte)paramPivotTable.z);
    this.c[15] = 3;
    System.arraycopy(zc.a(-1), 0, this.c, 16, 4);
    if (i7 == 4117) {
      System.arraycopy(zc.a(1), 0, this.c, 20, 2);
    } else {
      System.arraycopy(zc.a(i7), 0, this.c, 20, 2);
    }
    System.arraycopy(zc.a(paramInt), 0, this.c, 28, 4);
    int i8 = 32;
    str = paramPivotTable.b.g;
    if (str != null) {
      i8 = zcgj.a(this.c, i8, str);
    }
    str = paramPivotTable.b.h;
    if (str != null) {
      i8 = zcgj.a(this.c, i8, str);
    }
    str = paramPivotTable.getErrorString();
    if ((str != null) && (str.length() != 0)) {
      i8 = zcgj.a(this.c, i8, str);
    }
    str = paramPivotTable.getNullString();
    if ((str != null) && (str.length() != 0)) {
      i8 = zcgj.a(this.c, i8, str);
    }
    str = paramPivotTable.getPivotTableStyleName();
    if (str != null) {
      i8 = zcgj.a(this.c, i8, str);
    }
    str = paramPivotTable.getTag();
    if (str != null) {
      i8 = zcgj.a(this.c, i8, str);
    }
    str = paramPivotTable.getColumnHeaderCaption();
    if (str != null) {
      i8 = zcgj.a(this.c, i8, str);
    }
    str = paramPivotTable.getRowHeaderCaption();
    if (str != null) {
      i8 = zcgj.a(this.c, i8, str);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcbq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */