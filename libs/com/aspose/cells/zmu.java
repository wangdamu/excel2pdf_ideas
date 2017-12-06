package com.aspose.cells;

import com.aspose.cells.b.a.zs;

class zmu
  extends zm
{
  public zmu(zig paramzig, String paramString)
  {
    super(paramzig);
    if (paramString == null) {
      paramString = paramzig.b();
    }
    char[] arrayOfChar = paramString.toCharArray();
    b(arrayOfChar, 0, arrayOfChar.length);
  }
  
  protected double c(double paramDouble)
  {
    if (paramDouble == 0.0D) {
      return 0.0D;
    }
    return com.aspose.cells.a.c.zm.b(paramDouble, this.c.b());
  }
  
  protected char[] a(char[] paramArrayOfChar, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    for (int i = 0; i < paramArrayOfChar.length; i++) {
      if (paramArrayOfChar[i] == c())
      {
        paramArrayOfInt1[1] = i;
        paramArrayOfInt2[1] = 1;
        break;
      }
    }
    return paramArrayOfChar;
  }
  
  private void b(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    a(this.a.c());
    StringBuilder localStringBuilder1 = new StringBuilder(paramInt2 - paramInt1);
    super.d(paramArrayOfChar, paramInt1, paramInt2, localStringBuilder1);
    paramArrayOfChar = zs.a(localStringBuilder1).toCharArray();
    localStringBuilder1.setLength(0);
    paramInt1 = 0;
    paramInt2 = paramArrayOfChar.length;
    StringBuilder localStringBuilder2 = new StringBuilder(paramInt2 - paramInt1);
    zmv localzmv = new zmv(this.a, localStringBuilder1, localStringBuilder2);
    this.c.b(-1);
    while (paramInt1 < paramInt2) {
      paramInt1 = a(paramArrayOfChar, paramInt1, paramInt2, localzmv);
    }
    if (this.c.c() < 0) {
      localzmv.a(true, localzmv.c().length());
    } else {
      localzmv.a(false, this.c.c() + 1);
    }
    a(localzmv, zs.a(localStringBuilder2));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zmu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */