package com.aspose.cells;

class zon
{
  private zom a;
  private char[] b;
  private boolean c;
  private boolean d;
  private boolean e;
  
  public zon(zig paramzig)
  {
    this.a = paramzig.g();
    int i = paramzig.f();
    boolean bool1 = true;
    boolean bool2 = true;
    if (i == 2)
    {
      switch (paramzig.e())
      {
      case 4: 
      case 2052: 
        this.b = new char[] { '拾', '佰', '仟', '万', '拾', '佰', '仟', '亿', '拾', '佰', '仟', '兆', '拾', '佰', '仟' };
        break;
      case 1028: 
      case 3076: 
      case 4100: 
      case 5124: 
      case 31748: 
        this.b = new char[] { '拾', '佰', '仟', 33836, '拾', '佰', '仟', '億', '拾', '佰', '仟', '兆', '拾', '佰', '仟' };
        break;
      case 17: 
      case 18: 
      case 1041: 
      case 1042: 
        bool1 = false;
        this.b = new char[] { '拾', '百', 38433, 33836, '拾', '百', 38433, '億', '拾', '百', 38433, '兆', '拾', '百', 38433 };
        break;
      default: 
        this.b = null;
        break;
      }
    }
    else
    {
      if ((i == 1) || (i == 3)) {}
      switch (paramzig.e())
      {
      case 4: 
      case 2052: 
        this.b = new char[] { '十', '百', '千', '万', '十', '百', '千', '亿', '十', '百', '千', '兆', '十', '百', '千' };
        break;
      case 1028: 
      case 3076: 
      case 4100: 
      case 5124: 
      case 31748: 
        this.b = new char[] { '十', '百', '千', 33836, '十', '百', '千', '億', '十', '百', '千', '兆', '十', '百', '千' };
        break;
      case 17: 
      case 18: 
      case 1041: 
      case 1042: 
        bool1 = false;
        bool2 = (i == 1) && (zamr.a((short)18, paramzig.e()));
        this.b = new char[] { '十', '百', '千', '万', '十', '百', '千', '億', '十', '百', '千', '兆', '十', '百', '千' };
        break;
      default: 
        this.b = null;
        break;
        this.b = null;
      }
    }
    if (this.b == null)
    {
      this.a = null;
      this.c = true;
    }
    else
    {
      this.a = new zom(paramzig, i);
      this.c = false;
    }
    this.d = bool1;
    this.e = bool2;
  }
  
  public StringBuilder a(double paramDouble, StringBuilder paramStringBuilder)
  {
    String str = zarb.a(paramDouble);
    if (this.c)
    {
      if (paramStringBuilder != null) {
        paramStringBuilder.append(str);
      } else {
        paramStringBuilder = new StringBuilder(str);
      }
      return paramStringBuilder;
    }
    char[] arrayOfChar = zarb.a(paramDouble).toCharArray();
    if (paramStringBuilder == null) {
      paramStringBuilder = new StringBuilder(arrayOfChar.length << 1);
    }
    for (int i = 0; (i < arrayOfChar.length) && (arrayOfChar[i] != '.'); i++) {}
    if (i > 1)
    {
      i--;
      int j = i;
      if (arrayOfChar[j] == '0')
      {
        j--;
        while ((j > -1) && (arrayOfChar[j] == '0')) {
          j--;
        }
      }
      int k = i - this.b.length;
      if (k > 0)
      {
        k += 3;
        this.a.a(arrayOfChar, 0, k, paramStringBuilder);
      }
      else
      {
        k = 0;
      }
      i--;
      if (k < j)
      {
        int m = 0;
        int n = 1;
        for (;;)
        {
          if (arrayOfChar[k] == '0')
          {
            if ((n != 0) && ((i - k) % 4 == 3))
            {
              paramStringBuilder.append(this.b[(i - k)]);
              m = 0;
              n = 0;
            }
            else
            {
              m = 1;
            }
          }
          else
          {
            if (m != 0)
            {
              if (this.d) {
                paramStringBuilder.append(this.a.a('0'));
              }
              m = 0;
            }
            if ((this.e) || ((i - k + 1) % 4 == 0) || (arrayOfChar[k] != '1')) {
              paramStringBuilder.append(this.a.a(arrayOfChar[k]));
            }
            paramStringBuilder.append(this.b[(i - k)]);
            n = (i - k) % 4 != 3 ? 1 : 0;
          }
          k++;
          if (k == j) {
            break;
          }
        }
        if ((m != 0) && (this.d) && (arrayOfChar[j] != '0')) {
          paramStringBuilder.append(this.a.a('0'));
        }
      }
      if ((this.e) || (arrayOfChar[k] != '1') || ((i - k + 1) % 4 == 0)) {
        paramStringBuilder.append(this.a.a(arrayOfChar[k]));
      }
      k = i - k;
      if (k > -1)
      {
        paramStringBuilder.append(this.b[k]);
        if ((k > 3) && (k < 11) && (k % 4 != 3)) {
          paramStringBuilder.append(this.b[(k - k % 4 - 1)]);
        }
      }
      i += 3;
    }
    else
    {
      paramStringBuilder.append(this.a.a(arrayOfChar[0]));
      i++;
    }
    if (i < arrayOfChar.length)
    {
      paramStringBuilder.append('.');
      this.a.a(arrayOfChar, i, arrayOfChar.length, paramStringBuilder);
    }
    return paramStringBuilder;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zon.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */