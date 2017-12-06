package com.aspose.cells;

import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.d.zn;
import com.aspose.cells.b.a.d.zo;
import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;

class zayg
{
  public static zm a(zm paramzm, Encoding paramEncoding)
    throws Exception
  {
    zh localzh = new zh();
    zo localzo = new zo(localzh, paramEncoding);
    zn localzn = new zn(paramzm, paramEncoding);
    int i = 1;
    int j = localzn.d();
    char c2;
    for (char c1 = (char)j; localzn.c() != -1; c1 = c2)
    {
      int k = localzn.d();
      c2 = (char)k;
      if (((c1 < '!') || (c1 > '~') || (c1 == '=')) && (c1 != '\r') && (c1 != '\n') && (c1 != ' '))
      {
        String str = ze.a(c1, 16);
        if (c1 < '\020')
        {
          localzo.a("=0" + str);
          i += 2;
        }
        else if (c1 > '')
        {
          localzo.a(c1);
          i++;
        }
        else
        {
          localzo.a("=" + str);
          i += str.length();
        }
      }
      else if (k > -1)
      {
        c2 = (char)k;
        if ((c1 == '\t') && ((c2 == '\n') || (c2 == '\r')))
        {
          localzo.a("=09");
          i += 2;
        }
        else if ((c1 == ' ') && ((c2 == '\n') || (c2 == '\r')))
        {
          localzo.a("=09");
          i += 2;
        }
        else
        {
          localzo.a(c1);
        }
      }
      else
      {
        localzo.a(c1);
      }
      if ((c1 != '\r') && (c1 != '\n')) {
        i++;
      }
      if ((c1 == '\r') && (c2 == '\n')) {
        i = 1;
      }
      if (i >= 75)
      {
        localzo.a("=\r\n");
        i = 1;
      }
      j = k;
    }
    localzo.c();
    localzh.b(0L);
    return localzh;
  }
  
  public static zm b(zm paramzm, Encoding paramEncoding)
    throws Exception
  {
    zh localzh = new zh();
    zo localzo = new zo(localzh, paramEncoding);
    zn localzn = new zn(paramzm, paramEncoding);
    while (localzn.c() != -1)
    {
      char c = (char)localzn.d();
      if (c == '=')
      {
        if (!a(c, localzn, localzo, paramEncoding)) {}
      }
      else {
        b(c, localzn, localzo, paramEncoding);
      }
      localzo.c();
    }
    localzh.b(0L);
    return localzh;
  }
  
  private static boolean a(char paramChar, zn paramzn, zo paramzo, Encoding paramEncoding)
    throws Exception
  {
    char c1 = (char)paramzn.d();
    char c2 = (char)paramzn.d();
    if ((c1 != '\r') || (c2 != '\n'))
    {
      if ((!a(c1)) || (!a(c2)))
      {
        paramzo.a(paramChar);
        paramzo.a(c1);
        paramzo.a(c2);
        return true;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(c1);
      localStringBuilder.append(c2);
      for (paramChar = (char)paramzn.d(); paramChar == '='; paramChar = (char)paramzn.d())
      {
        c1 = (char)paramzn.d();
        c2 = (char)paramzn.d();
        if ((c1 != '\r') || (c2 != '\n'))
        {
          localStringBuilder.append(c1);
          localStringBuilder.append(c2);
        }
      }
      if (!zs.a(localStringBuilder).equals("")) {
        paramzo.a(a(zs.a(localStringBuilder), paramEncoding.b()));
      }
      b(paramChar, paramzn, paramzo, paramEncoding);
    }
    return false;
  }
  
  private static void b(char paramChar, zn paramzn, zo paramzo, Encoding paramEncoding)
    throws Exception
  {
    if ((paramChar == '\r') && ((char)paramzn.d() == '\n'))
    {
      int i = paramzn.d();
      if (i != -1)
      {
        if (i == 32)
        {
          int j = paramzn.d();
          if ((j != -1) && (j == 32))
          {
            paramzo.a(' ');
          }
          else
          {
            paramzo.a('\r');
            paramzo.a('\n');
            if ((char)j == '=') {
              a('=', paramzn, paramzo, paramEncoding);
            } else {
              paramzo.a((char)j);
            }
          }
        }
        else
        {
          paramzo.a('\r');
          paramzo.a('\n');
          if ((char)i == '=') {
            a('=', paramzn, paramzo, paramEncoding);
          } else {
            paramzo.a((char)i);
          }
        }
      }
      else
      {
        paramzo.a('\r');
        paramzo.a('\n');
      }
    }
    else
    {
      paramzo.a(paramChar);
    }
  }
  
  private static boolean a(char paramChar)
  {
    return ((paramChar >= '0') && (paramChar <= '9')) || ((paramChar >= 'a') && (paramChar <= 'f')) || ((paramChar >= 'A') && (paramChar <= 'F'));
  }
  
  private static String a(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      throw new IllegalArgumentException("hex");
    }
    paramString1 = zw.a(paramString1, ",", "");
    paramString1 = zw.a(paramString1, "\n", "");
    paramString1 = zw.a(paramString1, "\\", "");
    paramString1 = zw.a(paramString1, " ", "");
    if (paramString1.length() % 2 != 0) {
      paramString1 = paramString1 + "20";
    }
    byte[] arrayOfByte = new byte[paramString1.length() / 2];
    for (int i = 0; i < arrayOfByte.length; i++) {
      try
      {
        arrayOfByte[i] = ((byte)Short.parseShort(paramString1.substring(i * 2, i * 2 + 2), 16));
      }
      catch (Exception localException)
      {
        throw new IllegalArgumentException("hex is not a valid hex number!\\r\\nParameter name: \"hex");
      }
    }
    Encoding localEncoding = Encoding.getEncoding(paramString2);
    return localEncoding.a(arrayOfByte);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zayg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */