package com.aspose.cells;

import com.aspose.cells.a.c.zh;
import com.aspose.cells.a.c.zk;
import com.aspose.cells.b.a.zs;

abstract class zl
  implements zahf
{
  protected zig a;
  protected zzz b = new zzz();
  
  public zl(zig paramzig)
  {
    this.a = paramzig;
  }
  
  public abstract int a();
  
  public zzz a(zzu paramzzu, Object paramObject)
  {
    return a(paramzzu, zaoj.a(paramObject.getClass()), paramObject);
  }
  
  public double a(double paramDouble)
  {
    return paramDouble;
  }
  
  public zzz a(zzu paramzzu, int paramInt, Object paramObject)
  {
    this.b.a();
    if ((paramInt == 18) && (zbxa.a((String)paramObject)))
    {
      this.b.a(1, paramzzu.b() == null ? zs.a(paramObject) : paramzzu.b().getErrorValueString(zs.a(paramObject)));
      return this.b;
    }
    if (!zh.a(this.a.d())) {
      this.b.a(this.a.d());
    }
    return this.b;
  }
  
  public zig b()
  {
    return this.a;
  }
  
  protected void a(zzu paramzzu, boolean paramBoolean, zzz paramzzz)
  {
    paramzzz.a(1, paramzzu.b() == null ? "FALSE" : paramBoolean ? "TRUE" : paramzzu.b().getBooleanValueString(paramBoolean));
  }
  
  protected void a(Object paramObject, int paramInt, zzz paramzzz)
  {
    paramzzz.a(1, zs.a(paramObject));
  }
  
  protected DateTime b(double paramDouble)
  {
    return zbxa.a(paramDouble, this.a.c().c());
  }
  
  protected double a(DateTime paramDateTime)
  {
    return zbxa.a(paramDateTime, this.a.c().c());
  }
  
  protected void a(zzz paramzzz1, zzz paramzzz2, int paramInt)
  {
    int i = paramzzz2.j();
    if (i > 0)
    {
      int j = paramzzz1.j();
      int[] arrayOfInt = new int[j + i];
      if (j > 0) {
        System.arraycopy(paramzzz1.i(), 0, arrayOfInt, 0, j);
      }
      paramzzz1.a(arrayOfInt);
      System.arraycopy(paramzzz2.i(), 0, arrayOfInt, j, i);
      for (int k = 0; k < i; k++) {
        paramzzz1.a(j + k, paramInt + paramzzz2.b(k));
      }
    }
  }
  
  protected int a(char[] paramArrayOfChar, int paramInt1, int paramInt2, StringBuilder paramStringBuilder)
  {
    switch (paramArrayOfChar[paramInt1])
    {
    case '"': 
      paramInt1++;
      int i = paramInt1;
      while (paramInt1 < paramInt2)
      {
        if (paramArrayOfChar[paramInt1] == '"')
        {
          zk.a(paramStringBuilder, paramArrayOfChar, i, paramInt1);
          return paramInt1 + 1;
        }
        paramInt1++;
      }
      zk.a(paramStringBuilder, paramArrayOfChar, i, paramInt1);
      break;
    case '\\': 
      paramInt1++;
      if (paramInt1 < paramInt2)
      {
        zk.a(paramStringBuilder, paramArrayOfChar[paramInt1]);
        paramInt1++;
      }
      break;
    case '[': 
      paramInt1 = this.a.a(paramArrayOfChar, paramInt1, paramInt2, paramStringBuilder, true);
      break;
    default: 
      zk.a(paramStringBuilder, paramArrayOfChar[paramInt1]);
      paramInt1++;
    }
    return paramInt1;
  }
  
  protected int b(char[] paramArrayOfChar, int paramInt1, int paramInt2, StringBuilder paramStringBuilder)
  {
    return c(paramArrayOfChar, paramInt1, paramInt2, paramStringBuilder);
  }
  
  public static int c(char[] paramArrayOfChar, int paramInt1, int paramInt2, StringBuilder paramStringBuilder)
  {
    switch (paramArrayOfChar[paramInt1])
    {
    case '"': 
      paramInt1++;
      if (paramArrayOfChar[paramInt1] == '"') {
        paramInt1++;
      } else {
        paramStringBuilder.append('"');
      }
      break;
    case '[': 
    case '\\': 
    case '*': 
    case '_': 
    default: 
      while (paramInt1 < paramInt2)
      {
        paramStringBuilder.append(paramArrayOfChar[paramInt1]);
        if (paramArrayOfChar[paramInt1] == '"')
        {
          paramInt1++;
        }
        else
        {
          paramInt1++;
          continue;
          paramStringBuilder.append('[');
          paramInt1++;
          while (paramInt1 < paramInt2)
          {
            paramStringBuilder.append(paramArrayOfChar[paramInt1]);
            if (paramArrayOfChar[paramInt1] == ']')
            {
              paramInt1++;
            }
            else
            {
              paramInt1++;
              continue;
              paramStringBuilder.append('\\');
              paramInt1++;
              if (paramInt1 < paramInt2)
              {
                paramStringBuilder.append(paramArrayOfChar[paramInt1]);
                paramInt1++;
                break;
                paramStringBuilder.append(paramArrayOfChar[paramInt1]);
                paramInt1++;
                if (paramInt1 < paramInt2)
                {
                  paramStringBuilder.append(paramArrayOfChar[paramInt1]);
                  paramInt1++;
                  break;
                  paramStringBuilder.append(paramArrayOfChar[paramInt1]);
                  paramInt1++;
                }
              }
            }
          }
        }
      }
    }
    return paramInt1;
  }
  
  public static int a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    switch (paramArrayOfChar[paramInt1])
    {
    case '"': 
      do
      {
        paramInt1++;
      } while ((paramInt1 < paramInt2) && (paramArrayOfChar[paramInt1] != '"'));
      paramInt1++;
      break;
    case '[': 
      do
      {
        paramInt1++;
      } while ((paramInt1 < paramInt2) && (paramArrayOfChar[paramInt1] != ']'));
      paramInt1++;
      break;
    case '*': 
    case '\\': 
    case '_': 
      paramInt1++;
      if (paramInt1 < paramInt2) {
        paramInt1++;
      }
      break;
    default: 
      paramInt1++;
    }
    return paramInt1;
  }
  
  public static boolean a(char[] paramArrayOfChar, int paramInt1, int paramInt2, char paramChar1, char paramChar2)
  {
    boolean bool = false;
    while (paramInt1 < paramInt2) {
      switch (paramArrayOfChar[paramInt1])
      {
      case '"': 
        do
        {
          paramInt1++;
        } while ((paramInt1 < paramInt2) && (paramArrayOfChar[paramInt1] != '"'));
        paramInt1++;
        break;
      case '*': 
      case '\\': 
      case '_': 
        paramInt1++;
        if (paramInt1 < paramInt2) {
          paramInt1++;
        }
        break;
      default: 
        if (paramArrayOfChar[paramInt1] == paramChar1)
        {
          bool = true;
          paramArrayOfChar[paramInt1] = paramChar2;
        }
        paramInt1++;
      }
    }
    return bool;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */