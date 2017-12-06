package com.aspose.cells;

import com.aspose.cells.a.d.zap;
import com.aspose.cells.a.d.zcd;
import com.aspose.cells.a.d.zce;
import com.aspose.cells.b.a.g.a.za;
import com.aspose.cells.b.a.g.a.zc;
import com.aspose.cells.b.a.g.a.ze;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Collections;

abstract class zgz
{
  protected static float a = ;
  static float b = 0.67F;
  protected float c = 0.0F;
  protected float d = 0.0F;
  float e = 0.0F;
  float f = 0.0F;
  protected int g;
  protected int h;
  ArrayList i;
  com.aspose.cells.a.d.zf j;
  protected zgw k;
  protected boolean l = false;
  protected float m;
  protected boolean[] n = { false };
  private double[] o;
  private static ze p = new ze("([\\u0600-\\u06ff\\u0590-\\u05FF]+)|([^\\u0600-\\u06ff\\u0590-\\u05FF]+)|([\\w]+)");
  private static ze q = new ze("(\\s+)|([\\u2E80-\\u9FFF\\uF900-\\uFAFF\\uFF00-\\uFFEF])|([^\\u2E80-\\u9FFF\\uF900-\\uFAFF\\uFF00-\\uFFEF\\s]+)");
  private static ze r = new ze("(\\n+)|([a-zA-Z]+)|([\\u0000-\\u007F-[a-zA-Z\\n]]+)|([\\uFB50-\\uFDFF\\uFE70-\\uFEFF\\u0590-\\u05FF]+)|([\\u0080-\\uFFFF-[\\uFB50-\\uFDFF\\uFE70-\\uFEFF\\u0590-\\u05FF]]+)");
  private static ze s = new ze("([\\uF020-\\uF0FF]+)|([^\\uF020-\\uF0FF]+)");
  
  protected zgz(zgw paramzgw, float paramFloat1, float paramFloat2, float paramFloat3, double[] paramArrayOfDouble)
  {
    this.m = paramFloat3;
    this.o = paramArrayOfDouble;
    this.k = paramzgw;
    this.i = new ArrayList();
    this.c = paramFloat1;
    this.d = paramFloat2;
    d(paramzgw);
    c(paramzgw);
    this.l = paramzgw.b;
  }
  
  void a()
    throws Exception
  {
    for (int i1 = 0; i1 < this.k.r().size(); i1++)
    {
      zqb localzqb1 = (zqb)this.k.r().get(i1);
      if ((localzqb1 != null) && (localzqb1.a != null) && (localzqb1.a.length() != 0))
      {
        localzqb1.a = localzqb1.a.replace('\r', ' ');
        int i2 = localzqb1.a.indexOf('\n');
        if (i2 >= 0)
        {
          zqb localzqb2 = new zqb();
          localzqb2.b = localzqb1.b;
          localzqb2.a = localzqb1.a.substring(0, 0 + i2);
          if (this.k.c().isTextWrapped()) {
            localzqb2.a = zw.a(localzqb2.a);
          }
          localzqb1.a = localzqb1.a.substring(i2 + 1);
          zqb localzqb3 = new zqb();
          localzqb3.b = localzqb1.b;
          localzqb3.a = "";
          localzqb3.d = 16;
          this.k.r().add(i1, localzqb3);
          if (localzqb2.a.length() > 0) {
            this.k.r().add(i1, localzqb2);
          }
        }
      }
    }
    b(this.k);
    a(this.o);
    b();
    a(this.k);
  }
  
  private void c(zgw paramzgw)
  {
    this.g = paramzgw.c().getVerticalAlignment();
  }
  
  private void d(zgw paramzgw)
  {
    this.h = paramzgw.g();
    if (paramzgw.c().getRotationAngle() == 90) {
      switch (paramzgw.c().getVerticalAlignment())
      {
      case 9: 
        this.h = 8;
        break;
      case 0: 
        this.h = 7;
        break;
      default: 
        this.h = paramzgw.c().getVerticalAlignment();
        break;
      }
    } else if (paramzgw.c().getRotationAngle() == -90) {
      switch (paramzgw.c().getVerticalAlignment())
      {
      case 9: 
        this.h = 7;
        break;
      case 0: 
        this.h = 8;
        break;
      default: 
        this.h = paramzgw.c().getVerticalAlignment();
        break;
      }
    } else {
      switch (this.h)
      {
      case 6: 
        this.h = 6;
        break;
      case 4: 
        this.h = 7;
        break;
      }
    }
  }
  
  protected abstract void a(zgw paramzgw);
  
  protected abstract void a(double[] paramArrayOfDouble)
    throws Exception;
  
  protected abstract float a(double paramDouble, float paramFloat);
  
  abstract void a(com.aspose.cells.a.d.zb paramzb)
    throws Exception;
  
  protected abstract void b();
  
  protected void b(zgw paramzgw) {}
  
  static float b(double paramDouble, float paramFloat)
  {
    return zauu.a(paramDouble, paramFloat);
  }
  
  static float c(double paramDouble, float paramFloat)
  {
    return zauu.b(paramDouble, paramFloat);
  }
  
  static void a(String paramString, boolean paramBoolean, int paramInt, zami paramzami)
  {
    int i1 = paramString.length();
    if (i1 < 1) {
      return;
    }
    int i2 = 0;
    int i3 = 0;
    while (i2 < i1)
    {
      zc localzc;
      if (paramBoolean) {
        localzc = r.a(paramString, i2);
      } else {
        localzc = q.a(paramString, i2);
      }
      if (!localzc.c()) {
        break;
      }
      i2 += localzc.e();
      if (i2 == i1)
      {
        if ((i3 > 0) && (localzc.b().a(1).a())) {
          paramzami.b();
        }
      }
      else if (localzc.b().a(1).a())
      {
        if (i3 < 1)
        {
          paramzami.a(i2);
          i3++;
        }
      }
      else
      {
        paramzami.a(i2);
        i3++;
        if ((paramInt > 0) && (i3 >= paramInt)) {
          break;
        }
      }
    }
  }
  
  static void a(ArrayList paramArrayList)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i1 = 0; i1 < paramArrayList.size(); i1++)
    {
      zqb localzqb1 = (zqb)paramArrayList.get(i1);
      if (localzqb1.d == 1)
      {
        com.aspose.cells.b.a.a.zf.a(localArrayList, localzqb1);
      }
      else
      {
        zcd[] arrayOfzcd1 = zce.a().a(localzqb1.a);
        for (zcd localzcd : arrayOfzcd1)
        {
          zqb localzqb2 = new zqb();
          localzqb2.a = zce.a().b(localzcd.a);
          localzqb2.b = localzqb1.b;
          localzqb2.d = localzqb1.d;
          com.aspose.cells.b.a.a.zf.a(localArrayList, localzqb2);
        }
      }
    }
    paramArrayList.clear();
    com.aspose.cells.b.a.a.zf.a(paramArrayList, localArrayList);
  }
  
  static void a(ArrayList paramArrayList, boolean paramBoolean)
  {
    a(paramArrayList, paramBoolean, false);
  }
  
  static void a(ArrayList paramArrayList, boolean paramBoolean1, boolean paramBoolean2)
  {
    ArrayList localArrayList1 = new ArrayList();
    for (int i1 = 0; i1 < paramArrayList.size(); i1++)
    {
      ArrayList localArrayList2 = new ArrayList();
      zqb localzqb1 = (zqb)paramArrayList.get(i1);
      Font localFont = localzqb1.b;
      int i2 = localzqb1.a.length();
      int i3 = 0;
      while (i3 < i2)
      {
        zc localzc;
        if ((paramBoolean1) || (paramBoolean2)) {
          localzc = r.a(localzqb1.a, i3);
        } else {
          localzc = q.a(localzqb1.a, i3);
        }
        if (!localzc.c()) {
          break;
        }
        zqb localzqb2 = new zqb();
        localzqb2.a = localzc.a();
        localzqb2.b = localFont;
        localzqb2.d = localzqb1.d;
        com.aspose.cells.b.a.a.zf.a(localArrayList2, localzqb2);
        i3 += localzc.e();
      }
      if (paramBoolean1) {
        Collections.reverse(localArrayList2);
      }
      com.aspose.cells.b.a.a.zf.a(localArrayList1, localArrayList2);
    }
    paramArrayList.clear();
    com.aspose.cells.b.a.a.zf.a(paramArrayList, localArrayList1);
  }
  
  static ArrayList a(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    int i1 = paramString.length();
    int i2 = 0;
    while (i2 < i1)
    {
      zc localzc = s.a(paramString, i2);
      if (!localzc.c()) {
        break;
      }
      com.aspose.cells.b.a.a.zf.a(localArrayList, localzc.a());
      i2 += localzc.e();
    }
    return localArrayList;
  }
  
  static boolean a(Style paramStyle)
  {
    boolean bool = (paramStyle.isTextWrapped()) || (paramStyle.getVerticalAlignment() == 6) || (paramStyle.getHorizontalAlignment() == 6) || (paramStyle.getRotationAngle() == 255);
    return bool;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zgz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */