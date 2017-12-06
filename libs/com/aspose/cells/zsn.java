package com.aspose.cells;

import com.aspose.cells.b.a.d.za;
import com.aspose.cells.b.a.d.zb;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zh;

class zsn
{
  String a;
  int b;
  int c;
  long d;
  long e;
  long f;
  zh g;
  long h;
  long i;
  long j;
  long k;
  long l;
  boolean m;
  
  zsn()
  {
    this.b = 0;
    this.c = 1;
    this.d = 4294967295L;
    this.e = 4294967295L;
    this.f = 4294967295L;
    this.g = zh.a;
  }
  
  zsn(String paramString, boolean paramBoolean, zh paramzh)
  {
    this();
    this.a = paramString;
    this.b = (paramBoolean ? 5 : 1);
    this.g = paramzh;
    this.k = (paramBoolean ? 4294967295L : 0L);
  }
  
  zsn(String paramString, int paramInt, long paramLong)
  {
    this();
    this.a = paramString;
    this.b = paramInt;
    this.l = paramLong;
    this.k = 4294967295L;
  }
  
  zsn(za paramza)
    throws Exception
  {
    int n = (int)paramza.k().i();
    byte[] arrayOfByte = paramza.f(64);
    if (arrayOfByte.length < 64) {
      return;
    }
    int i1 = paramza.p() & 0xFFFF;
    if (i1 > 0)
    {
      if (i1 > arrayOfByte.length) {
        throw new IllegalStateException("The structured storage seems to be corrupt.");
      }
      this.a = Encoding.getUnicode().a(arrayOfByte, 0, i1 - 2);
    }
    else
    {
      this.a = null;
    }
    this.b = (paramza.m() & 0xFF);
    if (this.b == 0)
    {
      paramza.k().b(n + 128);
      return;
    }
    this.c = (paramza.m() & 0xFF);
    this.d = paramza.r();
    this.e = paramza.r();
    this.f = paramza.r();
    this.g = new zh(paramza.f(16));
    this.h = paramza.r();
    this.i = paramza.s();
    this.j = paramza.s();
    this.k = paramza.r();
    this.l = (paramza.r() & 0xFFFFFFFF);
    paramza.q();
  }
  
  void a(zb paramzb)
    throws Exception
  {
    byte[] arrayOfByte1 = new byte[64];
    int n;
    if (zbrg.a(this.a))
    {
      byte[] arrayOfByte2 = Encoding.getUnicode().a(this.a);
      if (arrayOfByte2.length > 62) {
        throw new IllegalStateException("The name '" + this.a + "' is too long for writing to structured storage.");
      }
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte2.length);
      n = arrayOfByte2.length + 2;
    }
    else
    {
      n = 0;
    }
    paramzb.a(arrayOfByte1);
    paramzb.a(n);
    paramzb.a((byte)this.b);
    paramzb.a((byte)this.c);
    paramzb.a(this.d & 0xFFFFFFFF);
    paramzb.a(this.e & 0xFFFFFFFF);
    paramzb.a(this.f & 0xFFFFFFFF);
    paramzb.a(this.g.a());
    paramzb.a(this.h & 0xFFFFFFFF);
    paramzb.b(this.i);
    paramzb.b(this.j);
    paramzb.a(this.k & 0xFFFFFFFF);
    paramzb.a(this.l);
    paramzb.b(0);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zsn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */