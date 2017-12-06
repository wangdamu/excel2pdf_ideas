package com.aspose.cells;

class zbqy
  extends zy
{
  private String e;
  private String f;
  
  public zbqy(zig paramzig, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    super(paramzig, paramString1, paramString2);
    this.e = paramString3;
    this.f = paramString4;
  }
  
  protected void a(zzu paramzzu, DateTime paramDateTime, double paramDouble, StringBuilder paramStringBuilder)
  {
    if (paramDateTime.getHour() < 12) {
      paramStringBuilder.append(this.e);
    } else {
      paramStringBuilder.append(this.f);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbqy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */