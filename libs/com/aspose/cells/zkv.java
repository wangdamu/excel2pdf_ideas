package com.aspose.cells;

import com.aspose.cells.a.c.zc;
import java.util.Iterator;

class zkv
{
  private Object[] a;
  private int b;
  private int c;
  
  void a()
  {
    zc.a(this.a, 0, this.a.length, null);
  }
  
  public zkv(int paramInt)
  {
    this.a = new Object[paramInt];
    d();
  }
  
  public Object a(int paramInt)
  {
    return this.a[((this.b + paramInt) % this.a.length)];
  }
  
  public void a(int paramInt, Object paramObject)
  {
    this.a[((this.b + paramInt) % this.a.length)] = paramObject;
  }
  
  public int b()
  {
    return this.c > this.b ? this.c - this.b : this.a.length - (this.b - this.c);
  }
  
  public Object c()
  {
    return this.b < this.a.length ? this.a[(this.a.length - 1)] : this.c > 0 ? this.a[(this.c - 1)] : null;
  }
  
  public void d()
  {
    this.b = this.a.length;
    this.c = 0;
  }
  
  public void a(Object paramObject)
  {
    this.a[this.c] = paramObject;
    if (this.c == this.b)
    {
      this.b += 1;
      if (this.b == this.a.length)
      {
        this.b = 0;
        this.c = 0;
      }
      else
      {
        this.c = this.b;
      }
    }
    else
    {
      if (this.b == this.a.length) {
        this.b = 0;
      }
      this.c += 1;
      if (this.c == this.a.length) {
        this.c = 0;
      }
    }
  }
  
  public void b(Object paramObject)
  {
    if (paramObject == c()) {
      return;
    }
    int i;
    if (this.b == this.c)
    {
      for (i = 0; i < this.a.length; i++) {
        if (this.a[i] == paramObject)
        {
          if (i == this.b)
          {
            this.b += 1;
            if (this.b == this.a.length) {
              this.b = 0;
            }
            this.c = this.b;
          }
          else if (i > this.b)
          {
            System.arraycopy(this.a, this.b, this.a, this.b + 1, i - this.b);
            this.a[this.b] = paramObject;
            this.b += 1;
            this.c = this.b;
          }
          else if (i < this.b - 1)
          {
            System.arraycopy(this.a, i + 1, this.a, i, this.b - 1 - i);
            this.a[(this.b - 1)] = paramObject;
          }
          return;
        }
      }
    }
    else if (this.b < this.c)
    {
      for (i = this.b; i < this.c; i++) {
        if (this.a[i] == paramObject)
        {
          System.arraycopy(this.a, i + 1, this.a, i, this.c - 1 - i);
          this.a[(this.c - 1)] = paramObject;
          return;
        }
      }
    }
    else
    {
      for (i = 0; i < this.c; i++) {
        if (this.a[i] == paramObject)
        {
          System.arraycopy(this.a, i + 1, this.a, i, this.c - 1 - i);
          this.a[(this.c - 1)] = paramObject;
          return;
        }
      }
      if (this.a[this.b] == paramObject)
      {
        this.a[this.c] = paramObject;
        this.c += 1;
        this.b += 1;
        if (this.b == this.a.length) {
          this.b = 0;
        }
        return;
      }
      for (i = this.b + 1; i < this.a.length; i++) {
        if (this.a[i] == paramObject)
        {
          this.a[this.c] = paramObject;
          this.c += 1;
          System.arraycopy(this.a, this.b, this.a, this.b + 1, i - this.b);
          this.b += 1;
          return;
        }
      }
    }
  }
  
  public void e()
  {
    int i;
    int j;
    if (this.c > this.b)
    {
      i = this.b;
      for (j = this.b; j < this.c; j++) {
        if (this.a[j] != null)
        {
          if (i < j) {
            this.a[i] = this.a[j];
          }
          i++;
        }
      }
      if (i == this.b) {
        d();
      } else {
        this.c = i;
      }
    }
    else
    {
      i = this.a.length - 1;
      for (j = i; j >= this.b; j--) {
        if (this.a[j] != null)
        {
          if (i > j) {
            this.a[i] = this.a[j];
          }
          i--;
        }
      }
      this.b = (i + 1);
      i = 0;
      for (j = 0; j < this.c; j++) {
        if (this.a[j] != null)
        {
          if (i < j) {
            this.a[i] = this.a[j];
          }
          i++;
        }
      }
      this.c = i;
      if (this.b != this.c)
      {
        if (this.b == this.a.length) {
          this.b = 0;
        }
        if (this.b == this.c) {
          d();
        }
      }
    }
  }
  
  public Iterator f()
  {
    return new za(this);
  }
  
  private class za
    implements Iterator
  {
    private zkv b;
    private int c;
    private boolean d;
    
    za(zkv paramzkv)
    {
      this.b = paramzkv;
      a();
    }
    
    public boolean hasNext()
    {
      this.c -= 1;
      if (this.d) {
        return this.c >= zkv.a(this.b);
      }
      if (this.c < 0) {
        return zkv.b(this.b).length + this.c >= zkv.a(this.b);
      }
      return true;
    }
    
    public Object next()
    {
      return this.c < 0 ? zkv.b(this.b)[(zkv.b(this.b).length + this.c)] : zkv.b(this.b)[this.c];
    }
    
    public void a()
    {
      this.c = zkv.c(this.b);
      this.d = ((zkv.a(this.b) == zkv.b(this.b).length) || (zkv.c(this.b) > zkv.a(this.b)));
    }
    
    public void remove()
    {
      throw new UnsupportedOperationException();
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zkv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */