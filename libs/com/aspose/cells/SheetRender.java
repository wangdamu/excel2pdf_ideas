package com.aspose.cells;

import com.aspose.cells.a.d.zbh;
import com.aspose.cells.b.a.b.za;
import com.aspose.cells.b.a.b.zb;
import com.aspose.cells.b.a.d.zj;
import com.aspose.cells.b.a.d.zm;
import java.awt.Graphics2D;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class SheetRender
{
  private Workbook a;
  private Worksheet b;
  private ImageOrPrintOptions c;
  private zbyr d;
  private int e = 0;
  private ArrayList<Integer> f;
  
  public int getPageCount()
  {
    return this.e;
  }
  
  public void setPageCount(int value)
  {
    this.e = value;
  }
  
  public double getPageScale()
  {
    if (this.d.g.containsKey(Integer.valueOf(this.b.getIndex()))) {
      return ((zbox)this.d.g.get(Integer.valueOf(this.b.getIndex()))).a();
    }
    PageSetup localPageSetup = this.b.getPageSetup();
    if ((localPageSetup.isPercentScale()) || ((localPageSetup.getFitToPagesTall() == 0) && (localPageSetup.getFitToPagesWide() == 0))) {
      return localPageSetup.getZoom() / 100.0F;
    }
    return 1.0D;
  }
  
  public SheetRender(Worksheet worksheet, ImageOrPrintOptions options)
    throws Exception
  {
    this.a = worksheet.getWorkbook();
    this.b = worksheet;
    this.c = options;
    if (options.getImageFormat() == ImageFormat.getBmp()) {
      this.c.a(139273);
    }
    this.d = new zbyr(this.a);
    zis localzis = new zis(options.getCheckWorkbookDefaultFont() ? this.a.getWorksheets().T().getName() : null, options.getDefaultFont());
    this.d.a = new zbh(localzis);
    if (worksheet.getPageSetup().getBlackAndWhite()) {
      this.c.e = true;
    }
    this.d.a(worksheet, this.c);
    if (this.d.c != null) {
      this.e = this.d.c.size();
    }
    this.f = new ArrayList();
  }
  
  public boolean toImage(int pageIndex, Graphics2D graphic)
    throws CellsException
  {
    ((zbh)this.d.a).a(pageIndex);
    float[] arrayOfFloat = getPageSize(pageIndex);
    zb localzb = new zb(graphic, (int)Math.ceil(arrayOfFloat[0] * 1.3333F), (int)Math.ceil(arrayOfFloat[1] * 1.3333F));
    try
    {
      a(pageIndex);
      return this.d.a(pageIndex, this.c, localzb);
    }
    catch (Exception localException)
    {
      throw new CellsException(7, localException.getMessage());
    }
  }
  
  public float[] getPageSize(int pageIndex)
  {
    zat localzat = (zat)this.d.c.get(pageIndex);
    float f1 = (float)localzat.x[0];
    float f2 = (float)localzat.x[1];
    if (this.c.getImageFormat() == ImageFormat.getEmf()) {
      return new float[] { f1, f2 };
    }
    return new float[] { f1 * this.c.getHorizontalResolution() / 96.0F + 1.0F, f2 * this.c.getVerticalResolution() / 96.0F + 1.0F };
  }
  
  public void toImage(int pageIndex, String fileName)
    throws Exception
  {
    ((zbh)this.d.a).a(pageIndex);
    a(pageIndex);
    this.d.a(pageIndex, fileName, this.c);
  }
  
  public void toImage(int pageIndex, OutputStream stream)
    throws Exception
  {
    ((zbh)this.d.a).a(pageIndex);
    a(pageIndex);
    zj localzj = new zj(stream);
    this.d.a(pageIndex, this.c, localzj);
  }
  
  void a(int paramInt, zm paramzm)
    throws Exception
  {
    this.d.a(paramInt, this.c, paramzm);
  }
  
  public void toPrinter(String PrinterName)
    throws Exception
  {
    this.d.f = true;
    zim localzim = new zim(PrinterName, this.d);
    localzim.a();
  }
  
  public void toPrinter(String PrinterName, String JobName)
    throws Exception
  {
    this.d.f = true;
    zim localzim = new zim(PrinterName, JobName, this.d);
    localzim.a();
  }
  
  private void a(int paramInt)
    throws Exception
  {
    if ((paramInt < 0) || (paramInt >= this.e)) {
      return;
    }
    if (this.f.contains(Integer.valueOf(paramInt))) {
      return;
    }
    if ((paramInt == 0) || (this.f.contains(Integer.valueOf(paramInt - 1))))
    {
      this.f.add(Integer.valueOf(paramInt));
      return;
    }
    for (int i = paramInt - 1; (i >= 0) && (!this.f.contains(Integer.valueOf(i))); i--) {}
    for (int j = i + 1; j < paramInt; j++)
    {
      this.f.add(Integer.valueOf(j));
      za localza = this.d.a(j, this.c);
      localza.d();
    }
    this.f.add(Integer.valueOf(paramInt));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/SheetRender.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */