package com.aspose.cells;

public class CommentShape
  extends Shape
{
  private Comment a;
  
  CommentShape(ShapeCollection shapes, Comment comment)
  {
    super(shapes, 25, shapes);
    this.a = comment;
    this.x = new FontSettingCollection(shapes.j(), this);
  }
  
  Comment a()
  {
    return this.a;
  }
  
  public Comment getComment()
  {
    return this.a;
  }
  
  void a(CommentShape paramCommentShape, CopyOptions paramCopyOptions)
  {
    super.a(paramCommentShape, paramCopyOptions);
    this.a.a(paramCommentShape.a, paramCopyOptions);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/CommentShape.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */