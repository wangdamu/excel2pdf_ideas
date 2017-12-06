package com.aspose.cells;

public class PictureBulletValue
  extends BulletValue
{
  byte[] a;
  
  public int getType()
  {
    return 2;
  }
  
  public byte[] getImageData()
  {
    return this.a;
  }
  
  public void setImageData(byte[] value)
  {
    this.a = value;
  }
  
  void a(BulletValue paramBulletValue)
  {
    this.a = ((PictureBulletValue)paramBulletValue).a;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/PictureBulletValue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */