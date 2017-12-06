package com.aspose.cells;

import com.aspose.cells.a.a.za;
import com.aspose.cells.b.a.zs;

class zhz
  implements ICustomParser
{
  private zavo a = new zavo();
  private StringBuilder b = new StringBuilder(50);
  private StringBuilder c = new StringBuilder(10);
  private zzx d;
  private za e;
  private zaiu f;
  private zavl g;
  private int[] h = new int[3];
  private int[] i = new int[3];
  private int[] j = new int[3];
  private String[] k = new String[3];
  private int l = -1;
  private int m = -1;
  private int n = -1;
  private int o = -1;
  private int p = -1;
  private int q = -1;
  private int r = -1;
  private int s;
  private int t;
  private int u;
  private int v;
  private char[] w;
  
  public zhz(zavl paramzavl)
  {
    this.g = paramzavl;
    zzx localzzx = paramzavl.a();
    this.d = localzzx;
    this.e = this.d.f();
    this.f = paramzavl.b();
    if (this.f == null) {
      this.f = new zil(paramzavl);
    }
  }
  
  public Object parseObject(String value)
  {
    this.b.setLength(0);
    this.a.c();
    if ((value == null) || ("".equals(value))) {
      return null;
    }
    this.w = value.toCharArray();
    if (this.w[0] == ' ') {
      return null;
    }
    this.t = 0;
    this.u = this.w.length;
    this.v = 0;
    b();
    this.a.a = 1;
    this.l = -1;
    this.m = -1;
    this.n = -1;
    this.o = -1;
    this.p = -1;
    this.q = -1;
    this.r = -1;
    this.v = this.t;
    int i1 = 0;
    int i2 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    label268:
    int i12;
    while (this.v < this.u)
    {
      int i3 = this.w[this.v];
      if ((i3 >= 48) && (i3 <= 57))
      {
        if (((i8 == 0) || (i9 == 0)) && (this.s <= 2)) {
          if (this.s > 0)
          {
            if (this.v - i4 > ((i6 != 0) || ((this.l > -1) && (this.l < this.s)) ? 1 : 3)) {}
          }
          else {
            if ((i8 != 0) || (this.m != this.s)) {
              break label268;
            }
          }
        }
        return null;
        i1 = i1 * 10 + (i3 - 48);
        if (i6 != 0)
        {
          if ((this.s > 0) && (i1 > 60)) {
            return null;
          }
        }
        else if (i1 > 9999) {
          return null;
        }
        this.v += 1;
      }
      else
      {
        int i13;
        if (i4 < this.v)
        {
          if ((i8 == 0) || (i9 == 0))
          {
            zavn localzavn1 = this.f.a(this.w, this.v, i1);
            i13 = 1;
            if (localzavn1 != null)
            {
              switch (localzavn1.a)
              {
              case 8: 
              case 16: 
              case 32: 
                i13 = 0;
                break;
              default: 
                i13 = 1;
                break;
              }
            }
            else
            {
              if (i8 == 0)
              {
                i2 = this.f.c(this.w, this.v);
                if (i2 > 0)
                {
                  i13 = 1;
                  localzavn1 = new zavn();
                  localzavn1.f = (this.v + i2);
                  if (i1 > 100)
                  {
                    if (this.v - i4 < 4) {
                      return null;
                    }
                    localzavn1.a = 1;
                  }
                  else if (i1 > 31)
                  {
                    localzavn1.a = 1;
                  }
                  else if (i1 > 12)
                  {
                    if ((this.l > -1) && (this.l < this.s)) {
                      localzavn1.a = 1;
                    } else {
                      localzavn1.a = 0;
                    }
                  }
                  else if ((this.l > -1) && (this.l < this.s) && (this.n > -1) && (this.n < this.s))
                  {
                    localzavn1.a = 1;
                  }
                  else
                  {
                    localzavn1.a = 0;
                  }
                }
              }
              if ((localzavn1 == null) && (i9 == 0))
              {
                i2 = this.f.d(this.w, this.v);
                if (i2 > 0)
                {
                  i13 = 0;
                  localzavn1 = new zavn();
                  localzavn1.a = 0;
                  localzavn1.f = (this.v + i2);
                }
              }
            }
            if (localzavn1 != null)
            {
              if (i13 != 0)
              {
                if (i8 != 0) {
                  return null;
                }
                if (i6 != 0) {
                  if (this.s > 1)
                  {
                    if (i7 != 0) {
                      b(i5, i4);
                    } else {
                      a(true);
                    }
                    if (this.p < 0) {
                      return null;
                    }
                    a(this.j[(this.s - 1)], i4, false);
                    i6 = 0;
                    i9 = 1;
                    b();
                    i5 = i4;
                    i7 = 0;
                  }
                  else
                  {
                    return null;
                  }
                }
              }
              else
              {
                if (i9 != 0) {
                  return null;
                }
                if ((this.v - i4 > 2) && (this.w[i4] == '0')) {
                  return null;
                }
                if (i6 == 0)
                {
                  if (this.s > 1)
                  {
                    if (i8 != 0) {
                      return null;
                    }
                    if (i7 != 0) {
                      a(i5, i4);
                    } else {
                      g();
                    }
                    if (this.m < 0) {
                      return null;
                    }
                    a(this.j[(this.s - 1)], i4, false);
                    i8 = 1;
                    b();
                    i5 = i4;
                    i7 = 0;
                  }
                  else if (this.s > 0)
                  {
                    return null;
                  }
                  i6 = 1;
                }
              }
              switch (localzavn1.a)
              {
              case 2: 
                if (this.m < 0) {
                  this.m = this.s;
                } else if (this.m != this.s) {
                  return null;
                }
                break;
              case 4: 
                if (this.n < 0) {
                  this.n = this.s;
                } else if (this.n != this.s) {
                  return null;
                }
                break;
              case 1: 
              case 128: 
                if (this.l < 0) {
                  this.l = this.s;
                } else if (this.l != this.s) {
                  return null;
                }
                break;
              case 8: 
                if (this.o < 0) {
                  this.o = this.s;
                } else if (this.o != this.s) {
                  return null;
                }
                break;
              case 16: 
                if (this.p < 0) {
                  this.p = this.s;
                } else if (this.p != this.s) {
                  return null;
                }
                break;
              case 32: 
                if (this.q < 0) {
                  this.q = this.s;
                } else if (this.q != this.s) {
                  return null;
                }
                break;
              }
              this.h[this.s] = i1;
              this.i[this.s] = i4;
              this.j[this.s] = this.v;
              this.s += 1;
              this.v = localzavn1.f;
              i4 = this.v;
              i1 = 0;
              continue;
            }
          }
          if ((this.s > 2) || ((i8 != 0) && (i9 != 0))) {
            return null;
          }
          this.h[this.s] = i1;
          this.i[this.s] = i4;
          this.j[this.s] = this.v;
          this.s += 1;
        }
        else if ((i3 == 32) || (i3 == 84))
        {
          int i11 = this.v;
          for (this.v += 1; (this.v < this.u) && (this.w[this.v] == ' '); this.v += 1) {}
          i13 = 0;
          switch (this.s)
          {
          case 0: 
            a(i11, this.v, i6 == 0);
            break;
          case 1: 
            if ((i11 > i4) && (this.v < this.u) && (this.w[this.v] >= '0') && (this.w[this.v] <= '9')) {
              return null;
            }
            break;
          case 2: 
            if ((i11 > i4) && (this.v < this.u) && (this.w[this.v] >= '0') && (this.w[this.v] <= '9')) {
              i13 = 1;
            }
            break;
          case 3: 
            i13 = 1;
            break;
          }
          if (i13 != 0)
          {
            if (i7 != 0)
            {
              if (i6 == 0) {
                if (i8 != 0)
                {
                  if (i9 != 0) {
                    return null;
                  }
                  i6 = 1;
                }
                else
                {
                  i6 = (i9 == 0) && (this.m < 0) && (this.n < 0) && (this.l < 0) ? 1 : 0;
                  a(i5, this.v);
                  if (this.m < 0)
                  {
                    if (i6 == 0) {
                      return null;
                    }
                  }
                  else
                  {
                    i8 = 1;
                    i6 = 0;
                  }
                }
              }
              if (i6 != 0)
              {
                b(i5, this.v);
                if (this.p < 0) {
                  return null;
                }
                i6 = 0;
                i9 = 1;
              }
            }
            else if (i6 != 0)
            {
              a(true);
              if (this.p < 0) {
                return null;
              }
              i6 = 0;
              i9 = 1;
            }
            else
            {
              g();
              if (this.m < 0) {
                return null;
              }
              i8 = 1;
            }
            a(this.j[(this.s - 1)], this.v, false);
            b();
            i5 = this.v;
            i7 = 0;
          }
          i4 = this.v;
          i1 = 0;
        }
        else
        {
          if ((i8 == 0) || (i9 == 0))
          {
            zavn localzavn2 = this.f.e(this.w, this.v);
            if (localzavn2 != null)
            {
              switch (localzavn2.a)
              {
              case 1: 
              case 2: 
              case 4: 
              case 128: 
                if (i8 != 0) {
                  return null;
                }
                if (i6 != 0) {
                  if (this.s > 1)
                  {
                    if (i7 != 0) {
                      b(i5, this.v);
                    } else {
                      a(true);
                    }
                    if (this.p < 0) {
                      return null;
                    }
                    a(this.j[(this.s - 1)], this.v + i2, false);
                    i6 = 0;
                    i9 = 1;
                    b();
                    i5 = this.v;
                    i7 = 0;
                  }
                  else
                  {
                    return null;
                  }
                }
                if (localzavn2.a == 2)
                {
                  if (this.m > -1) {
                    return null;
                  }
                  this.m = this.s;
                }
                else if (localzavn2.a == 4)
                {
                  if (this.n > -1) {
                    return null;
                  }
                  this.n = this.s;
                }
                else
                {
                  if (this.l > -1) {
                    return null;
                  }
                  this.l = this.s;
                }
                break;
              case 8: 
              case 16: 
              case 32: 
                if (i9 != 0) {
                  return null;
                }
                if (i6 == 0)
                {
                  if (this.s > 1)
                  {
                    if (i7 != 0) {
                      a(i5, this.v);
                    } else {
                      g();
                    }
                    if (this.m < 0) {
                      return null;
                    }
                    a(this.j[(this.s - 1)], this.v + i2, false);
                    i8 = 1;
                    b();
                    i5 = this.v;
                    i7 = 0;
                  }
                  else
                  {
                    if (this.s > 0) {
                      return null;
                    }
                    a(this.v, this.v + i2, false);
                  }
                  i6 = 1;
                }
                if (localzavn2.a == 8)
                {
                  if (this.o > -1) {
                    return null;
                  }
                  this.o = this.s;
                }
                else if (localzavn2.a == 16)
                {
                  if (this.p > -1) {
                    return null;
                  }
                  this.p = this.s;
                }
                else
                {
                  if (this.q > -1) {
                    return null;
                  }
                  this.q = this.s;
                }
                break;
              default: 
                this.v = localzavn2.f;
                break;
              }
              this.i[this.s] = localzavn2.d;
              this.h[this.s] = localzavn2.b;
              this.k[this.s] = localzavn2.c;
              this.s += 1;
              this.v = localzavn2.f;
              i4 = this.v;
              i1 = 0;
              continue;
            }
          }
          if (i10 == 0)
          {
            this.c.setLength(0);
            i2 = this.f.a(this.w, this.v, this.c);
            if (i2 > 0)
            {
              i10 = 1;
            }
            else
            {
              i2 = this.f.b(this.w, this.v, this.c);
              if (i2 > 0) {
                i10 = 2;
              }
            }
            if (i2 > 0)
            {
              if (this.s > 1)
              {
                if (i7 != 0)
                {
                  if ((i8 == 0) && (i6 == 0))
                  {
                    i6 = (i9 == 0) && (this.m < 0) && (this.n < 0) && (this.l < 0) ? 1 : 0;
                    a(i5, this.v);
                    if (this.m < 0)
                    {
                      if (i6 == 0) {
                        return null;
                      }
                    }
                    else
                    {
                      i8 = 1;
                      i6 = 0;
                    }
                  }
                  if (i6 != 0)
                  {
                    b(i5, this.v);
                    if (this.p < 0) {
                      return null;
                    }
                    i6 = 0;
                    i9 = 1;
                  }
                }
                else if (i6 != 0)
                {
                  a(true);
                  if (this.p < 0) {
                    return null;
                  }
                  i6 = 0;
                  i9 = 1;
                }
                else
                {
                  g();
                  if (this.m < 0) {
                    return null;
                  }
                  i8 = 1;
                }
                a(this.j[(this.s - 1)], this.v, false);
                b();
                i5 = this.v + i2;
                i7 = 0;
              }
              else if (this.s > 0)
              {
                return null;
              }
              this.b.append(this.c);
              this.a.a(64);
              this.v += i2;
              i4 = this.v;
              i1 = 0;
              continue;
            }
          }
          if (i6 != 0)
          {
            if ((i3 == 46) || (i3 == this.e.d()))
            {
              if ((this.s < 2) || (this.v == i4) || (i1 > 60)) {
                return null;
              }
              if (i7 != 0) {
                b(i5, this.v);
              } else {
                a(false);
              }
              if (this.p < 0) {
                return null;
              }
              i6 = 0;
              i9 = 1;
              this.b.append('.');
              b();
              this.v += 1;
              i4 = this.v;
              i1 = 0;
              while (this.v < Math.min(this.u, i4 + 9))
              {
                i3 = this.w[this.v];
                if ((i3 < 48) || (i3 > 57)) {
                  break;
                }
                i1 = i1 * 10 + (i3 - 48);
                this.v += 1;
              }
              if (this.v > i4)
              {
                switch (this.v - i4)
                {
                case 1: 
                  i1 *= 100;
                  this.b.append('0');
                  break;
                case 2: 
                  i1 *= 10;
                  this.b.append("00");
                  break;
                case 3: 
                  this.b.append("000");
                  break;
                case 9: 
                  if (this.v < this.u)
                  {
                    i3 = this.w[this.v];
                    if ((i3 >= 48) && (i3 <= 57))
                    {
                      if (i1 > 214748364) {
                        return null;
                      }
                      if ((i1 == 214748364) && (i3 > 55)) {
                        return null;
                      }
                      i1 = i1 * 10 + (i3 - 48);
                      this.v += 1;
                    }
                  }
                  i1 = (int)(i1 / Math.pow(10.0D, this.v - i4 - 3) + 0.5D);
                  this.b.append("000");
                  break;
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                default: 
                  i1 = (int)(i1 / Math.pow(10.0D, this.v - i4 - 3) + 0.5D);
                  this.b.append("000");
                }
                this.r = i1;
                i1 = 0;
                i4 = this.v;
              }
              i5 = this.v;
              i7 = 0;
            }
            else
            {
              i7 = 1;
              this.v += 1;
              i4 = this.v;
              i1 = 0;
            }
          }
          else
          {
            if (i8 != 0) {
              return null;
            }
            if ((i3 == 44) || (i3 == this.e.e()))
            {
              if (this.s == 2)
              {
                if (this.m < 0) {
                  return null;
                }
                if ((this.m >= this.s) || (this.j[this.m] - this.i[this.m] < 3)) {
                  return null;
                }
                this.n = (1 - this.m);
              }
              else if (this.s == 1)
              {
                if (this.m < 0)
                {
                  this.n = 0;
                  this.m = 1;
                }
                else if (this.m != 0)
                {
                  return null;
                }
              }
              else
              {
                return null;
              }
              this.i[this.s] = this.v;
              for (i12 = 0; i12 < this.s; i12++) {
                for (i13 = this.j[i12]; i13 < this.i[(i12 + 1)]; i13++) {
                  if (this.w[i13] != ' ') {
                    return null;
                  }
                }
              }
              if ((this.n > -1) && (this.n < this.s) && ((this.h[this.n] < 1) || (this.h[this.n] > 31))) {
                return null;
              }
              this.v += 1;
              i4 = this.v;
              i1 = 0;
            }
            else
            {
              if ((this.s < 3) && ((this.m < 0) || (this.m == this.s)))
              {
                i2 = this.f.f(this.w, this.v);
                if (i2 != 0)
                {
                  this.h[this.s] = ((i2 >> 1 & 0x7FFFFFFF) >> 27);
                  this.i[this.s] = this.v;
                  i2 &= 0xFFFFFFF;
                  this.v += i2;
                  this.j[this.s] = this.v;
                  if ((this.v < this.u) && (this.w[this.v] == ' '))
                  {
                    do
                    {
                      this.v += 1;
                      if (this.v >= this.u) {
                        break;
                      }
                    } while (this.w[this.v] == ' ');
                    if (!a(this.w[this.v])) {
                      this.v -= 1;
                    }
                  }
                  if (this.v == this.u)
                  {
                    this.m = this.s;
                    this.s += 1;
                    i4 = this.v;
                    i1 = 0;
                    break;
                  }
                  if (this.v < this.u)
                  {
                    if (a(this.w[this.v]))
                    {
                      this.m = this.s;
                      this.s += 1;
                      if (this.w[this.v] != ' ') {
                        this.v += 1;
                      }
                      i4 = this.v;
                      i1 = 0;
                      continue;
                    }
                    if ((this.w[this.v] >= '0') && (this.w[this.v] <= '9'))
                    {
                      this.m = this.s;
                      this.s += 1;
                      i4 = this.v;
                      i1 = 0;
                      continue;
                    }
                  }
                  this.v -= i2;
                }
                if (this.m == this.s) {
                  return null;
                }
              }
              if (i7 != 0)
              {
                if (this.v - (this.s > 0 ? this.j[(this.s - 1)] : this.t) > 20) {
                  return null;
                }
              }
              else {
                i7 = 1;
              }
              this.v += 1;
              i4 = this.v;
              i1 = 0;
            }
          }
        }
      }
    }
    if (this.s > 0)
    {
      if ((i8 != 0) && (i9 != 0)) {
        return null;
      }
      if (this.v > i4)
      {
        this.h[this.s] = i1;
        this.i[this.s] = i4;
        this.j[this.s] = this.v;
        this.s += 1;
      }
      if (this.s < 2) {
        return null;
      }
      if (i7 != 0)
      {
        if ((i8 == 0) && (i6 == 0))
        {
          i6 = (i9 == 0) && (this.m < 0) && (this.n < 0) && (this.l < 0) ? 1 : 0;
          a(i5, this.v);
          if (this.m < 0)
          {
            if (i6 == 0) {
              return null;
            }
          }
          else
          {
            i8 = 1;
            i6 = 0;
          }
        }
        if (i6 != 0)
        {
          b(i5, this.v);
          if (this.p < 0) {
            return null;
          }
          i6 = 0;
          i9 = 1;
        }
      }
      else if (i6 != 0)
      {
        a(true);
        if (this.p < 0) {
          return null;
        }
        i6 = 0;
        i9 = 1;
      }
      else
      {
        if (i8 != 0) {
          return null;
        }
        if (this.l < 0) {
          for (i12 = this.j[(this.s - 1)]; i12 < this.v; i12++) {
            if ((this.w[i12] == ',') || (this.w[i12] == this.e.e())) {
              return null;
            }
          }
        }
        g();
        if (this.m < 0) {
          return null;
        }
        i8 = 1;
      }
      a(this.j[(this.s - 1)], this.v, false);
    }
    else if (this.v > i4)
    {
      return null;
    }
    if ((i10 & 0xFF) > 0)
    {
      if ((this.p < 0) || (this.o < 0) || (this.o > 12)) {
        return null;
      }
      if (i10 == 1)
      {
        if (this.o == 12) {
          this.o = 0;
        }
      }
      else if (this.o < 12) {
        this.o += 12;
      }
    }
    double d1;
    if (this.m < 0)
    {
      if (this.p < 0) {
        return null;
      }
      d1 = 0.0D;
      if (this.o > -1) {
        d1 = this.o;
      }
      d1 += this.p / 60.0D;
      if (this.q > -1) {
        d1 += this.q / 3600.0D;
      }
      if (this.r > -1) {
        d1 += this.r / 3600000.0D;
      }
      this.a.a(zbxa.a(d1 / 24.0D, false));
    }
    else
    {
      if ((this.l == 1900) && (this.m == 2) && (this.n == 29)) {
        if (this.o > 23)
        {
          this.m = 3;
          this.n = 1;
          this.o -= 24;
        }
        else
        {
          this.a.a = 4;
          d1 = 60.0D;
          if (this.o > -1) {
            d1 += this.o / 24.0D;
          }
          if (this.p > -1) {
            d1 += this.p / 1440.0D;
          }
          if (this.q > -1) {
            d1 += this.q / 86400.0D;
          }
          if (this.r > -1) {
            d1 += this.r / 8.64E7D;
          }
          this.a.a(Double.valueOf(d1));
          this.a.a(zs.a(this.b));
          return Double.valueOf(d1);
        }
      }
      if (this.o > 23)
      {
        DateTime localDateTime = new DateTime(this.l, this.m, this.n > -1 ? this.n : 1, 0, this.p > -1 ? this.p : 0, this.q > -1 ? this.q : 0, this.r > -1 ? this.r : 0);
        this.a.a(localDateTime.addHours(this.o));
      }
      else
      {
        this.a.a(new DateTime(this.l, this.m, this.n > -1 ? this.n : 1, this.o > -1 ? this.o : 0, this.p > -1 ? this.p : 0, this.q > -1 ? this.q : 0, this.r > -1 ? this.r : 0));
      }
    }
    this.a.a(zs.a(this.b));
    return this.a.d();
  }
  
  public zavo a()
  {
    return this.a;
  }
  
  private void b()
  {
    this.s = 0;
    this.k[0] = null;
    this.k[1] = null;
    this.k[2] = null;
  }
  
  private void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramInt1 == paramInt2) {
      return;
    }
    int i1 = (this.b.length() > 0) && (this.b.charAt(this.b.length() - 1) == '"') ? 1 : 0;
    if (i1 != 0) {
      this.b.setLength(this.b.length() - 1);
    }
    while (paramInt1 < paramInt2)
    {
      switch (this.w[paramInt1])
      {
      case ' ': 
      case ',': 
      case '-': 
      case '.': 
      case ':': 
        if (i1 != 0)
        {
          this.b.append('"');
          i1 = 0;
        }
        break;
      case '/': 
        if ((paramBoolean) && (this.w[paramInt1] != this.e.g()))
        {
          if (i1 == 0) {
            this.b.append('\\');
          }
        }
        else if (i1 != 0)
        {
          this.b.append('"');
          i1 = 0;
        }
        break;
      default: 
        if (i1 == 0)
        {
          this.b.append('"');
          i1 = 1;
        }
        break;
      }
      this.b.append(this.w[paramInt1]);
      paramInt1++;
    }
    if (i1 != 0) {
      this.b.append('"');
    }
  }
  
  private void a(int paramInt, boolean paramBoolean)
  {
    if (paramInt < this.s - 1) {
      a(this.j[paramInt], this.i[(paramInt + 1)], paramBoolean);
    }
  }
  
  private void a(boolean paramBoolean)
  {
    if (this.s > 2)
    {
      if (this.o < 0)
      {
        if ((this.p > -1) || (this.q > -1))
        {
          this.p = -1;
          return;
        }
        this.o = 0;
        this.p = 1;
        this.q = 2;
      }
      else if ((this.p < 0) || (this.q < 0))
      {
        this.p = -1;
      }
    }
    else if (this.s > 1)
    {
      if (this.p < 0)
      {
        if (this.o < 0)
        {
          if (this.q < 0)
          {
            if (paramBoolean)
            {
              this.o = 0;
              this.p = 1;
            }
            else
            {
              this.p = 0;
              this.q = 1;
            }
          }
          else {
            this.p = -1;
          }
        }
        else {
          this.p = -1;
        }
      }
      else if ((this.o < 0) && (this.q < 0)) {
        this.p = -1;
      }
    }
    else
    {
      this.p = -1;
      return;
    }
    c();
    if (this.p < 0) {
      return;
    }
    int i1 = 0;
    this.p = this.h[this.p];
    if (this.p == 60) {
      i1++;
    }
    if (this.o > -1)
    {
      this.o = this.h[this.o];
      if (this.o == 60) {
        i1++;
      }
    }
    if (this.q > -1)
    {
      this.q = this.h[this.q];
      if (this.q == 60) {
        i1++;
      }
    }
    if (i1 > 1)
    {
      this.p = -1;
      return;
    }
  }
  
  private void c()
  {
    switch (this.o)
    {
    case 0: 
      switch (this.p)
      {
      case 1: 
        if ((this.q > -1) && (this.q != 2))
        {
          this.p = -1;
          return;
        }
        d();
        e();
        f();
        break;
      case 2: 
        if (this.q != 1)
        {
          this.p = -1;
          return;
        }
        d();
        f();
        e();
        break;
      default: 
        this.p = -1;
        return;
      }
      break;
    case 1: 
      switch (this.p)
      {
      case 0: 
        if ((this.q > -1) && (this.q != 2))
        {
          this.p = -1;
          return;
        }
        e();
        d();
        f();
        break;
      case 2: 
        if (this.q != 0)
        {
          this.p = -1;
          return;
        }
        f();
        d();
        e();
        break;
      default: 
        this.p = -1;
        return;
      }
      break;
    default: 
      switch (this.p)
      {
      case 0: 
        if (this.q != 1)
        {
          this.p = -1;
          return;
        }
        e();
        f();
        d();
        break;
      case 1: 
        if (this.q != 0)
        {
          this.p = -1;
          return;
        }
        f();
        e();
        d();
        break;
      default: 
        this.p = -1;
        return;
      }
      break;
    }
  }
  
  private void d()
  {
    if (this.o < 0) {
      return;
    }
    this.a.a(8);
    if (this.k[this.o] != null)
    {
      this.b.append(this.k[this.o]);
      return;
    }
    if (this.h[this.o] > 23) {
      this.b.append("[h]");
    } else if ((this.h[this.o] < 10) && (this.j[this.o] - this.i[this.o] > 1)) {
      this.b.append("hh");
    } else {
      this.b.append('h');
    }
    a(this.o, false);
  }
  
  private void e()
  {
    this.a.a(16);
    if (this.k[this.p] != null)
    {
      this.b.append(this.k[this.p]);
      return;
    }
    if ((this.j[this.p] - this.i[this.p] > 1) && ((this.h[this.p] < 10) || ((this.q > -1) && (this.h[this.q] < 10) && (this.j[this.q] - this.i[this.q] > 1)))) {
      this.b.append("mm");
    } else {
      this.b.append('m');
    }
    a(this.p, false);
  }
  
  private void f()
  {
    if (this.q < 0) {
      return;
    }
    this.a.a(32);
    if (this.k[this.q] != null)
    {
      this.b.append(this.k[this.q]);
      return;
    }
    if ((this.j[this.q] - this.i[this.q] > 1) && ((this.h[this.q] < 10) || ((this.p > -1) && (this.h[this.p] < 10) && (this.j[this.p] - this.i[this.p] > 1)))) {
      this.b.append("ss");
    } else {
      this.b.append('s');
    }
    a(this.q, false);
  }
  
  private void g()
  {
    if (this.s < 2) {
      return;
    }
    if ((this.s > 2) && (this.g.e())) {}
    switch (this.e.f())
    {
    case 5: 
      if (this.l < 0)
      {
        this.l = 0;
      }
      else if (this.l != 0)
      {
        this.m = -1;
        return;
      }
      if (this.n < 0)
      {
        this.n = 1;
      }
      else if (this.n != 1)
      {
        this.m = -1;
        return;
      }
      if (this.m < 0)
      {
        this.m = 2;
      }
      else if (this.m != 2)
      {
        this.m = -1;
        return;
      }
      if ((l()) && (m()) && (n()))
      {
        o();
        q();
        p();
      }
      else
      {
        this.m = -1;
        return;
      }
      break;
    case 4: 
      if (this.l < 0)
      {
        this.l = 0;
      }
      else if (this.l != 0)
      {
        this.m = -1;
        return;
      }
      if (this.m < 0)
      {
        this.m = 1;
      }
      else if (this.m != 1)
      {
        this.m = -1;
        return;
      }
      if (this.n < 0)
      {
        this.n = 2;
      }
      else if (this.n != 2)
      {
        this.m = -1;
        return;
      }
      if ((l()) && (m()) && (n()))
      {
        o();
        p();
        q();
      }
      else
      {
        this.m = -1;
        return;
      }
      break;
    case 6: 
      if (this.m < 0)
      {
        this.m = 0;
      }
      else if (this.m != 0)
      {
        this.m = -1;
        return;
      }
      if (this.l < 0)
      {
        this.l = 1;
      }
      else if (this.l != 1)
      {
        this.m = -1;
        return;
      }
      if (this.n < 0)
      {
        this.n = 2;
      }
      else if (this.n != 2)
      {
        this.m = -1;
        return;
      }
      if ((l()) && (m()) && (n()))
      {
        p();
        o();
        q();
      }
      else
      {
        this.m = -1;
        return;
      }
      break;
    case 7: 
      if (this.n < 0)
      {
        this.n = 0;
      }
      else if (this.n != 0)
      {
        this.m = -1;
        return;
      }
      if (this.l < 0)
      {
        this.l = 1;
      }
      else if (this.l != 1)
      {
        this.m = -1;
        return;
      }
      if (this.m < 0)
      {
        this.m = 2;
      }
      else if (this.m != 2)
      {
        this.m = -1;
        return;
      }
      if ((l()) && (m()) && (n()))
      {
        q();
        o();
        p();
      }
      else
      {
        this.m = -1;
        return;
      }
      break;
    case 3: 
      if (this.n < 0)
      {
        this.n = 0;
      }
      else if (this.n != 0)
      {
        this.m = -1;
        return;
      }
      if (this.m < 0)
      {
        this.m = 1;
      }
      else if (this.m != 1)
      {
        this.m = -1;
        return;
      }
      if (this.l < 0)
      {
        this.l = 2;
      }
      else if (this.l != 2)
      {
        this.m = -1;
        return;
      }
      if ((l()) && (m()) && (n()))
      {
        q();
        p();
        o();
      }
      else
      {
        this.m = -1;
        return;
      }
      break;
    case 2: 
      if (this.m < 0)
      {
        this.m = 0;
      }
      else if (this.m != 0)
      {
        this.m = -1;
        return;
      }
      if (this.n < 0)
      {
        this.n = 1;
      }
      else if (this.n != 1)
      {
        this.m = -1;
        return;
      }
      if (this.l < 0)
      {
        this.l = 2;
      }
      else if (this.l != 2)
      {
        this.m = -1;
        return;
      }
      if ((l()) && (m()) && (n()))
      {
        p();
        q();
        o();
      }
      else
      {
        this.m = -1;
        return;
      }
      break;
    default: 
      this.m = -1;
      return;
      int i1;
      if (this.l < 0) {
        for (i1 = 0; i1 < this.s; i1++) {
          if (this.h[i1] > 31)
          {
            this.l = i1;
            break;
          }
        }
      }
      if ((this.n < 0) && (this.l > -1)) {
        for (i1 = 0; i1 < this.s; i1++) {
          if ((i1 != this.l) && (this.h[i1] > 12))
          {
            this.n = i1;
            break;
          }
        }
      }
      if (this.s == 2) {
        switch (this.l)
        {
        case 0: 
          this.m = 1;
          if ((!l()) || (!m()))
          {
            this.m = -1;
            return;
          }
          o();
          p();
          break;
        case 1: 
          this.m = 0;
          if ((!l()) || (!m()))
          {
            this.m = -1;
            return;
          }
          p();
          o();
          break;
        default: 
          switch (this.m)
          {
          case 0: 
            if (!m())
            {
              this.m = -1;
              return;
            }
            if (this.n < 0)
            {
              this.n = 1;
              if ((h()) && (n()))
              {
                p();
                q();
                break;
              }
              this.n = -1;
              this.l = 1;
              if (!l())
              {
                this.m = -1;
                return;
              }
              p();
              o();
              break;
            }
            if (n())
            {
              p();
              q();
              break;
            }
            this.m = -1;
            return;
          case 1: 
            if (!m())
            {
              this.m = -1;
              return;
            }
            if (this.n < 0)
            {
              this.n = 0;
              if ((!h()) && (n()))
              {
                q();
                p();
                break;
              }
              this.n = -1;
              this.l = 0;
              if (!l())
              {
                this.m = -1;
                return;
              }
              o();
              p();
              break;
            }
            if (n())
            {
              q();
              p();
              break;
            }
            this.m = -1;
            return;
          default: 
            switch (this.n)
            {
            case 0: 
              this.m = 1;
              if ((!m()) || (!n()))
              {
                this.m = -1;
                return;
              }
              q();
              p();
              break;
            case 1: 
              this.m = 0;
              if ((!m()) || (!n()))
              {
                this.m = -1;
                return;
              }
              p();
              q();
              break;
            default: 
              this.m = (h() ? 0 : 1);
              this.n = (1 - this.m);
              if (!m())
              {
                this.n = this.m;
                this.m = (1 - this.n);
                if (!m())
                {
                  this.m = -1;
                  return;
                }
              }
              if (!n())
              {
                this.l = this.n;
                this.n = -1;
                if (!l())
                {
                  this.m = -1;
                  return;
                }
                if (this.m == 0)
                {
                  p();
                  o();
                }
                else
                {
                  o();
                  p();
                }
              }
              else if (this.m == 0)
              {
                p();
                q();
              }
              else
              {
                q();
                p();
              }
              break;
            }
            break;
          }
          break;
        }
      } else {
        switch (this.l)
        {
        case 0: 
          if (!l())
          {
            this.m = -1;
            return;
          }
          i1 = 1;
          this.m = 1;
          this.n = 2;
          if ((i1 != 0) && ((!m()) || (!n())))
          {
            this.m = -1;
            return;
          }
          o();
          if (this.m == 1)
          {
            p();
            q();
          }
          else
          {
            q();
            p();
          }
          break;
        case 1: 
          if (!l())
          {
            this.m = -1;
            return;
          }
          i1 = 1;
          if (this.m < 0)
          {
            if (this.n < 0)
            {
              this.m = (h() ? 0 : 2);
              this.n = (2 - this.m);
              if (!m())
              {
                this.n = this.m;
                this.m = (2 - this.n);
                if (!m())
                {
                  this.m = -1;
                  return;
                }
              }
              if (!n())
              {
                this.m = -1;
                return;
              }
              i1 = 0;
            }
            else
            {
              this.m = (2 - this.n);
            }
          }
          else if (this.n < 0) {
            this.n = (2 - this.m);
          }
          if ((i1 != 0) && ((!m()) || (!n())))
          {
            this.m = -1;
            return;
          }
          if (this.m == 0)
          {
            p();
            o();
            q();
          }
          else
          {
            q();
            o();
            p();
          }
          break;
        case 2: 
          if (!l())
          {
            this.m = -1;
            return;
          }
          i1 = 1;
          if (this.m < 0)
          {
            if (this.n < 0)
            {
              this.m = (h() ? 0 : 1);
              this.n = (1 - this.m);
              if (!m())
              {
                this.n = this.m;
                this.m = (1 - this.n);
                if (!m())
                {
                  this.m = -1;
                  return;
                }
              }
              if (!n())
              {
                this.m = -1;
                return;
              }
              i1 = 0;
            }
            else
            {
              this.m = (1 - this.n);
            }
          }
          else if (this.n < 0) {
            this.n = (1 - this.m);
          }
          if ((i1 != 0) && ((!m()) || (!n())))
          {
            this.m = -1;
            return;
          }
          if (this.m == 0)
          {
            p();
            q();
          }
          else
          {
            q();
            p();
          }
          o();
          break;
        default: 
          switch (this.m)
          {
          case 0: 
            if (!m())
            {
              this.m = -1;
              return;
            }
            i1 = 1;
            if (this.n < 0)
            {
              if (((this.h[2] < 10) && (this.j[2] - this.i[2] == 1)) || (this.e.f() == 6)) {
                this.n = 2;
              } else {
                this.n = 1;
              }
              this.l = (3 - this.n);
              if (!l())
              {
                this.m = -1;
                return;
              }
              if (n())
              {
                i1 = 0;
              }
              else
              {
                this.n = this.l;
                this.l = (3 - this.n);
              }
            }
            else
            {
              this.l = (3 - this.n);
            }
            if ((i1 != 0) && ((!l()) || (!n())))
            {
              this.m = -1;
              return;
            }
            p();
            if (this.n == 1)
            {
              q();
              o();
            }
            else
            {
              o();
              q();
            }
            break;
          case 1: 
            if (!m())
            {
              this.m = -1;
              return;
            }
            i1 = 1;
            if (this.n < 0)
            {
              if ((this.h[2] < 10) && (this.j[2] - this.i[2] == 1)) {
                this.n = 2;
              } else {
                this.n = ((i()) || (this.j[1] - this.i[1] > 2) ? 0 : 2);
              }
              this.l = (2 - this.n);
              if (!l())
              {
                this.m = -1;
                return;
              }
              if (n())
              {
                i1 = 0;
              }
              else
              {
                this.n = this.l;
                this.l = (2 - this.n);
              }
            }
            else
            {
              this.l = (2 - this.n);
            }
            if ((i1 != 0) && ((!l()) || (!n())))
            {
              this.m = -1;
              return;
            }
            if (this.n == 0)
            {
              q();
              p();
              o();
            }
            else
            {
              o();
              p();
              q();
            }
            break;
          case 2: 
            if (!m())
            {
              this.m = -1;
              return;
            }
            i1 = 1;
            if (this.n < 0)
            {
              this.n = (i() ? 0 : 1);
              this.l = (1 - this.n);
              if (!l())
              {
                this.m = -1;
                return;
              }
              if (n())
              {
                i1 = 0;
              }
              else
              {
                this.n = this.l;
                this.l = (1 - this.n);
              }
            }
            else
            {
              this.l = (1 - this.n);
            }
            if ((i1 != 0) && ((!l()) || (!n())))
            {
              this.m = -1;
              return;
            }
            if (this.n == 0)
            {
              q();
              o();
            }
            else
            {
              o();
              q();
            }
            p();
            break;
          default: 
            switch (this.n)
            {
            case 0: 
              if (((this.h[2] < 10) && (this.j[2] - this.i[2] == 1)) || (this.e.f() == 7)) {
                this.m = 2;
              } else {
                this.m = 1;
              }
              this.l = (3 - this.m);
              if (!l())
              {
                this.m = -1;
                return;
              }
              if (!m())
              {
                this.l = this.m;
                this.m = (3 - this.l);
                if ((!l()) || (!m()))
                {
                  this.m = -1;
                  return;
                }
              }
              q();
              if (this.m == 1)
              {
                p();
                o();
              }
              else
              {
                o();
                p();
              }
              break;
            case 1: 
              if (((this.h[2] < 10) && (this.j[2] - this.i[2] == 1)) || (this.e.f() == 5)) {
                this.m = 2;
              } else {
                this.m = 1;
              }
              this.l = (2 - this.m);
              if (!l())
              {
                this.m = -1;
                return;
              }
              if (!m())
              {
                this.l = this.m;
                this.m = (2 - this.l);
                if ((!l()) || (!m()))
                {
                  this.m = -1;
                  return;
                }
              }
              if (this.m == 0)
              {
                p();
                q();
                o();
              }
              else
              {
                o();
                q();
                p();
              }
              break;
            case 2: 
              if (((this.h[0] < 10) && (this.j[1] - this.i[0] == 1)) || (this.e.f() == 6)) {
                this.m = 0;
              } else {
                this.m = 1;
              }
              this.l = (1 - this.m);
              if (!l())
              {
                this.m = -1;
                return;
              }
              if (!m())
              {
                this.l = this.m;
                this.m = (1 - this.l);
                if ((!l()) || (!m()))
                {
                  this.m = -1;
                  return;
                }
              }
              if (this.m == 0)
              {
                p();
                o();
              }
              else
              {
                o();
                p();
              }
              q();
              break;
            default: 
              r();
              if (this.m < 0) {
                return;
              }
              break;
            }
            break;
          }
          break;
        }
      }
      break;
    }
    if (this.m < 0) {
      return;
    }
    this.m = this.h[this.m];
    if (this.n < 0) {
      this.n = 1;
    } else {
      this.n = this.h[this.n];
    }
    this.l = k();
  }
  
  private boolean h()
  {
    switch (this.e.f())
    {
    case 3: 
    case 5: 
    case 7: 
      return false;
    }
    return true;
  }
  
  private boolean i()
  {
    switch (this.e.f())
    {
    case 4: 
    case 5: 
    case 6: 
      return false;
    }
    return true;
  }
  
  private int j()
  {
    int i1 = this.h[this.m];
    if (i1 == 2) {
      return DateTime.a(k()) ? 29 : 28;
    }
    return i1 < 8 ? 30 + i1 % 2 : 31 - i1 % 2;
  }
  
  private int k()
  {
    int i1;
    if (this.l < 0)
    {
      i1 = DateTime.g().getYear();
    }
    else
    {
      i1 = this.h[this.l];
      if ((this.k[this.l] == null) && (this.j[this.l] - this.i[this.l] < 3)) {
        if (i1 < 30) {
          i1 += 2000;
        } else {
          i1 += 1900;
        }
      }
    }
    return i1;
  }
  
  private boolean l()
  {
    switch (this.j[this.l] - this.i[this.l])
    {
    case 2: 
      return this.h[this.l] > -1;
    case 4: 
      return this.h[this.l] > 1898;
    }
    return this.k[this.l] != null;
  }
  
  private boolean m()
  {
    return (this.h[this.m] > 0) && (this.h[this.m] < 13) && ((this.j[this.m] - this.i[this.m] < 3) || (this.w[this.i[this.m]] != '0') || (this.k[this.m] != null));
  }
  
  private boolean n()
  {
    int i1 = this.h[this.n];
    if ((i1 == 29) && (k() == 1900) && (this.h[this.m] == 2)) {
      return true;
    }
    return (this.h[this.n] > 0) && (this.h[this.n] <= j()) && ((this.j[this.n] - this.i[this.n] < 3) || (this.k[this.n] != null));
  }
  
  private void o()
  {
    this.a.a(1);
    if (this.k[this.l] != null)
    {
      this.b.append(this.k[this.l]);
      return;
    }
    if (this.j[this.l] - this.i[this.l] > 2) {
      this.b.append("yyyy");
    } else {
      this.b.append("yy");
    }
    a(this.l, true);
  }
  
  private void p()
  {
    this.a.a(2);
    if (this.k[this.m] != null)
    {
      this.b.append(this.k[this.m]);
      return;
    }
    switch (this.j[this.m] - this.i[this.m])
    {
    case 1: 
      this.b.append('m');
      break;
    case 2: 
      if ((this.h[this.m] < 10) || ((this.n > -1) && (this.h[this.n] < 10) && (this.j[this.n] - this.i[this.n] > 1))) {
        this.b.append("mm");
      } else {
        this.b.append('m');
      }
      break;
    case 3: 
      this.b.append("mmm");
      break;
    default: 
      this.b.append("mmmm");
    }
    a(this.m, true);
  }
  
  private void q()
  {
    this.a.a(4);
    if (this.k[this.n] != null)
    {
      this.b.append(this.k[this.n]);
      return;
    }
    switch (this.j[this.n] - this.i[this.n])
    {
    case 1: 
      this.b.append('d');
      break;
    default: 
      if ((this.h[this.n] < 10) || ((this.m > -1) && (this.h[this.m] < 10) && (this.j[this.m] - this.i[this.m] == 2))) {
        this.b.append("dd");
      } else {
        this.b.append('d');
      }
      break;
    }
    a(this.n, true);
  }
  
  private void r()
  {
    a(this.e.f());
    if (this.m > -1) {
      return;
    }
    switch (this.e.f())
    {
    case 2: 
      a(3);
      if (this.m > -1) {
        return;
      }
      a(4);
      if (this.m > -1) {
        return;
      }
      a(5);
      return;
    case 3: 
      a(2);
      if (this.m > -1) {
        return;
      }
      a(4);
      if (this.m > -1) {
        return;
      }
      a(5);
      return;
    case 4: 
      a(2);
      if (this.m > -1) {
        return;
      }
      a(3);
      if (this.m > -1) {
        return;
      }
      a(5);
      return;
    case 5: 
      a(3);
      if (this.m > -1) {
        return;
      }
      a(4);
      if (this.m > -1) {
        return;
      }
      a(2);
      return;
    case 7: 
      a(6);
      if (this.m > -1) {
        return;
      }
      a(3);
      if (this.m > -1) {
        return;
      }
      a(2);
      if (this.m > -1) {
        return;
      }
      a(4);
      if (this.m > -1) {
        return;
      }
      a(5);
      return;
    case 6: 
      a(7);
      if (this.m > -1) {
        return;
      }
      a(3);
      if (this.m > -1) {
        return;
      }
      a(2);
      if (this.m > -1) {
        return;
      }
      a(4);
      if (this.m > -1) {
        return;
      }
      a(5);
      return;
    }
  }
  
  private void a(int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
      this.m = 0;
      this.n = 1;
      this.l = 2;
      if ((!l()) || (!m()) || (!n()))
      {
        this.m = -1;
        return;
      }
      p();
      q();
      o();
      return;
    case 3: 
      this.n = 0;
      this.m = 1;
      this.l = 2;
      if ((!l()) || (!m()) || (!n()))
      {
        this.m = -1;
        return;
      }
      q();
      p();
      o();
      return;
    case 4: 
      this.l = 0;
      this.m = 1;
      this.n = 2;
      if ((!l()) || (!m()) || (!n()))
      {
        this.m = -1;
        return;
      }
      o();
      p();
      q();
      return;
    case 5: 
      this.l = 0;
      this.n = 1;
      this.m = 2;
      if ((!l()) || (!m()) || (!n()))
      {
        this.m = -1;
        return;
      }
      o();
      q();
      p();
      return;
    case 7: 
      this.n = 0;
      this.l = 1;
      this.m = 2;
      if ((!l()) || (!m()) || (!n()))
      {
        this.m = -1;
        return;
      }
      q();
      o();
      p();
      return;
    case 6: 
      this.m = 0;
      this.l = 1;
      this.n = 2;
      if ((!l()) || (!m()) || (!n()))
      {
        this.m = -1;
        return;
      }
      p();
      o();
      q();
      return;
    }
  }
  
  private boolean a(char paramChar)
  {
    switch (paramChar)
    {
    case ' ': 
    case ',': 
    case '-': 
    case '/': 
      return true;
    }
    return paramChar == this.e.e();
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    this.m = -1;
  }
  
  private void b(int paramInt1, int paramInt2)
  {
    this.p = -1;
  }
  
  public String getFormat()
  {
    return this.a.e();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zhz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */