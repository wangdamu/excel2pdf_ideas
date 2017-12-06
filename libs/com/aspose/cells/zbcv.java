package com.aspose.cells;

import java.util.Iterator;

class zbcv
{
  Workbook a;
  
  zbcv(Workbook paramWorkbook)
  {
    this.a = paramWorkbook;
  }
  
  boolean a()
    throws Exception
  {
    WorksheetCollection localWorksheetCollection = this.a.getWorksheets();
    zbcj localzbcj = localWorksheetCollection.m;
    if ((localzbcj != null) && (localzbcj.getCount() > 0))
    {
      localObject = localzbcj.iterator();
      while (((Iterator)localObject).hasNext())
      {
        zbci localzbci = (zbci)((Iterator)localObject).next();
        if ((localzbci.c != null) && (localzbci.c.getCount() > 0)) {
          return true;
        }
      }
      return false;
    }
    Object localObject = localWorksheetCollection.h();
    if (localObject != null) {
      return ((zxf)localObject).a().b("Revision Log");
    }
    if (!this.a.getSettings().k()) {
      return false;
    }
    if (localWorksheetCollection.h() != null) {
      return localWorksheetCollection.h().a().a("Revision Log") != null;
    }
    return false;
  }
  
  void b()
  {
    this.a.getSettings().b(false);
    WorksheetCollection localWorksheetCollection = this.a.getWorksheets();
    zxf localzxf = localWorksheetCollection.h();
    localWorksheetCollection.m = null;
    if (localzxf != null)
    {
      localzxf.a().g("Revision Log");
      localzxf.a().g("User Names");
      localWorksheetCollection.a(null);
      localWorksheetCollection.a(false);
      this.a.getSettings().setShared(false);
      Iterator localIterator = localWorksheetCollection.iterator();
      while (localIterator.hasNext())
      {
        Worksheet localWorksheet = (Worksheet)localIterator.next();
        localWorksheet.s = null;
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbcv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */