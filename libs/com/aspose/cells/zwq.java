package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.HashMap;

class zwq
  extends CollectionBase
{
  void a(int paramInt)
  {
    int i = 0;
    for (int j = 0; j < getCount(); j++)
    {
      zwp localzwp = (zwp)this.InnerList.get(j);
      if ((localzwp.a & 0xFFFF) == paramInt)
      {
        if (j - i > 1)
        {
          this.InnerList.remove(j);
          this.InnerList.add(i, localzwp);
        }
        i++;
      }
    }
  }
  
  void a(ArrayList paramArrayList)
  {
    for (int i = 0; i < getCount(); i++)
    {
      zwp localzwp = (zwp)this.InnerList.get(i);
      zf.a(paramArrayList, Integer.valueOf(localzwp.a));
      zf.a(paramArrayList, Integer.valueOf(localzwp.b));
      zf.a(paramArrayList, Integer.valueOf(localzwp.c));
    }
  }
  
  public zwp b(int paramInt)
  {
    if (paramInt >= this.InnerList.size()) {
      return null;
    }
    return (zwp)this.InnerList.get(paramInt);
  }
  
  void a(zwq paramzwq)
  {
    this.InnerList.clear();
    for (int i = 0; i < paramzwq.getCount(); i++)
    {
      zwp localzwp1 = paramzwq.b(i);
      zwp localzwp2 = new zwp(localzwp1.a & 0xFFFF, localzwp1.b & 0xFFFF, localzwp1.c & 0xFFFF);
      zf.a(this.InnerList, localzwp2);
    }
  }
  
  int a(int paramInt1, int paramInt2, int paramInt3)
  {
    for (int i = 0; i < getCount(); i++)
    {
      zwp localzwp2 = (zwp)this.InnerList.get(i);
      if ((localzwp2.a == paramInt1) && (localzwp2.b == paramInt2) && (localzwp2.c == paramInt3)) {
        return i;
      }
    }
    zwp localzwp1 = new zwp(paramInt1 & 0xFFFF, paramInt2 & 0xFFFF, paramInt3 & 0xFFFF);
    zf.a(this.InnerList, localzwp1);
    return this.InnerList.size() - 1;
  }
  
  int b(int paramInt1, int paramInt2, int paramInt3)
  {
    zwp localzwp = new zwp(paramInt1, paramInt2, paramInt3);
    zf.a(this.InnerList, localzwp);
    return getCount() - 1;
  }
  
  void a(int paramInt1, int paramInt2)
  {
    for (int i = 0; i < getCount(); i++)
    {
      zwp localzwp = (zwp)this.InnerList.get(i);
      if ((localzwp.a & 0xFFFF) == paramInt2) {
        if (((paramInt1 & 0xFFFF) >= (localzwp.b & 0xFFFF)) && ((paramInt1 & 0xFFFF) <= (localzwp.c & 0xFFFF)))
        {
          if (localzwp.b == localzwp.c)
          {
            localzwp.b = 65535;
            localzwp.c = 65535;
          }
          else
          {
            localzwp.c -= 1;
          }
        }
        else if (((paramInt1 & 0xFFFF) < (localzwp.b & 0xFFFF)) && ((paramInt1 & 0xFFFF) < (localzwp.c & 0xFFFF)) && ((localzwp.b & 0xFFFF) < 65534) && ((localzwp.c & 0xFFFF) < 65534))
        {
          localzwp.b -= 1;
          localzwp.c -= 1;
        }
      }
    }
  }
  
  void c(int paramInt1, int paramInt2, int paramInt3)
  {
    for (int i = 0; i < getCount(); i++)
    {
      zwp localzwp2 = (zwp)this.InnerList.get(i);
      if ((localzwp2.a & 0xFFFF) == paramInt1)
      {
        if (((localzwp2.b & 0xFFFF) < paramInt3) && ((localzwp2.b & 0xFFFF) >= paramInt2)) {
          localzwp2.b += 1;
        }
        if (((localzwp2.c & 0xFFFF) < paramInt3) && ((localzwp2.c & 0xFFFF) >= paramInt2)) {
          localzwp2.c += 1;
        }
      }
    }
    zwp localzwp1 = new zwp(paramInt1 & 0xFFFF, paramInt2 & 0xFFFF, paramInt2 & 0xFFFF);
    zf.a(this.InnerList, localzwp1);
  }
  
  void d(int paramInt1, int paramInt2, int paramInt3)
  {
    for (int i = 0; i < getCount(); i++)
    {
      zwp localzwp = (zwp)this.InnerList.get(i);
      if ((localzwp.a & 0xFFFF) == paramInt1) {
        if (paramInt2 == (localzwp.b & 0xFFFF))
        {
          if (paramInt2 == (localzwp.c & 0xFFFF))
          {
            localzwp.b = paramInt3;
            localzwp.c = paramInt3;
          }
          else if (paramInt3 >= (localzwp.c & 0xFFFF))
          {
            localzwp.c = ((localzwp.c & 0xFFFF) - 1);
          }
          else
          {
            localzwp.b = paramInt3;
          }
        }
        else if (paramInt2 < (localzwp.b & 0xFFFF))
        {
          if (paramInt3 >= (localzwp.b & 0xFFFF))
          {
            localzwp.b = ((localzwp.b & 0xFFFF) - 1);
            if (paramInt3 >= (localzwp.c & 0xFFFF)) {
              localzwp.c = ((localzwp.c & 0xFFFF) - 1);
            }
          }
        }
        else if (paramInt2 < (localzwp.c & 0xFFFF))
        {
          if (paramInt3 >= (localzwp.c & 0xFFFF)) {
            localzwp.c = ((localzwp.c & 0xFFFF) - 1);
          } else if (paramInt3 <= (localzwp.b & 0xFFFF)) {
            localzwp.b = ((localzwp.b & 0xFFFF) + 1);
          }
        }
        else if (paramInt2 == (localzwp.c & 0xFFFF))
        {
          if (paramInt3 <= (localzwp.b & 0xFFFF)) {
            localzwp.b = ((localzwp.b & 0xFFFF) + 1);
          } else {
            localzwp.c = paramInt3;
          }
        }
        else if (paramInt3 <= (localzwp.c & 0xFFFF))
        {
          localzwp.c = ((localzwp.c & 0xFFFF) + 1);
          if (paramInt3 <= (localzwp.b & 0xFFFF)) {
            localzwp.b = ((localzwp.b & 0xFFFF) + 1);
          }
        }
      }
    }
  }
  
  int e(int paramInt1, int paramInt2, int paramInt3)
  {
    for (int i = 0; i < getCount(); i++)
    {
      zwp localzwp2 = (zwp)this.InnerList.get(i);
      if (((localzwp2.a & 0xFFFF) == paramInt1) && (paramInt2 == (localzwp2.b & 0xFFFF)) && (paramInt3 == (localzwp2.c & 0xFFFF))) {
        return i;
      }
    }
    zwp localzwp1 = new zwp(paramInt1 & 0xFFFF, paramInt2 & 0xFFFF, paramInt3 & 0xFFFF);
    zf.a(this.InnerList, localzwp1);
    return getCount() - 1;
  }
  
  int b(int paramInt1, int paramInt2)
  {
    if (paramInt2 == -1) {
      paramInt2 = 65535;
    }
    for (int i = 0; i < getCount(); i++)
    {
      zwp localzwp2 = (zwp)this.InnerList.get(i);
      if (((localzwp2.a & 0xFFFF) == paramInt1) && (paramInt2 == (localzwp2.b & 0xFFFF)) && (paramInt2 == (localzwp2.c & 0xFFFF))) {
        return i;
      }
    }
    if (paramInt2 == 65535)
    {
      zwp localzwp1 = new zwp(paramInt1 & 0xFFFF, paramInt2 & 0xFFFF, paramInt2 & 0xFFFF);
      zf.a(this.InnerList, localzwp1);
      return getCount() - 1;
    }
    return -1;
  }
  
  int[] c(int paramInt1, int paramInt2)
  {
    if (paramInt2 == -1) {
      paramInt2 = 65535;
    }
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < getCount(); i++)
    {
      zwp localzwp = (zwp)this.InnerList.get(i);
      if (((localzwp.a & 0xFFFF) == paramInt1) && (paramInt2 == (localzwp.b & 0xFFFF)) && (paramInt2 == (localzwp.c & 0xFFFF))) {
        zf.a(localArrayList, Integer.valueOf(i));
      }
    }
    Object localObject;
    if (localArrayList.size() != 0)
    {
      localObject = new int[localArrayList.size()];
      for (int j = 0; j < localObject.length; j++) {
        localObject[j] = ((Integer)localArrayList.get(j)).intValue();
      }
      return (int[])localObject;
    }
    if (paramInt2 == 65535)
    {
      localObject = new zwp(paramInt1 & 0xFFFF, paramInt2 & 0xFFFF, paramInt2 & 0xFFFF);
      return new int[] { zf.a(this.InnerList, localObject) };
    }
    return new int[] { -1 };
  }
  
  int a(int paramInt, boolean paramBoolean)
  {
    for (int i = getCount() - 1; i > -1; i--)
    {
      zwp localzwp = (zwp)this.InnerList.get(i);
      if (((localzwp.a & 0xFFFF) == paramInt) && ((localzwp.b & 0xFFFF) == 65535) && ((localzwp.c & 0xFFFF) == 65535)) {
        return i;
      }
    }
    if (paramBoolean) {
      return zf.a(this.InnerList, new zwp(paramInt, 65535, 65535));
    }
    return -1;
  }
  
  int b(int paramInt, boolean paramBoolean)
  {
    for (int i = getCount() - 1; i > -1; i--)
    {
      zwp localzwp = (zwp)this.InnerList.get(i);
      if (((localzwp.a & 0xFFFF) == paramInt) && ((localzwp.b & 0xFFFF) == 65534) && ((localzwp.c & 0xFFFF) == 65534)) {
        return i;
      }
    }
    if (paramBoolean) {
      return zf.a(this.InnerList, new zwp(paramInt, 65534, 65534));
    }
    return -1;
  }
  
  int f(int paramInt1, int paramInt2, int paramInt3)
  {
    for (int i = 0; i < getCount(); i++)
    {
      zwp localzwp = (zwp)this.InnerList.get(i);
      if (((localzwp.a & 0xFFFF) == paramInt1) && (paramInt2 == (localzwp.b & 0xFFFF)) && (paramInt3 == (localzwp.c & 0xFFFF))) {
        return i;
      }
    }
    return -1;
  }
  
  int a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    for (int i = 0; i < getCount(); i++)
    {
      zwp localzwp = (zwp)this.InnerList.get(i);
      if (((localzwp.a & 0xFFFF) == paramInt1) && (paramInt2 == (localzwp.b & 0xFFFF)) && (paramInt3 == (localzwp.c & 0xFFFF))) {
        return i;
      }
    }
    if (paramBoolean) {
      return b(paramInt1 & 0xFFFF, paramInt2 & 0xFFFF, paramInt3 & 0xFFFF);
    }
    return -1;
  }
  
  boolean a(int paramInt, WorksheetCollection paramWorksheetCollection)
  {
    int i = b(paramInt).a & 0xFFFF;
    zbti localzbti = paramWorksheetCollection.w().a(i);
    if (localzbti.e()) {
      return false;
    }
    if (localzbti.a() == 2)
    {
      String str = localzbti.l();
      return (str != null) && (!"".equals(str));
    }
    return true;
  }
  
  int c(int paramInt)
  {
    return b(paramInt).a;
  }
  
  boolean a(int paramInt, Worksheet paramWorksheet)
  {
    zwp localzwp = b(paramInt);
    if (localzwp != null) {
      return ((localzwp.a & 0xFFFF) == paramWorksheet.c().v()) && ((localzwp.b & 0xFFFF) == paramWorksheet.getIndex()) && (localzwp.b == localzwp.c);
    }
    return false;
  }
  
  int d(int paramInt1, int paramInt2)
  {
    zwp localzwp = b(paramInt1);
    if ((localzwp != null) && ((localzwp.a & 0xFFFF) == paramInt2)) {
      return localzwp.b;
    }
    return -1;
  }
  
  int d(int paramInt)
  {
    return b(paramInt).b;
  }
  
  void a(int paramInt, HashMap paramHashMap)
  {
    for (int i = 0; i < getCount(); i++)
    {
      zwp localzwp = (zwp)this.InnerList.get(i);
      if ((localzwp.a & 0xFFFF) == paramInt)
      {
        int j = localzwp.b & 0xFFFF;
        int k = localzwp.c & 0xFFFF;
        if (paramHashMap.get(Integer.valueOf(j)) != null) {
          localzwp.b = ((Integer)paramHashMap.get(Integer.valueOf(j))).intValue();
        }
        if (paramHashMap.get(Integer.valueOf(k)) != null) {
          localzwp.c = ((Integer)paramHashMap.get(Integer.valueOf(k))).intValue();
        }
      }
    }
  }
  
  int a(WorksheetCollection paramWorksheetCollection, int paramInt)
  {
    zwp localzwp = b(paramInt);
    if (paramWorksheetCollection.v() != (localzwp.a & 0xFFFF)) {
      return -1;
    }
    if (localzwp.b == localzwp.c) {
      return localzwp.b;
    }
    return -1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zwq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */