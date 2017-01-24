package com.learn.patterns.structural.trainings.composite;

/**
 * Created by dmitry on 24.01.17.
 */
public class File implements FileSystemItem {
  private int fileSize;
  @Override
  public void setSize(int size) {
    this.fileSize = size;
  }

  @Override
  public int getSize() {
    return fileSize;
  }
}
