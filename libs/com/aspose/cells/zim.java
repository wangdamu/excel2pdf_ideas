package com.aspose.cells;

import com.aspose.cells.a.d.zbh;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterJob;
import java.util.ArrayList;
import javax.print.PrintServiceLookup;
import javax.print.attribute.AttributeSet;
import javax.print.attribute.HashAttributeSet;
import javax.print.attribute.standard.PrinterName;

class zim
{
  zbyr a;
  String b;
  String c;
  
  public zim(String paramString, zbyr paramzbyr)
  {
    this.a = paramzbyr;
    this.b = paramString;
  }
  
  public zim(String paramString1, String paramString2, zbyr paramzbyr)
  {
    this.a = paramzbyr;
    this.b = paramString1;
    this.c = paramString2;
  }
  
  public void a()
    throws Exception
  {
    PrinterJob localPrinterJob = PrinterJob.getPrinterJob();
    Book localBook = new Book();
    int i = -1;
    Object localObject1;
    Object localObject2;
    for (int j = 0; j < this.a.c.size(); j++)
    {
      localObject1 = (zat)this.a.c.get(j);
      localObject2 = new PageFormat();
      Worksheet localWorksheet = ((zat)localObject1).b;
      Paper localPaper = new Paper();
      int k = localWorksheet.getPageSetup().getOrientation();
      if (k == 0)
      {
        ((PageFormat)localObject2).setOrientation(0);
        localPaper.setSize(localObject1.x[1], localObject1.x[0]);
        localPaper.setImageableArea(0.0D, 0.0D, localObject1.x[1], localObject1.x[0]);
      }
      else
      {
        ((PageFormat)localObject2).setOrientation(1);
        localPaper.setSize(localObject1.x[0], localObject1.x[1]);
        localPaper.setImageableArea(0.0D, 0.0D, localObject1.x[0], localObject1.x[1]);
      }
      ((PageFormat)localObject2).setPaper(localPaper);
      boolean bool = false;
      if ((((zat)localObject1).b.getIndex() != i) && (i != -1)) {
        bool = true;
      }
      i = ((zat)localObject1).b.getIndex();
      zauv localzauv = new zauv((zat)localObject1, (zbh)this.a.a, bool);
      localBook.append(localzauv, (PageFormat)localObject2);
    }
    if (this.a.c.size() > 0)
    {
      zat localzat = (zat)this.a.c.get(0);
      localPrinterJob.setPageable(localBook);
      localObject1 = new HashAttributeSet();
      ((HashAttributeSet)localObject1).add(new PrinterName(this.b, null));
      localObject2 = PrintServiceLookup.lookupPrintServices(null, (AttributeSet)localObject1);
      if (localObject2.length == 0) {
        throw new Exception("Can't find the printer");
      }
      if ((this.c != null) && (this.c.length() > 0)) {
        localPrinterJob.setJobName(this.c);
      }
      localPrinterJob.setPrintService(localObject2[0]);
      localPrinterJob.print();
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zim.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */