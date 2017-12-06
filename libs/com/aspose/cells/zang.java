package com.aspose.cells;

class zang
{
  zadm a;
  WorksheetCollection b;
  LightCellsDataProvider c;
  protected int d;
  
  zang(zadm paramzadm, LightCellsDataProvider paramLightCellsDataProvider)
  {
    this.a = paramzadm;
    this.b = paramzadm.f.getWorksheets();
    this.c = paramLightCellsDataProvider;
    if (!zug.a(this.b)) {
      this.d = (this.b.getCount() - 1);
    } else {
      this.d = (this.b.getCount() - 2);
    }
  }
  
  void a(Style paramStyle, int paramInt) {}
  
  zahd a(Worksheet paramWorksheet)
  {
    int i = paramWorksheet.getIndex();
    if ((i > this.d) || (!this.c.startSheet(i))) {
      return null;
    }
    return new zhx(paramWorksheet, this.c, this);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zang.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */