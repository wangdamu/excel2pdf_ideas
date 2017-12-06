package com.aspose.cells;

import com.aspose.cells.a.a.za;
import com.aspose.cells.a.c.zk;
import com.aspose.cells.a.c.zp;
import com.aspose.cells.b.a.zs;
import java.util.HashMap;

class zaaa
{
  private zzx a;
  private short b;
  private int c = 7;
  private zl d;
  private zl e;
  private boolean f = true;
  private boolean g = false;
  private boolean h = false;
  private int i = -1;
  
  public zaaa(zzx paramzzx)
  {
    this.a = paramzzx;
    this.b = paramzzx.e();
  }
  
  private void a()
  {
    this.c = 7;
    this.f = true;
    this.g = false;
    this.h = false;
    this.i = -1;
    this.d = null;
    this.e = null;
  }
  
  public zahf a(String paramString, boolean paramBoolean)
  {
    zig localzig = b();
    if (paramString.length() == 1) {
      switch (paramString.charAt(0))
      {
      case 'D': 
      case 'H': 
      case 'M': 
      case 'S': 
      case 'Y': 
      case 'd': 
      case 'h': 
      case 'm': 
      case 's': 
      case 'y': 
        return new zbpk(localzig, paramString);
      case '#': 
      case '0': 
        return new zbph(localzig, paramString);
      case '@': 
        return new zir(localzig, paramString);
      }
    }
    int j;
    if (this.a.f().b()) {
      j = za.a(this.a.a());
    } else {
      j = this.a.f().d();
    }
    int k;
    if (this.a.f().c()) {
      k = za.b(this.a.a());
    } else {
      k = this.a.f().e();
    }
    char[] arrayOfChar = paramString.toCharArray();
    Object localObject1 = null;
    Object localObject2 = new zahf[4];
    Object localObject3 = new zzy[4];
    int m = 0;
    StringBuilder localStringBuilder = new StringBuilder(arrayOfChar.length);
    int n = 0;
    Object localObject4 = 0;
    Object localObject5;
    int i4;
    while (localObject4 < arrayOfChar.length)
    {
      int i1;
      switch (arrayOfChar[localObject4])
      {
      case '#': 
      case '0': 
        switch (this.c)
        {
        case 7: 
          this.c = 2;
          if (this.f)
          {
            i1 = localObject4 == 0 ? 1 : 0;
            int i3 = 1;
            int i5 = 1;
            int i7 = 0;
            if (arrayOfChar[localObject4] == '0')
            {
              if (this.i > -1)
              {
                i5 = 0;
              }
              else
              {
                i3 = 0;
                i7 = 1;
              }
            }
            else if (this.i > -1) {
              i7 = 1;
            }
            localStringBuilder.append(arrayOfChar[localObject4]);
            localObject4++;
            while (localObject4 < arrayOfChar.length) {
              switch (arrayOfChar[localObject4])
              {
              case '#': 
                if (this.i > -1) {
                  i7 = 1;
                } else if (i7 != 0) {
                  this.f = false;
                }
                localStringBuilder.append(arrayOfChar[localObject4]);
                localObject4++;
                break;
              case '0': 
                if (this.i > -1)
                {
                  i5 = 0;
                  if (i7 != 0) {
                    this.f = false;
                  }
                }
                else
                {
                  i7 = 1;
                  i3 = 0;
                }
                localStringBuilder.append(arrayOfChar[localObject4]);
                localObject4++;
                break;
              case '.': 
                if (this.i > -1)
                {
                  this.f = false;
                }
                else
                {
                  this.i = localStringBuilder.length();
                  i7 = 0;
                }
                localStringBuilder.append(arrayOfChar[localObject4]);
                localObject4++;
                break;
              case ',': 
                localStringBuilder.append(arrayOfChar[localObject4]);
                localObject4++;
                break;
              }
            }
            if ((!this.f) || ((i3 == 0) && ((this.i <= -1) || (i5 == 0))) || ((i1 != 0) && (localObject4 >= arrayOfChar.length))) {
              continue;
            }
            this.f = false;
          }
          break;
        case 2: 
          this.f = false;
          break;
        case 4: 
          this.h = true;
        }
        break;
      case '.': 
        if (this.i > -1) {
          this.f = false;
        } else {
          this.i = localStringBuilder.length();
        }
        break;
      case '%': 
        this.f = false;
        break;
      case 'H': 
      case 'Y': 
      case 'h': 
      case 'y': 
        if (this.c == 7) {
          this.c = 3;
        }
        break;
      case 'D': 
      case 'd': 
        localObject4++;
        if (this.c == 7) {
          this.c = 3;
        }
        if (localObject4 < arrayOfChar.length)
        {
          if ((arrayOfChar[localObject4] | 0x20) == 'd')
          {
            localObject4++;
            if ((localObject4 < arrayOfChar.length) && ((arrayOfChar[localObject4] | 0x20) == 'd'))
            {
              this.c = 3;
              this.f = false;
              localObject4++;
              if ((localObject4 < arrayOfChar.length) && ((arrayOfChar[localObject4] | 0x20) == 'd'))
              {
                localStringBuilder.append("aaaa");
                localObject4++;
                while ((localObject4 < arrayOfChar.length) && ((arrayOfChar[localObject4] | 0x20) == 'd')) {
                  localObject4++;
                }
              }
              localStringBuilder.append("aaa");
            }
            else
            {
              localStringBuilder.append(arrayOfChar, localObject4 - 2, 2);
            }
          }
          else
          {
            localStringBuilder.append(arrayOfChar[(localObject4 - 1)]);
          }
        }
        else {
          localStringBuilder.append(arrayOfChar[(localObject4 - 1)]);
        }
        break;
      case 'M': 
      case 'm': 
        if (this.c == 7) {
          this.c = 3;
        }
        localStringBuilder.append(arrayOfChar[localObject4]);
        localObject4++;
        if (this.f)
        {
          for (i1 = 1; (localObject4 < arrayOfChar.length) && ((arrayOfChar[localObject4] | 0x20) == 'm'); i1++)
          {
            localStringBuilder.append(arrayOfChar[localObject4]);
            localObject4++;
          }
          if (i1 == 5) {
            this.f = false;
          }
        }
        break;
      case 'S': 
      case 's': 
        if (this.c == 7) {
          this.c = 3;
        }
        localStringBuilder.append(arrayOfChar[localObject4]);
        localObject4++;
        while (localObject4 < arrayOfChar.length) {
          switch (arrayOfChar[localObject4])
          {
          case ' ': 
          case 'S': 
          case 's': 
            localStringBuilder.append(arrayOfChar[localObject4]);
            localObject4++;
          }
        }
        localStringBuilder.append(arrayOfChar[localObject4]);
        localObject4++;
        while ((localObject4 < arrayOfChar.length) && (arrayOfChar[localObject4] == '0'))
        {
          this.f = false;
          localObject4++;
          localStringBuilder.append('0');
        }
        break;
      case '\\': 
        localStringBuilder.append('\\');
        localObject4++;
        if (localObject4 < arrayOfChar.length)
        {
          if ((this.f) && ((arrayOfChar[localObject4] == j) || ((this.a.f().c()) && (arrayOfChar[localObject4] == k)))) {
            this.f = false;
          }
          localStringBuilder.append(arrayOfChar[localObject4]);
          localObject4++;
        }
        break;
      case '"': 
        localObject4++;
        if (arrayOfChar[localObject4] == '"')
        {
          localObject4++;
        }
        else
        {
          localStringBuilder.append('"');
          while (localObject4 < arrayOfChar.length)
          {
            localStringBuilder.append(arrayOfChar[localObject4]);
            if (arrayOfChar[localObject4] == '"')
            {
              localObject4++;
              break;
            }
            if ((this.f) && ((arrayOfChar[localObject4] == j) || ((this.a.f().c()) && (arrayOfChar[localObject4] == k)))) {
              this.f = false;
            }
            localObject4++;
          }
        }
        break;
      case '[': 
        localObject4++;
        if (localObject4 < arrayOfChar.length)
        {
          i1 = 6;
          switch (arrayOfChar[localObject4])
          {
          case '>': 
            localObject4++;
            if (localObject4 < arrayOfChar.length) {
              if (arrayOfChar[localObject4] == '=')
              {
                i1 = 3;
                localObject4++;
              }
              else
              {
                i1 = 2;
              }
            }
            break;
          case '<': 
            localObject4++;
            if (localObject4 < arrayOfChar.length) {
              switch (arrayOfChar[localObject4])
              {
              case '=': 
                i1 = 5;
                localObject4++;
                break;
              case '>': 
                i1 = 8;
                localObject4++;
                break;
              default: 
                i1 = 4;
              }
            }
            break;
          case '=': 
            i1 = 1;
            localObject4++;
            break;
          case 'H': 
          case 'S': 
          case 'h': 
          case 's': 
            this.c = 3;
            this.f = false;
            localStringBuilder.append('[');
            localStringBuilder.append(arrayOfChar[localObject4]);
            localObject4++;
            break;
          case 'M': 
          case 'm': 
            if (localzig.a(arrayOfChar, localObject4, arrayOfChar.length))
            {
              localObject4 += 8;
            }
            else
            {
              this.c = 3;
              this.f = false;
              localStringBuilder.append('[');
              localStringBuilder.append(arrayOfChar[localObject4]);
              localObject4++;
            }
            break;
          default: 
            localObject4 = localzig.a(arrayOfChar, localObject4, arrayOfChar.length, localStringBuilder, false);
            switch (localzig.e())
            {
            case -3072: 
            case -2048: 
              this.c = 3;
              break;
            default: 
              continue;
              Object localObject6 = localObject4;
              double d1 = 0.0D;
              while (localObject4 < arrayOfChar.length)
              {
                if (arrayOfChar[localObject4] == ']')
                {
                  try
                  {
                    String str = new String(arrayOfChar, localObject6, localObject4 - localObject6);
                    d1 = zp.a(str.trim());
                  }
                  catch (Exception localException) {}
                  localObject4++;
                  break;
                }
                localObject4++;
              }
              localObject3[m] = new zzy(i1, d1);
            }
            break;
          }
        }
        break;
      case ';': 
        localzig.a(new String(arrayOfChar, n, localObject4 - n));
        localObject1 = null;
        if (this.a.m() != null)
        {
          localObject5 = this.a.m().get(localzig.b());
          if (localObject5 != null) {
            localObject1 = (zahf)localObject5;
          }
        }
        if (localObject1 == null)
        {
          localObject1 = a(zs.a(localStringBuilder), localzig);
          if (paramBoolean) {
            this.a.m().put(localzig.b(), localObject1);
          }
        }
        localStringBuilder.setLength(0);
        localzig = b();
        a();
        localObject2[m] = localObject1;
        m++;
        if (m >= localObject2.length)
        {
          localObject4 = arrayOfChar.length;
        }
        else
        {
          localObject4++;
          n = localObject4;
        }
        break;
      case '@': 
        this.c = 1;
        break;
      case 'G': 
      case 'g': 
        if (zaac.a(arrayOfChar, localObject4, arrayOfChar.length))
        {
          if (!this.g)
          {
            if (localStringBuilder.length() > 0)
            {
              this.d = a(zs.a(localStringBuilder), localzig);
              localStringBuilder.setLength(0);
            }
            this.c = 7;
            this.g = true;
          }
          localObject4 += 7;
        }
        else
        {
          localObject5 = localObject4;
          localObject4++;
          while ((localObject4 < arrayOfChar.length) && ((arrayOfChar[localObject4] | 0x20) == 'g')) {
            localObject4++;
          }
          this.c = 3;
          i4 = localzig.e();
          if (i4 == 0) {
            i4 = this.b;
          }
          localStringBuilder.append(zk.a(localObject4 - localObject5, i4));
          while ((localObject4 < arrayOfChar.length) && ((arrayOfChar[localObject4] | 0x20) == 'e'))
          {
            localStringBuilder.append('y');
            localObject4++;
          }
        }
        break;
      case 'A': 
      case 'a': 
        localStringBuilder.append(arrayOfChar[localObject4]);
        localObject4++;
        if (localObject4 < arrayOfChar.length) {
          switch (arrayOfChar[localObject4])
          {
          case 'A': 
          case 'a': 
            localStringBuilder.append(arrayOfChar[localObject4]);
            localObject4++;
            if ((localObject4 >= arrayOfChar.length) || ((arrayOfChar[localObject4] | 0x20) != 'a')) {
              continue;
            }
            this.c = 3;
            this.f = false;
            localObject4++;
            if ((localObject4 < arrayOfChar.length) && ((arrayOfChar[localObject4] | 0x20) == 'a'))
            {
              localStringBuilder.append("aa");
              localObject4++;
              while ((localObject4 < arrayOfChar.length) && ((arrayOfChar[localObject4] | 0x20) == 'a')) {
                localObject4++;
              }
            }
            localStringBuilder.append("a");
            break;
          case 'M': 
          case 'm': 
            if ((localObject4 + 3 >= arrayOfChar.length) || (arrayOfChar[(localObject4 + 1)] != '/') || ((arrayOfChar[(localObject4 + 2)] | 0x20) != 'p') || ((arrayOfChar[(localObject4 + 3)] | 0x20) != 'm')) {
              continue;
            }
            this.c = 3;
            this.f = false;
            localStringBuilder.append(arrayOfChar, localObject4, 4);
            localObject4 += 4;
            break;
          case '/': 
            localStringBuilder.append('/');
            localObject4++;
            if ((localObject4 >= arrayOfChar.length) || ((arrayOfChar[localObject4] | 0x20) != 'p')) {
              continue;
            }
            this.c = 3;
            this.f = false;
            localStringBuilder.append(arrayOfChar[localObject4]);
            localObject4++;
            break;
          }
        } else {
          localStringBuilder.append(arrayOfChar[(localObject4 - 1)]);
        }
        break;
      case 'E': 
      case 'e': 
        if (this.c == 2)
        {
          this.c = 5;
        }
        else if (this.i < 0)
        {
          this.c = 3;
          localStringBuilder.append(arrayOfChar[localObject4]);
        }
        break;
      case '?': 
        switch (this.c)
        {
        case 7: 
          this.c = 2;
          this.f = false;
          break;
        case 4: 
          this.h = true;
        }
        break;
      case '/': 
        if (this.c == 2)
        {
          this.c = 4;
        }
        else if ((localObject4 > 1) && (localObject4 + 2 < arrayOfChar.length) && (arrayOfChar[(localObject4 - 2)] == znq.b[0]) && (arrayOfChar[(localObject4 - 1)] == znq.b[1]) && (arrayOfChar[(localObject4 + 1)] == znq.c[0]) && (arrayOfChar[(localObject4 + 2)] == znq.c[1]))
        {
          this.c = 3;
          this.f = false;
        }
        break;
      case '*': 
      case '_': 
        this.f = false;
        localStringBuilder.append(arrayOfChar[localObject4]);
        localObject4++;
        break;
      case '$': 
      case '&': 
      case '\'': 
      case '(': 
      case ')': 
      case '+': 
      case ',': 
      case '-': 
      case '1': 
      case '2': 
      case '3': 
      case '4': 
      case '5': 
      case '6': 
      case '7': 
      case '8': 
      case '9': 
      case ':': 
      case '<': 
      case '=': 
      case '>': 
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
      case ']': 
      case '^': 
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
        if ((!this.h) && (this.c == 4) && (arrayOfChar[localObject4] >= '0') && (arrayOfChar[localObject4] <= '9')) {
          this.h = true;
        }
        localStringBuilder.append(arrayOfChar[localObject4]);
        localObject4++;
      }
    }
    if (m < localObject2.length)
    {
      localzig.a(m == 0 ? paramString : new String(arrayOfChar, n, localObject4 - n));
      localObject1 = null;
      if (this.a.m() != null)
      {
        localObject5 = this.a.m().get(localzig.b());
        if (localObject5 != null) {
          localObject1 = (zahf)localObject5;
        }
      }
      if (localObject1 == null)
      {
        localObject1 = a(zs.a(localStringBuilder), localzig);
        if (paramBoolean) {
          this.a.m().put(localzig.b(), localObject1);
        }
      }
      localObject2[m] = localObject1;
      m++;
    }
    if (m > 1)
    {
      int i2 = -1;
      i4 = 0;
      for (int i6 = 0; i6 < m; i6++) {
        if (localObject3[i6] == null)
        {
          i2 = i6;
          i4++;
        }
      }
      localObject1 = null;
      Object localObject7;
      zzy[] arrayOfzzy;
      if (i4 == 0)
      {
        if (m < localObject2.length)
        {
          localObject7 = new zahf[m];
          arrayOfzzy = new zzy[m];
          System.arraycopy(localObject2, 0, localObject7, 0, m);
          System.arraycopy(localObject3, 0, arrayOfzzy, 0, m);
          localObject2 = localObject7;
          localObject3 = arrayOfzzy;
        }
      }
      else if (i4 == 1)
      {
        localObject1 = localObject2[i2];
        localObject7 = new zahf[m - 1];
        arrayOfzzy = new zzy[m - 1];
        if (i2 > 0)
        {
          System.arraycopy(localObject2, 0, localObject7, 0, i2);
          System.arraycopy(localObject3, 0, arrayOfzzy, 0, i2);
        }
        if (i2 < m - 1)
        {
          System.arraycopy(localObject2, i2 + 1, localObject7, i2, m - i2 - 1);
          System.arraycopy(localObject3, i2 + 1, arrayOfzzy, i2, m - i2 - 1);
        }
        localObject2 = localObject7;
        localObject3 = arrayOfzzy;
      }
      else
      {
        switch (m)
        {
        case 2: 
          if ((localObject2[1].a() == 1) && (!((zir)localObject2[1]).e()))
          {
            localObject1 = localObject2[1];
            localObject2 = new zahf[] { localObject2[0] };
            localObject3 = new zzy[] { new zzy(6, 1.0D) };
          }
          else
          {
            localObject2 = new zahf[] { localObject2[0], localObject2[1] };
            localObject3 = new zzy[] { new zzy(3, 0.0D), new zzy(4, 0.0D) };
          }
          break;
        case 3: 
          if ((localObject2[2].a() == 1) && (!((zir)localObject2[2]).e()))
          {
            localObject1 = localObject2[2];
            localObject2 = new zahf[] { localObject2[0], localObject2[1] };
            if (i4 < m)
            {
              localObject7 = new zzy[2];
              if (localObject3[0] != null)
              {
                localObject7[0] = localObject3[0];
                localObject7[1] = new zzy(6, localObject3[0].b() == 0.0D ? 0.0D : 2.0D);
              }
              else
              {
                localObject7[0] = new zzy(3, 0.0D);
                if (localObject3[1] != null) {
                  localObject7[1] = localObject3[1];
                } else {
                  localObject7[1] = new zzy(6, 0.0D);
                }
              }
              localObject3 = localObject7;
            }
            else
            {
              localObject3 = new zzy[] { new zzy(3, 0.0D), new zzy(6, 0.0D) };
            }
          }
          else
          {
            if (localObject2.length > 3) {
              localObject2 = new zahf[] { localObject2[0], localObject2[1], localObject2[2] };
            }
            if ((i4 < m) && (localObject3[2] == null))
            {
              localObject7 = new zzy[3];
              if (localObject3[0] != null)
              {
                localObject7[0] = localObject3[0];
                localObject7[1] = new zzy(4, 0.0D);
                localObject7[2] = new zzy(6, localObject3[0].b() == 0.0D ? 0.0D : 2.0D);
              }
              else
              {
                localObject7[0] = new zzy(2, 0.0D);
                localObject7[1] = localObject3[1];
                localObject7[2] = new zzy(6, localObject3[1].b() == 0.0D ? 0.0D : 2.0D);
              }
              localObject3 = localObject7;
            }
            else
            {
              localObject3 = new zzy[] { new zzy(2, 0.0D), new zzy(4, 0.0D), new zzy(6, 0.0D) };
            }
          }
          break;
        case 4: 
          localObject1 = localObject2[3];
          localObject2 = new zahf[] { localObject2[0], localObject2[1], localObject2[2] };
          if (localObject3[0] != null)
          {
            localObject7 = new zzy[3];
            localObject7[0] = localObject3[0];
            if (localObject3[1] != null)
            {
              localObject7[1] = localObject3[1];
              localObject7[2] = new zzy(6, (localObject3[0].b() == 0.0D) && (localObject3[1].b() == 0.0D) ? 0.0D : 2.0D);
            }
            else
            {
              localObject7[1] = new zzy(4, 0.0D);
              localObject7[2] = new zzy(6, localObject3[0].b() == 0.0D ? 0.0D : 2.0D);
            }
            localObject3 = localObject7;
          }
          else if (localObject3[1] != null)
          {
            localObject7 = new zzy[3];
            localObject7[0] = new zzy(2, 0.0D);
            localObject7[1] = localObject3[1];
            localObject7[2] = new zzy(6, localObject3[1].b() == 0.0D ? 0.0D : 2.0D);
            localObject3 = localObject7;
          }
          else
          {
            localObject3 = new zzy[] { new zzy(2, 0.0D), new zzy(4, 0.0D), new zzy(6, 0.0D) };
          }
          break;
        }
      }
      localzig = b();
      localzig.a(paramString);
      localObject1 = new zaab(localzig, (zahf[])localObject2, (zzy[])localObject3, (zahf)localObject1);
      if (paramBoolean) {
        this.a.m().put(paramString, localObject1);
      }
    }
    return (zahf)localObject1;
  }
  
  private zig b()
  {
    zig localzig = new zig();
    localzig.a(this.a);
    return localzig;
  }
  
  private zl a(String paramString, zig paramzig)
  {
    switch (paramzig.e())
    {
    case -3072: 
    case -2048: 
      return new zbpg(paramzig, paramString, false, 0);
    }
    if (this.g)
    {
      if (paramString.length() > 0)
      {
        this.g = false;
        this.e = a(paramString, paramzig);
      }
      else if ((this.d == null) && (paramzig.a()))
      {
        return this.a.k();
      }
      return new zii(paramzig, this.d, this.e);
    }
    if ((this.i > -1) && (this.c == 7)) {
      this.c = 2;
    }
    switch (this.c)
    {
    case 2: 
      if ((this.f) && (this.i > -1)) {
        if ((this.i == 0) || (this.i == paramString.length() - 1)) {
          this.f = false;
        } else if (!a(paramString.charAt(this.i - 1))) {
          this.f = false;
        } else if (!a(paramString.charAt(this.i + 1))) {
          this.f = false;
        }
      }
      if (this.f) {
        return new zbph(paramzig, paramString);
      }
      return new zmu(paramzig, paramString);
    case 3: 
      if (this.f)
      {
        if (paramString.length() == 1) {
          return new zbpk(paramzig, paramString);
        }
        char[] arrayOfChar = paramString.toCharArray();
        if (zl.a(arrayOfChar, 0, arrayOfChar.length, 'h', 'H')) {
          paramString = new String(arrayOfChar);
        }
        return new zbpg(paramzig, paramString, true, 0);
      }
      return new zmt(paramzig, paramString);
    case 4: 
      if (this.h) {
        return new zih(paramzig, paramString);
      }
      if (this.f) {
        return new zbph(paramzig, paramString);
      }
      return new zmu(paramzig, paramString);
    case 5: 
      return new zio(paramzig, paramString);
    }
    return new zir(paramzig, paramString);
  }
  
  private boolean a(char paramChar)
  {
    return (paramChar == '0') || (paramChar == '#');
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */