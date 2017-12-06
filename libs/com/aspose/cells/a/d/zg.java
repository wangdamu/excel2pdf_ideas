package com.aspose.cells.a.d;

import com.aspose.cells.a.d.a.zc;
import com.aspose.cells.a.d.a.zj;
import com.aspose.cells.a.d.a.zk;
import com.aspose.cells.b.a.d.zh;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.OutputStream;

public class zg
  extends zbh
{
  public zg(zhb paramzhb)
  {
    super(paramzhb);
  }
  
  public void a(zo paramzo, OutputStream paramOutputStream)
    throws Exception
  {
    a(paramzo, paramOutputStream, 0.0F, 0.0F, 1.0F);
  }
  
  public void a(zo paramzo, zh paramzh)
    throws Exception
  {
    a(paramzo, paramzh.j());
  }
  
  public void a(zo paramzo, OutputStream paramOutputStream, float paramFloat1, float paramFloat2, float paramFloat3)
    throws Exception
  {
    a(paramzo, paramOutputStream, paramFloat1, paramFloat2, paramFloat3, paramFloat3);
  }
  
  public void a(zo paramzo, OutputStream paramOutputStream, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
    throws Exception
  {
    Dimension localDimension1 = new Dimension(1024, 768);
    Dimension localDimension2 = new Dimension(271, 203);
    int i = (int)Math.ceil(b(paramzo.c(), localDimension1, localDimension2) * paramFloat3);
    int j = (int)Math.ceil(a(paramzo.d(), localDimension1, localDimension2) * paramFloat4);
    Rectangle localRectangle = new Rectangle((int)paramFloat1, (int)paramFloat2, i, j);
    zj localzj = new zj(localRectangle, localDimension1, localDimension2, new zk());
    localzj.d(24);
    localzj.a(1);
    localzj.b(13);
    localzj.e(1);
    localzj.c(3);
    Point localPoint = new Point(localRectangle.x, localRectangle.y);
    zc localzc = localzj.a();
    if (paramzo == null) {
      throw new Exception("ArgumentNull node");
    }
    super.a(paramzo, localzc, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    localzj.a(paramOutputStream);
  }
  
  private int a(float paramFloat, Dimension paramDimension1, Dimension paramDimension2)
  {
    return (int)Math.round(paramFloat * 25.4D / 72.0D * paramDimension1.getHeight() / paramDimension2.getHeight());
  }
  
  private int b(float paramFloat, Dimension paramDimension1, Dimension paramDimension2)
  {
    return (int)Math.round(paramFloat * 25.4D / 72.0D * paramDimension1.getWidth() / paramDimension2.getWidth());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */