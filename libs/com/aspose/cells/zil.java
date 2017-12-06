package com.aspose.cells;

import com.aspose.cells.b.a.c.zc;

class zil
  implements zaiu
{
  private zavl a;
  private com.aspose.cells.a.a.za b;
  private char[] c;
  private char[] d;
  private zahi[] e;
  private zahi[] f;
  private boolean g;
  private boolean h;
  
  zil(zavl paramzavl)
  {
    this.a = paramzavl;
    this.b = paramzavl.a().f();
    com.aspose.cells.b.a.c.za localza = paramzavl.a().a();
    this.c = localza.d().d().toCharArray();
    this.d = localza.d().e().toCharArray();
    switch (localza.g())
    {
    case 7: 
    case 16: 
    case 1031: 
    case 1040: 
    case 2055: 
    case 2064: 
    case 3079: 
    case 4103: 
    case 5127: 
      this.g = false;
      this.h = false;
      break;
    case 9: 
    case 1033: 
    case 2057: 
    case 3081: 
    case 4105: 
    case 5129: 
    case 6153: 
    case 7177: 
    case 8201: 
    case 9225: 
    case 10249: 
    case 11273: 
    case 12297: 
    case 13321: 
    case 16393: 
    case 18441: 
      this.g = true;
      this.h = true;
      break;
    default: 
      this.g = true;
      this.h = false;
    }
  }
  
  public int a(char[] paramArrayOfChar, int paramInt)
  {
    return paramArrayOfChar[paramInt] == this.b.d() ? 1 : 0;
  }
  
  public int b(char[] paramArrayOfChar, int paramInt)
  {
    return paramArrayOfChar[paramInt] == this.b.e() ? 1 : 0;
  }
  
  public int a(char[] paramArrayOfChar, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramInt -= this.d.length - 1;
      if (paramInt < 0) {
        return 0;
      }
    }
    else if (paramInt + this.d.length > paramArrayOfChar.length)
    {
      return 0;
    }
    for (int i = 0; i < this.d.length; i++) {
      if (paramArrayOfChar[(i + paramInt)] != this.d[i]) {
        return 0;
      }
    }
    return this.d.length;
  }
  
  public int b(char[] paramArrayOfChar, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (paramArrayOfChar[paramInt] == '€') {
        return 1;
      }
      return 0;
    }
    switch (paramArrayOfChar[paramInt])
    {
    case '$': 
    case '€': 
    case '￡': 
    case '￥': 
      return 1;
    }
    if (paramInt + this.c.length > paramArrayOfChar.length) {
      return 0;
    }
    for (int i = 0; i < this.c.length; i++) {
      if (paramArrayOfChar[(i + paramInt)] != this.c[i]) {
        return 0;
      }
    }
    return this.c.length;
  }
  
  public int c(char[] paramArrayOfChar, int paramInt)
  {
    int i = paramInt;
    while (paramArrayOfChar[i] == ' ')
    {
      i++;
      if (i >= paramArrayOfChar.length) {
        return 0;
      }
    }
    switch (paramArrayOfChar[i])
    {
    case '-': 
    case '/': 
      break;
    default: 
      if (paramArrayOfChar[i] != this.b.g()) {
        return 0;
      }
      break;
    }
    i++;
    while ((i < paramArrayOfChar.length) && (paramArrayOfChar[i] == ' ')) {
      i++;
    }
    return i - paramInt;
  }
  
  public int d(char[] paramArrayOfChar, int paramInt)
  {
    int i = paramInt;
    while (paramArrayOfChar[i] == ' ')
    {
      i++;
      if (i >= paramArrayOfChar.length) {
        return 0;
      }
    }
    if (paramArrayOfChar[i] != this.b.h()) {
      return 0;
    }
    i++;
    while ((i < paramArrayOfChar.length) && (paramArrayOfChar[i] == ' ')) {
      i++;
    }
    return i - paramInt;
  }
  
  public zavn e(char[] paramArrayOfChar, int paramInt)
  {
    if ((paramInt + 2 < paramArrayOfChar.length) && (paramArrayOfChar[paramInt] == znq.a[0]) && (paramArrayOfChar[(paramInt + 1)] == znq.a[1]))
    {
      paramInt += 2;
      if ((paramArrayOfChar[paramInt] < '0') || (paramArrayOfChar[paramInt] > '9')) {
        return null;
      }
      int i = paramArrayOfChar[paramInt] - '0';
      zavn localzavn = new zavn();
      localzavn.a = 128;
      localzavn.d = paramInt;
      paramInt++;
      while ((paramInt < paramArrayOfChar.length) && (paramArrayOfChar[paramInt] >= '0') && (paramArrayOfChar[paramInt] <= '9'))
      {
        i *= 10;
        i += paramArrayOfChar[paramInt] - '0';
        paramInt++;
      }
      localzavn.b = (i + 1988);
      localzavn.e = paramInt;
      if ((paramInt < paramArrayOfChar.length) && (paramArrayOfChar[paramInt] == '年'))
      {
        localzavn.c = "GGGE\"年\"";
        localzavn.f = (paramInt + 1);
      }
      else
      {
        localzavn.c = "GGGE";
        localzavn.f = paramInt;
      }
      return localzavn;
    }
    return null;
  }
  
  public zavn a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    zavn localzavn;
    switch (paramArrayOfChar[paramInt1])
    {
    case '年': 
      localzavn = new zavn();
      localzavn.a = 1;
      localzavn.f = (paramInt1 + 1);
      return localzavn;
    case '月': 
      localzavn = new zavn();
      localzavn.a = 2;
      localzavn.f = (paramInt1 + 1);
      return localzavn;
    case '日': 
      localzavn = new zavn();
      localzavn.a = 4;
      localzavn.f = (paramInt1 + 1);
      return localzavn;
    case '时': 
      localzavn = new zavn();
      localzavn.a = 8;
      localzavn.f = (paramInt1 + 1);
      return localzavn;
    case '分': 
      localzavn = new zavn();
      localzavn.a = 16;
      localzavn.f = (paramInt1 + 1);
      return localzavn;
    case '秒': 
      localzavn = new zavn();
      localzavn.a = 32;
      localzavn.f = (paramInt1 + 1);
      return localzavn;
    }
    return null;
  }
  
  public int a(char[] paramArrayOfChar, int paramInt, StringBuilder paramStringBuilder)
  {
    if (a(paramArrayOfChar, paramInt, znq.b))
    {
      paramStringBuilder.append(znq.b);
      paramStringBuilder.append('/');
      paramStringBuilder.append(znq.c);
      return znq.b.length;
    }
    if ((paramArrayOfChar[paramInt] | 0x20) == 'a')
    {
      paramInt++;
      if (paramInt == paramArrayOfChar.length)
      {
        paramStringBuilder.append(paramArrayOfChar[(paramInt - 1)]);
        paramStringBuilder.append('/');
        paramStringBuilder.append(paramArrayOfChar[(paramInt - 1)] == 'A' ? 'P' : 'p');
        return 1;
      }
      switch (paramArrayOfChar[paramInt])
      {
      case 'M': 
      case 'm': 
        paramInt++;
        if ((paramInt == paramArrayOfChar.length) || (paramArrayOfChar[paramInt] == ' '))
        {
          paramStringBuilder.append(paramArrayOfChar, paramInt - 2, 2);
          paramStringBuilder.append('/');
          paramStringBuilder.append(paramArrayOfChar[(paramInt - 2)] == 'A' ? 'P' : 'p');
          paramStringBuilder.append(paramArrayOfChar[(paramInt - 1)]);
          return 2;
        }
        return 0;
      case ' ': 
        paramStringBuilder.append(paramArrayOfChar[(paramInt - 1)]);
        paramStringBuilder.append('/');
        paramStringBuilder.append(paramArrayOfChar[(paramInt - 1)] == 'A' ? 'P' : 'p');
        return 1;
      }
    }
    return 0;
  }
  
  public int b(char[] paramArrayOfChar, int paramInt, StringBuilder paramStringBuilder)
  {
    if (a(paramArrayOfChar, paramInt, znq.c))
    {
      paramStringBuilder.append(znq.b);
      paramStringBuilder.append('/');
      paramStringBuilder.append(znq.c);
      return znq.c.length;
    }
    if ((paramArrayOfChar[paramInt] | 0x20) == 'p')
    {
      paramInt++;
      if (paramInt == paramArrayOfChar.length)
      {
        paramStringBuilder.append(paramArrayOfChar[(paramInt - 1)] == 'P' ? 'A' : 'a');
        paramStringBuilder.append('/');
        paramStringBuilder.append(paramArrayOfChar[(paramInt - 1)]);
        return 1;
      }
      switch (paramArrayOfChar[paramInt])
      {
      case 'M': 
      case 'm': 
        paramInt++;
        if ((paramInt == paramArrayOfChar.length) || (paramArrayOfChar[paramInt] == ' '))
        {
          paramStringBuilder.append(paramArrayOfChar[(paramInt - 2)] == 'P' ? 'A' : 'a');
          paramStringBuilder.append(paramArrayOfChar[(paramInt - 1)]);
          paramStringBuilder.append('/');
          paramStringBuilder.append(paramArrayOfChar, paramInt - 2, 2);
          return 2;
        }
        return 0;
      case ' ': 
        paramStringBuilder.append(paramArrayOfChar[(paramInt - 1)] == 'P' ? 'A' : 'a');
        paramStringBuilder.append('/');
        paramStringBuilder.append(paramArrayOfChar[(paramInt - 1)]);
        return 1;
      }
    }
    return 0;
  }
  
  private boolean a(char[] paramArrayOfChar1, int paramInt, char[] paramArrayOfChar2)
  {
    if (paramArrayOfChar2 == null) {
      return false;
    }
    if (paramInt + paramArrayOfChar2.length > paramArrayOfChar1.length) {
      return false;
    }
    for (int i = 0; i < paramArrayOfChar2.length; i++) {
      if (paramArrayOfChar1[(paramInt + i)] != paramArrayOfChar2[i]) {
        return false;
      }
    }
    return true;
  }
  
  public int f(char[] paramArrayOfChar, int paramInt)
  {
    if (paramInt + 3 > paramArrayOfChar.length) {
      return 0;
    }
    if (this.g)
    {
      int i = g(paramArrayOfChar, paramInt);
      if (i != 0) {
        return i;
      }
    }
    if (this.h) {
      return 0;
    }
    int m;
    if (this.e == null)
    {
      this.e = new zahi[12];
      this.f = new zahi[12];
      DateTime localDateTime = new DateTime(2000, 1, 10);
      com.aspose.cells.b.a.c.za localza = this.a.c();
      for (m = 0; m < 12; m++)
      {
        String str1 = localDateTime.a("MMMM", localza);
        this.e[m] = ziv.a(str1, true);
        String str2 = localDateTime.a("MMM", localza);
        if ((str2.length() != 3) || (!str1.startsWith(str2))) {
          this.f[m] = ziv.a(str2, true);
        }
        localDateTime = localDateTime.addMonths(1);
      }
    }
    for (int j = 0; j < 12; j++)
    {
      int k = this.e[j].a(paramArrayOfChar, paramInt);
      m = this.e[j].a();
      if (k == m) {
        return j + 1 << 28 | k;
      }
      if (this.f[j] != null)
      {
        k = this.f[j].a(paramArrayOfChar, paramInt);
        m = this.f[j].a();
        if (k == m) {
          return j + 1 << 28 | k;
        }
      }
      else if (k >= 3)
      {
        return j + 1 << 28 | 0x3;
      }
    }
    return 0;
  }
  
  private int g(char[] paramArrayOfChar, int paramInt)
  {
    int i;
    switch (paramArrayOfChar[paramInt])
    {
    case 'J': 
    case 'j': 
      switch (paramArrayOfChar[(paramInt + 1)])
      {
      case 'A': 
      case 'a': 
        if ((paramArrayOfChar[(paramInt + 2)] | 0x20) == 'n')
        {
          i = 268435456;
          if ((paramInt + 6 < paramArrayOfChar.length) && ((paramArrayOfChar[(paramInt + 3)] | 0x20) == 'u') && ((paramArrayOfChar[(paramInt + 4)] | 0x20) == 'a') && ((paramArrayOfChar[(paramInt + 5)] | 0x20) == 'r') && ((paramArrayOfChar[(paramInt + 6)] | 0x20) == 'y')) {
            return i | 0x7;
          }
          return i | 0x3;
        }
        break;
      case 'U': 
      case 'u': 
        switch (paramArrayOfChar[(paramInt + 2)])
        {
        case 'L': 
        case 'l': 
          i = 1879048192;
          if ((paramInt + 3 < paramArrayOfChar.length) && ((paramArrayOfChar[(paramInt + 3)] | 0x20) == 'y')) {
            return i | 0x4;
          }
          return i | 0x3;
        case 'N': 
        case 'n': 
          i = 1610612736;
          if ((paramInt + 3 < paramArrayOfChar.length) && ((paramArrayOfChar[(paramInt + 3)] | 0x20) == 'e')) {
            return i | 0x4;
          }
          return i | 0x3;
        }
      }
      break;
    case 'F': 
    case 'f': 
      if (((paramArrayOfChar[(paramInt + 1)] | 0x20) == 'e') && ((paramArrayOfChar[(paramInt + 2)] | 0x20) == 'b'))
      {
        i = 536870912;
        if ((paramInt + 7 < paramArrayOfChar.length) && ((paramArrayOfChar[(paramInt + 3)] | 0x20) == 'r') && ((paramArrayOfChar[(paramInt + 4)] | 0x20) == 'u') && ((paramArrayOfChar[(paramInt + 5)] | 0x20) == 'a') && ((paramArrayOfChar[(paramInt + 6)] | 0x20) == 'r') && ((paramArrayOfChar[(paramInt + 7)] | 0x20) == 'y')) {
          return i | 0x8;
        }
        return i | 0x3;
      }
      break;
    case 'M': 
    case 'm': 
      if ((paramArrayOfChar[(paramInt + 1)] | 0x20) == 'a') {
        switch (paramArrayOfChar[(paramInt + 2)])
        {
        case 'R': 
        case 'r': 
          i = 805306368;
          if ((paramInt + 4 < paramArrayOfChar.length) && ((paramArrayOfChar[(paramInt + 3)] | 0x20) == 'c') && ((paramArrayOfChar[(paramInt + 4)] | 0x20) == 'h')) {
            return i | 0x5;
          }
          return i | 0x3;
        case 'Y': 
        case 'y': 
          i = 1342177280;
          return i | 0x3;
        }
      }
      break;
    case 'A': 
    case 'a': 
      switch (paramArrayOfChar[(paramInt + 1)])
      {
      case 'P': 
      case 'p': 
        if ((paramArrayOfChar[(paramInt + 2)] | 0x20) == 'r')
        {
          i = 1073741824;
          if ((paramInt + 4 < paramArrayOfChar.length) && ((paramArrayOfChar[(paramInt + 3)] | 0x20) == 'i') && ((paramArrayOfChar[(paramInt + 4)] | 0x20) == 'l')) {
            return i | 0x5;
          }
          return i | 0x3;
        }
        break;
      case 'U': 
      case 'u': 
        if ((paramArrayOfChar[(paramInt + 2)] | 0x20) == 'g')
        {
          i = Integer.MIN_VALUE;
          if ((paramInt + 5 < paramArrayOfChar.length) && ((paramArrayOfChar[(paramInt + 3)] | 0x20) == 'u') && ((paramArrayOfChar[(paramInt + 4)] | 0x20) == 's') && ((paramArrayOfChar[(paramInt + 5)] | 0x20) == 't')) {
            return i | 0x6;
          }
          return i | 0x3;
        }
        break;
      }
      break;
    case 'S': 
    case 's': 
      if (((paramArrayOfChar[(paramInt + 1)] | 0x20) == 'e') && ((paramArrayOfChar[(paramInt + 2)] | 0x20) == 'p'))
      {
        i = -1879048192;
        if ((paramInt + 8 < paramArrayOfChar.length) && ((paramArrayOfChar[(paramInt + 3)] | 0x20) == 't') && ((paramArrayOfChar[(paramInt + 4)] | 0x20) == 'e') && ((paramArrayOfChar[(paramInt + 5)] | 0x20) == 'm') && ((paramArrayOfChar[(paramInt + 6)] | 0x20) == 'b') && ((paramArrayOfChar[(paramInt + 7)] | 0x20) == 'e') && ((paramArrayOfChar[(paramInt + 8)] | 0x20) == 'r')) {
          return i | 0x9;
        }
        return i | 0x3;
      }
      break;
    case 'O': 
    case 'o': 
      if (((paramArrayOfChar[(paramInt + 1)] | 0x20) == 'c') && ((paramArrayOfChar[(paramInt + 2)] | 0x20) == 't'))
      {
        i = -1610612736;
        if ((paramInt + 6 < paramArrayOfChar.length) && ((paramArrayOfChar[(paramInt + 3)] | 0x20) == 'o') && ((paramArrayOfChar[(paramInt + 4)] | 0x20) == 'b') && ((paramArrayOfChar[(paramInt + 5)] | 0x20) == 'e') && ((paramArrayOfChar[(paramInt + 6)] | 0x20) == 'r')) {
          return i | 0x7;
        }
        return i | 0x3;
      }
      break;
    case 'N': 
    case 'n': 
      if (((paramArrayOfChar[(paramInt + 1)] | 0x20) == 'o') && ((paramArrayOfChar[(paramInt + 2)] | 0x20) == 'v'))
      {
        i = -1342177280;
        if ((paramInt + 7 < paramArrayOfChar.length) && ((paramArrayOfChar[(paramInt + 3)] | 0x20) == 'e') && ((paramArrayOfChar[(paramInt + 4)] | 0x20) == 'm') && ((paramArrayOfChar[(paramInt + 5)] | 0x20) == 'b') && ((paramArrayOfChar[(paramInt + 6)] | 0x20) == 'e') && ((paramArrayOfChar[(paramInt + 7)] | 0x20) == 'r')) {
          return i | 0x8;
        }
        return i | 0x3;
      }
      break;
    case 'D': 
    case 'd': 
      if (((paramArrayOfChar[(paramInt + 1)] | 0x20) == 'e') && ((paramArrayOfChar[(paramInt + 2)] | 0x20) == 'c'))
      {
        i = -1073741824;
        if ((paramInt + 7 < paramArrayOfChar.length) && ((paramArrayOfChar[(paramInt + 3)] | 0x20) == 'e') && ((paramArrayOfChar[(paramInt + 4)] | 0x20) == 'm') && ((paramArrayOfChar[(paramInt + 5)] | 0x20) == 'b') && ((paramArrayOfChar[(paramInt + 6)] | 0x20) == 'e') && ((paramArrayOfChar[(paramInt + 7)] | 0x20) == 'r')) {
          return i | 0x8;
        }
        return i | 0x3;
      }
      break;
    }
    return 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */