package com.aspose.cells;

import com.aspose.cells.a.c.zk;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zs;

class zig
{
  private String a;
  private zzx b;
  private Color c = Color.getEmpty();
  private short d = 0;
  private byte e = 0;
  private zom f;
  
  public boolean a()
  {
    return (this.e == 0) && (zs.a(Color.getEmpty(), this.c));
  }
  
  public String b()
  {
    return this.a;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public zzx c()
  {
    return this.b;
  }
  
  public void a(zzx paramzzx)
  {
    this.b = paramzzx;
  }
  
  public Color d()
  {
    return this.c;
  }
  
  public short e()
  {
    return this.d;
  }
  
  public int f()
  {
    return this.e;
  }
  
  public zom g()
  {
    if (this.e == 0) {
      return null;
    }
    if (this.f == null) {
      this.f = new zom(this, this.e & 0xFF);
    }
    return this.f;
  }
  
  public int a(char[] paramArrayOfChar, int paramInt1, int paramInt2, StringBuilder paramStringBuilder, boolean paramBoolean)
  {
    int i;
    int j;
    switch (paramArrayOfChar[paramInt1])
    {
    case '$': 
      paramInt1++;
      i = 1;
      j = paramInt1;
    }
    while (paramInt1 < paramInt2) {
      switch (paramArrayOfChar[paramInt1])
      {
      case ']': 
        if (i != 0)
        {
          a(paramStringBuilder, paramArrayOfChar, j, paramInt1, paramBoolean);
        }
        else if (j < paramInt1)
        {
          String str = new String(paramArrayOfChar, j, paramInt1 - j);
          if (str.indexOf('-') < 0) {
            try
            {
              int k = zp.a(new String(paramArrayOfChar, j, paramInt1 - j), 515);
              this.d = ((short)(k & 0xFFFF));
              str = null;
            }
            catch (Exception localException) {}
          }
          if (str != null) {
            this.d = zamr.a(str);
          }
        }
        return paramInt1 + 1;
      case '-': 
        if (i != 0)
        {
          a(paramStringBuilder, paramArrayOfChar, j, paramInt1, paramBoolean);
          i = 0;
          paramInt1++;
          j = paramInt1;
        }
        else
        {
          paramInt1++;
        }
        break;
      default: 
        paramInt1++;
        continue;
        if (paramInt1 + 4 < paramInt2) {
          switch (paramArrayOfChar[(paramInt1 + 1)])
          {
          case 'Y': 
          case 'y': 
            if ((paramArrayOfChar[(paramInt1 + 4)] == ']') && ((paramArrayOfChar[(paramInt1 + 2)] | 0x20) == 'a') && ((paramArrayOfChar[(paramInt1 + 3)] | 0x20) == 'n'))
            {
              this.c = Color.getCyan();
              return paramInt1 + 5;
            }
            break;
          case 'O': 
          case 'o': 
            if ((paramInt1 + 6 < paramInt2) && ((paramArrayOfChar[(paramInt1 + 2)] | 0x20) == 'l') && ((paramArrayOfChar[(paramInt1 + 3)] | 0x20) == 'o') && ((paramArrayOfChar[(paramInt1 + 4)] | 0x20) == 'r'))
            {
              paramInt1 += 5;
              if ((paramArrayOfChar[paramInt1] >= '0') && (paramArrayOfChar[paramInt1] <= '9'))
              {
                i = paramArrayOfChar[paramInt1] - '0';
                paramInt1++;
                if ((paramArrayOfChar[paramInt1] >= '0') && (paramArrayOfChar[paramInt1] <= '9'))
                {
                  i = i * 10 + (paramArrayOfChar[paramInt1] - '0');
                  paramInt1++;
                }
                if ((paramArrayOfChar[paramInt1] == ']') && (i > 0) && (i < 57))
                {
                  if (this.b.d() != null) {
                    this.c = this.b.d().a(i);
                  } else {
                    this.c = zamb.b(i);
                  }
                  return paramInt1 + 1;
                }
              }
            }
            break;
          default: 
            break;
            if (paramInt1 + 4 < paramInt2)
            {
              paramInt1++;
              if ((paramArrayOfChar[paramInt1] == 'l') || (paramArrayOfChar[paramInt1] == 'L'))
              {
                paramInt1++;
                switch (paramArrayOfChar[paramInt1])
                {
                case 'U': 
                case 'u': 
                  if ((paramArrayOfChar[(paramInt1 + 2)] == ']') && ((paramArrayOfChar[(paramInt1 + 1)] | 0x20) == 'e'))
                  {
                    this.c = Color.getBlue();
                    return paramInt1 + 3;
                  }
                  break;
                case 'A': 
                case 'a': 
                  if ((paramInt1 + 3 < paramInt2) && (paramArrayOfChar[(paramInt1 + 3)] == ']') && ((paramArrayOfChar[(paramInt1 + 1)] | 0x20) == 'c') && ((paramArrayOfChar[(paramInt1 + 2)] | 0x20) == 'k'))
                  {
                    this.c = Color.getBlack();
                    return paramInt1 + 4;
                  }
                  break;
                default: 
                  break;
                  if ((paramInt1 + 5 < paramInt2) && (paramArrayOfChar[(paramInt1 + 5)] == ']') && ((paramArrayOfChar[(paramInt1 + 1)] | 0x20) == 'r') && ((paramArrayOfChar[(paramInt1 + 2)] | 0x20) == 'e') && ((paramArrayOfChar[(paramInt1 + 3)] | 0x20) == 'e') && ((paramArrayOfChar[(paramInt1 + 4)] | 0x20) == 'n'))
                  {
                    this.c = Color.getGreen();
                    return paramInt1 + 6;
                    if (a(paramArrayOfChar, paramInt1, paramInt2))
                    {
                      return paramInt1 + 8;
                      if ((paramInt1 + 3 < paramInt2) && (paramArrayOfChar[(paramInt1 + 3)] == ']') && ((paramArrayOfChar[(paramInt1 + 1)] | 0x20) == 'e') && ((paramArrayOfChar[(paramInt1 + 2)] | 0x20) == 'd'))
                      {
                        this.c = Color.getRed();
                        return paramInt1 + 4;
                        if ((paramInt1 + 5 < paramInt2) && (paramArrayOfChar[(paramInt1 + 5)] == ']') && ((paramArrayOfChar[(paramInt1 + 1)] | 0x20) == 'h') && ((paramArrayOfChar[(paramInt1 + 2)] | 0x20) == 'i') && ((paramArrayOfChar[(paramInt1 + 3)] | 0x20) == 't') && ((paramArrayOfChar[(paramInt1 + 4)] | 0x20) == 'e'))
                        {
                          this.c = Color.getWhite();
                          return paramInt1 + 6;
                          if ((paramInt1 + 6 < paramInt2) && (paramArrayOfChar[(paramInt1 + 6)] == ']') && ((paramArrayOfChar[(paramInt1 + 1)] | 0x20) == 'e') && ((paramArrayOfChar[(paramInt1 + 2)] | 0x20) == 'l') && ((paramArrayOfChar[(paramInt1 + 3)] | 0x20) == 'l') && ((paramArrayOfChar[(paramInt1 + 4)] | 0x20) == 'o') && ((paramArrayOfChar[(paramInt1 + 5)] | 0x20) == 'w'))
                          {
                            this.c = Color.getYellow();
                            return paramInt1 + 7;
                            if ((paramInt1 + 6 < paramInt2) && (paramArrayOfChar[(paramInt1 + 6)] == ']') && ((paramArrayOfChar[(paramInt1 + 1)] | 0x20) == 'b') && ((paramArrayOfChar[(paramInt1 + 2)] | 0x20) == 'n') && ((paramArrayOfChar[(paramInt1 + 3)] | 0x20) == 'u') && ((paramArrayOfChar[(paramInt1 + 4)] | 0x20) == 'm') && (paramArrayOfChar[(paramInt1 + 5)] > '0') && (paramArrayOfChar[(paramInt1 + 5)] < '4'))
                            {
                              this.e = ((byte)(paramArrayOfChar[(paramInt1 + 5)] - '0'));
                              return paramInt1 + 7;
                              if (paramInt1 + 2 < paramInt2) {
                                if (paramArrayOfChar[(paramInt1 + 2)] == ']')
                                {
                                  if (paramArrayOfChar[(paramInt1 + 1)] == 33394)
                                  {
                                    switch (paramArrayOfChar[paramInt1])
                                    {
                                    case '红': 
                                      this.c = Color.getRed();
                                      return paramInt1 + 3;
                                    case '绿': 
                                      this.c = Color.getGreen();
                                      return paramInt1 + 3;
                                    case '蓝': 
                                      this.c = Color.getBlue();
                                      return paramInt1 + 3;
                                    case '黑': 
                                      this.c = Color.getBlack();
                                      return paramInt1 + 3;
                                    case '黄': 
                                      this.c = Color.getYellow();
                                      return paramInt1 + 3;
                                    case '白': 
                                      this.c = Color.getWhite();
                                      return paramInt1 + 3;
                                    }
                                  }
                                  else if ((paramArrayOfChar[paramInt1] == '洋') && (paramArrayOfChar[(paramInt1 + 1)] == '红'))
                                  {
                                    this.c = Color.getMagenta();
                                    return paramInt1 + 3;
                                  }
                                }
                                else if ((paramInt1 + 3 < paramInt2) && (paramArrayOfChar[(paramInt1 + 3)] == ']') && (paramArrayOfChar[(paramInt1 + 2)] == 33394) && (paramArrayOfChar[paramInt1] == 34013) && (paramArrayOfChar[(paramInt1 + 1)] == '绿')) {
                                  return paramInt1 + 4;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  break;
                }
              }
            }
            break;
          }
        }
        break;
      }
    }
    while (paramInt1 < paramInt2)
    {
      if (paramArrayOfChar[paramInt1] == ']') {
        return paramInt1 + 1;
      }
      paramInt1++;
    }
    return paramInt1;
  }
  
  public boolean a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if ((paramInt1 + 7 < paramInt2) && (paramArrayOfChar[(paramInt1 + 7)] == ']') && ((paramArrayOfChar[(paramInt1 + 1)] | 0x20) == 'a') && ((paramArrayOfChar[(paramInt1 + 2)] | 0x20) == 'g') && ((paramArrayOfChar[(paramInt1 + 3)] | 0x20) == 'e') && ((paramArrayOfChar[(paramInt1 + 4)] | 0x20) == 'n') && ((paramArrayOfChar[(paramInt1 + 5)] | 0x20) == 't') && ((paramArrayOfChar[(paramInt1 + 6)] | 0x20) == 'a'))
    {
      this.c = Color.getMagenta();
      return true;
    }
    return false;
  }
  
  private void a(StringBuilder paramStringBuilder, char[] paramArrayOfChar, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if ((paramInt1 < paramInt2) && (paramStringBuilder != null)) {
      if (paramBoolean)
      {
        zk.a(paramStringBuilder, paramArrayOfChar, paramInt1, paramInt2);
      }
      else
      {
        int i = paramInt1;
        while (paramInt1 < paramInt2)
        {
          if (paramArrayOfChar[paramInt1] == '"')
          {
            if (paramInt1 > i)
            {
              paramStringBuilder.append('"');
              paramStringBuilder.append(paramArrayOfChar, i, paramInt1 - i);
              paramStringBuilder.append('"');
            }
            paramStringBuilder.append("\\\"");
            i = paramInt1 + 1;
          }
          paramInt1++;
        }
        if (i < paramInt2)
        {
          paramStringBuilder.append('"');
          paramStringBuilder.append(paramArrayOfChar, i, paramInt2 - i);
          paramStringBuilder.append('"');
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */