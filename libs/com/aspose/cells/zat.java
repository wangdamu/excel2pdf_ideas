package com.aspose.cells;

import com.aspose.cells.a.d.zav;
import com.aspose.cells.a.d.zb;
import com.aspose.cells.a.d.zbh;
import com.aspose.cells.a.d.zbj;
import com.aspose.cells.a.d.zcb;
import com.aspose.cells.a.d.zcc;
import com.aspose.cells.a.d.zd;
import com.aspose.cells.a.d.zdr;
import com.aspose.cells.a.d.zff;
import com.aspose.cells.a.d.zg;
import com.aspose.cells.a.d.zhb;
import com.aspose.cells.a.d.zk;
import com.aspose.cells.b.a.b.za;
import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zu;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.g.a.ze;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class zat
  extends zd
{
  private static ze B = new ze("[\\u001C-\\u001F\\u009F]");
  static Object a = new Object();
  Worksheet b;
  Workbook c;
  zaus d;
  int e;
  int f;
  private zavs C;
  private float D;
  private float E;
  double g;
  double h;
  double i;
  double j;
  private Style F;
  private double[] G = new double[2];
  private zagr H;
  private ArrayList I;
  public int k = -1;
  public int l;
  public int m = -1;
  public int n;
  private WorksheetCollection J;
  private ArrayList K = new ArrayList();
  private HashMap L;
  private float M;
  private int N;
  private Cells O;
  HashMap o;
  HashMap p;
  HashMap q;
  HashMap r;
  HashMap s;
  private int P;
  int t;
  int u;
  int v;
  int w;
  private int Q;
  private int R;
  double[] x = new double[2];
  private ArrayList S;
  private zgr T;
  ImageOrPrintOptions y = null;
  com.aspose.cells.a.d.zf z = null;
  private zzu U;
  private zia V;
  private zid W;
  private zaca X;
  private int Y = Integer.MAX_VALUE;
  private zbyr Z;
  private HashMap aa;
  private zgt ab = new zgt();
  private zbox ac;
  private zq ad;
  private float ae = -1.0F;
  private int af = -1;
  boolean A = false;
  
  static zat a(double paramDouble1, double paramDouble2)
  {
    zat localzat = new zat();
    localzat.A = true;
    localzat.g = paramDouble1;
    localzat.h = paramDouble2;
    localzat.x[0] = (paramDouble1 * 72.0D);
    localzat.x[1] = (paramDouble2 * 72.0D);
    return localzat;
  }
  
  private zat() {}
  
  zat(Worksheet paramWorksheet, zaus paramzaus, int paramInt1, int paramInt2, ArrayList paramArrayList, ImageOrPrintOptions paramImageOrPrintOptions, zbyr paramzbyr, int paramInt3, zaca paramzaca, zzu paramzzu)
  {
    this.Y = paramInt3;
    this.b = paramWorksheet;
    this.P = paramWorksheet.getIndex();
    this.ac = ((zbox)paramzbyr.g.get(Integer.valueOf(this.P)));
    this.aa = paramzbyr.e[this.P];
    this.d = paramzaus;
    this.T = this.d.c;
    this.e = paramInt1;
    this.f = paramInt2;
    this.c = paramWorksheet.d();
    this.J = this.c.getWorksheets();
    this.O = this.b.getCells();
    this.X = paramzaca;
    this.U = paramzzu;
    this.V = ((zia)paramzzu.a());
    this.G = new double[] { 1.0D, 1.0D };
    this.M = zbxp.a();
    this.F = this.c.getWorksheets().Q();
    Font localFont = this.F.getFont();
    this.W = new zid(localFont.getName(), localFont.getSize(), localFont.p(), true);
    this.L = new HashMap();
    this.Q = this.d.d;
    this.R = this.d.e;
    this.v = this.d.f;
    this.w = this.d.g;
    this.N = (-(zlp.a + this.c.getWorksheets().U() + 2));
    this.C = new zavs(paramzbyr);
    this.C.O = paramImageOrPrintOptions.l;
    if (paramzaus.r == null) {
      this.C.b = new com.aspose.cells.b.a.b.zo(paramzaus.m.f(), paramzaus.m.g());
    } else {
      this.C.b = new com.aspose.cells.b.a.b.zo(0.0F, 0.0F);
    }
    this.Z = paramzbyr;
    this.S = paramArrayList;
    this.K = this.ac.j;
    this.y = paramImageOrPrintOptions;
    this.g = this.d.h;
    this.h = this.d.i;
    this.x[0] = (this.g * 72.0D);
    this.x[1] = (this.h * 72.0D);
    this.i = paramzaus.j;
    this.j = paramzaus.k;
    this.I = this.d.l;
  }
  
  private void a(com.aspose.cells.a.d.zo paramzo, Workbook paramWorkbook)
    throws Exception
  {
    String str = paramWorkbook.m();
    if (str == null) {
      return;
    }
    zb localzb = new zb();
    if (this.y.l) {
      localzb.a(new zdr(3, this.P));
    }
    com.aspose.cells.a.d.zh localzh = new com.aspose.cells.a.d.zh(zbj.a("Arial", 10.0F, 0), Color.getRed(), new com.aspose.cells.b.a.b.zo(10.0F, 10.0F), str);
    localzb.a(localzh);
    paramzo.a(localzb);
  }
  
  private void a(int paramInt, zb paramzb, zq paramzq)
  {
    com.aspose.cells.a.d.zat localzat = (com.aspose.cells.a.d.zat)this.z.b.get(Integer.valueOf(paramInt));
    ArrayList localArrayList = (ArrayList)this.z.a.get(Integer.valueOf(paramInt));
    if ((localzat == null) || (localArrayList == null) || (localArrayList.size() == 0)) {
      return;
    }
    for (int i1 = 0; i1 < localArrayList.size(); i1++) {
      if (localArrayList.get(i1) != null)
      {
        zb localzb1 = (zb)localArrayList.get(i1);
        Object localObject;
        if (localzb1.e().c(localzat))
        {
          localObject = new zb();
          ((zb)localObject).a(c(paramzq));
          zb localzb2 = new zb();
          localzb2.a(new com.aspose.cells.b.a.b.a.zi(1.0F, 0.0F, 0.0F, 1.0F, localzb1.e().d.d() - this.d.m.f(), localzb1.e().d.e() - this.d.m.g()));
          localzb2.a(localzb1);
          ((zb)localObject).a(localzb2);
          paramzb.a((com.aspose.cells.a.d.zn)localObject);
        }
        if (localzat.b) {
          localObject = new com.aspose.cells.a.d.zat(localzat.a.j(), 0.0F, Math.abs(localzat.a.j()), localzat.a.m(), localzat.b, new com.aspose.cells.b.a.b.zo());
        } else {
          localObject = new com.aspose.cells.a.d.zat(0.0F, 0.0F, localzat.a.l(), localzat.a.m(), localzat.b, new com.aspose.cells.b.a.b.zo());
        }
        if (localzb1.e().a((com.aspose.cells.a.d.zat)localObject)) {
          localArrayList.remove(i1--);
        }
      }
    }
  }
  
  private zb a(float paramFloat1, float paramFloat2, float[] paramArrayOfFloat)
    throws Exception
  {
    for (int i1 = this.d.c.b; i1 <= this.d.c.d; i1++) {
      com.aspose.cells.b.a.a.zf.a(this.z.c, Integer.valueOf(i1));
    }
    for (i1 = this.d.c.a; i1 <= this.d.c.c; i1++) {
      com.aspose.cells.b.a.a.zf.a(this.z.d, Integer.valueOf(i1));
    }
    zb localzb = new zb();
    zt localzt = zavt.a(this.d.c.c, this.c.getWorksheets().T(), this.G);
    float f3 = localzt.b();
    float f4 = localzt.c();
    paramArrayOfFloat[0] = f3;
    paramArrayOfFloat[1] = f4;
    com.aspose.cells.a.d.zp localzp = com.aspose.cells.a.d.zp.b(new zq(0.0F, 0.0F, f3, f4));
    localzp.a(new com.aspose.cells.a.d.zx(Color.getBlack(), 1.0F));
    localzb.a(localzp);
    float f1 = f3;
    zbj localzbj = zbj.a(this.c.getWorksheets().T().getName(), (float)Math.max(this.c.getWorksheets().T().getDoubleSize() * this.G[1], 2.0D), this.c.getWorksheets().T().p());
    int i3;
    String str;
    float f5;
    for (int i2 = 0; i2 < this.z.c.size(); i2++)
    {
      i3 = ((Integer)this.z.c.get(i2)).intValue();
      str = CellsHelper.columnIndexToName(i3);
      f3 = (float)(f(i3) * this.G[0]);
      if (f3 > 0.001F)
      {
        localzp = com.aspose.cells.a.d.zp.b(new zq(f1, 0.0F, f3, f4));
        localzp.a(new com.aspose.cells.a.d.zx(Color.getBlack(), 1.0F));
        localzb.a(localzp);
        f5 = zavt.a(str, this.c.getWorksheets().T(), this.G[1], 0);
        com.aspose.cells.a.d.zh localzh1 = new com.aspose.cells.a.d.zh(localzbj, Color.getBlack(), new com.aspose.cells.b.a.b.zo(f1 + (f3 - f5) / 2.0F, (float)(f4 - localzbj.i() * this.G[1])), str);
        localzb.a(localzh1);
        f1 += f3;
      }
    }
    f3 = localzt.b();
    float f2 = f4;
    for (i2 = 0; i2 < this.z.d.size(); i2++)
    {
      i3 = ((Integer)this.z.d.get(i2)).intValue();
      str = com.aspose.cells.b.a.zp.a(i3 + 1);
      f5 = (float)(d(i3) * this.G[1]);
      if (f5 > 0.001F)
      {
        localzp = com.aspose.cells.a.d.zp.b(new zq(0.0F, f2, f3, f5));
        localzp.a(new com.aspose.cells.a.d.zx(Color.getBlack(), 1.0F));
        localzb.a(localzp);
        float f6 = zavt.a(str, this.c.getWorksheets().T(), this.G[1], 0);
        com.aspose.cells.a.d.zh localzh2 = new com.aspose.cells.a.d.zh(localzbj, Color.getBlack(), new com.aspose.cells.b.a.b.zo((f3 - f6) / 2.0F, (float)(f2 + f5 - localzbj.i() * this.G[1])), str);
        localzb.a(localzh2);
        f2 += f5;
      }
    }
    localzb.a(new com.aspose.cells.b.a.b.a.zi(1.0F, 0.0F, 0.0F, 1.0F, paramFloat1, paramFloat2));
    return localzb;
  }
  
  public void a(com.aspose.cells.a.d.zf paramzf)
    throws Exception
  {
    this.z = paramzf;
    if (this.A)
    {
      localzo = new com.aspose.cells.a.d.zo((float)this.x[0], (float)this.x[1]);
      localzo.b(this.Y);
      localzo.a(paramzf);
      return;
    }
    if (this.d.r != null)
    {
      f();
      return;
    }
    com.aspose.cells.a.d.zo localzo = new com.aspose.cells.a.d.zo((float)this.x[0], (float)this.x[1]);
    localzo.b(this.Y);
    paramzf.c.clear();
    paramzf.d.clear();
    this.m = this.ac.h;
    this.n = this.ac.i;
    for (int i1 = this.m; i1 <= this.n; i1++) {
      if (i1 >= 0)
      {
        if (g(i1) != 0) {
          break;
        }
        this.m = (i1 + 1);
      }
    }
    this.k = this.ac.f;
    this.l = this.ac.g;
    for (i1 = this.k; i1 <= this.l; i1++) {
      if (i1 >= 0)
      {
        if (e(i1) != 0) {
          break;
        }
        this.k = (i1 + 1);
      }
    }
    this.ad = new zq();
    zq localzq = new zq();
    this.G = this.ac.c;
    if (!this.y.getOnlyArea()) {
      localzo.a(d());
    }
    zq[] arrayOfzq1 = { this.ad };
    zb localzb1 = a(arrayOfzq1);
    this.ad = arrayOfzq1[0];
    this.z.b.put(Integer.valueOf(4), a(new zq(this.d.m.f(), this.d.m.g(), this.ad.h(), this.ad.i())));
    a(4, localzb1, this.ad);
    zq[] arrayOfzq2 = { localzq };
    zb localzb2 = b(arrayOfzq2);
    localzq = arrayOfzq2[0];
    this.z.b.put(Integer.valueOf(2), b(new zq(this.d.m.f(), this.d.m.g(), localzq.h(), localzq.i())));
    a(2, localzb2, localzq);
    float[] arrayOfFloat = { 0.0F, 0.0F };
    zb localzb3 = null;
    if (this.b.getPageSetup().getPrintHeadings()) {
      localzb3 = a((float)this.d.n * 72.0F / 2.54F, (float)this.d.o * 72.0F / 2.54F, arrayOfFloat);
    }
    if (localzb1.h().size() > 0)
    {
      localzb1.a(new com.aspose.cells.b.a.b.a.zi());
      if (this.b.getDisplayRightToLeft()) {
        localzb1.a().b(-this.ad.l() - (float)this.d.p * 72.0F / 2.54F + (float)this.g * 72.0F - arrayOfFloat[0], -this.ad.g() + (float)this.d.o * 72.0F / 2.54F + arrayOfFloat[1]);
      } else {
        localzb1.a().b(-this.ad.f() + (float)this.d.n * 72.0F / 2.54F + arrayOfFloat[0], -this.ad.g() + (float)this.d.o * 72.0F / 2.54F + arrayOfFloat[1]);
      }
    }
    if (localzb2.h().size() > 0)
    {
      localzb2.a(new com.aspose.cells.b.a.b.a.zi());
      if (this.b.getDisplayRightToLeft()) {
        localzb2.a().b(-localzq.l() - (float)this.d.p * 72.0F / 2.54F + (float)this.g * 72.0F - this.ad.h() - arrayOfFloat[0], -localzq.g() + (float)this.d.o * 72.0F / 2.54F + arrayOfFloat[1]);
      } else {
        localzb2.a().b(-localzq.f() + this.ad.h() + (float)this.d.n * 72.0F / 2.54F + arrayOfFloat[0], -localzq.g() + (float)this.d.o * 72.0F / 2.54F + arrayOfFloat[1]);
      }
    }
    Object localObject1 = super.h().iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (zd)((Iterator)localObject1).next();
      ((zd)localObject2).a(localzo);
      localzo.a((com.aspose.cells.a.d.zn)localObject2);
    }
    paramzf.b.put(Integer.valueOf(1), e());
    if ((this.y != null) && (this.y.getDrawObjectEventHandler() != null))
    {
      this.y.getDrawObjectEventHandler().a(this.e, this.f, this.P);
      this.y.getDrawObjectEventHandler().a((float)this.d.n * 72.0F / 2.54F + this.ad.h() + arrayOfFloat[0], (float)this.d.o * 72.0F / 2.54F + localzq.i() + arrayOfFloat[1]);
    }
    localObject1 = c();
    a(1, (zb)localObject1, new zq(0.0F, 0.0F, this.d.m.h(), this.d.m.i()));
    ((zb)localObject1).a(new com.aspose.cells.b.a.b.a.zi());
    localzo.a((com.aspose.cells.a.d.zn)localObject1);
    if (this.b.getDisplayRightToLeft()) {
      ((zb)localObject1).a().b(-this.d.m.h() - (float)this.d.p * 72.0F / 2.54F + (float)this.g * 72.0F - this.ad.h() - arrayOfFloat[0], (float)this.d.o * 72.0F / 2.54F + localzq.i() + arrayOfFloat[1]);
    } else {
      ((zb)localObject1).a().b((float)this.d.n * 72.0F / 2.54F + this.ad.h() + arrayOfFloat[0], (float)this.d.o * 72.0F / 2.54F + localzq.i() + arrayOfFloat[1]);
    }
    localzo.a(localzb1);
    localzo.a(localzb2);
    if (localzb3 != null)
    {
      if (this.y.l) {
        localzb3.a(new zdr(12, this.P));
      }
      localzb3.a(new com.aspose.cells.a.d.zp(new zq(-0.5F, -0.5F, this.ad.h() + arrayOfFloat[0] + (float)Math.ceil(Math.min(this.d.m.h(), this.d.j)) + 1.0F, localzq.i() + (float)Math.ceil(this.d.m.i() + 1.0F) + arrayOfFloat[1])));
      localObject2 = com.aspose.cells.a.d.zp.b(new zq(0.0F, 0.0F, this.ad.h() + arrayOfFloat[0] + (float)Math.ceil(Math.min(this.d.m.h(), this.d.j)), localzq.i() + (float)Math.ceil(this.d.m.i()) + arrayOfFloat[1]));
      ((com.aspose.cells.a.d.zp)localObject2).a(new com.aspose.cells.a.d.zx(Color.getBlack()));
      localzb3.a((com.aspose.cells.a.d.zn)localObject2);
      localzo.a(localzb3);
    }
    a(localzo, this.c);
    localzo.a(this.z);
    localzb3 = null;
    ((zb)localObject1).a(null);
    ((zb)localObject1).a(null);
    localObject1 = null;
    localzo = null;
    this.H = null;
    this.L = new HashMap();
    this.C = new zavs(this.Z);
    this.C.O = this.y.l;
    this.C.b = new com.aspose.cells.b.a.b.zo(this.d.m.f(), this.d.m.g());
  }
  
  private void f()
    throws Exception
  {
    com.aspose.cells.a.d.zo localzo = new com.aspose.cells.a.d.zo((float)this.x[0], (float)this.x[1]);
    localzo.b(this.Y);
    localzo.a(d());
    zb localzb = this.d.r;
    if (this.y.l) {
      localzb.a(new zdr(10, this.P));
    }
    localzb.a(new com.aspose.cells.b.a.b.a.zi());
    localzo.a(localzb);
    if (this.b.getDisplayRightToLeft()) {
      localzb.a().b(-(float)this.d.p * 72.0F / 2.54F + (float)this.g * 72.0F, (float)this.d.o * 72.0F / 2.54F);
    } else {
      localzb.a().b((float)this.d.n * 72.0F / 2.54F, (float)this.d.o * 72.0F / 2.54F);
    }
    a(localzo, this.c);
    localzo.a(this.z);
    localzb.a(null);
    localzb.a(null);
    localzb = null;
    localzo = null;
    this.H = null;
    this.L = new HashMap();
    this.C = new zavs(this.Z);
    this.C.O = this.y.l;
    this.C.b = new com.aspose.cells.b.a.b.zo(0.0F, 0.0F);
  }
  
  private void a(zgr paramzgr, float paramFloat1, float paramFloat2)
    throws Exception
  {
    this.E = paramFloat1;
    this.D = paramFloat2;
    this.C.c = new zb();
    a(paramzgr);
  }
  
  private void a(zgr paramzgr)
    throws Exception
  {
    int i1 = paramzgr.a;
    int i2 = paramzgr.c;
    int i3 = paramzgr.b;
    int i4 = paramzgr.d;
    int i5 = i1;
    this.C.e = i1;
    this.C.f = i3;
    this.C.g = i2;
    this.C.h = i4;
    this.C.A = this.b.getCells();
    this.C.d();
    this.C.c();
    this.C.e();
    this.C.g();
    this.C.M = 1;
    this.C.l = this.D;
    this.C.k = this.E;
    this.C.G = this.G;
    zq localzq = new zq(0.0F, 0.0F, this.d.m.h(), this.d.m.i());
    if (this.O.h().getPrintGridlines()) {
      this.C.a(this.E, this.D, this.d.m, c(localzq), this.y.getGridlineType());
    }
    for (i5 = i1; i5 <= i2; i5++)
    {
      this.ae = ((float)d(i5));
      this.af = e(i5);
      float f1 = (float)this.G[1] * this.ae;
      a(i5, i1, i3, i2, i4);
      this.C.l += f1;
    }
    paramzgr = a(paramzgr, false);
    this.C.a(c(localzq));
    this.C.a(this.y.m, d(localzq));
    this.C.b(c(localzq));
    this.C.c(c(localzq));
    this.C.M = 0;
  }
  
  private zgr a(zgr paramzgr, boolean paramBoolean)
    throws Exception
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    Object localObject1;
    Object localObject2;
    if (this.K != null)
    {
      Iterator localIterator = this.K.iterator();
      while (localIterator.hasNext())
      {
        localObject1 = (zbje)localIterator.next();
        if ((((zbje)localObject1).l().getMsoDrawingType() != 25) || (this.b.getPageSetup().getPrintComments() == 0)) {
          if (zavt.a((zbje)localObject1, paramzgr, this.P))
          {
            this.C.q = null;
            if (((zbje)localObject1).l().isPrintable())
            {
              d1 = this.E;
              d2 = this.D;
              d2 += b(paramzgr.a, ((zbje)localObject1).c() - 1) * this.G[1];
              if (((zbje)localObject1).c() < paramzgr.a) {
                d2 -= b(((zbje)localObject1).c(), paramzgr.a - 1) * this.G[1];
              }
              this.C.l = ((float)d2);
              d1 += c(paramzgr.b, ((zbje)localObject1).f() - 1) * this.G[0];
              if (((zbje)localObject1).f() < paramzgr.b) {
                d1 -= c(((zbje)localObject1).f(), paramzgr.b - 1) * this.G[0];
              }
              this.C.k = ((float)d1);
              if (paramBoolean)
              {
                a((zbje)localObject1, paramBoolean);
              }
              else if (!((zbje)localObject1).b)
              {
                localObject2 = new com.aspose.cells.b.a.b.zp(((zbje)localObject1).f(), ((zbje)localObject1).c(), ((zbje)localObject1).g() - ((zbje)localObject1).f() + 1, ((zbje)localObject1).d() - ((zbje)localObject1).c() + 1);
                com.aspose.cells.b.a.b.zp localzp = new com.aspose.cells.b.a.b.zp(paramzgr.b, paramzgr.a, paramzgr.d - paramzgr.b + 1, paramzgr.c - paramzgr.a + 1);
                if (localzp.a((com.aspose.cells.b.a.b.zp)localObject2))
                {
                  a((zbje)localObject1, paramBoolean);
                  if (!this.Z.f) {
                    ((zbje)localObject1).b = true;
                  }
                }
              }
            }
          }
        }
      }
    }
    if ((this.b.getSparklineGroupCollection() != null) && (this.b.getSparklineGroupCollection().getCount() > 0)) {
      for (int i1 = 0; i1 < this.b.getSparklineGroupCollection().getCount(); i1++)
      {
        localObject1 = this.b.getSparklineGroupCollection().get(i1);
        localObject2 = ((SparklineGroup)localObject1).getSparklineCollection();
        if (((SparklineCollection)localObject2).b().getIndex() == this.b.getIndex()) {
          for (int i2 = 0; i2 < ((SparklineCollection)localObject2).getCount(); i2++)
          {
            Sparkline localSparkline = ((SparklineCollection)localObject2).get(i2);
            if ((localSparkline.getRow() >= paramzgr.a) && (localSparkline.getRow() <= paramzgr.c) && (localSparkline.getColumn() >= paramzgr.b) && (localSparkline.getColumn() <= paramzgr.d))
            {
              d1 = this.E;
              d2 = this.D;
              d2 += b(paramzgr.a, localSparkline.getRow() - 1) * this.G[1];
              d1 += c(paramzgr.b, localSparkline.getColumn() - 1) * this.G[0];
              if (localSparkline.c())
              {
                zb localzb1 = new zb();
                zb localzb2 = localSparkline.d();
                localzb1.a(localzb2);
                localzb1.a(new com.aspose.cells.b.a.b.a.zi());
                localzb1.a().b((float)d1, (float)d2);
                localzb1.a().a((float)this.G[0], (float)this.G[1]);
                this.C.a(localzb1);
              }
            }
          }
        }
      }
    }
    return paramzgr;
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
    throws Exception
  {
    a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, 0);
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
    throws Exception
  {
    this.C.d = this;
    if (this.ae == -1.0F) {
      this.ae = ((float)d(paramInt1));
    }
    if (this.af == -1) {
      this.af = e(paramInt1);
    }
    ArrayList localArrayList = b(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      zgw localzgw = (zgw)localIterator.next();
      float f1 = this.E;
      float f2 = 0.0F;
      int i1 = localzgw.k();
      if (localzgw.f < 0)
      {
        i1 = localzgw.k() - (localzgw.m() - 1);
        if (i1 < 0) {
          i1 = 0;
        }
      }
      f2 += (float)c(paramInt3, i1 - 1) * (float)this.G[0];
      this.C.j = 0.0F;
      this.C.m = 0.0F;
      int i2;
      if (localzgw.f > 0)
      {
        i2 = Math.min(localzgw.k() + localzgw.m() - 1, 16383);
        this.C.j += (float)c(i1, i2) * (float)this.G[0];
        this.C.m += d(i1, i2) * (float)this.G[0];
      }
      else
      {
        i2 = Math.min(localzgw.k(), 16383);
        this.C.j += (float)c(i1, i2) * (float)this.G[0];
        this.C.m += d(i1, i2) * (float)this.G[0];
      }
      if ((this.C.j > this.d.j) && (localzgw.m() == 1))
      {
        this.C.j = ((float)this.d.j);
        this.C.m = ((float)(this.d.j * this.M / 72.0D));
      }
      f1 += f2;
      if (this.b.getDisplayRightToLeft())
      {
        if ((this.C.M & 0x4) == 4) {
          this.C.k = (this.ad.l() - (f1 - this.ad.j()) - this.C.j + 1.0F);
        } else {
          this.C.k = (this.d.m.h() - f1 - this.C.j + 1.0F);
        }
      }
      else {
        this.C.k = f1;
      }
      if (a(localzgw)) {
        a(localzgw, paramInt6);
      }
    }
    localArrayList = null;
    this.ae = -1.0F;
    this.af = -1;
  }
  
  private boolean a(zgw paramzgw)
  {
    if (paramzgw == null) {
      return false;
    }
    if (paramzgw.f()) {
      return false;
    }
    double d1 = 0.0D;
    int i1 = 0;
    int i2 = paramzgw.k();
    while (i1 < paramzgw.m())
    {
      d1 += g(i2);
      i1++;
      i2 += paramzgw.f;
    }
    return d1 > 0.0D;
  }
  
  public static void a(ArrayList paramArrayList, Workbook paramWorkbook)
    throws Exception
  {
    int i1 = 0;
    Font localFont1 = paramWorkbook.getDefaultStyle().q();
    zis localzis = new zis(localFont1.getName(), null);
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      zqb localzqb = (zqb)localIterator.next();
      if (localzqb.b == null) {
        localzqb.b = new Font(paramWorkbook.getWorksheets(), null, false);
      }
      if (!zav.a().a(localzqb.b.getName(), localzqb.b.p(), localzqb.a))
      {
        Font localFont2 = new Font(paramWorkbook.getWorksheets(), null, false);
        localFont2.a(localzqb.b, null);
        String str = localzis.a(localzqb.b.getName(), localzqb.b.p(), false, localzqb.a);
        if (str != null)
        {
          localFont2.setName(str);
          localzqb.b = localFont2;
        }
        else
        {
          i1 = 1;
          break;
        }
      }
    }
    if (i1 != 0) {
      zavt.a(paramArrayList, paramWorkbook, false, localzis);
    }
  }
  
  private void b(zgw paramzgw)
    throws Exception
  {
    int i1 = 0;
    boolean bool = false;
    if ((this.z instanceof zbh)) {
      bool = true;
    }
    Font localFont = this.c.getDefaultStyle().q();
    if (this.y.d())
    {
      Iterator localIterator = paramzgw.r().iterator();
      while (localIterator.hasNext())
      {
        zqb localzqb = (zqb)localIterator.next();
        if (localzqb.b == null) {
          localzqb.b = new Font(this.c.getWorksheets(), null, false);
        }
        if (!zav.a().a(localzqb.b.getName(), localzqb.b.p(), localzqb.a, bool))
        {
          if (this.y.getWarningCallback() != null)
          {
            localObject1 = a(paramzgw, localzqb.b);
            this.y.getWarningCallback().warning(new WarningInfo(0, (String)localObject1));
          }
          if (this.y.c())
          {
            i1 = 1;
            break;
          }
          if ((paramzgw.t()) && (!localzqb.b.getName().equals("Arial")) && (zav.a().a("Arial", localzqb.b.p(), localzqb.a, bool)))
          {
            localObject1 = paramzgw.r().iterator();
            while (((Iterator)localObject1).hasNext())
            {
              localObject2 = (zqb)((Iterator)localObject1).next();
              ((zqb)localObject2).b.setName("Arial");
            }
            b(paramzgw);
            return;
          }
          Object localObject1 = new Font(this.c.getWorksheets(), null, false);
          ((Font)localObject1).a(localzqb.b, null);
          Object localObject2 = this.z.b().a(localzqb.b.getName(), localzqb.b.p(), bool, localzqb.a);
          if (localObject2 != null)
          {
            ((Font)localObject1).setName((String)localObject2);
            localzqb.b = ((Font)localObject1);
          }
          else if (paramzgw.t())
          {
            com.aspose.cells.a.d.zgs localzgs = zav.a().a(localzqb.b.p(), localzqb.a);
            if (localzgs != null)
            {
              ((Font)localObject1).setName(localzgs.a());
              localzqb.b = ((Font)localObject1);
            }
            else
            {
              i1 = 1;
              break;
            }
          }
          else
          {
            i1 = 1;
            break;
          }
        }
      }
    }
    if (i1 != 0) {
      zavt.a(paramzgw.r(), this.c, bool, this.z.b());
    }
  }
  
  private zgw a(Row paramRow, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
    throws Exception
  {
    zgw localzgw = new zgw(paramInt1, paramInt2);
    localzgw.a = this.b.getDisplayRightToLeft();
    Cell localCell1;
    if (paramRow == null) {
      localCell1 = null;
    } else {
      localCell1 = paramRow.getCellOrNull(paramInt2);
    }
    int i1;
    int i8;
    if ((localCell1 != null) && (localCell1.H()))
    {
      localzgw.a(2);
      if ((this.z instanceof zbh))
      {
        i1 = 1;
        FontSetting[] arrayOfFontSetting = localCell1.getCharacters();
        if ((arrayOfFontSetting != null) && (arrayOfFontSetting.length > 1))
        {
          Font localFont1 = arrayOfFontSetting[0].getFont();
          for (i8 = 1; i8 < arrayOfFontSetting.length; i8++)
          {
            Font localFont2 = arrayOfFontSetting[i8].getFont();
            if (!localFont2.c(localFont1))
            {
              i1 = 0;
              break;
            }
          }
        }
        if (i1 != 0) {
          localzgw.a(3);
        }
      }
    }
    localzgw.a(localCell1);
    if ((this.o != null) && (a(localCell1)))
    {
      i1 = b(this.S, localzgw);
      float f1 = (float)(this.d.n / 2.5399999618530273D * 72.0D);
      float f2 = (float)(this.d.o / 2.5399999618530273D * 72.0D);
      this.q.put(localzgw.h(), "" + i1 + "_" + (f1 + this.C.k) + "_" + (float)(this.x[1] - (this.C.l + f2)));
    }
    Object localObject1;
    int i7;
    if (this.I != null)
    {
      Iterator localIterator = this.I.iterator();
      while (localIterator.hasNext())
      {
        localObject1 = (zgr)localIterator.next();
        if ((paramInt1 >= ((zgr)localObject1).a) && (paramInt1 <= ((zgr)localObject1).c) && (paramInt2 >= ((zgr)localObject1).b) && (paramInt2 <= ((zgr)localObject1).d))
        {
          localzgw.a((zgr)localObject1);
          localzgw.l |= 0x1;
          if (((paramInt1 == ((zgr)localObject1).a) || (paramInt1 == paramInt4)) && ((paramInt2 == ((zgr)localObject1).b) || (paramInt2 == paramInt5)))
          {
            if ((paramInt1 != ((zgr)localObject1).a) || (paramInt2 != ((zgr)localObject1).b)) {
              localzgw.l |= 0x2;
            }
            localzgw.e(0);
            i7 = ((zgr)localObject1).d;
            if (((zgr)localObject1).d >= zavt.b(this.c)) {
              i7 = this.d.g;
            }
            for (i8 = paramInt2; i8 <= i7; i8++) {
              localzgw.e(localzgw.m() + 1);
            }
            localzgw.d(0);
            i8 = ((zgr)localObject1).c;
            if (((zgr)localObject1).c >= zavt.a(this.c)) {
              i8 = this.d.e;
            }
            for (int i9 = paramInt1; i9 <= i8; i9++) {
              localzgw.d(localzgw.l() + 1);
            }
            break;
          }
          localzgw.l |= 0x4;
          return localzgw;
        }
      }
    }
    for (int i2 = this.b.getHyperlinks().getCount() - 1; i2 >= 0; i2--)
    {
      localObject1 = this.b.getHyperlinks().get(i2).getArea();
      if ((paramInt1 >= ((CellArea)localObject1).StartRow) && (paramInt1 <= ((CellArea)localObject1).EndRow) && (paramInt2 >= ((CellArea)localObject1).StartColumn) && (paramInt2 <= ((CellArea)localObject1).EndColumn))
      {
        localzgw.a(this.b.getHyperlinks().get(i2));
        break;
      }
    }
    if (localzgw.n())
    {
      i7 = localzgw.o().a;
      i8 = localzgw.o().b;
      Cell localCell2;
      int i5;
      Object localObject4;
      if ((paramInt1 == i7) && (paramInt2 == i8))
      {
        localCell2 = localCell1;
        i5 = paramInt3;
      }
      else
      {
        localObject4 = this.O.getRows().a.b(i7);
        i5 = localObject4 == null ? -1 : ((Row)localObject4).e();
        if (localObject4 == null) {
          localCell2 = null;
        } else {
          localCell2 = ((Row)localObject4).getCellOrNull(i8);
        }
      }
      a(localCell2, i5, i7, i8, null);
      if ((localCell2 != null) && (paramInt1 == i7) && (paramInt2 == i8))
      {
        localzgw.c = this.ab.d;
        localzgw.c(localCell2.getType());
      }
      localzgw.a(this.ab.a);
      localzgw.j = this.ab.c;
      int i11 = localzgw.o().c;
      int i12 = localzgw.o().d;
      Row localRow = this.O.getRows().a.b(i11);
      int i13 = localRow == null ? -1 : localRow.e();
      if (localRow == null) {
        localObject4 = null;
      } else {
        localObject4 = localRow.getCellOrNull(i12);
      }
      a((Cell)localObject4, i13, i11, i12, localCell2);
      localzgw.i = this.ab.a;
    }
    else
    {
      a(localCell1, paramInt3, paramInt1, paramInt2, null);
      if (localCell1 != null)
      {
        localzgw.c = this.ab.d;
        localzgw.c(localCell1.getType());
      }
      localzgw.a(this.ab.a);
      localzgw.j = this.ab.c;
    }
    if (localzgw.q())
    {
      int i3 = localCell1.getType();
      double d1;
      switch (localzgw.c().getHorizontalAlignment())
      {
      case 7: 
        if (localzgw.c().getIndentLevel() != 0)
        {
          d1 = zavt.b(localzgw.c().getIndentLevel(), this.F.getFont(), this.ac.a());
          localzgw.a(72.0F * (float)d1 / this.M);
          localzgw.f(localzgw.s() + (int)d1);
        }
        localzgw.b(7);
        break;
      case 8: 
        if (localzgw.c().getIndentLevel() != 0)
        {
          d1 = zavt.b(localzgw.c().getIndentLevel(), this.F.getFont(), this.ac.a());
          localzgw.a(72.0F * (float)d1 / this.M);
          localzgw.f(localzgw.s() + (int)d1);
        }
        else if (i3 == 4)
        {
          localzgw.b(8);
        }
        else if (i3 == 5)
        {
          localzgw.b(8);
        }
        localzgw.b(8);
        break;
      case 1: 
        localzgw.b(1);
        break;
      case 3: 
        localzgw.b(3);
        break;
      case 2: 
        localzgw.b(1);
        localzgw.a(true);
        break;
      case 6: 
        localzgw.b(6);
        break;
      case 5: 
        switch (i3)
        {
        case 0: 
          localzgw.b(1);
          break;
        case 1: 
          localzgw.b(8);
          break;
        case 4: 
          if (localzgw.c().getNumber() == zara.b) {
            localzgw.b(7);
          } else {
            localzgw.b(8);
          }
          break;
        case 5: 
          if ((localCell1 != null) && (zax.b(localCell1.k())))
          {
            localzgw.b(8);
          }
          else
          {
            int i6 = localzgw.c().getRotationAngle();
            if ((i6 == 90) || ((i6 < 0) && (i6 > -90))) {
              localzgw.b(8);
            } else if (i6 == 255) {
              localzgw.b(1);
            } else {
              localzgw.b(7);
            }
          }
          break;
        case 2: 
        case 3: 
        default: 
          localzgw.b(1);
        }
        break;
      case 4: 
        localzgw.b(7);
        break;
      }
    }
    if (localzgw.c().d() != null)
    {
      localzgw.d = localzgw.c().getBorders().getByBorderType(32);
      localzgw.e = localzgw.c().getBorders().getByBorderType(16);
    }
    if ((localzgw.c().isTextWrapped()) && (localzgw.q())) {
      localzgw.c().setShrinkToFit(false);
    }
    Object localObject3;
    if (localzgw.h() != null) {
      if ((localzgw.h().getType() == 1) && (localzgw.h().getDoubleValue() < 0.0D))
      {
        localzgw.a(new ArrayList());
        zqb localzqb = new zqb();
        localzqb.b = localzgw.c().getFont();
        localzqb.a = zavt.a(g(localzgw.k()), '#', localzgw.c().getFont());
        com.aspose.cells.b.a.a.zf.a(localzgw.r(), localzqb);
      }
      else if (!localzgw.h().c.b())
      {
        int i4 = localzgw.a(this.O, this.F);
        this.V.b(b(i4, localzgw.c().getFont()));
        this.V.a(localzgw.h().r());
        zzz localzzz = c(localzgw);
        if ((localzgw.l & 0x3) == 3) {
          localzgw.a(new ArrayList());
        } else {
          localzgw.a(localzgw.h().a(this.U, localzgw.c()));
        }
        if ((localzgw.r().size() > 1) && (zax.b(localzgw.h().getStringValue()))) {
          Collections.reverse(localzgw.r());
        }
        if (localzgw.r().size() > 1) {
          for (i7 = localzgw.r().size() - 1; i7 >= 0; i7--)
          {
            localObject3 = (zqb)localzgw.r().get(i7);
            if (((zqb)localObject3).a.trim().length() != 0) {
              break;
            }
            localzgw.r().remove(i7);
          }
        }
        a(localzgw, localzzz);
      }
    }
    if (localzgw.r() != null)
    {
      boolean bool1 = zax.b(localzgw.r());
      boolean bool2 = zax.a(localzgw.r());
      if ((bool1) || (bool2))
      {
        localObject2 = new zcr();
        ((zcr)localObject2).a(localzgw.r(), bool1);
      }
      localzgw.b(bool1);
      localzgw.g = bool2;
      if (localzgw.r().size() > 0)
      {
        localObject2 = localzgw.r().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (zqb)((Iterator)localObject2).next();
          if (((zqb)localObject3).a != null)
          {
            ((zqb)localObject3).a = B.b(((zqb)localObject3).a, "");
            ((zqb)localObject3).a = zw.a(((zqb)localObject3).a, "\t", "    ");
          }
        }
        b(localzgw);
      }
      if ((localzgw.e() == -1) && (localzgw.r().size() == 1))
      {
        localObject2 = (zqb)localzgw.r().get(0);
        localObject3 = ((zqb)localObject2).b.getName();
        ((zqb)localObject2).b.a(localzgw.c().getFont(), null);
        ((zqb)localObject2).b.setColor(zavt.a(localzgw.c(), localzgw.c().getFont(), localCell1));
        ((zqb)localObject2).b.setName((String)localObject3);
      }
      Object localObject2 = localzgw.r().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (zqb)((Iterator)localObject2).next();
        if ((localzgw.h() != null) && (localzgw.h().getType() == 4)) {
          ((zqb)localObject3).b.setColor(localzgw.c().getFont().getColor());
        }
        int i10 = zavt.b(((zqb)localObject3).a, ((zqb)localObject3).b, this.ac.a());
        localzgw.f(localzgw.s() + i10);
      }
      if (localzgw.r().size() > 0) {
        localzgw.f(localzgw.s() + 2);
      }
    }
    return localzgw;
  }
  
  private zzz c(zgw paramzgw)
  {
    if (this.b.getShowFormulas())
    {
      localObject = new zzz();
      ((zzz)localObject).a(7, paramzgw.h().c.a(true, this.c.getSettings()));
      return (zzz)localObject;
    }
    Object localObject = paramzgw.h().c.e();
    return Cell.a((zgs)localObject, this.U, paramzgw.c(), this.O);
  }
  
  private long a(int paramInt1, int paramInt2)
  {
    if ((this.I != null) && (this.I.size() > 0)) {
      for (int i1 = this.I.size() - 1; i1 >= 0; i1--)
      {
        zgr localzgr = (zgr)this.I.get(i1);
        if ((localzgr.a <= paramInt1) && (localzgr.c >= paramInt1) && (localzgr.b <= paramInt2) && (localzgr.d >= paramInt2)) {
          for (int i2 = localzgr.b; i2 <= localzgr.d; i2++) {
            if (g(i2) > 0) {
              for (int i3 = localzgr.a; i3 <= localzgr.c; i3++) {
                if (e(i3) > 0) {
                  return (localzgr.a << 20) + localzgr.b;
                }
              }
            }
          }
        }
      }
    }
    return -1L;
  }
  
  private String a(double paramDouble, Font paramFont)
    throws Exception
  {
    String str = "";
    if (paramFont == null) {
      return str;
    }
    double d1 = zavt.b("##########", paramFont, this.ac.a()) / 10.0D;
    int i1 = (int)(paramDouble / d1);
    for (int i2 = 0; i2 < i1; i2++) {
      str = str + "#";
    }
    return str;
  }
  
  private ArrayList b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
    throws Exception
  {
    ArrayList localArrayList = new ArrayList();
    Row localRow = this.O.getRows().a.b(paramInt1);
    int i1 = localRow == null ? -1 : localRow.e();
    for (int i2 = paramInt3; i2 <= paramInt5; i2++) {
      if ((g(i2) != 0) || (a(paramInt1, i2) >= 0L))
      {
        zgw localzgw1 = a(localRow, paramInt1, i2, i1, paramInt2, paramInt3, paramInt4, paramInt5);
        if (localzgw1.f())
        {
          i2 = localzgw1.o().d;
        }
        else
        {
          com.aspose.cells.b.a.a.zf.a(localArrayList, localzgw1);
          zgw localzgw2;
          zgw localzgw3;
          float[] arrayOfFloat;
          Object localObject2;
          boolean bool;
          if ((localzgw1.g() == 7) && (i2 <= paramInt5) && (localzgw1.c().getVerticalAlignment() != 6))
          {
            if ((localzgw1.q()) && (!localzgw1.n()) && (!localzgw1.c().isTextWrapped()) && (localzgw1.i() == 5) && (!localzgw1.c().getShrinkToFit()) && (localzgw1.c().getRotationAngle() == 0)) {
              if (this.b.getDisplayRightToLeft())
              {
                a(localArrayList, localzgw1);
              }
              else
              {
                float f1 = localzgw1.s() / this.M * 72.0F;
                localzgw2 = a(localRow, paramInt1, i2 + 1, i1, paramInt2, paramInt3, paramInt4, paramInt5);
                localzgw3 = localzgw1;
                for (;;)
                {
                  arrayOfFloat = new float[] { f1 };
                  localObject2 = new int[] { i2 };
                  bool = a(localzgw1, localzgw3, localzgw2, arrayOfFloat, (int[])localObject2, localArrayList);
                  f1 = arrayOfFloat[0];
                  i2 = localObject2[0];
                  if ((bool) || (i2 >= this.w)) {
                    break;
                  }
                  localzgw2 = a(localRow, paramInt1, i2 + 1, i1, paramInt2, paramInt3, paramInt4, paramInt5);
                }
              }
            }
          }
          else if (localzgw1.g() == 1)
          {
            if (localzgw1.b())
            {
              Object localObject1 = localzgw1;
              while (i2 <= paramInt5)
              {
                i2++;
                localzgw2 = a(localRow, paramInt1, i2, i1, paramInt2, paramInt3, paramInt4, paramInt5);
                if ((!localzgw2.q()) && (localzgw2.c() != null) && (localzgw2.c().getHorizontalAlignment() == 2))
                {
                  localzgw1.e(localzgw1.m() + 1);
                  localObject1 = localzgw2;
                  com.aspose.cells.b.a.a.zf.a(localArrayList, localzgw2);
                }
                else
                {
                  i2--;
                }
              }
            }
          }
          else if ((localzgw1.g() == 8) && (localzgw1.q()) && (!localzgw1.n()) && (!localzgw1.c().isTextWrapped()) && (localzgw1.i() == 5) && (!localzgw1.c().getShrinkToFit())) {
            if (this.b.getDisplayRightToLeft())
            {
              float f2 = localzgw1.s() / this.M * 72.0F;
              localzgw2 = a(localRow, paramInt1, i2 + 1, i1, paramInt2, paramInt3, paramInt4, paramInt5);
              localzgw3 = localzgw1;
              for (;;)
              {
                arrayOfFloat = new float[] { f2 };
                localObject2 = new int[] { i2 };
                bool = a(localzgw1, localzgw3, localzgw2, arrayOfFloat, (int[])localObject2, localArrayList);
                f2 = arrayOfFloat[0];
                i2 = localObject2[0];
                if ((bool) || (i2 >= this.w)) {
                  break;
                }
                localzgw2 = a(localRow, paramInt1, i2 + 1, i1, paramInt2, paramInt3, paramInt4, paramInt5);
              }
            }
            else
            {
              a(localArrayList, localzgw1);
            }
          }
          if ((localzgw1.r() != null) && (localzgw1.r().size() != 0))
          {
            zqb localzqb = (zqb)localzgw1.r().get(0);
            if (localzgw1.h() != null)
            {
              int i3 = localzgw1.a(this.O, this.F);
              double d1 = b(i3, localzqb.b);
              this.V.b(d1);
              this.V.a(localzgw1.h().r());
              localObject2 = c(localzgw1);
              if (localObject2 != null) {
                switch (localzgw1.i())
                {
                case 0: 
                case 1: 
                case 2: 
                case 4: 
                  if (((zzz)localObject2).e())
                  {
                    localzqb.a = a(d1, localzqb.b);
                  }
                  else if (!localzgw1.c().getShrinkToFit())
                  {
                    int i4 = zavt.b(localzqb.a, localzqb.b, this.ac.a());
                    if (i4 > d1) {
                      localzqb.a = a(d1, localzqb.b);
                    }
                  }
                  break;
                }
              }
            }
          }
        }
      }
    }
    return localArrayList;
  }
  
  private float a(String paramString, float paramFloat, int paramInt)
    throws Exception
  {
    com.aspose.cells.a.d.zgs localzgs = zav.a().b(paramString, paramInt, false);
    float f1 = 0.0F;
    for (int i1 = 48; i1 < 58; i1++) {
      f1 += localzgs.a(i1, paramFloat);
    }
    return f1 / 10.0F / 4.0F;
  }
  
  private double b(double paramDouble, Font paramFont)
    throws Exception
  {
    float f1 = Math.max(0.1F, zgz.b(paramFont.getDoubleSize(), this.ac.a()));
    if ((paramFont.isSubscript()) || (paramFont.isSuperscript())) {
      f1 *= zgz.b;
    }
    float f2 = 2.0F * a(paramFont.getName(), f1, paramFont.p()) + 1.0F;
    double d1 = paramDouble * this.G[0] - f2;
    return d1;
  }
  
  void a(zgw paramzgw, zzz paramzzz)
  {
    if ((paramzzz == null) || (paramzzz.e()) || (paramzzz.j() == 0)) {
      return;
    }
    int i1 = 0;
    ArrayList localArrayList = paramzgw.r();
    String str1 = paramzzz.h();
    zqb localzqb = (zqb)localArrayList.get(0);
    Font localFont = localzqb.b;
    localArrayList.clear();
    for (int i2 = paramzzz.j() - 1; i2 >= 0; i2--)
    {
      String str2 = null;
      if ((!paramzgw.b) && (paramzzz.a(i2)))
      {
        i1 = paramzzz.b(i2);
        str2 = str1.substring(i1);
        if ((str2 != null) && (str2.length() > 0))
        {
          localzqb = new zqb();
          localzqb.a = str2;
          localzqb.b = localFont;
          localArrayList.add(0, localzqb);
          str1 = str1.substring(0, 0 + i1);
        }
        localzqb = new zqb();
        localzqb.a = "";
        localzqb.b = localFont;
        localzqb.d = 1;
        localArrayList.add(0, localzqb);
        paramzgw.b = true;
      }
      else
      {
        i1 = paramzzz.b(i2);
        str2 = str1.substring(i1);
        if ((str2 != null) && (str2.length() > 0))
        {
          localzqb = new zqb();
          localzqb.a = str2;
          localzqb.b = localFont;
          localArrayList.add(0, localzqb);
        }
        str1 = str1.substring(0, 0 + i1);
        localzqb = new zqb();
        localzqb.a = ("" + paramzzz.c(i2));
        localzqb.d = 4;
        localzqb.b = localFont;
        localArrayList.add(0, localzqb);
      }
    }
    if (i1 > 0)
    {
      localzqb = new zqb();
      localzqb.a = str1.substring(0, 0 + i1);
      localzqb.b = localFont;
      localArrayList.add(0, localzqb);
    }
  }
  
  boolean a(zgw paramzgw1, zgw paramzgw2, zgw paramzgw3, float[] paramArrayOfFloat, int[] paramArrayOfInt, ArrayList paramArrayList)
  {
    if ((g(paramzgw3.k()) != 0) && ((paramzgw3.q()) || (paramzgw3.n()) || ((paramzgw3.i() != 3) && (paramzgw3.r() != null)))) {
      return true;
    }
    if (paramArrayOfFloat[0] >= f(paramzgw2.k()) * this.G[0])
    {
      paramzgw1.e(paramzgw1.m() + 1);
      paramArrayOfInt[0] += 1;
      paramArrayOfFloat[0] -= (float)(f(paramzgw3.k()) * this.G[0]);
      if ((paramzgw3.d()) || ((paramzgw3.c() != null) && (!paramzgw3.c().getBackgroundColor().isEmpty())))
      {
        com.aspose.cells.b.a.a.zf.a(paramArrayList, paramzgw3);
      }
      else if ((paramzgw2.c() != null) && (!paramzgw2.c().getBackgroundColor().isEmpty()) && ((paramzgw3.c() == null) || (paramzgw3.c().getBackgroundColor().isEmpty())))
      {
        paramzgw3.c(true);
        com.aspose.cells.b.a.a.zf.a(paramArrayList, paramzgw3);
      }
      paramzgw2 = paramzgw3;
      return false;
    }
    return true;
  }
  
  private void a(ArrayList paramArrayList, zgw paramzgw)
  {
    Object localObject = paramzgw;
    if ((paramArrayList.size() == 0) || ((paramzgw.h() != null) && (paramzgw.h().c.f()))) {
      return;
    }
    int i1 = 0;
    double d1 = paramzgw.s() * 72.0F / this.M - f(paramzgw.k()) * this.G[0];
    if (d1 <= 0.0D) {
      return;
    }
    int i2 = 1;
    for (i1 = paramArrayList.size() - 2; (i1 >= 0) && (d1 >= 0.0D); i1--)
    {
      zgw localzgw = (zgw)paramArrayList.get(i1);
      if ((localzgw != null) && ((localzgw.r() != null) || (a(paramzgw.j(), localzgw.k()) >= 0L))) {
        break;
      }
      d1 -= f(localzgw.k()) * this.G[0];
      paramzgw.f = -1;
      i2 = paramzgw.k() - localzgw.k() + 1;
      localObject = localzgw;
    }
    paramzgw.e(i2);
  }
  
  private void a(zgw paramzgw, int paramInt)
    throws Exception
  {
    switch (paramInt)
    {
    case 1: 
      e(paramzgw);
      break;
    case 2: 
      f(paramzgw);
      break;
    case 0: 
      d(paramzgw);
      break;
    default: 
      d(paramzgw);
    }
  }
  
  private void d(zgw paramzgw)
    throws Exception
  {
    this.C.v = this.z;
    g(paramzgw);
    this.C.F = paramzgw;
    if (this.C.i == 0.0F) {
      return;
    }
    this.C.b();
    this.C.a(this.ae);
    this.C.i();
    if ((paramzgw.q()) && (paramzgw.r() != null))
    {
      this.C.F = paramzgw;
      if (this.y.getDrawObjectEventHandler() != null) {
        this.y.getDrawObjectEventHandler().a(this.C);
      }
      this.C.a(this.y.m);
    }
    this.C.q = null;
  }
  
  private void e(zgw paramzgw)
  {
    this.C.v = this.z;
    paramzgw.a(null);
    paramzgw.a(null);
    g(paramzgw);
    this.C.F = paramzgw;
    if (this.C.i == 0.0F) {
      return;
    }
    if ((paramzgw.c() != null) && (paramzgw.c().getBorders() != null))
    {
      Border localBorder1 = paramzgw.c().getBorders().getByBorderType(4);
      if ((localBorder1 != null) && (localBorder1.getLineStyle() != 0))
      {
        Style localStyle = new Style();
        Border localBorder2 = localStyle.getBorders().getByBorderType(4);
        localBorder2.setLineStyle(localBorder1.getLineStyle());
        localBorder2.setColor(localBorder1.getColor());
        paramzgw.a(localStyle);
        this.C.a(this.ae);
      }
    }
    this.C.q = null;
  }
  
  private void f(zgw paramzgw)
  {
    this.C.v = this.z;
    paramzgw.a(null);
    paramzgw.a(null);
    g(paramzgw);
    this.C.F = paramzgw;
    if (this.C.i == 0.0F) {
      return;
    }
    if ((paramzgw.c() != null) && (paramzgw.c().getBorders() != null))
    {
      Border localBorder1 = paramzgw.c().getBorders().getByBorderType(8);
      if ((localBorder1 != null) && (localBorder1.getLineStyle() != 0))
      {
        Style localStyle = new Style();
        Border localBorder2 = localStyle.getBorders().getByBorderType(8);
        localBorder2.setLineStyle(localBorder1.getLineStyle());
        localBorder2.setColor(localBorder1.getColor());
        paramzgw.a(localStyle);
        this.C.a(this.ae);
      }
    }
    this.C.q = null;
  }
  
  private void a(zbje paramzbje, boolean paramBoolean)
    throws Exception
  {
    synchronized (a)
    {
      switch (paramzbje.k())
      {
      case 5: 
      case 8: 
        if (paramzbje.l().getActiveXControl() != null) {
          try
          {
            b(paramzbje, paramBoolean);
          }
          catch (CellsException localCellsException1)
          {
            com.aspose.cells.a.c.zl.b(localCellsException1);
            throw localCellsException1;
          }
          catch (Exception localException1)
          {
            com.aspose.cells.a.c.zl.b(localException1);
            throw new CellsException(13, "Shape to image Error!");
          }
        } else {
          try
          {
            c(paramzbje, paramBoolean);
          }
          catch (CellsException localCellsException2)
          {
            com.aspose.cells.a.c.zl.b(localCellsException2);
            throw localCellsException2;
          }
          catch (Exception localException2)
          {
            com.aspose.cells.a.c.zl.b(localException2);
            throw new CellsException(0, "Chart to image Error!");
          }
        }
        break;
      default: 
        try
        {
          b(paramzbje, paramBoolean);
        }
        catch (CellsException localCellsException3)
        {
          com.aspose.cells.a.c.zl.b(localCellsException3);
          throw localCellsException3;
        }
        catch (Exception localException3)
        {
          com.aspose.cells.a.c.zl.b(localException3);
          throw new CellsException(13, "Shape to image Error!");
        }
        return;
      }
    }
  }
  
  private void b(zbje paramzbje, boolean paramBoolean)
    throws Exception
  {
    if (35 == paramzbje.l().getAutoShapeType())
    {
      this.C.y = ((float)(paramzbje.b() * this.G[0]));
      this.C.z = ((float)(paramzbje.a() * this.G[1]));
    }
    else
    {
      this.C.y = ((float)(paramzbje.l().ae().j() * this.G[0]) * 72.0F / this.M);
      this.C.z = ((float)(paramzbje.l().ae().k() * this.G[1]) * 72.0F / this.M);
    }
    this.C.j = (Math.max((float)(paramzbje.l().ae().h() * this.G[0]), 1.0F) * 72.0F / this.M);
    this.C.i = (Math.max((float)(paramzbje.l().ae().i() * this.G[1]), 1.0F) * 72.0F / this.M);
    ImageOrPrintOptions localImageOrPrintOptions = new ImageOrPrintOptions();
    localImageOrPrintOptions.setImageFormat(this.z.e);
    int i1 = paramzbje.l().getWidth();
    int i2 = paramzbje.l().getHeight();
    paramzbje.l().v = true;
    if (!(this.z instanceof zbh)) {
      paramzbje.l().u = true;
    }
    if ((this.C.i * this.C.j != 0.0F) && (paramzbje.l().ae().i() * paramzbje.l().ae().h() > 0.0F))
    {
      zq localzq;
      if (this.b.getDisplayRightToLeft()) {
        localzq = new zq(this.d.m.h() - (this.C.k + this.C.y) - this.C.j + 1.0F, this.C.l + this.C.z, (float)(paramzbje.l().ae().h() * this.G[0] * 72.0D / this.M), (float)(paramzbje.l().ae().i() * this.G[1] * 72.0D / this.M));
      } else {
        localzq = new zq(this.C.k + this.C.y, this.C.l + this.C.z, (float)(paramzbje.l().ae().h() * this.G[0] * 72.0D / this.M), (float)(paramzbje.l().ae().i() * this.G[1] * 72.0D / this.M));
      }
      zb localzb1 = new zb();
      if (this.y.l) {
        localzb1.a(new zdr(5, this.P));
      }
      zb localzb2 = new zb();
      zb localzb3 = zbid.a(paramzbje.l());
      localzb2.a(localzb3);
      localzb2.a(new com.aspose.cells.b.a.b.a.zi());
      localzb2.a().b(localzq.f(), localzq.g());
      localzb2.a().a((float)this.G[0], (float)this.G[1]);
      localzb1.a(localzb2);
      if (zw.b(paramzbje.l().o)) {
        a(localzb1, paramzbje, localzq);
      }
      if (this.y.getDrawObjectEventHandler() != null)
      {
        com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh();
        com.aspose.cells.a.d.zo localzo = new com.aspose.cells.a.d.zo(paramzbje.l().ae().h() * 72.0F / this.M, paramzbje.l().ae().i() * 72.0F / this.M);
        localzo.a(localzb3);
        zg localzg = new zg(this.z.b());
        localzg.a(localzo, localzh);
        localzg.a();
        localzh.a(0L, 0);
        this.y.getDrawObjectEventHandler().a(localzh, localzq);
      }
      if (!paramBoolean) {
        localzb1.a(new com.aspose.cells.a.d.zat(localzq.f() + this.C.b.d() - 0.5F, localzq.g() + this.C.b.e() - 0.5F, localzq.h() + 1.0F, localzq.i() + 1.0F, this.O.g().getDisplayRightToLeft(), this.C.b));
      }
      this.C.a(localzb1);
    }
    paramzbje.l().setWidth(i1);
    paramzbje.l().setHeight(i2);
  }
  
  private com.aspose.cells.b.a.d.zh a(zbje paramzbje, int paramInt)
    throws Exception
  {
    com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh();
    if (this.L.get(Integer.valueOf(paramInt)) == null)
    {
      if ((paramInt < 0) || (paramInt >= this.J.L().b().getCount()))
      {
        if (paramzbje.l().getMsoDrawingType() == 8)
        {
          localObject1 = (Picture)paramzbje.l();
          if ((((Picture)localObject1).d()) && (((Picture)localObject1).getSourceFullName() != null))
          {
            if (this.y.i != null)
            {
              localObject2 = new StreamProviderOptions();
              ((StreamProviderOptions)localObject2).a = ((Picture)localObject1).getSourceFullName();
              this.y.i.initStream((StreamProviderOptions)localObject2);
              if (((StreamProviderOptions)localObject2).getResourceLoadingType() == 1) {
                return null;
              }
              if (((StreamProviderOptions)localObject2).getResourceLoadingType() == 2)
              {
                com.aspose.cells.a.c.zx.a(((StreamProviderOptions)localObject2).c, localzh);
                localzh.a(0L, 0);
                return localzh;
              }
            }
            localObject2 = com.aspose.cells.a.c.zx.a(((Picture)localObject1).getSourceFullName());
            if (localObject2 != null) {
              return new com.aspose.cells.b.a.d.zh((byte[])localObject2);
            }
          }
        }
        localzh.a(0L, 0);
        return localzh;
      }
      Object localObject1 = this.J.L().b().a(paramInt);
      Object localObject2 = zawd.a((zcf)localObject1);
      if (((zawc)localObject2).a() != null)
      {
        Shape localShape = paramzbje.l();
        MsoFormatPicture localMsoFormatPicture = localShape.getFormatPicture();
        double d1 = localMsoFormatPicture.getLeftCrop();
        double d2 = localMsoFormatPicture.getRightCrop();
        double d3 = localMsoFormatPicture.getTopCrop();
        double d4 = localMsoFormatPicture.getBottomCrop();
        if ((d1 + d2 + d3 + d4 == 0.0D) && ((localMsoFormatPicture.getBrightness() != 0.0D) || (localMsoFormatPicture.getContrast() != 0.0D)))
        {
          Picture localPicture = (Picture)paramzbje.l();
          localzj = zbxz.a(localPicture);
          if (localMsoFormatPicture.getBrightness() != 0.0D) {
            localzj = zbxz.a(localzj, localzj.i(), localzj.h(), localMsoFormatPicture.getBrightness());
          }
          if (localMsoFormatPicture.getContrast() != 0.0D) {
            localzj = zbxz.b(localzj, localzj.i(), localzj.h(), localMsoFormatPicture.getContrast());
          }
          localzj.a(localzh, ImageFormat.getPng());
        }
        else
        {
          localzh.b(((zawc)localObject2).a(), 0, ((zawc)localObject2).a().length);
        }
        localzh.a(0L, 0);
        int i1 = zcc.a(localzh);
        if ((i1 == 1) || (i1 == 2)) {
          return localzh;
        }
        zj localzj = zj.a(localzh);
        localzh = new com.aspose.cells.b.a.d.zh();
        if ((localzj.i() < 8) || (localzj.h() < 8)) {
          zcc.a(localzj, localzh);
        } else {
          switch (localzj.c())
          {
          case 137224: 
          case 139273: 
            zcc.a(localzj, localzh, 100L);
            break;
          case 15: 
          case 65536: 
          case 131072: 
          case 197634: 
          case 198659: 
          case 1060876: 
            a(localzj, localzh);
            break;
          default: 
            a(localzj, localzh);
          }
        }
        localzj.d();
        localzh.a(0L, 0);
        this.L.put(Integer.valueOf(paramInt), localzh);
        return localzh;
      }
    }
    localzh = (com.aspose.cells.b.a.d.zh)this.L.get(Integer.valueOf(paramInt));
    localzh.a(0L, 0);
    return localzh;
  }
  
  private com.aspose.cells.b.a.d.zh a(zbje paramzbje)
    throws Exception
  {
    com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh();
    switch (paramzbje.l().getMsoDrawingType())
    {
    case 5: 
      Chart localChart = ((ChartShape)paramzbje.l()).a();
      float f1 = 0.0F;
      float f2 = this.b.getPageSetup().getZoom() / 100.0F;
      if ((f2 > this.G[1]) && (f2 < this.G[0])) {
        f1 = f2;
      } else {
        f1 = (float)(this.G[0] + this.G[1]) / 2.0F;
      }
      int i2 = localChart.getChartObject().getWidth();
      int i3 = localChart.getChartObject().getHeight();
      localChart.getChartObject().setWidth((int)(i2 * (this.G[0] / f1)));
      localChart.getChartObject().setHeight((int)(i3 * (this.G[1] / f1)));
      if (!(this.z instanceof zbh)) {
        localChart.n = true;
      }
      localzh = new com.aspose.cells.b.a.d.zh();
      if (zff.a()) {
        localChart.a(localzh, 90L);
      } else {
        localChart.a(localzh, this.z.e);
      }
      localzh.a(0L, 0);
      localChart.getChartObject().setWidth(i2);
      localChart.getChartObject().setHeight(i3);
      return localzh;
    case 8: 
      i1 = ((Picture)paramzbje.l()).b() - 1;
      return a(paramzbje, i1);
    case 24: 
      i1 = ((OleObject)paramzbje.l()).e() - 1;
      return a(paramzbje, i1);
    }
    int i1 = 0;
    return null;
  }
  
  private zb a(zbje paramzbje, zm paramzm, zq paramzq)
    throws Exception
  {
    zb localzb1 = new zb();
    Shape localShape = paramzbje.l();
    FillFormat localFillFormat = localShape.getFill();
    int[] arrayOfInt = localShape.b(localShape.getRotationAngle());
    int i1 = 0;
    if (localShape.getRotationAngle() >= 0.0D) {
      i1 = (int)(localShape.getRotationAngle() + 0.5D);
    } else {
      i1 = (int)(localShape.getRotationAngle() - 0.5D);
    }
    boolean bool = c(i1);
    float f1 = (float)this.G[0];
    float f2 = (float)this.G[1];
    if (bool)
    {
      f1 = (float)this.G[1];
      f2 = (float)this.G[0];
    }
    float f3 = arrayOfInt[3] * 72.0F / this.M;
    float f4 = arrayOfInt[2] * 72.0F / this.M;
    zq localzq1 = new zq(0.0F, 0.0F, f4, f3);
    int i2 = zcc.a(paramzm);
    int i3 = 0;
    if ((i2 != 1) && (i2 != 2))
    {
      i3 = 1;
      paramzm = b(localShape, paramzm);
      paramzm = a(paramzm, localzq1.e());
    }
    com.aspose.cells.a.d.zl localzl1 = com.aspose.cells.a.d.zl.a(localzq1.d(), localzq1.e(), paramzm);
    zt localzt = new zt((float)localzl1.f().f(), (float)localzl1.f().g());
    paramzm.b(0L);
    if (a(localShape, i2))
    {
      paramzm = a(localShape, paramzm);
      paramzm.b(0L);
    }
    if (b(i2))
    {
      paramzm = a(paramzm);
      paramzm.b(0L);
    }
    localzl1 = null;
    com.aspose.cells.a.d.zl localzl2 = com.aspose.cells.a.d.zl.a(new com.aspose.cells.b.a.b.zo(0.0F, 0.0F), localzt, paramzm);
    if (localzl2.f().b() * localzl2.f().c() < 1.0E-4D) {
      return localzb1;
    }
    if (localShape.getFill().getFillType() == 2)
    {
      localzb2 = new zb();
      localObject1 = new zq(0.0F, 0.0F, f4, f3);
      Color localColor = a(localFillFormat.getSolidFill().getTransparency(), localFillFormat.getSolidFill().getColor());
      zu localzu = new zu(localColor);
      com.aspose.cells.a.d.zp localzp = new com.aspose.cells.a.d.zp((zq)localObject1);
      localzp.a(localzu);
      localzb2.a(localzp);
      zq localzq2 = new zq(0.0F, 0.0F, f4 * f1, f3 * f2);
      com.aspose.cells.b.a.b.a.zi localzi1 = a(localShape, localzq2);
      localzi1.a(f1, f2);
      localzb2.a(localzi1);
      localzb1.a(localzb2);
    }
    else if ((localShape.getFill().getFillType() == 3) || (localShape.getFill().getFillType() == 5) || (localShape.getFill().getFillType() != 4)) {}
    zb localzb2 = new zb();
    localzb2.a(localzl2);
    Object localObject1 = localShape.getFormatPicture();
    double d1 = ((MsoFormatPicture)localObject1).getLeftCrop();
    double d2 = ((MsoFormatPicture)localObject1).getRightCrop();
    double d3 = ((MsoFormatPicture)localObject1).getTopCrop();
    double d4 = ((MsoFormatPicture)localObject1).getBottomCrop();
    if (i3 != 0)
    {
      d1 = 0.0D;
      d2 = 0.0D;
      d3 = 0.0D;
      d4 = 0.0D;
    }
    float f5 = (float)(localzl2.c().b() * d1);
    float f6 = (float)(localzl2.c().c() * d3);
    float f7 = (float)(localzl2.c().b() * d2);
    float f8 = (float)(localzl2.c().c() * d4);
    float f9 = (float)(localzl2.c().b() * (1.0D - d1 - d2));
    float f10 = (float)(localzl2.c().c() * (1.0D - d3 - d4));
    float f11 = 1.0F;
    float f12 = 1.0F;
    f11 = localzq1.h() / f9;
    f12 = localzq1.i() / f10;
    zq localzq3 = new zq(localzq1.f(), localzq1.g(), localzq1.h() / f11, localzq1.i() / f12);
    localzq3.a(localzq3.f() + f5);
    localzq3.b(localzq3.g() + f6);
    localzq3.a(0.5F, 0.5F);
    if (i3 == 0) {
      localzb2.a(new com.aspose.cells.a.d.zp(localzq3));
    }
    zq localzq4 = new zq(localzq1.f() * f1, localzq1.g() * f2, localzq1.h() * f1, localzq1.i() * f2);
    com.aspose.cells.b.a.b.a.zi localzi2 = a(localShape, localzq4);
    localzi2.a(f1 * f11, f2 * f12);
    localzi2.b(-f5, -f6);
    localzb2.a(localzi2);
    localzb1.a(localzb2);
    LineFormat localLineFormat = localShape.b(2, false);
    Object localObject3;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    zq localzq5;
    Object localObject7;
    if (localLineFormat.g())
    {
      localObject2 = new zb();
      float f13 = (float)localLineFormat.getWeight();
      if (f13 < 0.75F) {
        f13 = 0.75F;
      }
      localObject3 = a(localLineFormat.getTransparency(), localLineFormat.b());
      localObject4 = new com.aspose.cells.a.d.zx((Color)localObject3, f13);
      a(localLineFormat, (com.aspose.cells.a.d.zx)localObject4);
      localObject5 = new zq(-f13 / 2.0F, -f13 / 2.0F, f4 + f13, f3 + f13);
      if (i1 != 0) {
        ((zq)localObject5).a(-0.5F, -0.5F);
      }
      localObject6 = new com.aspose.cells.a.d.zp((zq)localObject5);
      ((com.aspose.cells.a.d.zp)localObject6).a((com.aspose.cells.a.d.zx)localObject4);
      ((zb)localObject2).a((com.aspose.cells.a.d.zn)localObject6);
      localzq5 = new zq(((zq)localObject5).f() * f1, ((zq)localObject5).g() * f2, ((zq)localObject5).h() * f1, ((zq)localObject5).i() * f2);
      localObject7 = a(localShape, localzq5);
      ((com.aspose.cells.b.a.b.a.zi)localObject7).a(f1, f2);
      ((zb)localObject2).a((com.aspose.cells.b.a.b.a.zi)localObject7);
      localzb1.a((com.aspose.cells.a.d.zn)localObject2);
    }
    Object localObject2 = new com.aspose.cells.b.a.b.a.zi();
    ((com.aspose.cells.b.a.b.a.zi)localObject2).b(paramzq.f(), paramzq.g());
    localzb1.a((com.aspose.cells.b.a.b.a.zi)localObject2);
    zb localzb3 = new zb();
    localzb3.a(localzb1);
    if (localShape.getHyperlink() != null) {
      if ((this.o != null) && (this.o.containsKey(localShape.getHyperlink())))
      {
        localObject3 = (Cell)this.o.get(localShape.getHyperlink());
        this.r.put(localShape, localObject3);
        localObject4 = new zk(new zq(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i()), "#shape_" + localShape.hashCode());
        this.p.put(localShape, localObject4);
        this.C.c.a((com.aspose.cells.a.d.zn)localObject4);
      }
      else
      {
        localObject3 = a(localShape.getRotationAngle(), paramzq);
        localObject4 = new com.aspose.cells.b.a.b.zo[4];
        localObject4[0] = new com.aspose.cells.b.a.b.zo(((zq)localObject3).f(), ((zq)localObject3).g());
        localObject4[1] = new com.aspose.cells.b.a.b.zo(((zq)localObject3).f(), ((zq)localObject3).m());
        localObject4[2] = new com.aspose.cells.b.a.b.zo(((zq)localObject3).l(), ((zq)localObject3).g());
        localObject4[3] = new com.aspose.cells.b.a.b.zo(((zq)localObject3).l(), ((zq)localObject3).m());
        localObject5 = new com.aspose.cells.b.a.b.a.zi();
        localObject6 = new com.aspose.cells.b.a.b.zo(((zq)localObject3).f() + ((zq)localObject3).h() / 2.0F, ((zq)localObject3).g() + ((zq)localObject3).i() / 2.0F);
        ((com.aspose.cells.b.a.b.a.zi)localObject5).a((float)localShape.getRotationAngle(), (com.aspose.cells.b.a.b.zo)localObject6);
        ((com.aspose.cells.b.a.b.a.zi)localObject5).a((com.aspose.cells.b.a.b.zo[])localObject4);
        localzq5 = a((com.aspose.cells.b.a.b.zo[])localObject4);
        localObject7 = new zk(localzq5, zw.a(localShape.getHyperlink().getAddress(), "\\", "/"));
        localzb3.a((zk)localObject7);
      }
    }
    return localzb3;
  }
  
  public static zm a(Shape paramShape, zm paramzm)
    throws Exception
  {
    try
    {
      Color localColor1 = paramShape.getFormatPicture().a.a.b(paramShape.P().p());
      Color localColor2 = paramShape.getFormatPicture().a.b.b(paramShape.P().p());
      com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh();
      za localza1 = new za(paramzm);
      try
      {
        za localza2 = new za(localza1.i(), localza1.h());
        try
        {
          if (!CellsHelper.a(localza1)) {
            localza2.a(localza1.j(), localza1.k());
          }
          com.aspose.cells.b.a.b.zi localzi = com.aspose.cells.b.a.b.zi.a(localza2);
          try
          {
            localzi.a(localza1, new com.aspose.cells.b.a.b.zn(0, 0));
            for (int i1 = 0; i1 < localza2.i(); i1++) {
              for (int i2 = 0; i2 < localza2.h(); i2++)
              {
                Color localColor3 = localza2.a(i1, i2);
                if (a(localColor3, localColor1, 15)) {
                  localza2.a(i1, i2, localColor2);
                }
              }
            }
            localza2.a(localzh, ImageFormat.getPng());
          }
          finally {}
        }
        finally {}
      }
      finally
      {
        if (localza1 != null) {
          localza1.b();
        }
      }
      return localzh;
    }
    catch (Exception localException) {}
    return paramzm;
  }
  
  private zm a(zm paramzm)
    throws Exception
  {
    try
    {
      com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh();
      za localza1 = new za(paramzm);
      try
      {
        za localza2 = new za(localza1.i(), localza1.h());
        try
        {
          if (!CellsHelper.a(localza1)) {
            localza2.a(localza1.j(), localza1.k());
          }
          com.aspose.cells.b.a.b.zi localzi = com.aspose.cells.b.a.b.zi.a(localza2);
          try
          {
            localzi.a(localza1, new com.aspose.cells.b.a.b.zn(0, 0));
            for (int i1 = 0; i1 < localza2.i(); i1++) {
              for (int i2 = 0; i2 < localza2.h(); i2++)
              {
                Color localColor1 = localza2.a(i1, i2);
                int i3 = (int)(0.2126D * (localColor1.getR() & 0xFF) + 0.7152D * (localColor1.getG() & 0xFF) + 0.0722D * (localColor1.getB() & 0xFF));
                Color localColor2 = Color.fromArgb(localColor1.getA() & 0xFF, i3, i3, i3);
                localza2.a(i1, i2, localColor2);
              }
            }
            localza2.a(localzh, ImageFormat.getPng());
          }
          finally {}
        }
        finally {}
      }
      finally
      {
        if (localza1 != null) {
          localza1.b();
        }
      }
      return localzh;
    }
    catch (Exception localException) {}
    return paramzm;
  }
  
  public static boolean a(Shape paramShape, int paramInt)
  {
    if (paramInt == 1) {
      return false;
    }
    if (paramInt == 2) {
      return false;
    }
    if (paramInt == 0) {
      return false;
    }
    if (paramShape.getFormatPicture() == null) {
      return false;
    }
    if (paramShape.getFormatPicture().a == null) {
      return false;
    }
    if (!paramShape.getFormatPicture().a.b.b(2)) {
      return false;
    }
    return paramShape.getFormatPicture().a.b != null;
  }
  
  private boolean b(int paramInt)
  {
    if (paramInt == 1) {
      return false;
    }
    if (paramInt == 2) {
      return false;
    }
    if (paramInt == 0) {
      return false;
    }
    return this.b.getPageSetup().getBlackAndWhite();
  }
  
  private static boolean a(Color paramColor1, Color paramColor2, int paramInt)
  {
    if (!a(paramColor1.getA() & 0xFF, paramColor2.getA() & 0xFF, paramInt)) {
      return false;
    }
    if (!a(paramColor1.getR() & 0xFF, paramColor2.getR() & 0xFF, paramInt)) {
      return false;
    }
    if (!a(paramColor1.getG() & 0xFF, paramColor2.getG() & 0xFF, paramInt)) {
      return false;
    }
    return a(paramColor1.getB() & 0xFF, paramColor2.getB() & 0xFF, paramInt);
  }
  
  private static boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    return Math.abs(paramInt1 - paramInt2) <= paramInt3;
  }
  
  private zm b(Shape paramShape, zm paramzm)
    throws Exception
  {
    double d1 = paramShape.getFormatPicture().getLeftCrop();
    double d2 = paramShape.getFormatPicture().getRightCrop();
    double d3 = paramShape.getFormatPicture().getTopCrop();
    double d4 = paramShape.getFormatPicture().getBottomCrop();
    if ((d1 != 0.0D) || (d2 != 0.0D) || (d3 != 0.0D) || (d4 != 0.0D))
    {
      zj localzj = zj.a(paramzm);
      try
      {
        int i1 = (int)(localzj.m().b() * d1 + 0.5D);
        int i2 = (int)(localzj.m().c() * d3 + 0.5D);
        int i3 = (int)(localzj.m().b() * (1.0D - d1 - d2) + 0.5D);
        int i4 = (int)(localzj.m().c() * (1.0D - d3 - d4) + 0.5D);
        zq localzq1 = new zq(i1, i2, i3, i4);
        za localza = new za(i3, i4);
        try
        {
          com.aspose.cells.b.a.b.zi localzi = com.aspose.cells.b.a.b.zi.a(localza);
          try
          {
            zq localzq2 = new zq(0.0F, 0.0F, i3, i4);
            localzi.a(localzj, localzq2, localzq1, 2);
            com.aspose.cells.b.a.d.zh localzh1 = new com.aspose.cells.b.a.d.zh();
            localza.a(localzh1, ImageFormat.getPng());
            localzh1.b(0L);
            com.aspose.cells.b.a.d.zh localzh2 = localzh1;
            return localzh2;
          }
          finally {}
          localObject3 = finally;
        }
        finally {}
        return paramzm;
      }
      finally
      {
        if (localzj != null) {
          localzj.b();
        }
      }
    }
  }
  
  private zm a(zm paramzm, zt paramzt)
    throws Exception
  {
    zj localzj = zj.a(paramzm);
    try
    {
      zt localzt = new zt(localzj.m().b(), localzj.m().c());
      paramzt = new zt(paramzt.b() * this.M / 72.0F, paramzt.c() * this.M / 72.0F);
      float f1 = localzt.b() / paramzt.b();
      if (((localzt.b() > 800.0F) || (localzt.c() > 600.0F)) && (f1 > 10.0F))
      {
        float f2 = f1 / 1.5F;
        int i1 = (int)(localzt.b() / f2 + 0.5F);
        int i2 = (int)(localzt.c() / f2 + 0.5F);
        za localza = new za(i1, i2);
        try
        {
          com.aspose.cells.b.a.b.zi localzi = com.aspose.cells.b.a.b.zi.a(localza);
          try
          {
            zq localzq1 = new zq(0.0F, 0.0F, i1, i2);
            zq localzq2 = new zq(0.0F, 0.0F, localzt.b(), localzt.c());
            localzi.a(localzj, localzq1, localzq2, 2);
            com.aspose.cells.b.a.d.zh localzh1 = new com.aspose.cells.b.a.d.zh();
            localza.a(localzh1, ImageFormat.getPng());
            localzh1.b(0L);
            com.aspose.cells.b.a.d.zh localzh2 = localzh1;
            return localzh2;
          }
          finally {}
          localzm = paramzm;
        }
        finally {}
      }
      zm localzm;
      return localzm;
    }
    finally
    {
      if (localzj != null) {
        localzj.b();
      }
    }
  }
  
  private void a(LineFormat paramLineFormat, com.aspose.cells.a.d.zx paramzx)
  {
    switch (paramLineFormat.getDashStyle())
    {
    case 6: 
      paramzx.g = 0;
      break;
    case 5: 
      paramzx.g = 2;
      paramzx.e = 2;
      break;
    case 7: 
      paramzx.g = 2;
      break;
    case 0: 
      paramzx.g = 5;
      paramzx.a(new float[] { 4.0F, 4.0F });
      break;
    case 1: 
      paramzx.g = 5;
      paramzx.a(new float[] { 4.0F, 3.0F, 1.0F, 3.0F });
      break;
    case 3: 
      paramzx.g = 2;
      break;
    case 4: 
      paramzx.g = 2;
      break;
    case 2: 
      paramzx.g = 2;
    }
    switch (paramLineFormat.getCompoundType())
    {
    case 4: 
      paramzx.m = new float[] { 0.0F, 0.33333334F, 0.6666667F, 1.0F };
      break;
    case 2: 
      paramzx.m = new float[] { 0.0F, 0.2F, 0.4F, 1.0F };
      break;
    case 3: 
      paramzx.m = new float[] { 0.0F, 0.6F, 0.8F, 1.0F };
      break;
    case 1: 
      paramzx.m = new float[] { 0.0F, 0.16666667F, 0.33333334F, 0.6666667F, 0.8333333F, 1.0F };
    }
  }
  
  private Color a(double paramDouble, Color paramColor)
  {
    return Color.a((int)((1.0D - paramDouble) * 255.0D), paramColor);
  }
  
  private com.aspose.cells.b.a.b.a.zi a(Shape paramShape, zq paramzq)
    throws Exception
  {
    int i1 = 0;
    if (paramShape.getRotationAngle() >= 0.0D) {
      i1 = (int)(paramShape.getRotationAngle() + 0.5D);
    } else {
      i1 = (int)(paramShape.getRotationAngle() - 0.5D);
    }
    boolean bool1 = c(i1);
    com.aspose.cells.b.a.b.zo localzo = c(paramShape, paramzq);
    boolean bool2 = paramShape.R().j().f();
    boolean bool3 = paramShape.R().j().e();
    com.aspose.cells.b.a.b.a.zi localzi1 = new com.aspose.cells.b.a.b.a.zi(bool2 ? -1.0F : 1.0F, 0.0F, 0.0F, bool3 ? -1.0F : 1.0F, bool2 ? localzo.d() * 2.0F : 0.0F, bool3 ? localzo.e() * 2.0F : 0.0F);
    localzi1.a((bool2 ^ bool3) ? -i1 : i1, new com.aspose.cells.b.a.b.zo(localzo.d(), localzo.e()));
    if (bool1) {
      localzi1.b(paramzq.i() / 2.0F - paramzq.h() / 2.0F, paramzq.h() / 2.0F - paramzq.i() / 2.0F);
    }
    com.aspose.cells.b.a.b.a.zi localzi2 = b(paramShape, paramzq);
    localzi1.b(localzi2);
    return localzi1;
  }
  
  private com.aspose.cells.b.a.b.a.zi b(Shape paramShape, zq paramzq)
    throws Exception
  {
    com.aspose.cells.b.a.b.zo localzo = c(paramShape, paramzq);
    zbku localzbku1 = new zbku();
    double d1 = paramShape.getThreeDFormat().getRotationX() / 180.0D * 3.141592653589793D;
    double d2 = paramShape.getThreeDFormat().getRotationY() / 180.0D * 3.141592653589793D;
    double d3 = paramShape.getThreeDFormat().getRotationZ() / 180.0D * 3.141592653589793D;
    localzbku1 = new zbku(1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, -localzo.d(), -localzo.e(), 0.0F);
    localzbku1.b(d1);
    localzbku1.a(d2);
    localzbku1.c(-d3);
    zbku localzbku2 = new zbku(1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    localzbku1.a(localzbku2);
    zbku localzbku3 = new zbku(1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, localzo.d(), localzo.e(), 0.0F);
    localzbku1.a(localzbku3);
    com.aspose.cells.b.a.b.a.zi localzi = localzbku1.a();
    return localzi;
  }
  
  private com.aspose.cells.b.a.b.zo c(Shape paramShape, zq paramzq)
  {
    com.aspose.cells.b.a.b.zo localzo = new com.aspose.cells.b.a.b.zo();
    int i1 = 0;
    if (paramShape.getRotationAngle() >= 0.0D) {
      i1 = (int)(paramShape.getRotationAngle() + 0.5D);
    } else {
      i1 = (int)(paramShape.getRotationAngle() - 0.5D);
    }
    boolean bool = c(i1);
    if (bool)
    {
      localzo.a(paramzq.g() + paramzq.i() / 2.0F);
      localzo.b(paramzq.f() + paramzq.h() / 2.0F);
    }
    else
    {
      localzo.a(paramzq.f() + paramzq.h() / 2.0F);
      localzo.b(paramzq.g() + paramzq.i() / 2.0F);
    }
    return localzo;
  }
  
  private boolean c(int paramInt)
  {
    paramInt %= 360;
    if (paramInt < 0) {
      paramInt += 360;
    }
    return ((paramInt >= 45) && (paramInt < 135)) || ((paramInt >= 225) && (paramInt < 315));
  }
  
  private zq a(double paramDouble, zq paramzq)
  {
    zq localzq = new zq(paramzq.f(), paramzq.g(), paramzq.h(), paramzq.i());
    paramDouble %= 360.0D;
    if (paramDouble < 0.0D) {
      paramDouble += 360.0D;
    }
    float f1 = Math.abs(paramzq.h() - paramzq.i());
    if (paramzq.h() > paramzq.i())
    {
      if (((paramDouble >= 45.0D) && (paramDouble < 135.0D)) || ((paramDouble >= 225.0D) && (paramDouble < 315.0D)))
      {
        localzq.a(localzq.f() + f1 / 2.0F);
        localzq.b(localzq.g() - f1 / 2.0F);
        localzq.c(paramzq.i());
        localzq.d(paramzq.h());
      }
    }
    else if (((paramDouble >= 45.0D) && (paramDouble < 135.0D)) || ((paramDouble >= 225.0D) && (paramDouble < 315.0D)))
    {
      localzq.a(localzq.f() - f1 / 2.0F);
      localzq.b(localzq.g() + f1 / 2.0F);
      localzq.c(paramzq.i());
      localzq.d(paramzq.h());
    }
    return localzq;
  }
  
  private zq a(com.aspose.cells.b.a.b.zo[] paramArrayOfzo)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    if (paramArrayOfzo.length > 0)
    {
      f1 = paramArrayOfzo[0].d();
      f2 = paramArrayOfzo[0].d();
      f3 = paramArrayOfzo[0].e();
      f4 = paramArrayOfzo[0].e();
    }
    for (int i1 = 1; i1 < paramArrayOfzo.length; i1++)
    {
      com.aspose.cells.b.a.b.zo localzo = paramArrayOfzo[i1];
      if (!com.aspose.cells.b.a.b.zo.a(localzo, com.aspose.cells.b.a.b.zo.a()))
      {
        if (localzo.d() < f1) {
          f1 = localzo.d();
        }
        if (localzo.d() > f2) {
          f2 = localzo.d();
        }
        if (localzo.e() < f3) {
          f3 = localzo.e();
        }
        if (localzo.e() > f4) {
          f4 = localzo.e();
        }
      }
    }
    float f5 = f1;
    float f6 = f3;
    float f7 = (float)Math.ceil(f2 - f5);
    if (f7 == 0.0F) {
      f7 = 1.0F;
    }
    float f8 = (float)Math.ceil(f4 - f6);
    if (f8 == 0.0F) {
      f8 = 1.0F;
    }
    return new zq(f5, f6, f7, f8);
  }
  
  private void c(zbje paramzbje, boolean paramBoolean)
    throws Exception
  {
    this.C.y = ((float)paramzbje.b() * (float)this.G[0]);
    this.C.z = ((float)paramzbje.a() * (float)this.G[1]);
    this.C.i = ((float)paramzbje.j() * (float)this.G[1]);
    this.C.j = ((float)paramzbje.i() * (float)this.G[0]);
    paramzbje.l().v = true;
    try
    {
      if (this.C.i * this.C.j != 0.0F)
      {
        zq localzq;
        if (this.b.getDisplayRightToLeft()) {
          localzq = new zq(this.d.m.h() - (this.C.k + this.C.y) - this.C.j + 1.0F, this.C.l + this.C.z, this.C.j, this.C.i);
        } else {
          localzq = new zq(this.C.k + this.C.y, this.C.l + this.C.z, this.C.j, this.C.i);
        }
        zb localzb1;
        Object localObject;
        if (paramzbje.k() == 5)
        {
          localzb1 = new zb();
          if (this.y.l) {
            localzb1.a(new zdr(4, this.P));
          }
          localObject = new zb();
          Chart localChart = ((ChartShape)paramzbje.l()).a();
          float f1 = 0.0F;
          float f2 = this.b.getPageSetup().getZoom() / 100.0F;
          if ((f2 > this.G[1]) && (f2 < this.G[0])) {
            f1 = f2;
          } else {
            f1 = (float)(this.G[0] + this.G[1]) / 2.0F;
          }
          int i1 = localChart.getChartObject().getWidth();
          int i2 = localChart.getChartObject().getHeight();
          localChart.b(i1);
          localChart.c(i2);
          localChart.getChartObject().setWidth((int)(i1 * (this.G[0] / f1)));
          localChart.getChartObject().setHeight((int)(i2 * (this.G[1] / f1)));
          if (!(this.z instanceof zbh)) {
            localChart.n = true;
          }
          zb localzb2 = localChart.F();
          localChart.getChartObject().setWidth(i1);
          localChart.getChartObject().setHeight(i2);
          float f3 = (float)(localChart.getChartArea().getBorder().getWeightPt() * f1);
          if (localChart.getChartArea().getBorder().getWeightPx() > 1.0D)
          {
            localzq.a(localzq.f() - f3 / 2.0F);
            localzq.b(localzq.g() - f3 / 2.0F);
          }
          ((zb)localObject).a(localzb2);
          ((zb)localObject).a(new com.aspose.cells.b.a.b.a.zi());
          ((zb)localObject).a().b(localzq.f(), localzq.g());
          ((zb)localObject).a().a(f1, f1);
          localzb1.a((com.aspose.cells.a.d.zn)localObject);
          a(localzb1, paramzbje, localzq);
          if (this.y.getDrawObjectEventHandler() != null)
          {
            com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh();
            com.aspose.cells.a.d.zo localzo = new com.aspose.cells.a.d.zo((float)paramzbje.i(), (float)paramzbje.j());
            localzo.a(localChart.F());
            zg localzg = new zg(this.z.b());
            localzg.a(localzo, localzh);
            localzg.a();
            localzh.a(0L, 0);
            this.y.getDrawObjectEventHandler().a(localzh, localzq);
          }
        }
        else
        {
          localObject = a(paramzbje);
          if (((com.aspose.cells.b.a.d.zh)localObject).h() == 0L) {
            return;
          }
          ((com.aspose.cells.b.a.d.zh)localObject).a(0L, 0);
          localzb1 = a(paramzbje, (zm)localObject, localzq);
          if (this.y.l) {
            localzb1.a(new zdr(6, this.P));
          }
          if (this.y.getDrawObjectEventHandler() != null)
          {
            ((com.aspose.cells.b.a.d.zh)localObject).a(0L, 0);
            this.y.getDrawObjectEventHandler().a((com.aspose.cells.b.a.d.zh)localObject, localzq);
            ((com.aspose.cells.b.a.d.zh)localObject).a(0L, 0);
          }
        }
        if (paramBoolean) {
          localzb1.a(null);
        } else {
          localzb1.a(new com.aspose.cells.a.d.zat(localzq.f() + this.C.b.d(), localzq.g() + this.C.b.e(), localzq.h(), localzq.i(), this.b.getDisplayRightToLeft(), this.C.b));
        }
        this.C.a(localzb1);
      }
    }
    catch (Exception localException)
    {
      com.aspose.cells.a.c.zl.b(localException);
    }
    paramzbje.l().v = false;
  }
  
  private boolean a(Cell paramCell)
  {
    if (paramCell == null) {
      return false;
    }
    return this.o.containsValue(paramCell);
  }
  
  private static int b(ArrayList paramArrayList, zgw paramzgw)
  {
    int i1 = -1;
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      zaus localzaus = (zaus)localIterator.next();
      i1++;
      if (localzaus.a == paramzgw.h().d.g().getIndex()) {
        if ((paramzgw.j() >= localzaus.c.a) && (paramzgw.j() <= localzaus.c.c) && (paramzgw.k() >= localzaus.c.b) && (paramzgw.k() <= localzaus.c.d)) {
          return i1;
        }
      }
    }
    return 0;
  }
  
  private void g(zgw paramzgw)
  {
    if ((paramzgw.l() == 1) && (this.ae != -1.0F)) {
      this.C.i = (this.ae * (float)this.G[1]);
    } else {
      this.C.i = ((float)paramzgw.a(this.b, paramzgw.j(), this.d.e, paramzgw.l()) * (float)this.G[1]);
    }
    if ((paramzgw.l() == 1) && (this.af != -1)) {
      this.C.n = (this.af * (float)this.G[1]);
    } else {
      this.C.n = (paramzgw.b(this.b, paramzgw.j(), this.d.e, paramzgw.l()) * (float)this.G[1]);
    }
    this.C.s = paramzgw.g();
    this.C.r = paramzgw.c().getVerticalAlignment();
    this.C.p = ((this.b.getPageSetup().getBlackAndWhite()) || ((this.y != null) && (this.y.e)));
    Style localStyle = paramzgw.c();
    if (localStyle == null) {
      return;
    }
    Color localColor = zavt.a(localStyle);
    Object localObject1;
    Object localObject2;
    if ((paramzgw.h() != null) && (this.s != null))
    {
      localObject1 = this.s.keySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (PdfBookmarkEntry)((Iterator)localObject1).next();
        if ((((PdfBookmarkEntry)localObject2).getDestination() != null) && (((PdfBookmarkEntry)localObject2).getDestination().equals(paramzgw.h())))
        {
          float f1 = (float)(this.d.n / 2.5399999618530273D * 72.0D);
          float f2 = (float)(this.d.o / 2.5399999618530273D * 72.0D);
          if (!((PdfBookmarkEntry)localObject2).a()) {
            ((PdfBookmarkEntry)localObject2).a(b(this.S, paramzgw), new com.aspose.cells.b.a.b.zo(this.C.k + f1, (float)this.x[1] - (this.C.l + f2)));
          }
        }
      }
    }
    if (paramzgw.p() != null) {
      if ((this.o != null) && (this.o.containsKey(paramzgw.p())))
      {
        localObject1 = (Cell)this.o.get(paramzgw.p());
        if (paramzgw.h() == null) {
          paramzgw.a(this.O.a(paramzgw.j(), paramzgw.k(), false));
        }
        this.r.put(paramzgw.h(), localObject1);
        localObject2 = new zk(new zq(this.C.k, this.C.l, this.C.j, this.C.i), "#" + paramzgw.h().d.g().getIndex() + "_" + paramzgw.h().getRow() + "_" + paramzgw.h().getColumn());
        this.p.put(paramzgw.h(), localObject2);
        this.C.c.a((com.aspose.cells.a.d.zn)localObject2);
      }
      else
      {
        int i1 = paramzgw.p().a(this.c.getWorksheets());
        switch (i1)
        {
        case 0: 
          this.C.B = true;
          this.C.C = paramzgw.p().getAddress();
          break;
        case 1: 
          this.C.B = true;
          this.C.C = paramzgw.p().getAddress();
        }
      }
    }
    this.C.o = localColor;
    if (localStyle.getRotationAngle() != 255) {
      this.C.t = localStyle.getRotationAngle();
    }
  }
  
  private void a(Worksheet paramWorksheet)
    throws Exception
  {
    this.C.c = new zb();
    Chart localChart = this.b.getCharts().get(0);
    PageSetup localPageSetup = this.b.getCharts().get(0).getPageSetup();
    this.C.A = this.b.getCells();
    this.C.e();
    this.C.g();
    float f1 = 1.0F;
    this.C.q = null;
    this.C.y = 0.0F;
    this.C.z = 0.0F;
    this.C.G = this.G;
    float f2 = (float)(localChart.getChartObject().getWidthPt() * this.G[0]);
    float f3 = (float)(localChart.getChartObject().getHeightPt() * this.G[1]);
    f1 = (float)Math.min(this.i / f2, this.j / f3);
    this.C.j = (f2 * f1);
    this.C.i = (f3 * f1);
    if (this.O.h().getPrintGridlines()) {
      this.C.a(0.0F, 0.0F, this.d.m, c(this.d.m), this.y.getGridlineType());
    }
    if (this.C.i * this.C.j != 0.0F)
    {
      if (!(this.z instanceof zbh)) {
        localChart.n = true;
      }
      zb localzb1 = new zb();
      if (this.y.l) {
        localzb1.a(new zdr(11, this.P));
      }
      zb localzb2 = localChart.F();
      localzb1.a(localzb2);
      localzb1.a(new com.aspose.cells.b.a.b.a.zi());
      localzb1.a().b(this.C.k + this.C.y, this.C.l + this.C.z);
      localzb1.a().a(f1, f1);
      this.C.a(localzb1);
    }
    this.C.b(false);
    this.C.h();
  }
  
  public zb a()
    throws Exception
  {
    this.O = this.b.getCells();
    zaus localzaus = this.d;
    if (localzaus.a != this.P)
    {
      this.P = localzaus.a;
      this.b = this.c.getWorksheets().get(this.P);
      this.aa = this.Z.e[this.P];
    }
    this.G = this.ac.c;
    this.t = localzaus.c.a;
    this.u = localzaus.c.c;
    this.v = localzaus.c.b;
    this.Q = localzaus.c.a;
    this.g = localzaus.h;
    this.h = localzaus.i;
    this.K = this.ac.j;
    this.I = localzaus.l;
    if (this.b.getType() == 2) {
      try
      {
        a(this.b);
        return this.C.c;
      }
      catch (Exception localException) {}
    }
    zgr localzgr = new zgr(this.t, this.v, this.u, localzaus.c.d);
    a(localzgr, 0.0F, 0.0F);
    return this.C.c;
  }
  
  public zb b()
    throws Exception
  {
    this.O = this.b.getCells();
    zaus localzaus = this.d;
    this.P = localzaus.a;
    this.b = this.c.getWorksheets().get(this.P);
    this.G = this.ac.c;
    this.t = localzaus.c.a;
    this.u = localzaus.c.c;
    this.v = Math.min(localzaus.c.b, this.v);
    this.Q = Math.min(localzaus.c.a, this.Q);
    this.g = localzaus.h;
    this.h = localzaus.i;
    this.K = this.ac.j;
    this.I = localzaus.l;
    this.t = localzaus.c.a;
    this.u = localzaus.c.c;
    if (this.b.getType() == 2) {
      try
      {
        a(this.b);
        return this.C.c;
      }
      catch (Exception localException) {}
    }
    zgr localzgr = new zgr(this.t, localzaus.c.b, this.u, localzaus.c.d);
    a(localzgr, 0.0F, 0.0F);
    return this.C.c;
  }
  
  public zb c()
    throws Exception
  {
    String str = this.b.getPageSetup().getPrintArea();
    if ((str != null) && (str.length() > 0)) {
      return a();
    }
    return b();
  }
  
  public zb d()
    throws Exception
  {
    this.C.c = new zb();
    if (this.y.l) {
      this.C.c.a(new zdr(2, this.P));
    }
    this.C.d();
    this.C.c();
    this.C.e();
    this.C.g();
    this.H = new zagr(this.c, this.C, this.g, this.h, this.z, this.ac);
    this.H.a(this.b, this.e, this.f, this.d);
    this.C.a(null, true);
    this.C.f();
    this.C.h();
    return this.C.c;
  }
  
  public zb a(zq[] paramArrayOfzq)
    throws Exception
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    zb localzb = new zb();
    this.C.c = localzb;
    this.D = 0.0F;
    this.E = 0.0F;
    this.C.k = 0.0F;
    this.C.l = 0.0F;
    paramArrayOfzq[0].c(0.0F);
    paramArrayOfzq[0].d(0.0F);
    if ((this.m >= 0) && (this.n >= 0))
    {
      if (this.m >= this.T.b) {
        return localzb;
      }
      int i1 = this.m;
      int i2 = this.n;
      if (this.T.b <= this.n) {
        i2 = this.T.b - 1;
      }
      f1 += (float)(c(i1, i2) * this.G[0]);
      f2 += (float)(b(this.T.a, this.T.c) * this.G[1]);
      for (int i3 = this.k; (i3 <= this.l) && (i3 >= 0); i3++) {
        if ((i3 < this.T.a) || (i3 > this.T.c)) {
          f2 += (float)(d(i3) * this.G[1]);
        }
      }
      paramArrayOfzq[0].a(0.0F);
      paramArrayOfzq[0].b(0.0F);
      paramArrayOfzq[0].c(f1);
      paramArrayOfzq[0].d(f2);
      this.C.e = this.T.a;
      this.C.f = Math.min(this.T.b, this.m);
      this.C.g = this.T.c;
      this.C.h = Math.max(this.T.d, this.n);
      this.C.A = this.b.getCells();
      this.C.d();
      this.C.c();
      this.C.e();
      this.C.g();
      this.C.M = 4;
      this.C.k = (this.E = paramArrayOfzq[0].f());
      this.C.l = (this.D = paramArrayOfzq[0].g());
      this.C.G = this.G;
      if (this.O.h().getPrintGridlines()) {
        this.C.a(this.E, this.D, paramArrayOfzq[0], c(paramArrayOfzq[0]), this.y.getGridlineType());
      }
      double d1;
      for (int i4 = this.k; (i4 <= this.l) && (i4 >= 0); i4++) {
        if ((i4 < this.T.a) || (i4 > this.T.c))
        {
          d1 = d(i4);
          a(i4, this.T.a, this.m, this.T.c, this.n);
          this.C.l += (float)(d1 * this.G[1]);
        }
      }
      for (i4 = this.T.a; i4 <= this.T.c; i4++)
      {
        d1 = d(i4);
        a(i4, this.T.a, this.m, this.T.c, this.n);
        this.C.l += (float)(d1 * this.G[1]);
      }
      for (i4 = i1; i4 <= i2; i4++) {
        com.aspose.cells.b.a.a.zf.a(this.z.c, Integer.valueOf(i4));
      }
      zgr localzgr = new zgr(this.C.e, this.C.f, this.C.g, this.C.h);
      a(localzgr, true);
      this.C.a(c(paramArrayOfzq[0]));
      this.C.a(this.y.m, d(paramArrayOfzq[0]));
      this.C.b(c(paramArrayOfzq[0]));
      this.C.c(c(paramArrayOfzq[0]));
      this.C.M = 0;
      return localzb;
    }
    return localzb;
  }
  
  public zb b(zq[] paramArrayOfzq)
    throws Exception
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    zb localzb = new zb();
    this.C.c = localzb;
    this.D = 0.0F;
    this.E = 0.0F;
    this.C.k = 0.0F;
    this.C.l = 0.0F;
    paramArrayOfzq[0].c(0.0F);
    paramArrayOfzq[0].d(0.0F);
    if ((this.k >= 0) && (this.l >= 0))
    {
      if (this.k >= this.T.a) {
        return localzb;
      }
      double d1 = this.k;
      double d2 = this.l;
      if (this.T.a <= this.l)
      {
        d1 = this.k;
        d2 = this.T.a - 1;
      }
      f1 += (float)(c(this.T.b, this.T.d) * this.G[0]);
      if (d1 >= 0) {
        f2 += (float)(b(d1, d2) * this.G[1]);
      }
      paramArrayOfzq[0].a(0.0F);
      paramArrayOfzq[0].b(0.0F);
      paramArrayOfzq[0].c(f1);
      paramArrayOfzq[0].d(f2);
      this.C.e = Math.min(this.k, this.T.a);
      this.C.f = this.T.b;
      this.C.g = Math.max(this.l, this.T.c);
      this.C.h = this.T.d;
      this.C.A = this.b.getCells();
      this.C.d();
      this.C.c();
      this.C.e();
      this.C.g();
      this.C.k = (this.E = paramArrayOfzq[0].f());
      this.C.l = (this.D = paramArrayOfzq[0].g());
      this.C.G = this.G;
      this.C.M = 2;
      if (this.O.h().getPrintGridlines()) {
        this.C.a(this.E, this.D, this.d.m, c(paramArrayOfzq[0]), this.y.getGridlineType());
      }
      if (d1 - 1 >= 0)
      {
        d3 = d(d1 - 1);
        this.C.l -= (float)(d3 * this.G[1]);
        a(d1 - 1, this.k, this.T.b, this.l, this.T.d, 2);
        this.C.l = paramArrayOfzq[0].g();
      }
      for (double d3 = d1; d3 <= d2; d3++)
      {
        double d4 = d(d3);
        com.aspose.cells.b.a.a.zf.a(this.z.d, Integer.valueOf(d3));
        a(d3, this.k, this.T.b, this.l, this.T.d);
        this.C.l += (float)(d4 * this.G[1]);
      }
      a(d2 + 1, this.k, this.T.b, this.l, this.T.d, 1);
      zgr localzgr = new zgr(this.C.e, this.C.f, this.C.g, this.C.h);
      a(localzgr, true);
      this.C.a(c(paramArrayOfzq[0]));
      this.C.a(this.y.m, d(paramArrayOfzq[0]));
      this.C.b(c(paramArrayOfzq[0]));
      this.C.c(c(paramArrayOfzq[0]));
      this.C.M = 0;
      return localzb;
    }
    return localzb;
  }
  
  public com.aspose.cells.a.d.zat e()
  {
    com.aspose.cells.a.d.zat localzat = new com.aspose.cells.a.d.zat(this.d.m, this.b.getDisplayRightToLeft(), new com.aspose.cells.b.a.b.zo(this.d.m.f(), this.d.m.g()));
    return localzat;
  }
  
  public com.aspose.cells.a.d.zat a(zq paramzq)
  {
    com.aspose.cells.a.d.zat localzat = e();
    localzat.c = 4;
    return localzat;
  }
  
  public com.aspose.cells.a.d.zat b(zq paramzq)
  {
    return new com.aspose.cells.a.d.zat(paramzq, this.b.getDisplayRightToLeft(), 2, new com.aspose.cells.b.a.b.zo(this.d.m.f(), this.d.m.g()));
  }
  
  private void a(zj paramzj, zm paramzm)
    throws Exception
  {
    zcc.b(paramzj, paramzm);
  }
  
  private String a(zgw paramzgw, Font paramFont)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Font substitution: Font [ ");
    localStringBuilder.append(paramFont.getName());
    int i1 = paramFont.p();
    if ((i1 & 0x3) == 0)
    {
      localStringBuilder.append("; Regular");
    }
    else
    {
      if ((i1 & 0x1) == 1) {
        localStringBuilder.append("; Bold");
      }
      if ((i1 & 0x2) == 2) {
        localStringBuilder.append("; Italic");
      }
    }
    localStringBuilder.append(" ] has been substituted");
    Cell localCell = paramzgw.h();
    if (localCell != null)
    {
      localStringBuilder.append(" in Cell [ ");
      localStringBuilder.append(localCell.getName());
      localStringBuilder.append(" ]");
    }
    localStringBuilder.append(" in Sheet [ ");
    localStringBuilder.append(this.b.getName());
    localStringBuilder.append(" ].");
    return com.aspose.cells.b.a.zs.a(localStringBuilder);
  }
  
  private void a(Cell paramCell1, int paramInt1, int paramInt2, int paramInt3, Cell paramCell2)
  {
    int i1 = -1;
    if (paramCell1 != null)
    {
      i1 = Cell.a(this.O, paramInt1, paramCell1.c);
      this.ab.a(i1, this.O);
      if (paramCell2 != null) {
        this.ab.e = paramCell2;
      }
      paramCell1.a(this.ab, true, this.X);
    }
    else
    {
      i1 = Cell.a(this.O, paramInt1, paramInt3);
      this.ab.a(i1, this.O);
      Cell.a(this.b, paramInt2, new zgs(paramInt3), this.ab, true, this.X);
    }
  }
  
  private void a(zb paramzb, zbje paramzbje, zq paramzq)
  {
    if (paramzbje.l().getHyperlink() != null) {
      if ((this.o != null) && (this.o.containsKey(paramzbje.l().getHyperlink())))
      {
        Cell localCell = (Cell)this.o.get(paramzbje.l().getHyperlink());
        this.r.put(paramzbje, localCell);
        zk localzk = new zk(paramzq, "#shape_" + paramzbje.hashCode());
        this.p.put(paramzbje, localzk);
        this.C.c.a(localzk);
      }
      else
      {
        paramzb.a(new zk(paramzq, zw.a(paramzbje.l().getHyperlink().getAddress(), "\\", "/")));
      }
    }
  }
  
  private double d(int paramInt)
  {
    return zavt.a(this.O, paramInt);
  }
  
  private int e(int paramInt)
  {
    return zavt.b(this.O, paramInt);
  }
  
  private double b(int paramInt1, int paramInt2)
  {
    return zavt.a(this.O, paramInt1, paramInt2);
  }
  
  private double f(int paramInt)
  {
    return zavt.c(this.O, paramInt);
  }
  
  private double c(int paramInt1, int paramInt2)
  {
    return zavt.c(this.O, paramInt1, paramInt2);
  }
  
  private int g(int paramInt)
  {
    return zavt.d(this.O, paramInt);
  }
  
  private int d(int paramInt1, int paramInt2)
  {
    return zavt.d(this.O, paramInt1, paramInt2);
  }
  
  private com.aspose.cells.a.d.zp c(zq paramzq)
  {
    return new com.aspose.cells.a.d.zp(new zq(paramzq.f() - 0.5F, paramzq.g() - 0.5F, (float)Math.ceil(Math.min(paramzq.h(), this.d.j) + 1.0D), (float)Math.ceil(paramzq.i() + 1.0F)));
  }
  
  private com.aspose.cells.a.d.zp d(zq paramzq)
  {
    float f1 = zavs.a(5) * (float)this.G[1];
    return new com.aspose.cells.a.d.zp(new zq(paramzq.f() - 0.5F, paramzq.g() - 0.5F * f1, (float)Math.ceil(Math.min(paramzq.h(), this.d.j) + 1.0D), (float)Math.ceil(paramzq.i() + f1)));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */