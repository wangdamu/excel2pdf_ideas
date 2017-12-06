package com.aspose.cells.b.a.b;

import com.aspose.cells.Color;
import com.aspose.cells.b.a.b.a.zd;
import com.aspose.cells.b.a.b.a.zg;
import com.aspose.cells.b.a.b.a.zh;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.za;
import java.awt.BasicStroke;
import java.awt.Stroke;

public class zm
{
  private static float[] b = new float[0];
  private static float[] c = { 3.0F, 1.0F };
  private static float[] d = { 1.0F, 1.0F };
  private static float[] e = { 3.0F, 1.0F, 1.0F, 1.0F };
  private static float[] f = { 3.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F };
  private zc g;
  private int h;
  private int i;
  private int j;
  private int k;
  private int l;
  private int m;
  private zi n;
  private float o;
  private float p;
  private float[] q;
  float[] a;
  private float r;
  private zd s;
  private zd t;
  
  public zm(Color paramColor)
  {
    this(paramColor, 1.0F);
  }
  
  public zm(Color paramColor, float paramFloat)
  {
    this(new zu(paramColor), paramFloat);
  }
  
  public zm(zc paramzc, float paramFloat)
  {
    this.g = ((zc)paramzc.e());
    this.o = paramFloat;
    this.h = 0;
    this.j = 0;
    this.i = 0;
    this.k = 0;
    this.m = 0;
    this.l = 0;
    this.r = 10.0F;
    this.n = new zi();
    this.q = b;
  }
  
  public void a() {}
  
  public zc b()
  {
    return this.g;
  }
  
  public Color c()
  {
    if ((this.g instanceof zu)) {
      return ((zu)this.g).a();
    }
    if ((this.g instanceof zh)) {
      return ((zh)this.g).c();
    }
    return Color.getEmpty();
  }
  
  public int d()
  {
    return this.i;
  }
  
  public void a(int paramInt)
  {
    this.i = paramInt;
  }
  
  public float e()
  {
    return this.p;
  }
  
  public void a(float paramFloat)
  {
    this.p = paramFloat;
  }
  
  public float[] f()
  {
    return this.q;
  }
  
  public void a(float[] paramArrayOfFloat)
  {
    this.q = paramArrayOfFloat;
    this.h = (this.q == null ? 0 : 5);
  }
  
  public int g()
  {
    return this.h;
  }
  
  public void b(int paramInt)
  {
    this.h = paramInt;
    switch (paramInt)
    {
    case 0: 
      this.q = b;
      break;
    case 1: 
      this.q = c;
      break;
    case 2: 
      this.q = d;
      break;
    case 3: 
      this.q = e;
      break;
    case 4: 
      this.q = f;
      break;
    default: 
      this.q = b;
    }
  }
  
  public int h()
  {
    return this.j;
  }
  
  public void c(int paramInt)
  {
    this.j = paramInt;
  }
  
  public int i()
  {
    return this.k;
  }
  
  public void d(int paramInt)
  {
    this.k = paramInt;
  }
  
  public int j()
  {
    return this.l;
  }
  
  public void e(int paramInt)
  {
    this.l = paramInt;
  }
  
  public float k()
  {
    return this.r;
  }
  
  public void b(float[] paramArrayOfFloat)
  {
    this.a = paramArrayOfFloat;
  }
  
  public float[] l()
  {
    return this.a;
  }
  
  public void a(zd paramzd)
  {
    this.s = paramzd;
    this.j = 255;
  }
  
  public void b(zd paramzd)
  {
    this.t = paramzd;
    this.k = 255;
  }
  
  public int m()
  {
    if ((this.g instanceof zu)) {
      return 0;
    }
    if ((this.g instanceof zh)) {
      return 4;
    }
    if ((this.g instanceof zx)) {
      return 2;
    }
    if ((this.g instanceof zg)) {
      return 1;
    }
    throw new IllegalArgumentException("invalid brush");
  }
  
  public float n()
  {
    return this.o;
  }
  
  public void b(float paramFloat)
  {
    this.o = paramFloat;
  }
  
  public Object o()
  {
    zm localzm = new zm((zc)this.g.e(), this.o);
    localzm.m = this.m;
    localzm.i = this.i;
    localzm.p = this.p;
    if (this.q != null) {
      localzm.q = za.a(this.q);
    }
    localzm.h = this.h;
    localzm.k = this.k;
    localzm.l = this.l;
    localzm.r = this.r;
    localzm.j = this.j;
    if (this.n != null) {
      localzm.n = this.n.b();
    }
    return localzm;
  }
  
  public Stroke p()
  {
    float[] arrayOfFloat = null;
    switch (this.h)
    {
    case 5: 
      if (this.q != null)
      {
        arrayOfFloat = new float[this.q.length];
        for (i1 = 0; i1 < this.q.length; i1++) {
          if (this.k == 0)
          {
            arrayOfFloat[i1] = (this.q[i1] * this.o);
          }
          else if ((i1 & 0x1) == 0)
          {
            arrayOfFloat[i1] = (this.q[i1] * this.o - this.o);
            if (this.q[i1] < 0.0F) {
              arrayOfFloat[i1] = 0.0F;
            }
          }
          else
          {
            arrayOfFloat[i1] = (this.q[i1] * this.o + this.o);
          }
        }
      }
      break;
    case 0: 
      arrayOfFloat = b;
      break;
    case 1: 
      arrayOfFloat = c;
      break;
    case 2: 
      arrayOfFloat = d;
      break;
    case 3: 
      arrayOfFloat = e;
      break;
    case 4: 
      arrayOfFloat = f;
      break;
    default: 
      arrayOfFloat = b;
    }
    int i1 = 0;
    switch (this.l)
    {
    case 1: 
      i1 = 2;
      break;
    case 0: 
    case 3: 
      i1 = 0;
      break;
    case 2: 
      i1 = 1;
    }
    int i2 = 1;
    switch (this.k)
    {
    case 1: 
    case 20: 
      i2 = 2;
      break;
    case 2: 
    case 18: 
      i2 = 1;
      break;
    case 0: 
      i2 = 0;
    }
    if (this.h != 0) {
      return new BasicStroke(this.o, i2, i1, this.r, arrayOfFloat, 0.0F);
    }
    return new BasicStroke(this.o, i2, i1, this.r);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/zm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */