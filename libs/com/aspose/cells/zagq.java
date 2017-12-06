package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zagq
  extends zcd
{
  zagq()
  {
    c(2204);
  }
  
  void a(PageSetup paramPageSetup, byte[] paramArrayOfByte)
    throws Exception
  {
    String str1 = paramPageSetup.a(true, 0);
    if ("".equals(str1)) {
      str1 = null;
    }
    String str2 = paramPageSetup.a(false, 0);
    if ("".equals(str2)) {
      str2 = null;
    }
    String str3 = paramPageSetup.a(true, 2);
    if ("".equals(str3)) {
      str3 = null;
    }
    String str4 = paramPageSetup.a(false, 2);
    if ("".equals(str4)) {
      str4 = null;
    }
    b(38);
    if (str1 != null) {
      b(d() + (short)(3 + str1.length() * 2));
    }
    if (str2 != null) {
      b(d() + (short)(3 + str2.length() * 2));
    }
    if (str3 != null) {
      b(d() + (short)(3 + str3.length() * 2));
    }
    if (str4 != null) {
      b(d() + (short)(3 + str4.length() * 2));
    }
    this.b = new byte[d()];
    this.b[0] = -100;
    this.b[1] = 8;
    if (paramArrayOfByte != null) {
      System.arraycopy(paramArrayOfByte, 0, this.b, 12, 16);
    }
    int i = 28;
    this.b[i] = paramPageSetup.h();
    i += 2;
    if (str1 != null) {
      System.arraycopy(zc.a(str1.length()), 0, this.b, i, 2);
    }
    i += 2;
    if (str2 != null) {
      System.arraycopy(zc.a(str2.length()), 0, this.b, i, 2);
    }
    i += 2;
    if (str3 != null) {
      System.arraycopy(zc.a(str3.length()), 0, this.b, i, 2);
    }
    i += 2;
    if (str4 != null) {
      System.arraycopy(zc.a(str4.length()), 0, this.b, i, 2);
    }
    i += 2;
    int[] arrayOfInt;
    if (str1 != null)
    {
      arrayOfInt = new int[] { i };
      a(arrayOfInt, str1);
      i = arrayOfInt[0];
    }
    if (str2 != null)
    {
      arrayOfInt = new int[] { i };
      a(arrayOfInt, str2);
      i = arrayOfInt[0];
    }
    if (str3 != null)
    {
      arrayOfInt = new int[] { i };
      a(arrayOfInt, str3);
      i = arrayOfInt[0];
    }
    if (str4 != null)
    {
      arrayOfInt = new int[] { i };
      a(arrayOfInt, str4);
      i = arrayOfInt[0];
    }
  }
  
  void a(int[] paramArrayOfInt, String paramString)
    throws Exception
  {
    System.arraycopy(zc.a(paramString.length()), 0, this.b, paramArrayOfInt[0], 2);
    paramArrayOfInt[0] += 2;
    int tmp32_31 = 0;
    int[] tmp32_30 = paramArrayOfInt;
    int tmp34_33 = tmp32_30[tmp32_31];
    tmp32_30[tmp32_31] = (tmp34_33 + 1);
    this.b[tmp34_33] = 1;
    System.arraycopy(Encoding.getUnicode().a(paramString), 0, this.b, paramArrayOfInt[0], paramString.length() * 2);
    paramArrayOfInt[0] += paramString.length() * 2;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zagq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */