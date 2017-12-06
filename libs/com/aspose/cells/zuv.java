package com.aspose.cells;

import java.util.ArrayList;

class zuv
  extends ztp
{
  private zpu b = null;
  private Chart c = null;
  private boolean d = false;
  private zph e = null;
  
  zuv(zph paramzph)
  {
    this.e = paramzph;
    if (this.e.g != null)
    {
      this.d = true;
      this.c = paramzph.g;
    }
    else
    {
      this.b = paramzph.f;
    }
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    c(paramzcjz);
    b(paramzcjz);
    paramzcjz.b();
    paramzcjz.d();
    paramzcjz.e();
  }
  
  private void b(zcjz paramzcjz)
    throws Exception
  {
    if ((!this.d) && (this.b.a.getType() == 2))
    {
      c(new zpi(this.e, this.b.a.getCharts().get(0).getChartObject(), false), paramzcjz);
    }
    else
    {
      if ((this.e.h == null) || (this.e.h.length == 0)) {
        return;
      }
      for (zpi localzpi : this.e.h)
      {
        Shape localShape = localzpi.a;
        if (localShape != null) {
          if ((zauj.a(localShape)) || ((localShape.getMsoDrawingType() != 0) && (localShape.getAutoShapeType() == 0))) {
            a(localzpi, paramzcjz);
          } else {
            switch (localShape.getMsoDrawingType())
            {
            case 8: 
              if ((localShape.h != null) && (localShape.h.h != null)) {
                a(localShape, paramzcjz);
              } else {
                b(localzpi, paramzcjz);
              }
              break;
            case 5: 
              c(localzpi, paramzcjz);
              break;
            case 29: 
            case 30: 
              if (zauj.aK(localShape.getAutoShapeType())) {
                b(localShape, paramzcjz);
              } else {
                switch (localShape.getAutoShapeType())
                {
                case 202: 
                  a(localzpi, paramzcjz);
                  break;
                default: 
                  a(localShape, paramzcjz);
                }
              }
              break;
            default: 
              a(localzpi, paramzcjz);
            }
          }
        }
      }
    }
  }
  
  private void a(Shape paramShape, zcjz paramzcjz)
    throws Exception
  {
    if ((paramShape.h != null) && (paramShape.h.h != null)) {
      paramzcjz.d(paramShape.h.h);
    }
  }
  
  private void a(zpi paramzpi, zcjz paramzcjz)
    throws Exception
  {
    zvb localzvb = new zvb(paramzpi);
    localzvb.a(paramzcjz);
  }
  
  private void b(Shape paramShape, zcjz paramzcjz)
    throws Exception
  {
    zpi localzpi = new zpi(this.e, paramShape, false);
    zvb localzvb = new zvb(localzpi);
    localzvb.b(paramzcjz);
  }
  
  private void b(zpi paramzpi, zcjz paramzcjz)
    throws Exception
  {
    if ((!this.d) && (this.b.a.getType() != 1)) {
      return;
    }
    zvb localzvb = new zvb(paramzpi);
    localzvb.a(paramzcjz);
  }
  
  private void c(zpi paramzpi, zcjz paramzcjz)
    throws Exception
  {
    zpe localzpe = a(paramzpi.a);
    if (localzpe == null) {
      return;
    }
    zvb localzvb = new zvb(paramzpi);
    localzvb.a(paramzcjz);
  }
  
  private zpe a(Shape paramShape)
  {
    ChartShape localChartShape = (ChartShape)paramShape;
    ArrayList localArrayList = this.e.e;
    int i = localArrayList.size();
    if ((!this.d) && (this.b.a.getType() == 2)) {
      i = Math.min(1, i);
    }
    for (int j = 0; j < i; j++)
    {
      zpe localzpe = (zpe)localArrayList.get(j);
      if ((localzpe.a != null) && (localzpe.a.getChartObject() == localChartShape)) {
        return localzpe;
      }
    }
    return null;
  }
  
  private void c(zcjz paramzcjz)
    throws Exception
  {
    if (this.d)
    {
      paramzcjz.b(false);
      paramzcjz.b("c:userShapes");
      paramzcjz.a("xmlns", "c", null, "http://schemas.openxmlformats.org/drawingml/2006/chart");
    }
    else
    {
      paramzcjz.b(true);
      if (this.e.a().A.getSaveFormat() == 5) {
        paramzcjz.b("xdr:anchor");
      } else {
        paramzcjz.b("xdr:wsDr");
      }
      paramzcjz.a("xmlns", "xdr", null, "http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing");
    }
    paramzcjz.a("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
    paramzcjz.a("xmlns", "r", null, zaty.e);
    paramzcjz.a("xmlns", "a14", null, "http://schemas.microsoft.com/office/drawing/2010/main");
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zuv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */