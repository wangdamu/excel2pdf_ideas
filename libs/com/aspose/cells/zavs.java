package com.aspose.cells;

import com.aspose.cells.a.d.zb;
import com.aspose.cells.a.d.zbh;
import com.aspose.cells.a.d.zdr;
import com.aspose.cells.a.d.zgl;
import com.aspose.cells.a.d.zj;
import com.aspose.cells.a.d.zk;
import com.aspose.cells.a.d.zl;
import com.aspose.cells.a.d.zm;
import com.aspose.cells.a.d.zn;
import com.aspose.cells.a.d.zp;
import com.aspose.cells.a.d.zx;
import com.aspose.cells.b.a.b.a.zg;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zu;
import com.aspose.cells.b.a.zr;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class zavs
{
  private static zb P = new zb();
  zbyr a;
  zo b;
  public zb c;
  public zat d;
  public int e;
  public int f;
  public int g;
  public int h;
  public float i;
  public float j;
  public float k;
  public float l;
  public float m;
  public float n;
  public Color o;
  public boolean p;
  public ArrayList q;
  public int r;
  public int s;
  public float t;
  public zb u;
  public com.aspose.cells.a.d.zf v;
  public String w;
  public zq x;
  public float y;
  public float z;
  private zgz Q;
  public Cells A;
  public boolean B;
  public String C;
  public zb D;
  public zb E;
  public zgw F;
  public double[] G;
  public zb H;
  public zb I;
  public zb J;
  public zb K;
  public float L = 1.0F;
  public int M = 0;
  public HashMap N = new HashMap();
  public boolean O = false;
  private zgl R;
  private static String[] S = { "ColorScaledStyle", "DataBarStyle", "IconSetStyle" };
  
  public zavs(zbyr paramzbyr)
  {
    this.a = paramzbyr;
  }
  
  public boolean a()
  {
    return (this.M & 0x6) != 0;
  }
  
  private void j()
  {
    this.w = null;
    this.L = 1.0F;
  }
  
  public void a(boolean paramBoolean)
    throws Exception
  {
    c(paramBoolean);
    j();
  }
  
  void a(float paramFloat1, float paramFloat2, zq paramzq, zp paramzp, int paramInt)
  {
    this.l = paramFloat2;
    this.k = paramFloat1;
    float f1 = paramFloat1;
    float f2 = paramFloat2;
    float f3 = 0.0F;
    Color localColor = Color.a(255, this.A.g().A());
    zx localzx1 = new zx(localColor, 1.5F * (float)this.G[0]);
    localzx1.c = 2;
    localzx1.d = 2;
    zx localzx2;
    switch (paramInt)
    {
    case 0: 
      localzx2 = new zx(localColor, 1.0F * (float)this.G[0]);
      localzx2.a(new float[] { 1.0F, 1.0F });
      break;
    case 1: 
      localzx2 = new zx(localColor, 0.5F * (float)this.G[1]);
      localzx2.g = 0;
      break;
    default: 
      localzx2 = new zx(localColor, 1.0F * (float)this.G[0]);
      localzx2.a(new float[] { 1.0F, 1.0F });
    }
    f3 += (float)this.G[0] * (float)zavt.c(this.A, this.f, this.h);
    float f4;
    zm localzm;
    for (int i1 = this.e; i1 <= this.g; i1++)
    {
      f4 = (float)this.G[1] * (float)zavt.a(this.A, i1);
      if (f4 != 0.0F)
      {
        localzm = new zm(new zo(paramFloat1, (float)zr.b(f2, 3)), new zo(paramFloat1 + f3, (float)zr.b(f2, 3)));
        if (i1 == this.e) {
          localzm.c = localzx1;
        } else {
          localzm.c = localzx2;
        }
        this.K.a(localzm);
        f2 += f4;
        if (i1 == this.g)
        {
          localzm = new zm(new zo(paramFloat1, (float)zr.b(f2, 3)), new zo(paramFloat1 + f3, (float)zr.b(f2, 3)));
          localzm.c = localzx1;
          this.K.a(localzm);
        }
      }
    }
    for (i1 = this.f; i1 <= this.h; i1++)
    {
      f4 = (float)this.G[0] * (float)zavt.c(this.A, i1);
      if (f4 != 0.0F)
      {
        if (this.A.g().getDisplayRightToLeft()) {
          localzm = new zm(new zo(paramzq.h() - f1 + 1.0F, (float)zr.b(paramFloat2, 3)), new zo(paramzq.h() - f1 + 1.0F, (float)zr.b(f2, 3)));
        } else {
          localzm = new zm(new zo(f1, (float)zr.b(paramFloat2, 3)), new zo(f1, (float)zr.b(f2, 3)));
        }
        if (i1 == this.f) {
          localzm.c = localzx1;
        } else {
          localzm.c = localzx2;
        }
        this.K.a(localzm);
        f1 += f4;
        if (i1 == this.h)
        {
          if (this.A.g().getDisplayRightToLeft()) {
            localzm = new zm(new zo(paramzq.h() - f1 + 1.0F, (float)zr.b(paramFloat2, 3)), new zo(paramzq.h() - f1 + 1.0F, (float)zr.b(f2, 3)));
          } else {
            localzm = new zm(new zo(f1, (float)zr.b(paramFloat2, 3)), new zo(f1, (float)zr.b(f2, 3)));
          }
          localzm.c = localzx1;
          this.K.a(localzm);
        }
      }
    }
    zb localzb = new zb();
    localzb.a(paramzp);
    localzb.a(this.K);
    if (this.O) {
      localzb.a(new zdr(8, this.A.g().getIndex()));
    }
    this.c.a(localzb);
  }
  
  void a(zq paramzq)
  {
    Color localColor1 = Color.a(255, this.F.c().getForegroundColor());
    Color localColor2 = Color.a(255, this.F.c().getBackgroundColor());
    if (this.F.c().a.b()) {
      localColor2 = Color.getWhite();
    }
    ArrayList localArrayList = zj.a(localColor1, localColor2, paramzq, this.F.c().y(), this.F.c().z());
    zb localzb = new zb();
    Iterator localIterator;
    zp localzp;
    if ((this.t != 0.0F) && (this.F.d()) && (this.F.m() == 1) && (this.F.l() == 1) && (this.F.q()))
    {
      localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        localzp = (zp)localIterator.next();
        localzb.a(localzp);
      }
      this.J.a(a(localzb, this.k, this.l + this.i));
    }
    else
    {
      if (a()) {
        localzb.a(null);
      } else {
        localzb.a(new com.aspose.cells.a.d.zat(new zq(paramzq.f() + this.b.d(), paramzq.g() + this.b.e(), paramzq.h(), paramzq.i()), this.A.g().getDisplayRightToLeft(), this.b));
      }
      localzb.a(new zp(paramzq));
      localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        localzp = (zp)localIterator.next();
        localzb.a(localzp);
      }
      this.I.a(localzb);
    }
  }
  
  private zu a(Color paramColor)
  {
    int i1 = paramColor.toArgb();
    zu localzu = (zu)this.a.d.get(Integer.valueOf(i1));
    if (localzu == null) {
      synchronized (this.a.d)
      {
        localzu = (zu)this.a.d.get(Integer.valueOf(i1));
        if (localzu == null)
        {
          localzu = new zu(paramColor);
          this.a.d.put(Integer.valueOf(i1), localzu);
        }
      }
    }
    return localzu;
  }
  
  zb a(zb paramzb, float paramFloat1, float paramFloat2)
  {
    if (paramzb.a() == null) {
      paramzb.a(new zi());
    }
    float f1 = (float)(-this.t * 0.017453292519943295D);
    float f2 = (float)(1.0D / Math.tan(f1));
    paramzb.a().c(f2, 0.0F);
    zb localzb = new zb();
    localzb.a(new zi(1.0F, 0.0F, 0.0F, 1.0F, -f2 * paramFloat2, 0.0F));
    localzb.a(paramzb);
    return localzb;
  }
  
  void b(zq paramzq)
  {
    zp localzp = null;
    Color localColor = Color.a(255, this.o);
    localzp = zp.b(paramzq);
    if (this.F.u())
    {
      localColor = Color.a(255, Color.getWhite());
    }
    else if (((this.F.c().getPattern() == 0) || (this.F.c().b.b())) && (this.o.getA() == 0) && (this.o.getR() == 0) && (this.o.getG() == 0) && (this.o.getB() == 0))
    {
      if ((!this.A.g().getPageSetup().getPrintGridlines()) || ((!this.F.n()) && (this.F.l() == 1) && (this.F.m() == 1))) {
        return;
      }
      localColor = Color.a(255, Color.getWhite());
    }
    else if (((this.v instanceof zbh)) || ((localColor.getR() & 0xFF) != 255) || ((localColor.getG() & 0xFF) != 255) || ((localColor.getB() & 0xFF) != 255) || (this.A.g().getPageSetup().getPrintGridlines())) {}
    localzp.a(a(localColor));
    zb localzb = new zb();
    localzb.a(localzp);
    if ((this.t != 0.0F) && (this.F.d()) && (this.F.m() == 1) && (this.F.l() == 1) && (this.F.q()))
    {
      this.J.a(a(localzb, this.k, this.l + this.i));
    }
    else
    {
      localzb.a(null);
      this.I.a(localzb);
    }
  }
  
  void c(zq paramzq)
  {
    zp localzp = zp.b(paramzq);
    Color localColor1 = Color.getWhite();
    int i1 = zavt.a(this.F.c().getPattern());
    Color localColor2 = Color.a(255, this.F.c().getForegroundColor());
    Color localColor3 = Color.a(255, this.F.c().getBackgroundColor());
    if (this.F.c().a.b()) {
      localColor3 = Color.getWhite();
    }
    zg localzg = new zg(i1, localColor2, localColor3);
    localzp.a(localzg);
    zb localzb = new zb();
    localzb.a(localzp);
    if ((this.t != 0.0F) && (this.F.d()) && (this.F.m() == 1) && (this.F.l() == 1) && (this.F.q()))
    {
      this.J.a(a(localzb, this.k, this.l + this.i));
    }
    else
    {
      if (a()) {
        localzb.a(null);
      } else {
        localzb.a(new com.aspose.cells.a.d.zat(new zq(paramzq.f() + this.b.d(), paramzq.g() + this.b.e(), paramzq.h(), paramzq.i()), this.A.g().getDisplayRightToLeft(), this.b));
      }
      this.I.a(localzb);
    }
  }
  
  void b()
  {
    if (this.p) {
      return;
    }
    zq localzq;
    if ((this.F.c().getPattern() == 0) && (!this.F.u())) {
      localzq = new zq(this.k + 0.5F * (float)this.G[0], this.l + 0.5F * (float)this.G[0], this.j - 1.0F * (float)this.G[0], this.i - 1.0F * (float)this.G[0]);
    } else {
      localzq = new zq(this.k, this.l, this.j, this.i);
    }
    if (this.F.c().isGradient())
    {
      a(localzq);
      return;
    }
    if ((this.F.c().getPattern() != 0) && (this.F.c().getPattern() != 1))
    {
      c(localzq);
      return;
    }
    b(localzq);
  }
  
  void c()
  {
    this.H = new zb();
  }
  
  void d()
  {
    this.I = new zb();
  }
  
  void e()
  {
    this.K = new zb();
    this.u = new zb();
    this.J = new zb();
    this.N = new HashMap();
  }
  
  void b(boolean paramBoolean)
  {
    a(paramBoolean, null);
  }
  
  void a(boolean paramBoolean, zp paramzp)
  {
    this.u.a(this.J);
    if (paramBoolean)
    {
      localObject1 = new zaut(this.N, this.e, this.g, this.f, this.h, this.A.g().getDisplayRightToLeft());
      ((zaut)localObject1).a();
    }
    Object localObject1 = this.N.keySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = ((Iterator)localObject1).next();
      zdm localzdm = (zdm)this.N.get(localObject2);
      if ((localzdm != null) && (localzdm.c() != null) && (localzdm.c() != P)) {
        this.u.a(localzdm.c());
      }
    }
    localObject1 = new zb();
    ((zb)localObject1).a(paramzp);
    ((zb)localObject1).a(this.u);
    if ((this.O) && ((this.u.h().size() > 1) || (this.J.h().size() > 0))) {
      ((zb)localObject1).a(new zdr(7, this.A.g().getIndex()));
    }
    this.c.a((zn)localObject1);
    this.N.clear();
  }
  
  void a(zp paramzp)
  {
    a(paramzp, false);
  }
  
  void a(zp paramzp, boolean paramBoolean)
  {
    zb localzb = new zb();
    localzb.a(paramzp);
    localzb.a(this.I);
    if ((this.O) && (!paramBoolean) && (this.I.h().size() > 0)) {
      localzb.a(new zdr(9, this.A.g().getIndex()));
    }
    this.c.a(localzb);
  }
  
  void f()
  {
    b(null);
  }
  
  void b(zp paramzp)
  {
    zb localzb = new zb();
    localzb.a(paramzp);
    localzb.a(this.H);
    this.c.a(localzb);
  }
  
  void a(float paramFloat)
  {
    if (((this.F.d != null) && (this.F.d.getLineStyle() != 0)) || ((this.F.e != null) && (this.F.e.getLineStyle() != 0)))
    {
      b(this.F.c().getBorders());
      a(this.q, this.F.j(), this.F.k(), this.k, this.l, this.j, this.i);
    }
    int i1;
    if (this.F.f < 0)
    {
      i1 = this.F.k() - (this.F.m() - 1);
      if (i1 < 0) {
        i1 = 0;
      }
    }
    else
    {
      i1 = this.F.k();
    }
    int i2 = 0;
    int i3 = (this.F.l & 0x3) == 3 ? 1 : 0;
    float f1 = this.l;
    for (int i4 = this.F.j(); i4 < this.F.j() + this.F.l(); i4++)
    {
      float f2;
      if ((i4 == this.F.j()) && (paramFloat != -1.0F)) {
        f2 = (float)(paramFloat * this.G[1]);
      } else {
        f2 = (float)(zavt.a(this.A, i4) * this.G[1]);
      }
      float f3 = this.k;
      for (int i5 = i1; (i5 < i1 + this.F.m()) && (i5 <= 16383); i5++)
      {
        float f4 = (float)(zavt.c(this.A, i5) * this.G[0]);
        Style localStyle = new Style(this.A.p());
        BorderCollection localBorderCollection = new BorderCollection(localStyle);
        Object localObject;
        if ((this.F.n()) && (!this.F.j))
        {
          if ((this.F.c() != null) && (this.F.c().d() != null))
          {
            localObject = this.F.c().getBorders();
            if (i4 == this.F.o().a)
            {
              localBorderCollection.getByBorderType(4).setColor(((BorderCollection)localObject).getByBorderType(4).getColor());
              localBorderCollection.getByBorderType(4).setLineStyle(((BorderCollection)localObject).getByBorderType(4).getLineStyle());
            }
            if (i5 == this.F.o().b)
            {
              localBorderCollection.getByBorderType(1).setColor(((BorderCollection)localObject).getByBorderType(1).getColor());
              localBorderCollection.getByBorderType(1).setLineStyle(((BorderCollection)localObject).getByBorderType(1).getLineStyle());
            }
          }
          if ((this.F.i != null) && (this.F.i.d() != null))
          {
            localObject = this.F.i.getBorders();
            if (i5 == this.F.o().d)
            {
              localBorderCollection.getByBorderType(2).setColor(((BorderCollection)localObject).getByBorderType(2).getColor());
              localBorderCollection.getByBorderType(2).setLineStyle(((BorderCollection)localObject).getByBorderType(2).getLineStyle());
            }
            if (i4 == this.F.o().c)
            {
              localBorderCollection.getByBorderType(8).setColor(((BorderCollection)localObject).getByBorderType(8).getColor());
              localBorderCollection.getByBorderType(8).setLineStyle(((BorderCollection)localObject).getByBorderType(8).getLineStyle());
            }
          }
        }
        else if ((this.F.l() == 1) && (this.F.m() == 1) && (!this.F.n()))
        {
          if ((this.F.c() != null) && (this.F.c().d() != null)) {
            localBorderCollection.a(this.F.c().getBorders(), null);
          }
        }
        else
        {
          localObject = this.A.b(i4, i5, false);
          if ((localObject != null) && (((Style)localObject).d() != null)) {
            localBorderCollection.a(((Style)localObject).getBorders(), null);
          }
        }
        if ((this.F.m() > 1) || (i3 != 0))
        {
          if ((i5 != i1) || ((i3 != 0) && (i5 != this.F.o().b)))
          {
            i2 = (i4 << 11) + (i5 << 1) + 1;
            this.N.put(Integer.valueOf(i2), new zdm(P, 0, Color.getEmpty()));
            localBorderCollection.getByBorderType(1).setLineStyle(0);
          }
          if ((i5 != i1 + this.F.m() - 1) || ((i3 != 0) && (i5 != this.F.o().d)))
          {
            i2 = (i4 << 11) + (i5 + 1 << 1) + 1;
            this.N.put(Integer.valueOf(i2), new zdm(P, 0, Color.getEmpty()));
            localBorderCollection.getByBorderType(2).setLineStyle(0);
          }
        }
        if ((this.F.l() > 1) || (i3 != 0))
        {
          if ((i4 != this.F.j()) || ((i3 != 0) && (i4 != this.F.o().a)))
          {
            i2 = (i4 << 11) + (i5 << 1) + 0;
            this.N.put(Integer.valueOf(i2), new zdm(P, 0, Color.getEmpty()));
            localBorderCollection.getByBorderType(4).setLineStyle(0);
          }
          if ((i4 != this.F.j() + this.F.l() - 1) || ((i3 != 0) && (i4 != this.F.o().c)))
          {
            i2 = (i4 + 1 << 11) + (i5 << 1) + 0;
            this.N.put(Integer.valueOf(i2), new zdm(P, 0, Color.getEmpty()));
            localBorderCollection.getByBorderType(8).setLineStyle(0);
          }
        }
        a(localBorderCollection);
        if (((i4 == this.F.j()) && (i5 == this.F.k())) || (this.F.n()) || (this.F.b())) {
          if (this.A.g().getDisplayRightToLeft()) {
            a(this.q, i4, i5, f3 + this.j - f4, f1, f4, f2);
          } else {
            a(this.q, i4, i5, f3, f1, f4, f2);
          }
        }
        if (this.A.g().getDisplayRightToLeft()) {
          f3 -= f4;
        } else {
          f3 += f4;
        }
      }
      f1 += f2;
    }
  }
  
  static float a(int paramInt)
  {
    float f1 = 2.0F;
    switch (paramInt)
    {
    case 6: 
      f1 *= 0.5F;
      break;
    case 5: 
      f1 *= 1.5F;
      break;
    case 1: 
      f1 *= 0.5F;
      break;
    case 9: 
      f1 *= 0.5F;
      break;
    case 11: 
      f1 *= 0.5F;
      break;
    case 3: 
      f1 *= 0.5F;
      break;
    case 4: 
      f1 *= 0.5F;
      break;
    case 7: 
      f1 *= 0.25F;
      break;
    case 10: 
      break;
    case 12: 
      break;
    case 8: 
      break;
    case 2: 
      break;
    case 13: 
      break;
    }
    return f1;
  }
  
  private void a(Border paramBorder, int paramInt)
  {
    float f1 = a(paramBorder.getLineStyle());
    int i1 = paramInt;
    ArrayList localArrayList = new ArrayList(3);
    com.aspose.cells.b.a.a.zf.a(localArrayList, Float.valueOf((float)(f1 * this.G[1])));
    Color localColor = a(paramBorder);
    com.aspose.cells.b.a.a.zf.a(localArrayList, localColor);
    com.aspose.cells.b.a.a.zf.a(localArrayList, Integer.valueOf(paramBorder.getLineStyle()));
    this.q.set(i1, localArrayList);
  }
  
  private Color a(Border paramBorder)
  {
    Color localColor;
    if (paramBorder.a.b()) {
      localColor = Color.a(255, this.A.g().A());
    } else {
      localColor = Color.a(255, paramBorder.getColor());
    }
    return localColor;
  }
  
  private ArrayList a(BorderCollection paramBorderCollection)
  {
    this.q = new ArrayList(6);
    for (int i1 = 0; i1 < 6; i1++) {
      com.aspose.cells.b.a.a.zf.a(this.q, null);
    }
    if (paramBorderCollection.getByBorderType(4).getLineStyle() != 0) {
      a(paramBorderCollection.getByBorderType(4), 1);
    }
    if (paramBorderCollection.getByBorderType(8).getLineStyle() != 0) {
      a(paramBorderCollection.getByBorderType(8), 3);
    }
    if (paramBorderCollection.getByBorderType(1).getLineStyle() != 0) {
      a(paramBorderCollection.getByBorderType(1), 0);
    }
    if (paramBorderCollection.getByBorderType(2).getLineStyle() != 0) {
      a(paramBorderCollection.getByBorderType(2), 2);
    }
    return this.q;
  }
  
  private ArrayList b(BorderCollection paramBorderCollection)
  {
    this.q = new ArrayList(6);
    for (int i1 = 0; i1 < 6; i1++) {
      com.aspose.cells.b.a.a.zf.a(this.q, null);
    }
    if (paramBorderCollection.getByBorderType(32).getLineStyle() != 0) {
      a(paramBorderCollection.getByBorderType(32), 4);
    }
    if (paramBorderCollection.getByBorderType(16).getLineStyle() != 0) {
      a(paramBorderCollection.getByBorderType(16), 5);
    }
    return this.q;
  }
  
  private void a(zb paramzb, int paramInt1, ArrayList paramArrayList, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, boolean paramBoolean)
  {
    if (paramArrayList == null) {
      return;
    }
    Color localColor = (Color)paramArrayList.get(1);
    float f1 = ((Float)paramArrayList.get(0)).floatValue();
    if (this.p) {
      localColor = Color.getBlack();
    }
    zx localzx = new zx(localColor, f1);
    localzx.h = 1.0F;
    float f2 = 2.0F;
    float f3 = 1.0F;
    float f4 = 1.0F;
    switch (((Integer)paramArrayList.get(2)).intValue())
    {
    case 6: 
      localzx.g = 0;
      localzx.a(0, 0, 0);
      break;
    case 1: 
    case 2: 
    case 5: 
      localzx.g = 0;
      localzx.a(0, 0, 0);
      break;
    case 9: 
      localzx.g = 5;
      localzx.a(new float[] { f2, f4, f3, f4 });
      localzx.k = (paramFloat1 % (f2 + f4 + f3 + f4));
      break;
    case 11: 
      localzx.g = 5;
      localzx.a(new float[] { f2, f4, f3, f4, f3, f4 });
      localzx.k = (paramFloat1 % (f2 + f4 + f3 + f4 + f3 + f4));
      break;
    case 3: 
      localzx.g = 5;
      localzx.a(new float[] { f2, f4 });
      localzx.k = (paramFloat1 % (f2 + f4));
      break;
    case 4: 
      localzx.g = 5;
      localzx.a(new float[] { f3, f4 });
      localzx.k = (paramFloat1 % (f3 + f4));
      break;
    case 7: 
      localzx.g = 0;
      localzx.a(0, 0, 0);
      break;
    case 10: 
      localzx.g = 5;
      localzx.a(new float[] { f2, f4, f3, f4 });
      localzx.k = (paramFloat1 % (f2 + f4 + f3 + f4));
      break;
    case 12: 
      localzx.g = 5;
      localzx.a(new float[] { f2, f4, f3, f4, f3, f4 });
      localzx.k = (paramFloat1 % (f2 + f4 + f3 + f4 + f3 + f4));
      break;
    case 8: 
      localzx.g = 5;
      localzx.a(new float[] { f2, f4 });
      localzx.k = (paramFloat1 % (f2 + f4));
      break;
    case 13: 
      localzx.g = 5;
      localzx.a(new float[] { f2, f4, f3, f4 });
      localzx.k = (paramFloat1 % (f2 + f4 + f3 + f4));
    }
    float f9 = f1;
    int i1 = 0;
    float f8;
    float f7;
    float f6;
    float f5;
    float f13;
    float f12;
    float f11;
    float f10;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if (((Integer)paramArrayList.get(2)).intValue() == 6)
    {
      float f17;
      float f16;
      float f15;
      float f14;
      f10 = f11 = f12 = f13 = f5 = f6 = f7 = f8 = f14 = f15 = f16 = f17 = 0.0F;
      localObject1 = new zp();
      zp localzp = new zp();
      localObject2 = new zp();
      localObject3 = new zb();
      f9 = f1;
      int i3;
      int i4;
      switch (paramInt1)
      {
      case 0: 
        i1 = (paramInt2 << 11) + (paramInt3 << 1) + 1;
        a(paramBoolean, i1, (zn)localObject3, ((Integer)paramArrayList.get(2)).intValue(), localColor);
        f5 = zdo.a(this.A, paramInt2, paramInt3, paramInt2, paramInt3 - 1, 4) * (float)this.G[1];
        f8 = zdo.a(this.A, paramInt2, paramInt3, paramInt2, paramInt3 - 1, 8) * (float)this.G[1];
        f10 = zdo.b(this.A, paramInt2, paramInt3, paramInt2, paramInt3 - 1, 4) * (float)this.G[1];
        f13 = zdo.b(this.A, paramInt2, paramInt3, paramInt2, paramInt3 - 1, 8) * (float)this.G[1];
        f15 = zdo.a(this.A, paramInt2, paramInt3, paramInt2, paramInt3 - 1, 4, paramInt2 - 1, paramInt3, 1) * (float)this.G[1];
        f17 = zdo.a(this.A, paramInt2, paramInt3, paramInt2, paramInt3 - 1, 8, paramInt2 + this.F.l(), paramInt3, 1) * (float)this.G[1];
        localObject1 = zp.a(new zo(paramFloat1 - f9, paramFloat2 + f10), new zo(paramFloat1 - f9, paramFloat2 + paramFloat4 - f13));
        localzp = zp.a(new zo(paramFloat1 + f9, paramFloat2 + f5), new zo(paramFloat1 + f9, paramFloat2 + paramFloat4 - f8));
        localObject2 = zp.a(new zo(paramFloat1, paramFloat2 + f15), new zo(paramFloat1, paramFloat2 + paramFloat4 - f17));
        break;
      case 1: 
        i1 = (paramInt2 << 11) + (paramInt3 << 1) + 0;
        a(paramBoolean, i1, (zn)localObject3, ((Integer)paramArrayList.get(2)).intValue(), localColor);
        f5 = zdo.a(this.A, paramInt2, paramInt3, paramInt2 - 1, paramInt3, 1) * (float)this.G[0];
        f8 = zdo.a(this.A, paramInt2, paramInt3, paramInt2 - 1, paramInt3, 2) * (float)this.G[0];
        f10 = zdo.b(this.A, paramInt2, paramInt3, paramInt2 - 1, paramInt3, 1) * (float)this.G[0];
        f13 = zdo.b(this.A, paramInt2, paramInt3, paramInt2 - 1, paramInt3, 2) * (float)this.G[0];
        f14 = zdo.a(this.A, paramInt2, paramInt3, paramInt2 - 1, paramInt3, 1, paramInt2, paramInt3 - 1, 4) * (float)this.G[0];
        f16 = zdo.a(this.A, paramInt2, paramInt3, paramInt2 - 1, paramInt3, 2, paramInt2, paramInt3 + this.F.m(), 4) * (float)this.G[0];
        localObject1 = zp.a(new zo(paramFloat1 + f5, paramFloat2 + f9), new zo(paramFloat1 + paramFloat3 - f8, paramFloat2 + f9));
        localzp = zp.a(new zo(paramFloat1 + f10, paramFloat2 - f9), new zo(paramFloat1 + paramFloat3 - f13, paramFloat2 - f9));
        localObject2 = zp.a(new zo(paramFloat1 + f14, paramFloat2), new zo(paramFloat1 + paramFloat3 - f16, paramFloat2));
        break;
      case 2: 
        i1 = (paramInt2 << 11) + (paramInt3 + 1 << 1) + 1;
        a(paramBoolean, i1, (zn)localObject3, ((Integer)paramArrayList.get(2)).intValue(), localColor);
        i3 = this.F.m() == 1 ? paramInt3 : paramInt3 + this.F.m() - 1;
        i4 = this.F.l() == 1 ? paramInt2 : paramInt2 + this.F.l() - 1;
        f5 = zdo.a(this.A, i4, i3, i4, i3 + 1, 4) * (float)this.G[1];
        f8 = zdo.a(this.A, i4, i3, i4, i3 + 1, 8) * (float)this.G[1];
        f10 = zdo.b(this.A, i4, i3, i4, i3 + 1, 4) * (float)this.G[1];
        f13 = zdo.b(this.A, i4, i3, i4, i3 + 1, 8) * (float)this.G[1];
        f15 = zdo.a(this.A, i4, i3, i4, i3 + 1, 4, i4 - 1, i3, 2) * (float)this.G[1];
        f17 = zdo.a(this.A, i4, i3, i4, i3 + 1, 8, i4 + 1, i3, 2) * (float)this.G[1];
        localObject1 = zp.a(new zo(paramFloat1 - f9 + paramFloat3, paramFloat2 + f10), new zo(paramFloat1 - f9 + paramFloat3, paramFloat2 + paramFloat4 - f13));
        localzp = zp.a(new zo(paramFloat1 + f9 + paramFloat3, paramFloat2 + f5), new zo(paramFloat1 + f9 + paramFloat3, paramFloat2 + paramFloat4 - f8));
        localObject2 = zp.a(new zo(paramFloat1 + paramFloat3, paramFloat2 + f15), new zo(paramFloat1 + paramFloat3, paramFloat2 + paramFloat4 - f17));
        break;
      case 3: 
        i1 = (paramInt2 + 1 << 11) + (paramInt3 << 1) + 0;
        a(paramBoolean, i1, (zn)localObject3, ((Integer)paramArrayList.get(2)).intValue(), localColor);
        i3 = this.F.m() == 1 ? paramInt3 : paramInt3 + this.F.m() - 1;
        i4 = this.F.l() == 1 ? paramInt2 : paramInt2 + this.F.l() - 1;
        f5 = zdo.a(this.A, i4, i3, i4 + 1, i3, 1) * (float)this.G[0];
        f8 = zdo.a(this.A, i4, i3, i4 + 1, i3, 2) * (float)this.G[0];
        f10 = zdo.b(this.A, i4, i3, i4 + 1, i3, 1) * (float)this.G[0];
        f13 = zdo.b(this.A, i4, i3, i4 + 1, i3, 2) * (float)this.G[0];
        f14 = zdo.a(this.A, i4, i3, i4 + 1, i3, 1, i4, i3 - 1, 8) * (float)this.G[0];
        f16 = zdo.a(this.A, i4, i3, i4 + 1, i3, 2, i4, i3 + this.F.m(), 8) * (float)this.G[0];
        localObject1 = zp.a(new zo(paramFloat1 + f5, paramFloat2 + paramFloat4 - f9), new zo(paramFloat1 + paramFloat3 - f8, paramFloat2 + paramFloat4 - f9));
        localzp = zp.a(new zo(paramFloat1 + f10, paramFloat2 + paramFloat4 + f9), new zo(paramFloat1 + paramFloat3 - f13, paramFloat2 + paramFloat4 + f9));
        localObject2 = zp.a(new zo(paramFloat1 + f14, paramFloat2 + paramFloat4), new zo(paramFloat1 + paramFloat3 - f16, paramFloat2 + paramFloat4));
        break;
      }
      ((zp)localObject1).a(localzx);
      localzp.a(localzx);
      localObject4 = new zx(Color.getWhite(), f1);
      ((zx)localObject4).a(0, 0, 0);
      ((zp)localObject2).a((zx)localObject4);
      ((zb)localObject3).a((zn)localObject1);
      ((zb)localObject3).a(localzp);
      ((zb)localObject3).a((zn)localObject2);
      if (paramBoolean) {
        paramzb.a((zn)localObject3);
      }
    }
    else
    {
      localObject1 = null;
      f10 = f11 = f12 = f13 = f5 = f6 = f7 = f8 = 0.0F;
      switch (paramInt1)
      {
      case 0: 
        i1 = (paramInt2 << 11) + (paramInt3 << 1) + 1;
        if (this.A.g().getDisplayRightToLeft()) {
          localObject1 = new zm(new zo((float)zr.b(paramFloat1 + paramFloat3, 3), paramFloat2 + f5), new zo((float)zr.b(paramFloat1 + paramFloat3, 3), paramFloat2 + paramFloat4 - f8));
        } else {
          localObject1 = new zm(new zo((float)zr.b(paramFloat1, 3), paramFloat2 + f5), new zo((float)zr.b(paramFloat1, 3), paramFloat2 + paramFloat4 - f8));
        }
        a(paramBoolean, i1, (zn)localObject1, ((Integer)paramArrayList.get(2)).intValue(), localColor);
        break;
      case 1: 
        i1 = (paramInt2 << 11) + (paramInt3 << 1) + 0;
        localObject1 = new zm(new zo(paramFloat1 + f6, (float)zr.b(paramFloat2, 3)), new zo(paramFloat1 + paramFloat3 - f7, (float)zr.b(paramFloat2, 3)));
        a(paramBoolean, i1, (zn)localObject1, ((Integer)paramArrayList.get(2)).intValue(), localColor);
        if ((paramBoolean) && (this.t > 0.0F) && (paramInt3 - 1 >= 0))
        {
          int i2 = (paramInt2 << 11) + (paramInt3 - 1 << 1) + 0;
          localObject2 = (zdm)this.N.get(Integer.valueOf(i2));
          if ((localObject2 != null) && (((zdm)localObject2).c() != null) && (((zdm)localObject2).c() != P) && ((((zdm)localObject2).c() instanceof zm)))
          {
            localObject3 = (zm)((zdm)localObject2).c();
            localObject4 = ((zm)localObject3).b;
            ((zm)localObject3).b = new zo(((zo)localObject4).d() + this.i / (float)Math.tan(this.t / 180.0F * 3.141592653589793D), ((zo)localObject4).e());
          }
        }
        break;
      case 2: 
        i1 = (paramInt2 << 11) + (paramInt3 + 1 << 1) + 1;
        if (this.A.g().getDisplayRightToLeft()) {
          localObject1 = new zm(new zo((float)zr.b(paramFloat1, 3), paramFloat2 + f5), new zo((float)zr.b(paramFloat1, 3), paramFloat2 + paramFloat4 - f8));
        } else {
          localObject1 = new zm(new zo((float)zr.b(paramFloat1 + paramFloat3, 3), paramFloat2 + f5), new zo((float)zr.b(paramFloat1 + paramFloat3, 3), paramFloat2 + paramFloat4 - f8));
        }
        a(paramBoolean, i1, (zn)localObject1, ((Integer)paramArrayList.get(2)).intValue(), localColor);
        break;
      case 3: 
        i1 = (paramInt2 + 1 << 11) + (paramInt3 << 1) + 0;
        localObject1 = new zm(new zo(paramFloat1 + f6, (float)zr.b(paramFloat2 + paramFloat4, 3)), new zo(paramFloat1 + paramFloat3 - f7, (float)zr.b(paramFloat2 + paramFloat4, 3)));
        a(paramBoolean, i1, (zn)localObject1, ((Integer)paramArrayList.get(2)).intValue(), localColor);
        break;
      case 4: 
        i1 = -((paramInt2 + 1 << 11) + (paramInt3 << 1) + 0);
        localObject1 = new zm(new zo(paramFloat1, paramFloat2 + paramFloat4), new zo(paramFloat1 + paramFloat3, paramFloat2));
        a(paramBoolean, i1, (zn)localObject1, ((Integer)paramArrayList.get(2)).intValue(), localColor);
        break;
      case 5: 
        i1 = -((paramInt2 + 1 << 11) + (paramInt3 << 1) + 1);
        localObject1 = new zm(new zo(paramFloat1, paramFloat2), new zo(paramFloat1 + paramFloat3, paramFloat2 + paramFloat4));
        a(paramBoolean, i1, (zn)localObject1, ((Integer)paramArrayList.get(2)).intValue(), localColor);
      }
      if (localObject1 != null)
      {
        ((zm)localObject1).c = localzx;
        if (paramBoolean) {
          paramzb.a((zn)localObject1);
        }
      }
    }
  }
  
  private void a(ArrayList paramArrayList, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    int i1 = -1;
    float[] arrayOfFloat = new float[6];
    if (paramArrayList != null)
    {
      Object localObject1;
      if ((this.t == 0.0F) || (this.t == 90.0F) || (this.t == -90.0F) || (this.F.r() == null) || (this.F.r().size() == 0) || (this.F.n()))
      {
        localObject1 = paramArrayList.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          ArrayList localArrayList1 = (ArrayList)((Iterator)localObject1).next();
          i1++;
          a(this.u, i1, localArrayList1, paramInt1, paramInt2, paramFloat1, paramFloat2, paramFloat3, paramFloat4, false);
        }
      }
      else
      {
        localObject1 = new zb();
        float f1 = (float)(-this.t * 0.017453292519943295D);
        float f2 = (float)(1.0D / Math.tan(f1));
        ((zb)localObject1).a(new zi());
        ((zb)localObject1).a().c(f2, 0.0F);
        Object localObject2 = paramArrayList.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          ArrayList localArrayList2 = (ArrayList)((Iterator)localObject2).next();
          i1++;
          a((zb)localObject1, i1, localArrayList2, paramInt1, paramInt2, 0.0F, 0.0F, paramFloat3, paramFloat4, true);
        }
        localObject2 = new zb();
        ((zb)localObject2).a((zn)localObject1);
        ((zb)localObject2).a(new zi(1.0F, 0.0F, 0.0F, 1.0F, paramFloat1 + paramFloat4 / (float)Math.tan(this.t / 180.0F * 3.141592653589793D), paramFloat2));
        this.J.a((zn)localObject2);
      }
    }
  }
  
  private void k()
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    this.L = 1.0F;
    f1 = this.Q.f;
    f2 = this.Q.e;
    if (this.F.c().getShrinkToFit())
    {
      this.L = a(this.j, this.i, f2, f1);
      f2 *= this.L;
      f1 *= this.L;
    }
    float f5 = f1;
    if ((!this.F.v()) && (f1 > this.i) && (this.Q.i != null) && (this.Q.i.size() > 1)) {
      for (int i1 = this.Q.i.size() - 1; i1 >= 0; i1--)
      {
        zanw localzanw = (zanw)this.Q.i.get(i1);
        if (f1 - localzanw.e * this.L <= this.i - (float)(1.0D * this.G[1])) {
          break;
        }
        f1 -= localzanw.e * this.L;
      }
    }
    switch (this.r)
    {
    case 1: 
      f4 = this.l + (this.i - f1) * 0.5F - (float)(1.0D * this.G[1]);
      break;
    case 3: 
    case 9: 
      if (this.i - f1 < 1.0D * this.G[1]) {
        f4 = this.l;
      } else {
        f4 = this.l + (float)(1.0D * this.G[1]);
      }
      break;
    case 0: 
      f4 = this.l + this.i - f1 - (float)(1.0D * this.G[1]);
      if ((this.F.c() != null) && (this.F.c().d() != null) && (this.F.c().getBorders().getByBorderType(8).getLineStyle() == 6)) {
        f4 -= 1.0F * (float)this.G[1];
      }
      break;
    case 2: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    default: 
      f4 = this.l + (this.i - f1) * 0.5F;
    }
    if (this.s == 5) {
      this.s = this.F.g();
    }
    if ((this.j < f2) && ((this.s == 1) || (this.s == 2)) && (this.t != 0.0F)) {
      f3 = this.k + 1.0F;
    } else {
      switch (this.s)
      {
      case 1: 
      case 2: 
        f3 = this.k + (this.j - f2) * 0.5F;
        break;
      case 3: 
      case 6: 
      case 7: 
        if (this.j - f2 < 1.0D * this.G[0]) {
          f3 = this.k;
        } else {
          f3 = this.k + (float)(1.0D * this.G[0]);
        }
        break;
      case 8: 
        f3 = this.k + (this.j - f2 - 1.0F);
      }
    }
    this.x = new zq(f3, f4, f2, f5);
  }
  
  private float a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    float f1;
    if ((this.t == 90.0F) || (this.t == -90.0F))
    {
      f1 = Math.min(paramFloat1 / paramFloat4, Math.max(paramFloat2 - 2.0F, 1.0F) / paramFloat3);
    }
    else
    {
      float f2 = 0.0F;
      if (this.Q.i.size() > 0) {
        f2 = paramFloat4 / this.Q.i.size() * 0.25F;
      }
      f1 = Math.min(Math.max(paramFloat1 - 2.0F * (float)this.G[0] - f2, 1.0F) / paramFloat3, paramFloat2 / paramFloat4);
    }
    return Math.min(f1, 1.0F);
  }
  
  private void c(zb paramzb)
  {
    if (this.Q.i.size() == 0) {
      return;
    }
    if (((this.t > 0.0F) || (this.t < 0.0F)) && (this.t != 255.0F))
    {
      float f1 = 0.0F;
      float f2 = 0.0F;
      int i1 = this.F.c().getRotationAngle();
      double d1 = i1 / 180.0F * 3.141592653589793D;
      float f6 = 0.0F;
      float f7 = 0.0F;
      int i2 = 0;
      for (int i3 = 0; i3 < this.Q.i.size(); i3++)
      {
        zanw localzanw2 = (zanw)this.Q.i.get(i3);
        if (localzanw2.d > f6)
        {
          f6 = localzanw2.d;
          f7 = localzanw2.e;
          i2 = i3;
        }
      }
      zanw localzanw1 = (zanw)this.Q.i.get(0);
      float f3;
      float f4;
      float f5;
      float f15;
      float f16;
      float f21;
      float f9;
      if (i1 > 0)
      {
        f3 = (float)Math.sin(d1);
        f4 = (float)Math.cos(d1);
        f5 = (float)Math.tan(d1);
        if ((!this.F.d()) || (this.F.n())) {
          switch (this.s)
          {
          case 7: 
            f1 = this.k + localzanw1.e * f3;
            f2 = this.l + this.i;
            break;
          case 8: 
            f1 = this.k + this.j;
            for (int i4 = 0; i4 < this.Q.i.size(); i4++)
            {
              zanw localzanw3 = (zanw)this.Q.i.get(i4);
              if (i4 == this.Q.i.size() - 1) {
                f1 -= localzanw3.e * f3;
              } else {
                f1 -= localzanw3.e / f3;
              }
            }
            f1 -= localzanw1.d * f4;
            f1 += localzanw1.e * f3;
            f2 = this.l + this.i;
            f2 -= f6 * f3 + f7 * f4;
            f2 += localzanw1.d * f3;
            f2 += localzanw1.e * f4;
            break;
          case 1: 
          case 2: 
            f1 = this.k + localzanw1.e * f3;
            float f8 = 0.0F;
            float f10 = f6 * f3 + f7 * f4;
            float f13 = f7 * f3;
            f15 = f6 * f4;
            f16 = f7 / f3;
            for (int i8 = i2 - 1; i8 >= 0; i8--)
            {
              zanw localzanw7 = (zanw)this.Q.i.get(i8);
              float f19 = localzanw7.d * f3 + localzanw7.e * f4;
              f13 = Math.max(f13, f16 + localzanw7.e * f3 - 0.5F * (f10 - f19) / f5);
              f16 += localzanw7.e / f3;
            }
            float f17 = 0.0F;
            for (int i10 = i2 + 1; i10 < this.Q.i.size(); i10++)
            {
              zanw localzanw9 = (zanw)this.Q.i.get(i10);
              f21 = localzanw9.d * f3 + localzanw9.e * f4;
              f15 = Math.max(f15, f17 + localzanw9.e / f3 + localzanw9.d * f4 + 0.5F * (f10 - f21) / f5);
              f17 += localzanw9.e / f3;
            }
            f8 = f13 + f15;
            f1 += (this.j - f8) / 2.0F;
            f2 = this.l + this.i;
            f2 -= (f6 * f3 + f7 * f4 - (localzanw1.d * f3 + localzanw1.e * f4)) / 2.0F;
            break;
          case 3: 
          case 4: 
          case 5: 
          case 6: 
          default: 
            f1 = this.k + localzanw1.e * f3;
            f2 = this.l + this.i;
          }
        }
        switch (this.r)
        {
        case 0: 
          break;
        case 1: 
          f2 -= 0.5F * (this.i - (f6 * f3 + f7 * f4));
          break;
        case 9: 
          f2 -= this.i - (f6 * f3 + f7 * f4);
          break;
        default: 
          break;
          switch (this.s)
          {
          case 6: 
          case 7: 
            f1 = this.k + localzanw1.e / f3;
            f2 = this.l + this.i;
            break;
          case 8: 
            f1 = this.k + this.j + (f6 * f3 + f7 * f4) / f5;
            for (int i5 = 0; i5 < this.Q.i.size(); i5++)
            {
              zanw localzanw4 = (zanw)this.Q.i.get(i5);
              f1 -= localzanw4.e / f3;
            }
            f1 -= localzanw1.d * f4;
            f1 += localzanw1.e * f3;
            f2 = this.l + this.i;
            f2 -= f6 * f3 + f7 * f4;
            f2 += localzanw1.d * f3;
            f2 += localzanw1.e * f4;
            break;
          case 1: 
          case 2: 
            f9 = (f6 * f3 + f7 * f4 - (localzanw1.d * f3 + localzanw1.e * f4)) / 2.0F;
            f2 = this.l + this.i;
            f2 -= f9;
            f1 = this.k + (this.j - this.Q.f / f3) / 2.0F;
            f1 += f9 / f5;
            f1 += localzanw1.e / f3;
            break;
          case 3: 
          case 4: 
          case 5: 
          default: 
            f1 = this.k + localzanw1.e / f3;
            f2 = this.l + this.i;
          }
          f9 = 0.0F;
          switch (this.r)
          {
          case 0: 
            break;
          case 1: 
            f9 = 0.5F * (this.i - (f6 * f3 + f7 * f4));
            break;
          case 9: 
            f9 = this.i - (f6 * f3 + f7 * f4);
            break;
          }
          f2 -= f9;
          f1 += f9 / f5;
          break;
        }
      }
      else if (i1 < 0)
      {
        f3 = (float)Math.sin(-d1);
        f4 = (float)Math.cos(-d1);
        f5 = (float)Math.tan(-d1);
        f9 = f6 * f3 + f7 * f4;
        if ((!this.F.d()) || (this.F.n())) {
          switch (this.s)
          {
          case 6: 
          case 7: 
            f1 = this.k;
            for (int i6 = this.Q.i.size() - 1; i6 >= 0; i6--)
            {
              zanw localzanw5 = (zanw)this.Q.i.get(i6);
              if (i6 == this.Q.i.size() - 1) {
                f1 += localzanw5.e * f3;
              } else {
                f1 += localzanw5.e / f3;
              }
            }
            f1 -= localzanw1.e * f3;
            f2 = this.l + this.i - f9;
            f2 += localzanw1.e * f4;
            break;
          case 8: 
            f1 = this.k + this.j;
            f1 -= localzanw1.e * f3 + localzanw1.d * f4;
            f2 = this.l + this.i;
            f2 -= localzanw1.d * f3;
            break;
          case 1: 
          case 2: 
            float f11 = 0.0F;
            float f14 = f6 * f4;
            f15 = f7 * f3;
            f16 = 0.0F;
            for (int i9 = i2 - 1; i9 >= 0; i9--)
            {
              zanw localzanw8 = (zanw)this.Q.i.get(i9);
              float f20 = localzanw8.d * f3 + localzanw8.e * f4;
              f14 = Math.max(f14, f16 + localzanw8.e / f3 + localzanw8.d * f4 + 0.5F * (f9 - f20) / f5);
              f16 += localzanw8.e / f3;
            }
            float f18 = f7 / f3;
            for (int i11 = i2 + 1; i11 < this.Q.i.size(); i11++)
            {
              zanw localzanw10 = (zanw)this.Q.i.get(i11);
              f21 = localzanw10.d * f3 + localzanw10.e * f4;
              f15 = Math.max(f15, f18 + localzanw10.e * f3 - 0.5F * (f9 - f21) / f5);
              f18 += localzanw10.e / f3;
            }
            f11 = f14 + f15;
            f1 = this.k + this.j;
            f1 -= (this.j - f11) / 2.0F;
            f1 -= localzanw1.d * f4 + localzanw1.e * f3;
            f2 = this.l + this.i;
            f2 -= f9;
            f2 += (f9 - (localzanw1.d * f3 + localzanw1.e * f4)) / 2.0F;
            f2 += localzanw1.e * f4;
            break;
          case 3: 
          case 4: 
          case 5: 
          default: 
            f1 = this.k + this.j;
            f1 -= localzanw1.e * f3 + localzanw1.d * f4;
            f2 = this.l + this.i;
            f2 -= localzanw1.d * f3;
          }
        }
        switch (this.r)
        {
        case 0: 
          break;
        case 1: 
          f2 -= 0.5F * (this.i - f9);
          break;
        case 9: 
          f2 -= this.i - f9;
          break;
        default: 
          f2 -= this.i - f9;
          break;
          switch (this.s)
          {
          case 6: 
          case 7: 
            f1 = this.k - f9 / f5;
            for (int i7 = 0; i7 < this.Q.i.size(); i7++)
            {
              zanw localzanw6 = (zanw)this.Q.i.get(i7);
              f1 += localzanw6.e / f3;
            }
            f1 -= localzanw1.e * f3;
            f2 = this.l + this.i;
            f2 -= f9;
            f2 += localzanw1.e * f4;
            break;
          case 8: 
            f1 = this.k + this.j;
            f1 -= localzanw1.e / f3 + localzanw1.d * f4;
            f2 = this.l + this.i;
            f2 -= localzanw1.d * f3;
            break;
          case 1: 
          case 2: 
            f12 = (f9 - (localzanw1.d * f3 + localzanw1.e * f4)) / 2.0F;
            f2 = this.l + this.i;
            f2 -= f9;
            f2 += f12;
            f2 += localzanw1.e * f4;
            f1 = this.k + this.j;
            f1 -= (this.j - this.Q.f / f3) / 2.0F;
            f1 -= (f12 + localzanw1.e * f4) / f5;
            f1 -= localzanw1.d * f4 + localzanw1.e * f3;
            break;
          case 3: 
          case 4: 
          case 5: 
          default: 
            f1 = this.k + this.j;
            f1 -= localzanw1.e / f3 + localzanw1.d * f4;
            f2 = this.l + this.i;
            f2 -= localzanw1.d * f3;
          }
          float f12 = 0.0F;
          switch (this.r)
          {
          case 0: 
            break;
          case 1: 
            f12 = 0.5F * (this.i - f9);
            break;
          case 9: 
            f12 = this.i - f9;
            break;
          default: 
            f12 = this.i - f9;
          }
          f2 -= f12;
          f1 -= f12 / f5;
        }
      }
      paramzb.a(new zi(1.0F * this.L, 0.0F, 0.0F, 1.0F * this.L, 0.0F, 0.0F));
      paramzb.a().b(f1, f2, 1);
    }
  }
  
  public void a(zb paramzb)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    double d1 = this.t / 180.0F * 3.141592653589793D;
    paramzb.a(null);
    if ((!this.F.d()) || (this.F.n()))
    {
      if (this.t < -1.4E-45F)
      {
        switch (this.s)
        {
        case 1: 
        case 2: 
          f1 = this.k + (this.j - this.x.i() * (float)Math.sin(-d1) - this.x.h() * (float)Math.cos(d1)) / 2.0F;
          break;
        case 6: 
        case 7: 
          f1 = this.k;
          break;
        case 8: 
          f1 = this.k + this.j - this.x.i() * (float)Math.sin(-d1) - this.x.h() * (float)Math.cos(d1);
        }
        switch (this.r)
        {
        case 1: 
          f2 = this.l + (this.i - this.x.h() * (float)Math.sin(-d1) + this.x.i() * (float)Math.cos(d1)) / 2.0F;
          break;
        case 9: 
          f2 = this.l + this.x.i() * (float)Math.cos(d1);
          break;
        case 0: 
          f2 = this.l + this.i - this.x.h() * (float)Math.sin(-d1);
          break;
        default: 
          f2 = this.l + this.x.i() * (float)Math.cos(d1);
        }
        paramzb.a(new zi(1.0F * this.L, 0.0F, 0.0F, 1.0F * this.L, 0.0F, 0.0F));
        paramzb.a().b(f1, f2, 1);
      }
      else if (this.t > Float.MIN_VALUE)
      {
        switch (this.s)
        {
        case 1: 
        case 2: 
          f1 = this.k + (this.j - this.x.h() * (float)Math.cos(d1) + this.x.i() * (float)Math.sin(d1)) / 2.0F;
          break;
        case 6: 
        case 7: 
          f1 = this.k + this.x.i() * (float)Math.sin(d1);
          break;
        case 8: 
          f1 = this.k + this.j - this.x.h() * (float)Math.cos(d1);
        }
        switch (this.r)
        {
        case 1: 
          f2 = this.l + (this.i + this.x.i() * (float)Math.cos(d1) + this.x.h() * (float)Math.sin(d1)) / 2.0F;
          break;
        case 9: 
          f2 = this.l + this.x.i() * (float)Math.cos(d1) + this.x.h() * (float)Math.sin(d1);
          break;
        case 0: 
          f2 = this.l + this.i;
          break;
        default: 
          f2 = this.l + this.i - (this.x.i() * (float)Math.cos(d1) - this.x.h() * (float)Math.sin(d1)) / 2.0F;
        }
        paramzb.a(new zi(1.0F * this.L, 0.0F, 0.0F, 1.0F * this.L, 0.0F, 0.0F));
        paramzb.a().b(f1, f2, 1);
      }
    }
    else if (this.t < -1.4E-45F)
    {
      switch (this.r)
      {
      case 1: 
        f2 = this.l + (this.i - this.x.h() * (float)Math.sin(-d1) + this.x.i() * (float)Math.cos(d1)) / 2.0F;
        break;
      case 9: 
        f2 = this.l + this.x.i() * (float)Math.cos(d1);
        break;
      case 0: 
        f2 = this.l + this.i - this.x.h() * (float)Math.sin(-d1);
        break;
      default: 
        f2 = this.l + this.x.i() * (float)Math.cos(d1);
      }
      switch (this.s)
      {
      case 1: 
      case 2: 
        f1 = this.k - (this.i - (f2 - this.l)) / (float)Math.tan(-d1) + (this.j - this.x.i() / (float)Math.sin(-d1)) / 2.0F;
        break;
      case 6: 
      case 7: 
        f1 = this.k - (this.i - (f2 - this.l)) / (float)Math.tan(-d1);
        break;
      case 8: 
        f1 = this.k - (this.i - (f2 - this.l)) / (float)Math.tan(-d1) + this.j - this.x.i() / (float)Math.sin(-d1);
      }
      paramzb.a(new zi(1.0F * this.L, 0.0F, 0.0F, 1.0F * this.L, 0.0F, 0.0F));
      paramzb.a().b(f1, f2, 1);
    }
    else if (this.t > Float.MIN_VALUE)
    {
      switch (this.r)
      {
      case 1: 
        f2 = this.l + (this.i + this.x.i() * (float)Math.cos(d1) + this.x.h() * (float)Math.sin(d1)) / 2.0F;
        break;
      case 9: 
        f2 = this.l + this.x.i() * (float)Math.cos(d1) + this.x.h() * (float)Math.sin(d1);
        break;
      case 0: 
        f2 = this.l + this.i;
        break;
      default: 
        f2 = this.l + this.i - (this.x.i() * (float)Math.cos(d1) - this.x.h() * (float)Math.sin(d1)) / 2.0F;
      }
      switch (this.s)
      {
      case 1: 
      case 2: 
        f1 = this.k + (this.j + this.x.i() / (float)Math.sin(d1)) / 2.0F + (this.i - (f2 - this.l)) / (float)Math.tan(d1);
        break;
      case 6: 
      case 7: 
        f1 = this.k + this.x.i() / (float)Math.sin(d1) + (this.i - (f2 - this.l)) / (float)Math.tan(d1);
        break;
      case 8: 
        f1 = this.k + this.j + (this.i - (f2 - this.l)) / (float)Math.tan(d1);
      }
      paramzb.a(new zi(1.0F * this.L, 0.0F, 0.0F, 1.0F * this.L, 0.0F, 0.0F));
      paramzb.a().b(f1, f2, 1);
    }
  }
  
  public void b(zb paramzb)
  {
    float f1 = 0.0F;
    paramzb.a(null);
    if ((this.t < -1.4E-45F) || (this.t > Float.MIN_VALUE))
    {
      f1 = -this.t;
      paramzb.a(new zi(1.0F * this.L, 0.0F, 0.0F, 1.0F * this.L, 0.0F, 0.0F));
      paramzb.a().a(f1, new zo(0.0F, 0.0F));
    }
    else
    {
      f1 = 0.0F;
      paramzb.a(new zi(1.0F * this.L, 0.0F, 0.0F, 1.0F * this.L, 0.0F, 0.0F));
      paramzb.a().b(this.x.j(), this.x.m(), 1);
      this.L = 1.0F;
    }
  }
  
  private void a(float paramFloat1, float paramFloat2, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    float f1 = paramFloat1 - paramFloat2;
    paramArrayOfFloat1[0] = 0.0F;
    paramArrayOfFloat2[0] = 0.0F;
    if (f1 <= 0.0F) {
      return;
    }
    int i1 = this.F.h().getColumn();
    int i2 = this.F.h().getRow();
    int i3 = i1 - 1;
    zt localzt = this.F.h().b.c;
    zgs localzgs1 = new zgs();
    zaiv localzaiv;
    int i4;
    int i5;
    zgs localzgs2;
    float f2;
    if (i3 >= 0)
    {
      localzaiv = localzt.a(-1, this.F.h().a, true);
      localzaiv.a();
      i4 = localzaiv.a();
      i5 = -1;
      if (i4 > -1) {
        i5 = localzt.a(i4);
      }
      for (;;)
      {
        if (i3 == i5)
        {
          localzgs2 = localzt.c(i4, localzgs1);
          if (!localzgs2.c()) {
            break;
          }
          i4 = localzaiv.a();
          if (i4 > -1) {
            i5 = localzt.a(i4);
          }
        }
        f2 = (float)(zavt.c(this.A, i3) * this.G[0]);
        if (f1 < f2)
        {
          paramArrayOfFloat1[0] += f1;
        }
        else
        {
          paramArrayOfFloat1[0] += f2;
          f1 -= f2;
          i3--;
          if (i3 < 0) {
            break;
          }
        }
      }
    }
    i3 = i1 + this.F.m();
    if (i3 < 16383)
    {
      f1 = (paramFloat1 - paramFloat2) / 2.0F + 1.0F;
      localzaiv = localzt.a(this.F.h().a + this.F.m() - 1, -1, false);
      localzaiv.a();
      i5 = -1;
      i4 = localzaiv.a();
      if (i4 > -1) {
        i5 = localzt.a(i4);
      }
      for (;;)
      {
        if (i5 == i3)
        {
          localzgs2 = localzt.c(i4, localzgs1);
          if (!localzgs2.c()) {
            break;
          }
          i4 = localzaiv.a();
          if (i4 > -1) {
            i5 = localzt.a(i4);
          }
        }
        f2 = (float)(zavt.c(this.A, i3) * this.G[0]);
        if (f1 < f2)
        {
          paramArrayOfFloat2[0] += f1;
        }
        else
        {
          paramArrayOfFloat2[0] += f2;
          f1 -= f2;
          i3++;
          if (i3 >= 16383) {
            break;
          }
        }
      }
    }
  }
  
  private void c(boolean paramBoolean)
    throws Exception
  {
    boolean bool = this.F.t();
    if ((this.F.v()) || (this.F.b) || ((!bool) && (this.F.g() == 8) && ((this.F.i() == 1) || (this.F.i() == 4)) && (zgz.a(this.F.c())))) {
      zgz.a(this.F.r());
    } else if ((!paramBoolean) || (zgz.a(this.F.c()))) {
      zgz.a(this.F.r(), bool, this.F.g);
    }
    if (this.p)
    {
      localObject1 = this.F.r().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        zqb localzqb = (zqb)((Iterator)localObject1).next();
        if (localzqb.b != null) {
          localzqb.b.setColor(Color.getBlack());
        }
      }
    }
    Object localObject1 = (zbox)this.a.g.get(Integer.valueOf(this.A.g().getIndex()));
    float f1 = ((zbox)localObject1).a();
    this.Q = zha.a(this.F, this.m, this.n, f1, this.G, this.v, this.F.v());
    this.D = new zb();
    this.Q.a(this.D);
    k();
    zb localzb = new zb();
    b(this.D);
    if ((this.t != 0.0F) && (this.t != 255.0F)) {
      if ((this.t == 90.0F) || (this.t == -90.0F)) {
        a(localzb);
      } else {
        c(localzb);
      }
    }
    localzb.a(this.D);
    float f2 = 0.0F;
    float f3 = 0.0F;
    Object localObject3;
    if ((this.s == 1) && (!this.F.n()))
    {
      localObject2 = new float[] { f2 };
      localObject3 = new float[] { f3 };
      a(this.x.h(), this.j, (float[])localObject2, (float[])localObject3);
      f2 = localObject2[0];
      f3 = localObject3[0];
    }
    zq localzq = new zq(this.k - f2 + 0.25F, this.l + 0.25F, this.j + f2 + f3 - 0.5F, this.i - 0.5F);
    Object localObject2 = new zb();
    if (this.O) {
      ((zb)localObject2).a(new zdr(1, this.A.g().getIndex(), this.F.j()));
    }
    ((zb)localObject2).a(localzb);
    if (a())
    {
      if ((this.M & 0x2) == 2)
      {
        if ((this.t == 0.0F) || (this.t == 90.0F) || (this.t == -90.0F)) {
          ((zb)localObject2).a(new com.aspose.cells.a.d.zat(new zq(localzq.f() + this.b.d(), localzq.g() + this.b.e(), localzq.h(), localzq.i()), this.A.g().getDisplayRightToLeft(), 2, this.b));
        }
      }
      else {
        ((zb)localObject2).a(null);
      }
    }
    else if ((this.t == 0.0F) || (this.t == 90.0F) || (this.t == -90.0F)) {
      ((zb)localObject2).a(new com.aspose.cells.a.d.zat(new zq(localzq.f() + this.b.d(), localzq.g() + this.b.e(), localzq.h(), localzq.i()), this.A.g().getDisplayRightToLeft(), this.b));
    }
    if (this.B)
    {
      localObject3 = new zk(this.x, zw.a(this.C, "\\", "/"));
      ((zb)localObject2).a((zk)localObject3);
      this.B = false;
    }
    if ((this.t == 0.0F) || (this.t == 90.0F) || (this.t == -90.0F))
    {
      ((zb)localObject2).a(new zp(localzq));
      this.H.a((zn)localObject2);
    }
    else
    {
      this.H.a((zn)localObject2);
    }
  }
  
  void g()
  {
    this.E = new zb();
    if (this.R == null) {
      this.R = new zgl();
    }
  }
  
  public void a(zn paramzn)
  {
    this.E.a(paramzn);
  }
  
  public void h()
  {
    c(null);
  }
  
  public void c(zp paramzp)
  {
    for (int i1 = 0; i1 < this.R.a(); i1++)
    {
      zb localzb2 = new zb();
      zl localzl = (zl)this.R.c(i1);
      localzb2.a(localzl);
      localzb2.a(localzl.a);
      this.E.a(localzb2);
    }
    zb localzb1 = new zb();
    localzb1.a(paramzp);
    localzb1.a(this.E);
    this.c.a(localzb1);
    this.R = new zgl();
  }
  
  void i()
    throws Exception
  {
    if ((this.F.c != null) && (this.F.c.size() > 0))
    {
      zq localzq = new zq(this.k, this.l, this.j, this.i);
      for (String str : S)
      {
        zahw localzahw = (zahw)this.F.c.get(str);
        if (localzahw != null)
        {
          zb localzb = localzahw.a(localzq, this.G, this.s, this.r);
          if (localzb != null)
          {
            this.I.a(localzb);
            if ((!localzahw.c()) && (this.F.r() != null)) {
              this.F.r().clear();
            }
          }
        }
      }
    }
  }
  
  private void a(boolean paramBoolean, int paramInt1, zn paramzn, int paramInt2, Color paramColor)
  {
    if (paramBoolean)
    {
      this.N.put(Integer.valueOf(paramInt1), new zdm(P, 0, Color.getEmpty()));
      return;
    }
    zdm localzdm1 = new zdm(paramzn, paramInt2, paramColor);
    if (this.N.containsKey(Integer.valueOf(paramInt1)))
    {
      zdm localzdm2 = (zdm)this.N.get(Integer.valueOf(paramInt1));
      if (a(localzdm2, localzdm1)) {
        this.N.put(Integer.valueOf(paramInt1), localzdm1);
      }
    }
    else
    {
      this.N.put(Integer.valueOf(paramInt1), localzdm1);
    }
  }
  
  private boolean a(zdm paramzdm1, zdm paramzdm2)
  {
    if ((paramzdm1.a() == 0) && (paramzdm1.c() == P)) {
      return false;
    }
    return paramzdm2.a(paramzdm1);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zavs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */