package com.aspose.cells;

import com.aspose.cells.a.c.zf;

class ziv
{
  static zahi a(String paramString, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      char[] arrayOfChar1 = paramString.toCharArray();
      int i = 0;
      for (int j = 0; j < arrayOfChar1.length; j++)
      {
        char c1 = arrayOfChar1[j];
        if (((c1 >= 'a') && (c1 <= 'z')) || ((c1 >= 'A') && (c1 <= 'Z')))
        {
          i = 1;
        }
        else
        {
          char c2 = zf.a(c1);
          char c3 = zf.b(c1);
          if (c2 != c3)
          {
            switch (arrayOfChar1.length)
            {
            case 1: 
              return new zl(c2, c3);
            case 2: 
              if (j == 0) {
                return new zm(c2, c3, zf.a(arrayOfChar1[1]), zf.b(arrayOfChar1[1]));
              }
              return new zm(zf.a(arrayOfChar1[0]), zf.b(arrayOfChar1[0]), c2, c3);
            case 3: 
              if (j == 0) {
                return new zn(c2, c3, zf.a(arrayOfChar1[1]), zf.b(arrayOfChar1[1]), zf.a(arrayOfChar1[2]), zf.b(arrayOfChar1[2]));
              }
              if (j == 1) {
                return new zn(zf.a(arrayOfChar1[0]), zf.b(arrayOfChar1[0]), c2, c3, zf.a(arrayOfChar1[2]), zf.b(arrayOfChar1[2]));
              }
              return new zn(zf.a(arrayOfChar1[0]), zf.b(arrayOfChar1[0]), zf.a(arrayOfChar1[1]), zf.b(arrayOfChar1[1]), c2, c3);
            case 4: 
              switch (j)
              {
              case 0: 
                return new zo(c2, c3, zf.a(arrayOfChar1[1]), zf.b(arrayOfChar1[1]), zf.a(arrayOfChar1[2]), zf.b(arrayOfChar1[2]), zf.a(arrayOfChar1[3]), zf.b(arrayOfChar1[3]));
              case 1: 
                return new zo(zf.a(arrayOfChar1[0]), zf.b(arrayOfChar1[0]), c2, c3, zf.a(arrayOfChar1[2]), zf.b(arrayOfChar1[2]), zf.a(arrayOfChar1[3]), zf.b(arrayOfChar1[3]));
              case 2: 
                return new zo(zf.a(arrayOfChar1[0]), zf.b(arrayOfChar1[0]), zf.a(arrayOfChar1[1]), zf.b(arrayOfChar1[1]), c2, c3, zf.a(arrayOfChar1[3]), zf.b(arrayOfChar1[3]));
              }
              return new zo(zf.a(arrayOfChar1[0]), zf.b(arrayOfChar1[0]), zf.a(arrayOfChar1[1]), zf.b(arrayOfChar1[1]), zf.a(arrayOfChar1[2]), zf.b(arrayOfChar1[2]), c2, c3);
            }
            char[] arrayOfChar2 = new char[arrayOfChar1.length];
            for (int k = 0; k < j; k++)
            {
              arrayOfChar2[k] = zf.b(arrayOfChar1[k]);
              arrayOfChar1[k] = zf.a(arrayOfChar1[k]);
            }
            arrayOfChar1[j] = c2;
            arrayOfChar2[j] = c3;
            j++;
            while (j < arrayOfChar1.length)
            {
              arrayOfChar2[j] = zf.b(arrayOfChar1[j]);
              arrayOfChar1[j] = zf.a(arrayOfChar1[j]);
              j++;
            }
            return new zk(arrayOfChar1, arrayOfChar2);
          }
        }
      }
      if (i != 0)
      {
        switch (arrayOfChar1.length)
        {
        case 1: 
          return new ze(arrayOfChar1[0]);
        case 2: 
          return new zf(arrayOfChar1[0], arrayOfChar1[1]);
        case 3: 
          return new zg(arrayOfChar1[0], arrayOfChar1[1], arrayOfChar1[2]);
        case 4: 
          return new zh(arrayOfChar1[0], arrayOfChar1[1], arrayOfChar1[2], arrayOfChar1[3]);
        }
        return new zi(arrayOfChar1);
      }
    }
    switch (paramString.length())
    {
    case 1: 
      return new za(paramString.charAt(0));
    case 2: 
      return new zb(paramString.charAt(0), paramString.charAt(1));
    case 3: 
      return new zc(paramString.charAt(0), paramString.charAt(1), paramString.charAt(2));
    case 4: 
      return new zd(paramString.charAt(0), paramString.charAt(1), paramString.charAt(2), paramString.charAt(3));
    }
    return new zj(paramString);
  }
  
  private static class zk
    implements zahi
  {
    private char[] a;
    private char[] b;
    
    zk(char[] paramArrayOfChar1, char[] paramArrayOfChar2)
    {
      this.a = paramArrayOfChar1;
      this.b = paramArrayOfChar2;
    }
    
    public int a()
    {
      return this.a.length;
    }
    
    public int a(char[] paramArrayOfChar, int paramInt)
    {
      if (paramInt + 3 < paramArrayOfChar.length)
      {
        if ((this.a[0] == paramArrayOfChar[paramInt]) || (this.b[0] == paramArrayOfChar[paramInt]))
        {
          if ((this.a[1] == paramArrayOfChar[(paramInt + 1)]) || (this.b[1] == paramArrayOfChar[(paramInt + 1)]))
          {
            if ((this.a[2] == paramArrayOfChar[(paramInt + 2)]) || (this.b[2] == paramArrayOfChar[(paramInt + 2)]))
            {
              int i = Math.min(this.a.length, paramArrayOfChar.length - paramInt);
              for (int j = 3; j < i; j++) {
                if ((this.a[3] != paramArrayOfChar[(paramInt + j)]) && (this.b[3] != paramArrayOfChar[(paramInt + j)])) {
                  return j;
                }
              }
              return this.a.length;
            }
            return 2;
          }
          return 1;
        }
      }
      else if (paramInt + 2 < paramArrayOfChar.length)
      {
        if ((this.a[0] == paramArrayOfChar[paramInt]) || (this.b[0] == paramArrayOfChar[paramInt]))
        {
          if ((this.a[1] == paramArrayOfChar[(paramInt + 1)]) || (this.b[1] == paramArrayOfChar[(paramInt + 1)])) {
            return (this.a[2] == paramArrayOfChar[(paramInt + 2)]) || (this.b[2] == paramArrayOfChar[(paramInt + 2)]) ? 3 : 2;
          }
          return 1;
        }
      }
      else if (paramInt + 1 < paramArrayOfChar.length)
      {
        if ((this.a[0] == paramArrayOfChar[paramInt]) || (this.b[0] == paramArrayOfChar[paramInt])) {
          return (this.a[1] == paramArrayOfChar[(paramInt + 1)]) || (this.b[1] == paramArrayOfChar[(paramInt + 1)]) ? 2 : 1;
        }
      }
      else if (paramInt < paramArrayOfChar.length) {
        return (this.a[0] == paramArrayOfChar[(paramInt + 1)]) || (this.b[0] == paramArrayOfChar[paramInt]) ? 1 : 0;
      }
      return 0;
    }
  }
  
  private static class zo
    implements zahi
  {
    private char a;
    private char b;
    private char c;
    private char d;
    private char e;
    private char f;
    private char g;
    private char h;
    
    zo(char paramChar1, char paramChar2, char paramChar3, char paramChar4, char paramChar5, char paramChar6, char paramChar7, char paramChar8)
    {
      this.a = paramChar1;
      this.b = paramChar2;
      this.c = paramChar3;
      this.d = paramChar4;
      this.e = paramChar5;
      this.f = paramChar6;
      this.g = paramChar7;
      this.h = paramChar8;
    }
    
    public int a()
    {
      return 4;
    }
    
    public int a(char[] paramArrayOfChar, int paramInt)
    {
      if (paramInt + 3 < paramArrayOfChar.length)
      {
        if ((this.a == paramArrayOfChar[paramInt]) || (this.b == paramArrayOfChar[paramInt]))
        {
          if ((this.c == paramArrayOfChar[(paramInt + 1)]) || (this.d == paramArrayOfChar[(paramInt + 1)]))
          {
            if ((this.e == paramArrayOfChar[(paramInt + 2)]) || (this.f == paramArrayOfChar[(paramInt + 2)])) {
              return (this.g == paramArrayOfChar[(paramInt + 3)]) || (this.h == paramArrayOfChar[(paramInt + 3)]) ? 4 : 3;
            }
            return 2;
          }
          return 1;
        }
      }
      else if (paramInt + 2 < paramArrayOfChar.length)
      {
        if ((this.a == paramArrayOfChar[paramInt]) || (this.b == paramArrayOfChar[paramInt]))
        {
          if ((this.c == paramArrayOfChar[(paramInt + 1)]) || (this.d == paramArrayOfChar[(paramInt + 1)])) {
            return (this.e == paramArrayOfChar[(paramInt + 2)]) || (this.f == paramArrayOfChar[(paramInt + 2)]) ? 3 : 2;
          }
          return 1;
        }
      }
      else if (paramInt + 1 < paramArrayOfChar.length)
      {
        if ((this.a == paramArrayOfChar[paramInt]) || (this.b == paramArrayOfChar[paramInt])) {
          return (this.c == paramArrayOfChar[(paramInt + 1)]) || (this.d == paramArrayOfChar[(paramInt + 1)]) ? 2 : 1;
        }
      }
      else if (paramInt < paramArrayOfChar.length) {
        return (this.a == paramArrayOfChar[(paramInt + 1)]) || (this.b == paramArrayOfChar[paramInt]) ? 1 : 0;
      }
      return 0;
    }
  }
  
  private static class zn
    implements zahi
  {
    private char a;
    private char b;
    private char c;
    private char d;
    private char e;
    private char f;
    
    zn(char paramChar1, char paramChar2, char paramChar3, char paramChar4, char paramChar5, char paramChar6)
    {
      this.a = paramChar1;
      this.b = paramChar2;
      this.c = paramChar3;
      this.d = paramChar4;
      this.e = paramChar5;
      this.f = paramChar6;
    }
    
    public int a()
    {
      return 3;
    }
    
    public int a(char[] paramArrayOfChar, int paramInt)
    {
      if (paramInt + 2 < paramArrayOfChar.length)
      {
        if ((this.a == paramArrayOfChar[paramInt]) || (this.b == paramArrayOfChar[paramInt]))
        {
          if ((this.c == paramArrayOfChar[(paramInt + 1)]) || (this.d == paramArrayOfChar[(paramInt + 1)])) {
            return (this.e == paramArrayOfChar[(paramInt + 2)]) || (this.f == paramArrayOfChar[(paramInt + 2)]) ? 3 : 2;
          }
          return 1;
        }
      }
      else if (paramInt + 1 < paramArrayOfChar.length)
      {
        if ((this.a == paramArrayOfChar[paramInt]) || (this.b == paramArrayOfChar[paramInt])) {
          return (this.c == paramArrayOfChar[(paramInt + 1)]) || (this.d == paramArrayOfChar[(paramInt + 1)]) ? 2 : 1;
        }
      }
      else if (paramInt < paramArrayOfChar.length) {
        return (this.a == paramArrayOfChar[(paramInt + 1)]) || (this.b == paramArrayOfChar[paramInt]) ? 1 : 0;
      }
      return 0;
    }
  }
  
  private static class zm
    implements zahi
  {
    private char a;
    private char b;
    private char c;
    private char d;
    
    zm(char paramChar1, char paramChar2, char paramChar3, char paramChar4)
    {
      this.a = paramChar1;
      this.b = paramChar2;
      this.c = paramChar3;
      this.d = paramChar4;
    }
    
    public int a()
    {
      return 2;
    }
    
    public int a(char[] paramArrayOfChar, int paramInt)
    {
      if (paramInt + 1 < paramArrayOfChar.length)
      {
        if ((this.a == paramArrayOfChar[paramInt]) || (this.b == paramArrayOfChar[paramInt])) {
          return (this.c == paramArrayOfChar[(paramInt + 1)]) || (this.d == paramArrayOfChar[(paramInt + 1)]) ? 2 : 1;
        }
      }
      else if (paramInt < paramArrayOfChar.length) {
        return (this.a == paramArrayOfChar[(paramInt + 1)]) || (this.b == paramArrayOfChar[paramInt]) ? 1 : 0;
      }
      return 0;
    }
  }
  
  private static class zl
    implements zahi
  {
    private char a;
    private char b;
    
    zl(char paramChar1, char paramChar2)
    {
      this.a = paramChar1;
      this.b = paramChar2;
    }
    
    public int a()
    {
      return 1;
    }
    
    public int a(char[] paramArrayOfChar, int paramInt)
    {
      return (this.a == paramArrayOfChar[paramInt]) || (this.b == paramArrayOfChar[paramInt]) ? 1 : 0;
    }
  }
  
  private static class zi
    implements zahi
  {
    private char[] a;
    
    zi(char[] paramArrayOfChar)
    {
      this.a = paramArrayOfChar;
      int i = 32;
      for (int j = 0; j < this.a.length; j++)
      {
        int tmp28_27 = j;
        char[] tmp28_24 = this.a;
        tmp28_24[tmp28_27] = ((char)(tmp28_24[tmp28_27] | i));
      }
    }
    
    public int a()
    {
      return this.a.length;
    }
    
    public int a(char[] paramArrayOfChar, int paramInt)
    {
      if (paramInt + 3 < paramArrayOfChar.length)
      {
        if ((paramArrayOfChar[paramInt] | 0x20) == this.a[0])
        {
          if ((paramArrayOfChar[(paramInt + 1)] | 0x20) == this.a[1])
          {
            if ((paramArrayOfChar[(paramInt + 2)] | 0x20) == this.a[2])
            {
              int i = Math.min(this.a.length, paramArrayOfChar.length - paramInt);
              for (int j = 3; j < i; j++) {
                if (this.a[j] != (paramArrayOfChar[(paramInt + j)] | 0x20)) {
                  return j;
                }
              }
              return this.a.length;
            }
            return 2;
          }
          return 1;
        }
      }
      else if (paramInt + 2 < paramArrayOfChar.length)
      {
        if ((paramArrayOfChar[paramInt] | 0x20) == this.a[0])
        {
          if ((paramArrayOfChar[(paramInt + 1)] | 0x20) == this.a[1]) {
            return (paramArrayOfChar[(paramInt + 2)] | 0x20) == this.a[2] ? 3 : 2;
          }
          return 1;
        }
      }
      else if (paramInt + 1 < paramArrayOfChar.length)
      {
        if ((paramArrayOfChar[paramInt] | 0x20) == this.a[0]) {
          return (paramArrayOfChar[(paramInt + 1)] | 0x20) == this.a[1] ? 2 : 1;
        }
      }
      else if (paramInt < paramArrayOfChar.length) {
        return (paramArrayOfChar[paramInt] | 0x20) == this.a[0] ? 1 : 0;
      }
      return 0;
    }
  }
  
  private static class zj
    implements zahi
  {
    private char[] a;
    
    zj(String paramString)
    {
      this.a = paramString.toCharArray();
    }
    
    public int a()
    {
      return this.a.length;
    }
    
    public int a(char[] paramArrayOfChar, int paramInt)
    {
      if (paramInt + 3 < paramArrayOfChar.length)
      {
        if (paramArrayOfChar[paramInt] == this.a[0])
        {
          if (paramArrayOfChar[(paramInt + 1)] == this.a[1])
          {
            if (paramArrayOfChar[(paramInt + 2)] == this.a[2])
            {
              int i = Math.min(this.a.length, paramArrayOfChar.length - paramInt);
              for (int j = 3; j < i; j++) {
                if (this.a[j] != paramArrayOfChar[(paramInt + j)]) {
                  return j;
                }
              }
              return this.a.length;
            }
            return 2;
          }
          return 1;
        }
        return 0;
      }
      if (paramInt + 2 < paramArrayOfChar.length)
      {
        if (paramArrayOfChar[paramInt] == this.a[0])
        {
          if (paramArrayOfChar[(paramInt + 1)] == this.a[1]) {
            return paramArrayOfChar[(paramInt + 2)] == this.a[2] ? 3 : 2;
          }
          return 1;
        }
      }
      else if (paramInt + 1 < paramArrayOfChar.length)
      {
        if (paramArrayOfChar[paramInt] == this.a[0]) {
          return paramArrayOfChar[(paramInt + 1)] == this.a[1] ? 2 : 1;
        }
      }
      else if (paramInt < paramArrayOfChar.length) {
        return paramArrayOfChar[paramInt] == this.a[0] ? 1 : 0;
      }
      return 0;
    }
  }
  
  private static class zh
    implements zahi
  {
    private char a;
    private char b;
    private char c;
    private char d;
    
    zh(char paramChar1, char paramChar2, char paramChar3, char paramChar4)
    {
      this.a = ((char)(paramChar1 | 0x20));
      this.b = ((char)(paramChar2 | 0x20));
      this.c = ((char)(paramChar3 | 0x20));
      this.d = ((char)(paramChar4 | 0x20));
    }
    
    public int a()
    {
      return 4;
    }
    
    public int a(char[] paramArrayOfChar, int paramInt)
    {
      if (paramInt + 3 < paramArrayOfChar.length)
      {
        if ((paramArrayOfChar[paramInt] | 0x20) == this.a)
        {
          if ((paramArrayOfChar[(paramInt + 1)] | 0x20) == this.b)
          {
            if ((paramArrayOfChar[(paramInt + 2)] | 0x20) == this.c) {
              return (paramArrayOfChar[(paramInt + 3)] | 0x20) == this.d ? 4 : 3;
            }
            return 2;
          }
          return 1;
        }
      }
      else if (paramInt + 2 < paramArrayOfChar.length)
      {
        if ((paramArrayOfChar[paramInt] | 0x20) == this.a)
        {
          if ((paramArrayOfChar[(paramInt + 1)] | 0x20) == this.b) {
            return (paramArrayOfChar[(paramInt + 2)] | 0x20) == this.c ? 3 : 2;
          }
          return 1;
        }
      }
      else if (paramInt + 1 < paramArrayOfChar.length)
      {
        if ((paramArrayOfChar[paramInt] | 0x20) == this.a) {
          return (paramArrayOfChar[(paramInt + 1)] | 0x20) == this.b ? 2 : 1;
        }
      }
      else if (paramInt < paramArrayOfChar.length) {
        return (paramArrayOfChar[paramInt] | 0x20) == this.a ? 1 : 0;
      }
      return 0;
    }
  }
  
  private static class zd
    implements zahi
  {
    private char a;
    private char b;
    private char c;
    private char d;
    
    zd(char paramChar1, char paramChar2, char paramChar3, char paramChar4)
    {
      this.a = paramChar1;
      this.b = paramChar2;
      this.c = paramChar3;
      this.d = paramChar4;
    }
    
    public int a()
    {
      return 4;
    }
    
    public int a(char[] paramArrayOfChar, int paramInt)
    {
      if (paramInt + 3 < paramArrayOfChar.length)
      {
        if (paramArrayOfChar[paramInt] == this.a)
        {
          if (paramArrayOfChar[(paramInt + 1)] == this.b)
          {
            if (paramArrayOfChar[(paramInt + 2)] == this.c) {
              return paramArrayOfChar[(paramInt + 4)] == this.d ? 4 : 3;
            }
            return 2;
          }
          return 1;
        }
      }
      else if (paramInt + 2 < paramArrayOfChar.length)
      {
        if (paramArrayOfChar[paramInt] == this.a)
        {
          if (paramArrayOfChar[(paramInt + 1)] == this.b) {
            return paramArrayOfChar[(paramInt + 2)] == this.c ? 3 : 2;
          }
          return 1;
        }
      }
      else if (paramInt + 1 < paramArrayOfChar.length)
      {
        if (paramArrayOfChar[paramInt] == this.a) {
          return paramArrayOfChar[(paramInt + 1)] == this.b ? 2 : 1;
        }
      }
      else if (paramInt < paramArrayOfChar.length) {
        return paramArrayOfChar[paramInt] == this.a ? 1 : 0;
      }
      return 0;
    }
  }
  
  private static class zg
    implements zahi
  {
    private char a;
    private char b;
    private char c;
    
    zg(char paramChar1, char paramChar2, char paramChar3)
    {
      this.a = ((char)(paramChar1 | 0x20));
      this.b = ((char)(paramChar2 | 0x20));
      this.c = ((char)(paramChar3 | 0x20));
    }
    
    public int a()
    {
      return 3;
    }
    
    public int a(char[] paramArrayOfChar, int paramInt)
    {
      if (paramInt + 2 < paramArrayOfChar.length)
      {
        if ((paramArrayOfChar[paramInt] | 0x20) == this.a)
        {
          if ((paramArrayOfChar[(paramInt + 1)] | 0x20) == this.b) {
            return (paramArrayOfChar[(paramInt + 2)] | 0x20) == this.c ? 3 : 2;
          }
          return 1;
        }
      }
      else if (paramInt + 1 < paramArrayOfChar.length)
      {
        if ((paramArrayOfChar[paramInt] | 0x20) == this.a) {
          return (paramArrayOfChar[(paramInt + 1)] | 0x20) == this.b ? 2 : 1;
        }
      }
      else if (paramInt < paramArrayOfChar.length) {
        return (paramArrayOfChar[paramInt] | 0x20) == this.a ? 1 : 0;
      }
      return 0;
    }
  }
  
  private static class zc
    implements zahi
  {
    private char a;
    private char b;
    private char c;
    
    zc(char paramChar1, char paramChar2, char paramChar3)
    {
      this.a = paramChar1;
      this.b = paramChar2;
      this.c = paramChar3;
    }
    
    public int a()
    {
      return 3;
    }
    
    public int a(char[] paramArrayOfChar, int paramInt)
    {
      if (paramInt + 2 < paramArrayOfChar.length)
      {
        if (paramArrayOfChar[paramInt] == this.a)
        {
          if (paramArrayOfChar[(paramInt + 1)] == this.b) {
            return paramArrayOfChar[(paramInt + 2)] == this.c ? 3 : 2;
          }
          return 1;
        }
      }
      else if (paramInt + 1 < paramArrayOfChar.length)
      {
        if (paramArrayOfChar[paramInt] == this.a) {
          return paramArrayOfChar[(paramInt + 1)] == this.b ? 2 : 1;
        }
      }
      else if (paramInt < paramArrayOfChar.length) {
        return paramArrayOfChar[paramInt] == this.a ? 1 : 0;
      }
      return 0;
    }
  }
  
  private static class zf
    implements zahi
  {
    private char a;
    private char b;
    
    zf(char paramChar1, char paramChar2)
    {
      this.a = ((char)(paramChar1 | 0x20));
      this.b = ((char)(paramChar2 | 0x20));
    }
    
    public int a()
    {
      return 2;
    }
    
    public int a(char[] paramArrayOfChar, int paramInt)
    {
      if (paramInt + 1 < paramArrayOfChar.length)
      {
        if ((paramArrayOfChar[paramInt] | 0x20) == this.a) {
          return (paramArrayOfChar[(paramInt + 1)] | 0x20) == this.b ? 2 : 1;
        }
      }
      else if (paramInt < paramArrayOfChar.length) {
        return (paramArrayOfChar[paramInt] | 0x20) == this.a ? 1 : 0;
      }
      return 0;
    }
  }
  
  private static class zb
    implements zahi
  {
    private char a;
    private char b;
    
    zb(char paramChar1, char paramChar2)
    {
      this.a = paramChar1;
      this.b = paramChar2;
    }
    
    public int a()
    {
      return 2;
    }
    
    public int a(char[] paramArrayOfChar, int paramInt)
    {
      if (paramInt + 1 < paramArrayOfChar.length)
      {
        if (paramArrayOfChar[paramInt] == this.a) {
          return paramArrayOfChar[(paramInt + 1)] == this.b ? 2 : 1;
        }
      }
      else if (paramInt < paramArrayOfChar.length) {
        return paramArrayOfChar[paramInt] == this.a ? 1 : 0;
      }
      return 0;
    }
  }
  
  private static class ze
    implements zahi
  {
    private char a;
    
    ze(char paramChar)
    {
      this.a = ((char)(paramChar | 0x20));
    }
    
    public int a()
    {
      return 1;
    }
    
    public int a(char[] paramArrayOfChar, int paramInt)
    {
      return (paramArrayOfChar[paramInt] | 0x20) == this.a ? 1 : 0;
    }
  }
  
  private static class za
    implements zahi
  {
    private char a;
    
    za(char paramChar)
    {
      this.a = paramChar;
    }
    
    public int a()
    {
      return 1;
    }
    
    public int a(char[] paramArrayOfChar, int paramInt)
    {
      return paramArrayOfChar[paramInt] == this.a ? 1 : 0;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ziv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */