package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcea
  extends zche
{
  private Workbook a;
  private zbch b;
  
  zcea(zbch paramzbch, Workbook paramWorkbook)
    throws Exception
  {
    this.a = paramWorkbook;
    this.b = paramzbch;
    this.d = 414;
    a();
  }
  
  private void a()
    throws Exception
  {
    int i = 20 + this.b.b.length() * 2;
    this.c = new byte[i];
    zbcn localzbcn = new zbcn(this.b);
    int j = localzbcn.a(this.c);
    System.arraycopy(zc.a(this.b.f), 0, this.c, j, 2);
    j += 2;
    zcgj.a(this.c, j, this.b.b);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */