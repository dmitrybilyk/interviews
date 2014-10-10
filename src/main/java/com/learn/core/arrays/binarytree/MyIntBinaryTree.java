package com.learn.core.arrays.binarytree;

/**
 * Created by dik81 on 10/10/14.
 */
public class MyIntBinaryTree {

  static Integer tempValue = 0;
  public static void main(String[] args) {

    MyNode root = new MyNode(3, new MyNode(2, new MyNode(null), new MyNode(9)), new MyNode(3, new MyNode(4), new MyNode(1)));

    visitNode(root);
    System.out.println(tempValue);

  }

  static void visitNode(MyNode root){
    setMaxValue(root.getValue());

    proceed(root.getLeftChild());
    proceed(root.getRightChild());

  }

  static void proceed(MyNode node){
    if (node != null) {
      visitNode(node);
    }
  }

  static void setMaxValue(Integer value){
    if (value != null && value > tempValue) {
      tempValue = value;
    }
  }
}


class MyNode{
  Integer value;
  MyNode leftChild;
  MyNode rightChild;

  MyNode(Integer value, MyNode leftChild, MyNode rightChild) {
    this.value = value;
    this.leftChild = leftChild;
    this.rightChild = rightChild;
  }

  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public MyNode(Integer i) {
    this.value = i;
  }

  public MyNode getLeftChild() {
    return leftChild;
  }

  public MyNode getRightChild() {
    return rightChild;
  }

}
