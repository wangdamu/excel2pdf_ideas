package com.aspose.cells;

import com.aspose.cells.a.c.zp;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zh;
import com.aspose.cells.b.a.zs;
import java.util.Random;

class zbyq
{
  static void a(VbaModule paramVbaModule, StringBuilder paramStringBuilder)
  {
    a(paramStringBuilder, "VB_Name", paramVbaModule.getName());
    paramStringBuilder.append("\r\n");
    zh localzh;
    StringBuilder localStringBuilder;
    switch (paramVbaModule.getType())
    {
    case 3: 
      localzh = zh.b();
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("0{");
      localStringBuilder.append(zs.a(localzh));
      localStringBuilder.append("}{");
      localzh = zh.b();
      localStringBuilder.append(zs.a(localzh));
      localStringBuilder.append("}");
      a(paramStringBuilder, "VB_Base", zs.a(localStringBuilder).toUpperCase());
      break;
    case 2: 
      localzh = zh.b();
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("0{");
      localStringBuilder.append(zs.a(localzh));
      localStringBuilder.append("}");
      a(paramStringBuilder, "VB_Base", zs.a(localStringBuilder).toUpperCase());
      break;
    default: 
      a(paramStringBuilder, "VB_Base", VbaModule.p);
    }
    paramStringBuilder.append("\r\n");
  }
  
  static String a(VbaModule paramVbaModule)
  {
    String str = paramVbaModule.l;
    if ((str != null) && (str.indexOf("Attribute VB_Name") != -1)) {
      return str;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    a(paramVbaModule, localStringBuilder);
    localStringBuilder.append("Attribute VB_GlobalNameSpace = False");
    localStringBuilder.append("\r\n");
    localStringBuilder.append("Attribute VB_Creatable = False");
    localStringBuilder.append("\r\n");
    localStringBuilder.append("Attribute VB_PredeclaredId = True");
    localStringBuilder.append("\r\n");
    localStringBuilder.append("Attribute VB_Exposed = True");
    localStringBuilder.append("\r\n");
    localStringBuilder.append("Attribute VB_TemplateDerived = False");
    localStringBuilder.append("\r\n");
    localStringBuilder.append("Attribute VB_Customizable = True");
    localStringBuilder.append("\r\n");
    if (str != null) {
      localStringBuilder.append(str);
    }
    return zs.a(localStringBuilder);
  }
  
  static void a(StringBuilder paramStringBuilder, String paramString1, String paramString2)
  {
    paramStringBuilder.append("Attribute ");
    paramStringBuilder.append(paramString1);
    paramStringBuilder.append(" = ");
    paramStringBuilder.append("\"");
    paramStringBuilder.append(paramString2);
    paramStringBuilder.append("\"");
  }
  
  static zm a(zm paramzm, int paramInt)
    throws Exception
  {
    zng localzng = new zng();
    localzng.b(paramzm, paramInt);
    return localzng.b;
  }
  
  static zm b(zm paramzm, int paramInt)
    throws Exception
  {
    zng localzng = new zng();
    localzng.a(paramzm, paramInt);
    return localzng.a;
  }
  
  static String a(byte[] paramArrayOfByte, String paramString)
  {
    byte[] arrayOfByte = b(paramArrayOfByte, paramString);
    StringBuilder localStringBuilder = new StringBuilder(arrayOfByte.length * 2);
    for (int i = 0; i < arrayOfByte.length; i++) {
      localStringBuilder.append(zp.b(arrayOfByte[i] & 0xFF));
    }
    return zs.a(localStringBuilder);
  }
  
  static byte[] a(String paramString)
  {
    byte[] arrayOfByte = new byte[paramString.length() / 2];
    for (int i = 0; i < paramString.length(); i += 2) {
      arrayOfByte[(i / 2)] = ((byte)(zarb.b(paramString.charAt(i)) << 4 | zarb.b(paramString.charAt(i + 1))));
    }
    return a(arrayOfByte);
  }
  
  private static byte[] b(byte[] paramArrayOfByte, String paramString)
  {
    Random localRandom = zit.b();
    int i = (byte)(localRandom.nextInt() | 0x4);
    int j = (byte)(i & 0xFF ^ 0x2);
    int k = 0;
    for (i2 : paramString.toCharArray()) {
      k = (byte)((k & 0xFF) + ((byte)i2 & 0xFF));
    }
    int m = (byte)(i & 0xFF ^ k & 0xFF);
    ??? = k;
    ??? = m;
    int i2 = j;
    int i3 = (i & 0xFF & 0x6) / 2;
    byte[] arrayOfByte1 = new byte[i3];
    for (int i4 = 0; i4 < i3; i4++)
    {
      i5 = (byte)localRandom.nextInt();
      i6 = (byte)(i5 & 0xFF ^ (i2 & 0xFF) + (??? & 0xFF));
      arrayOfByte1[i4] = i6;
      i2 = ???;
      ??? = i6;
      ??? = i5;
    }
    byte[] arrayOfByte2 = zc.a(paramArrayOfByte.length);
    int i7;
    for (int i5 = 0; i5 < arrayOfByte2.length; i5++)
    {
      i6 = arrayOfByte2[i5];
      i7 = (byte)(arrayOfByte2[i5] & 0xFF ^ (i2 & 0xFF) + (??? & 0xFF));
      arrayOfByte2[i5] = i7;
      i2 = ???;
      ??? = i7;
      ??? = i6;
    }
    byte[] arrayOfByte3 = new byte[paramArrayOfByte.length];
    for (int i6 = 0; i6 < paramArrayOfByte.length; i6++)
    {
      i7 = paramArrayOfByte[i6];
      i8 = (byte)(i7 & 0xFF ^ (i2 & 0xFF) + (??? & 0xFF));
      arrayOfByte3[i6] = i8;
      i2 = ???;
      ??? = i8;
      ??? = i7;
    }
    i6 = 3 + i3 + 4 + paramArrayOfByte.length;
    byte[] arrayOfByte4 = new byte[i6];
    arrayOfByte4[0] = i;
    arrayOfByte4[1] = j;
    arrayOfByte4[2] = m;
    int i8 = 3;
    System.arraycopy(arrayOfByte1, 0, arrayOfByte4, i8, i3);
    i8 += i3;
    System.arraycopy(arrayOfByte2, 0, arrayOfByte4, i8, arrayOfByte2.length);
    i8 += arrayOfByte2.length;
    System.arraycopy(arrayOfByte3, 0, arrayOfByte4, i8, arrayOfByte3.length);
    return arrayOfByte4;
  }
  
  private static byte[] a(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte[0];
    int j = paramArrayOfByte[1];
    int k = paramArrayOfByte[2];
    int m = (byte)(i & 0xFF ^ j & 0xFF);
    int n = (byte)(i & 0xFF ^ k & 0xFF);
    int i1 = n;
    int i2 = k;
    int i3 = j;
    int i4 = (byte)((i & 0xFF & 0x6) / 2);
    int i5 = 3;
    for (int i6 = 0; i6 < (i4 & 0xFF); i6++)
    {
      i7 = paramArrayOfByte[(i6 + i5)];
      i8 = (byte)(i7 & 0xFF ^ (i3 & 0xFF) + (i1 & 0xFF));
      i3 = i2;
      i2 = i7;
      i1 = i8;
    }
    i6 = 0;
    i5 += (i4 & 0xFF);
    int i9;
    int i10;
    for (int i7 = 0; i7 < 4; i7++)
    {
      i8 = paramArrayOfByte[(i7 + i5)];
      i9 = (byte)(i8 & 0xFF ^ (i3 & 0xFF) + (i1 & 0xFF));
      i10 = (int)Math.pow(256.0D, i7);
      i10 *= (i9 & 0xFF);
      i6 += (i9 & 0xFF);
      i3 = i2;
      i2 = i8;
      i1 = i9;
    }
    byte[] arrayOfByte = new byte[i6];
    i5 += 4;
    for (int i8 = 0; i8 < i6; i8++)
    {
      i9 = paramArrayOfByte[(i8 + i5)];
      i10 = (byte)(i9 & 0xFF ^ (i3 & 0xFF) + (i1 & 0xFF));
      arrayOfByte[i8] = i10;
      i3 = i2;
      i2 = i9;
      i1 = i10;
    }
    return arrayOfByte;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbyq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */