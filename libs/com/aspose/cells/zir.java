package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;

class zir
  extends zl
{
  private char[][] c;
  private int d;
  private int[] e;
  private int[] f;
  private int[] g;
  private int h;
  private int i;
  
  public zir(zig paramzig, String paramString)
  {
    super(paramzig);
    if (paramString == null) {
      paramString = paramzig.b();
    }
    char[] arrayOfChar = paramString.toCharArray();
    b(arrayOfChar, 0, arrayOfChar.length);
  }
  
  public int[] c()
  {
    return this.g;
  }
  
  public int d()
  {
    return this.d;
  }
  
  public boolean e()
  {
    return this.c.length < 2;
  }
  
  private void b(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    ArrayList localArrayList1 = new ArrayList(3);
    ArrayList localArrayList2 = null;
    ArrayList localArrayList3 = null;
    ArrayList localArrayList4 = null;
    StringBuilder localStringBuilder = new StringBuilder(paramInt2 - paramInt1);
    while (paramInt1 < paramInt2)
    {
      switch (paramArrayOfChar[paramInt1])
      {
      case '"': 
        paramInt1++;
      }
      for (;;)
      {
        if ((paramInt1 < paramInt2) && (paramArrayOfChar[paramInt1] != '"'))
        {
          localStringBuilder.append(paramArrayOfChar[paramInt1]);
          paramInt1++;
          continue;
          if (localStringBuilder.length() > 0)
          {
            zf.a(localArrayList1, zs.a(localStringBuilder));
            localStringBuilder.setLength(0);
          }
          else
          {
            zf.a(localArrayList1, null);
            break label321;
            paramInt1++;
            if (paramInt1 < paramInt2)
            {
              localStringBuilder.append(paramArrayOfChar[paramInt1]);
              break label321;
              if (paramInt1 + 1 < paramInt2)
              {
                if (localArrayList2 == null)
                {
                  localArrayList2 = new ArrayList(3);
                  localArrayList3 = new ArrayList(3);
                  localArrayList4 = new ArrayList(3);
                }
                zf.a(localArrayList2, Integer.valueOf(localArrayList1.size()));
                zf.a(localArrayList3, Integer.valueOf(localStringBuilder.length()));
                zf.a(localArrayList4, Integer.valueOf(zzz.a(paramArrayOfChar[paramInt1] == '*', localStringBuilder.length(), paramArrayOfChar[(paramInt1 + 1)])));
                paramInt1++;
                break label321;
                paramInt1 = this.a.a(paramArrayOfChar, paramInt1, paramInt2, null, true);
                break;
                localStringBuilder.append(paramArrayOfChar[paramInt1]);
              }
            }
          }
        }
      }
      label321:
      paramInt1++;
    }
    if (localStringBuilder.length() > 0) {
      zf.a(localArrayList1, zs.a(localStringBuilder));
    } else {
      zf.a(localArrayList1, null);
    }
    this.c = new char[localArrayList1.size()][];
    this.d = 0;
    for (int j = 0; j < this.c.length; j++)
    {
      Object localObject = localArrayList1.get(j);
      if (localObject != null)
      {
        this.c[j] = ((String)localObject).toCharArray();
        this.d += this.c[j].length;
      }
    }
    if (localArrayList4 != null)
    {
      this.g = new int[localArrayList4.size()];
      this.e = new int[this.g.length];
      this.f = new int[this.g.length];
      for (j = 0; j < this.g.length; j++)
      {
        this.e[j] = ((Integer)localArrayList2.get(j)).intValue();
        this.f[j] = ((Integer)localArrayList3.get(j)).intValue();
        this.g[j] = ((Integer)localArrayList4.get(j)).intValue();
      }
    }
  }
  
  public zzz a(zzu paramzzu, int paramInt, Object paramObject)
  {
    return a(paramzzu, paramInt, paramObject, false);
  }
  
  public zzz a(zzu paramzzu, int paramInt, Object paramObject, boolean paramBoolean)
  {
    zzz localzzz = super.a(paramzzu, paramInt, paramObject);
    if (localzzz.f() != 7) {
      return localzzz;
    }
    switch (paramInt)
    {
    case 16: 
      a(paramzzu, a((DateTime)paramObject), localzzz, paramBoolean);
      break;
    case 9: 
      a(paramzzu, ((Integer)paramObject).intValue(), localzzz, paramBoolean);
      break;
    case 14: 
      a(paramzzu, ((Double)paramObject).doubleValue(), localzzz, paramBoolean);
      break;
    case 3: 
      a(paramzzu, paramzzu.b() == null ? "FALSE" : ((Boolean)paramObject).booleanValue() ? "TRUE" : paramzzu.b().getBooleanValueString(((Boolean)paramObject).booleanValue()), localzzz, paramBoolean);
      break;
    default: 
      a(paramzzu, zs.a(paramObject), localzzz, paramBoolean);
    }
    return localzzz;
  }
  
  private void a(zzu paramzzu, double paramDouble, zzz paramzzz, boolean paramBoolean)
  {
    if (e()) {
      a(paramzzz, paramDouble < 0.0D);
    } else {
      a(paramzzz, paramBoolean ? "" : this.a.c().k().a(paramzzu, 14, Double.valueOf(paramDouble)).h());
    }
  }
  
  private void a(zzu paramzzu, String paramString, zzz paramzzz, boolean paramBoolean)
  {
    if (e())
    {
      if (paramBoolean) {
        a(paramzzz, false);
      } else {
        a(paramzzz, paramString);
      }
    }
    else
    {
      if (this.g != null) {
        paramzzz.a(this.g);
      }
      char[] arrayOfChar1 = paramString.toCharArray();
      char[] arrayOfChar2 = new char[this.d + arrayOfChar1.length * (this.c.length - 1)];
      this.h = 0;
      this.i = 0;
      a(arrayOfChar2, 0, paramzzz);
      for (int j = 1; j < this.c.length; j++)
      {
        System.arraycopy(arrayOfChar1, 0, arrayOfChar2, this.h, arrayOfChar1.length);
        this.h += arrayOfChar1.length;
        a(arrayOfChar2, j, paramzzz);
      }
      paramzzz.a(1, arrayOfChar2);
    }
  }
  
  private void a(zzz paramzzz, String paramString)
  {
    paramzzz.a(null);
    paramzzz.a(Color.getEmpty());
    paramzzz.a(1, paramString);
  }
  
  private void a(zzz paramzzz, boolean paramBoolean)
  {
    if (this.g != null)
    {
      paramzzz.a(this.g);
      for (int j = 0; j < this.g.length; j++) {
        paramzzz.a(j, paramBoolean ? 1 + this.f[j] : this.f[j]);
      }
    }
    char[] arrayOfChar;
    if (paramBoolean)
    {
      if (this.c[0] == null)
      {
        arrayOfChar = new char[] { '-' };
      }
      else
      {
        arrayOfChar = new char[this.c[0].length + 1];
        System.arraycopy(this.c[0], 0, arrayOfChar, 1, this.c[0].length);
        arrayOfChar[0] = '-';
      }
    }
    else if (this.c[0] == null) {
      arrayOfChar = zzz.a;
    } else {
      arrayOfChar = this.c[0];
    }
    paramzzz.a(1, arrayOfChar);
  }
  
  private void a(char[] paramArrayOfChar, int paramInt, zzz paramzzz)
  {
    if (this.g != null) {
      while ((this.i < this.e.length) && (this.e[this.i] == paramInt))
      {
        paramzzz.a(this.i, this.h + this.f[this.i]);
        this.i += 1;
      }
    }
    char[] arrayOfChar = this.c[paramInt];
    if (arrayOfChar != null)
    {
      System.arraycopy(arrayOfChar, 0, paramArrayOfChar, this.h, arrayOfChar.length);
      this.h += arrayOfChar.length;
    }
  }
  
  public int a()
  {
    return 1;
  }
  
  public int g()
  {
    return 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zir.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */