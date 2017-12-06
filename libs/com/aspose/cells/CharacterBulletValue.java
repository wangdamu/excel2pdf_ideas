package com.aspose.cells;

public class CharacterBulletValue
  extends BulletValue
{
  char a;
  
  public int getType()
  {
    return 1;
  }
  
  public char getCharacter()
  {
    return this.a;
  }
  
  public void setCharacter(char value)
  {
    this.a = value;
  }
  
  void a(BulletValue paramBulletValue)
  {
    this.a = ((CharacterBulletValue)paramBulletValue).a;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/CharacterBulletValue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */