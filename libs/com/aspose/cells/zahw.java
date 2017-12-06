package com.aspose.cells;

import com.aspose.cells.a.d.zb;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

abstract class zahw
{
  zaie b;
  private ArrayList a;
  Worksheet c;
  zaca d;
  
  protected zahw(zaca paramzaca, zgs paramzgs, ArrayList paramArrayList)
  {
    this.d = paramzaca;
    this.c = paramzaca.c;
    if (paramzgs != null) {
      this.b = zabt.a(paramzgs.c, paramzgs.d);
    }
    this.a = paramArrayList;
  }
  
  private static zaie a(CellArea paramCellArea)
  {
    return new zabo(32, new zbap(null, paramCellArea));
  }
  
  private static zaie a(ArrayList paramArrayList)
  {
    if ((paramArrayList == null) || (paramArrayList.size() == 0)) {
      return zabg.a;
    }
    if (paramArrayList.size() == 1) {
      return a((CellArea)paramArrayList.get(0));
    }
    Object localObject = zabk.y();
    int i = paramArrayList.size() - 1;
    ((zabk)localObject).d(a((CellArea)paramArrayList.get(i--)));
    for (;;)
    {
      ((zabk)localObject).c(a((CellArea)paramArrayList.get(i--)));
      if (i < 0) {
        break;
      }
      zabk localzabk = zabk.y();
      localzabk.d((zaie)localObject);
      localObject = localzabk;
    }
    return (zaie)localObject;
  }
  
  zaca d()
  {
    if (this.d.p != null) {
      return this.d;
    }
    CalculationOptions localCalculationOptions = new CalculationOptions();
    localCalculationOptions.b = true;
    localCalculationOptions.m = false;
    zaca localzaca = new zaca(this.c, 3, localCalculationOptions);
    localzaca.a = 5;
    return localzaca;
  }
  
  void a(zaca paramzaca)
  {
    if (paramzaca != this.d) {
      paramzaca.c();
    }
  }
  
  public abstract ArrayList a(zq paramzq)
    throws Exception;
  
  public abstract zb a(zq paramzq, double[] paramArrayOfDouble, int paramInt1, int paramInt2)
    throws Exception;
  
  public abstract boolean c()
    throws Exception;
  
  protected void b(zaca paramzaca)
  {
    zgs localzgs = paramzaca.g.getRows().a.a(paramzaca.d, new zgs(paramzaca.e), 4);
    if (localzgs == null)
    {
      this.b = zabg.a;
      return;
    }
    this.b = zabt.a(localzgs.c, localzgs.d);
  }
  
  protected zabb a(ConditionalFormattingValue paramConditionalFormattingValue, zaca paramzaca)
  {
    Object localObject2;
    if (paramConditionalFormattingValue.getType() == 5)
    {
      zaag localzaag = new zaag(paramzaca, paramConditionalFormattingValue.f(), 0, -1);
      localObject2 = localzaag.a().a(paramzaca, 0);
      if (localObject2 != null)
      {
        zaie[] arrayOfzaie = { a(this.a), new zabb(((zabb)localObject2).o() / 100.0D) };
        zabe localzabe = new zabe(64, zacm.a(328), arrayOfzaie);
        localObject2 = localzabe.d(paramzaca).a(paramzaca, 0);
        if (localObject2 != null) {
          return (zabb)localObject2;
        }
      }
    }
    else if (paramConditionalFormattingValue.getType() == 4)
    {
      double d1 = 0.0D;
      double d2 = 0.0D;
      zaiw localzaiw = null;
      if (paramConditionalFormattingValue.a != -1.7976931348623157E308D)
      {
        d1 = paramConditionalFormattingValue.a;
      }
      else
      {
        localzaiw = a(this.a).a(paramzaca, false);
        localObject3 = new zbsc(false, true);
        zbam.a(localzaiw, (zaji)localObject3, paramzaca, true, true);
        d1 = ((zabb)((zaji)localObject3).a()).o();
        paramConditionalFormattingValue.a = d1;
      }
      if (paramConditionalFormattingValue.b != Double.MAX_VALUE)
      {
        d2 = paramConditionalFormattingValue.b;
      }
      else
      {
        if (localzaiw == null) {
          localzaiw = a(this.a).a(paramzaca, false);
        }
        localObject3 = new zbsd(false, true);
        zbam.a(localzaiw, (zaji)localObject3, paramzaca, true, true);
        d2 = ((zabb)((zaji)localObject3).a()).o();
        paramConditionalFormattingValue.b = d2;
      }
      Object localObject3 = new zaag(paramzaca, paramConditionalFormattingValue.f(), 0, -1);
      zabb localzabb = ((zaag)localObject3).a().a(paramzaca, 0);
      if (localzabb != null) {
        return new zabb((d1 - d2) * (localzabb.o() / 100.0D) + d2);
      }
    }
    else
    {
      Object localObject1;
      if ((paramConditionalFormattingValue.getType() == 1) || (paramConditionalFormattingValue.getType() == 6))
      {
        if (paramConditionalFormattingValue.a == -1.7976931348623157E308D)
        {
          localObject1 = a(this.a).a(paramzaca, false);
          localObject2 = new zbsc(false, true);
          zbam.a((zaiw)localObject1, (zaji)localObject2, paramzaca, true, true);
          paramConditionalFormattingValue.a = ((zabb)((zaji)localObject2).a()).o();
        }
        return new zabb(paramConditionalFormattingValue.a);
      }
      if ((paramConditionalFormattingValue.getType() == 2) || (paramConditionalFormattingValue.getType() == 7))
      {
        if (paramConditionalFormattingValue.b == Double.MAX_VALUE)
        {
          localObject1 = a(this.a).a(paramzaca, false);
          localObject2 = new zbsd(false, true);
          zbam.a((zaiw)localObject1, (zaji)localObject2, paramzaca, true, true);
          paramConditionalFormattingValue.b = ((zabb)((zaji)localObject2).a()).o();
        }
        return new zabb(paramConditionalFormattingValue.b);
      }
      if (paramConditionalFormattingValue.f() != null)
      {
        localObject1 = new zaag(paramzaca, paramConditionalFormattingValue.f(), 0, -1);
        localObject2 = ((zaag)localObject1).a().a(paramzaca, 0);
        if (localObject2 != null) {
          return (zabb)localObject2;
        }
      }
    }
    return zabb.a;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zahw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */