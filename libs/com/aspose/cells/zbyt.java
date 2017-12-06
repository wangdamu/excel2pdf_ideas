package com.aspose.cells;

import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;

public class zbyt
  extends zcjy
{
  private static final za q = new za(new String[] { "br" });
  
  public zbyt(zm paramzm)
    throws Exception
  {
    super(paramzm);
  }
  
  public zbyt(String paramString, boolean paramBoolean)
    throws Exception
  {
    super(paramString, paramBoolean);
  }
  
  public boolean a()
    throws Exception
  {
    if ((this.l[0].a == 1) && (!this.l[0].f))
    {
      int i = 1;
      char[] arrayOfChar = this.l[0].a().toCharArray();
      while (i != 0)
      {
        this.i += 1;
        switch (this.h[this.i])
        {
        case '\000': 
          z();
          this.i -= 1;
          break;
        case '<': 
          this.i += 1;
          if (this.i >= this.j) {
            z();
          }
          int j;
          int k;
          switch (this.h[this.i])
          {
          case '!': 
            f();
            break;
          case '?': 
            e();
            break;
          case '/': 
            j = 1;
            k = 0;
            int m = 1;
            while (j != 0)
            {
              this.i += 1;
              switch (this.h[this.i])
              {
              case '\000': 
                z();
                this.i -= 1;
                break;
              case '>': 
                j = 0;
                break;
              case '\t': 
              case '\n': 
              case '\r': 
              case ' ': 
                if (k < arrayOfChar.length) {
                  m = 0;
                }
                break;
              default: 
                if ((m != 0) && ((k >= arrayOfChar.length) || (arrayOfChar[(k++)] != this.h[this.i]))) {
                  m = 0;
                }
                break;
              }
            }
            if (m != 0) {
              i = 0;
            }
            break;
          default: 
            j = 1;
            while (j != 0)
            {
              this.i += 1;
              switch (this.h[this.i])
              {
              case '\000': 
                z();
                this.i -= 1;
                break;
              case '"': 
              case '\'': 
                k = this.h[this.i];
                do
                {
                  this.i += 1;
                  if (this.i >= this.j) {
                    z();
                  }
                } while (this.h[this.i] != k);
                break;
              case '/': 
                break;
              case '>': 
                j = 0;
              }
            }
          }
          break;
        }
      }
    }
    return d();
  }
  
  public String b()
    throws Exception
  {
    switch (this.m.a)
    {
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
      d();
      return "";
    }
    if (this.l[0].f)
    {
      d();
      return "";
    }
    this.m = this.l[0];
    this.m.a = 4;
    this.k = (this.i + 1);
    int i = 1;
    char[] arrayOfChar = this.l[0].a().toCharArray();
    int j = 0;
    while (i != 0)
    {
      this.i += 1;
      switch (this.h[this.i])
      {
      case '\000': 
        x();
        this.i -= 1;
        break;
      case '<': 
        this.i += 1;
        if (this.i >= this.j) {
          x();
        }
        int k;
        int m;
        switch (this.h[this.i])
        {
        case '!': 
          if (this.i == 0) {
            this.d.delete(this.d.length() - 1, this.d.length() - 1 + 1);
          } else {
            this.d.append(this.h, this.k, this.i - this.k - 1);
          }
          f();
          this.k = (this.i + 1);
          break;
        case '?': 
          if (this.i == 0) {
            this.d.delete(this.d.length() - 1, this.d.length() - 1 + 1);
          } else {
            this.d.append(this.h, this.k, this.i - this.k - 1);
          }
          e();
          this.k = (this.i + 1);
          break;
        case '/': 
          j = 2;
          k = 1;
          m = 0;
          int n = 1;
          while (k != 0)
          {
            j++;
            this.i += 1;
            switch (this.h[this.i])
            {
            case '\000': 
              x();
              this.i -= 1;
              break;
            case '>': 
              k = 0;
              break;
            case '\t': 
            case '\n': 
            case '\r': 
            case ' ': 
              if (m < arrayOfChar.length) {
                n = 0;
              }
              break;
            default: 
              if ((n != 0) && ((m >= arrayOfChar.length) || (arrayOfChar[(m++)] != this.h[this.i]))) {
                n = 0;
              }
              break;
            }
          }
          if (n != 0) {
            i = 0;
          }
          break;
        default: 
          k = 1;
          while (k != 0)
          {
            this.i += 1;
            switch (this.h[this.i])
            {
            case '\000': 
              x();
              this.i -= 1;
              break;
            case '"': 
            case '\'': 
              m = this.h[this.i];
              do
              {
                this.i += 1;
                if (this.i >= this.j) {
                  x();
                }
              } while (this.h[this.i] != m);
              break;
            case '/': 
              break;
            case '>': 
              k = 0;
            }
          }
        }
        break;
      }
    }
    d();
    if (this.d.length() != 0)
    {
      this.d.append(this.h, this.k, this.i - this.k);
      return this.d.substring(0, 0 + (this.d.length() - j));
    }
    return new String(this.h, this.k, this.i - this.k - j);
  }
  
  public zcjs a(zcjv paramzcjv, boolean paramBoolean)
    throws Exception
  {
    if (this.b == null) {
      this.b = new boolean['Ā'];
    }
    k();
    this.c.c = (this.c.d = null);
    boolean bool1 = this.p;
    boolean bool2 = this.g;
    int i = 0;
    Object localObject1 = this.c;
    Object localObject2 = null;
    for (;;)
    {
      Object localObject4;
      Object localObject5;
      switch (this.m.a)
      {
      case 0: 
      case 5: 
      case 6: 
      case 7: 
      case 8: 
        break;
      case 1: 
        Object localObject3 = null;
        if (localObject2 != null) {
          switch (q.a(this.l[0].c))
          {
          case 0: 
            localObject3 = new zcjx((zcjs)localObject1);
            ((zcjs)localObject3).h = "\r\n";
          }
        }
        if (localObject3 == null)
        {
          localObject4 = new zcjn((zcjs)localObject1);
          ((zcjn)localObject4).a(this.l[0]);
          localObject3 = localObject4;
          if (this.o > 0)
          {
            ((zcjn)localObject4).a = new zcjh((zcjs)localObject4, this.o);
            for (int k = 1; k <= this.o; k++)
            {
              zcjg localzcjg = new zcjg((zcjs)localObject4);
              localzcjg.a(this.l[k]);
              ((zcjn)localObject4).a.a(localzcjg);
            }
          }
        }
        if (((zcjs)localObject1).d != null)
        {
          localObject4 = ((zcjs)localObject1).d.c;
          ((zcjs)localObject3).c = ((zcjs)localObject4);
          ((zcjs)localObject1).d.c = ((zcjs)localObject3);
          ((zcjs)localObject1).d = ((zcjs)localObject3);
        }
        else
        {
          ((zcjs)localObject3).c = ((zcjs)localObject3);
          ((zcjs)localObject1).d = ((zcjs)localObject3);
        }
        if ((((zcjs)localObject3).e == 1) && (!o()))
        {
          localObject1 = localObject3;
          localObject4 = (zcjn)localObject3;
          localObject5 = paramzcjv.a((zcjs)localObject4);
          if (((zcjw)localObject5).b)
          {
            localObject2 = localObject3;
            this.p = true;
          }
          if (localObject2 != null) {
            this.g = true;
          } else {
            this.g = ((zcjw)localObject5).a;
          }
          this.b[(i++)] = this.g;
        }
        break;
      case 4: 
        int j = 1;
        if (localObject2 != null) {
          switch (q.a(this.l[0].c))
          {
          case 0: 
            j = 0;
            break;
          default: 
            if ((zw.b(this.l[0].c, ((zcjs)localObject2).g)) && (zw.b(this.l[0].b, ((zcjs)localObject2).f)))
            {
              localObject2 = null;
              this.p = bool1;
            }
            break;
          }
        }
        if (j != 0)
        {
          localObject1 = ((zcjs)localObject1).b;
          i--;
          this.g = this.b[i];
        }
        break;
      case 3: 
        localObject4 = new zcjx((zcjs)localObject1);
        ((zcjs)localObject4).h = this.l[0].d;
        if (((zcjs)localObject1).d != null)
        {
          localObject5 = ((zcjs)localObject1).d.c;
          ((zcjs)localObject4).c = ((zcjs)localObject5);
          ((zcjs)localObject1).d.c = ((zcjs)localObject4);
          ((zcjs)localObject1).d = ((zcjs)localObject4);
        }
        else
        {
          ((zcjs)localObject4).c = ((zcjs)localObject4);
          ((zcjs)localObject1).d = ((zcjs)localObject4);
        }
        break;
      }
      if (i == 0) {
        break;
      }
      d();
    }
    this.g = bool2;
    this.p = bool1;
    d();
    if (paramBoolean) {
      return this.c;
    }
    return this.c.d;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbyt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */