package com.aspose.cells.a.d;

import com.aspose.cells.b.a.zi;

public class zha
  implements zi
{
  public String a;
  public int b;
  public int c;
  public int d;
  
  public zha(zz paramzz)
    throws Exception
  {
    this.a = new String(paramzz.b(4));
    this.b = paramzz.b();
    this.c = paramzz.b();
    this.d = paramzz.b();
  }
  
  public void a(zaa paramzaa)
    throws Exception
  {
    for (int i = 0; i < this.a.length(); i++) {
      paramzaa.a((byte)this.a.charAt(i));
    }
    paramzaa.a(this.b);
    paramzaa.a(this.c);
    paramzaa.a(this.d);
  }
  
  public static int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = 0;
    int i1 = paramInt1;
    int i2 = paramInt2 / 4;
    for (int i3 = 0; i3 < i2; i3++)
    {
      n = paramArrayOfByte[(i1++)] & 0xFF;
      m = paramArrayOfByte[(i1++)] & 0xFF;
      k = paramArrayOfByte[(i1++)] & 0xFF;
      j = paramArrayOfByte[(i1++)] & 0xFF;
      int i4 = j | k << 8 | m << 16 | n << 24;
      i += i4;
    }
    int n = i1 < paramInt2 ? paramArrayOfByte[(i1++)] & 0xFF : 0;
    int m = i1 < paramInt2 ? paramArrayOfByte[(i1++)] & 0xFF : 0;
    int k = i1 < paramInt2 ? paramArrayOfByte[(i1++)] & 0xFF : 0;
    int j = 0;
    i3 = j | k << 8 | m << 16 | n << 24;
    i += i3;
    return i;
  }
  
  public int compareTo(Object obj)
  {
    zha localzha = (zha)obj;
    return this.a.compareTo(localzha.a);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */