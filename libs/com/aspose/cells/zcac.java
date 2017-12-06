package com.aspose.cells;

import com.aspose.cells.b.a.zh;
import com.aspose.cells.b.a.zj;
import com.aspose.cells.b.a.zs;
import java.util.Iterator;

class zcac
  implements zj
{
  zadm a;
  zri[] b;
  zcab[] c;
  zang d;
  String e;
  XlsSaveOptions f;
  zcc g;
  ztl h;
  Workbook i;
  
  public void dispose()
  {
    this.e = null;
    this.b = null;
    this.c = null;
    this.d = null;
    this.f = null;
    this.h = null;
    this.g = null;
    this.i = null;
    this.a.a();
    this.a = null;
  }
  
  public zcac(zadm paramzadm, Workbook paramWorkbook, SaveOptions paramSaveOptions)
  {
    this.i = paramWorkbook;
    if ((paramSaveOptions instanceof XlsSaveOptions)) {
      this.f = ((XlsSaveOptions)paramSaveOptions);
    }
    if (paramzadm == null) {
      this.a = new zadm(paramWorkbook, 5);
    } else {
      this.a = paramzadm;
    }
    if (paramSaveOptions != null)
    {
      if (paramSaveOptions.getCachedFileFolder() != null)
      {
        this.e = paramSaveOptions.getCachedFileFolder();
        switch (this.e.charAt(this.e.length() - 1))
        {
        case '/': 
        case '\\': 
          break;
        default: 
          this.e += '/';
        }
        this.e = (this.e + "Aspose.Cells" + zs.a(zh.b()));
      }
      if (paramSaveOptions.i != null) {
        this.d = new zang(this.a, paramSaveOptions.i);
      }
    }
    a();
    b();
  }
  
  private void a()
  {
    this.c = new zcab[this.i.getWorksheets().getCount()];
    int j = 0;
    Iterator localIterator = this.i.getWorksheets().iterator();
    while (localIterator.hasNext())
    {
      Worksheet localWorksheet = (Worksheet)localIterator.next();
      this.c[(j++)] = new zcab(localWorksheet);
    }
  }
  
  private void b()
  {
    zawq localzawq = this.i.getWorksheets().W();
    if ((localzawq != null) && (localzawq.getCount() > 0))
    {
      this.b = new zri[localzawq.getCount()];
      int j = 0;
      Iterator localIterator = localzawq.iterator();
      while (localIterator.hasNext())
      {
        zawp localzawp = (zawp)localIterator.next();
        zri localzri = new zri(localzawp);
        localzri.a(false);
        this.b[(j++)] = localzri;
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */