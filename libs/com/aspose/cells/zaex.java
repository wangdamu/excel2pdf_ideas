package com.aspose.cells;

import com.aspose.cells.b.a.g.a.ze;
import com.aspose.cells.b.a.zw;

class zaex
  extends zcd
{
  private CellArea a;
  private byte[] c;
  private byte[] d;
  
  zaex(CellArea paramCellArea, String paramString1, String paramString2, Hyperlink paramHyperlink)
  {
    c(440);
    a(paramCellArea, paramString1, paramString2, paramHyperlink);
  }
  
  private void a(Hyperlink paramHyperlink)
  {
    String str1 = null;
    int i = paramHyperlink.getAddress().indexOf('#');
    String str2 = paramHyperlink.getAddress();
    String str3 = paramHyperlink.getTextToDisplay();
    int j = (str3 != null) && (!"".equals(str3)) ? 1 : 0;
    if (i != -1)
    {
      str1 = str2.substring(i + 1);
      str2 = str2.substring(0, 0 + i);
    }
    byte[] arrayOfByte1 = Encoding.getUnicode().a(str2);
    int k = 0;
    int i2;
    for (i2 : arrayOfByte1) {
      if (i2 != 0) {
        k++;
      }
    }
    int m = k != arrayOfByte1.length / 2 ? 1 : 0;
    byte[] arrayOfByte3 = new byte[k];
    k = 0;
    for (??? = 0; ??? < arrayOfByte1.length; ???++)
    {
      i2 = arrayOfByte1[???];
      if (i2 != 0)
      {
        arrayOfByte3[k] = i2;
        k++;
      }
    }
    c(440);
    b(32);
    if (j != 0) {
      b(d() + (short)(6 + str3.length() * 2));
    }
    b(d() + 18);
    b(d() + (short)(arrayOfByte3.length + 1 + 4));
    b(d() + 28);
    if (m != 0) {
      b(d() + (short)(6 + str2.length() * 2 + 2));
    }
    if (str1 != null) {
      b(d() + (short)(4 + str1.length() * 2 + 2));
    }
    this.b = new byte[d()];
    this.a = paramHyperlink.getArea();
    System.arraycopy(com.aspose.cells.b.a.zc.a(this.a.StartRow), 0, this.b, 0, 2);
    System.arraycopy(com.aspose.cells.b.a.zc.a(this.a.EndRow), 0, this.b, 2, 2);
    this.b[4] = ((byte)this.a.StartColumn);
    this.b[6] = ((byte)this.a.EndColumn);
    this.c = new byte[] { -48, -55, -22, 121, -7, -70, -50, 17, -116, -126, 0, -86, 0, 75, -87, 11, 2, 0, 0, 0 };
    System.arraycopy(this.c, 0, this.b, 8, 20);
    this.c = null;
    this.b[28] = 3;
    if (str1 != null)
    {
      byte[] tmp559_554 = this.b;
      tmp559_554[28] = ((byte)(tmp559_554[28] | 0x8));
    }
    ??? = 32;
    if (j != 0)
    {
      byte[] tmp581_576 = this.b;
      tmp581_576[28] = ((byte)(tmp581_576[28] | 0x14));
      System.arraycopy(com.aspose.cells.b.a.zc.a(str3.length() + 1), 0, this.b, ???, 4);
      ??? += 4;
      System.arraycopy(Encoding.getUnicode().a(str3), 0, this.b, ???, str3.length() * 2);
      ??? += str3.length() * 2 + 2;
    }
    this.c = new byte[] { 3, 3, 0, 0, 0, 0, 0, 0, -64, 0, 0, 0, 0, 0, 0, 70 };
    System.arraycopy(this.c, 0, this.b, ???, 16);
    this.c = null;
    ??? += 18;
    System.arraycopy(com.aspose.cells.b.a.zc.a(arrayOfByte3.length + 1), 0, this.b, ???, 4);
    ??? += 4;
    System.arraycopy(arrayOfByte3, 0, this.b, ???, arrayOfByte3.length);
    ??? += arrayOfByte3.length + 1;
    this.c = new byte[24];
    this.c[0] = -1;
    this.c[1] = -1;
    this.c[2] = -83;
    this.c[3] = -34;
    System.arraycopy(this.c, 0, this.b, ???, 24);
    ??? += 24;
    if (m != 0)
    {
      k = arrayOfByte1.length + 6;
      System.arraycopy(com.aspose.cells.b.a.zc.a(k), 0, this.b, ???, 4);
      ??? += 4;
      System.arraycopy(com.aspose.cells.b.a.zc.a(arrayOfByte1.length), 0, this.b, ???, 4);
      ??? += 4;
      this.b[???] = 3;
      ??? += 2;
      System.arraycopy(arrayOfByte1, 0, this.b, ???, arrayOfByte1.length);
      ??? += arrayOfByte1.length;
    }
    else
    {
      ??? += 4;
    }
    if (str1 != null)
    {
      System.arraycopy(com.aspose.cells.b.a.zc.a(str1.length() + 1), 0, this.b, ???, 4);
      ??? += 4;
      System.arraycopy(Encoding.getUnicode().a(str1), 0, this.b, ???, str1.length() * 2);
    }
  }
  
  private void a(CellArea paramCellArea, String paramString1, String paramString2)
  {
    String str = null;
    int i = paramString2.lastIndexOf('#');
    if (i != -1)
    {
      str = paramString2.substring(i + 1);
      paramString2 = paramString2.substring(0, 0 + i);
    }
    a((short)(44 + 2 * (paramString1.length() + paramString2.length())));
    if (str != null) {
      b(d() + (short)(4 + str.length() * 2 + 2));
    }
    this.b = new byte[d()];
    System.arraycopy(com.aspose.cells.b.a.zc.a(paramCellArea.StartRow), 0, this.b, 0, 2);
    System.arraycopy(com.aspose.cells.b.a.zc.a(paramCellArea.EndRow), 0, this.b, 2, 2);
    this.b[4] = ((byte)paramCellArea.StartColumn);
    this.b[6] = ((byte)paramCellArea.EndColumn);
    this.c = new byte[] { -48, -55, -22, 121, -7, -70, -50, 17, -116, -126, 0, -86, 0, 75, -87, 11, 2, 0, 0, 0 };
    System.arraycopy(this.c, 0, this.b, 8, 20);
    this.b[28] = 23;
    this.b[29] = 1;
    if (str != null)
    {
      byte[] tmp309_304 = this.b;
      tmp309_304[28] = ((byte)(tmp309_304[28] | 0x8));
    }
    System.arraycopy(com.aspose.cells.b.a.zc.a(paramString1.length() + 1), 0, this.b, 32, 4);
    System.arraycopy(Encoding.getUnicode().a(paramString1), 0, this.b, 36, 2 * paramString1.length());
    int j = 38 + 2 * paramString1.length();
    System.arraycopy(com.aspose.cells.b.a.zc.a(paramString2.length() + 1), 0, this.b, j, 4);
    j += 4;
    System.arraycopy(Encoding.getUnicode().a(paramString2), 0, this.b, j, 2 * paramString2.length());
    j += 2 + 2 * paramString2.length();
    if (str != null)
    {
      System.arraycopy(com.aspose.cells.b.a.zc.a(str.length() + 1), 0, this.b, j, 4);
      j += 4;
      System.arraycopy(Encoding.getUnicode().a(str), 0, this.b, j, str.length() * 2);
    }
  }
  
  private void b(CellArea paramCellArea, String paramString1, String paramString2)
  {
    int i = 0;
    int j = paramString2.lastIndexOf("..\\");
    if (j != -1)
    {
      i = j / 3 + 1;
      str1 = paramString2.substring(j + 3);
    }
    else
    {
      str1 = paramString2;
    }
    String[] arrayOfString = zw.d(str1, '#');
    String str1 = arrayOfString[0];
    String str2 = null;
    if (arrayOfString.length > 1) {
      str2 = arrayOfString[1];
    }
    byte[] arrayOfByte1 = Encoding.getASCII().a(str1);
    byte[] arrayOfByte2 = Encoding.getUnicode().a(str1);
    int k = 1;
    for (int m = 0; m < arrayOfByte2.length; m += 2)
    {
      if (arrayOfByte2[(m + 1)] != 0)
      {
        k = 0;
        break;
      }
      if (arrayOfByte2[m] != arrayOfByte1[(m / 2)])
      {
        k = 0;
        break;
      }
    }
    a((short)(89 + 2 * paramString1.length() + arrayOfByte1.length));
    if (k == 0) {
      b(d() + (short)(6 + arrayOfByte2.length));
    }
    if (str2 != null) {
      b(d() + (short)(4 + str2.length() * 2 + 2));
    }
    this.b = new byte[d()];
    System.arraycopy(com.aspose.cells.b.a.zc.a(paramCellArea.StartRow), 0, this.b, 0, 2);
    System.arraycopy(com.aspose.cells.b.a.zc.a(paramCellArea.EndRow), 0, this.b, 2, 2);
    this.b[4] = ((byte)paramCellArea.StartColumn);
    this.b[6] = ((byte)paramCellArea.EndColumn);
    this.c = new byte[] { -48, -55, -22, 121, -7, -70, -50, 17, -116, -126, 0, -86, 0, 75, -87, 11, 2, 0, 0, 0 };
    System.arraycopy(this.c, 0, this.b, 8, 20);
    this.b[28] = 21;
    if (str2 != null)
    {
      byte[] tmp433_428 = this.b;
      tmp433_428[28] = ((byte)(tmp433_428[28] | 0x8));
    }
    System.arraycopy(com.aspose.cells.b.a.zc.a(paramString1.length() + 1), 0, this.b, 32, 4);
    System.arraycopy(Encoding.getUnicode().a(paramString1), 0, this.b, 36, 2 * paramString1.length());
    m = 38 + 2 * paramString1.length();
    this.b[m] = 3;
    m++;
    this.b[m] = 3;
    m += 7;
    this.b[m] = -64;
    m += 7;
    this.b[m] = 70;
    m++;
    System.arraycopy(com.aspose.cells.b.a.zc.a((short)i), 0, this.b, m, 2);
    m += 2;
    System.arraycopy(com.aspose.cells.b.a.zc.a(arrayOfByte1.length + 1), 0, this.b, m, 4);
    m += 4;
    System.arraycopy(arrayOfByte1, 0, this.b, m, arrayOfByte1.length);
    m += arrayOfByte1.length + 1;
    this.b[m] = -1;
    m++;
    this.b[m] = -1;
    m++;
    this.b[m] = -83;
    m++;
    this.b[m] = -34;
    m++;
    m += 20;
    if (k != 0)
    {
      m += 4;
    }
    else
    {
      System.arraycopy(com.aspose.cells.b.a.zc.a(6 + arrayOfByte2.length), 0, this.b, m, 4);
      m += 4;
      System.arraycopy(com.aspose.cells.b.a.zc.a(arrayOfByte2.length), 0, this.b, m, 4);
      m += 4;
      this.b[(m++)] = 3;
      this.b[(m++)] = 0;
      System.arraycopy(arrayOfByte2, 0, this.b, m, arrayOfByte2.length);
      m += arrayOfByte2.length;
    }
    if (str2 != null)
    {
      System.arraycopy(com.aspose.cells.b.a.zc.a(str2.length() + 1), 0, this.b, m, 4);
      System.arraycopy(Encoding.getUnicode().a(str2), 0, this.b, m + 4, str2.length() * 2);
    }
  }
  
  private void a(CellArea paramCellArea, String paramString1, String paramString2, Hyperlink paramHyperlink)
  {
    if ((paramString1 == null) || ("".equals(paramString1))) {
      paramString1 = paramString2;
    }
    if (paramString2.startsWith("\\\\"))
    {
      a(paramCellArea, paramString1, paramString2);
      return;
    }
    if ((paramString2.length() > 1) && (paramString2.charAt(1) == ':'))
    {
      a(paramHyperlink);
      return;
    }
    if (paramString2.indexOf(".") != -1)
    {
      i = 1;
      str = paramString2.toLowerCase();
      if ((str.startsWith("http:")) || (str.startsWith("www.")) || (str.startsWith("https:")) || (str.startsWith("mailto:")))
      {
        i = 0;
      }
      else if (paramString2.indexOf("!") != -1)
      {
        int k = paramString2.lastIndexOf('#');
        if (k == -1)
        {
          String[] arrayOfString = zw.d(paramString2, '!');
          if ((arrayOfString[1] != null) && (!"".equals(arrayOfString[1])) && (zamm.c(arrayOfString[1]))) {
            i = 0;
          }
        }
      }
      if (i != 0)
      {
        b(paramCellArea, paramString1, paramString2);
        return;
      }
    }
    int i = 0;
    String str = paramString2.toLowerCase();
    com.aspose.cells.b.a.g.a.zc localzc = ze.a(str, "^\\w+:", 66);
    if ((!localzc.c()) && (!str.startsWith("www."))) {
      i = 1;
    }
    if (i != 0) {
      a((short)(44 + 2 * (paramString1.length() + paramString2.length())));
    } else {
      a((short)(60 + 2 * (paramString1.length() + paramString2.length())));
    }
    this.b = new byte[d()];
    System.arraycopy(com.aspose.cells.b.a.zc.a(paramCellArea.StartRow), 0, this.b, 0, 2);
    System.arraycopy(com.aspose.cells.b.a.zc.a(paramCellArea.EndRow), 0, this.b, 2, 2);
    this.b[4] = ((byte)paramCellArea.StartColumn);
    this.b[6] = ((byte)paramCellArea.EndColumn);
    this.c = new byte[] { -48, -55, -22, 121, -7, -70, -50, 17, -116, -126, 0, -86, 0, 75, -87, 11, 2, 0, 0, 0 };
    System.arraycopy(this.c, 0, this.b, 8, 20);
    if (i != 0) {
      this.b[28] = 28;
    } else {
      this.b[28] = 23;
    }
    System.arraycopy(com.aspose.cells.b.a.zc.a(paramString1.length() + 1), 0, this.b, 32, 4);
    System.arraycopy(Encoding.getUnicode().a(paramString1), 0, this.b, 36, 2 * paramString1.length());
    int j = 38 + 2 * paramString1.length();
    this.d = new byte[] { -32, -55, -22, 121, -7, -70, -50, 17, -116, -126, 0, -86, 0, 75, -87, 11 };
    if (i == 0)
    {
      System.arraycopy(this.d, 0, this.b, j, 16);
      j += 16;
    }
    if (i != 0) {
      System.arraycopy(com.aspose.cells.b.a.zc.a(paramString2.length() + 1), 0, this.b, j, 4);
    } else {
      System.arraycopy(com.aspose.cells.b.a.zc.a(2 * paramString2.length() + 2), 0, this.b, j, 4);
    }
    j += 4;
    System.arraycopy(Encoding.getUnicode().a(paramString2), 0, this.b, j, 2 * paramString2.length());
    j += 2 * paramString2.length() + 2;
  }
  
  zaex()
  {
    c(440);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaex.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */