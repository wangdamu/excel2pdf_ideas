package com.aspose.cells.a.d;

import com.aspose.cells.Encoding;
import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class zgj
  extends zgz
{
  public int a;
  public int b;
  public short c;
  public short d;
  public int e;
  public int f;
  public int g;
  public int h;
  public int i;
  public int j;
  public int[] k;
  public ArrayList l;
  
  public zgj(zz paramzz)
    throws Exception
  {
    this.a = paramzz.b();
    this.b = paramzz.b();
    this.c = paramzz.d();
    this.d = paramzz.d();
    this.e = paramzz.b();
    this.f = paramzz.b();
    this.g = paramzz.b();
    this.h = paramzz.b();
    this.i = paramzz.b();
    switch (this.a)
    {
    case 131072: 
      this.j = (paramzz.e() & 0xFFFF);
      this.k = new int[this.j];
      int m = 0;
      for (int n = 0; n < this.k.length; n++)
      {
        i1 = paramzz.e();
        this.k[n] = (i1 & 0xFFFF);
        if ((i1 & 0xFFFF) <= 32767) {
          m = Math.max(i1 & 0xFFFF, m);
        }
      }
      n = m - 258 + 1;
      n = n < 0 ? 0 : n;
      this.l = new ArrayList(n);
      for (int i1 = 0; i1 < n; i1++) {
        zf.a(this.l, a(paramzz));
      }
      break;
    case 65536: 
    case 196608: 
      break;
    default: 
      throw new IllegalStateException("Unexpected PostScript table version.");
    }
  }
  
  public void a(zaa paramzaa)
    throws Exception
  {
    paramzaa.a(this.a);
    paramzaa.a(this.b);
    paramzaa.b(this.c);
    paramzaa.b(this.d);
    paramzaa.a(this.e);
    paramzaa.a(this.f);
    paramzaa.a(this.g);
    paramzaa.a(this.h);
    paramzaa.a(this.i);
    switch (this.a)
    {
    case 131072: 
      paramzaa.b(this.j);
      for (int i2 : this.k) {
        paramzaa.b(i2);
      }
      for (int m = 0; m < this.l.size(); m++) {
        a((String)this.l.get(m), paramzaa);
      }
      break;
    case 65536: 
    case 196608: 
      break;
    default: 
      throw new IllegalStateException("Unexpected PostScript table version.");
    }
  }
  
  public void a(zgl paramzgl)
  {
    this.f = 0;
    this.g = 0;
    this.h = 0;
    this.i = 0;
    switch (this.a)
    {
    case 131072: 
      b(paramzgl);
      break;
    case 65536: 
    case 196608: 
      break;
    default: 
      throw new IllegalStateException("Unexpected PostScript table version.");
    }
  }
  
  private void b(zgl paramzgl)
  {
    int[] arrayOfInt = new int[paramzgl.a()];
    ArrayList localArrayList = new ArrayList();
    for (int m = 0; m < paramzgl.a(); m++)
    {
      int n = paramzgl.d(m);
      int i1 = ((Integer)paramzgl.c(m)).intValue();
      int i2 = this.k[n];
      if ((i2 < 258) || (i2 > 32767))
      {
        arrayOfInt[i1] = (i2 & 0xFFFF);
      }
      else
      {
        String str = (String)this.l.get(i2 - 258);
        int i3 = zf.a(localArrayList, str);
        arrayOfInt[i1] = (i3 + 258 & 0xFFFF);
      }
    }
    this.j = (paramzgl.a() & 0xFFFF);
    this.k = arrayOfInt;
    this.l = localArrayList;
  }
  
  private static String a(zz paramzz)
    throws Exception
  {
    int m = paramzz.f() & 0xFF;
    byte[] arrayOfByte = paramzz.a(m);
    Encoding localEncoding = Encoding.getASCII();
    return localEncoding.a(arrayOfByte);
  }
  
  private static void a(String paramString, zaa paramzaa)
    throws Exception
  {
    if (paramString.length() > 255) {
      throw new IllegalStateException("The PostScript glyph name is too long.");
    }
    Encoding localEncoding = Encoding.getASCII();
    byte[] arrayOfByte = localEncoding.a(paramString);
    paramzaa.a((byte)arrayOfByte.length);
    paramzaa.a(arrayOfByte, 0, arrayOfByte.length);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zgj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */