package com.aspose.cells;

class zbxl
  extends zh
{
  private int b;
  private za c;
  private int d;
  
  zbxl(int paramInt, Row paramRow)
  {
    super(paramRow);
    this.b = paramInt;
    this.d = -1;
  }
  
  public int b()
  {
    return this.d;
  }
  
  public void c(int paramInt)
  {
    this.d = paramInt;
  }
  
  public void a()
  {
    this.c = null;
  }
  
  public Cell a(int paramInt)
  {
    if (this.c == null)
    {
      this.c = new za(null);
      this.c.b = new Cell(this.a, paramInt);
      return this.c.b;
    }
    int i = this.a.c.a(paramInt);
    if (this.c.b.getColumn() == i)
    {
      this.c.b.a = paramInt;
      this.c.b.c = this.a.c.a(paramInt, this.c.b.c, 7);
      return this.c.b;
    }
    Object localObject = this.c;
    za localza = this.c.a;
    for (int j = 2;; j++)
    {
      if (localza == null)
      {
        localza = new za(null);
        localza.b = new Cell(this.a, paramInt);
        localza.a = this.c;
        this.c = localza;
        return this.c.b;
      }
      if (localza.b.getColumn() == i)
      {
        ((za)localObject).a = localza.a;
        localza.a = this.c;
        this.c = localza;
        this.c.b.a = paramInt;
        this.c.b.c = this.a.c.a(paramInt, this.c.b.c, 7);
        return this.c.b;
      }
      if (j >= this.b)
      {
        ((za)localObject).a = null;
        localza.b = new Cell(this.a, paramInt);
        localza.a = this.c;
        this.c = localza;
        return this.c.b;
      }
      localObject = localza;
      localza = localza.a;
    }
  }
  
  public Cell b(int paramInt)
  {
    if (this.c == null) {
      return null;
    }
    if (this.c.b.getColumn() == paramInt) {
      return this.c.b;
    }
    Object localObject = this.c;
    for (za localza = this.c.a; localza != null; localza = localza.a)
    {
      if (localza.b.getColumn() == paramInt)
      {
        ((za)localObject).a = localza.a;
        localza.a = this.c;
        this.c = localza;
        return this.c.b;
      }
      localObject = localza;
    }
    return null;
  }
  
  public Cell a(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.c == null)
    {
      localObject = a(paramInt, -1, paramBoolean1, paramBoolean2);
      if (localObject == null) {
        return null;
      }
      this.c = new za(null);
      this.c.b = ((Cell)localObject);
      return this.c.b;
    }
    if (this.c.b.getColumn() == paramInt)
    {
      if (a(this.c.b, paramInt, paramBoolean1, paramBoolean2)) {
        return this.c.b;
      }
      this.c = this.c.a;
      return null;
    }
    Object localObject = this.c;
    za localza = this.c.a;
    for (int i = 2;; i++)
    {
      Cell localCell;
      if (localza == null)
      {
        localCell = a(paramInt, -1, paramBoolean1, paramBoolean2);
        if (localCell == null) {
          return null;
        }
        localza = new za(null);
        localza.a = this.c;
        localza.b = localCell;
        this.c = localza;
        return localCell;
      }
      if (localza.b.getColumn() == paramInt)
      {
        if (a(localza.b, paramInt, paramBoolean1, paramBoolean2))
        {
          ((za)localObject).a = localza.a;
          localza.a = this.c;
          this.c = localza;
          return this.c.b;
        }
        ((za)localObject).a = localza.a;
        return null;
      }
      if (i >= this.b)
      {
        localCell = a(paramInt, -1, paramBoolean1, paramBoolean2);
        if (localCell == null) {
          return null;
        }
        ((za)localObject).a = null;
        localza.b = localCell;
        localza.a = this.c;
        this.c = localza;
        return localCell;
      }
      localObject = localza;
      localza = localza.a;
    }
  }
  
  private class za
  {
    za a;
    Cell b;
    
    private za() {}
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbxl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */