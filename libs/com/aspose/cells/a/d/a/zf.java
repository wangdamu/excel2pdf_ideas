package com.aspose.cells.a.d.a;

import com.aspose.cells.a.d.a.a.zap;
import com.aspose.cells.a.d.a.a.zau;
import com.aspose.cells.a.d.a.a.zba;
import com.aspose.cells.a.d.a.a.zbb;
import com.aspose.cells.a.d.a.a.zbl;
import com.aspose.cells.a.d.a.a.zbm;
import com.aspose.cells.a.d.a.a.zq;
import com.aspose.cells.a.d.a.b.zo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;

public class zf
{
  protected double a;
  protected double b;
  private zh c;
  private Rectangle d;
  private boolean e;
  private boolean f = false;
  private int g = 0;
  private Point[] h = new Point[4];
  private int i = 0;
  private float[] j;
  private float[] k;
  private byte[] l;
  private final zj m;
  private final boolean n;
  
  public zf(zj paramzj, zh paramzh, Rectangle paramRectangle)
  {
    this.m = paramzj;
    this.a = 0.0D;
    this.b = 0.0D;
    this.c = paramzh;
    this.d = paramRectangle;
    this.e = false;
    this.n = paramzj.e();
    if (this.n)
    {
      this.j = new float[8];
      this.k = new float[8];
      this.l = new byte[8];
    }
  }
  
  private void a(double paramDouble1, double paramDouble2)
  {
    a();
    this.a = paramDouble1;
    this.b = paramDouble2;
    paramDouble1 = a(paramDouble1);
    paramDouble2 = a(paramDouble2);
    if (this.n) {
      a(paramDouble1, paramDouble2, (byte)0);
    }
    this.c.a(new zau(new Point((int)paramDouble1, (int)paramDouble2)));
  }
  
  private void b(double paramDouble1, double paramDouble2)
  {
    if (this.g >= this.h.length)
    {
      Point[] arrayOfPoint = new Point[this.g << 1];
      System.arraycopy(this.h, 0, arrayOfPoint, 0, this.g);
      this.h = arrayOfPoint;
    }
    paramDouble1 = a(paramDouble1);
    paramDouble2 = a(paramDouble2);
    int i1 = (int)paramDouble1;
    int i2 = (int)paramDouble2;
    if ((this.f) || (i1 < 32768) || (i1 > 32767) || (i2 < 32768) || (i2 > 32767)) {
      this.f = true;
    }
    if (this.h[this.g] == null) {
      this.h[this.g] = new Point(i1, i2);
    } else {
      this.h[this.g].move(i1, i2);
    }
    if (this.n) {
      a(paramDouble1, paramDouble2, (byte)(this.e ? 3 : 1));
    }
    this.g += 1;
  }
  
  private void a(double paramDouble1, double paramDouble2, byte paramByte)
  {
    if (this.i >= this.j.length)
    {
      float[] arrayOfFloat = new float[this.i << 1];
      System.arraycopy(this.j, 0, arrayOfFloat, 0, this.i);
      this.j = arrayOfFloat;
      arrayOfFloat = new float[this.j.length];
      System.arraycopy(this.k, 0, arrayOfFloat, 0, this.i);
      this.k = arrayOfFloat;
      byte[] arrayOfByte = new byte[this.j.length];
      System.arraycopy(this.l, 0, arrayOfByte, 0, this.i);
      this.l = arrayOfByte;
    }
    this.j[this.i] = ((float)paramDouble1);
    this.k[this.i] = ((float)paramDouble2);
    this.l[this.i] = paramByte;
    this.i += 1;
  }
  
  private void c(double paramDouble1, double paramDouble2)
  {
    if ((this.e) && (this.g > 0)) {
      a();
    }
    this.e = false;
    b(paramDouble1, paramDouble2);
    this.a = paramDouble1;
    this.b = paramDouble2;
  }
  
  private void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
  {
    if ((!this.e) && (this.g > 0)) {
      a();
    }
    this.e = true;
    b(paramDouble1, paramDouble2);
    b(paramDouble3, paramDouble4);
    b(paramDouble5, paramDouble6);
    this.a = paramDouble5;
    this.b = paramDouble6;
  }
  
  private void d(double paramDouble1, double paramDouble2)
  {
    a();
    if ((this.n) && (this.i > 0))
    {
      int tmp28_27 = (this.i - 1);
      byte[] tmp28_19 = this.l;
      tmp28_19[tmp28_27] = ((byte)(tmp28_19[tmp28_27] | 0x80));
    }
    this.c.a(new zq());
    this.a = 0.0D;
    this.b = 0.0D;
  }
  
  private void a()
  {
    if (this.g > 0)
    {
      Object localObject;
      if (this.e)
      {
        if (this.f) {
          localObject = new zba(this.d, this.g, this.h);
        } else {
          localObject = new zbb(this.d, this.g, this.h);
        }
      }
      else if (this.g == 1) {
        localObject = new zap(this.h[0]);
      } else if (this.f) {
        localObject = new zbl(this.d, this.g, this.h);
      } else {
        localObject = new zbm(this.d, this.g, this.h);
      }
      this.c.a((zg)localObject);
    }
    this.g = 0;
    this.f = false;
    this.a = 0.0D;
    this.b = 0.0D;
  }
  
  public boolean a(Shape paramShape, int paramInt)
  {
    return a(paramShape, null, paramInt);
  }
  
  public boolean a(Shape paramShape, AffineTransform paramAffineTransform, int paramInt)
  {
    PathIterator localPathIterator = paramShape.getPathIterator(paramAffineTransform);
    double[] arrayOfDouble = new double[6];
    int i1 = 1;
    double d1 = 0.0D;
    double d2 = 0.0D;
    while (!localPathIterator.isDone())
    {
      int i2 = localPathIterator.currentSegment(arrayOfDouble);
      switch (i2)
      {
      case 0: 
        a(arrayOfDouble[0], arrayOfDouble[1]);
        d1 = arrayOfDouble[0];
        d2 = arrayOfDouble[1];
        break;
      case 1: 
        c(arrayOfDouble[0], arrayOfDouble[1]);
        break;
      case 2: 
        a(arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2], arrayOfDouble[3]);
        break;
      case 3: 
        a(arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2], arrayOfDouble[3], arrayOfDouble[4], arrayOfDouble[5]);
        break;
      case 4: 
        d(d1, d2);
      }
      localPathIterator.next();
    }
    a();
    if (this.n) {
      this.m.a(new zo(paramInt - 1, this.j, this.k, this.l, this.i));
    }
    this.i = 0;
    return localPathIterator.getWindingRule() == 0;
  }
  
  private void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    double d1 = paramDouble1 + (this.a - paramDouble1) / 3.0D;
    double d2 = paramDouble2 + (this.b - paramDouble2) / 3.0D;
    double d3 = paramDouble1 + (paramDouble3 - paramDouble1) / 3.0D;
    double d4 = paramDouble2 + (paramDouble4 - paramDouble2) / 3.0D;
    a(d1, d2, d3, d4, paramDouble3, paramDouble4);
    this.a = paramDouble3;
    this.b = paramDouble4;
  }
  
  private float a(double paramDouble)
  {
    return (float)(paramDouble * 1.0D * 20.0D);
  }
  
  public static boolean a(Shape paramShape)
  {
    return paramShape.getPathIterator(null).getWindingRule() == 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/zf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */