package com.aspose.cells;

import com.aspose.cells.a.a.za;
import com.aspose.cells.a.c.zk;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;

abstract class zn
  extends zl
{
  protected static DateTime c = DateTime.b.addMilliseconds(-500.0D);
  protected int d;
  
  public zn(zig paramzig)
  {
    super(paramzig);
  }
  
  public zzz a(zzu paramzzu, int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    case 16: 
      return b(paramzzu, (DateTime)paramObject);
    case 9: 
      return a(paramzzu, ((Integer)paramObject).intValue());
    case 14: 
      return a(paramzzu, ((Double)paramObject).doubleValue());
    case 3: 
      localzzz = super.a(paramzzu, paramInt, paramObject);
      if (localzzz.f() != 7) {
        return localzzz;
      }
      a(paramzzu, ((Boolean)paramObject).booleanValue(), localzzz);
      return localzzz;
    }
    zzz localzzz = super.a(paramzzu, paramInt, paramObject);
    if (localzzz.f() != 7) {
      return localzzz;
    }
    a(paramObject, paramInt, localzzz);
    return localzzz;
  }
  
  public zzz a(zzu paramzzu, DateTime paramDateTime, double paramDouble, boolean paramBoolean)
  {
    zzz localzzz = super.a(paramzzu, 16, paramDateTime);
    if (localzzz.f() != 7) {
      return localzzz;
    }
    if ((paramDouble < 0.0D) && (f()))
    {
      localzzz.a(paramzzu.c());
      return localzzz;
    }
    return localzzz;
  }
  
  protected zzz a(zzu paramzzu, DateTime paramDateTime)
  {
    zzz localzzz = super.a(paramzzu, 16, paramDateTime);
    if (localzzz.f() != 7) {
      return localzzz;
    }
    localzzz.a(paramzzu.c());
    return localzzz;
  }
  
  private zzz b(zzu paramzzu, DateTime paramDateTime)
  {
    return a(paramzzu, paramDateTime, e() ? a(paramDateTime) : 0.0D, true);
  }
  
  private zzz a(zzu paramzzu, double paramDouble)
  {
    if (paramDouble > 2958465.999994D)
    {
      zzz localzzz = super.a(paramzzu, 14, Double.valueOf(paramDouble));
      localzzz.a(paramzzu.c());
      return localzzz;
    }
    return a(paramzzu, (f()) && (paramDouble >= 0.0D) ? b(paramDouble) : DateTime.a, paramDouble, true);
  }
  
  protected void d(char[] paramArrayOfChar, int paramInt1, int paramInt2, StringBuilder paramStringBuilder)
  {
    int i = paramStringBuilder.length();
    e(paramArrayOfChar, paramInt1, paramInt2, paramStringBuilder);
    paramArrayOfChar = zs.a(paramStringBuilder).substring(i).toCharArray();
    paramStringBuilder.setLength(i);
    paramInt1 = 0;
    paramInt2 = paramArrayOfChar.length;
    while (paramInt1 < paramInt2) {
      switch (paramArrayOfChar[paramInt1])
      {
      case 'A': 
      case 'a': 
        int j = zk.a(paramArrayOfChar, paramInt1, paramInt2);
        if (j > paramInt1)
        {
          zk.a(paramStringBuilder, paramArrayOfChar, paramInt1, j);
          paramInt1 = j;
        }
        break;
      default: 
        paramInt1 = a(paramArrayOfChar, paramInt1, paramInt2, paramStringBuilder);
      }
    }
  }
  
  protected void e(char[] paramArrayOfChar, int paramInt1, int paramInt2, StringBuilder paramStringBuilder)
  {
    int i = -1;
    int j = 32;
    int k = 0;
    while (paramInt1 < paramInt2)
    {
      int m;
      switch (paramArrayOfChar[paramInt1])
      {
      case 'Y': 
      case 'y': 
        if (i > -1)
        {
          this.d |= 0x2;
          if ((this.d & 0x38000000) == 0) {
            if (b(4)) {
              this.d |= 0x18000000;
            } else {
              this.d |= 0x30000000;
            }
          }
          i = -1;
        }
        paramStringBuilder.append('y');
        j = 121;
        i();
        break;
      case 'D': 
      case 'd': 
        if (i > -1)
        {
          this.d |= 0x2;
          if ((this.d & 0x38000000) == 0) {
            if (b(1)) {
              this.d |= 0x20000000;
            } else {
              this.d |= 0x10000000;
            }
          }
          i = -1;
        }
        paramStringBuilder.append('d');
        j = 100;
        this.d |= 0x4;
        if ((this.d & 0x38000000) == 0) {
          if (b(2)) {
            this.d |= 0x10000000;
          } else if (b(1)) {
            this.d |= 0x28000000;
          }
        }
        break;
      case 'H': 
      case 'h': 
        if (i > -1)
        {
          h();
          i = -1;
        }
        j = paramArrayOfChar[paramInt1];
        paramStringBuilder.append(paramArrayOfChar[paramInt1]);
        this.d |= 0x8;
        break;
      case 'S': 
      case 's': 
        if (i > -1)
        {
          m = paramStringBuilder.length();
          while ((i < m) && (paramStringBuilder.charAt(i) == 'M'))
          {
            paramStringBuilder.setCharAt(i, 'm');
            this.d |= 0x10;
            i++;
          }
          i = -1;
          k = 1;
        }
        j = 115;
        paramStringBuilder.append('s');
        this.d |= 0x20;
        break;
      case 'M': 
      case 'm': 
        if ((paramInt1 > 0) && (paramInt1 + 3 < paramInt2) && (paramArrayOfChar[(paramInt1 + 1)] == '/') && ((paramArrayOfChar[(paramInt1 - 1)] == 'a') || (paramArrayOfChar[(paramInt1 - 1)] == 'A')) && ((paramArrayOfChar[(paramInt1 + 2)] == 'p') || (paramArrayOfChar[(paramInt1 + 2)] == 'P')) && ((paramArrayOfChar[(paramInt1 + 3)] == 'm') || (paramArrayOfChar[(paramInt1 + 3)] == 'M')))
        {
          paramStringBuilder.append(paramArrayOfChar, paramInt1, 4);
          paramInt1 += 4;
          this.d |= 0x40;
        }
        else
        {
          i = paramInt1;
          paramInt1++;
          while (paramInt1 < paramInt2) {
            switch (paramArrayOfChar[paramInt1])
            {
            case 'M': 
            case 'm': 
              paramInt1++;
              break;
            }
          }
          i = paramInt1 - i;
          switch (i)
          {
          case 1: 
          case 2: 
            m = 77;
            int n = 0;
            switch (j)
            {
            case 72: 
            case 104: 
              m = 109;
              k = 1;
              n = 1;
              this.d |= 0x10;
              j = 109;
              break;
            case 115: 
              if (k == 0)
              {
                m = 109;
                k = 1;
                this.d |= 0x10;
              }
              j = 109;
              n = 1;
            }
            for (int i1 = 0; i1 < i; i1++) {
              paramStringBuilder.append(m);
            }
            if (n != 0) {
              i = -1;
            } else {
              i = paramStringBuilder.length() - i;
            }
            break;
          case 3: 
            i = -1;
            paramStringBuilder.append("MMM");
            this.d |= 0x40000000;
            h();
            break;
          case 5: 
            i = -1;
            paramStringBuilder.append("MMMMM");
            this.d |= 0x40000000;
            h();
            break;
          case 4: 
          default: 
            i = -1;
            paramStringBuilder.append("MMMM");
            this.d |= 0x40000000;
            h();
          }
        }
        break;
      case '[': 
        if (paramInt1 + 1 < paramInt2) {
          switch (paramArrayOfChar[(paramInt1 + 1)])
          {
          case 'H': 
          case 'h': 
            j = paramArrayOfChar[(paramInt1 + 1)];
            this.d |= 0x8;
            break;
          case 'M': 
          case 'm': 
            k = 1;
            this.d |= 0x10;
          }
        }
        paramInt1 = b(paramArrayOfChar, paramInt1, paramInt2, paramStringBuilder);
        break;
      case 'G': 
      case 'g': 
        this.d |= 0x80;
        paramStringBuilder.append(paramArrayOfChar[paramInt1]);
        break;
      case 'E': 
      case 'e': 
        paramStringBuilder.append("yyyy");
        i();
        this.d |= 0x80;
        paramInt1++;
        while ((paramInt1 < paramInt2) && ((paramArrayOfChar[paramInt1] == 'e') || (paramArrayOfChar[paramInt1] == 'E'))) {
          paramInt1++;
        }
      case 'A': 
      case 'a': 
        paramStringBuilder.append(paramArrayOfChar[paramInt1]);
        break;
      case 'B': 
      case 'C': 
      case 'F': 
      case 'I': 
      case 'J': 
      case 'K': 
      case 'L': 
      case 'N': 
      case 'O': 
      case 'P': 
      case 'Q': 
      case 'R': 
      case 'T': 
      case 'U': 
      case 'V': 
      case 'W': 
      case 'X': 
      case 'Z': 
      case '\\': 
      case ']': 
      case '^': 
      case '_': 
      case '`': 
      case 'b': 
      case 'c': 
      case 'f': 
      case 'i': 
      case 'j': 
      case 'k': 
      case 'l': 
      case 'n': 
      case 'o': 
      case 'p': 
      case 'q': 
      case 'r': 
      case 't': 
      case 'u': 
      case 'v': 
      case 'w': 
      case 'x': 
      default: 
        paramInt1 = b(paramArrayOfChar, paramInt1, paramInt2, paramStringBuilder);
        continue;
        paramInt1++;
      }
    }
    if (i > -1) {
      h();
    }
  }
  
  private void h()
  {
    this.d |= 0x2;
    if ((this.d & 0x38000000) == 0) {
      if (b(1)) {
        this.d |= 0x20000000;
      } else if (b(4)) {
        this.d |= 0x18000000;
      }
    }
  }
  
  private void i()
  {
    this.d |= 0x1;
    if ((this.d & 0x38000000) == 0) {
      if (b(2)) {
        this.d |= 0x30000000;
      } else if (b(4)) {
        this.d |= 0x38000000;
      }
    }
  }
  
  protected int b(char[] paramArrayOfChar, int paramInt1, int paramInt2, StringBuilder paramStringBuilder)
  {
    int i = zk.a(paramArrayOfChar, paramInt1, paramInt2);
    if (i > paramInt1)
    {
      while (paramInt1 < i)
      {
        paramStringBuilder.append('\\');
        paramStringBuilder.append(paramArrayOfChar[paramInt1]);
        paramInt1++;
      }
      return paramInt1;
    }
    return super.b(paramArrayOfChar, paramInt1, paramInt2, paramStringBuilder);
  }
  
  protected int a(char[] paramArrayOfChar, int paramInt1, int paramInt2, StringBuilder paramStringBuilder)
  {
    int i = zk.a(paramArrayOfChar, paramInt1, paramInt2);
    if (i > paramInt1)
    {
      paramStringBuilder.append(paramArrayOfChar, paramInt1, i - paramInt1);
      return i;
    }
    switch (paramArrayOfChar[paramInt1])
    {
    case '/': 
      paramStringBuilder.append(this.a.c().f().g());
      paramInt1++;
      break;
    default: 
      paramInt1 = super.a(paramArrayOfChar, paramInt1, paramInt2, paramStringBuilder);
    }
    return paramInt1;
  }
  
  protected String a(String paramString1, String paramString2)
  {
    if ((b(2)) && (!c())) {
      if (paramString1.indexOf("MM") > -1) {
        paramString2 = zw.a(paramString2, "12", "01");
      } else if (paramString1.indexOf("M") > -1) {
        paramString2 = zw.a(paramString2, "12", "1");
      }
    }
    if (b(4)) {
      if (paramString1.indexOf("dd") > -1) {
        paramString2 = zw.a(paramString2, "31", "00");
      } else if (paramString1.indexOf("d") > -1) {
        paramString2 = zw.a(paramString2, "31", "0");
      }
    }
    if (b(1)) {
      if (paramString1.indexOf("yyyy") > -1) {
        paramString2 = zw.a(paramString2, "1899", "1900");
      } else if (paramString1.indexOf("yy") > -1) {
        paramString2 = zw.a(paramString2, "99", "00");
      }
    }
    return paramString2;
  }
  
  public void a(int paramInt)
  {
    this.d |= paramInt;
  }
  
  public boolean b(int paramInt)
  {
    return (this.d & paramInt) != 0;
  }
  
  public boolean c()
  {
    return (this.d & 0x40000000) != 0;
  }
  
  public int d()
  {
    int i = this.d >> 27 & 0x7;
    if (i > 1) {
      return i;
    }
    return 2;
  }
  
  public boolean e()
  {
    return false;
  }
  
  public boolean f()
  {
    return true;
  }
  
  public int a()
  {
    return 3;
  }
  
  public int g()
  {
    if ((this.d & 0x87) != 0) {
      return 3;
    }
    return 4;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */