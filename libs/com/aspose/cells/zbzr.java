package com.aspose.cells;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

class zbzr
{
  public static void a(Document paramDocument)
  {
    paramDocument.getDocumentElement().normalize();
    Element localElement = paramDocument.getDocumentElement();
    NodeList localNodeList = localElement.getChildNodes();
    for (int i = localNodeList.getLength() - 1; i >= 0; i--)
    {
      Node localNode = localNodeList.item(i);
      if (localNode.getNodeName().equals("#text"))
      {
        String str = localNode.getNodeValue().trim();
        if (str.length() == 0) {
          localElement.removeChild(localNode);
        }
      }
      else
      {
        b(localNode);
      }
    }
  }
  
  private static void b(Node paramNode)
  {
    NodeList localNodeList = paramNode.getChildNodes();
    for (int i = localNodeList.getLength() - 1; i >= 0; i--)
    {
      Node localNode = localNodeList.item(i);
      if (localNode.getNodeName().equals("#text"))
      {
        String str = localNode.getNodeValue().trim();
        if (str.length() == 0) {
          paramNode.removeChild(localNode);
        }
      }
      else
      {
        b(localNode);
      }
    }
  }
  
  public static Node a(NodeList paramNodeList, String paramString)
  {
    for (int i = 0; i < paramNodeList.getLength(); i++) {
      if (paramNodeList.item(i).getNodeName().equals(paramString)) {
        return paramNodeList.item(i);
      }
    }
    return null;
  }
  
  public static String a(Node paramNode)
  {
    String str = "<" + paramNode.getNodeName() + ">";
    NodeList localNodeList = paramNode.getChildNodes();
    if (localNodeList.getLength() == 0)
    {
      if (paramNode.getNodeValue() != null) {
        str = str + paramNode.getNodeValue();
      }
    }
    else {
      for (int i = 0; i < localNodeList.getLength(); i++)
      {
        Node localNode = localNodeList.item(i);
        if (localNode.getNodeName().equals("#text"))
        {
          if (localNode.getNodeValue() != null) {
            str = str + localNode.getNodeValue();
          }
        }
        else {
          str = str + a(localNode);
        }
      }
    }
    str = str + "</" + paramNode.getNodeName() + ">";
    return str;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbzr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */