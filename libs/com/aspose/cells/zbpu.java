package com.aspose.cells;

class zbpu
{
  int a = -1;
  String b = "";
  PivotTable c;
  zbpv d;
  boolean e;
  
  zbpu(zbpv paramzbpv)
  {
    this.d = paramzbpv;
    this.e = false;
  }
  
  int a()
  {
    return this.a;
  }
  
  void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  String b()
  {
    return this.b;
  }
  
  void a(String paramString)
  {
    this.b = paramString;
    WorksheetCollection localWorksheetCollection = this.d.a.q.a();
    Worksheet localWorksheet = null;
    PivotTable localPivotTable = null;
    for (int i = 0; i < localWorksheetCollection.getCount(); i++)
    {
      localWorksheet = localWorksheetCollection.get(i);
      for (int j = 0; j < localWorksheet.getPivotTables().getCount(); j++)
      {
        localPivotTable = localWorksheet.getPivotTables().get(j);
        if (localPivotTable.getName().equals(this.b))
        {
          this.c = localPivotTable;
          return;
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbpu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */