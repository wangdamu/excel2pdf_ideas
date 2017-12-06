package com.aspose.cells;

class zrl
{
  String a;
  String b;
  String c;
  String d;
  String e;
  int f;
  zcf g;
  byte[] h;
  boolean i;
  
  zrl()
  {
    this.b = null;
    this.c = null;
    this.d = null;
    this.e = null;
    this.f = -1;
  }
  
  int a(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.g != null)) {
      this.g.i();
    }
    return this.f;
  }
  
  zrl(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.b = paramString1;
    this.c = paramString2;
    if ((paramString4 != null) && (paramString4.equals("External")) && (paramString3 != null) && (paramString3.length() > 3) && (paramString3.charAt(1) == ':') && ((paramString3.charAt(2) == '/') || (paramString3.charAt(2) == '\\')) && (((paramString3.charAt(0) >= 'a') && (paramString3.charAt(0) <= 'z')) || ((paramString3.charAt(0) >= 'A') && (paramString3.charAt(0) <= 'Z')))) {
      paramString3 = "file:///" + paramString3;
    }
    this.d = paramString3;
    this.e = paramString4;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zrl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */