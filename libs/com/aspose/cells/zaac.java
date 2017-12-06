package com.aspose.cells;

import com.aspose.cells.b.a.zs;

class zaac
{
  static String a(DateTime paramDateTime)
  {
    return paramDateTime.toUniversalTime().a("yyyy-MM-dd\\THH:mm:ss\\Z", com.aspose.cells.b.a.c.za.b());
  }
  
  public static zavp a(String paramString, zzx paramzzx)
  {
    zik localzik = paramzzx.h();
    Object localObject = localzik.parseObject(paramString);
    if (localObject != null) {
      return localzik.a();
    }
    zhz localzhz = paramzzx.i();
    localObject = localzhz.parseObject(paramString);
    if (localObject != null)
    {
      zavo localzavo = localzhz.a();
      if (localzavo.a(paramzzx)) {
        return localzavo;
      }
    }
    return null;
  }
  
  public static String a(String paramString, zzx paramzzx, boolean paramBoolean)
  {
    com.aspose.cells.a.a.za localza = paramzzx.f();
    int i = !localza.a() ? 1 : 0;
    short s = paramzzx.e();
    Object localObject = null;
    switch (s)
    {
    case 12: 
    case 1036: 
    case 2060: 
    case 4108: 
      localObject = new zbbo();
      break;
    case 25: 
    case 35: 
    case 1049: 
    case 1059: 
    case 1092: 
      localObject = new zbbq();
      break;
    case 6: 
    case 1030: 
      localObject = new zbbl();
      break;
    default: 
      if (zamr.a((short)16, s)) {
        localObject = new zbbp();
      } else if (zamr.a((short)7, s)) {
        localObject = new zbbm();
      } else if ((zamr.a((short)17, s)) || (zamr.a((short)2052, s))) {
        localObject = new zbbn();
      } else if (i == 0) {
        return paramString;
      }
      break;
    }
    if ((i == 0) && (localObject == null)) {
      return paramString;
    }
    char c1;
    char c3;
    char c5;
    char c2;
    char c4;
    char c6;
    if (paramBoolean)
    {
      c1 = localza.d();
      c3 = localza.e();
      c5 = localza.g();
      c2 = '.';
      c4 = ',';
      c6 = '/';
    }
    else
    {
      c1 = '.';
      c3 = ',';
      c5 = '/';
      c2 = localza.d();
      c4 = localza.e();
      c6 = localza.g();
    }
    char[] arrayOfChar = paramString.toCharArray();
    StringBuilder localStringBuilder = new StringBuilder(arrayOfChar.length << 1);
    zzv localzzv = new zzv();
    int j = 0;
    int k = 0;
    int m = 0;
    int n = -1;
    int i1 = 0;
    while (i1 < arrayOfChar.length)
    {
      char c7 = arrayOfChar[i1];
      int i2;
      if (i != 0) {
        switch (c7)
        {
        case ';': 
          localStringBuilder.append(c7);
          if (k != 0) {
            k = 0;
          } else if (n > -1) {
            localStringBuilder.setCharAt(n, c1);
          }
          j = 0;
          m = 0;
          n = -1;
          i1++;
          break;
        case '#': 
        case '0': 
          if ((j == 0) && (k == 0))
          {
            k = 1;
            if ((i1 > 0) && (arrayOfChar[(i1 - 1)] == c1))
            {
              n = localStringBuilder.length() - 1;
              localStringBuilder.setCharAt(n, c2);
            }
          }
          localStringBuilder.append(c7);
          i1++;
          break;
        case 'D': 
        case 'H': 
        case 'M': 
        case 'S': 
        case 'Y': 
        case 'd': 
        case 'h': 
        case 'm': 
        case 's': 
        case 'y': 
          if (localObject != null)
          {
            localzzv.a();
            if (paramBoolean) {
              i1 = ((zaix)localObject).a(arrayOfChar, i1, arrayOfChar.length, localStringBuilder, localzzv);
            } else {
              i1 = ((zaix)localObject).b(arrayOfChar, i1, arrayOfChar.length, localStringBuilder, localzzv);
            }
            if (localzzv.a == 48) {
              continue;
            }
            m = 1;
            k = 0;
            j = 1;
            continue;
          }
          m = 1;
          k = 0;
          j = 1;
          localStringBuilder.append(c7);
          i1++;
          break;
        case 'G': 
        case 'g': 
          if (a(arrayOfChar, i1, arrayOfChar.length))
          {
            localStringBuilder.append(arrayOfChar, i1, 7);
            i1 += 7;
            continue;
          }
          if (localObject != null)
          {
            localzzv.a();
            if (paramBoolean) {
              i1 = ((zaix)localObject).a(arrayOfChar, i1, arrayOfChar.length, localStringBuilder, localzzv);
            } else {
              i1 = ((zaix)localObject).b(arrayOfChar, i1, arrayOfChar.length, localStringBuilder, localzzv);
            }
            if (localzzv.a == 48) {
              continue;
            }
            m = 1;
            k = 0;
            j = 1;
            continue;
          }
          m = 1;
          k = 0;
          j = 1;
          localStringBuilder.append(c7);
          i1++;
          break;
        case 'A': 
        case 'a': 
          i2 = b(arrayOfChar, i1, arrayOfChar.length);
          if (i2 > 0)
          {
            localStringBuilder.append(arrayOfChar, i1, i2);
            i1 += i2;
            m = 1;
            k = 0;
            j = 1;
          }
          break;
        default: 
          if (m != 0)
          {
            if (c7 == c5)
            {
              localStringBuilder.append(c6);
              i1++;
            }
          }
          else if (k != 0)
          {
            if (c7 == c1)
            {
              if (n < 0)
              {
                n = localStringBuilder.length();
                localStringBuilder.append(c2);
              }
              else
              {
                localStringBuilder.append(c7);
                j = 1;
                k = 0;
              }
              i1++;
              continue;
            }
            if (c7 == c3)
            {
              localStringBuilder.append(c4);
              i1++;
              continue;
            }
          }
          if (localObject != null) {
            break label1174;
          }
          i1 = zl.c(arrayOfChar, i1, arrayOfChar.length, localStringBuilder);
          break;
        }
      } else {
        switch (c7)
        {
        case 'G': 
        case 'g': 
          if (a(arrayOfChar, i1, arrayOfChar.length))
          {
            localStringBuilder.append(arrayOfChar, i1, 7);
            i1 += 7;
          }
          break;
        case 'A': 
        case 'a': 
          i2 = b(arrayOfChar, i1, arrayOfChar.length);
          if (i2 > 0)
          {
            localStringBuilder.append(arrayOfChar, i1, i2);
            i1 += i2;
          }
          break;
        default: 
          label1174:
          localzzv.a();
          if (paramBoolean) {
            i1 = ((zaix)localObject).a(arrayOfChar, i1, arrayOfChar.length, localStringBuilder, localzzv);
          } else {
            i1 = ((zaix)localObject).b(arrayOfChar, i1, arrayOfChar.length, localStringBuilder, localzzv);
          }
          if ((i != 0) && (localzzv.b()))
          {
            m = 1;
            k = 0;
            j = 1;
          }
          break;
        }
      }
    }
    if ((j != 0) && (n > -1)) {
      localStringBuilder.setCharAt(n, c1);
    }
    return zs.a(localStringBuilder);
  }
  
  static boolean a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    return (paramInt1 + 6 < paramArrayOfChar.length) && ((paramArrayOfChar[(paramInt1 + 1)] | 0x20) == 'e') && ((paramArrayOfChar[(paramInt1 + 2)] | 0x20) == 'n') && ((paramArrayOfChar[(paramInt1 + 3)] | 0x20) == 'e') && ((paramArrayOfChar[(paramInt1 + 4)] | 0x20) == 'r') && ((paramArrayOfChar[(paramInt1 + 5)] | 0x20) == 'a') && ((paramArrayOfChar[(paramInt1 + 6)] | 0x20) == 'l');
  }
  
  static int b(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (paramInt1 + 4 < paramArrayOfChar.length)
    {
      if (paramArrayOfChar[(paramInt1 + 2)] == '/')
      {
        if (((paramArrayOfChar[(paramInt1 + 1)] | 0x20) == 'm') && ((paramArrayOfChar[(paramInt1 + 3)] | 0x20) == 'p') && ((paramArrayOfChar[(paramInt1 + 4)] | 0x20) == 'm')) {
          return 5;
        }
      }
      else if ((paramArrayOfChar[(paramInt1 + 1)] == '/') && ((paramArrayOfChar[(paramInt1 + 2)] | 0x20) == 'p')) {
        return 3;
      }
    }
    else if ((paramInt1 + 2 < paramArrayOfChar.length) && (paramArrayOfChar[(paramInt1 + 1)] == '/') && ((paramArrayOfChar[(paramInt1 + 2)] | 0x20) == 'p')) {
      return 3;
    }
    return -1;
  }
  
  public static void a(int paramInt1, int paramInt2, StringBuilder paramStringBuilder)
  {
    int i = paramStringBuilder.length();
    paramStringBuilder.append(paramInt1);
    if (paramInt1 < 0) {
      i++;
    }
    paramInt2 -= paramStringBuilder.length() - i;
    switch (paramInt2)
    {
    case 0: 
      break;
    case 1: 
      paramStringBuilder.insert(i, '0');
      break;
    case 2: 
      paramStringBuilder.insert(i, "00");
      break;
    case 3: 
      paramStringBuilder.insert(i, "000");
      break;
    case 4: 
      paramStringBuilder.insert(i, "0000");
      break;
    case 5: 
      paramStringBuilder.insert(i, "00000");
      break;
    case 6: 
      paramStringBuilder.insert(i, "000000");
      break;
    case 7: 
      paramStringBuilder.insert(i, "0000000");
      break;
    case 8: 
      paramStringBuilder.insert(i, "00000000");
      break;
    case 9: 
      paramStringBuilder.insert(i, "000000000");
      break;
    case 10: 
      paramStringBuilder.insert(i, "0000000000");
      break;
    default: 
      if (paramInt2 >= 0)
      {
        String str = paramStringBuilder.substring(i, i + (paramStringBuilder.length() - i));
        paramStringBuilder.setLength(i);
        while (paramInt2 > 0)
        {
          paramStringBuilder.append('0');
          paramInt2--;
        }
        paramStringBuilder.append(str);
      }
      break;
    }
  }
  
  public static void a(DateTime paramDateTime, StringBuilder paramStringBuilder)
  {
    a(paramDateTime.getYear(), 4, paramStringBuilder);
    paramStringBuilder.append('-');
    a(paramDateTime.getMonth(), 2, paramStringBuilder);
    paramStringBuilder.append('-');
    a(paramDateTime.getDay(), 2, paramStringBuilder);
    paramStringBuilder.append('T');
    a(paramDateTime.getHour(), 2, paramStringBuilder);
    paramStringBuilder.append(':');
    a(paramDateTime.getMinute(), 2, paramStringBuilder);
    paramStringBuilder.append(':');
    a(paramDateTime.getSecond(), 2, paramStringBuilder);
    paramStringBuilder.append('Z');
  }
  
  public static void b(DateTime paramDateTime, StringBuilder paramStringBuilder)
  {
    a(paramDateTime.getYear(), 4, paramStringBuilder);
    a(paramDateTime.getMonth(), 2, paramStringBuilder);
    a(paramDateTime.getDay(), 2, paramStringBuilder);
    a(paramDateTime.getHour(), 2, paramStringBuilder);
    a(paramDateTime.getMinute(), 2, paramStringBuilder);
    a(paramDateTime.getSecond(), 2, paramStringBuilder);
    paramStringBuilder.append('Z');
  }
  
  public static boolean a(String paramString)
  {
    int i = paramString.indexOf('@');
    if (i < 0) {
      return false;
    }
    if (i == 0) {
      return true;
    }
    char[] arrayOfChar = paramString.toCharArray();
    i = 0;
    do
    {
      i = zl.a(arrayOfChar, i, arrayOfChar.length);
      if (i >= arrayOfChar.length) {
        return false;
      }
    } while (arrayOfChar[i] != '@');
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */