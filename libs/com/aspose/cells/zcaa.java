package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zd;
import com.aspose.cells.b.a.d.ze;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zcaa
{
  private Worksheet h;
  private Cells i;
  private zcac j;
  private boolean k;
  private zhx l;
  private zh m;
  private String n;
  int a = 0;
  int b = 0;
  int c = 0;
  int d = 0;
  zami e = new zami();
  zavw f;
  int g;
  
  zcaa(zcac paramzcac, int paramInt)
    throws Exception
  {
    this.j = paramzcac;
    this.h = paramzcac.a.f.getWorksheets().get(paramInt);
    this.i = this.h.getCells();
    this.k = false;
    int i1 = -1;
    Object localObject1;
    if (paramzcac.d != null)
    {
      localObject1 = paramzcac.d.a(this.h);
      if (localObject1 != null)
      {
        this.k = true;
        this.l = ((zhx)localObject1);
        Object localObject2;
        Object localObject3;
        if (paramzcac.e != null)
        {
          this.n = (paramzcac.e + "_Cells" + paramInt + ".dat");
          localObject2 = zd.a(this.n);
          localObject3 = new zrg((zm)localObject2);
          a((zrg)localObject3, (zahd)localObject1);
          i1 = (int)((zm)localObject2).h();
          ((zm)localObject2).a();
        }
        else
        {
          this.m = new zh(1024000);
          localObject2 = new zrg(this.m);
          a((zrg)localObject2, (zahd)localObject1);
          i1 = (int)this.m.h();
          if ((this.m.n() - i1) * 10 > i1)
          {
            localObject3 = new byte[i1];
            System.arraycopy(this.m.m(), 0, localObject3, 0, (int)this.m.h());
            this.m = new zh((byte[])localObject3, 0, localObject3.length, false, true);
          }
        }
      }
    }
    this.g = i1;
    if (!this.k)
    {
      localObject1 = this.i.e();
      if (((zv)localObject1).a() > 0)
      {
        int i2 = ((zv)localObject1).b(65535);
        if (i2 < 0) {
          i2 = ((zv)localObject1).a(-i2 - 1, true);
        }
        if (i2 > -1)
        {
          int i3 = ((zv)localObject1).a(i2);
          int i4 = ((zv)localObject1).c(0);
          if (i4 < i2)
          {
            i4 = ((zv)localObject1).a(i4);
            for (int i5 = i3 / 32 - i4 / 32; i5 > -1; i5--) {
              this.e.a(0);
            }
          }
          else
          {
            this.e.a(0);
          }
        }
      }
    }
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    if (this.k)
    {
      if (this.n != null)
      {
        ze localze = zd.b(this.n);
        zbrg.a(localze, paramzrg.a());
        localze.a();
        zd.d(this.n);
      }
      else if (this.m != null)
      {
        this.m.a(0L, 0);
        this.m.a(paramzrg.a());
      }
      return;
    }
    a(paramzrg, new zhy(this.h));
  }
  
  private void a(zrg paramzrg, zahd paramzahd)
    throws Exception
  {
    this.e.c();
    this.b = 0;
    this.d = 0;
    zt localzt = paramzahd.b();
    if (localzt == null)
    {
      this.a = 0;
      this.c = 0;
      return;
    }
    zh localzh1 = new zh(128000);
    zrg localzrg1 = new zrg(localzh1);
    zh localzh2 = new zh(640);
    zrg localzrg2 = new zrg(localzh2);
    int i1 = (int)paramzrg.b();
    this.a = -1;
    this.c = -1;
    int i2 = localzt.i();
    int i3 = i2 - i2 % 32 + 31;
    int i4 = -1;
    int i5 = 0;
    int i6 = 0;
    zbdx localzbdx1 = new zbdx();
    zami localzami1 = new zami();
    zami localzami2 = new zami();
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    for (;;)
    {
      this.h.d().i();
      zbdx localzbdx2 = localzt.a(localzbdx1, 15);
      int i9;
      int i8;
      if (localzbdx2.d())
      {
        i9 = localzt.j();
        i8 = 1;
      }
      else
      {
        i9 = 15;
        i8 = 0;
      }
      if (i9 >= 4095) {
        i9 = 15;
      }
      i2 = localzbdx2.a;
      while (i2 > i3)
      {
        a(localArrayList2, localzh1, localzh2, paramzrg, i1);
        i3 += 32;
      }
      if (i2 > 65535) {
        break;
      }
      i5 = 0;
      i6 = 0;
      zgs localzgs = paramzahd.c();
      if (localzgs != null)
      {
        i5 = localzgs.a;
        if ((i5 < this.c) || (this.c < 0)) {
          this.c = i5;
        }
        for (;;)
        {
          this.h.d().i();
          i4 = localzgs.a;
          if (i4 <= 255)
          {
            if ((i4 > i6) && (localzami1.a() > 0)) {
              a(localzrg1, localzami1, localzami2, i2, i6);
            }
            int i11;
            if (localzami1.a() > 0)
            {
              if (localzgs.c != 6) {
                a(localzrg1, localzami1, localzami2, i2, i6);
              }
            }
            else if (localzami2.a() > 0) {
              if (localzgs.c != 0) {
                a(localzrg1, localzami2, i2, i6);
              } else if (i4 - i6 > 3) {
                a(localzrg1, localzami2, i2, i6);
              } else if (i6 < i4) {
                for (int i10 = i6; i10 < i4; i10++) {
                  if (i8 != 0)
                  {
                    localzami2.a(i9);
                  }
                  else
                  {
                    i11 = this.i.c.a(i10);
                    localzami2.a(i11 < 0 ? 15 : i11);
                  }
                }
              }
            }
            int i7 = localzgs.b;
            if (i7 == -1) {
              if (i8 != 0)
              {
                i7 = i9;
              }
              else
              {
                i7 = this.i.c.a(i4);
                if (i7 < 0) {
                  i7 = 15;
                }
              }
            }
            if (i7 >= 4095) {
              i7 = 15;
            }
            Object localObject2;
            switch (localzgs.c)
            {
            case 6: 
              localzami1.a(((Integer)localzgs.d).intValue());
              localzami2.a(i7);
              break;
            case 1: 
              localzrg1.a((short)515);
              localzrg1.a((short)14);
              localzrg1.b(i2);
              localzrg1.a((short)i4);
              localzrg1.a((short)i7);
              localzrg1.a(zc.a(((Double)localzgs.d).doubleValue()));
              break;
            case 4: 
              localObject1 = (zbbj)localzgs.d;
              i11 = ((zbbj)localObject1).e;
              if (i11 < 0)
              {
                localObject2 = zct.c(((zbbj)localObject1).c);
                localzrg1.a((short)516);
                localzrg1.a((short)(9 + localObject2.length));
                localzrg1.b(i2);
                localzrg1.a((short)i4);
                localzrg1.a((short)i7);
                localzrg1.a((short)((zbbj)localObject1).c.length());
                localzrg1.a((byte)(((zbbj)localObject1).c.length() == localObject2.length ? 0 : 1));
                localzrg1.a((byte[])localObject2, localObject2.length);
              }
              else
              {
                localzrg1.a((short)253);
                localzrg1.a((short)10);
                localzrg1.b(i2);
                localzrg1.a((short)i4);
                localzrg1.a((short)i7);
                if ((localzgs.e) && (((zbbj)localObject1).g()))
                {
                  localObject2 = (zawb)localzgs.d;
                  if (this.f == null)
                  {
                    this.f = new zavw();
                    this.f.b = ((zawb)localObject2).b();
                    this.f.a = ((zawb)localObject2).c();
                  }
                  if (this.f.c.size() < 8192)
                  {
                    CellArea localCellArea = new CellArea();
                    localCellArea.StartRow = (localCellArea.EndRow = i2);
                    localCellArea.EndColumn = (localCellArea.StartColumn = localzgs.a);
                    zf.a(this.f.c, localCellArea);
                  }
                }
                localzrg1.a(i11);
              }
              break;
            case 2: 
              localzrg1.a((short)517);
              localzrg1.a((short)8);
              localzrg1.b(i2);
              localzrg1.a((short)i4);
              localzrg1.a((short)i7);
              localzrg1.a((byte)(((Boolean)localzgs.d).booleanValue() ? 1 : 0));
              localzrg1.a((byte)0);
              break;
            case 3: 
              localzrg1.a((short)517);
              localzrg1.a((short)8);
              localzrg1.b(i2);
              localzrg1.a((short)i4);
              localzrg1.a((short)i7);
              localzrg1.a(((Byte)localzgs.d).byteValue());
              localzrg1.a((byte)1);
              break;
            case 0: 
              localzami2.a(i7);
              break;
            case 5: 
              localObject1 = (zaai)localzgs.d;
              if (((zaai)localObject1).b != null)
              {
                zaby localzaby = new zaby(((zaai)localObject1).b);
                localzaby.a(i2, (byte)i4, i7, ((zaai)localObject1).c, ((zaai)localObject1).d, ((zaai)localObject1).b(this.i), this.h.d().getSettings().i);
                localzaby.a(localzrg1);
                if (((zaai)localObject1).a() != null)
                {
                  if (((zaai)localObject1).a().b())
                  {
                    localObject2 = new zbg();
                    ((zbg)localObject2).a(((zaai)localObject1).a());
                    ((zbg)localObject2).a(localzrg1);
                  }
                  else
                  {
                    localObject2 = new zbea();
                    ((zbea)localObject2).a(((zaai)localObject1).a());
                    ((zbea)localObject2).a(localzrg1);
                  }
                }
                else if (((zaai)localObject1).b() != null)
                {
                  localObject2 = new zbvm(((zaai)localObject1).b());
                  ((zbvm)localObject2).a(localzrg1);
                }
                if (((zaai)localObject1).c == 4)
                {
                  localObject2 = new zbsw((String)((zaai)localObject1).d);
                  ((zbsw)localObject2).a(localzrg1);
                }
              }
              break;
            }
            i6 = i4;
            i6++;
            localzgs = paramzahd.c();
            if (localzgs == null) {
              break;
            }
          }
        }
        if (localzami1.a() > 0) {
          a(localzrg1, localzami1, localzami2, i2, i6);
        } else if (localzami2.a() > 0) {
          a(localzrg1, localzami2, i2, i6);
        }
      }
      Object localObject1 = new zbdy();
      ((zbdy)localObject1).a(localzbdx2, i5, i6);
      if (localArrayList2.size() < 1)
      {
        zf.a(localArrayList2, Long.valueOf(paramzrg.b()));
        long l1 = localzh2.i();
        ((zbdy)localObject1).a(localzrg2);
        zf.a(localArrayList2, Long.valueOf(localzh2.i() - l1));
        zf.a(localArrayList2, Long.valueOf(0L));
      }
      else
      {
        ((zbdy)localObject1).a(localzrg2);
      }
      if (i6 > 0)
      {
        if (i6 > this.d) {
          this.d = i6;
        }
        if (this.a < 0) {
          this.a = i2;
        }
        this.b = i2;
        zf.a(localArrayList2, Long.valueOf(localzh1.i()));
      }
      localzt = paramzahd.b();
      if (localzt == null) {
        break;
      }
    }
    a(localArrayList2, localzh1, localzh2, paramzrg, i1);
    if (this.a < 0)
    {
      this.a = 0;
      this.c = 0;
    }
    else
    {
      this.b += 1;
    }
  }
  
  private void a(ArrayList paramArrayList, zh paramzh1, zh paramzh2, zrg paramzrg, int paramInt)
    throws Exception
  {
    if (paramArrayList.size() > 0)
    {
      paramArrayList.set(1, Long.valueOf((((Long)paramArrayList.get(1)).longValue() & 0xFFFFFFFF) - paramzh2.i()));
      if (paramzh1.h() < 1L) {
        zf.a(paramArrayList, 2, paramArrayList.size() - 2);
      } else {
        paramArrayList.remove(paramArrayList.size() - 1);
      }
      localObject = paramzrg.a();
      paramzh2.a((zm)localObject);
      paramzh2.a(0L);
      paramzh1.a((zm)localObject);
      paramzh1.a(0L);
    }
    this.e.a((int)paramzrg.b() - paramInt);
    Object localObject = new zol();
    ((zol)localObject).a(paramArrayList);
    ((zol)localObject).a(paramzrg);
    paramArrayList.clear();
  }
  
  private void a(zrg paramzrg, zami paramzami1, zami paramzami2, int paramInt1, int paramInt2)
    throws Exception
  {
    int i1 = paramzami1.a();
    paramInt2 -= i1;
    if (i1 == 1)
    {
      paramzrg.a((short)638);
      paramzrg.a((short)10);
      paramzrg.b(paramInt1);
      paramzrg.a((short)paramInt2);
      paramzrg.a((short)paramzami2.b(0));
      paramzrg.a(paramzami1.b(0));
    }
    else
    {
      paramzrg.a((short)189);
      paramzrg.a((short)(6 + 6 * i1));
      paramzrg.b(paramInt1);
      paramzrg.a((short)paramInt2);
      for (int i2 = 0; i2 < i1; i2++)
      {
        paramzrg.a((short)paramzami2.b(i2));
        paramzrg.a(paramzami1.b(i2));
        paramInt2++;
      }
      paramzrg.a((short)(paramInt2 - 1));
    }
    paramzami1.c();
    paramzami2.c();
  }
  
  private void a(zrg paramzrg, zami paramzami, int paramInt1, int paramInt2)
    throws Exception
  {
    int i1 = paramzami.a();
    paramInt2 -= i1;
    if (i1 == 1)
    {
      paramzrg.a((short)513);
      paramzrg.a((short)6);
      paramzrg.b(paramInt1);
      paramzrg.a((short)paramInt2);
      paramzrg.a((short)paramzami.b(0));
    }
    else
    {
      paramzrg.a((short)190);
      paramzrg.a((short)(6 + 2 * i1));
      paramzrg.b(paramInt1);
      paramzrg.a((short)paramInt2);
      for (int i2 = 0; i2 < i1; i2++)
      {
        paramzrg.a((short)paramzami.b(i2));
        paramInt2++;
      }
      paramzrg.a((short)(paramInt2 - 1));
    }
    paramzami.c();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */