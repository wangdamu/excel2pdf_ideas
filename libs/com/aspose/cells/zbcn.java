package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbcn
{
  int a;
  int b;
  int c;
  boolean d;
  boolean e;
  boolean f;
  boolean g;
  int h;
  
  zbcn() {}
  
  zbcn(zbci paramzbci)
  {
    this.a = -1;
    this.c = 32;
    this.h = -1;
  }
  
  zbcn(zbcm paramzbcm)
  {
    this.h = paramzbcm.d;
    this.b = paramzbcm.e;
    this.c = 46;
  }
  
  zbcn(zbbv paramzbbv)
  {
    this.c = 12;
    this.h = paramzbbv.e;
  }
  
  zbcn(zbcc paramzbcc)
  {
    this.a = 194;
    this.c = (paramzbcc.b ? 34 : 10);
    this.b = paramzbcc.C;
    this.d = paramzbcc.B;
    this.e = paramzbcc.A;
    this.h = -1;
  }
  
  zbcn(zbco paramzbco)
  {
    this.a = 1050;
    this.c = 9;
    this.b = paramzbco.e;
    this.d = paramzbco.g;
    this.e = paramzbco.d;
    this.h = paramzbco.f;
  }
  
  zbcn(zbbz paramzbbz)
  {
    this.a = 98;
    this.c = 4;
    this.b = paramzbbz.e;
    this.d = paramzbbz.h;
    this.e = paramzbbz.d;
    this.h = paramzbbz.f;
  }
  
  zbcn(zbch paramzbch)
  {
    this.a = 540;
    this.b = paramzbch.d;
    this.d = paramzbch.g;
    this.e = paramzbch.c;
    this.h = paramzbch.e;
    switch (paramzbch.h)
    {
    case 0: 
      this.c = 5;
      break;
    case 1: 
      this.c = 6;
      break;
    }
  }
  
  zbcn(zbbx paramzbbx)
  {
    this.a = 78;
    this.h = paramzbbx.l;
    this.c = 13;
  }
  
  zbcn(zbcb paramzbcb)
  {
    this.a = 38;
    this.h = -1;
    switch (paramzbcb.c)
    {
    case 0: 
      this.c = 43;
      break;
    case 1: 
      this.c = 44;
      break;
    }
  }
  
  zbcn(zbcg paramzbcg)
  {
    this.a = 64;
    this.h = paramzbcg.h;
    this.b = paramzbcg.g;
    switch (paramzbcg.b)
    {
    case 5: 
      this.c = 0;
      break;
    case 4: 
      this.c = 1;
      break;
    case 3: 
      this.c = 2;
      break;
    case 2: 
      this.c = 3;
      break;
    }
  }
  
  zbcn(zbcd paramzbcd)
  {
    this.a = 44;
    this.h = paramzbcd.e;
    this.c = 11;
  }
  
  zbcn(zbbw paramzbbw)
  {
    this.c = 8;
    this.b = paramzbbw.k;
    this.d = paramzbbw.n;
    this.e = paramzbbw.j;
    this.g = false;
    this.h = paramzbbw.m;
  }
  
  void a(zbbw paramzbbw)
  {
    paramzbbw.k = this.b;
    paramzbbw.n = this.d;
    paramzbbw.j = this.e;
    paramzbbw.m = this.h;
    if ((paramzbbw.q != null) && (paramzbbw.q.e())) {
      this.a = 72;
    }
  }
  
  void a(zbbz paramzbbz)
  {
    this.a = -1;
    paramzbbz.e = this.b;
    paramzbbz.h = this.d;
    paramzbbz.d = this.e;
    paramzbbz.f = this.h;
  }
  
  int a(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, 0);
  }
  
  int a(byte[] paramArrayOfByte, int paramInt)
  {
    System.arraycopy(zc.a(this.a), 0, paramArrayOfByte, paramInt, 4);
    paramInt += 4;
    System.arraycopy(zc.a(this.b), 0, paramArrayOfByte, paramInt, 4);
    paramInt += 4;
    System.arraycopy(zc.a(this.c), 0, paramArrayOfByte, paramInt, 2);
    paramInt += 2;
    int i = 0;
    if (this.d) {
      i |= 0x1;
    }
    if (this.e) {
      i |= 0x2;
    }
    if (this.f) {
      i |= 0x4;
    }
    if (this.g) {
      i |= 0x8;
    }
    System.arraycopy(zc.a(i), 0, paramArrayOfByte, paramInt, 2);
    paramInt += 2;
    System.arraycopy(zc.a(this.h), 0, paramArrayOfByte, paramInt, 2);
    paramInt += 2;
    return paramInt;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbcn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */