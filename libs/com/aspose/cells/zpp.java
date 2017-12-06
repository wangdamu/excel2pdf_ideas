package com.aspose.cells;

import com.aspose.cells.a.c.zu;
import com.aspose.cells.a.d.zcc;
import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zpp
{
  zbbs a = new zbbs();
  HashMap b = new HashMap();
  HashMap c = new HashMap();
  zpu d;
  ArrayList e = new ArrayList();
  boolean f = false;
  boolean g = false;
  boolean h = false;
  ShapeCollection i;
  private int j = 0;
  private ArrayList k = new ArrayList();
  
  zpp() {}
  
  boolean a()
  {
    return (this.f) || (this.g) || (this.h);
  }
  
  zpp(zpu paramzpu)
    throws Exception
  {
    this.d = paramzpu;
    a(this.d, this.d.a.getShapes());
  }
  
  private boolean a(zpu paramzpu, ShapeCollection paramShapeCollection)
    throws Exception
  {
    boolean bool1 = false;
    this.i = paramShapeCollection;
    Object localObject;
    if ((paramzpu != null) && (paramzpu.a.getType() == 2))
    {
      localObject = paramzpu.a.getCharts().get(0);
      if ((((Chart)localObject).p() != null) && (((Chart)localObject).p().getCount() > 0) && (a(null, ((Chart)localObject).p()))) {
        bool1 = true;
      }
    }
    else
    {
      localObject = paramShapeCollection.iterator();
      while (((Iterator)localObject).hasNext())
      {
        Shape localShape = (Shape)((Iterator)localObject).next();
        this.j += 1;
        boolean bool2 = (this.d != null) && (this.d.r != null) && (this.d.r.get(Integer.valueOf(this.j - 1)) != null);
        switch (localShape.getMsoDrawingType())
        {
        case 8: 
          if (a(this.j, (Picture)localShape)) {
            bool1 = true;
          }
          break;
        case 24: 
          a(localShape, this.j);
          bool1 = true;
          break;
        case 25: 
          a(this.j, new zps(localShape, false));
          bool1 = true;
          this.h = true;
          break;
        case 7: 
        case 11: 
        case 12: 
        case 14: 
        case 16: 
        case 17: 
        case 18: 
        case 19: 
          a(this.j, new zps(localShape, bool2));
          this.g = true;
          bool1 = true;
          break;
        case 20: 
          if (!localShape.Y())
          {
            a(this.j, new zps(localShape, bool2));
            this.g = true;
            bool1 = true;
          }
          break;
        case 5: 
          Chart localChart = ((ChartShape)localShape).a();
          if ((localChart.p() != null) && (localChart.p().getCount() > 0) && (a(null, localChart.p()))) {
            bool1 = true;
          }
          break;
        }
      }
    }
    return bool1;
  }
  
  private void a(int paramInt, zps paramzps)
  {
    if ((this.d.r.get(Integer.valueOf(paramInt - 1)) == null) && (paramzps.d.W()))
    {
      zpq localzpq = a(paramzps.d.getGroup());
      zf.a(localzpq.a, paramzps);
    }
    else
    {
      zf.a(this.e, paramzps);
    }
  }
  
  private zpq a(GroupShape paramGroupShape)
  {
    Object localObject = this.k.iterator();
    while (((Iterator)localObject).hasNext())
    {
      zpq localzpq = (zpq)((Iterator)localObject).next();
      if (localzpq.d == paramGroupShape) {
        return localzpq;
      }
    }
    localObject = new zpq(paramGroupShape);
    zf.a(this.k, localObject);
    a(-1, (zps)localObject);
    return (zpq)localObject;
  }
  
  private boolean a(Shape paramShape, int paramInt)
    throws Exception
  {
    OleObject localOleObject = (OleObject)paramShape;
    zpr localzpr = new zpr(paramShape);
    if (localOleObject.e() != 0)
    {
      localzpr.b = ((String)this.d.e.f.get(Integer.valueOf(localOleObject.e())));
      if (localzpr.b != null) {
        localzpr.a = this.a.a("http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", "../media/" + localzpr.b).b;
      }
    }
    a(paramInt, localzpr);
    this.f = true;
    boolean bool = localOleObject.isLink();
    byte[] arrayOfByte = null;
    if (!bool) {
      arrayOfByte = localOleObject.h();
    }
    if ((bool) || (arrayOfByte != null))
    {
      zpl localzpl = new zpl();
      localzpl.a = localOleObject;
      localzpl.b = localzpr.g;
      if (!bool)
      {
        zpt localzpt = this.d.e;
        zcz localzcz = new zcz(arrayOfByte);
        String str1 = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/oleObject";
        String str2 = null;
        String str3 = null;
        if (localOleObject.l())
        {
          str3 = ".bin";
        }
        else
        {
          str2 = localOleObject.a;
          if ((str2 == null) || ("".equals(str2)))
          {
            str3 = FileFormatUtil.a(localOleObject.m(), ".bin");
          }
          else
          {
            str2 = "xl/embeddings/" + zu.b(str2);
            str3 = zu.c(str2);
          }
          if (localOleObject.g()) {
            str1 = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/package";
          }
        }
        localzpt.B = localzpt.a(str2, localzcz, "xl/embeddings/oleObject", str3, localzpt.B);
        localzpl.c = this.d.a(str1, "../embeddings/" + localzcz.c()).b;
        localzpl.e = localzcz.c();
      }
      if (localzpr.b != null) {
        localzpl.d = this.d.a("http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", "../media/" + localzpr.b).b;
      }
      zf.a(this.d.l, localzpl);
      this.d.e.a(localzpl);
    }
    return true;
  }
  
  private boolean a(int paramInt, Picture paramPicture)
  {
    if (paramPicture.am())
    {
      zpr localzpr = new zpr(paramPicture);
      if (paramPicture.b() != 0)
      {
        localzpr.b = ((String)this.d.e.f.get(Integer.valueOf(paramPicture.b())));
        if (localzpr.b != null) {
          localzpr.a = this.a.a("http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", "../media/" + localzpr.b).b;
        }
      }
      a(paramInt, localzpr);
      if (paramPicture.z != null)
      {
        paramPicture.z.b = localzpr.g;
        localzpr.h = "#\000t201";
        this.g = true;
      }
      else
      {
        this.f = true;
      }
      return true;
    }
    return false;
  }
  
  String a(byte[] paramArrayOfByte)
    throws Exception
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      return null;
    }
    zp localzp = this.d.e.a(paramArrayOfByte, zcc.b(zcc.a(paramArrayOfByte)));
    return this.a.b("http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", "../media/" + localzp.c(), null).b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zpp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */