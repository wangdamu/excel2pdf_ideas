package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zg;
import com.aspose.cells.b.a.zj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class zasb
  implements zj
{
  Workbook a;
  ArrayList b;
  ArrayList c;
  zauf d;
  ArrayList e;
  ArrayList f;
  ArrayList g;
  int[] h;
  HashMap i;
  private String[] p;
  HashMap j;
  ArrayList k;
  private zaso q;
  String l;
  String m;
  boolean n;
  OdsSaveOptions o;
  
  public void dispose()
  {
    this.o = null;
    this.f = null;
    this.c = null;
    this.q = null;
    this.g = null;
    this.j = null;
    this.b = null;
    this.l = null;
    this.i = null;
    this.k = null;
    this.e = null;
    this.d = null;
    this.h = null;
    this.a = null;
    this.p = null;
    zg.a(this);
  }
  
  zasb(Workbook paramWorkbook, OdsSaveOptions paramOdsSaveOptions)
  {
    this.a = paramWorkbook;
    this.o = paramOdsSaveOptions;
    this.b = new ArrayList();
    this.f = new ArrayList();
    this.d = new zauf();
    this.e = new ArrayList();
    this.f = new ArrayList();
    this.g = new ArrayList();
    this.c = new ArrayList();
    this.i = new HashMap();
    this.p = new String[this.a.getWorksheets().getCount()];
    this.j = new HashMap();
    this.k = new ArrayList();
    this.q = new zaso(this.a.getWorksheets());
    if (((this.o instanceof OdsSaveOptions)) && (this.o.isStrictSchema11()))
    {
      this.m = "1.1";
      this.l = "oooc:";
      this.n = false;
    }
    else
    {
      this.m = "1.2";
      this.l = "of:";
      this.n = true;
    }
  }
  
  public String a(Cell paramCell)
  {
    byte[] arrayOfByte = paramCell.v();
    if (arrayOfByte == null) {
      return paramCell.h().j();
    }
    if (this.a.getWorksheets().y().a((byte)1, arrayOfByte))
    {
      int i1 = 0;
      int i2 = 0;
      int[] arrayOfInt1 = { i1 };
      int[] arrayOfInt2 = { i2 };
      this.a.getWorksheets().y().a(arrayOfByte, arrayOfInt1, arrayOfInt2);
      i1 = arrayOfInt1[0];
      i2 = arrayOfInt2[0];
      Cell localCell = paramCell.d.get(i1, i2);
      if (localCell.F() != null) {
        return this.q.a(-1, -1, localCell.F().c(), paramCell.getRow(), paramCell.getColumn(), !localCell.F().b());
      }
      return null;
    }
    return this.q.a(-1, arrayOfByte, paramCell.getRow(), paramCell.getColumn(), false);
  }
  
  void a()
  {
    for (int i1 = 0; i1 < this.p.length; i1++) {
      this.a.getWorksheets().get(i1).b(this.p[i1]);
    }
    Set localSet = this.j.keySet();
    Iterator localIterator = localSet.iterator();
    while (localIterator.hasNext())
    {
      int i2 = ((Integer)localIterator.next()).intValue();
      this.a.getWorksheets().getNames().get(i2).g((String)this.j.get(Integer.valueOf(i2)));
    }
  }
  
  void b()
  {
    Object[] arrayOfObject = zasp.a(this.a, this.o);
    for (int i1 = 0; i1 < this.a.getWorksheets().getCount(); i1++)
    {
      Worksheet localWorksheet = this.a.getWorksheets().get(i1);
      this.p[i1] = localWorksheet.getName();
      zasc localzasc = new zasc(this, localWorksheet);
      localzasc.a(this);
      zf.a(this.g, localzasc);
    }
    c();
    a((ArrayList)arrayOfObject[2]);
    b((ArrayList)arrayOfObject[0]);
    a((zajm)arrayOfObject[1]);
  }
  
  private void c()
  {
    NameCollection localNameCollection = this.a.getWorksheets().getNames();
    for (int i1 = 0; i1 < localNameCollection.getCount(); i1++)
    {
      Name localName = localNameCollection.get(i1);
      if (localName.getSheetIndex() != 0)
      {
        this.j.put(Integer.valueOf(i1), localName.getText());
        localName.g(localName.getText() + "_" + localName.getSheetIndex());
      }
    }
  }
  
  private void a(int paramInt)
  {
    zasj localzasj = new zasj();
    zf.a(this.e, localzasj);
    localzasj.a = ("N" + paramInt);
    localzasj.d = 1;
    zasy localzasy = new zasy(4, null);
    zf.a(localzasj.f, localzasy);
    zf.a(localzasy.b, new String[] { "min-integer-digits", "1" });
  }
  
  void a(ArrayList paramArrayList)
  {
    a(0);
    for (int i2 = 0; i2 < paramArrayList.size(); i2++)
    {
      zasx localzasx = (zasx)paramArrayList.get(i2);
      int i1 = localzasx.a;
      String str1 = localzasx.b;
      if ((zasp.e(str1)) && (i1 > 0)) {
        str1 = this.a.getSettings().f().d(i1);
      }
      Object localObject;
      if (!zasp.e(str1))
      {
        if (str1.indexOf("General") != -1)
        {
          a(i1);
        }
        else
        {
          localObject = zasp.l(str1);
          zasj localzasj;
          if (localObject.length > 1)
          {
            localzasj = null;
            for (int i3 = 0; i3 < localObject.length; i3++)
            {
              String str2 = "N" + i1 + "P" + i3;
              localzasj = new zasj();
              localzasj.a(str2, i1, localObject[i3]);
              if (i3 != localObject.length - 1) {
                zf.a(localzasj.e, new String[] { "style:volatile", "true" });
              }
              zf.a(this.e, localzasj);
            }
            localzasj.b(localObject.length);
          }
          else
          {
            localzasj = new zasj();
            localzasj.a("N" + i1, i1, str1);
            zf.a(this.e, localzasj);
          }
        }
      }
      else if (i1 > 0)
      {
        localObject = new zasj();
        ((zasj)localObject).a(i1);
        zf.a(this.e, localObject);
      }
    }
  }
  
  void b(ArrayList paramArrayList)
  {
    for (int i1 = 0; i1 < paramArrayList.size(); i1++)
    {
      Font localFont = (Font)paramArrayList.get(i1);
      int i2 = 0;
      for (int i3 = 0; i3 < this.b.size(); i3++)
      {
        zase localzase = (zase)this.b.get(i3);
        if (localzase.a(localFont))
        {
          i2 = 1;
          break;
        }
      }
      if (i2 == 0) {
        zf.a(this.b, new zase(localFont));
      }
    }
  }
  
  void a(zajm paramzajm)
  {
    HashMap localHashMap = new HashMap();
    Object localObject1;
    for (int i1 = this.e.size() - 1; i1 >= 0; i1--)
    {
      localObject1 = (zasj)this.e.get(i1);
      if (((zasj)localObject1).h)
      {
        int i2 = ((zasj)localObject1).c;
        i1--;
        while (i1 >= 0)
        {
          zasj localzasj = (zasj)this.e.get(i1);
          if (localzasj.c != i2)
          {
            i1++;
            break;
          }
          switch (localzasj.d)
          {
          case 2: 
          case 3: 
            switch (((zasj)localObject1).d)
            {
            case 5: 
            case 7: 
              localHashMap.put(Integer.valueOf(((zasj)localObject1).c), Integer.valueOf(1));
              break;
            default: 
              localHashMap.put(Integer.valueOf(((zasj)localObject1).c), Integer.valueOf(localzasj.d));
            }
            break;
          default: 
            localHashMap.put(Integer.valueOf(((zasj)localObject1).c), Integer.valueOf(localzasj.d));
          }
          i1--;
        }
      }
      else
      {
        localHashMap.put(Integer.valueOf(((zasj)localObject1).c), Integer.valueOf(((zasj)localObject1).d));
      }
    }
    this.h = new int[paramzajm.b()];
    for (i1 = 0; i1 < paramzajm.b(); i1++)
    {
      localObject1 = paramzajm.a(i1);
      zf.a(this.f, new zary((Style)localObject1, i1));
      Object localObject2 = localHashMap.get(Integer.valueOf(((Style)localObject1).r()));
      if (localObject2 == null) {
        this.h[i1] = 7;
      } else {
        this.h[i1] = ((Integer)localObject2).intValue();
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zasb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */