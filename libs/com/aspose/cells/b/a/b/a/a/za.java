package com.aspose.cells.b.a.b.a.a;

import com.aspose.cells.a.e.zi;
import com.aspose.cells.b.a.b.a.zj;
import com.aspose.cells.b.a.b.zo;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.GeneralPath;
import java.awt.geom.IllegalPathStateException;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Float;

public class za
  implements Shape, Cloneable
{
  private byte[] a = null;
  private float[] b = null;
  private int c = 0;
  private int d = 0;
  private int e = 0;
  private zj f = null;
  private GeneralPath g = null;
  
  public za()
  {
    this(1, 20, 20);
  }
  
  public za(Shape paramShape)
  {
    this(1, 20, 20);
    PathIterator localPathIterator = paramShape.getPathIterator(null);
    a(localPathIterator.getWindingRule());
    a(localPathIterator, false);
  }
  
  private za(int paramInt1, int paramInt2, int paramInt3)
  {
    a(paramInt1);
    a(paramInt2, paramInt3);
  }
  
  private final GeneralPath n()
  {
    if (this.g == null)
    {
      PathIterator localPathIterator = getPathIterator(null);
      this.g = new GeneralPath();
      this.g.append(localPathIterator, false);
    }
    return this.g;
  }
  
  public final byte[] a()
  {
    return this.a;
  }
  
  public final float[] b()
  {
    return this.b;
  }
  
  public final int c()
  {
    return this.c;
  }
  
  public final int d()
  {
    return this.d;
  }
  
  public final boolean e()
  {
    return (c() == 0) || ((a()[(c() - 1)] & 0x4) != 0) || ((a()[(c() - 1)] & 0x10) != 0);
  }
  
  public final int f()
  {
    return d() / 2;
  }
  
  public final zj g()
  {
    if (this.f == null) {
      this.f = p();
    }
    return this.f;
  }
  
  private final void o()
  {
    this.f = null;
    this.g = null;
  }
  
  private final zj p()
  {
    zj localzj = new zj();
    int i = f();
    for (int j = 0; j < c(); j++) {
      if ((a()[j] & 0x7) == 2) {
        i++;
      }
    }
    localzj.a(new byte[i]);
    localzj.a(new zo[i]);
    j = 0;
    int k = 0;
    int m = 0;
    for (int i1 = 0; i1 < c(); i1++)
    {
      int i2 = (byte)(a()[i1] & 0x7);
      int n = (byte)((a()[i1] & 0x20) != 0 ? 32 : 0);
      switch (i2)
      {
      case 4: 
        localzj.b()[(j - 1)] = zi.a(localzj.b()[(j - 1)] & 0xFF | 0x80 | n);
        break;
      case 0: 
        localzj.b()[(j++)] = zi.a(n);
        localzj.a()[(k++)] = new zo(b()[(m++)], b()[(m++)]);
        break;
      case 1: 
        localzj.b()[(j++)] = zi.a(0x1 | n);
        localzj.a()[(k++)] = new zo(b()[(m++)], b()[(m++)]);
        break;
      case 2: 
        float f1 = b()[(m - 2)];
        float f2 = b()[(m - 1)];
        float f3 = f1 + 0.0F * (b()[(m++)] - f1);
        float f4 = f2 + 0.0F * (b()[(m++)] - f2);
        float f5 = b()[(m++)];
        float f6 = b()[(m++)];
        float f7 = f3 + 0.0F * (f5 - f1);
        float f8 = f4 + 0.0F * (f6 - f2);
        localzj.b()[(j++)] = zi.a(3);
        localzj.a()[(k++)] = new zo(f3, f4);
        localzj.b()[(j++)] = zi.a(3);
        localzj.a()[(k++)] = new zo(f7, f8);
        localzj.b()[(j++)] = zi.a(0x3 | n);
        localzj.a()[(k++)] = new zo(f5, f6);
        break;
      case 3: 
        localzj.b()[(j++)] = zi.a(3);
        localzj.a()[(k++)] = new zo(b()[(m++)], b()[(m++)]);
        localzj.b()[(j++)] = zi.a(3);
        localzj.a()[(k++)] = new zo(b()[(m++)], b()[(m++)]);
        localzj.b()[(j++)] = zi.a(0x3 | n);
        localzj.a()[(k++)] = new zo(b()[(m++)], b()[(m++)]);
      }
    }
    return localzj;
  }
  
  public final void a(Shape paramShape)
  {
    a(paramShape, !e());
  }
  
  public final void a(PathIterator paramPathIterator, boolean paramBoolean)
  {
    o();
    float[] arrayOfFloat = new float[6];
    while (!paramPathIterator.isDone())
    {
      switch (paramPathIterator.currentSegment(arrayOfFloat))
      {
      default: 
        break;
      case 0: 
        if ((!paramBoolean) || (this.c < 1) || (this.d < 2)) {
          b(arrayOfFloat[0], arrayOfFloat[1]);
        } else {
          if ((this.a[(this.c - 1)] != 4) && (this.b[(this.d - 2)] == arrayOfFloat[0]) && (this.b[(this.d - 1)] == arrayOfFloat[1])) {
            break;
          }
        }
        break;
      case 1: 
        a(arrayOfFloat[0], arrayOfFloat[1]);
        break;
      case 2: 
        a(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2], arrayOfFloat[3]);
        break;
      case 3: 
        a(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2], arrayOfFloat[3], arrayOfFloat[4], arrayOfFloat[5]);
        break;
      case 4: 
        h();
      }
      paramPathIterator.next();
      paramBoolean = false;
    }
  }
  
  public final void a(Shape paramShape, boolean paramBoolean)
  {
    PathIterator localPathIterator = paramShape.getPathIterator(null);
    a(localPathIterator, paramBoolean);
  }
  
  public Object clone()
  {
    za localza = new za();
    localza.a = ((byte[])com.aspose.cells.a.e.za.a(this.a));
    localza.b = ((float[])com.aspose.cells.a.e.za.a(this.b));
    localza.e = this.e;
    localza.c = this.c;
    localza.d = this.d;
    return localza;
  }
  
  public final void h()
  {
    o();
    if ((this.c == 0) || (this.a[(this.c - 1)] != 4))
    {
      a(1, 0, true);
      this.a[(this.c++)] = 4;
    }
  }
  
  public boolean contains(double x, double y)
  {
    return n().contains(x, y);
  }
  
  public boolean contains(double x, double y, double w, double h)
  {
    return n().contains(x, y, w, h);
  }
  
  public boolean contains(Point2D p)
  {
    return contains(p.getX(), p.getY());
  }
  
  public boolean contains(Rectangle2D r)
  {
    return contains(r.getX(), r.getY(), r.getWidth(), r.getHeight());
  }
  
  public final void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    o();
    a(1, 6, true);
    this.a[(this.c++)] = 3;
    this.b[(this.d++)] = paramFloat1;
    this.b[(this.d++)] = paramFloat2;
    this.b[(this.d++)] = paramFloat3;
    this.b[(this.d++)] = paramFloat4;
    this.b[(this.d++)] = paramFloat5;
    this.b[(this.d++)] = paramFloat6;
  }
  
  public Rectangle getBounds()
  {
    return getBounds2D().getBounds();
  }
  
  public Rectangle2D getBounds2D()
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    int i = 0;
    float f5 = 0.0F;
    float f6 = 0.0F;
    i = this.d;
    if (i > 0)
    {
      f2 = f4 = this.b[(--i)];
      f1 = f3 = this.b[(--i)];
      while (i > 0)
      {
        float f7 = this.b[(--i)];
        f6 = this.b[(--i)];
        if (f6 < f1) {
          f1 = f6;
        }
        if (f7 < f2) {
          f2 = f7;
        }
        if (f6 > f3) {
          f3 = f6;
        }
        if (f7 > f4) {
          f4 = f7;
        }
      }
    }
    f1 = f2 = f3 = f4 = 0.0F;
    return new Rectangle2D.Float(f1, f2, f3 - f1, f4 - f2);
  }
  
  public PathIterator getPathIterator(AffineTransform at)
  {
    return new zb(this, at);
  }
  
  public PathIterator getPathIterator(AffineTransform at, double flatness)
  {
    return new FlatteningPathIterator(getPathIterator(at), flatness);
  }
  
  public final int i()
  {
    return this.e;
  }
  
  public boolean intersects(double x, double y, double w, double h)
  {
    return n().intersects(x, y, w, h);
  }
  
  public boolean intersects(Rectangle2D r)
  {
    return intersects(r.getX(), r.getY(), r.getWidth(), r.getHeight());
  }
  
  public final void a(float paramFloat1, float paramFloat2)
  {
    o();
    a(1, 2, true);
    this.a[(this.c++)] = 1;
    this.b[(this.d++)] = paramFloat1;
    this.b[(this.d++)] = paramFloat2;
  }
  
  public final void b(float paramFloat1, float paramFloat2)
  {
    o();
    if ((this.c > 0) && (this.a[(this.c - 1)] == 0))
    {
      this.b[(this.d - 2)] = paramFloat1;
      this.b[(this.d - 1)] = paramFloat2;
    }
    else
    {
      a(1, 2, false);
      this.a[(this.c++)] = 0;
      this.b[(this.d++)] = paramFloat1;
      this.b[(this.d++)] = paramFloat2;
    }
  }
  
  public final void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    o();
    a(1, 4, true);
    this.a[(this.c++)] = 2;
    this.b[(this.d++)] = paramFloat1;
    this.b[(this.d++)] = paramFloat2;
    this.b[(this.d++)] = paramFloat3;
    this.b[(this.d++)] = paramFloat4;
  }
  
  public final void a(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1)) {
      throw new IllegalArgumentException("winding rule must be WIND_EVEN_ODD or WIND_NON_ZERO");
    }
    this.e = paramInt;
  }
  
  public final void a(AffineTransform paramAffineTransform)
  {
    a(paramAffineTransform, 0, d());
  }
  
  public final void a(AffineTransform paramAffineTransform, int paramInt1, int paramInt2)
  {
    o();
    paramAffineTransform.transform(this.b, paramInt1, this.b, paramInt1, paramInt2 / 2);
  }
  
  private final void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if ((paramBoolean) && (this.c == 0)) {
      throw new IllegalPathStateException("missing initial moveto in path definition");
    }
    int i = this.b.length;
    int j;
    Object localObject;
    if (this.d + paramInt2 > i)
    {
      j = i;
      if (j > 1000) {
        j = 1000;
      }
      if (j < paramInt2) {
        j = paramInt2;
      }
      localObject = new float[i + j];
      System.arraycopy(this.b, 0, localObject, 0, this.d);
      this.b = ((float[])localObject);
    }
    i = this.a.length;
    if (this.c + paramInt1 > i)
    {
      j = i;
      if (j > 500) {
        j = 500;
      }
      if (j < paramInt1) {
        j = paramInt1;
      }
      localObject = new byte[i + j];
      System.arraycopy(this.a, 0, localObject, 0, this.c);
      this.a = ((byte[])localObject);
    }
  }
  
  public final void j()
  {
    o();
    if (c() > 0)
    {
      int tmp21_20 = (c() - 1);
      byte[] tmp21_12 = a();
      tmp21_12[tmp21_20] = ((byte)(tmp21_12[tmp21_20] | 0x20));
    }
  }
  
  public final void k()
  {
    o();
    if (c() > 0)
    {
      int tmp21_20 = (c() - 1);
      byte[] tmp21_12 = a();
      tmp21_12[tmp21_20] = ((byte)(tmp21_12[tmp21_20] | 0x10));
    }
  }
  
  private final void a(int paramInt1, int paramInt2)
  {
    o();
    this.a = new byte[paramInt1];
    this.b = new float[paramInt2 * 2];
    this.c = 0;
    this.d = 0;
  }
  
  public final void l()
  {
    a(20, 20);
  }
  
  public final zo m()
  {
    if (d() == 0) {
      throw new IllegalArgumentException("Invalid parameter used.");
    }
    return new zo(this.b[(d() - 2)], this.b[(d() - 1)]);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/a/a/za.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */