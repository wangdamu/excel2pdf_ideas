package com.aspose.cells;

class zbxn
  extends zu
{
  private int c;
  private int d;
  private za e;
  
  zbxn(int paramInt, Cells paramCells, RowCollection paramRowCollection)
  {
    super(paramCells, paramRowCollection);
    this.c = paramInt;
    this.d = -1;
  }
  
  void a(zajl paramzajl)
  {
    if (this.e == null) {
      return;
    }
    za localza = this.e;
    for (;;)
    {
      localza.b.c.a(paramzajl);
      localza = localza.a;
      if (localza == null) {
        break;
      }
    }
  }
  
  public int b()
  {
    return this.d;
  }
  
  public void b(int paramInt)
  {
    this.d = paramInt;
  }
  
  public void a()
  {
    while (this.e != null)
    {
      this.e.b.d.a();
      this.e = this.e.a;
    }
  }
  
  public Row a(int paramInt)
  {
    if (this.e == null) {
      return null;
    }
    if (this.e.b.getIndex() == paramInt) {
      return this.e.b;
    }
    Object localObject = this.e;
    for (za localza = this.e.a; localza != null; localza = localza.a)
    {
      if (localza.b.getIndex() == paramInt)
      {
        ((za)localObject).a = localza.a;
        localza.a = this.e;
        this.e = localza;
        return this.e.b;
      }
      localObject = localza;
    }
    return null;
  }
  
  public Row a(int paramInt, boolean paramBoolean)
  {
    this.d = paramInt;
    if (this.e == null)
    {
      this.e = new za(null);
      this.e.b = new Row(this.a, this.b, this.b.c.f(paramInt), paramBoolean);
      return this.e.b;
    }
    int i = this.b.c.a(paramInt);
    if (this.e.b.getIndex() == i)
    {
      this.e.b.c.f(paramInt);
      return this.e.b;
    }
    Object localObject = this.e;
    za localza = this.e.a;
    for (int j = 2;; j++)
    {
      if (localza == null)
      {
        localza = new za(null);
        localza.b = new Row(this.a, this.b, this.b.c.f(paramInt), true);
        localza.a = this.e;
        this.e = localza;
        return this.e.b;
      }
      if (localza.b.getIndex() == i)
      {
        localza.b.c.f(paramInt);
        ((za)localObject).a = localza.a;
        localza.a = this.e;
        this.e = localza;
        return this.e.b;
      }
      if (j >= this.c)
      {
        ((za)localObject).a = null;
        localza.b = new Row(this.a, this.b, this.b.c.f(paramInt), true);
        localza.a = this.e;
        this.e = localza;
        return this.e.b;
      }
      localObject = localza;
      localza = localza.a;
    }
  }
  
  public Row a(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (this.e == null)
    {
      localObject = b(paramInt, paramBoolean1, paramBoolean2, paramBoolean3);
      if (localObject == null) {
        return null;
      }
      this.e = new za(null);
      this.e.b = ((Row)localObject);
      return (Row)localObject;
    }
    if (this.e.b.c.i() == paramInt)
    {
      if (a(this.e.b, paramBoolean1, paramBoolean2)) {
        return this.e.b;
      }
      this.e = this.e.a;
      return null;
    }
    Object localObject = this.e;
    za localza = this.e.a;
    for (int i = 2;; i++)
    {
      Row localRow;
      if (localza == null)
      {
        localRow = b(paramInt, paramBoolean1, paramBoolean2, paramBoolean3);
        if (localRow == null) {
          return null;
        }
        localza = new za(null);
        localza.a = this.e;
        localza.b = localRow;
        this.e = localza;
        return localRow;
      }
      if (localza.b.c.i() == paramInt)
      {
        if (a(localza.b, paramBoolean1, paramBoolean2))
        {
          ((za)localObject).a = localza.a;
          localza.a = this.e;
          this.e = localza;
          return this.e.b;
        }
        ((za)localObject).a = localza.a;
        return null;
      }
      if (i >= this.c)
      {
        localRow = b(paramInt, paramBoolean1, paramBoolean2, paramBoolean3);
        if (localRow == null) {
          return null;
        }
        ((za)localObject).a = null;
        localza.b = localRow;
        localza.a = this.e;
        this.e = localza;
        return localRow;
      }
      localObject = localza;
      localza = localza.a;
    }
  }
  
  private class za
  {
    za a;
    Row b;
    
    private za() {}
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbxn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */