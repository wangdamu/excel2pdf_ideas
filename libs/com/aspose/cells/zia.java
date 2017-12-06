package com.aspose.cells;

class zia
  extends zo
{
  private zsl a;
  private zsl[] b;
  private double[] c;
  private double d;
  private double e;
  private int f;
  private double g = 1.0D;
  private boolean h = false;
  
  public zia(Workbook paramWorkbook, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.h = paramBoolean2;
    Font localFont1 = paramWorkbook.getDefaultStyle().getFont();
    this.a = new zsl(localFont1.getName(), localFont1.getSize(), localFont1.p(), true, null);
    double d1 = a(this.a);
    zajm localzajm = paramWorkbook.getWorksheets().C();
    this.b = new zsl[localzajm.b()];
    this.c = new double[this.b.length];
    if (paramWorkbook.getDefaultStyle().getShrinkToFit()) {
      this.b[0] = null;
    } else {
      this.b[0] = this.a;
    }
    if (paramBoolean1)
    {
      this.c[0] = d1;
      this.d = 1.0D;
      this.e = (12.0D * d1);
    }
    else
    {
      this.c[0] = 1.0D;
      this.d = d1;
      this.e = 12.0D;
    }
    for (int i = 1; i < this.c.length; i++)
    {
      Style localStyle = localzajm.a(i);
      if (localStyle.getShrinkToFit())
      {
        this.b[i] = null;
      }
      else
      {
        Font localFont2 = localStyle.q();
        if ((localFont2 == null) || (this.a.a(localFont2.getName(), localFont2.getSize(), localFont2.p())))
        {
          this.b[i] = this.a;
          if (paramBoolean1) {
            this.c[i] = d1;
          } else {
            this.c[i] = 1.0D;
          }
        }
        else
        {
          this.b[i] = new zsl(localFont2.getName(), localFont2.getSize(), localFont2.p(), false, this.a);
          if (paramBoolean1) {
            this.c[i] = a(this.b[i]);
          } else {
            this.c[i] = (a(this.b[i]) / d1);
          }
        }
      }
    }
  }
  
  public void a(double paramDouble)
  {
    this.g = paramDouble;
  }
  
  public int a(String paramString, char paramChar)
  {
    zsl localzsl = this.b[this.f];
    if (localzsl == null) {
      return 1;
    }
    return (int)((this.e * this.d - ((paramString == null) || (paramString.equals("")) ? 0.0D : localzsl.a(paramString, this.h, this.g))) / localzsl.a(paramChar, this.h, this.g));
  }
  
  public int a(String paramString1, String paramString2)
  {
    zsl localzsl = this.b[this.f];
    if (localzsl == null) {
      return 1;
    }
    return (int)((this.e * this.d - ((paramString1 == null) || (paramString1.equals("")) ? 0.0D : localzsl.a(paramString1, this.h, this.g))) / localzsl.a(paramString2, this.h, this.g));
  }
  
  public void a(int paramInt)
  {
    if ((paramInt > -1) && (paramInt < this.b.length)) {
      this.f = paramInt;
    } else {
      this.f = 0;
    }
  }
  
  public void b(double paramDouble)
  {
    this.e = paramDouble;
  }
  
  protected int a(String paramString)
  {
    zsl localzsl = this.b[this.f];
    if (localzsl == null) {
      return 11;
    }
    double d1;
    if (this.h) {
      d1 = localzsl.a(this.h, this.g) / this.d;
    } else {
      d1 = this.c[this.f];
    }
    return (int)((this.e - ((paramString == null) || (paramString.equals("")) ? 0.0D : localzsl.a(paramString, this.h, this.g) / this.d)) / d1);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zia.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */