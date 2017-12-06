package com.aspose.cells;

import com.aspose.cells.a.d.a.zc;
import com.aspose.cells.a.d.a.zj;
import com.aspose.cells.a.d.a.zk;
import com.aspose.cells.a.d.zap;
import com.aspose.cells.a.d.zbh;
import com.aspose.cells.a.d.zf;
import com.aspose.cells.a.d.zn;
import com.aspose.cells.b.a.d.zm;
import java.awt.Dimension;
import java.awt.Rectangle;

class zau
{
  public static void a(zat paramzat, zm paramzm, zf paramzf, ImageOrPrintOptions paramImageOrPrintOptions)
    throws Exception
  {
    int i = (int)(paramzat.g * paramImageOrPrintOptions.getHorizontalResolution() + 0.9990000128746033D) + 1;
    int j = (int)(paramzat.h * paramImageOrPrintOptions.getVerticalResolution() + 0.9990000128746033D) + 1;
    Dimension localDimension1 = new Dimension(1024, 768);
    Dimension localDimension2 = new Dimension(271, 203);
    Rectangle localRectangle = new Rectangle(0, 0, i, j);
    zj localzj = new zj(localRectangle, localDimension1, localDimension2, new zk());
    localzj.d(24);
    localzj.a(1);
    localzj.b(13);
    localzj.e(1);
    localzj.c(3);
    zc localzc = localzj.a();
    localzc.setRenderingHints(paramImageOrPrintOptions.h);
    if (paramzat == null) {
      throw new Exception("ArgumentNull node");
    }
    ((zbh)paramzf).b(paramzat, localzc);
    paramzf.a();
    localzj.a(paramzm.j());
    paramzm.b(0L);
  }
  
  public static void a(zn paramzn, zm paramzm, ImageOrPrintOptions paramImageOrPrintOptions, int paramInt1, int paramInt2)
    throws Exception
  {
    Dimension localDimension1 = new Dimension(1024, 768);
    Dimension localDimension2 = new Dimension(271, 203);
    float f1 = localDimension1.width / (localDimension2.width / 25.4F);
    float f2 = localDimension1.height / (localDimension2.height / 25.4F);
    float f3 = f1 / paramImageOrPrintOptions.getHorizontalResolution();
    float f4 = f2 / paramImageOrPrintOptions.getVerticalResolution();
    localDimension1.width = ((int)(localDimension1.width / f3 + 0.5F));
    localDimension1.height = ((int)(localDimension1.height / f4 + 0.5F));
    float f5 = paramImageOrPrintOptions.getHorizontalResolution() / zap.b();
    float f6 = paramImageOrPrintOptions.getVerticalResolution() / zap.b();
    int i = (int)(paramInt1 * f5 + 0.5F) - 1;
    int j = (int)(paramInt2 * f6 + 0.5F) - 1;
    Rectangle localRectangle = new Rectangle(0, 0, i, j);
    zj localzj = new zj(localRectangle, localDimension1, localDimension2, new zk());
    localzj.d(24);
    localzj.a(1);
    localzj.b(13);
    localzj.e(1);
    localzj.c(3);
    zc localzc = localzj.a();
    localzc.setRenderingHints(paramImageOrPrintOptions.h);
    if (paramzn == null) {
      throw new Exception("ArgumentNull node in saveApsToEmfStream ");
    }
    localzc.scale(f5, f6);
    zis localzis = new zis();
    zbh localzbh = new zbh(localzis);
    localzbh.b(paramzn, localzc);
    localzbh.a();
    localzj.a(paramzm.j());
    paramzm.b(0L);
    localzc.dispose();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zau.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */