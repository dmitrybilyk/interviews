package com.learn.patterns.structural.trainings.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmitry on 24.01.17.
 */
public class Directory implements FileSystemItem {
//  private int directorySize;
  @Override
  public void setSize(int size) {
//    this.directorySize = size;
  }

  @Override
  public int getSize() {
    int size = 0;
    for (FileSystemItem fileSystemItem : fileSystemItems) {
      size += fileSystemItem.getSize();
    }
    return size;
  }

  private List<FileSystemItem> fileSystemItems = new ArrayList<>();

  public void addItem(FileSystemItem fileSystemItem) {
    fileSystemItems.add(fileSystemItem);
  }

  public void removeItem(FileSystemItem fileSystemItem) {
    fileSystemItems.remove(fileSystemItem);
  }

  public int getTotalSize() {
    int size = 0;
    for (FileSystemItem fileSystemItem : fileSystemItems) {
      size += fileSystemItem.getSize();
    }
    return size;
  }
}
