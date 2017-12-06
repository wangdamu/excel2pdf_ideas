package com.aspose.cells;

import com.aspose.cells.a.d.zbh;
import com.aspose.cells.b.a.d.ze;
import com.aspose.cells.b.a.d.zj;
import com.aspose.cells.b.a.d.zm;
import java.io.OutputStream;
import java.util.ArrayList;

public class WorkbookRender
{
  private Workbook a;
  private ImageOrPrintOptions b;
  private zbyr c;
  private int d = 0;
  private int e = 0;
  
  public int getPageCount()
  {
    return this.e;
  }
  
  public WorkbookRender(Workbook workbook, ImageOrPrintOptions options)
    throws Exception
  {
    this.a = workbook;
    this.b = options;
    this.c = new zbyr(this.a);
    zis localzis = new zis(options.getCheckWorkbookDefaultFont() ? this.a.getWorksheets().T().getName() : null, options.getDefaultFont());
    this.c.a = new zbh(localzis);
    if ((this.b.getImageFormat() != ImageFormat.getTiff()) && (this.b.getSaveFormat() == 0)) {
      this.b.setSaveFormat(20);
    }
    this.c.a(this.b);
    if (this.c.c != null) {
      this.e = this.c.c.size();
    }
  }
  
  void a(zm paramzm)
    throws Exception
  {
    if ((this.b.getImageFormat() == ImageFormat.getTiff()) || (this.b.getSaveFormat() == 21) || (this.b.getSaveFormat() == 20))
    {
      if (paramzm == null) {
        return;
      }
      this.c.a(paramzm, this.b);
    }
    else
    {
      throw new CellsException(19, "WorkbookRender only support Tiff/XPS");
    }
  }
  
  public void toImage(OutputStream stream)
    throws Exception
  {
    if ((this.b.getImageFormat() == ImageFormat.getTiff()) || (this.b.getSaveFormat() == 21) || (this.b.getSaveFormat() == 20))
    {
      if (stream == null) {
        return;
      }
      zj localzj = new zj(stream);
      this.c.a(localzj, this.b);
    }
    else
    {
      throw new CellsException(19, "WorkbookRender only support Tiff/XPS");
    }
  }
  
  public void toImage(String filename)
    throws Exception
  {
    if ((this.b.getImageFormat() == ImageFormat.getTiff()) || (this.b.getSaveFormat() == 21) || (this.b.getSaveFormat() == 20))
    {
      ze localze = new ze(filename, 2);
      this.c.a(localze, this.b);
      localze.a();
    }
    else
    {
      throw new CellsException(19, "WorkbookRender only support Tiff/XPS");
    }
  }
  
  public void toPrinter(String PrinterName)
    throws Exception
  {
    this.c.f = true;
    zim localzim = new zim(PrinterName, this.c);
    localzim.a();
  }
  
  public void toPrinter(String PrinterName, String JobName)
    throws Exception
  {
    this.c.f = true;
    zim localzim = new zim(PrinterName, JobName, this.c);
    localzim.a();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/WorkbookRender.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */