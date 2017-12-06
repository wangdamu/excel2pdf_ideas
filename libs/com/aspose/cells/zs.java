package com.aspose.cells;

abstract class zs
  extends zl
{
  protected zarc c;
  
  public zs(zig paramzig)
  {
    super(paramzig);
  }
  
  public double a(double paramDouble)
  {
    return c(paramDouble * this.c.a()) / this.c.a();
  }
  
  public zarc d()
  {
    return this.c;
  }
  
  protected abstract double c(double paramDouble);
  
  public abstract void a(zzu paramzzu, double paramDouble, zzz paramzzz);
  
  public zzz a(zzu paramzzu, int paramInt, Object paramObject)
  {
    zzz localzzz = super.a(paramzzu, paramInt, paramObject);
    if (localzzz.f() != 7) {
      return localzzz;
    }
    switch (paramInt)
    {
    case 16: 
      a(paramzzu, a((DateTime)paramObject) * this.c.a(), localzzz);
      return localzzz;
    case 9: 
      a(paramzzu, ((Integer)paramObject).intValue() * this.c.a(), localzzz);
      return localzzz;
    case 14: 
      a(paramzzu, ((Double)paramObject).doubleValue() * this.c.a(), localzzz);
      return localzzz;
    case 3: 
      a(paramzzu, ((Boolean)paramObject).booleanValue(), localzzz);
      return localzzz;
    }
    a(paramObject, paramInt, localzzz);
    return localzzz;
  }
  
  protected void d(char[] paramArrayOfChar, int paramInt1, int paramInt2, StringBuilder paramStringBuilder)
  {
    this.c = new zarc();
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    double d = 1.0D;
    int[] arrayOfInt = new int[paramInt2 - paramInt1];
    while (paramInt1 < paramInt2) {
      switch (paramArrayOfChar[paramInt1])
      {
      case '0': 
        if (k != 0)
        {
          i++;
          this.c.b(false);
        }
        else if (this.c.c() < 0)
        {
          this.c.a(false);
          if (this.c.a() < 1.0D) {
            this.c.c(true);
          }
          arrayOfInt[m] = paramStringBuilder.length();
          m++;
        }
        this.c.a(1.0D);
        break;
      case '#': 
      case '?': 
        if (this.c.c() < 0)
        {
          if (this.c.a() < 1.0D) {
            this.c.c(true);
          }
          arrayOfInt[m] = paramStringBuilder.length();
          m++;
        }
        else if (k != 0)
        {
          i++;
        }
        this.c.a(1.0D);
        break;
      case '%': 
        if (j == 0) {
          j = 1;
        }
        break;
      case '.': 
        if (this.c.c() < 0)
        {
          this.c.b(paramStringBuilder.length());
          k = 1;
          d = this.c.a();
          this.c.a(1.0D);
        }
        break;
      case ',': 
        if (paramInt1 > 0) {
          switch (paramArrayOfChar[(paramInt1 - 1)])
          {
          case '#': 
          case '0': 
            paramInt1++;
            this.c.a(this.c.a() * 0.001D);
            while ((paramInt1 < paramInt2) && (paramArrayOfChar[paramInt1] == ','))
            {
              this.c.a(this.c.a() * 0.001D);
              paramInt1++;
            }
          }
        }
        break;
      case 'E': 
      case 'e': 
        this.c.c(paramStringBuilder.length());
        paramStringBuilder.append(paramArrayOfChar[paramInt1]);
        paramInt1++;
        while (paramInt1 < paramInt2) {
          paramInt1 = b(paramArrayOfChar, paramInt1, paramInt2, paramStringBuilder);
        }
      case '/': 
        j = 0;
        k = 0;
        break;
      case '(': 
        this.c.d(true);
        break;
      case '\\': 
        paramStringBuilder.append('\\');
        paramInt1++;
        if (paramInt1 < paramInt2)
        {
          if (paramArrayOfChar[paramInt1] == '(') {
            this.c.d(true);
          }
          paramStringBuilder.append(paramArrayOfChar[paramInt1]);
          paramInt1++;
        }
        break;
      default: 
        paramInt1 = b(paramArrayOfChar, paramInt1, paramInt2, paramStringBuilder);
        continue;
        paramStringBuilder.append(paramArrayOfChar[paramInt1]);
        paramInt1++;
      }
    }
    if (d != 1.0D) {
      this.c.a(this.c.a() * d);
    }
    if (j != 0) {
      this.c.a(this.c.a() * 100.0D);
    }
    this.c.a(i);
    if (this.c.g()) {
      if (m < 4)
      {
        String str;
        switch (m)
        {
        case 1: 
          str = "#,##";
          break;
        case 2: 
          str = "#,#";
          break;
        default: 
          str = "#,";
        }
        paramStringBuilder.insert(arrayOfInt[0], str);
      }
      else
      {
        m -= 3;
        while (m > 0)
        {
          paramStringBuilder.insert(arrayOfInt[m], ',');
          m -= 3;
        }
      }
    }
  }
  
  protected int a(char[] paramArrayOfChar, int paramInt1, int paramInt2, StringBuilder paramStringBuilder)
  {
    switch (paramArrayOfChar[paramInt1])
    {
    case '#': 
    case '+': 
    case ',': 
    case '-': 
    case '.': 
    case '0': 
    case 'E': 
    case 'e': 
      paramStringBuilder.append(paramArrayOfChar[paramInt1]);
      paramInt1++;
      break;
    default: 
      paramInt1 = super.a(paramArrayOfChar, paramInt1, paramInt2, paramStringBuilder);
    }
    return paramInt1;
  }
  
  public int a()
  {
    return 2;
  }
  
  public int g()
  {
    return 2;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */