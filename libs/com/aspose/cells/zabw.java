package com.aspose.cells;

class zabw
{
  Worksheet a;
  zaai[] b;
  int c = 0;
  int d = 0;
  zami e;
  zaas f;
  
  zabw(Worksheet paramWorksheet)
  {
    this.a = paramWorksheet;
    this.b = new zaai[16];
    this.e = new zami();
  }
  
  zaai a(int paramInt)
  {
    return this.b[paramInt];
  }
  
  void a()
  {
    if (this.f == null) {
      this.f = new zaas(this);
    }
  }
  
  void a(byte paramByte)
  {
    int i;
    if (this.c != this.d) {
      for (i = this.d - 1; i > -1; i--) {
        if (this.b[i] != null) {
          this.b[i].a(paramByte);
        }
      }
    } else {
      for (i = this.d - 1; i > -1; i--) {
        this.b[i].a(paramByte);
      }
    }
  }
  
  void a(zaca paramzaca)
  {
    for (int i = this.d - 1; i > -1; i--)
    {
      zaai localzaai = this.b[i];
      if ((localzaai != null) && (localzaai.c() != 0))
      {
        if (!localzaai.h()) {
          localzaai.a(paramzaca);
        }
        if (localzaai.e())
        {
          localzaai.a((byte)0);
          this.f.b(localzaai.e, localzaai.f);
        }
      }
    }
  }
  
  void a(int paramInt, zaai paramzaai)
  {
    if (this.b[paramInt] != paramzaai)
    {
      if (this.f != null) {
        this.f.a(this.b[paramInt]);
      }
      paramzaai.a = paramInt;
      this.b[paramInt] = paramzaai;
    }
  }
  
  void b()
  {
    this.b = new zaai[16];
    this.e = new zami();
    this.f = null;
    this.c = 0;
    this.d = 0;
    this.a.d().b();
  }
  
  int a(zaai paramzaai)
  {
    if (this.e.a() == 0)
    {
      c(1);
      paramzaai.a = this.c;
      this.b[this.c] = paramzaai;
      this.c += 1;
      this.d = this.c;
    }
    else
    {
      int i = this.e.b();
      this.b[i] = paramzaai;
      paramzaai.a = i;
      this.c += 1;
      if (i >= this.d) {
        this.d = (i + 1);
      }
    }
    return paramzaai.a;
  }
  
  void b(int paramInt)
  {
    if (this.f != null) {
      this.f.a(this.b[paramInt]);
    }
    this.b[paramInt] = null;
    this.c -= 1;
    if (this.d == paramInt + 1)
    {
      this.d -= 1;
      paramInt--;
      if ((paramInt > -1) && (this.b[paramInt] == null)) {
        do
        {
          for (int i = this.e.a() - 1; i > -1; i--) {
            if (this.e.b(i) == paramInt)
            {
              this.e.a(i, 1);
              break;
            }
          }
          this.d -= 1;
          paramInt--;
          if (paramInt < 0) {
            break;
          }
        } while (this.b[paramInt] == null);
      }
    }
    else
    {
      this.e.a(paramInt);
    }
  }
  
  void c(int paramInt)
  {
    int i = this.c + paramInt;
    if (i > this.b.length)
    {
      int j = this.b.length << 1;
      if (j < i) {
        j = i;
      }
      zaai[] arrayOfzaai = new zaai[j];
      System.arraycopy(this.b, 0, arrayOfzaai, 0, this.b.length);
      this.b = arrayOfzaai;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zabw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */