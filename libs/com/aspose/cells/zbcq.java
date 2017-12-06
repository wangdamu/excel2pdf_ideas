package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.HashMap;
import java.util.Iterator;

class zbcq
{
  private byte[] b;
  int a;
  private WorksheetCollection c;
  private HashMap d = new HashMap();
  
  zbcq(WorksheetCollection paramWorksheetCollection)
  {
    if (paramWorksheetCollection != null)
    {
      this.c = paramWorksheetCollection;
      Iterator localIterator = paramWorksheetCollection.iterator();
      while (localIterator.hasNext())
      {
        Worksheet localWorksheet = (Worksheet)localIterator.next();
        this.d.put(Integer.valueOf(localWorksheet.getTabId()), localWorksheet.getName());
      }
    }
  }
  
  static int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, WorksheetCollection paramWorksheetCollection)
  {
    zacd localzacd = new zacd();
    zbcq localzbcq = new zbcq(paramWorksheetCollection);
    int i = paramInt1 + paramInt2;
    localzacd.a(paramArrayOfByte, paramInt1, i);
    while (localzacd.h())
    {
      j = localzacd.e();
      switch (paramArrayOfByte[j])
      {
      case 32: 
      case 64: 
      case 96: 
        localzacd.a();
        break;
      case 35: 
      case 67: 
      case 99: 
        localzacd.c(localzbcq.b(paramArrayOfByte, localzacd.f()));
        break;
      case 57: 
      case 89: 
      case 121: 
        localzacd.c(localzbcq.d(paramArrayOfByte, localzacd.f()));
        break;
      case 58: 
      case 59: 
      case 60: 
      case 61: 
      case 90: 
      case 91: 
      case 92: 
      case 93: 
      case 122: 
      case 123: 
      case 124: 
      case 125: 
        localzacd.c(localzbcq.e(paramArrayOfByte, localzacd.f()));
        break;
      case 33: 
      case 34: 
      case 36: 
      case 37: 
      case 38: 
      case 39: 
      case 40: 
      case 41: 
      case 42: 
      case 43: 
      case 44: 
      case 45: 
      case 46: 
      case 47: 
      case 48: 
      case 49: 
      case 50: 
      case 51: 
      case 52: 
      case 53: 
      case 54: 
      case 55: 
      case 56: 
      case 62: 
      case 63: 
      case 65: 
      case 66: 
      case 68: 
      case 69: 
      case 70: 
      case 71: 
      case 72: 
      case 73: 
      case 74: 
      case 75: 
      case 76: 
      case 77: 
      case 78: 
      case 79: 
      case 80: 
      case 81: 
      case 82: 
      case 83: 
      case 84: 
      case 85: 
      case 86: 
      case 87: 
      case 88: 
      case 94: 
      case 95: 
      case 97: 
      case 98: 
      case 100: 
      case 101: 
      case 102: 
      case 103: 
      case 104: 
      case 105: 
      case 106: 
      case 107: 
      case 108: 
      case 109: 
      case 110: 
      case 111: 
      case 112: 
      case 113: 
      case 114: 
      case 115: 
      case 116: 
      case 117: 
      case 118: 
      case 119: 
      case 120: 
      default: 
        localzacd.k();
      }
    }
    int j = localzacd.f();
    return j - i;
  }
  
  int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, zcy paramzcy)
  {
    switch (paramArrayOfByte[paramInt1])
    {
    case 35: 
    case 67: 
    case 99: 
      b(paramArrayOfByte, paramInt2);
      paramzcy.a(paramArrayOfByte, paramInt2, this.a - paramInt2);
      break;
    case 57: 
    case 89: 
    case 121: 
      d(paramArrayOfByte, paramInt2);
      paramzcy.a(paramArrayOfByte, paramInt2, this.a - paramInt2);
      break;
    case 58: 
    case 59: 
    case 60: 
    case 61: 
    case 90: 
    case 91: 
    case 92: 
    case 93: 
    case 122: 
    case 123: 
    case 124: 
    case 125: 
      e(paramArrayOfByte, paramInt2);
      paramzcy.a(paramArrayOfByte, paramInt2, this.a - paramInt2);
      break;
    }
    return this.a;
  }
  
  static int a(byte[] paramArrayOfByte, int paramInt)
  {
    int i = zc.b(paramArrayOfByte, paramInt);
    int j = 3 + i;
    if (paramArrayOfByte[(paramInt + 2)] == 1) {
      j += i;
    }
    return j;
  }
  
  int b(byte[] paramArrayOfByte, int paramInt)
  {
    return c(paramArrayOfByte, 2 + paramInt);
  }
  
  int c(byte[] paramArrayOfByte, int paramInt)
  {
    this.b = paramArrayOfByte;
    this.a = paramInt;
    this.a += 1;
    this.a += a(paramArrayOfByte, this.a);
    return this.a;
  }
  
  int d(byte[] paramArrayOfByte, int paramInt)
  {
    this.b = paramArrayOfByte;
    this.a = paramInt;
    if (paramArrayOfByte[this.a] == 1) {
      this.a += 2;
    } else {
      this.a += a(paramArrayOfByte, this.a);
    }
    int i = paramArrayOfByte[this.a] == 1 ? 1 : 0;
    this.a += 1;
    if (i != 0)
    {
      this.a += a(paramArrayOfByte, this.a);
      b(paramArrayOfByte, this.a);
    }
    else
    {
      b(paramArrayOfByte, this.a);
    }
    return this.a;
  }
  
  int e(byte[] paramArrayOfByte, int paramInt)
  {
    this.b = paramArrayOfByte;
    this.a = paramInt;
    if (paramArrayOfByte[this.a] == 1) {
      this.a += 2;
    } else {
      this.a += a(paramArrayOfByte, this.a);
    }
    this.a += f(paramArrayOfByte, this.a);
    this.a += f(paramArrayOfByte, this.a);
    return this.a;
  }
  
  static int f(byte[] paramArrayOfByte, int paramInt)
  {
    switch (paramArrayOfByte[paramInt])
    {
    case 0: 
      return 3;
    case 1: 
      return 1 + a(paramArrayOfByte, paramInt + 1);
    case 2: 
      return 1;
    case 3: 
      return 1;
    }
    return 1;
  }
  
  String g(byte[] paramArrayOfByte, int paramInt)
  {
    this.b = paramArrayOfByte;
    this.a = paramInt;
    String str1 = b();
    int i = str1 != null ? 1 : 0;
    String str2 = c();
    String str3 = c();
    int j = (str3 == null) || (zw.b(str2, str3)) ? 1 : 0;
    if (zamm.a(str2)) {
      i = 1;
    }
    if ((j == 0) && (zamm.a(str3))) {
      i = 1;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    if (i != 0) {
      localStringBuilder.append('\'');
    }
    if (str1 != null) {
      a(localStringBuilder, str1);
    }
    if (j != 0)
    {
      if (str1 == null) {
        return str2;
      }
      localStringBuilder.append(str2);
    }
    else
    {
      localStringBuilder.append(str2);
      localStringBuilder.append(':');
      localStringBuilder.append(str3);
    }
    if (i != 0) {
      localStringBuilder.append('\'');
    }
    return zs.a(localStringBuilder);
  }
  
  private void a(StringBuilder paramStringBuilder, String paramString)
  {
    String str = paramString.replace('/', '\\');
    int i = str.lastIndexOf('\\');
    if (i != -1)
    {
      paramStringBuilder.append(str.substring(0, 0 + (i + 1)));
      paramStringBuilder.append('[');
      paramStringBuilder.append(str.substring(i + 1));
    }
    else if ((str.length() > 2) && (str.charAt(1) == ':'))
    {
      paramStringBuilder.append(str.substring(0, 3));
      paramStringBuilder.append('[');
      paramStringBuilder.append(str.substring(3));
    }
    else
    {
      paramStringBuilder.append('[');
      paramStringBuilder.append(str);
    }
    paramStringBuilder.append(']');
  }
  
  String h(byte[] paramArrayOfByte, int paramInt)
  {
    this.b = paramArrayOfByte;
    this.a = paramInt;
    int i = zc.b(paramArrayOfByte, this.a);
    this.a += 2;
    String str1 = a();
    if (i == -1) {
      return str1;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    String str2 = (String)this.d.get(Integer.valueOf(i));
    if (zamm.a(str2))
    {
      localStringBuilder.append('\'');
      localStringBuilder.append(str2);
      localStringBuilder.append('\'');
    }
    else
    {
      localStringBuilder.append(str2);
    }
    localStringBuilder.append('!');
    localStringBuilder.append(str1);
    return zs.a(localStringBuilder);
  }
  
  String i(byte[] paramArrayOfByte, int paramInt)
  {
    this.b = paramArrayOfByte;
    this.a = paramInt;
    String str1 = b();
    int i = str1 != null ? 1 : 0;
    if (this.b[this.a] == 0)
    {
      this.a += 1;
      return h(paramArrayOfByte, this.a);
    }
    String str2 = zct.a(this.b, this.a);
    int j = this.b[(this.a + 2)] == 0 ? 1 : 0;
    if (j != 0) {
      this.a += 3 + str2.length();
    } else {
      this.a += 3 + str2.length() + str2.length();
    }
    String str3 = a();
    StringBuilder localStringBuilder = new StringBuilder();
    if ((i == 0) && (zamm.a(str2))) {
      i = 1;
    }
    if (i != 0) {
      localStringBuilder.append('\'');
    }
    a(localStringBuilder, str1);
    localStringBuilder.append(str2);
    localStringBuilder.append('!');
    localStringBuilder.append(str3);
    if (i != 0) {
      localStringBuilder.append('\'');
    }
    return null;
  }
  
  private String a()
  {
    Object localObject = null;
    if (this.b[this.a] != 0) {
      localObject = Name.b((byte)((this.b[this.a] & 0xFF) - 1));
    }
    String str = null;
    this.a += 1;
    int i = this.b[(this.a + 2)] == 0 ? 1 : 0;
    str = zct.a(this.b, this.a);
    this.a += 3;
    if (str != null) {
      this.a += str.length() + (i != 0 ? 0 : str.length());
    }
    if (localObject == null) {
      localObject = str;
    }
    return (String)localObject;
  }
  
  private String b()
  {
    String str = null;
    if (this.b[this.a] != 1)
    {
      int i = this.b[(this.a + 2)] == 0 ? 1 : 0;
      str = zct.a(this.b, this.a);
      this.a += 3;
      if (str != null) {
        this.a += str.length() + (i != 0 ? 0 : str.length());
      }
      str = zbti.a(str, this.c.p());
    }
    else
    {
      this.a += 2;
    }
    return str;
  }
  
  private String c()
  {
    String str = "";
    switch (this.b[this.a])
    {
    case 0: 
      this.a += 1;
      str = (String)this.d.get(Integer.valueOf(zc.b(this.b, this.a)));
      this.a += 2;
      break;
    case 1: 
      this.a += 1;
      int i = this.b[(this.a + 2)] == 0 ? 1 : 0;
      str = zct.a(this.b, this.a);
      this.a += 3;
      if (str != null) {
        this.a += str.length() + (i != 0 ? 0 : str.length());
      }
      break;
    case 2: 
      this.a += 1;
      str = null;
      break;
    case 3: 
      this.a += 1;
      str = "#REF";
      break;
    }
    return str;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbcq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */