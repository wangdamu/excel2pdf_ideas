package com.aspose.cells;

import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.HashMap;
import java.util.Iterator;

public class CustomGeometry
  extends Geometry
{
  private Shape b;
  private String c;
  private ShapePathCollection d;
  private ShapeGuideCollection e;
  private static final za f = new za(new String[] { "*/", "+-", "+/", "?:", "abs", "at2", "cat2", "cos", "max", "min", "mod", "pin", "sat2", "sin", "sqrt", "tan", "val" });
  
  CustomGeometry(Shape shape)
  {
    this.b = shape;
  }
  
  boolean a()
  {
    return true;
  }
  
  String b()
  {
    return this.c;
  }
  
  void a(String paramString)
  {
    this.c = paramString;
  }
  
  ShapePathCollection c()
  {
    return this.d;
  }
  
  public ShapePathCollection getPaths()
  {
    if (this.d == null) {
      this.d = new ShapePathCollection(this.b);
    }
    return this.d;
  }
  
  ShapeGuideCollection d()
  {
    return this.e;
  }
  
  ShapeGuideCollection e()
  {
    if (this.e == null) {
      this.e = new ShapeGuideCollection();
    }
    return this.e;
  }
  
  void f()
  {
    ShapeGuide localShapeGuide = null;
    HashMap localHashMap = new HashMap();
    int i = getShapeAdjustValues().getCount();
    if (i > 0) {
      for (j = 0; j < i; j++)
      {
        localShapeGuide = getShapeAdjustValues().get(j);
        double d1 = a(localShapeGuide, localHashMap);
        if (localHashMap.get(localShapeGuide.a()) == null) {
          localHashMap.put(localShapeGuide.a(), Double.valueOf(d1));
        }
        localShapeGuide.a((int)d1);
      }
    }
    int j = e().getCount();
    if (j == 0) {
      return;
    }
    for (int k = 0; k < j; k++)
    {
      localShapeGuide = e().get(k);
      double d2 = a(localShapeGuide, localHashMap);
      if (localHashMap.get(localShapeGuide.a()) == null) {
        localHashMap.put(localShapeGuide.a(), Double.valueOf(d2));
      }
      localShapeGuide.a((int)d2);
    }
  }
  
  double a(HashMap paramHashMap, String paramString)
  {
    if ("w".equals(paramString)) {
      return this.b.getWidth();
    }
    if ("h".equals(paramString)) {
      return this.b.getHeight();
    }
    if (paramHashMap.get(paramString) != null) {
      return ((Double)paramHashMap.get(paramString)).doubleValue();
    }
    return zauj.C(paramString);
  }
  
  double a(ShapeGuide paramShapeGuide, HashMap paramHashMap)
  {
    if (paramShapeGuide.b() != null)
    {
      String[] arrayOfString = zw.d(paramShapeGuide.b(), new char[] { ' ' });
      double d1 = 0.0D;
      double d2 = 0.0D;
      double d3 = 0.0D;
      switch (f.a(arrayOfString[0]))
      {
      case 0: 
        d1 = a(paramHashMap, arrayOfString[1]);
        d2 = a(paramHashMap, arrayOfString[2]);
        d3 = a(paramHashMap, arrayOfString[3]);
        return d1 * d2 / d3;
      case 1: 
        d1 = a(paramHashMap, arrayOfString[1]);
        d2 = a(paramHashMap, arrayOfString[2]);
        d3 = a(paramHashMap, arrayOfString[3]);
        return d1 + d2 - d3;
      case 2: 
        d1 = a(paramHashMap, arrayOfString[1]);
        d2 = a(paramHashMap, arrayOfString[2]);
        d3 = a(paramHashMap, arrayOfString[3]);
        return (d1 + d2) / d3;
      case 3: 
        d1 = a(paramHashMap, arrayOfString[1]);
        d2 = a(paramHashMap, arrayOfString[2]);
        d3 = a(paramHashMap, arrayOfString[3]);
        return d1 > 0.0D ? d2 : d3;
      case 4: 
        d1 = a(paramHashMap, arrayOfString[1]);
        return Math.abs(d1);
      case 5: 
        d1 = a(paramHashMap, arrayOfString[1]);
        d2 = a(paramHashMap, arrayOfString[2]);
        return Math.atan(d2 / d1);
      case 6: 
        d1 = a(paramHashMap, arrayOfString[1]);
        d2 = a(paramHashMap, arrayOfString[2]);
        d3 = a(paramHashMap, arrayOfString[3]);
        return d1 * Math.cos(Math.atan(d3 / d2));
      case 7: 
        d1 = a(paramHashMap, arrayOfString[1]);
        d2 = a(paramHashMap, arrayOfString[2]);
        return d1 * Math.cos(d2);
      case 8: 
        d1 = a(paramHashMap, arrayOfString[1]);
        d2 = a(paramHashMap, arrayOfString[2]);
        return Math.max(d1, d2);
      case 9: 
        d1 = a(paramHashMap, arrayOfString[1]);
        d2 = a(paramHashMap, arrayOfString[2]);
        return Math.min(d1, d2);
      case 10: 
        d1 = a(paramHashMap, arrayOfString[1]);
        d2 = a(paramHashMap, arrayOfString[2]);
        d3 = a(paramHashMap, arrayOfString[3]);
        return Math.sqrt(d1 * d1 + d2 * d2 + d3 * d3);
      case 11: 
        d1 = a(paramHashMap, arrayOfString[1]);
        d2 = a(paramHashMap, arrayOfString[2]);
        d3 = a(paramHashMap, arrayOfString[3]);
        double d4 = 0.0D;
        if (d2 < d1) {
          d4 = d1;
        } else if (d2 > d3) {
          d4 = d3;
        } else {
          d4 = d2;
        }
        return d4;
      case 12: 
        d1 = a(paramHashMap, arrayOfString[1]);
        d2 = a(paramHashMap, arrayOfString[2]);
        d3 = a(paramHashMap, arrayOfString[3]);
        return d1 * Math.sin(Math.atan(d3 / d2));
      case 13: 
        d1 = a(paramHashMap, arrayOfString[1]);
        d2 = a(paramHashMap, arrayOfString[2]);
        return d1 * Math.sin(d2);
      case 14: 
        d1 = a(paramHashMap, arrayOfString[1]);
        return Math.sqrt(d1);
      case 15: 
        d1 = a(paramHashMap, arrayOfString[1]);
        d2 = a(paramHashMap, arrayOfString[2]);
        return d1 * Math.tan(d2);
      case 16: 
        if (zarb.c(arrayOfString[1]))
        {
          d1 = zauj.C(arrayOfString[1]);
        }
        else
        {
          if (paramHashMap.get(arrayOfString[1]) != null) {
            return ((Double)paramHashMap.get(arrayOfString[1])).doubleValue();
          }
          if ("w".equals(arrayOfString[1]))
          {
            d1 = this.b.getWidth() / zbxp.a() * 72.0D * znq.j;
          }
          else if ("h".equals(arrayOfString[1]))
          {
            d1 = this.b.getHeight() / zbxp.a() * 72.0D * znq.j;
          }
          else
          {
            d1 = Math.min(this.b.getWidth(), this.b.getHeight());
            d1 = d1 / zbxp.a() * 72.0D * znq.j;
          }
        }
        return d1;
      }
    }
    return 0.0D;
  }
  
  void a(Geometry paramGeometry)
  {
    super.a(paramGeometry);
    CustomGeometry localCustomGeometry = (CustomGeometry)paramGeometry;
    if (localCustomGeometry.e != null)
    {
      this.e = new ShapeGuideCollection();
      Iterator localIterator = this.e.iterator();
      while (localIterator.hasNext())
      {
        ShapeGuide localShapeGuide = (ShapeGuide)localIterator.next();
        this.e.a(new ShapeGuide(localShapeGuide.a(), localShapeGuide.b()));
      }
    }
    if (localCustomGeometry.d != null)
    {
      this.d = new ShapePathCollection(this.b);
      this.d.clear();
      this.d.a(localCustomGeometry.d);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/CustomGeometry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */