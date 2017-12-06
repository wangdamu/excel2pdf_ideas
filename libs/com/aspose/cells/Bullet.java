package com.aspose.cells;

public class Bullet
{
  private TextParagraph h;
  BulletValue a;
  zez b;
  zaml c;
  boolean d;
  boolean e;
  int f = 3;
  int g = 97000;
  
  Bullet(TextParagraph parent)
  {
    setType(0);
    this.h = parent;
  }
  
  public BulletValue getBulletValue()
  {
    return this.a;
  }
  
  public int getType()
  {
    if (this.a == null) {
      return 0;
    }
    return this.a.getType();
  }
  
  public void setType(int value)
  {
    if (getType() == value) {
      return;
    }
    switch (value)
    {
    case 0: 
      this.a = new NoneBulletValue();
      break;
    case 1: 
      this.a = new CharacterBulletValue();
      break;
    case 3: 
      this.a = new AutoNumberedBulletValue();
      break;
    case 2: 
      this.a = new PictureBulletValue();
      break;
    }
  }
  
  zez a()
  {
    if (this.b == null) {
      this.b = new zez();
    }
    return this.b;
  }
  
  String b()
  {
    if (this.b != null) {
      return this.b.a;
    }
    return null;
  }
  
  zaml c()
  {
    if (this.c == null) {
      this.c = new zaml(true);
    }
    return this.c;
  }
  
  void a(zaml paramzaml)
  {
    this.c = paramzaml;
  }
  
  String d()
  {
    if (getType() == 1) {
      return Character.toString(((CharacterBulletValue)this.a).a);
    }
    return null;
  }
  
  boolean e()
  {
    return (getType() == 1) || (getType() == 3);
  }
  
  void a(Bullet paramBullet, CopyOptions paramCopyOptions)
  {
    if (paramBullet.b != null)
    {
      this.b = new zez();
      this.b.a(paramBullet.b);
    }
    if (paramBullet.a != null)
    {
      setType(paramBullet.getType());
      this.a.a(paramBullet.a);
    }
    if (paramBullet.c != null) {
      c().f(paramBullet.c());
    }
    this.d = paramBullet.d;
    this.e = paramBullet.e;
    this.g = paramBullet.g;
    this.f = paramBullet.f;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Bullet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */