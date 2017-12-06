package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;
import java.util.HashMap;

class zchu
{
  private Workbook b;
  private WorksheetCollection c;
  zcbw a;
  private zchd d;
  private ArrayList e;
  private ArrayList f;
  private ArrayList g;
  private ArrayList h;
  private ArrayList i;
  private ArrayList j;
  private int k;
  private int l;
  private byte[] m;
  private zqh n;
  
  zchu(zchd paramzchd)
  {
    this.d = paramzchd;
    this.b = paramzchd.a;
    this.c = this.b.getWorksheets();
    this.e = new ArrayList();
    this.f = new ArrayList();
    this.j = new ArrayList();
    this.h = new ArrayList();
    this.i = new ArrayList();
    this.g = new ArrayList();
    this.n = paramzchd.b;
  }
  
  void a(zcbw paramzcbw)
    throws Exception
  {
    this.a = paramzcbw;
    g();
    this.a.b(0);
    ArrayList localArrayList = null;
    boolean bool = false;
    for (;;)
    {
      this.k = this.a.a();
      switch (this.k)
      {
      case 279: 
        this.a.a(1L);
        a();
        return;
      case 44: 
        f();
        break;
      case 43: 
        e();
        break;
      case 45: 
        d();
        break;
      case 46: 
        c();
        break;
      case 626: 
        this.l = this.a.b();
        this.a.a(this.l);
        localArrayList = this.h;
        bool = false;
        break;
      case 617: 
        this.l = this.a.b();
        this.a.a(this.l);
        localArrayList = this.i;
        bool = true;
        break;
      case 47: 
        a(localArrayList, bool);
        break;
      case 48: 
        b();
        break;
      case 507: 
        this.m = paramzcbw.d();
        zcdi localzcdi = a(this.m, 0, this.c);
        this.c.getDxfs().b(localzcdi.b);
        break;
      case 508: 
        i();
        break;
      case 510: 
        j();
        break;
      default: 
        this.l = this.a.b();
        this.a.a(this.l);
      }
    }
  }
  
  void a()
  {
    this.n.b(new HashMap());
    for (int i1 = 0; i1 < this.e.size(); i1++)
    {
      localObject1 = (Font)this.e.get(i1);
      this.c.a((Font)localObject1);
      this.n.c().put(Integer.valueOf(i1), Integer.valueOf(((Font)localObject1).m()));
    }
    zbzv localzbzv = (zbzv)this.c.C();
    Object localObject1 = new HashMap(this.h.size());
    zcek localzcek;
    Object localObject2;
    for (int i2 = 0; i2 < this.h.size(); i2++)
    {
      localzcek = (zcek)this.h.get(i2);
      Style localStyle = new Style(this.c);
      localStyle.a((byte)0);
      a(localzcek, localStyle, false);
      localStyle.a(false);
      localStyle.a(-1);
      localObject2 = a(i2);
      String str = null;
      if (i2 == 0)
      {
        str = "Normal";
      }
      else if (localObject2 != null)
      {
        str = ((zoz)localObject2).a;
        if (str.equals("Default")) {
          str = "Normal";
        }
      }
      if (str != null)
      {
        localStyle.a(str);
        if (str.equals("Normal"))
        {
          localStyle.a((byte)-4);
          localzbzv.a(0, localStyle);
          ((HashMap)localObject1).put(Integer.valueOf(i2), Integer.valueOf(0));
        }
        else
        {
          ((HashMap)localObject1).put(Integer.valueOf(i2), Integer.valueOf(localzbzv.d(localStyle)));
        }
      }
      else
      {
        ((HashMap)localObject1).put(Integer.valueOf(i2), Integer.valueOf(this.c.a(localStyle)));
      }
    }
    this.d.b.d = new HashMap(this.i.size());
    for (i2 = 0; i2 < this.i.size(); i2++)
    {
      localzcek = (zcek)this.i.get(i2);
      int i3 = 0;
      if (localzcek.q > 0) {
        i3 = ((Integer)((HashMap)localObject1).get(Integer.valueOf(localzcek.q))).intValue();
      }
      localObject2 = new Style(this.c);
      ((Style)localObject2).a((byte)0);
      ((Style)localObject2).a(true);
      ((Style)localObject2).a(i3);
      a(localzcek, (Style)localObject2, true);
      if (i2 == 0)
      {
        localzbzv.a(15, (Style)localObject2);
        this.c.b((Style)localObject2);
        ((Style)localObject2).c = 0;
        ((Style)localObject2).a(0);
        this.d.b.d.put(Integer.valueOf(0), Integer.valueOf(15));
      }
      else
      {
        int i4 = localzbzv.c((Style)localObject2);
        this.d.b.d.put(Integer.valueOf(i2), Integer.valueOf(i4));
      }
    }
    h();
  }
  
  private void h()
  {
    WorksheetCollection localWorksheetCollection = this.b.getWorksheets();
    localWorksheetCollection.V();
    int i1 = ((localWorksheetCollection.U() * 8 + zlp.a) / 8 + 1) * 8;
    double d1 = (i1 - zlp.a) / localWorksheetCollection.U();
    for (int i2 = 0; i2 < localWorksheetCollection.getCount(); i2++)
    {
      Cells localCells = localWorksheetCollection.get(i2).getCells();
      localCells.getColumns().d = d1;
    }
  }
  
  void a(zcek paramzcek, Style paramStyle, boolean paramBoolean)
  {
    if ((paramBoolean) || (paramzcek.x))
    {
      if (paramzcek.g > 0) {
        paramStyle.setIndentLevel(paramzcek.g);
      }
      paramStyle.setHorizontalAlignment(paramzcek.c);
      paramStyle.setVerticalAlignment(paramzcek.d);
      paramStyle.setRotationAngle(paramzcek.e);
      paramStyle.setTextWrapped(paramzcek.f);
      paramStyle.setShrinkToFit(paramzcek.h);
      paramStyle.setTextDirection(paramzcek.s);
    }
    paramStyle.e(paramzcek.x);
    Object localObject;
    if ((paramBoolean) || (paramzcek.w))
    {
      localObject = (zcem)this.g.get(paramzcek.p);
      if (((zcem)localObject).b != null) {
        a(paramStyle.getBorders().getByBorderType(1), ((zcem)localObject).b);
      }
      if (((zcem)localObject).d != null) {
        a(paramStyle.getBorders().getByBorderType(2), ((zcem)localObject).d);
      }
      if (((zcem)localObject).a != null) {
        a(paramStyle.getBorders().getByBorderType(4), ((zcem)localObject).a);
      }
      if (((zcem)localObject).c != null) {
        a(paramStyle.getBorders().getByBorderType(8), ((zcem)localObject).c);
      }
      if (((zcem)localObject).e != null)
      {
        if (((zcem)localObject).f) {
          a(paramStyle.getBorders().getByBorderType(16), ((zcem)localObject).e);
        }
        if (((zcem)localObject).g) {
          a(paramStyle.getBorders().getByBorderType(32), ((zcem)localObject).e);
        }
      }
    }
    paramStyle.f(paramzcek.w);
    if ((paramBoolean) || (paramzcek.v))
    {
      localObject = (zcen)this.f.get(paramzcek.o);
      if (((zcen)localObject).d != null)
      {
        zoy.a(((zcen)localObject).d, paramStyle);
      }
      else
      {
        paramStyle.setPattern(((zcen)localObject).c);
        paramStyle.b.f(((zcen)localObject).a);
        paramStyle.a.f(((zcen)localObject).b);
      }
    }
    paramStyle.g(paramzcek.v);
    if ((paramBoolean) || (paramzcek.u)) {
      paramStyle.getFont().a((Font)this.e.get(paramzcek.n), null);
    }
    paramStyle.d(paramzcek.u);
    if ((paramBoolean) || (paramzcek.t))
    {
      paramStyle.b(this.b.getWorksheets().g(paramzcek.m));
      paramStyle.f(paramzcek.m);
    }
    paramStyle.c(paramzcek.t);
    if ((paramBoolean) || (paramzcek.y))
    {
      paramStyle.setFormulaHidden(paramzcek.j);
      paramStyle.setLocked(paramzcek.i);
    }
    paramStyle.h(paramzcek.y);
  }
  
  private void a(Border paramBorder, zcel paramzcel)
  {
    paramBorder.a.f(paramzcel.a);
    paramBorder.setLineStyle(paramzcel.b);
  }
  
  private void i()
    throws Exception
  {
    TableStyleCollection localTableStyleCollection = this.c.getTableStyles();
    this.m = this.d.a(this.a);
    int i1 = 4;
    localTableStyleCollection.a(zcgj.d(this.m, i1));
    if (localTableStyleCollection.a() != null) {
      i1 += 4 + localTableStyleCollection.a().length() * 2;
    } else {
      i1 += 4;
    }
    localTableStyleCollection.b(zcgj.d(this.m, i1));
  }
  
  private void j()
    throws Exception
  {
    this.m = this.d.a(this.a);
    TableStyle localTableStyle = null;
    String str = zcgj.d(this.m, 6);
    int i1 = this.c.getTableStyles().c(str);
    localTableStyle = this.c.getTableStyles().get(i1);
    localTableStyle.a((this.m[0] & 0xFF & 0x2) == 1);
    localTableStyle.b((this.m[0] & 0xFF & 0x4) == 1);
    for (;;)
    {
      this.k = this.a.a();
      switch (this.k)
      {
      case 511: 
        this.a.a(1L);
        return;
      case 512: 
        a(localTableStyle);
        break;
      default: 
        this.l = this.a.b();
        this.a.a(this.l);
      }
    }
  }
  
  private void a(TableStyle paramTableStyle)
  {
    this.m = this.d.a(this.a);
    if (paramTableStyle.getTableStyleElements() == null) {
      paramTableStyle.a(new TableStyleElementCollection(paramTableStyle));
    }
    int i1 = zc.a(this.m, 0);
    int i2 = zc.a(this.m, 4);
    int i3 = zc.a(this.m, 8);
    try
    {
      TableStyleElement localTableStyleElement = new TableStyleElement(paramTableStyle.getTableStyleElements(), zcij.F(i1));
      localTableStyleElement.setSize(i2);
      localTableStyleElement.a = i3;
      paramTableStyle.getTableStyleElements().a(localTableStyleElement);
    }
    catch (Exception localException) {}
  }
  
  static zcdi a(byte[] paramArrayOfByte, int paramInt, WorksheetCollection paramWorksheetCollection)
    throws Exception
  {
    zcdi localzcdi = new zcdi(paramWorksheetCollection);
    int i1 = 0;
    int i2 = 0;
    localzcdi.a = ((paramArrayOfByte[(paramInt + 1)] & 0xFF & 0x80) != 0);
    paramInt += 4;
    int i3 = zc.b(paramArrayOfByte, paramInt);
    paramInt += 2;
    Border localBorder = null;
    int i6 = 0;
    zoy localzoy = new zoy();
    ArrayList localArrayList1 = new ArrayList(4);
    ArrayList localArrayList2 = new ArrayList(4);
    int i9;
    for (int i7 = 0; i7 < i3; i7++)
    {
      int i4 = zc.b(paramArrayOfByte, paramInt);
      int i5 = zc.b(paramArrayOfByte, paramInt + 2);
      boolean[] arrayOfBoolean1;
      switch (i4)
      {
      case 0: 
        localzcdi.b.setPattern(zcij.p(paramArrayOfByte[(paramInt + 4)] & 0xFF));
        break;
      case 1: 
        arrayOfBoolean1 = new boolean[] { i6 };
        localzcdi.b.b = b(paramArrayOfByte, paramInt + 4, arrayOfBoolean1);
        i6 = arrayOfBoolean1[0];
        localzcdi.b.b(34);
        break;
      case 2: 
        arrayOfBoolean1 = new boolean[] { i6 };
        localzcdi.b.a = b(paramArrayOfByte, paramInt + 4, arrayOfBoolean1);
        i6 = arrayOfBoolean1[0];
        localzcdi.b.b(35);
        break;
      case 3: 
        int i8 = zc.a(paramArrayOfByte, paramInt + 4);
        if (i8 == 0) {
          localzoy.e = "linear";
        } else if (i8 == 1) {
          localzoy.e = "path";
        }
        localzoy.f = ((int)zc.f(paramArrayOfByte, paramInt + 8));
        localzoy.a = zc.f(paramArrayOfByte, paramInt + 16);
        localzoy.b = zc.f(paramArrayOfByte, paramInt + 24);
        localzoy.c = zc.f(paramArrayOfByte, paramInt + 32);
        localzoy.d = zc.f(paramArrayOfByte, paramInt + 40);
        localzcdi.b.b(35);
        break;
      case 4: 
        double d1 = zc.f(paramArrayOfByte, paramInt + 6);
        boolean[] arrayOfBoolean3 = { i6 };
        zaml localzaml = b(paramArrayOfByte, paramInt + 14, arrayOfBoolean3);
        i6 = arrayOfBoolean3[0];
        zf.a(localArrayList1, Double.valueOf(d1));
        zf.a(localArrayList2, localzaml);
        break;
      case 5: 
        boolean[] arrayOfBoolean2 = { i6 };
        localzcdi.a().a(b(paramArrayOfByte, paramInt + 4, arrayOfBoolean2));
        i6 = arrayOfBoolean2[0];
        localzcdi.b.b(16);
        break;
      case 6: 
        a(localzcdi.b.getBorders().getByBorderType(4), paramArrayOfByte, paramInt + 4);
        break;
      case 7: 
        a(localzcdi.b.getBorders().getByBorderType(8), paramArrayOfByte, paramInt + 4);
        break;
      case 8: 
        a(localzcdi.b.getBorders().getByBorderType(1), paramArrayOfByte, paramInt + 4);
        break;
      case 9: 
        a(localzcdi.b.getBorders().getByBorderType(2), paramArrayOfByte, paramInt + 4);
        break;
      case 10: 
        if (i1 != 0)
        {
          localBorder = localzcdi.b.getBorders().getByBorderType(32);
          a(localBorder, paramArrayOfByte, paramInt + 4);
        }
        else if (i2 != 0)
        {
          a(localzcdi.b.getBorders().getByBorderType(16), paramArrayOfByte, paramInt + 4);
        }
        break;
      case 11: 
        a(localzcdi.b.getBorders().getByBorderType(64), paramArrayOfByte, paramInt + 4);
        break;
      case 12: 
        a(localzcdi.b.getBorders().getByBorderType(128), paramArrayOfByte, paramInt + 4);
        break;
      case 13: 
        i1 = paramArrayOfByte[(paramInt + 4)] == 1 ? 1 : 0;
        break;
      case 14: 
        i2 = paramArrayOfByte[(paramInt + 4)] == 1 ? 1 : 0;
        break;
      case 15: 
        localzcdi.b.setHorizontalAlignment(zcij.g(paramArrayOfByte[(paramInt + 4)] & 0xFF));
        break;
      case 16: 
        localzcdi.b.setVerticalAlignment(zcij.e(paramArrayOfByte[(paramInt + 4)] & 0xFF));
        break;
      case 17: 
        localzcdi.b.setRotationAngle(paramArrayOfByte[(paramInt + 4)]);
        break;
      case 18: 
        localzcdi.b.setIndentLevel(zc.b(paramArrayOfByte, paramInt + 4));
        break;
      case 19: 
        switch (paramArrayOfByte[(paramInt + 4)])
        {
        case 1: 
          localzcdi.b.setTextDirection(1);
          break;
        case 2: 
          localzcdi.b.setTextDirection(2);
          break;
        default: 
          localzcdi.b.setTextDirection(0);
        }
        break;
      case 20: 
        localzcdi.b.setTextWrapped(paramArrayOfByte[(paramInt + 4)] != 0);
        break;
      case 22: 
        localzcdi.b.setShrinkToFit(paramArrayOfByte[(paramInt + 4)] != 0);
        break;
      case 24: 
        localzcdi.a().a(zcgj.e(paramArrayOfByte, paramInt + 4), true, 0);
        break;
      case 25: 
        localzcdi.a().b(zc.b(paramArrayOfByte, paramInt + 4));
        break;
      case 26: 
        localzcdi.a().setUnderline(zcij.c(zc.b(paramArrayOfByte, paramInt + 4)));
        break;
      case 27: 
        switch (paramArrayOfByte[(paramInt + 4)])
        {
        case 1: 
          localzcdi.a().setSuperscript(true);
          break;
        case 2: 
          localzcdi.a().setSubscript(true);
        }
        break;
      case 28: 
        localzcdi.a().setItalic(paramArrayOfByte[(paramInt + 4)] != 0);
        break;
      case 29: 
        localzcdi.a().setStrikeout(paramArrayOfByte[(paramInt + 4)] != 0);
        break;
      case 34: 
        localzcdi.a().setCharset(paramArrayOfByte[(paramInt + 4)]);
        break;
      case 35: 
        localzcdi.a().a(paramArrayOfByte[(paramInt + 4)]);
        break;
      case 36: 
        localzcdi.a().c(zc.b(paramArrayOfByte, paramInt + 4));
        break;
      case 37: 
        localzcdi.a().a(zcij.d(paramArrayOfByte[(paramInt + 4)]));
        break;
      case 38: 
        i9 = paramInt + 4;
        localzcdi.b.b(zcgj.e(paramArrayOfByte, i9));
        break;
      case 41: 
        localzcdi.b.f(zc.b(paramArrayOfByte, paramInt + 4));
        break;
      case 43: 
        localzcdi.b.setFormulaHidden(paramArrayOfByte[(paramInt + 4)] != 0);
        break;
      case 44: 
        localzcdi.b.setLocked(paramArrayOfByte[(paramInt + 4)] != 0);
      }
      paramInt += i5;
    }
    i7 = localArrayList1.size();
    if (i7 != 0)
    {
      localzoy.g = new double[i7];
      localzoy.h = new zaml[i7];
      for (i9 = 0; i9 < i7; i9++)
      {
        localzoy.g[i9] = ((Double)localArrayList1.get(i9)).doubleValue();
        localzoy.h[i9] = ((zaml)localArrayList2.get(i9));
      }
      zoy.a(localzoy, localzcdi.b);
    }
    return localzcdi;
  }
  
  void a(ArrayList paramArrayList, boolean paramBoolean)
  {
    zcek localzcek = new zcek();
    zf.a(paramArrayList, localzcek);
    this.m = this.d.a(this.a);
    localzcek.q = zc.b(this.m, 0);
    int i1 = 2;
    localzcek.m = zc.b(this.m, i1);
    i1 += 2;
    localzcek.n = zc.b(this.m, i1);
    i1 += 2;
    localzcek.o = zc.b(this.m, i1);
    i1 += 2;
    localzcek.p = zc.b(this.m, i1);
    i1 += 2;
    localzcek.e = (this.m[(i1++)] & 0xFF);
    if (localzcek.e > 90) {
      localzcek.e = (90 - localzcek.e);
    }
    localzcek.g = (this.m[(i1++)] & 0xFF);
    int i2 = (byte)(this.m[i1] & 0xFF & 0x7);
    localzcek.c = zcij.g(i2 & 0xFF);
    i2 = (byte)((this.m[i1] & 0xFF & 0x38) >> 3);
    localzcek.d = zcij.e(i2 & 0xFF);
    localzcek.f = ((this.m[i1] & 0xFF & 0x40) != 0);
    i1++;
    localzcek.h = ((this.m[i1] & 0xFF & 0x1) != 0);
    i2 = (byte)((this.m[i1] & 0xFF & 0xC0) >> 2);
    switch (i2)
    {
    case 1: 
      localzcek.s = 1;
      break;
    case 2: 
      localzcek.s = 2;
      break;
    default: 
      localzcek.s = 0;
    }
    localzcek.i = ((this.m[i1] & 0xFF & 0x10) != 0);
    localzcek.j = ((this.m[i1] & 0xFF & 0x20) != 0);
    localzcek.k = ((this.m[i1] & 0xFF & 0x40) != 0);
    localzcek.l = ((this.m[i1] & 0xFF & 0x80) != 0);
    i1++;
    if (paramBoolean)
    {
      localzcek.t = ((this.m[i1] & 0xFF & 0x1) != 0);
      localzcek.u = ((this.m[i1] & 0xFF & 0x2) != 0);
      localzcek.x = ((this.m[i1] & 0xFF & 0x4) != 0);
      localzcek.w = ((this.m[i1] & 0xFF & 0x8) != 0);
      localzcek.v = ((this.m[i1] & 0xFF & 0x10) != 0);
      localzcek.y = ((this.m[i1] & 0xFF & 0x20) != 0);
    }
    else
    {
      localzcek.t = ((this.m[i1] & 0xFF & 0x1) == 0);
      localzcek.u = ((this.m[i1] & 0xFF & 0x2) == 0);
      localzcek.x = ((this.m[i1] & 0xFF & 0x4) == 0);
      localzcek.w = ((this.m[i1] & 0xFF & 0x8) == 0);
      localzcek.v = ((this.m[i1] & 0xFF & 0x10) == 0);
      localzcek.y = ((this.m[i1] & 0xFF & 0x20) == 0);
    }
  }
  
  zoz a(int paramInt)
  {
    for (int i1 = 0; i1 < this.j.size(); i1++)
    {
      zoz localzoz = (zoz)this.j.get(i1);
      if (localzoz.b == paramInt) {
        return localzoz;
      }
    }
    return null;
  }
  
  void b()
    throws Exception
  {
    zoz localzoz = new zoz();
    zf.a(this.j, localzoz);
    this.m = this.d.a(this.a);
    localzoz.b = zc.a(this.m, 0);
    if ((this.m[4] & 0xFF & 0x1) != 0) {
      localzoz.a = zcij.a(this.m[6] & 0xFF, this.m[7] & 0xFF);
    }
    if ((localzoz.a == null) || ("".equals(localzoz.a))) {
      localzoz.a = zcgj.d(this.m, 8);
    }
  }
  
  void c()
  {
    this.m = this.d.a(this.a);
    zcem localzcem = new zcem();
    localzcem.f = ((this.m[0] & 0xFF & 0x1) != 0);
    localzcem.g = ((this.m[0] & 0xFF & 0x2) != 0);
    int i1 = 1;
    localzcem.a = a(this.m, i1);
    i1 += 10;
    localzcem.c = a(this.m, i1);
    i1 += 10;
    localzcem.b = a(this.m, i1);
    i1 += 10;
    localzcem.d = a(this.m, i1);
    i1 += 10;
    if ((localzcem.g) || (localzcem.f))
    {
      localzcem.e = a(this.m, i1);
      i1 += 10;
    }
    zf.a(this.g, localzcem);
  }
  
  zcel a(byte[] paramArrayOfByte, int paramInt)
  {
    zcel localzcel = new zcel();
    localzcel.b = zcij.m(this.m[paramInt] & 0xFF);
    paramInt += 2;
    int i1 = 0;
    boolean[] arrayOfBoolean = { i1 };
    localzcel.a = a(paramArrayOfByte, paramInt, arrayOfBoolean);
    i1 = arrayOfBoolean[0];
    return localzcel;
  }
  
  void d()
  {
    this.m = this.d.a(this.a);
    zcen localzcen = new zcen();
    zf.a(this.f, localzcen);
    localzcen.c = zcij.p(this.m[0] & 0xFF);
    int i1 = 0;
    Object localObject = { i1 };
    localzcen.a = a(this.m, 4, (boolean[])localObject);
    i1 = localObject[0];
    localObject = new boolean[] { i1 };
    localzcen.b = a(this.m, 12, (boolean[])localObject);
    i1 = localObject[0];
    if (this.m[0] == 40)
    {
      localObject = new zoy();
      int i2 = 20;
      int i3 = zc.a(this.m, i2);
      if (i3 == 0) {
        ((zoy)localObject).e = "linear";
      } else if (i3 == 1) {
        ((zoy)localObject).e = "path";
      }
      i2 += 4;
      ((zoy)localObject).f = ((int)zc.f(this.m, i2));
      i2 += 8;
      ((zoy)localObject).a = zc.f(this.m, i2);
      i2 += 8;
      ((zoy)localObject).b = zc.f(this.m, i2);
      i2 += 8;
      ((zoy)localObject).c = zc.f(this.m, i2);
      i2 += 8;
      ((zoy)localObject).d = zc.f(this.m, i2);
      i2 += 8;
      int i4 = zc.a(this.m, i2);
      ((zoy)localObject).h = new zaml[i4];
      ((zoy)localObject).g = new double[i4];
      i2 += 4;
      for (int i5 = 0; i5 < i4; i5++)
      {
        boolean[] arrayOfBoolean = { i1 };
        zaml localzaml = b(this.m, i2, arrayOfBoolean);
        i1 = arrayOfBoolean[0];
        i2 += 8;
        double d1 = zc.f(this.m, i2);
        i2 += 8;
        ((zoy)localObject).h[i5] = localzaml;
        ((zoy)localObject).g[i5] = d1;
      }
      localzcen.d = ((zoy)localObject);
    }
  }
  
  void e()
    throws Exception
  {
    this.m = this.d.a(this.a);
    Font localFont = new Font(this.c, null, false);
    zf.a(this.e, localFont);
    int i1 = 0;
    localFont.c(zc.b(this.m, i1));
    i1 += 2;
    localFont.setItalic((this.m[i1] & 0xFF & 0x2) != 0);
    localFont.setStrikeout((this.m[i1] & 0xFF & 0x8) != 0);
    i1 += 2;
    localFont.b(zc.b(this.m, i1));
    i1 += 2;
    switch (this.m[i1])
    {
    case 1: 
      localFont.setSuperscript(true);
      break;
    case 2: 
      localFont.setSubscript(true);
      break;
    }
    i1 += 2;
    localFont.setUnderline(zcij.c(this.m[i1] & 0xFF));
    i1++;
    localFont.a(this.m[(i1++)]);
    localFont.setCharset(this.m[(i1++)]);
    i1++;
    int i2 = 0;
    boolean[] arrayOfBoolean = { i2 };
    localFont.a(a(this.m, i1, arrayOfBoolean));
    i2 = arrayOfBoolean[0];
    i1 += 8;
    int i3 = zcij.c(this.m[i1]);
    i1++;
    int[] arrayOfInt = { i1 };
    localFont.a(zcgj.a(this.m, arrayOfInt), true, i3);
    i1 = arrayOfInt[0];
  }
  
  void f()
    throws Exception
  {
    this.m = this.d.a(this.a);
    int i1 = zc.e(this.m, 0);
    int i2 = 2;
    int[] arrayOfInt = { i2 };
    String str = zcgj.a(this.m, arrayOfInt);
    i2 = arrayOfInt[0];
    zzw localzzw = new zzw();
    localzzw.a(str, i1);
    if ((this.c.x() & 0xFFFF) < (i1 & 0xFFFF)) {
      this.c.d(i1);
    }
    zf.a(this.c.B(), localzzw);
  }
  
  void g()
  {
    int i1 = 0;
    int i2 = 0;
    for (;;)
    {
      this.k = this.a.a();
      switch (this.k)
      {
      case 279: 
      case 474: 
        this.a.a(1L);
        return;
      case 475: 
        this.m = this.d.a(this.a);
        i2 = zc.a(this.m, 0);
        if (i1 < 8)
        {
          i1++;
        }
        else
        {
          this.b.changePalette(Color.fromArgb(this.m[3] & 0xFF, this.m[0] & 0xFF, this.m[1] & 0xFF, this.m[2] & 0xFF), i1 - 8);
          i1++;
        }
        break;
      default: 
        this.l = this.a.b();
        this.a.a(this.l);
      }
    }
  }
  
  static zaml a(byte[] paramArrayOfByte, int paramInt, boolean[] paramArrayOfBoolean)
  {
    paramArrayOfBoolean[0] = false;
    zaml localzaml = new zaml(false);
    localzaml.a(zc.b(paramArrayOfByte, paramInt + 2) / 32767.0D);
    int i1 = (paramArrayOfByte[paramInt] & 0xFF & 0xFE) >> 1;
    switch (i1)
    {
    case 0: 
      localzaml.b(true);
      break;
    case 1: 
      if ((paramArrayOfByte[(paramInt + 1)] & 0xFF) >= 64) {
        localzaml.b(true);
      } else {
        localzaml.a(3, paramArrayOfByte[(paramInt + 1)] & 0xFF);
      }
      break;
    case 3: 
      if ((paramArrayOfByte[(paramInt + 1)] & 0xFF) >= 64) {
        localzaml.b(true);
      } else {
        localzaml.a(4, paramArrayOfByte[(paramInt + 1)] & 0xFF);
      }
      break;
    case 2: 
      paramInt += 4;
      localzaml.a(2, ((paramArrayOfByte[paramInt] & 0xFF) << 16) + ((paramArrayOfByte[(paramInt + 1)] & 0xFF) << 8) + (paramArrayOfByte[(paramInt + 2)] & 0xFF));
      break;
    default: 
      localzaml.b(true);
      paramArrayOfBoolean[0] = true;
    }
    return localzaml;
  }
  
  static void a(Border paramBorder, byte[] paramArrayOfByte, int paramInt)
  {
    int i1 = 0;
    boolean[] arrayOfBoolean = { i1 };
    paramBorder.a = b(paramArrayOfByte, paramInt, arrayOfBoolean);
    i1 = arrayOfBoolean[0];
    paramInt += 8;
    paramBorder.setLineStyle(zcij.m(paramArrayOfByte[paramInt] & 0xFF));
  }
  
  static zaml b(byte[] paramArrayOfByte, int paramInt, boolean[] paramArrayOfBoolean)
  {
    paramArrayOfBoolean[0] = false;
    zaml localzaml = new zaml(false);
    localzaml.a(zc.b(paramArrayOfByte, paramInt + 2) / 32767.0D);
    int i1 = (paramArrayOfByte[paramInt] & 0xFF) >> 1;
    switch (i1)
    {
    case 0: 
      localzaml.b(true);
      break;
    case 1: 
      if ((paramArrayOfByte[(paramInt + 1)] & 0xFF) >= 64) {
        localzaml.b(true);
      } else {
        localzaml.a(3, paramArrayOfByte[(paramInt + 1)] & 0xFF);
      }
      break;
    case 2: 
      paramInt += 4;
      localzaml.a(2, ((paramArrayOfByte[paramInt] & 0xFF) << 16) + ((paramArrayOfByte[(paramInt + 1)] & 0xFF) << 8) + (paramArrayOfByte[(paramInt + 2)] & 0xFF));
      break;
    case 3: 
      if ((paramArrayOfByte[(paramInt + 1)] & 0xFF) >= 64) {
        localzaml.b(true);
      } else {
        localzaml.a(4, paramArrayOfByte[(paramInt + 1)] & 0xFF);
      }
      break;
    case 4: 
      paramArrayOfBoolean[0] = true;
      break;
    default: 
      localzaml.b(true);
    }
    return localzaml;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zchu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */