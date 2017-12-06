package com.aspose.cells.a.b.a;

import com.aspose.cells.DateTime;
import com.aspose.cells.b.a.zl;

public abstract class zc
{
  private static String[] a = { "HH:mm:s.fffffffzzz", "HH:mm:s.fffffff", "HH:mm:s tt zzz", "HH:mm:szzz", "HH:mm:ss", "HH:mzzz", "HH:mm", "HH tt", "HH'時'mm'分'ss'秒'" };
  private static String[] b = { "yyyy/M/dT", "M/yyyy/dT", "yyyy'年'M'月'd'日", "yyyy/d/MMMM", "yyyy/MMM/d", "d/MMMM/yyyy", "MMM/d/yyyy", "d/yyyy/MMMM", "MMM/yyyy/d", "yy/d/M" };
  private static String[] c = { "yyyy/M/dT", "M/yyyy/dT", "yyyy'年'M'月'd'日", "yyyy/MMMM/d", "yyyy/d/MMM", "MMMM/d/yyyy", "d/MMM/yyyy", "MMMM/yyyy/d", "d/yyyy/MMM", "yy/MMMM/d", "yy/d/MMM", "MMM/yy/d" };
  private static String[] d = { "yyyy/M/dT", "M/yyyy/dT", "yyyy'年'M'月'd'日", "yyyy/MMMM/d", "yyyy/d/MMM", "d/MMMM/yyyy", "MMM/d/yyyy", "MMMM/yyyy/d", "d/yyyy/MMM", "d/MMMM/yy", "yy/MMM/d", "d/yy/MMM", "yy/d/MMM", "MMM/d/yy", "MMM/yy/d" };
  private static String[] e = { "yyyy/M/dT", "M/yyyy/dT", "yyyy'年'M'月'd'日", "yyyy/MMMM/d", "yyyy/d/MMM", "MMMM/d/yyyy", "d/MMM/yyyy", "MMMM/yyyy/d", "d/yyyy/MMM", "MMMM/d/yy", "MMM/yy/d", "d/MMM/yy", "yy/MMM/d", "d/yy/MMM", "yy/d/MMM" };
  private static String[] f = { "MMMM/d", "d/MMM", "yyyy/MMMM" };
  private static String[] g = { "d/MMMM", "MMM/yy", "yyyy/MMMM" };
  
  private static zf a(String paramString1, String paramString2, String paramString3, boolean paramBoolean1, DateTime paramDateTime, zb paramzb, com.aspose.cells.b.a.c.zb paramzb1, zd paramzd, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    String str1 = null;
    String str2 = null;
    zf localzf = new zf();
    localzf.c(paramBoolean4);
    localzf.b(paramBoolean3);
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    localzf.a(new zb(0, zl.a));
    int i = (paramBoolean2) && ("".equals(paramString3)) ? 1 : 0;
    int j = (!paramBoolean1) && (paramString3 != null) ? 1 : 0;
    localzf.b(false);
    zg localzg1 = 0;
    String str3 = paramString2;
    int k = 0;
    com.aspose.cells.b.a.c.zb localzb = com.aspose.cells.b.a.c.zb.b();
    if (str3.length() == 1) {
      str3 = ze.a(str3.charAt(0), paramzb1, bool1, bool2);
    }
    localzf.a(new DateTime(0L));
    if (str3 == null)
    {
      localzf.a(false);
      return localzf;
    }
    if (paramzd.a())
    {
      str3 = str3.replaceAll("^\\s+", "");
      paramString1 = paramString1.replaceAll("^\\s+", "");
    }
    if (paramzd.b())
    {
      str3 = str3.replaceAll("\\s+$", "");
      paramString1 = paramString1.replaceAll("\\s+$", "");
    }
    if (bool2) {
      paramzb1 = localzb;
    }
    if (paramzd.c()) {
      bool3 = true;
    }
    String str4 = str3;
    int m = str3.length();
    zg localzg2 = 0;
    int n = 0;
    if (m == 0)
    {
      localzf.a(false);
      return localzf;
    }
    int i1 = -1;
    int i2 = -1;
    int i3 = -1;
    int i4 = -1;
    int i5 = -1;
    int i6 = -1;
    int i7 = -1;
    double d1 = -1.0D;
    int i8 = -1;
    int i9 = -1;
    int i10 = -1;
    int i11 = -1;
    int i12 = 1;
    while (localzg1 != paramString1.length())
    {
      int i13 = 0;
      boolean bool5;
      zg localzg3;
      if ((j != 0) && (localzg2 + n == 0))
      {
        bool5 = a(paramString1, localzg1);
        if (bool5)
        {
          if (paramString1.charAt(localzg1) == 'Z') {
            i13 = 1;
          } else {
            i13 = a(paramString1, localzg1, 0, "GMT").b();
          }
          if ((i13 > 0) && (!a(paramString1, localzg1 + i13)))
          {
            localzg1 += i13;
            bool1 = true;
            continue;
          }
        }
        localzg3 = a(paramString1, localzg1, 0, paramzb1, paramBoolean1, i8);
        i13 = localzg3.b();
        i8 = localzg3.c();
        if (localzg3.a()) {
          if ("".equals(paramString3))
          {
            if ((i5 == -1) && (i6 == -1) && (i7 == -1)) {
              str1 = "Am/Pm " + paramString2;
            } else {
              str1 = paramString2 + " Am/Pm";
            }
          }
          else if ((i5 == -1) && (i6 == -1) && (i7 == -1)) {
            str1 = paramString2 + " Am/Pm " + paramString3;
          } else {
            str1 = paramString2 + " " + paramString3 + " Am/Pm";
          }
        }
        if ((k == 0) && (localzg3.a())) {
          if (a(paramString1, localzg1 + i13))
          {
            i8 = -1;
          }
          else if (i13 > 0)
          {
            localzg1 += i13;
            continue;
          }
        }
        if ((k == 0) && (i2 == -1) && (bool5))
        {
          localzg3 = a(paramString1, localzg1, com.aspose.cells.b.a.c.zb.a, com.aspose.cells.b.a.c.zb.a, paramBoolean1);
          i2 = localzg3.d();
          i13 = localzg3.b();
          if (i2 == -1)
          {
            localzg3 = a(paramString1, localzg1, com.aspose.cells.b.a.c.zb.b, com.aspose.cells.b.a.c.zb.b, paramBoolean1);
            i2 = localzg3.d();
            i13 = localzg3.b();
          }
          if ((i2 != -1) && (!a(paramString1, localzg1 + i13))) {
            localzg1 += i13;
          } else {
            i2 = -1;
          }
        }
        else if ((Character.isWhitespace(paramString1.charAt(localzg1))) || (paramString1.charAt(localzg1) == ','))
        {
          localzg1++;
        }
        else
        {
          i13 = 0;
        }
      }
      else if (localzg2 + n >= m)
      {
        if ((j == 0) || (n != 0)) {
          break;
        }
        k = (i12 != 0) && (paramString2.charAt(paramString2.length() - 1) == 'T') ? 1 : 0;
        if ((i12 == 0) && (str3 == "")) {
          break;
        }
        localzg2 = 0;
        if (i12 != 0) {
          str3 = paramString3;
        } else {
          str3 = "";
        }
        str4 = str3;
        m = str4.length();
        i12 = 0;
        if ((!paramBoolean2) || (str3 == "")) {
          i = 1;
        }
      }
      else
      {
        bool5 = true;
        if (str4.charAt(localzg2) == '\'')
        {
          for (n = 1; (localzg2 + n < m) && (str4.charAt(localzg2 + n) != '\''); n++)
          {
            if ((localzg1 == paramString1.length()) || (paramString1.charAt(localzg1) != str4.charAt(localzg2 + n)))
            {
              localzf.a(false);
              return localzf;
            }
            localzg1++;
          }
          localzg2 += n + 1;
          n = 0;
        }
        else if (str4.charAt(localzg2) == '"')
        {
          for (n = 1; (localzg2 + n < m) && (str4.charAt(localzg2 + n) != '"'); n++)
          {
            if ((localzg1 == paramString1.length()) || (paramString1.charAt(localzg1) != str4.charAt(localzg2 + n)))
            {
              localzf.a(false);
              return localzf;
            }
            localzg1++;
          }
          localzg2 += n + 1;
          n = 0;
        }
        else if (str4.charAt(localzg2) == '\\')
        {
          localzg2 += n + 1;
          n = 0;
          if (localzg2 >= m)
          {
            localzf.a(false);
            return localzf;
          }
          if (paramString1.charAt(localzg1) != str4.charAt(localzg2))
          {
            localzf.a(false);
            return localzf;
          }
          localzg1++;
          localzg2++;
        }
        else if (str4.charAt(localzg2) == '%')
        {
          localzg2++;
        }
        else if ((Character.isWhitespace(paramString1.charAt(localzg1))) || ((paramString1.charAt(localzg1) == ',') && (((!paramBoolean1) && (str4.charAt(localzg2) == '/')) || (Character.isWhitespace(str4.charAt(localzg2))))))
        {
          localzg1++;
          n = 0;
          if ((paramBoolean1) && (paramzd.c()))
          {
            if (!Character.isWhitespace(str4.charAt(localzg2)))
            {
              localzf.a(false);
              return localzf;
            }
            localzg2++;
          }
          else
          {
            for (localzg3 = localzg1; (localzg3 < paramString1.length()) && ((Character.isWhitespace(paramString1.charAt(localzg3))) || (paramString1.charAt(localzg3) == ',')); localzg3++) {}
            localzg1 = localzg3;
            for (localzg3 = localzg2; (localzg3 < str4.length()) && ((Character.isWhitespace(str4.charAt(localzg3))) || (str4.charAt(localzg3) == ',')); localzg3++) {}
            localzg2 = localzg3;
            if ((!paramBoolean1) && (localzg2 < str4.length()) && (str4.charAt(localzg2) == '/'))
            {
              zg localzg4 = b(paramString1, localzg1, paramzb1, paramBoolean1);
              i13 = localzg4.b();
              if (!localzg4.a()) {
                localzg2++;
              }
            }
          }
        }
        else if ((localzg2 + n + 1 < m) && (str4.charAt(localzg2 + n + 1) == str4.charAt(localzg2 + n)))
        {
          n++;
        }
        else
        {
          switch (str4.charAt(localzg2))
          {
          case 'd': 
            if (((n < 2) && (i1 != -1)) || ((n >= 2) && (i2 != -1)))
            {
              localzf.a(false);
              return localzf;
            }
            if (n == 0)
            {
              localzg3 = a(paramString1, localzg1, 1, 2, false, bool3);
              i1 = localzg3.d();
              i13 = localzg3.b();
            }
            else if (n == 1)
            {
              localzg3 = a(paramString1, localzg1, 1, 2, true, bool3);
              i1 = localzg3.d();
              i13 = localzg3.b();
            }
            else if (n == 2)
            {
              localzg3 = a(paramString1, localzg1, com.aspose.cells.b.a.c.zb.b, com.aspose.cells.b.a.c.zb.b, paramBoolean1);
              i2 = localzg3.d();
              i13 = localzg3.b();
            }
            else
            {
              localzg3 = a(paramString1, localzg1, com.aspose.cells.b.a.c.zb.a, com.aspose.cells.b.a.c.zb.a, paramBoolean1);
              i2 = localzg3.d();
              i13 = localzg3.b();
            }
            break;
          case 'M': 
            if (i3 != -1)
            {
              localzf.a(false);
              return localzf;
            }
            if (j != 0)
            {
              i13 = -1;
              if ((n == 0) || (n == 3))
              {
                localzg3 = a(paramString1, localzg1, 1, 2, false, bool3);
                i3 = localzg3.d();
                i13 = localzg3.b();
                if (i13 > 0) {
                  str2 = "M";
                }
              }
              if ((n > 1) && (i13 == -1))
              {
                localzg3 = a(paramString1, localzg1, com.aspose.cells.b.a.c.zb.c, com.aspose.cells.b.a.c.zb.c, paramBoolean1);
                i3 = localzg3.d() + 1;
                i13 = localzg3.b();
                if (i13 > 0) {
                  str2 = "MMMMM";
                }
              }
              if ((n > 1) && (i13 == -1))
              {
                localzg3 = a(paramString1, localzg1, com.aspose.cells.b.a.c.zb.d, com.aspose.cells.b.a.c.zb.d, paramBoolean1);
                i3 = localzg3.d() + 1;
                i13 = localzg3.b();
                if (i13 > 0) {
                  str2 = "MMM";
                }
              }
            }
            else if (n == 0)
            {
              localzg3 = a(paramString1, localzg1, 1, 2, false, bool3);
              i3 = localzg3.d();
              i13 = localzg3.b();
            }
            else if (n == 1)
            {
              localzg3 = a(paramString1, localzg1, 1, 2, true, bool3);
              i3 = localzg3.d();
              i13 = localzg3.b();
            }
            else if (n == 2)
            {
              localzg3 = a(paramString1, localzg1, com.aspose.cells.b.a.c.zb.d, com.aspose.cells.b.a.c.zb.d, paramBoolean1);
              i3 = localzg3.d() + 1;
              i13 = localzg3.b();
            }
            else
            {
              localzg3 = a(paramString1, localzg1, com.aspose.cells.b.a.c.zb.c, com.aspose.cells.b.a.c.zb.c, paramBoolean1);
              i3 = localzg3.d() + 1;
              i13 = localzg3.b();
            }
            break;
          case 'y': 
            if (i4 != -1)
            {
              localzf.a(false);
              return localzf;
            }
            if (n == 0)
            {
              localzg3 = a(paramString1, localzg1, 1, 2, false, bool3);
              i4 = localzg3.d();
              i13 = localzg3.b();
            }
            else if (n < 3)
            {
              localzg3 = a(paramString1, localzg1, 1, 2, true, bool3);
              i4 = localzg3.d();
              i13 = localzg3.b();
            }
            else
            {
              localzg3 = a(paramString1, localzg1, paramBoolean1 ? 4 : 3, 4, false, bool3);
              i4 = localzg3.d();
              i13 = localzg3.b();
              if ((i4 >= 1000) && (i13 == 4) && (!localzf.e()) && (paramString1.length() > 4 + localzg1))
              {
                localzg3 = a(paramString1, localzg1, 5, 5, false, bool3);
                int i15 = localzg3.d();
                localzf.c(i15 > 9999);
              }
              n = 3;
            }
            if ((i13 < 4) && (i4 < 100) && (i4 >= 0)) {
              i4 += (i4 < 30 ? 2000 : 1900);
            }
            break;
          case 'h': 
            if (i5 != -1)
            {
              localzf.a(false);
              return localzf;
            }
            if (n == 0)
            {
              localzg3 = a(paramString1, localzg1, 1, 2, false, bool3);
              i5 = localzg3.d();
              i13 = localzg3.b();
            }
            else
            {
              localzg3 = a(paramString1, localzg1, 1, 2, true, bool3);
              i5 = localzg3.d();
              i13 = localzg3.b();
            }
            if (i5 > 12)
            {
              localzf.a(false);
              return localzf;
            }
            if (i5 == 12) {
              i5 = 0;
            }
            break;
          case 'H': 
            if ((i5 != -1) || ((j == 0) && (i8 >= 0)))
            {
              localzf.a(false);
              return localzf;
            }
            if (n == 0)
            {
              localzg3 = a(paramString1, localzg1, 1, 2, false, bool3);
              i5 = localzg3.d();
              i13 = localzg3.b();
            }
            else
            {
              localzg3 = a(paramString1, localzg1, 1, 2, true, bool3);
              i5 = localzg3.d();
              i13 = localzg3.b();
            }
            if (i5 >= 24)
            {
              localzf.a(false);
              return localzf;
            }
            break;
          case 'm': 
            if (i6 != -1)
            {
              localzf.a(false);
              return localzf;
            }
            if (n == 0)
            {
              localzg3 = a(paramString1, localzg1, 1, 2, false, bool3);
              i6 = localzg3.d();
              i13 = localzg3.b();
            }
            else
            {
              localzg3 = a(paramString1, localzg1, 1, 2, true, bool3);
              i6 = localzg3.d();
              i13 = localzg3.b();
            }
            if (i6 >= 60)
            {
              localzf.a(false);
              return localzf;
            }
            break;
          case 's': 
            if (i7 != -1)
            {
              localzf.a(false);
              return localzf;
            }
            if (n == 0)
            {
              localzg3 = a(paramString1, localzg1, 1, 2, false, bool3);
              i7 = localzg3.d();
              i13 = localzg3.b();
            }
            else
            {
              localzg3 = a(paramString1, localzg1, 1, 2, true, bool3);
              i7 = localzg3.d();
              i13 = localzg3.b();
            }
            if (i7 >= 60)
            {
              localzf.a(false);
              return localzf;
            }
            break;
          case 'F': 
            bool5 = false;
          case 'f': 
            if ((n > 6) || (d1 != -1.0D))
            {
              localzf.a(false);
              return localzf;
            }
            localzg3 = a(paramString1, localzg1, 0, n + 1, bool5, bool3);
            double d2 = localzg3.d();
            i13 = localzg3.b();
            if (i13 == -1)
            {
              localzf.a(false);
              return localzf;
            }
            d1 = d2 / Math.pow(10.0D, i13);
            break;
          case 't': 
            localzg3 = a(paramString1, localzg1, n > 0 ? 0 : 1, paramzb1, paramBoolean1, i8);
            i13 = localzg3.b();
            i8 = localzg3.c();
            if (!localzg3.a())
            {
              localzf.a(false);
              return localzf;
            }
            if (!"".equals(paramString3))
            {
              if ((i5 == -1) && (i6 == -1) && (i7 == -1)) {
                str1 = paramString2 + " Am/Pm " + paramString3;
              } else {
                str1 = paramString2 + " " + paramString3 + " Am/Pm";
              }
            }
            else if ((i5 == -1) && (i6 == -1) && (i7 == -1)) {
              str1 = "Am/Pm " + paramString2;
            } else {
              str1 = paramString2 + " Am/Pm";
            }
            break;
          case 'z': 
            if (i9 != -1)
            {
              localzf.a(false);
              return localzf;
            }
            if (paramString1.charAt(localzg1) == '+')
            {
              i9 = 0;
            }
            else if (paramString1.charAt(localzg1) == '-')
            {
              i9 = 1;
            }
            else
            {
              localzf.a(false);
              return localzf;
            }
            localzg1++;
            if (n == 0)
            {
              localzg3 = a(paramString1, localzg1, 1, 2, false, bool3);
              i10 = localzg3.d();
              i13 = localzg3.b();
            }
            else if (n == 1)
            {
              localzg3 = a(paramString1, localzg1, 1, 2, true, bool3);
              i10 = localzg3.d();
              i13 = localzg3.b();
            }
            else
            {
              localzg3 = a(paramString1, localzg1, 1, 2, true, true);
              i10 = localzg3.d();
              i13 = localzg3.b();
              localzg1 += i13;
              if (i13 < 0)
              {
                localzf.a(false);
                return localzf;
              }
              localzg3 = a(paramString1, localzg1, paramzb1, paramBoolean1);
              i13 = localzg3.b();
              if (((localzg1 < paramString1.length()) && (Character.isDigit(paramString1.charAt(localzg1)))) || (localzg3.a()))
              {
                localzg1 += i13;
                localzg3 = a(paramString1, localzg1, 1, 2, true, bool3);
                i11 = localzg3.d();
                i13 = localzg3.b();
                if (i13 < 0)
                {
                  localzf.a(false);
                  return localzf;
                }
              }
              else
              {
                if (j == 0)
                {
                  localzf.a(false);
                  return localzf;
                }
                i13 = 0;
              }
            }
            break;
          case 'K': 
            if (paramString1.charAt(localzg1) == 'Z')
            {
              localzg1++;
              bool1 = true;
            }
            else if ((paramString1.charAt(localzg1) == '+') || (paramString1.charAt(localzg1) == '-'))
            {
              if (i9 != -1)
              {
                localzf.a(false);
                return localzf;
              }
              if (paramString1.charAt(localzg1) == '+') {
                i9 = 0;
              } else if (paramString1.charAt(localzg1) == '-') {
                i9 = 1;
              }
              localzg1++;
              localzg3 = a(paramString1, localzg1, 0, 2, true, bool3);
              i10 = localzg3.d();
              i13 = localzg3.b();
              localzg1 += i13;
              if (i13 < 0)
              {
                localzf.a(false);
                return localzf;
              }
              if (Character.isDigit(paramString1.charAt(localzg1)))
              {
                i13 = 0;
              }
              else
              {
                localzg3 = a(paramString1, localzg1, 0, paramzb1.f);
                i13 = localzg3.b();
                if (!localzg3.a())
                {
                  localzf.a(false);
                  return localzf;
                }
              }
              localzg1 += i13;
              localzg3 = a(paramString1, localzg1, 0, 2, true, bool3);
              i11 = localzg3.d();
              i13 = localzg3.b();
              n = 2;
              if (i13 < 0)
              {
                localzf.a(false);
                return localzf;
              }
            }
            break;
          case 'Z': 
            if (paramString1.charAt(localzg1) != 'Z')
            {
              localzf.a(false);
              return localzf;
            }
            n = 0;
            i13 = 1;
            bool1 = true;
            break;
          case 'G': 
            if (paramString1.charAt(localzg1) != 'G')
            {
              localzf.a(false);
              return localzf;
            }
            if ((localzg2 + 2 < m) && (localzg1 + 2 < paramString1.length()) && (str4.charAt(localzg2 + 1) == 'M') && (paramString1.charAt(localzg1 + 1) == 'M') && (str4.charAt(localzg2 + 2) == 'T') && (paramString1.charAt(localzg1 + 2) == 'T'))
            {
              bool1 = true;
              n = 2;
              i13 = 3;
            }
            else
            {
              n = 0;
              i13 = 1;
            }
            break;
          case ':': 
            localzg3 = a(paramString1, localzg1, paramzb1, paramBoolean1);
            i13 = localzg3.b();
            if (!localzg3.a())
            {
              localzf.a(false);
              return localzf;
            }
            break;
          case '/': 
            localzg3 = b(paramString1, localzg1, paramzb1, paramBoolean1);
            i13 = localzg3.b();
            if (!localzg3.a())
            {
              localzf.a(false);
              return localzf;
            }
            n = 0;
            break;
          default: 
            if (paramString1.charAt(localzg1) != str4.charAt(localzg2))
            {
              localzf.a(false);
              return localzf;
            }
            n = 0;
            i13 = 1;
          }
          if (i13 < 0)
          {
            localzf.a(false);
            return localzf;
          }
          localzg1 += i13;
          if ((!paramBoolean1) && (j == 0)) {
            switch (str4.charAt(localzg2))
            {
            case 'F': 
            case 'f': 
            case 'm': 
            case 's': 
            case 'z': 
              if ((paramString1.length() > localzg1) && (paramString1.charAt(localzg1) == 'Z') && ((localzg2 + 1 == str4.length()) || (str4.charAt(localzg2 + 1) != 'Z')))
              {
                bool1 = true;
                localzg1++;
              }
              break;
            }
          }
          localzg2 = localzg2 + n + 1;
          n = 0;
        }
      }
    }
    if ((localzg2 + 1 < m) && (str4.charAt(localzg2) == '.') && (str4.charAt(localzg2 + 1) == 'F'))
    {
      localzg2++;
      while ((localzg2 < m) && (str4.charAt(localzg2) == 'F')) {
        localzg2++;
      }
    }
    while ((localzg2 < m) && (str4.charAt(localzg2) == 'K')) {
      localzg2++;
    }
    if (localzg2 < m)
    {
      localzf.a(false);
      return localzf;
    }
    if (paramString1.length() > localzg1)
    {
      if (localzg1 == 0)
      {
        localzf.a(false);
        return localzf;
      }
      if ((Character.isDigit(paramString1.charAt(localzg1))) && (Character.isDigit(paramString1.charAt(localzg1 - 1))))
      {
        localzf.a(false);
        return localzf;
      }
      if ((Character.isLetter(paramString1.charAt(localzg1))) && (Character.isLetter(paramString1.charAt(localzg1 - 1))))
      {
        localzf.a(false);
        return localzf;
      }
      localzf.b(true);
      localzf.a(false);
      return localzf;
    }
    if (i5 == -1) {
      i5 = 0;
    }
    if (i6 == -1) {
      i6 = 0;
    }
    if (i7 == -1) {
      i7 = 0;
    }
    if (d1 == -1.0D) {
      d1 = 0.0D;
    }
    if ((i1 == -1) && (i3 == -1) && (i4 == -1)) {
      if (paramzd.d())
      {
        i1 = 1;
        i3 = 1;
        i4 = 1;
      }
      else
      {
        i1 = DateTime.getNow().getDay();
        i3 = DateTime.getNow().getMonth();
        i4 = DateTime.getNow().getYear();
      }
    }
    if (i1 == -1) {
      i1 = 1;
    }
    if (i3 == -1) {
      i3 = 1;
    }
    if (i4 == -1) {
      if (paramzd.d()) {
        i4 = 1;
      } else {
        i4 = DateTime.getNow().getYear();
      }
    }
    if ((i8 == 0) && (i5 == 12)) {
      i5 = 0;
    }
    if ((i8 == 1) && ((j == 0) || (i5 < 12))) {
      i5 += 12;
    }
    if ((i4 < 1) || (i4 > 9999) || (i3 < 1) || (i3 > 12) || (i1 < 1) || (i1 > DateTime.a(i4, i3)) || (i5 < 0) || (i5 > 23) || (i6 < 0) || (i6 > 59) || (i7 < 0) || (i7 > 59))
    {
      localzf.a(false);
      return localzf;
    }
    localzf.a(new DateTime(i4, i3, i1, i5, i6, i7, 0));
    localzf.b().addSeconds(d1);
    if ((i2 != -1) && (i2 != localzf.b().getDayOfWeek()))
    {
      localzf.a(false);
      return localzf;
    }
    if (i9 == -1)
    {
      if (localzf.b() != DateTime.a) {
        try
        {
          localzf.a(new zb(localzf.b()));
        }
        catch (Exception localException1) {}
      }
    }
    else
    {
      if (i11 == -1) {
        i11 = 0;
      }
      if (i10 == -1) {
        i10 = 0;
      }
      if (i9 == 1)
      {
        i10 = -i10;
        i11 = -i11;
      }
      try
      {
        localzf.a(new zb(localzf.b(), new zl(i10, i11, 0)));
      }
      catch (Exception localException2) {}
    }
    boolean bool4 = paramzd.e();
    if (i9 != -1)
    {
      long l = localzf.b().e() - localzf.c().a();
      if (l < 0L) {
        l += 864000000000L;
      }
      localzf.a(new DateTime());
      localzf.b().c(1L);
      if (paramzd.f()) {
        localzf.a(paramDateTime.toLocalTime());
      }
    }
    else if ((bool1) || (paramzd.g()))
    {
      localzf.b().c(1L);
    }
    else if (paramzd.h())
    {
      localzf.b().c(2L);
    }
    int i14 = (!bool4) && (paramzd.f()) ? 1 : 0;
    if (localzf.b().c() != 0L) {
      if (bool4) {
        localzf.a(paramDateTime.toUniversalTime());
      } else if (i14 != 0) {
        localzf.a(paramDateTime.toLocalTime());
      }
    }
    if (str1 == null) {
      if (paramString2.endsWith("T")) {
        str1 = paramString2 + paramString3;
      } else {
        str1 = paramString2 + " " + paramString3;
      }
    }
    if (str2 != null) {
      str1 = str1.replaceAll("M+", str2);
    }
    str1 = str1.replace("Am/Pm", "AM/PM");
    localzf.a(str1);
    localzf.a(true);
    return localzf;
  }
  
  private static boolean a(String paramString, int paramInt)
  {
    return (paramInt >= 0) && (paramInt < paramString.length()) && (Character.isLetter(paramString.charAt(paramInt)));
  }
  
  private static String[] a(com.aspose.cells.b.a.c.zb paramzb)
  {
    int i = paramzb.e.indexOf('d');
    int j = paramzb.e.indexOf('M');
    int k = paramzb.e.indexOf('y');
    if ((i == -1) || (j == -1) || (k == -1)) {
      return null;
    }
    if (k < j)
    {
      if (j < i) {
        return c;
      }
      if (k < i) {
        return b;
      }
      return null;
    }
    if (i < j) {
      return d;
    }
    if (i < k) {
      return e;
    }
    return null;
  }
  
  public static za a(String paramString, com.aspose.cells.b.a.c.za paramza, zd paramzd, DateTime paramDateTime, zb paramzb)
  {
    za localza = new za();
    paramzb = new zb(0, zl.a);
    if ((paramString == null) || (paramString.length() == 0))
    {
      localza.a(DateTime.a);
      localza.a(false);
      localza.a(paramzb);
      return localza;
    }
    if (paramza == null) {
      paramza = com.aspose.cells.b.a.c.za.a();
    }
    com.aspose.cells.b.a.c.zb localzb = new com.aspose.cells.b.a.c.zb(paramza);
    String[] arrayOfString1 = a(localzb);
    if (arrayOfString1 == null)
    {
      localza.a(DateTime.a);
      localza.a(false);
      localza.a(paramzb);
      return localza;
    }
    boolean bool1 = false;
    for (int i = 0; i < arrayOfString1.length; i++)
    {
      String str1 = arrayOfString1[i];
      bool2 = false;
      localzf = a(paramString, str1, "", false, paramDateTime, paramzb, localzb, paramzd, true, bool2, bool1);
      if (localzf.a())
      {
        localza.a(localzf.b());
        localza.a(true);
        localza.a(localzf.c());
        localza.a(localzf.f());
        return localza;
      }
      if (localzf.d()) {
        for (int k = 0; k < a.length; k++)
        {
          localzf = a(paramString, str1, a[k], false, paramDateTime, paramzb, localzb, paramzd, true, bool2, bool1);
          if (localzf.a())
          {
            localza.a(localzf.b());
            localza.a(true);
            localza.a(localzf.c());
            localza.a(localzf.f());
            return localza;
          }
        }
      }
    }
    i = localzb.i.indexOf('d');
    int j = localzb.i.indexOf('M');
    if ((i == -1) || (j == -1))
    {
      localza.a(DateTime.a);
      localza.a(false);
      localza.a(paramzb);
      return localza;
    }
    boolean bool2 = i < j;
    String[] arrayOfString2 = bool2 ? g : f;
    for (int m = 0; m < arrayOfString2.length; m++)
    {
      boolean bool3 = false;
      localzf = a(paramString, arrayOfString2[m], "", false, paramDateTime, paramzb, localzb, paramzd, true, bool3, bool1);
      if (localzf.a())
      {
        localza.a(localzf.b());
        localza.a(true);
        localza.a(localzf.c());
        localza.a(localzf.f());
        return localza;
      }
    }
    for (m = 0; m < a.length; m++)
    {
      String str2 = a[m];
      boolean bool4 = false;
      localzf = a(paramString, str2, "", false, paramDateTime, paramzb, localzb, paramzd, false, bool4, bool1);
      if (localzf.a())
      {
        localza.a(localzf.b());
        localza.a(true);
        localza.a(localzf.c());
        localza.a(localzf.f());
        return localza;
      }
      if (localzf.d())
      {
        for (int n = 0; n < arrayOfString2.length; n++)
        {
          localzf = a(paramString, str2, arrayOfString2[n], false, paramDateTime, paramzb, localzb, paramzd, false, bool4, bool1);
          if (localzf.a())
          {
            localza.a(localzf.b());
            localza.a(true);
            localza.a(localzf.c());
            localza.a(localzf.f());
            return localza;
          }
        }
        for (n = 0; n < arrayOfString1.length; n++)
        {
          String str3 = arrayOfString1[n];
          if (str3.charAt(str3.length() - 1) != 'T')
          {
            localzf = a(paramString, str2, str3, false, paramDateTime, paramzb, localzb, paramzd, false, bool4, bool1);
            if (localzf.a())
            {
              localza.a(localzf.b());
              localza.a(true);
              localza.a(localzf.c());
              localza.a(localzf.f());
              return localza;
            }
          }
        }
      }
    }
    zf localzf = a(paramString, localzb.d(), localzb, paramzd, paramDateTime, false, bool1);
    if (localzf.a())
    {
      localza.a(localzf.b());
      localza.a(true);
      localza.a(localzf.c());
      localza.a(localzf.f());
      return localza;
    }
    localza.a(DateTime.a);
    localza.a(false);
    localza.a(paramzb);
    return localza;
  }
  
  private static zf a(String paramString, String[] paramArrayOfString, com.aspose.cells.b.a.c.zb paramzb, zd paramzd, DateTime paramDateTime, boolean paramBoolean1, boolean paramBoolean2)
  {
    zf localzf = null;
    boolean bool = false;
    for (int i = 0; i < paramArrayOfString.length; i++)
    {
      DateTime localDateTime = null;
      String str = paramArrayOfString[i];
      if ((str == null) || ("".equals(str))) {
        break;
      }
      zb localzb = null;
      localzf = a(paramString, paramArrayOfString[i], null, paramBoolean1, localDateTime, localzb, paramzb, paramzd, false, bool, paramBoolean2);
      localDateTime = localzf.b();
      localzb = localzf.c();
      if (localzf.a()) {
        return localzf;
      }
    }
    if (localzf == null) {
      localzf = new zf();
    }
    localzf.a(DateTime.a);
    return localzf;
  }
  
  private static zg a(String paramString, int paramInt, com.aspose.cells.b.a.c.zb paramzb, boolean paramBoolean)
  {
    zg localzg1 = new zg();
    zg localzg2 = a(paramString, paramInt, 0, ":");
    localzg1.a(localzg2.b());
    localzg1.a((a(paramString, paramInt, 0, paramzb.f).a()) || ((!paramBoolean) && (localzg2.a())));
    return localzg1;
  }
  
  private static zg a(String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2)
  {
    zg localzg = new zg();
    int i = 0;
    if (paramBoolean2) {
      paramBoolean1 = false;
    }
    int k;
    if (!paramBoolean1)
    {
      k = 0;
      for (j = paramInt1; (j < paramString.length()) && (j < paramInt3 + paramInt1) && (Character.isDigit(paramString.charAt(j))); j++) {
        k++;
      }
      paramInt3 = k;
    }
    if (paramInt3 < paramInt2)
    {
      localzg.a(-1);
      localzg.c(0);
      return localzg;
    }
    if (paramString.length() - paramInt1 < paramInt3)
    {
      localzg.a(-1);
      localzg.c(0);
      return localzg;
    }
    for (int j = paramInt1; j < paramInt3 + paramInt1; j++)
    {
      k = paramString.charAt(j);
      if (!Character.isDigit(k))
      {
        localzg.a(-1);
        localzg.c(0);
        return localzg;
      }
      i = i * 10 + (byte)(k - 48);
    }
    localzg.a(paramInt3);
    localzg.c(i);
    return localzg;
  }
  
  private static zg b(String paramString, int paramInt, com.aspose.cells.b.a.c.zb paramzb, boolean paramBoolean)
  {
    zg localzg1 = new zg();
    localzg1.a(-1);
    if ((paramBoolean) && (paramString.charAt(paramInt) != '/'))
    {
      localzg1.a(false);
      return localzg1;
    }
    zg localzg2 = a(paramString, paramInt, paramzb, paramBoolean);
    localzg1.a(localzg2.b());
    if (localzg2.a())
    {
      localzg1.a(false);
      return localzg1;
    }
    if (Character.isDigit(paramString.charAt(paramInt)))
    {
      if ((paramInt - 1 < 0) || (!Character.isDigit(paramString.charAt(paramInt - 1))))
      {
        localzg1.a(0);
        localzg1.a(true);
        return localzg1;
      }
      localzg1.a(false);
      return localzg1;
    }
    if (Character.isLetter(paramString.charAt(paramInt)))
    {
      if ((paramInt - 1 < 0) || (!Character.isLetter(paramString.charAt(paramInt - 1))))
      {
        localzg1.a(0);
        localzg1.a(true);
        return localzg1;
      }
      localzg1.a(false);
      return localzg1;
    }
    localzg1.a(1);
    localzg1.a(true);
    return localzg1;
  }
  
  private static zg a(String paramString, int paramInt, String[] paramArrayOfString1, String[] paramArrayOfString2, boolean paramBoolean)
  {
    zg localzg1 = new zg();
    for (int i = paramArrayOfString1.length - 1; i >= 0; i--)
    {
      zg localzg2;
      if ((!paramBoolean) && (paramArrayOfString2[i].length() > paramArrayOfString1[i].length()))
      {
        localzg2 = a(paramString, paramInt, 0, paramArrayOfString2[i]);
        localzg1.a(localzg2.b());
        if ((paramArrayOfString2[i].length() > 0) && (localzg2.a()))
        {
          localzg1.c(i);
          return localzg1;
        }
        localzg2 = a(paramString, paramInt, 0, paramArrayOfString1[i]);
        localzg1.a(localzg2.b());
        if ((paramArrayOfString1[i].length() > 0) && (localzg2.a()))
        {
          localzg1.c(i);
          return localzg1;
        }
      }
      else
      {
        localzg2 = a(paramString, paramInt, 0, paramArrayOfString1[i]);
        localzg1.a(localzg2.b());
        if ((paramArrayOfString1[i].length() > 0) && (localzg2.a()))
        {
          localzg1.c(i);
          return localzg1;
        }
        localzg2 = a(paramString, paramInt, 0, paramArrayOfString2[i]);
        localzg1.a(localzg2.b());
        if ((!paramBoolean) && (paramArrayOfString2[i].length() > 0) && (localzg2.a()))
        {
          localzg1.c(i);
          return localzg1;
        }
      }
    }
    localzg1.c(-1);
    localzg1.a(-1);
    return localzg1;
  }
  
  private static zg a(String paramString, int paramInt1, int paramInt2, com.aspose.cells.b.a.c.zb paramzb, boolean paramBoolean, int paramInt3)
  {
    zg localzg1 = new zg();
    localzg1.a(-1);
    if (paramInt3 != -1)
    {
      localzg1.b(paramInt3);
      localzg1.a(false);
      return localzg1;
    }
    localzg1.b(paramInt3);
    if (!a(paramString, paramInt1))
    {
      if (!"".equals(paramzb.g))
      {
        localzg1.a(false);
        return localzg1;
      }
      if (paramBoolean) {
        localzg1.b(0);
      }
      localzg1.a(0);
      localzg1.a(true);
      return localzg1;
    }
    com.aspose.cells.b.a.c.zb localzb = com.aspose.cells.b.a.c.zb.b();
    zg localzg2 = a(paramString, paramInt1, paramInt2, paramzb.h);
    if ((!localzg2.a()) && (!paramBoolean)) {
      localzg2 = a(paramString, paramInt1, paramInt2, localzb.h);
    }
    localzg1.a(localzg2.b());
    if ((localzg2.a()) && ((paramBoolean) || (localzg1.b() != 0)))
    {
      localzg1.b(1);
    }
    else
    {
      localzg2 = a(paramString, paramInt1, paramInt2, paramzb.g);
      if ((!localzg2.a()) && (!paramBoolean)) {
        localzg2 = a(paramString, paramInt1, paramInt2, localzb.g);
      }
      localzg1.a(localzg2.b());
      if ((localzg2.a()) && ((paramBoolean) || (localzg1.b() != 0)))
      {
        localzg1.b(0);
      }
      else
      {
        localzg1.a(false);
        return localzg1;
      }
    }
    localzg1.a(true);
    return localzg1;
  }
  
  private static zg a(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    zg localzg = new zg();
    if (paramInt2 <= 0) {
      paramInt2 = paramString2.length();
    }
    if ((paramInt1 + paramInt2 <= paramString1.length()) && (a(paramString1, paramInt1, paramString2, 0, paramInt2, true, com.aspose.cells.b.a.c.za.b()) == 0))
    {
      localzg.a(paramInt2);
      localzg.a(true);
      return localzg;
    }
    localzg.a(-1);
    localzg.a(false);
    return localzg;
  }
  
  private static int a(String paramString1, int paramInt1, String paramString2, int paramInt2, int paramInt3, boolean paramBoolean, com.aspose.cells.b.a.c.za paramza)
  {
    if ((paramString1 == null) || (paramString2 == null)) {
      return 0;
    }
    String str1 = paramString1.substring(paramInt1, paramInt1 + paramInt3 > paramString1.length() ? paramString1.length() : paramInt1 + paramInt3);
    String str2 = paramString2.substring(paramInt2, paramInt2 + paramInt3 > paramString2.length() ? paramString2.length() : paramInt2 + paramInt3);
    if (paramBoolean) {
      return str1.compareToIgnoreCase(str2);
    }
    return str1.compareTo(str2);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/b/a/zc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */