package com.aspose.cells;

import com.aspose.cells.a.c.zj;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.c.za;
import com.aspose.cells.b.a.c.zb;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;

class zmt
  extends zn
{
  private zahf[] e;
  private boolean f;
  private boolean g;
  private int h;
  private DateTime i;
  
  public zmt(zig paramzig, String paramString)
  {
    super(paramzig);
    if (paramString == null) {
      paramString = paramzig.b();
    }
    char[] arrayOfChar = paramString.toCharArray();
    b(arrayOfChar, 0, arrayOfChar.length);
  }
  
  public zzz a(zzu paramzzu, DateTime paramDateTime, double paramDouble, boolean paramBoolean)
  {
    if ((paramBoolean) && (this.h != 0) && (f()))
    {
      if (paramDateTime.compareTo(this.i) > 0) {
        return a(paramzzu, paramDateTime);
      }
      paramDateTime = paramDateTime.addMilliseconds(this.h);
      paramDouble = a(paramDateTime);
    }
    zzz localzzz1 = super.a(paramzzu, paramDateTime, paramDouble, false);
    if (localzzz1.f() != 7) {
      return localzzz1;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    for (int j = 0; j < this.e.length; j++)
    {
      zzz localzzz2;
      switch (this.e[j].a())
      {
      case 1: 
        localzzz2 = ((zir)this.e[j]).a(paramzzu, 14, Double.valueOf(0.0D));
        a(localzzz1, localzzz2, localStringBuilder.length());
        if (!localzzz2.c()) {
          localStringBuilder.append(localzzz2.g());
        }
        break;
      default: 
        localzzz2 = ((zn)this.e[j]).a(paramzzu, paramDateTime, paramDouble, false);
        if (!localzzz2.c()) {
          localStringBuilder.append(localzzz2.g());
        }
        break;
      }
    }
    localzzz1.a(3, zs.a(localStringBuilder));
    return localzzz1;
  }
  
  private void b(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    this.f = false;
    this.g = false;
    this.h = 500;
    boolean bool1 = false;
    boolean bool2 = false;
    ArrayList localArrayList = new ArrayList(3);
    StringBuilder localStringBuilder = new StringBuilder(paramInt2 - paramInt1);
    super.e(paramArrayOfChar, paramInt1, paramInt2, localStringBuilder);
    paramArrayOfChar = zs.a(localStringBuilder).toCharArray();
    localStringBuilder.setLength(0);
    paramInt1 = 0;
    paramInt2 = paramArrayOfChar.length;
    Object localObject;
    while (paramInt1 < paramInt2)
    {
      int j;
      switch (paramArrayOfChar[paramInt1])
      {
      case '[': 
        if (paramInt1 + 1 < paramInt2)
        {
          j = -1;
          switch (paramArrayOfChar[(paramInt1 + 1)])
          {
          case 'H': 
          case 'h': 
            j = 0;
            break;
          case 'M': 
          case 'm': 
            j = 1;
            break;
          case 'S': 
          case 's': 
            j = 2;
          }
          if (j > -1)
          {
            this.f = true;
            paramInt1 += 2;
            int m = paramInt1;
            while ((paramInt1 < paramInt2) && (paramArrayOfChar[paramInt1] != ']')) {
              paramInt1++;
            }
            paramInt1++;
            a(localArrayList, localStringBuilder, bool1, bool2, new zbrd(this.a, null, null, j, paramInt1 - m));
            bool1 = false;
            bool2 = false;
            continue;
          }
        }
        paramInt1 = this.a.a(paramArrayOfChar, paramInt1, paramInt2, localStringBuilder, false);
        break;
      case 'H': 
      case 'd': 
      case 'h': 
      case 'm': 
      case 's': 
      case 'y': 
        if (bool2)
        {
          a(localArrayList, localStringBuilder);
          bool2 = false;
        }
        bool1 = true;
        localStringBuilder.append(paramArrayOfChar[paramInt1]);
        paramInt1++;
        break;
      case 'G': 
      case 'g': 
        if (bool2)
        {
          a(localArrayList, localStringBuilder);
          bool2 = false;
        }
        bool1 = true;
        localStringBuilder.append(paramArrayOfChar[paramInt1]);
        paramInt1++;
        while ((paramInt1 < paramInt2) && ((paramArrayOfChar[paramInt1] | 0x20) == 'g'))
        {
          localStringBuilder.append(paramArrayOfChar[paramInt1]);
          paramInt1++;
        }
      case 'M': 
        j = paramInt1;
        paramInt1++;
        while ((paramInt1 < paramInt2) && (paramArrayOfChar[paramInt1] == 'M')) {
          paramInt1++;
        }
        if (paramInt1 - j == 5)
        {
          a(localArrayList, localStringBuilder, bool1, bool2, new zbrb(this.a, null, null));
          bool1 = false;
          bool2 = false;
        }
        else
        {
          if (bool2)
          {
            a(localArrayList, localStringBuilder);
            bool2 = false;
          }
          bool1 = true;
          while (j < paramInt1)
          {
            localStringBuilder.append('M');
            j++;
          }
        }
        break;
      case '*': 
      case '_': 
        if (bool1)
        {
          zf.a(localArrayList, zs.a(localStringBuilder));
          localStringBuilder.setLength(0);
          bool1 = false;
        }
        bool2 = true;
        localStringBuilder.append(paramArrayOfChar[paramInt1]);
        paramInt1++;
        localStringBuilder.append(paramArrayOfChar[paramInt1]);
        paramInt1++;
        break;
      case '.': 
        if ((paramInt1 > 0) && (paramArrayOfChar[(paramInt1 - 1)] == 's'))
        {
          paramInt1++;
          j = paramInt1;
          while ((paramInt1 < paramInt2) && (paramArrayOfChar[paramInt1] == '0')) {
            paramInt1++;
          }
          if (paramInt1 > j)
          {
            a(localArrayList, localStringBuilder, bool1, bool2, new zbrc(this.a, null, null, paramInt1 - j));
            bool1 = false;
            bool2 = false;
            switch (paramInt1 - j)
            {
            case 1: 
              this.h = Math.min(50, this.h);
              break;
            case 2: 
              this.h = Math.min(5, this.h);
              break;
            default: 
              this.h = 0;
              break;
            }
          }
          else
          {
            localStringBuilder.append('.');
          }
        }
        else
        {
          localStringBuilder.append('.');
          paramInt1++;
        }
        break;
      case 'A': 
      case 'a': 
        if (paramInt1 + 2 < paramArrayOfChar.length)
        {
          zbqy localzbqy;
          switch (paramArrayOfChar[(paramInt1 + 1)])
          {
          case 'A': 
          case 'a': 
            j = paramInt1 + 2;
            while (j < paramArrayOfChar.length) {
              switch (paramArrayOfChar[j])
              {
              case 'A': 
              case 'a': 
                j++;
                break;
              }
            }
            if (j - paramInt1 > 2)
            {
              a(localArrayList, localStringBuilder, bool1, bool2, new zbre(this.a, null, null, j - paramInt1 > 3));
              a(256);
              bool1 = false;
              bool2 = false;
              paramInt1 = j;
            }
            break;
          case 'M': 
          case 'm': 
            if ((paramArrayOfChar[(paramInt1 + 2)] == '/') && (paramInt1 + 4 < paramArrayOfChar.length) && ((paramArrayOfChar[(paramInt1 + 3)] == 'p') || (paramArrayOfChar[(paramInt1 + 3)] == 'P')) && ((paramArrayOfChar[(paramInt1 + 4)] == 'm') || (paramArrayOfChar[(paramInt1 + 4)] == 'M')))
            {
              localzbqy = null;
              if (this.a.e() != 0)
              {
                localObject = zj.a(this.a.e()).e();
                localzbqy = new zbqy(this.a, null, null, ((zb)localObject).g, ((zb)localObject).h);
              }
              else
              {
                localzbqy = new zbqy(this.a, null, null, new String(paramArrayOfChar, paramInt1, 2), new String(paramArrayOfChar, paramInt1 + 3, 2));
              }
              a(localArrayList, localStringBuilder, bool1, bool2, localzbqy);
              bool1 = false;
              bool2 = false;
              a(64);
              paramInt1 += 5;
            }
            break;
          case '/': 
            if ((paramArrayOfChar[(paramInt1 + 2)] == 'p') || (paramArrayOfChar[(paramInt1 + 2)] == 'P'))
            {
              localzbqy = null;
              if (this.a.e() != 0)
              {
                localObject = zj.a(this.a.e()).e();
                localzbqy = new zbqy(this.a, null, null, ((zb)localObject).g, ((zb)localObject).h);
              }
              else
              {
                localzbqy = new zbqy(this.a, null, null, new String(paramArrayOfChar, paramInt1, 1), new String(paramArrayOfChar, paramInt1 + 2, 1));
              }
              a(localArrayList, localStringBuilder, bool1, bool2, localzbqy);
              bool1 = false;
              bool2 = false;
              paramInt1 += 3;
              a(64);
            }
            break;
          }
        }
        else
        {
          paramInt1 = b(paramArrayOfChar, paramInt1, paramArrayOfChar.length, localStringBuilder);
        }
        break;
      case '上': 
        if ((paramInt1 + 5 < paramArrayOfChar.length) && (paramArrayOfChar[(paramInt1 + 1)] == znq.b[1]) && (paramArrayOfChar[(paramInt1 + 2)] == '/') && (paramArrayOfChar[(paramInt1 + 3)] == znq.c[0]) && (paramArrayOfChar[(paramInt1 + 4)] == znq.c[1]))
        {
          a(localArrayList, localStringBuilder, bool1, bool2, new zbqy(this.a, null, null, new String(paramArrayOfChar, paramInt1, 2), new String(paramArrayOfChar, paramInt1 + 3, 2)));
          bool1 = false;
          bool2 = false;
          a(64);
          paramInt1 += 5;
        }
        else
        {
          localStringBuilder.append(paramArrayOfChar[paramInt1]);
          paramInt1++;
        }
        break;
      default: 
        paramInt1 = b(paramArrayOfChar, paramInt1, paramInt2, localStringBuilder);
      }
    }
    if (bool1)
    {
      zf.a(localArrayList, zs.a(localStringBuilder));
    }
    else if (bool2)
    {
      a(localArrayList, localStringBuilder);
      bool2 = false;
    }
    else if (localStringBuilder.length() > 0)
    {
      if (localArrayList.size() > 0) {
        ((zy)localArrayList.get(localArrayList.size() - 1)).b(a(localStringBuilder));
      } else {
        zf.a(localArrayList, zs.a(localStringBuilder));
      }
    }
    if (localArrayList.size() > 0)
    {
      this.e = new zahf[localArrayList.size()];
      for (int k = 0; k < this.e.length; k++) {
        if ((localArrayList.get(k) instanceof String))
        {
          localObject = (String)localArrayList.get(k);
          char[] arrayOfChar = ((String)localObject).toCharArray();
          if (b(64))
          {
            if (zl.a(arrayOfChar, 0, arrayOfChar.length, 'H', 'h')) {
              localObject = new String(arrayOfChar);
            }
          }
          else if (zl.a(arrayOfChar, 0, arrayOfChar.length, 'h', 'H')) {
            localObject = new String(arrayOfChar);
          }
          this.e[k] = new zbpg(this.a, (String)localObject, false, this.d);
          this.g = true;
        }
        else
        {
          this.e[k] = ((zahf)localArrayList.get(k));
          if ((!this.g) && (this.e[k].a() == 3)) {
            this.g = ((zn)this.e[k]).f();
          }
        }
      }
    }
    if (this.h > 0) {
      this.i = DateTime.b.addMilliseconds(-this.h);
    }
  }
  
  private void a(ArrayList paramArrayList, StringBuilder paramStringBuilder, boolean paramBoolean1, boolean paramBoolean2, zy paramzy)
  {
    if (paramBoolean1)
    {
      zf.a(paramArrayList, zs.a(paramStringBuilder));
      paramStringBuilder.setLength(0);
    }
    else if (paramBoolean2)
    {
      a(paramArrayList, paramStringBuilder);
    }
    else if (paramStringBuilder.length() > 0)
    {
      paramzy.a(a(paramStringBuilder));
    }
    zf.a(paramArrayList, paramzy);
  }
  
  private void a(ArrayList paramArrayList, StringBuilder paramStringBuilder)
  {
    zir localzir = new zir(this.a, zs.a(paramStringBuilder));
    paramStringBuilder.setLength(0);
    zf.a(paramArrayList, localzir);
  }
  
  private String a(StringBuilder paramStringBuilder)
  {
    for (int j = 0; j < paramStringBuilder.length(); j++) {
      switch (paramStringBuilder.charAt(j))
      {
      case '\\': 
        paramStringBuilder.delete(j, j + 1);
        break;
      case '"': 
        paramStringBuilder.delete(j, j + 1);
        while (j < paramStringBuilder.length())
        {
          if (paramStringBuilder.charAt(j) == '"')
          {
            paramStringBuilder.delete(j, j + 1);
            j--;
            break;
          }
          j++;
        }
      }
    }
    String str = zs.a(paramStringBuilder);
    paramStringBuilder.setLength(0);
    return str;
  }
  
  public boolean e()
  {
    return this.f;
  }
  
  public boolean f()
  {
    return this.g;
  }
  
  public int a()
  {
    return 3;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zmt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */