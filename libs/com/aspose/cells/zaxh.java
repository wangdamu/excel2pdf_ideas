package com.aspose.cells;

import com.aspose.cells.a.c.zp;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zaxh
{
  private zcal a;
  private byte[] b = new byte[2];
  private zqj c;
  private int d;
  private byte[] e;
  private int f;
  private PivotTable g;
  private WorksheetCollection h;
  private Worksheet i;
  private PivotField j;
  private int k;
  private int l;
  private int m;
  private int n;
  private int o;
  private int p;
  
  void a(WorksheetCollection paramWorksheetCollection, Worksheet paramWorksheet, zcal paramzcal, zqj paramzqj)
    throws Exception
  {
    this.i = paramWorksheet;
    this.h = paramWorksheetCollection;
    this.c = paramzqj;
    this.a = paramzcal;
    this.g = new PivotTable(paramWorksheet.getPivotTables());
    this.g.s = true;
    paramWorksheet.getPivotTables().a(this.g);
    boolean bool1 = f();
    if (!bool1)
    {
      this.d = 176;
      e();
      return;
    }
    boolean bool2 = true;
    boolean bool3 = true;
    for (;;)
    {
      this.d = paramzqj.b(this.b);
      switch (this.d)
      {
      case 177: 
        j();
        break;
      case 180: 
        b(bool2);
        bool2 = false;
        break;
      case 182: 
        h();
        break;
      case 197: 
        i();
        break;
      case 181: 
        a(bool3);
        bool3 = false;
        break;
      case 241: 
        g();
        break;
      case 2050: 
        c();
        break;
      case 2064: 
        d();
        break;
      case 2148: 
        b();
      }
    }
    paramzqj.a(-2);
  }
  
  private void a()
    throws Exception
  {
    k();
    zbub localzbub = new zbub(this.g.ag);
    localzbub.a = ((byte)(this.e[0] & 0xFF & 0xF));
    int i1 = zc.e(this.e, 2) & 0xFFFF;
    this.d = this.c.b(this.b);
    if ((this.d & 0xFFFF) == 240)
    {
      k();
      zbur localzbur = new zbur();
      localzbub.c = localzbur;
      localzbur.a = this.e[0];
      localzbur.b = this.e[1];
      localzbur.c = zc.e(this.e, 2);
      int i3 = zc.e(this.e, 6) & 0xFFFF;
      if ((localzbur.j()) && (this.e.length == 12))
      {
        localzbur.f = this.e[8];
        localzbur.g = this.e[9];
        localzbur.h = this.e[10];
        localzbur.i = this.e[11];
      }
      for (int i4 = 0; i4 < i3; i4++)
      {
        this.d = this.c.b(this.b);
        if ((this.d & 0xFFFF) == 242)
        {
          k();
          zbtz localzbtz = new zbtz();
          zf.a(localzbur.e, localzbtz);
          localzbtz.a = zc.e(this.e, 0);
          localzbtz.b = zc.e(this.e, 2);
          localzbtz.a(zc.e(this.e, 4));
          int i5 = zc.e(this.e, 6) & 0xFFFF;
          if (i5 > 0)
          {
            this.d = this.c.b(this.b);
            if ((this.d & 0xFFFF) == 245)
            {
              k();
              int i6 = 0;
              for (int i7 = 0; (i7 < i5) && (i6 < this.e.length); i7++)
              {
                zf.a(localzbtz.c, Integer.valueOf(zc.e(this.e, i6) & 0xFFFF));
                i6 += 2;
              }
            }
            else
            {
              this.c.a(-2);
              return;
            }
          }
        }
        else
        {
          this.c.a(-2);
          return;
        }
      }
    }
    else
    {
      this.c.a(-2);
      return;
    }
    this.d = this.c.b(this.b);
    if ((this.d & 0xFFFF) == 244)
    {
      k();
      int i2 = 0;
      Style localStyle = new Style(this.h);
      if (this.e != null)
      {
        int[] arrayOfInt = { i2 };
        a(this.e, arrayOfInt, localStyle);
        i2 = arrayOfInt[0];
        localzbub.a(localStyle);
      }
    }
    else
    {
      this.c.a(-2);
      return;
    }
    this.g.ag.a(localzbub);
  }
  
  private void a(byte[] paramArrayOfByte, int[] paramArrayOfInt, Style paramStyle)
    throws Exception
  {
    int i1 = paramArrayOfInt[0];
    long l1 = zc.d(paramArrayOfByte, i1);
    i1 += 4;
    int i2 = zc.e(paramArrayOfByte, i1);
    int i3 = (paramArrayOfByte[i1] & 0xFF & 0x1) != 0 ? 1 : 0;
    i1 += 2;
    if ((l1 & 0xFFFFFFFF) == 0L) {
      return;
    }
    int i4;
    int i5;
    if ((l1 & 0xFFFFFFFF & 0x2000000) != 0L)
    {
      Object localObject;
      if (i3 == 0)
      {
        i4 = paramArrayOfByte[(i1 + 1)] & 0xFF;
        for (i5 = 0; i5 < this.h.B().size(); i5++)
        {
          localObject = (zzw)this.h.B().get(i5);
          if (((zzw)localObject).b() == i4)
          {
            if ((((zzw)localObject).a() == null) || ("".equals(((zzw)localObject).a()))) {
              break;
            }
            paramStyle.b(((zzw)localObject).a());
            break;
          }
        }
        paramStyle.setNumber(i4);
        if (paramStyle.getNumber() == 14) {
          paramStyle.b("0.00%");
        }
        i1 += 2;
      }
      else
      {
        i4 = zc.b(this.e, i1);
        i1 += 2;
        if (i4 > 0)
        {
          i5 = zc.b(this.e, i1);
          i1 += 2;
          if (i5 > 0)
          {
            localObject = new int[] { i1 };
            paramStyle.b(a((int[])localObject, i5));
            i1 = localObject[0];
          }
        }
      }
    }
    int i7;
    int i8;
    int i9;
    if ((l1 & 0xFFFFFFFF & 0x4000000) != 0L)
    {
      i4 = zc.a(paramArrayOfByte, i1 + 92) == 0 ? 1 : 0;
      i5 = zc.a(paramArrayOfByte, i1 + 96) == 0 ? 1 : 0;
      int i6 = zc.a(paramArrayOfByte, i1 + 100) == 0 ? 1 : 0;
      i7 = (paramArrayOfByte[(i1 + 88)] & 0xFF & 0x2) == 0 ? 1 : 0;
      i8 = (paramArrayOfByte[(i1 + 88)] & 0xFF & 0x80) == 0 ? 1 : 0;
      i9 = zc.a(paramArrayOfByte, i1 + 64);
      if (i9 != -1) {
        paramStyle.getFont().setSize((short)(i9 / 20));
      }
      if (i7 != 0) {
        paramStyle.getFont().setItalic((paramArrayOfByte[(i1 + 68)] & 0xFF & 0x2) != 0);
      }
      if (i6 != 0) {
        paramStyle.getFont().b(zc.e(paramArrayOfByte, i1 + 72) & 0xFFFF);
      }
      if (i8 != 0) {
        paramStyle.getFont().setStrikeout((paramArrayOfByte[(i1 + 68)] & 0xFF & 0x80) != 0);
      }
      if (i4 != 0)
      {
        int i10 = zc.b(paramArrayOfByte, i1 + 74);
        switch (i10)
        {
        case 1: 
          paramStyle.getFont().setSuperscript(true);
          break;
        case 2: 
          paramStyle.getFont().setSubscript(true);
        }
      }
      if (i5 != 0) {
        switch (paramArrayOfByte[(i1 + 76)])
        {
        case 0: 
          paramStyle.getFont().setUnderline(0);
          break;
        case 1: 
          paramStyle.getFont().setUnderline(1);
          break;
        case 2: 
          paramStyle.getFont().setUnderline(2);
          break;
        case 33: 
          paramStyle.getFont().setUnderline(3);
          break;
        case 34: 
          paramStyle.getFont().setUnderline(4);
        }
      }
      i9 = zc.a(paramArrayOfByte, i1 + 80);
      if (i9 != -1) {
        paramStyle.getFont().setColor(this.h.o().e(i9));
      }
      i1 += 118;
    }
    if ((l1 & 0xFFFFFFFF & 0x8000000) != 0L)
    {
      if ((l1 & 0xFFFFFFFF & 1L) == 0L) {
        paramStyle.setHorizontalAlignment(ztr.a(paramArrayOfByte[i1] & 0xFF & 0x7, false));
      }
      if ((l1 & 0xFFFFFFFF & 0x2) == 0L) {
        paramStyle.setVerticalAlignment(ztr.a((paramArrayOfByte[i1] & 0xFF & 0x70) >> 4, true));
      }
      if ((l1 & 0xFFFFFFFF & 0x4) == 0L) {
        paramStyle.setTextWrapped((paramArrayOfByte[i1] & 0xFF & 0x8) != 0);
      }
      if ((l1 & 0xFFFFFFFF & 0x8) == 0L) {
        paramStyle.setRotationAngle(paramArrayOfByte[(i1 + 1)]);
      }
      if (((l1 & 0xFFFFFFFF & 0x10) != 0L) || ((l1 & 0xFFFFFFFF & 0x20) == 0L))
      {
        i4 = paramArrayOfByte[(i1 + 2)] & 0xFF & 0xF;
        i5 = paramArrayOfByte[(i1 + 4)] & 0xFF;
        if (i5 != 255) {
          paramStyle.setIndentLevel(i5);
        } else {
          paramStyle.setIndentLevel(i4);
        }
      }
      if ((l1 & 0xFFFFFFFF & 0x40) == 0L) {
        paramStyle.setShrinkToFit((paramArrayOfByte[(i1 + 2)] & 0xFF & 0x10) != 0);
      }
      if (((l1 & 0xFFFFFFFF & 0x80) != 0L) || ((l1 & 0xFFFFFFFF & 0x80000000) == 0L)) {
        switch ((paramArrayOfByte[(i1 + 2)] & 0xFF & 0xC0) >> 6)
        {
        case 0: 
          paramStyle.setTextDirection(0);
          break;
        case 1: 
          paramStyle.setTextDirection(1);
          break;
        case 2: 
          paramStyle.setTextDirection(2);
        }
      }
      i1 += 8;
    }
    if ((l1 & 0xFFFFFFFF & 0x10000000) != 0L)
    {
      if ((i2 & 0xFFFF & 0x4) != 0) {
        paramStyle.getBorders().a = true;
      }
      i4 = zc.e(paramArrayOfByte, i1);
      long l2 = zc.e(paramArrayOfByte, i1 + 2) & 0xFFFF;
      i7 = 0;
      i8 = 0;
      i9 = 0;
      if ((l1 & 0xFFFFFFFF & 0x400) == 0L)
      {
        paramStyle.getBorders().getByBorderType(1).setLineStyle(i4 & 0xFFFF & 0xF);
        i7 = (int)(l2 & 0xFFFFFFFF & 0x3F);
        paramStyle.getBorders().getByBorderType(1).setColor(this.h.o().e(i7));
      }
      if ((l1 & 0xFFFFFFFF & 0x800) == 0L)
      {
        paramStyle.getBorders().getByBorderType(2).setLineStyle((i4 & 0xFFFF & 0xF0) >> 4);
        i7 = (int)((l2 & 0xFFFFFFFF & 0x3F8) >> 7);
        paramStyle.getBorders().getByBorderType(2).setColor(this.h.o().e(i7));
      }
      i8 = (l2 & 0xFFFFFFFF & 0x4000) != 0L ? 1 : 0;
      i9 = (l2 & 0xFFFFFFFF & 0x8000) != 0L ? 1 : 0;
      l2 = zc.d(paramArrayOfByte, i1 + 4);
      if ((l1 & 0xFFFFFFFF & 0x1000) == 0L)
      {
        paramStyle.getBorders().getByBorderType(4).setLineStyle((i4 & 0xFFFF & 0xF00) >> 8);
        i7 = (int)(l2 & 0xFFFFFFFF & 0x3F00);
        paramStyle.getBorders().getByBorderType(4).setColor(this.h.o().e(i7));
      }
      if ((l1 & 0xFFFFFFFF & 0x2000) == 0L)
      {
        paramStyle.getBorders().getByBorderType(8).setLineStyle((i4 & 0xFFFF & 0xF000) >> 12);
        i7 = (int)((l2 & 0xFFFFFFFF & 0x3F8) >> 7);
        paramStyle.getBorders().getByBorderType(8).setColor(this.h.o().e(i7));
      }
      if (((l1 & 0xFFFFFFFF & 0x4000) == 0L) && (i8 != 0))
      {
        paramStyle.getBorders().getByBorderType(16).setLineStyle((int)((l2 & 0xFFFFFFFF & 0x1E00000) >> 21));
        i7 = (int)((l2 & 0xFFFFFFFF & 0x1FC00) >> 14);
        paramStyle.getBorders().getByBorderType(16).setColor(this.h.o().e(i7));
      }
      if (((l1 & 0xFFFFFFFF & 0x8000) == 0L) && (i9 != 0))
      {
        paramStyle.getBorders().getByBorderType(32).setLineStyle((int)((l2 & 0xFFFFFFFF & 0x1E00000) >> 21));
        i7 = (int)((l2 & 0xFFFFFFFF & 0x1FC00) >> 14);
        paramStyle.getBorders().getByBorderType(32).setColor(this.h.o().e(i7));
      }
      i1 += 8;
    }
    if ((l1 & 0xFFFFFFFF & 0x20000000) != 0L)
    {
      if ((l1 & 0xFFFFFFFF & 0x10000) == 0L) {
        paramStyle.setPattern((paramArrayOfByte[(i1 + 1)] & 0xFF) >> 2);
      }
      i4 = 0;
      if ((l1 & 0xFFFFFFFF & 0x20000) == 0L)
      {
        i4 = paramArrayOfByte[(i1 + 2)] & 0xFF & 0x7F;
        paramStyle.setForegroundColor(this.h.o().e(i4));
      }
      if ((l1 & 0xFFFFFFFF & 0x40000) == 0L)
      {
        i4 = (zc.e(paramArrayOfByte, i1 + 2) & 0xFFFF & 0x3F80) >> 7;
        paramStyle.setBackgroundColor(this.h.o().e(i4));
      }
      i1 += 4;
    }
    if ((l1 & 0xFFFFFFFF & 0x40000000) != 0L)
    {
      if ((l1 & 0xFFFFFFFF & 0x100) == 0L) {
        paramStyle.setLocked((paramArrayOfByte[i1] & 0xFF & 0x1) != 0);
      }
      if ((l1 & 0xFFFFFFFF & 0x200) == 0L) {
        paramStyle.setFormulaHidden((paramArrayOfByte[i1] & 0xFF & 0x2) != 0);
      }
      i1 += 2;
    }
    paramArrayOfInt[0] = i1;
  }
  
  private void b()
    throws Exception
  {
    k();
    byte[] arrayOfByte = new byte[this.e.length - 4];
    System.arraycopy(this.e, 4, arrayOfByte, 0, arrayOfByte.length);
    this.g.ab.a(arrayOfByte);
    int i3;
    if (this.e[4] == 0)
    {
      if (this.e[5] == 30)
      {
        int i1 = 14;
        i3 = zc.b(this.e, i1);
        if (i3 > 0)
        {
          i1 += 2;
          int[] arrayOfInt1 = { i1 };
          this.g.setPivotTableStyleName(b(arrayOfInt1, i3));
          i1 = arrayOfInt1[0];
        }
      }
      else if (this.e[5] == 2)
      {
        if ((this.e[7] & 0xFF & 0x4) != 0) {
          this.g.setEnableFieldList(false);
        } else {
          this.g.setEnableFieldList(true);
        }
      }
    }
    else if (this.e[4] == 23)
    {
      PivotField localPivotField = null;
      if (this.e[5] == 0)
      {
        i3 = 12;
        int i4 = zc.b(this.e, i3);
        if (i4 > 0)
        {
          i3 += 2;
          int[] arrayOfInt2 = { i3 };
          String str = a(arrayOfInt2, i4);
          i3 = arrayOfInt2[0];
          localPivotField = this.g.getBaseFields().get(str);
        }
        this.d = this.c.b(this.b);
        switch (this.d)
        {
        case 2148: 
          k();
          arrayOfByte = new byte[this.e.length - 4];
          System.arraycopy(this.e, 4, arrayOfByte, 0, arrayOfByte.length);
          this.g.ab.a(arrayOfByte);
          if ((this.e[5] == 25) && (localPivotField != null))
          {
            if ((this.e[6] & 0xFF & 0x20) != 0) {
              localPivotField.setIncludeNewItemsInFilter(false);
            } else {
              localPivotField.setIncludeNewItemsInFilter(true);
            }
            if ((this.e[6] & 0xFF & 0x8) != 0) {
              localPivotField.setShowCompact(true);
            } else {
              localPivotField.setShowCompact(false);
            }
          }
          return;
        }
        this.c.a(-2);
        return;
      }
    }
    else if (this.e[4] == 29)
    {
      int i2 = 0;
      if (this.e[5] == 56)
      {
        i2 = 6;
        i3 = zc.a(this.e, i2);
        this.g.ak = this.g.getBaseFields().get(i3);
      }
      else if (this.e[5] == 60)
      {
        i2 = 20;
        i2 += 6;
        double d1 = zc.f(this.e, i2);
        if (this.g.ak != null) {
          this.g.ak.g = ((int)d1);
        }
      }
    }
  }
  
  private void c()
    throws Exception
  {
    k();
    zbut localzbut = new zbut();
    this.g.Z = localzbut;
    localzbut.b = new byte[14];
    System.arraycopy(this.e, 2, localzbut.b, 0, 14);
    int i1 = 16;
    int i2 = zc.b(this.e, i1);
    i1 += 2;
    int[] arrayOfInt = { i1 };
    localzbut.a = a(arrayOfInt, i2);
    i1 = arrayOfInt[0];
    localzbut.c = zc.e(this.e, i1);
  }
  
  private void d()
    throws Exception
  {
    k();
    zbva localzbva = this.g.e;
    localzbva.a = zc.a(this.e, 8);
    localzbva.b(zaxe.a(zc.e(this.e, 12)));
    int i1 = zc.b(this.e, 14);
    if (i1 > 0)
    {
      int i2 = 16;
      int[] arrayOfInt = { i2 };
      localzbva.b = a(arrayOfInt, i1);
      i2 = arrayOfInt[0];
    }
  }
  
  private void a(boolean paramBoolean)
    throws Exception
  {
    k();
    int i1 = 0;
    ArrayList localArrayList = null;
    int i2;
    if (paramBoolean)
    {
      i1 = this.k;
      this.g.g = (localArrayList = new ArrayList(i1));
      i2 = this.m;
    }
    else
    {
      i1 = this.l;
      this.g.h = (localArrayList = new ArrayList(i1));
      i2 = this.n;
    }
    int i3 = 0;
    int i4 = 4 + i2;
    int[] arrayOfInt = null;
    for (int i5 = 0; i5 < i1; i5++)
    {
      if (i3 + i4 * 2 > this.e.length)
      {
        arrayOfInt = new int[i4];
        zf.a(localArrayList, arrayOfInt);
        i6 = 0;
        while (i3 < this.e.length)
        {
          arrayOfInt[(i6++)] = zc.b(this.e, i3);
          i3 += 2;
        }
        this.d = this.c.b(this.b);
        if ((this.d & 0xFFFF) == 60)
        {
          k();
        }
        else
        {
          this.c.a(-2);
          return;
        }
        i3 = 0;
        while (i6 < i4)
        {
          arrayOfInt[i6] = zc.b(this.e, i3);
          i3 += 2;
          i6++;
        }
        if ((i3 == this.e.length) && ((this.c.b(this.b) & 0xFFFF) == 181))
        {
          this.c.a(-2);
          return;
        }
      }
      arrayOfInt = new int[i4];
      zf.a(localArrayList, arrayOfInt);
      for (int i6 = 0; i6 < arrayOfInt.length; i6++)
      {
        arrayOfInt[i6] = zc.b(this.e, i3);
        i3 += 2;
      }
    }
  }
  
  private void e()
    throws Exception
  {
    byte[] arrayOfByte = new byte[this.e.length + 4];
    System.arraycopy(zc.a(this.d), 0, arrayOfByte, 0, 2);
    System.arraycopy(zc.a((short)this.e.length), 0, arrayOfByte, 2, 2);
    System.arraycopy(this.e, 0, arrayOfByte, 4, this.e.length);
    ArrayList localArrayList = new ArrayList();
    zf.a(localArrayList, arrayOfByte);
    this.g.Y = localArrayList;
    for (;;)
    {
      this.d = this.c.b(this.b);
      switch (this.d)
      {
      case 10: 
      case 176: 
      case 574: 
        this.c.a(-2);
        return;
      }
      l();
      zf.a(localArrayList, this.e);
    }
  }
  
  private boolean f()
    throws Exception
  {
    k();
    int i1 = 0;
    int i2 = zc.e(this.e, 14) & 0xFFFF;
    if (this.h.W().getCount() > 0)
    {
      zawp localzawp = this.h.W().a(i2);
      switch (localzawp.a())
      {
      case 1: 
      case 4: 
        zawt localzawt1 = new zawt();
        localzawt1.b(localzawp, this.i, this.a);
        this.g.d = localzawp;
        break;
      default: 
        zawt localzawt2 = new zawt();
        localzawt2.a(localzawp, this.i, this.a);
        a(localzawp);
        i1 = 1;
      }
    }
    this.g.u = true;
    this.g.v = true;
    this.g.w = false;
    this.g.x = false;
    this.g.i = (zc.e(this.e, 0) & 0xFFFF);
    this.g.j = (zc.e(this.e, 2) & 0xFFFF);
    this.g.k = (this.e[4] & 0xFF);
    this.g.l = (this.e[6] & 0xFF);
    this.g.m = (zc.e(this.e, 8) & 0xFFFF);
    this.g.n = (zc.e(this.e, 10) & 0xFFFF);
    this.g.o = (this.e[12] & 0xFF);
    this.m = (zc.e(this.e, 24) & 0xFFFF);
    this.n = (zc.e(this.e, 26) & 0xFFFF);
    this.o = (zc.e(this.e, 28) & 0xFFFF);
    this.p = (zc.e(this.e, 30) & 0xFFFF);
    this.k = (zc.e(this.e, 32) & 0xFFFF);
    this.l = (zc.e(this.e, 34) & 0xFFFF);
    this.g.b.i = zc.e(this.e, 36);
    this.g.b.j = zc.b(this.e, 38);
    int i3 = zc.e(this.e, 40);
    int i4 = zc.e(this.e, 42);
    int i5 = 44;
    if (this.e[i5] == 0)
    {
      byte[] arrayOfByte = new byte[2 * (i3 & 0xFFFF)];
      for (int i6 = 0; i6 < (i3 & 0xFFFF); i6++) {
        arrayOfByte[(2 * i6)] = this.e[(i5 + 1 + i6)];
      }
      this.g.b.g = Encoding.getUnicode().a(arrayOfByte, 0, arrayOfByte.length);
      i5 += (i3 & 0xFFFF) + 1;
    }
    else
    {
      this.g.b.g = Encoding.getUnicode().a(this.e, i5 + 1, (i3 & 0xFFFF) * 2);
      i5 += (i3 & 0xFFFF) * 2 + 1;
    }
    if (this.e[i5] == 0)
    {
      this.g.b.h = Encoding.getASCII().a(this.e, i5 + 1, i4 & 0xFFFF);
      i5 += (i4 & 0xFFFF) + 1;
    }
    else
    {
      this.g.b.h = Encoding.getUnicode().a(this.e, i5 + 1, (i4 & 0xFFFF) * 2);
      i5 += (i4 & 0xFFFF) * 2 + 1;
    }
    if (this.p > 1)
    {
      this.j = new PivotField();
      this.j.t = -2;
      this.j.l = this.g;
      this.j.b = this.g.getBaseFields();
      this.j.k = this.j;
      this.g.f = this.j;
    }
    return i1 == 0;
  }
  
  private void a(zawp paramzawp)
    throws Exception
  {
    zxf localzxf = this.a.c;
    zaoz localzaoz = localzxf.a().b("_SX_DB_CUR");
    if (localzaoz == null) {
      return;
    }
    String str = zp.c(paramzawp.b);
    zh localzh = localzaoz.a(str);
    if (localzh == null) {
      return;
    }
    localzaoz.g(str);
  }
  
  private String a(int[] paramArrayOfInt, int paramInt)
    throws Exception
  {
    String str = null;
    if (this.e[paramArrayOfInt[0]] == 0)
    {
      str = Encoding.getASCII().a(this.e, paramArrayOfInt[0] + 1, paramInt);
      paramArrayOfInt[0] += paramInt + 1;
    }
    else
    {
      str = Encoding.getUnicode().a(this.e, paramArrayOfInt[0] + 1, paramInt * 2);
      paramArrayOfInt[0] += paramInt * 2 + 1;
    }
    return str;
  }
  
  private String b(int[] paramArrayOfInt, int paramInt)
    throws Exception
  {
    String str = null;
    str = Encoding.getUnicode().a(this.e, paramArrayOfInt[0], paramInt * 2);
    paramArrayOfInt[0] += paramInt * 2;
    return str;
  }
  
  private void g()
    throws Exception
  {
    k();
    zbtt localzbtt = this.g.c;
    localzbtt.a = zc.b(this.e, 0);
    int i1 = zc.b(this.e, 2);
    int i2 = zc.b(this.e, 4);
    int i3 = zc.b(this.e, 6);
    localzbtt.e = zc.b(this.e, 8);
    localzbtt.f = zc.e(this.e, 14);
    localzbtt.g = zc.e(this.e, 16);
    int i4 = zc.b(this.e, 18);
    int i5 = zc.b(this.e, 20);
    int i6 = zc.b(this.e, 22);
    int i7 = 24;
    Object localObject;
    if (i1 != -1)
    {
      localObject = new int[] { i7 };
      localzbtt.b = a((int[])localObject, i1);
      i7 = localObject[0];
    }
    if (i2 != -1)
    {
      localObject = new int[] { i7 };
      localzbtt.c = a((int[])localObject, i2);
      i7 = localObject[0];
    }
    if (i3 != -1)
    {
      localObject = new int[] { i7 };
      localzbtt.d = a((int[])localObject, i3);
      i7 = localObject[0];
    }
    if (i4 != -1)
    {
      localObject = new int[] { i7 };
      localzbtt.h = a((int[])localObject, i4);
      i7 = localObject[0];
    }
    if (i5 != -1)
    {
      localObject = new int[] { i7 };
      localzbtt.i = a((int[])localObject, i5);
      i7 = localObject[0];
    }
    if (i6 != -1)
    {
      localObject = new int[] { i7 };
      localzbtt.j = a((int[])localObject, i6);
      i7 = localObject[0];
    }
    if (localzbtt.a + localzbtt.e != 0)
    {
      localObject = new ArrayList();
      localzbtt.l = ((ArrayList)localObject);
      for (;;)
      {
        this.d = this.c.b(this.b);
        switch (this.d)
        {
        case 10: 
        case 176: 
        case 574: 
        case 2050: 
          this.c.a(-2);
          return;
        case 251: 
          a();
          break;
        default: 
          l();
          zf.a((ArrayList)localObject, this.e);
        }
      }
    }
  }
  
  private void b(boolean paramBoolean)
    throws Exception
  {
    k();
    PivotFieldCollection localPivotFieldCollection = null;
    if (paramBoolean)
    {
      if (this.m != 0) {
        localPivotFieldCollection = this.g.getRowFields();
      } else {
        localPivotFieldCollection = this.g.getColumnFields();
      }
    }
    else {
      localPivotFieldCollection = this.g.getColumnFields();
    }
    for (int i1 = 0; i1 < this.e.length; i1 += 2)
    {
      int i2 = zc.b(this.e, i1);
      if (i2 < 0)
      {
        localPivotFieldCollection.a(this.j);
        this.j.m = localPivotFieldCollection.c;
      }
      else
      {
        PivotField localPivotField = this.g.getBaseFields().get(i2);
        localPivotFieldCollection.a(localPivotField);
      }
    }
  }
  
  private void h()
    throws Exception
  {
    k();
    for (int i1 = 0; i1 < this.e.length; i1 += 6)
    {
      PivotField localPivotField = this.g.getBaseFields().get(zc.e(this.e, i1) & 0xFFFF);
      this.g.getPageFields().a(localPivotField);
      localPivotField.j = new zbuo(localPivotField);
      localPivotField.j.b = zc.b(this.e, i1 + 2);
      int i2 = zc.e(this.e, i1 + 4) & 0xFFFF;
      this.i.getShapes().e(i2);
    }
  }
  
  private void i()
    throws Exception
  {
    k();
    PivotFieldCollection localPivotFieldCollection = this.g.getDataFields();
    PivotField localPivotField = new PivotField();
    localPivotField.b = localPivotFieldCollection;
    localPivotField.a(localPivotFieldCollection.getCount());
    localPivotFieldCollection.a(localPivotField);
    int i1 = zc.e(this.e, 0) & 0xFFFF;
    localPivotField.k = this.g.getBaseFields().get(i1);
    zbtq localzbtq = localPivotField.i = new zbtq();
    localzbtq.h = localPivotField;
    switch (this.e[2])
    {
    case 0: 
      localzbtq.a = 0;
      break;
    case 1: 
      localzbtq.a = 1;
      break;
    case 2: 
      localzbtq.a = 2;
      break;
    case 3: 
      localzbtq.a = 3;
      break;
    case 4: 
      localzbtq.a = 4;
      break;
    case 5: 
      localzbtq.a = 5;
      break;
    case 6: 
      localzbtq.a = 6;
      break;
    case 7: 
      localzbtq.a = 7;
      break;
    case 8: 
      localzbtq.a = 8;
      break;
    case 9: 
      localzbtq.a = 9;
      break;
    case 10: 
      localzbtq.a = 10;
    }
    localzbtq.b = (this.e[4] & 0xFF);
    localzbtq.c = zc.b(this.e, 6);
    localzbtq.d = zc.b(this.e, 8);
    localzbtq.e = zc.b(this.e, 10);
    localzbtq.f = this.h.g(localzbtq.e);
    int i2 = zc.e(this.e, 12);
    if (i2 != 65535) {
      localzbtq.g = zct.a(this.e, 12);
    }
    if (this.j != null)
    {
      PivotItem localPivotItem = new PivotItem(this.j.e);
      this.j.e.a(localPivotItem);
      localPivotItem.setIndex(localPivotField.c());
      localPivotItem.e = localPivotField;
    }
  }
  
  private void j()
    throws Exception
  {
    PivotField localPivotField = new PivotField(this.g.getBaseFields());
    localPivotField.l = this.g;
    localPivotField.t = this.g.getBaseFields().getCount();
    if ((this.g.d != null) && (this.g.d.i != null) && (localPivotField.t < this.g.d.i.size())) {
      localPivotField.h = ((zbtv)this.g.d.i.get(this.g.getBaseFields().getCount()));
    }
    this.g.getBaseFields().a(localPivotField);
    k();
    int i1 = zc.e(this.e, 2) & 0xFFFF;
    localPivotField.a((this.e[0] & 0xFF & 0x8) != 0);
    int i2 = this.e[0] & 0xFF & 0xF;
    if ((i2 & 0x1) != 0) {
      localPivotField.m = 1;
    } else if ((i2 & 0x2) != 0) {
      localPivotField.m = 2;
    } else if ((i2 & 0x4) != 0) {
      localPivotField.m = 4;
    } else if ((i2 & 0x8) != 0) {
      localPivotField.m = 8;
    }
    localPivotField.c.a = zc.e(this.e, 4);
    int i3 = zc.e(this.e, 6) & 0xFFFF;
    int i4 = zc.e(this.e, 8);
    if ((i4 & 0xFFFF) != 65535) {
      localPivotField.c.b = zct.a(this.e, 8);
    }
    for (int i5 = 0; i5 < i3; i5++)
    {
      this.d = this.c.b(this.b);
      if ((this.d & 0xFFFF) == 178)
      {
        k();
        if (this.e[0] == 0)
        {
          PivotItem localPivotItem = new PivotItem(localPivotField.getPivotItems());
          localPivotField.getPivotItems().a(localPivotItem);
          localPivotItem.c = zc.e(this.e, 2);
          localPivotItem.setIndex(zc.e(this.e, 4));
          if (localPivotItem.b()) {
            ((zbos)localPivotField.h.c.get(localPivotItem.getIndex())).b = true;
          }
          i4 = zc.e(this.e, 6);
          if ((i4 & 0xFFFF) != 65535) {
            localPivotItem.d = zct.a(this.e, 6);
          }
        }
        else if (this.e[0] != 1) {}
      }
      else
      {
        this.c.a(-2);
        break;
      }
    }
    this.d = this.c.b(this.b);
    if ((this.d & 0xFFFF) == 256)
    {
      k();
      zbuv localzbuv = localPivotField.d;
      localzbuv.a = zc.e(this.e, 0);
      localzbuv.b = this.e[2];
      localzbuv.c = this.e[3];
      localzbuv.h = zc.b(this.e, 4);
      localzbuv.i = zc.b(this.e, 6);
      localzbuv.d = zc.b(this.e, 8);
      localzbuv.e = this.h.g(localzbuv.d);
      if (this.e.length > 10)
      {
        int i6 = zc.b(this.e, 10);
        if (i6 != -1) {
          if (i6 + 21 <= this.e.length)
          {
            byte[] arrayOfByte = new byte[2 * i6];
            for (int i7 = 0; i7 < i6; i7++) {
              arrayOfByte[(2 * i7)] = this.e[(21 + i7)];
            }
            localzbuv.g = Encoding.getUnicode().a(arrayOfByte, 0, arrayOfByte.length);
            if (localzbuv.g.charAt(0) == '?') {
              localzbuv.g = (localPivotField.c.b + localzbuv.g.substring(1));
            }
          }
          else
          {
            localzbuv.g = Encoding.getUnicode().a(this.e, 20, i6 * 2);
          }
        }
      }
    }
    else
    {
      this.c.a(-2);
    }
  }
  
  private void k()
    throws Exception
  {
    this.a.a(this.c);
    this.e = this.a.a();
    this.f = this.a.b();
  }
  
  private void l()
    throws Exception
  {
    this.a.a(this.c, this.d & 0xFFFF);
    this.e = this.a.a();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaxh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */