package com.aspose.cells;

import java.util.HashMap;

class zhf
  extends zhe
{
  static long[] j = new long[0];
  static long[] k = new long[0];
  static long[] l = new long[0];
  private zaof[] m = new zaof[8];
  private int n = 0;
  private zaof o = new zaof(8);
  private long[] p;
  
  zhf(int paramInt1, int paramInt2, int paramInt3, zaca paramzaca, HashMap paramHashMap)
  {
    super(paramInt1, paramInt2, paramInt3, paramzaca, paramHashMap);
    this.m[0] = new zaof(8);
  }
  
  void d()
  {
    zaof localzaof = this.m[0];
    localzaof.a(0, localzaof.a());
    this.n = 0;
  }
  
  long[] e()
  {
    zaof localzaof = this.m[0];
    if (localzaof.a() > 0)
    {
      localzaof.a(0, false);
      return localzaof.b();
    }
    return null;
  }
  
  boolean a(int paramInt, zaai paramzaai)
  {
    long l1 = zaai.a(paramInt, paramzaai.a);
    Object localObject1 = this.d.get(Long.valueOf(l1));
    if (localObject1 != null)
    {
      if (localObject1 == j) {
        return false;
      }
      if (localObject1 == k)
      {
        this.m[this.n].a(l1);
        return true;
      }
      long l2 = ((long[])(long[])localObject1)[0];
      if ((l2 & 0x4) != 0L)
      {
        this.m[this.n].a(l1);
        return true;
      }
      if ((l2 & 1L) != 0L)
      {
        if (this.m[this.n].a(1) == l1) {
          return false;
        }
        long[] arrayOfLong1 = (long[])this.d.get(Long.valueOf(l1));
        int i1 = (int)arrayOfLong1[1];
        zaof localzaof = this.m[i1];
        l2 = localzaof.a(0);
        if ((l2 & 0x2) == 0L)
        {
          l2 |= 0x2;
          localzaof.a(0, l2);
          arrayOfLong1[0] = l2;
          if (this.o.a() > 0)
          {
            arrayOfLong1 = (long[])this.d.get(Long.valueOf(this.o.a(0)));
            if (((arrayOfLong1[0] & 1L) == 0L) || (arrayOfLong1[1] > i1)) {
              this.o.a(l1, 0);
            } else {
              this.o.a(l1);
            }
          }
          else
          {
            this.o.a(l1);
          }
        }
        i1++;
        while (i1 <= this.n)
        {
          localzaof = this.m[i1];
          l2 = localzaof.a(0);
          if ((l2 & 0x2) == 0L)
          {
            l2 |= 0x2;
            localzaof.a(0, l2);
            ((long[])this.d.get(Long.valueOf(localzaof.a(1))))[0] = l2;
            this.o.a(localzaof.a(1));
          }
          i1++;
        }
        return false;
      }
      return false;
    }
    if (a(paramInt, paramzaai.e, paramzaai.f)) {
      return false;
    }
    this.n += 1;
    if (this.n == this.m.length)
    {
      localObject2 = new zaof[this.n << 1];
      System.arraycopy(this.m, 0, localObject2, 0, this.n);
      this.m = ((zaof[])localObject2);
    }
    Object localObject2 = new zaof(8);
    ((zaof)localObject2).a(1L);
    ((zaof)localObject2).a(l1);
    this.m[this.n] = localObject2;
    this.d.put(Long.valueOf(l1), new long[] { 1L, this.n });
    long[] arrayOfLong4;
    int i4;
    if (b(paramInt, paramzaai))
    {
      int i = ((Integer)this.d.get("")).intValue();
      this.d.put("", Integer.valueOf(i + 1));
      long l4 = ((zaof)localObject2).a(0);
      if ((l4 & 0x2) != 0L)
      {
        int i2 = this.o.a();
        arrayOfLong4 = this.o.c();
        for (i4 = 0; i4 < i2; i4++)
        {
          long l5 = arrayOfLong4[i4];
          long[] arrayOfLong5 = (long[])this.d.get(Long.valueOf(l5));
          l4 = arrayOfLong5[0];
          arrayOfLong5[0] = (l4 & 0xFD | 0x4);
          int i5 = (int)arrayOfLong5[1];
          if ((i5 < this.n) && (this.m[i5].a(1) == l5))
          {
            l4 = this.m[i5].a(0);
            this.m[i5].a(0, l4 & 0xFD | 0x4);
          }
          else
          {
            this.d.put(Long.valueOf(l5), k);
          }
        }
        this.o.a(0, i2);
      }
      else if (((zaof)localObject2).a() > 2)
      {
        ((zaof)localObject2).a(2, false);
        long[] arrayOfLong3 = ((zaof)localObject2).b(1, ((zaof)localObject2).a() - 1);
        arrayOfLong3[0] = 4L;
        this.d.put(Long.valueOf(l1), arrayOfLong3);
      }
      else
      {
        this.d.put(Long.valueOf(l1), k);
      }
      this.n -= 1;
      this.m[this.n].a(l1);
      if (this.p != null) {
        a(l1);
      }
      return true;
    }
    long l3 = ((zaof)localObject2).a(0);
    if ((l3 & 0x2) != 0L)
    {
      if (l1 == this.o.a(0))
      {
        long[] arrayOfLong2 = (l3 & 0x4) == 0L ? j : k;
        int i3 = this.o.a();
        arrayOfLong4 = this.o.c();
        for (i4 = 0; i4 < i3; i4++) {
          this.d.put(Long.valueOf(arrayOfLong4[i4]), arrayOfLong2);
        }
        this.o.a(0, i3);
      }
      else
      {
        ((long[])this.d.get(Long.valueOf(l1)))[0] &= 0xFE;
      }
    }
    else {
      this.d.put(Long.valueOf(l1), (l3 & 0x4) == 0L ? j : k);
    }
    this.n -= 1;
    if (this.p != null) {
      a(l1);
    }
    return false;
  }
  
  protected void a(long[] paramArrayOfLong)
  {
    for (long l1 : paramArrayOfLong)
    {
      Object localObject = this.d.get(Long.valueOf(l1));
      if (localObject == null)
      {
        this.d.put(Long.valueOf(l1), new long[] { 1L, this.n });
      }
      else
      {
        long[] arrayOfLong2 = (long[])localObject;
        arrayOfLong2[0] |= 1L;
      }
    }
  }
  
  protected void a(long[] paramArrayOfLong, boolean paramBoolean)
  {
    this.p = paramArrayOfLong;
  }
  
  private void a(long paramLong)
  {
    Object localObject = this.d.get(Long.valueOf(paramLong));
    for (long l1 : this.p) {
      this.d.put(Long.valueOf(l1), localObject);
    }
    this.p = null;
  }
  
  protected Object a()
  {
    return Integer.valueOf(this.m[this.n].a());
  }
  
  protected Object a(Object paramObject)
  {
    int i = ((Integer)paramObject).intValue();
    zaof localzaof = this.m[this.n];
    if (localzaof.a() > i)
    {
      long[] arrayOfLong = new long[localzaof.a() - i];
      System.arraycopy(localzaof.c(), i, arrayOfLong, 0, arrayOfLong.length);
      return arrayOfLong;
    }
    return null;
  }
  
  protected void b(Object paramObject)
  {
    long[] arrayOfLong = (long[])paramObject;
    this.m[this.n].a(arrayOfLong, 0, arrayOfLong.length);
  }
  
  protected void a(Object paramObject, CellArea paramCellArea)
  {
    long[] arrayOfLong1 = (long[])paramObject;
    WorksheetCollection localWorksheetCollection = this.g.p.e;
    zaof localzaof = this.m[this.n];
    for (long l1 : arrayOfLong1)
    {
      zaai localzaai = localWorksheetCollection.get(zaai.a(l1)).getCells().a.a(zaai.b(l1));
      if ((paramCellArea.a(localzaai.e)) && (paramCellArea.b(localzaai.f))) {
        localzaof.a(l1);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zhf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */