package com.aspose.cells;

import java.util.ArrayList;

public class Comment
{
  private CommentShape a;
  private CommentCollection b;
  private boolean c;
  private String d;
  private int e;
  private short f;
  
  public String getAuthor()
  {
    return this.d;
  }
  
  public void setAuthor(String value)
  {
    this.d = value;
  }
  
  Comment(CommentCollection comments)
  {
    this.b = comments;
    Worksheet localWorksheet = this.b.a();
    this.a = new CommentShape(localWorksheet.getShapes(), this);
    this.c = false;
    this.d = this.b.a().c().ac();
  }
  
  Comment(CommentCollection comments, int row, int column)
  {
    this.c = true;
    this.e = row;
    this.f = ((short)column);
    this.b = comments;
    Worksheet localWorksheet = this.b.a();
    this.a = new CommentShape(localWorksheet.getShapes(), this);
    this.d = this.b.a().c().ac();
  }
  
  Comment() {}
  
  boolean a()
  {
    return this.c;
  }
  
  void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  FontSettingCollection b()
  {
    return getCommentShape().getTextBody();
  }
  
  void c()
  {
    int i = this.f + 1;
    int j = 1;
    if (this.e == 0)
    {
      j = 1;
    }
    else
    {
      k = this.e - 1;
      if (this.e > 1048570) {
        k = this.e - 5;
      }
      j = this.a.c(0, 0, k, 0) + (int)(this.a.b(k, 105) + 0.5D);
    }
    if (this.f > 16380) {
      i = this.f - 3;
    } else {
      i = this.f + 1;
    }
    int k = this.a.d(0, 0, i, 0) + (int)(this.a.b(i, 240) + 0.5D);
    this.a.a(0, false, k, j, 128, 74);
  }
  
  public CommentShape getCommentShape()
  {
    return this.a;
  }
  
  public int getRow()
  {
    return this.e;
  }
  
  void a(int paramInt)
  {
    this.e = paramInt;
  }
  
  public int getColumn()
  {
    return this.f;
  }
  
  void b(int paramInt)
  {
    this.f = ((short)paramInt);
  }
  
  public String getNote()
  {
    return b().getText();
  }
  
  public void setNote(String value)
  {
    b().setText(value);
  }
  
  public String getHtmlNote()
    throws Exception
  {
    return b().getHtmlString();
  }
  
  public void setHtmlNote(String value)
  {
    b().setHtmlString(value);
  }
  
  public Font getFont()
  {
    return b().c();
  }
  
  public void formatCharacters(int startIndex, int length, Font font, StyleFlag flag)
  {
    b().format(startIndex, length, font, flag);
  }
  
  public FontSetting characters(int startIndex, int length)
  {
    return b().a(startIndex, length);
  }
  
  public ArrayList getCharacters()
  {
    return b().a(false, false);
  }
  
  public boolean isVisible()
  {
    return !this.a.isHidden();
  }
  
  public void setVisible(boolean value)
  {
    this.a.setHidden(!value);
  }
  
  public int getTextOrientationType()
    throws Exception
  {
    return b().getTextAlignment().o();
  }
  
  public void setTextOrientationType(int value)
    throws Exception
  {
    b().getTextAlignment().h(value);
  }
  
  public int getTextHorizontalAlignment()
    throws Exception
  {
    return b().m();
  }
  
  public void setTextHorizontalAlignment(int value)
    throws Exception
  {
    b().a(value);
  }
  
  public int getTextVerticalAlignment()
    throws Exception
  {
    return b().getTextAlignment().n();
  }
  
  public void setTextVerticalAlignment(int value)
    throws Exception
  {
    b().getTextAlignment().g(value);
  }
  
  void a(Comment paramComment, CopyOptions paramCopyOptions)
  {
    b().a(paramComment.b(), paramCopyOptions);
    this.c = paramComment.c;
    this.d = paramComment.d;
  }
  
  public boolean getAutoSize()
    throws Exception
  {
    return this.a.getTextBody().getTextAlignment().getAutoSize();
  }
  
  public void setAutoSize(boolean value)
    throws Exception
  {
    this.a.getTextBody().getTextAlignment().setAutoSize(value);
  }
  
  public double getHeightCM()
  {
    return getCommentShape().getHeightCM();
  }
  
  public void setHeightCM(double value)
  {
    getCommentShape().setHeightCM(value);
  }
  
  public double getWidthCM()
  {
    return getCommentShape().getWidthCM();
  }
  
  public void setWidthCM(double value)
  {
    getCommentShape().setWidthCM(value);
  }
  
  public int getWidth()
  {
    return getCommentShape().getWidth();
  }
  
  public void setWidth(int value)
  {
    getCommentShape().setWidth(value);
  }
  
  public int getHeight()
  {
    return getCommentShape().getHeight();
  }
  
  public void setHeight(int value)
  {
    getCommentShape().setHeight(value);
  }
  
  public double getWidthInch()
  {
    return getCommentShape().getWidthInch();
  }
  
  public void setWidthInch(double value)
  {
    getCommentShape().setWidthInch(value);
  }
  
  public double getHeightInch()
  {
    return getCommentShape().getHeightInch();
  }
  
  public void setHeightInch(double value)
  {
    getCommentShape().setHeightInch(value);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Comment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */