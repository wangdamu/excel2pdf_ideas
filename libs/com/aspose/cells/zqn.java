package com.aspose.cells;

class zqn
  extends zqe
{
  String g = null;
  String h = null;
  String i = null;
  boolean j = true;
  byte[] k = null;
  ActiveXControl l = null;
  
  zqn(boolean paramBoolean)
  {
    super(paramBoolean);
  }
  
  boolean a()
  {
    return "http://schemas.openxmlformats.org/officeDocument/2006/relationships/ctrlProp".equals(this.g);
  }
  
  byte[] a(Shape paramShape, Workbook paramWorkbook)
    throws Exception
  {
    if (a()) {
      return null;
    }
    if (this.l == null) {
      zah.a(this, paramShape, paramWorkbook);
    }
    if (this.l != null) {
      return this.l.getData();
    }
    return null;
  }
  
  ActiveXControl b(Shape paramShape, Workbook paramWorkbook)
    throws Exception
  {
    zah localzah = new zah();
    localzah.b(this, paramShape, paramWorkbook);
    return this.l;
  }
  
  void a(Shape paramShape, zqn paramzqn, CopyOptions paramCopyOptions)
  {
    this.g = paramzqn.g;
    this.b = paramzqn.b;
    if (paramShape != null) {
      this.a = (paramzqn.a + "_" + paramShape.v());
    } else {
      this.a = paramzqn.a;
    }
    this.c = paramzqn.c;
    this.l = paramzqn.l;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zqn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */