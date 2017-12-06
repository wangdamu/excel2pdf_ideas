package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcik
  extends zche
{
  zcik()
  {
    this.d = 153;
  }
  
  void a(Workbook paramWorkbook)
    throws Exception
  {
    int i = 0;
    int j = 0;
    if (paramWorkbook.a != null)
    {
      zql localzql = paramWorkbook.a.g;
      if (localzql.b != null) {
        i = zauj.F(localzql.b);
      } else {
        i = 124226;
      }
      if (localzql.c) {
        j = 1;
      }
    }
    else
    {
      i = 124226;
    }
    int k = 8;
    if (paramWorkbook.getWorksheets().j() == null) {
      k += 4;
    } else {
      k += 4 + paramWorkbook.getWorksheets().j().length() * 2;
    }
    this.c = new byte[k];
    this.c[0] = 32;
    if (paramWorkbook.getSettings().getDate1904())
    {
      int tmp129_128 = 0;
      byte[] tmp129_125 = this.c;
      tmp129_125[tmp129_128] = ((byte)(tmp129_125[tmp129_128] | 0x1));
    }
    if (paramWorkbook.getSettings().getRemovePersonalInformation())
    {
      int tmp150_149 = 0;
      byte[] tmp150_146 = this.c;
      tmp150_146[tmp150_149] = ((byte)(tmp150_146[tmp150_149] | 0x8));
    }
    if (paramWorkbook.getSettings().getHidePivotFieldList())
    {
      int tmp172_171 = 1;
      byte[] tmp172_168 = this.c;
      tmp172_168[tmp172_171] = ((byte)(tmp172_168[tmp172_171] | 0x4));
    }
    if (j == 1)
    {
      int tmp188_187 = 1;
      byte[] tmp188_184 = this.c;
      tmp188_184[tmp188_187] = ((byte)(tmp188_184[tmp188_187] | 0x8));
    }
    switch (paramWorkbook.getSettings().getUpdateLinksType())
    {
    case 1: 
      this.c[1] = 1;
      break;
    case 2: 
      this.c[1] = 2;
      break;
    }
    this.c[2] = 1;
    System.arraycopy(zc.a(i), 0, this.c, 4, 4);
    if (paramWorkbook.getWorksheets().j() != null)
    {
      int m = 8;
      m = zcgj.a(this.c, m, paramWorkbook.getWorksheets().j());
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcik.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */